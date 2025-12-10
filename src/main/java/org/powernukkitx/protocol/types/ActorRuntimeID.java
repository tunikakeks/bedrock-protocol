package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActorRuntimeID {
  private ActorRuntimeID_Actor_Runtime_IDEnum actorRuntimeID;

  public void encode(ByteBuf buf) {
    buf.writeInt(actorRuntimeID.ordinal());
  }

  public void decode(ByteBuf buf) {
    actorRuntimeID = ActorRuntimeIDEnum.values()[buf.readInt()];
  }
}
