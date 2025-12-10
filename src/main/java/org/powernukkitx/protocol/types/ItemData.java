package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemData {
  private _2715320761 itemName;

  private ItemData_Item_IdEnum itemId;

  private Boolean isComponentBased;

  private ItemData_Item_VersionEnum itemVersion;

  private _4158325036 itemComponentData;

  public void encode(ByteBuf buf) {
    itemName.encode(buf);
    buf.writeInt(itemId.ordinal());
    buf.writeBoolean(isComponentBased);
    buf.writeInt(itemVersion.ordinal());
    itemComponentData.encode(buf);
  }

  public void decode(ByteBuf buf) {
    itemName = new _2715320761();
    itemName.decode(buf);
    itemId = ItemIdEnum.values()[buf.readInt()];
    isComponentBased = buf.readBoolean();
    itemVersion = ItemVersionEnum.values()[buf.readInt()];
    itemComponentData = new _4158325036();
    itemComponentData.decode(buf);
  }
}
