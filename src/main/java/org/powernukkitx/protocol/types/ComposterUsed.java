package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComposterUsed {
  private ComposterUsed_Block_Interaction_TypeEnum blockInteractionType;

  private ComposterUsed_Item_IdEnum itemId;

  public void encode(ByteBuf buf) {
    buf.writeInt(blockInteractionType.ordinal());
    buf.writeInt(itemId.ordinal());
  }

  public void decode(ByteBuf buf) {
    blockInteractionType = BlockInteractionTypeEnum.values()[buf.readInt()];
    itemId = ItemIdEnum.values()[buf.readInt()];
  }
}
