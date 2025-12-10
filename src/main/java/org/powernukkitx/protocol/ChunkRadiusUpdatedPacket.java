package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChunkRadiusUpdatedPacket implements IPacket {
  private Integer chunkRadius;

  public void encode(ByteBuf buf) {
    buf.writeInt(chunkRadius);
  }

  public void decode(ByteBuf buf) {
    chunkRadius = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 70;
  }
}
