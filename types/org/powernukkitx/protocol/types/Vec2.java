package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vec2 {
  private Double x;

  private Double y;

  public void encode(ByteBuf buf) {
    buf.writeDouble(x);
    buf.writeDouble(y);
  }

  public void decode(ByteBuf buf) {
    x = buf.readDouble();
    y = buf.readDouble();
  }
}
