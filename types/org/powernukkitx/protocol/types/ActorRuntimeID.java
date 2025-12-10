package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Long;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActorRuntimeID {
  private Long actorRuntimeID;

  public void encode(ByteBuf buf) {
    buf.writeLong(actorRuntimeID);
  }

  public void decode(ByteBuf buf) {
    actorRuntimeID = buf.readLong();
  }
}
