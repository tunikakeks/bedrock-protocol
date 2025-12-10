package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorUniqueID;

@Getter
@Setter
public class RemoveActorPacket implements IPacket {
  private ActorUniqueID targetActorID;

  public void encode(ByteBuf buf) {
    targetActorID.encode(buf);
  }

  public void decode(ByteBuf buf) {
    targetActorID = new ActorUniqueID();
    targetActorID.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 14;
  }
}
