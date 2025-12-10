package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Long;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__AttachToEntityInstruction {
  private Long entityActorID;

  public void encode(ByteBuf buf) {
    buf.writeLong(entityActorID);
  }

  public void decode(ByteBuf buf) {
    entityActorID = buf.readLong();
  }
}
