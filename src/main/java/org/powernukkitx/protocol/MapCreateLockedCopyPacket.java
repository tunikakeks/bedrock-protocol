package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorUniqueID;

@Getter
@Setter
public class MapCreateLockedCopyPacket implements IPacket {
  private ActorUniqueID originalMapId;

  private ActorUniqueID newMapId;

  public void encode(ByteBuf buf) {
    originalMapId.encode(buf);
    newMapId.encode(buf);
  }

  public void decode(ByteBuf buf) {
    originalMapId = new ActorUniqueID();
    originalMapId.decode(buf);
    newMapId = new ActorUniqueID();
    newMapId.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 131;
  }
}
