package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__FadeInstruction__TimeOption {
  private Double fadeInTime;

  private Double holdTime;

  private Double fadeOutTime;

  public void encode(ByteBuf buf) {
    buf.writeDouble(fadeInTime);
    buf.writeDouble(holdTime);
    buf.writeDouble(fadeOutTime);
  }

  public void decode(ByteBuf buf) {
    fadeInTime = buf.readDouble();
    holdTime = buf.readDouble();
    fadeOutTime = buf.readDouble();
  }
}
