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
public class PlayerStartItemCooldownPacket implements IPacket {
  private String itemCategory;

  private Integer durationTicks;

  public void encode(ByteBuf buf) {
    int __len_itemCategory = itemCategory != null ? itemCategory.length() : 0;
    if (itemCategory != null) buf.writeCharSequence(itemCategory, StandardCharsets.UTF_8);
    buf.writeInt(durationTicks);
  }

  public void decode(ByteBuf buf) {
    int __len_itemCategory = buf.readInt();
    itemCategory = buf.readCharSequence(__len_itemCategory, java.nio.charset.StandardCharsets.UTF_8).toString();
    durationTicks = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 176;
  }
}
