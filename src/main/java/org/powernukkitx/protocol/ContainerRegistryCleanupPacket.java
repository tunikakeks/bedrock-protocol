package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.FullContainerName;

@Getter
@Setter
public class ContainerRegistryCleanupPacket implements IPacket {
  private List<FullContainerName> removedContainers;

  public void encode(ByteBuf buf) {
    buf.writeInt(removedContainers != null ? removedContainers.size() : 0);
    if (removedContainers != null) {
      for (var __v : removedContainers) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __size_removedContainers = buf.readInt();
    removedContainers = new java.util.ArrayList<>(__size_removedContainers);
    for (int i = 0; i < __size_removedContainers; i++) {
      FullContainerName v = new FullContainerName();
      v.decode(buf);
      removedContainers.add(v);
    }
  }

  @Override
  public int getPacketId() {
    return 317;
  }
}
