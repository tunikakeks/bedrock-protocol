package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__AttachToEntityInstruction {
  private CameraInstruction__AttachToEntityInstruction_Entity_Actor_IDEnum entityActorID;

  public void encode(ByteBuf buf) {
    buf.writeInt(entityActorID.ordinal());
  }

  public void decode(ByteBuf buf) {
    entityActorID = EntityActorIDEnum.values()[buf.readInt()];
  }
}
