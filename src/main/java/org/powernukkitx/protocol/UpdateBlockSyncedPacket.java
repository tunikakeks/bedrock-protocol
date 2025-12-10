package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.BlockRuntimeIDEnum;
import org.powernukkitx.protocol.types.NetworkBlockPosition;
import org.powernukkitx.protocol.types.UniqueActorIdEnum;
import org.powernukkitx.protocol.types.UpdateBlockSyncedPacket_Block_Runtime_IDEnum;
import org.powernukkitx.protocol.types.UpdateBlockSyncedPacket_Unique_Actor_IdEnum;

@Getter
@Setter
public class UpdateBlockSyncedPacket implements IPacket {
  private NetworkBlockPosition blockPosition;

  private UpdateBlockSyncedPacket_Block_Runtime_IDEnum blockRuntimeID;

  private Integer flags;

  private Integer layer;

  private UpdateBlockSyncedPacket_Unique_Actor_IdEnum uniqueActorId;

  private Long actorSyncMessage;

  public void encode(ByteBuf buf) {
    blockPosition.encode(buf);
    buf.writeInt(blockRuntimeID.ordinal());
    buf.writeInt(flags);
    buf.writeInt(layer);
    buf.writeInt(uniqueActorId.ordinal());
    buf.writeLong(actorSyncMessage);
  }

  public void decode(ByteBuf buf) {
    blockPosition = new NetworkBlockPosition();
    blockPosition.decode(buf);
    blockRuntimeID = BlockRuntimeIDEnum.values()[buf.readInt()];
    flags = buf.readInt();
    layer = buf.readInt();
    uniqueActorId = UniqueActorIdEnum.values()[buf.readInt()];
    actorSyncMessage = buf.readLong();
  }

  @Override
  public int getPacketId() {
    return 110;
  }
}
