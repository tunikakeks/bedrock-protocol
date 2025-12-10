package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateSubChunkNetworkBlockInfo {
  private NetworkBlockPosition pos;

  private UpdateSubChunkNetworkBlockInfo_Runtime_IdEnum runtimeId;

  private Integer updateFlags;

  private UpdateSubChunkNetworkBlockInfo_Sync_Message___Entity_Unique_IDEnum syncMessageEntityUniqueID;

  private Integer syncMessageMessage;

  public void encode(ByteBuf buf) {
    pos.encode(buf);
    buf.writeInt(runtimeId.ordinal());
    buf.writeInt(updateFlags);
    buf.writeInt(syncMessageEntityUniqueID.ordinal());
    buf.writeInt(syncMessageMessage);
  }

  public void decode(ByteBuf buf) {
    pos = new NetworkBlockPosition();
    pos.decode(buf);
    runtimeId = RuntimeIdEnum.values()[buf.readInt()];
    updateFlags = buf.readInt();
    syncMessageEntityUniqueID = SyncMessageEntityUniqueIDEnum.values()[buf.readInt()];
    syncMessageMessage = buf.readInt();
  }
}
