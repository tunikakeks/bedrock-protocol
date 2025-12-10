package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.SimpleEventPacket_TypeEnum;
import org.powernukkitx.protocol.types.TypeEnum;

@Getter
@Setter
public class SimpleEventPacket implements IPacket {
  private SimpleEventPacket_TypeEnum type;

  public void encode(ByteBuf buf) {
    buf.writeByte(type.toByte());
  }

  public void decode(ByteBuf buf) {
    type = TypeEnum.fromByte(buf.readUnsignedByte());
  }

  @Override
  public int getPacketId() {
    return 64;
  }
}
