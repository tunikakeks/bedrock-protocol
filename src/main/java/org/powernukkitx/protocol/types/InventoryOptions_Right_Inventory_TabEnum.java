package org.powernukkitx.protocol.types;

public enum InventoryOptions_Right_Inventory_TabEnum {
  NONE,

  FULLSCREEN,

  CRAFTING,

  ARMOR;

  public static InventoryOptions_Right_Inventory_TabEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
