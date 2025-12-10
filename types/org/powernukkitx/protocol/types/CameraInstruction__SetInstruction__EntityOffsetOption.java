package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__SetInstruction__EntityOffsetOption {
  private Double entityOffsetX;

  private Double entityOffsetY;

  private Double entityOffsetZ;

  public void encode(ByteBuf buf) {
    buf.writeDouble(entityOffsetX);
    buf.writeDouble(entityOffsetY);
    buf.writeDouble(entityOffsetZ);
  }

  public void decode(ByteBuf buf) {
    entityOffsetX = buf.readDouble();
    entityOffsetY = buf.readDouble();
    entityOffsetZ = buf.readDouble();
  }
}
