package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;

@Getter
@Setter
public class SetLocalPlayerAsInitializedPacket implements IPacket {
  private ActorRuntimeID playerID;

  public void encode(ByteBuf buf) {
    playerID.encode(buf);
  }

  public void decode(ByteBuf buf) {
    playerID = new ActorRuntimeID();
    playerID.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 113;
  }
}
