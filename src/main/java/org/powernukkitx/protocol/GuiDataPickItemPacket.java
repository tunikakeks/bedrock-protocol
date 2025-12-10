package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuiDataPickItemPacket implements IPacket {
  private String itemName;

  private String itemEffectName;

  private Integer slot;

  public void encode(ByteBuf buf) {
    int __len_itemName = itemName != null ? itemName.length() : 0;
    if (itemName != null) buf.writeCharSequence(itemName, StandardCharsets.UTF_8);
    int __len_itemEffectName = itemEffectName != null ? itemEffectName.length() : 0;
    if (itemEffectName != null) buf.writeCharSequence(itemEffectName, StandardCharsets.UTF_8);
    buf.writeInt(slot);
  }

  public void decode(ByteBuf buf) {
    int __len_itemName = buf.readInt();
    itemName = buf.readCharSequence(__len_itemName, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_itemEffectName = buf.readInt();
    itemEffectName = buf.readCharSequence(__len_itemEffectName, java.nio.charset.StandardCharsets.UTF_8).toString();
    slot = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 54;
  }
}
