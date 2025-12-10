package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.NetworkBlockPosition;

@Getter
@Setter
public class UpdateBlockSyncedPacket implements IPacket {
  private NetworkBlockPosition blockPosition;

  private Integer blockRuntimeID;

  private Integer flags;

  private Integer layer;

  private Long uniqueActorId;

  private Long actorSyncMessage;

  public void encode(ByteBuf buf) {
    blockPosition.encode(buf);
    buf.writeInt(blockRuntimeID);
    buf.writeInt(flags);
    buf.writeInt(layer);
    buf.writeLong(uniqueActorId);
    buf.writeLong(actorSyncMessage);
  }

  public void decode(ByteBuf buf) {
    blockPosition = new NetworkBlockPosition();
    blockPosition.decode(buf);
    blockRuntimeID = buf.readInt();
    flags = buf.readInt();
    layer = buf.readInt();
    uniqueActorId = buf.readLong();
    actorSyncMessage = buf.readLong();
  }

  @Override
  public int getPacketId() {
    return 110;
  }
}
