package org.powernukkitx.protocol.types;

public enum ArmorSlotAndDamagePair_Armor_SlotEnum {
  HEAD,

  TORSO,

  LEGS,

  FEET,

  BODY;

  public static ArmorSlotAndDamagePair_Armor_SlotEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
