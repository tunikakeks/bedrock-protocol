package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vec3 {
  private Double x;

  private Double y;

  private Double z;

  public void encode(ByteBuf buf) {
    buf.writeDouble(x);
    buf.writeDouble(y);
    buf.writeDouble(z);
  }

  public void decode(ByteBuf buf) {
    x = buf.readDouble();
    y = buf.readDouble();
    z = buf.readDouble();
  }
}
