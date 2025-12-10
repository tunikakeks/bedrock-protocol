package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetTimePacket implements IPacket {
  private Integer time;

  public void encode(ByteBuf buf) {
    buf.writeInt(time);
  }

  public void decode(ByteBuf buf) {
    time = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 10;
  }
}
