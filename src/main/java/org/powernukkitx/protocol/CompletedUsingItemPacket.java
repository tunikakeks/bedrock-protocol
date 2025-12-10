package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.CompletedUsingItemPacket_Item_IdEnum;
import org.powernukkitx.protocol.types.ItemIdEnum;

@Getter
@Setter
public class CompletedUsingItemPacket implements IPacket {
  private CompletedUsingItemPacket_Item_IdEnum itemId;

  private Integer itemUseMethod;

  public void encode(ByteBuf buf) {
    buf.writeInt(itemId.ordinal());
    buf.writeInt(itemUseMethod);
  }

  public void decode(ByteBuf buf) {
    itemId = ItemIdEnum.values()[buf.readInt()];
    itemUseMethod = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 142;
  }
}
