package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.GraphicsModeChangeEnum;
import org.powernukkitx.protocol.types.UpdateClientOptionsPacket_Graphics_Mode_ChangeEnum;

@Getter
@Setter
public class UpdateClientOptionsPacket implements IPacket {
  private UpdateClientOptionsPacket_Graphics_Mode_ChangeEnum graphicsModeChange;

  public void encode(ByteBuf buf) {
    buf.writeByte(graphicsModeChange.toByte());
  }

  public void decode(ByteBuf buf) {
    graphicsModeChange = GraphicsModeChangeEnum.fromByte(buf.readUnsignedByte());
  }

  @Override
  public int getPacketId() {
    return 323;
  }
}
