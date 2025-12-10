package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Object;
import java.lang.Override;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientboundDataStorePacket implements IPacket {
  private List<Object> updates;

  public void encode(ByteBuf buf) {
    buf.writeInt(updates != null ? updates.size() : 0);
    if (updates != null) {
      for (var __v : updates) {
        // TODO: encode array element (unknown type)
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __size_updates = buf.readInt();
    updates = new java.util.ArrayList<>(__size_updates);
    for (int i = 0; i < __size_updates; i++) {
      // TODO: decode array element (unknown type)
    }
  }

  @Override
  public int getPacketId() {
    return 330;
  }
}
