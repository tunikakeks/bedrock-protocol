package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;

@Getter
@Setter
public class TakeItemActorPacket implements IPacket {
  private ActorRuntimeID itemRuntimeID;

  private ActorRuntimeID actorRuntimeID;

  public void encode(ByteBuf buf) {
    itemRuntimeID.encode(buf);
    actorRuntimeID.encode(buf);
  }

  public void decode(ByteBuf buf) {
    itemRuntimeID = new ActorRuntimeID();
    itemRuntimeID.decode(buf);
    actorRuntimeID = new ActorRuntimeID();
    actorRuntimeID.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 17;
  }
}
