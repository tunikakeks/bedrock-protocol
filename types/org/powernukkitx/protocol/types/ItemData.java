package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemData {
  private _2715320761 itemName;

  private Integer itemId;

  private Boolean isComponentBased;

  private ItemData_Item_VersionEnum itemVersion;

  private _4158325036 itemComponentData;

  public void encode(ByteBuf buf) {
    itemName.encode(buf);
    buf.writeInt(itemId);
    buf.writeBoolean(isComponentBased);
    buf.writeByte(itemVersion.toByte());
    itemComponentData.encode(buf);
  }

  public void decode(ByteBuf buf) {
    itemName = new _2715320761();
    itemName.decode(buf);
    itemId = buf.readInt();
    isComponentBased = buf.readBoolean();
    itemVersion = ItemVersionEnum.fromByte(buf.readUnsignedByte());
    itemComponentData = new _4158325036();
    itemComponentData.decode(buf);
  }
}
