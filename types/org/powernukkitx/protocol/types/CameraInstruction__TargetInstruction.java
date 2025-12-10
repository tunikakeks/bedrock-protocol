package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Long;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__TargetInstruction {
  private Vec3 targetCenterOffset;

  private Long targetActorID;

  public void encode(ByteBuf buf) {
    targetCenterOffset.encode(buf);
    buf.writeLong(targetActorID);
  }

  public void decode(ByteBuf buf) {
    targetCenterOffset = new Vec3();
    targetCenterOffset.decode(buf);
    targetActorID = buf.readLong();
  }
}
