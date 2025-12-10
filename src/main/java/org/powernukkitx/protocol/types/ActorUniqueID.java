package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActorUniqueID {
  private ActorUniqueID_Actor_Unique_IDEnum actorUniqueID;

  public void encode(ByteBuf buf) {
    buf.writeInt(actorUniqueID.ordinal());
  }

  public void decode(ByteBuf buf) {
    actorUniqueID = ActorUniqueIDEnum.values()[buf.readInt()];
  }
}
