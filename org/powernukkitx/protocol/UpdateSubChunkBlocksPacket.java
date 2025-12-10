package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.NetworkBlockPosition;
import org.powernukkitx.protocol.types.UpdateSubChunkBlocksChangedInfo;

@Getter
@Setter
public class UpdateSubChunkBlocksPacket implements IPacket {
  private NetworkBlockPosition subChunkBlockPosition;

  private UpdateSubChunkBlocksChangedInfo blocksChanged;

  public void encode(ByteBuf buf) {
    subChunkBlockPosition.encode(buf);
    blocksChanged.encode(buf);
  }

  public void decode(ByteBuf buf) {
    subChunkBlockPosition = new NetworkBlockPosition();
    subChunkBlockPosition.decode(buf);
    blocksChanged = new UpdateSubChunkBlocksChangedInfo();
    blocksChanged.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 172;
  }
}
