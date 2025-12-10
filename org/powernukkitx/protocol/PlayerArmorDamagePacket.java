package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ArmorSlotAndDamagePair;

@Getter
@Setter
public class PlayerArmorDamagePacket implements IPacket {
  private List<ArmorSlotAndDamagePair> armorSlotAndDamagePairs;

  public void encode(ByteBuf buf) {
    buf.writeInt(armorSlotAndDamagePairs != null ? armorSlotAndDamagePairs.size() : 0);
    if (armorSlotAndDamagePairs != null) {
      for (var __v : armorSlotAndDamagePairs) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __size_armorSlotAndDamagePairs = buf.readInt();
    armorSlotAndDamagePairs = new java.util.ArrayList<>(__size_armorSlotAndDamagePairs);
    for (int i = 0; i < __size_armorSlotAndDamagePairs; i++) {
      ArmorSlotAndDamagePair v = new ArmorSlotAndDamagePair();
      v.decode(buf);
      armorSlotAndDamagePairs.add(v);
    }
  }

  @Override
  public int getPacketId() {
    return 149;
  }
}
