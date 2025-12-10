package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemUsed {
  private ItemUsed_Item_IdEnum itemId;

  private Integer itemAux;

  private Integer useMethod;

  private Integer count;

  public void encode(ByteBuf buf) {
    buf.writeInt(itemId.ordinal());
    buf.writeInt(itemAux);
    buf.writeInt(useMethod);
    buf.writeInt(count);
  }

  public void decode(ByteBuf buf) {
    itemId = ItemIdEnum.values()[buf.readInt()];
    itemAux = buf.readInt();
    useMethod = buf.readInt();
    count = buf.readInt();
  }
}
