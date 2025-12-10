package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Long;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateSubChunkNetworkBlockInfo {
  private NetworkBlockPosition pos;

  private Integer runtimeId;

  private Integer updateFlags;

  private Long syncMessageEntityUniqueID;

  private Integer syncMessageMessage;

  public void encode(ByteBuf buf) {
    pos.encode(buf);
    buf.writeInt(runtimeId);
    buf.writeInt(updateFlags);
    buf.writeLong(syncMessageEntityUniqueID);
    buf.writeInt(syncMessageMessage);
  }

  public void decode(ByteBuf buf) {
    pos = new NetworkBlockPosition();
    pos.decode(buf);
    runtimeId = buf.readInt();
    updateFlags = buf.readInt();
    syncMessageEntityUniqueID = buf.readLong();
    syncMessageMessage = buf.readInt();
  }
}
