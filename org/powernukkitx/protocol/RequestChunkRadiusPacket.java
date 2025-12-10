package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestChunkRadiusPacket implements IPacket {
  private Integer chunkRadius;

  private Integer maxChunkRadius;

  public void encode(ByteBuf buf) {
    buf.writeInt(chunkRadius);
    buf.writeInt(maxChunkRadius);
  }

  public void decode(ByteBuf buf) {
    chunkRadius = buf.readInt();
    maxChunkRadius = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 69;
  }
}
