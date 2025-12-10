package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.LoadingScreenPacketTypeEnum;
import org.powernukkitx.protocol.types.ServerboundLoadingScreenPacket_Loading_Screen_Packet_TypeEnum;

@Getter
@Setter
public class ServerboundLoadingScreenPacket implements IPacket {
  private ServerboundLoadingScreenPacket_Loading_Screen_Packet_TypeEnum loadingScreenPacketType;

  private Integer loadingScreenId;

  public void encode(ByteBuf buf) {
    buf.writeByte(loadingScreenPacketType.toByte());
    buf.writeInt(loadingScreenId);
  }

  public void decode(ByteBuf buf) {
    loadingScreenPacketType = LoadingScreenPacketTypeEnum.fromByte(buf.readUnsignedByte());
    loadingScreenId = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 312;
  }
}
