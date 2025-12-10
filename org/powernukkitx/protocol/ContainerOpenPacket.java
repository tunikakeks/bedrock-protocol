package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorUniqueID;
import org.powernukkitx.protocol.types.NetworkBlockPosition;

@Getter
@Setter
public class ContainerOpenPacket implements IPacket {
  private Integer containerId;

  private Integer containerType;

  private NetworkBlockPosition position;

  private ActorUniqueID targetActorID;

  public void encode(ByteBuf buf) {
    buf.writeInt(containerId);
    buf.writeInt(containerType);
    position.encode(buf);
    targetActorID.encode(buf);
  }

  public void decode(ByteBuf buf) {
    containerId = buf.readInt();
    containerType = buf.readInt();
    position = new NetworkBlockPosition();
    position.decode(buf);
    targetActorID = new ActorUniqueID();
    targetActorID.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 46;
  }
}
