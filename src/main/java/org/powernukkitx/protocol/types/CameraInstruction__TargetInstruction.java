package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__TargetInstruction {
  private Vec3 targetCenterOffset;

  private CameraInstruction__TargetInstruction_Target_Actor_IDEnum targetActorID;

  public void encode(ByteBuf buf) {
    targetCenterOffset.encode(buf);
    buf.writeInt(targetActorID.ordinal());
  }

  public void decode(ByteBuf buf) {
    targetCenterOffset = new Vec3();
    targetCenterOffset.decode(buf);
    targetActorID = TargetActorIDEnum.values()[buf.readInt()];
  }
}
