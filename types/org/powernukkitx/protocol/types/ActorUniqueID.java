package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Long;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActorUniqueID {
  private Long actorUniqueID;

  public void encode(ByteBuf buf) {
    buf.writeLong(actorUniqueID);
  }

  public void decode(ByteBuf buf) {
    actorUniqueID = buf.readLong();
  }
}
