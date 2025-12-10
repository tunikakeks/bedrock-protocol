package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__FadeInstruction__ColorOption {
  private Double red;

  private Double green;

  private Double blue;

  public void encode(ByteBuf buf) {
    buf.writeDouble(red);
    buf.writeDouble(green);
    buf.writeDouble(blue);
  }

  public void decode(ByteBuf buf) {
    red = buf.readDouble();
    green = buf.readDouble();
    blue = buf.readDouble();
  }
}
