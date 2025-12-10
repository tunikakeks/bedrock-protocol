package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ItemData;

@Getter
@Setter
public class ItemRegistryPacket implements IPacket {
  private List<ItemData> itemData;

  public void encode(ByteBuf buf) {
    buf.writeInt(itemData != null ? itemData.size() : 0);
    if (itemData != null) {
      for (var __v : itemData) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __size_itemData = buf.readInt();
    itemData = new java.util.ArrayList<>(__size_itemData);
    for (int i = 0; i < __size_itemData; i++) {
      ItemData v = new ItemData();
      v.decode(buf);
      itemData.add(v);
    }
  }

  @Override
  public int getPacketId() {
    return 162;
  }
}
