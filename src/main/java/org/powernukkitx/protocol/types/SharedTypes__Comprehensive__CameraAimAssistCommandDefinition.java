package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SharedTypes__Comprehensive__CameraAimAssistCommandDefinition {
  private Struct_SharedTypes__Reference_5_ presetId;

  private SharedTypes__Comprehensive__CameraAimAssistCommandDefinition_Target_ModeEnum targetMode;

  private Vec2 viewAngle;

  private Double distance;

  public void encode(ByteBuf buf) {
    presetId.encode(buf);
    buf.writeInt(targetMode.ordinal());
    viewAngle.encode(buf);
    buf.writeDouble(distance);
  }

  public void decode(ByteBuf buf) {
    presetId = new Struct_SharedTypes__Reference_5_();
    presetId.decode(buf);
    targetMode = TargetModeEnum.values()[buf.readInt()];
    viewAngle = new Vec2();
    viewAngle.decode(buf);
    distance = buf.readDouble();
  }
}
