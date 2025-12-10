package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__SplineInstruction__SplineRotationOption {
  private Vec3 keyFrameValues;

  private Double keyFrameTimes;

  public void encode(ByteBuf buf) {
    keyFrameValues.encode(buf);
    buf.writeDouble(keyFrameTimes);
  }

  public void decode(ByteBuf buf) {
    keyFrameValues = new Vec3();
    keyFrameValues.decode(buf);
    keyFrameTimes = buf.readDouble();
  }
}
