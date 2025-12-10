package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BellUsed {
  private BellUsed_Item_IdEnum itemId;

  public void encode(ByteBuf buf) {
    buf.writeInt(itemId.ordinal());
  }

  public void decode(ByteBuf buf) {
    itemId = ItemIdEnum.values()[buf.readInt()];
  }
}
