package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.BlockPos;
import org.powernukkitx.protocol.types.ChunkPos;

@Getter
@Setter
public class NetworkChunkPublisherUpdatePacket implements IPacket {
  private BlockPos newPositionForView;

  private Integer newRadiusForView;

  private List<ChunkPos> serverBuiltChunksList;

  public void encode(ByteBuf buf) {
    newPositionForView.encode(buf);
    buf.writeInt(newRadiusForView);
    buf.writeInt(serverBuiltChunksList != null ? serverBuiltChunksList.size() : 0);
    if (serverBuiltChunksList != null) {
      for (var __v : serverBuiltChunksList) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    newPositionForView = new BlockPos();
    newPositionForView.decode(buf);
    newRadiusForView = buf.readInt();
    int __size_serverBuiltChunksList = buf.readInt();
    serverBuiltChunksList = new java.util.ArrayList<>(__size_serverBuiltChunksList);
    for (int i = 0; i < __size_serverBuiltChunksList; i++) {
      ChunkPos v = new ChunkPos();
      v.decode(buf);
      serverBuiltChunksList.add(v);
    }
  }

  @Override
  public int getPacketId() {
    return 121;
  }
}
