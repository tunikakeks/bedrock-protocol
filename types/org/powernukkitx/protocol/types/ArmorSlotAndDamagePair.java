package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArmorSlotAndDamagePair {
  private ArmorSlotAndDamagePair_Armor_SlotEnum armorSlot;

  private Integer damage;

  public void encode(ByteBuf buf) {
    buf.writeByte(armorSlot.toByte());
    buf.writeInt(damage);
  }

  public void decode(ByteBuf buf) {
    armorSlot = ArmorSlotEnum.fromByte(buf.readUnsignedByte());
    damage = buf.readInt();
  }
}
