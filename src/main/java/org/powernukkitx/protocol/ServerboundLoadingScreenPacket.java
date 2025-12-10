package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.LoadingScreenIdEnum;
import org.powernukkitx.protocol.types.LoadingScreenPacketTypeEnum;
import org.powernukkitx.protocol.types.ServerboundLoadingScreenPacket_Loading_Screen_IdEnum;
import org.powernukkitx.protocol.types.ServerboundLoadingScreenPacket_Loading_Screen_Packet_TypeEnum;

@Getter
@Setter
public class ServerboundLoadingScreenPacket implements IPacket {
  private ServerboundLoadingScreenPacket_Loading_Screen_Packet_TypeEnum loadingScreenPacketType;

  private ServerboundLoadingScreenPacket_Loading_Screen_IdEnum loadingScreenId;

  public void encode(ByteBuf buf) {
    buf.writeInt(loadingScreenPacketType.ordinal());
    buf.writeInt(loadingScreenId.ordinal());
  }

  public void decode(ByteBuf buf) {
    loadingScreenPacketType = LoadingScreenPacketTypeEnum.values()[buf.readInt()];
    loadingScreenId = LoadingScreenIdEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 312;
  }
}
