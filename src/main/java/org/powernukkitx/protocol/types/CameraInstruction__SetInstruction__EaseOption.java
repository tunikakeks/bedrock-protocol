package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__SetInstruction__EaseOption {
  private Integer type;

  private Double time;

  public void encode(ByteBuf buf) {
    buf.writeInt(type);
    buf.writeDouble(time);
  }

  public void decode(ByteBuf buf) {
    type = buf.readInt();
    time = buf.readDouble();
  }
}
