package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Double;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__FovInstruction {
  private Double fieldOfView;

  private Double fovEaseTime;

  private CameraInstruction__FovInstruction_FOV_Ease_TypeEnum fovEaseType;

  private Boolean fieldOfViewClear;

  public void encode(ByteBuf buf) {
    buf.writeDouble(fieldOfView);
    buf.writeDouble(fovEaseTime);
    buf.writeInt(fovEaseType.ordinal());
    buf.writeBoolean(fieldOfViewClear);
  }

  public void decode(ByteBuf buf) {
    fieldOfView = buf.readDouble();
    fovEaseTime = buf.readDouble();
    fovEaseType = FovEaseTypeEnum.values()[buf.readInt()];
    fieldOfViewClear = buf.readBoolean();
  }
}
