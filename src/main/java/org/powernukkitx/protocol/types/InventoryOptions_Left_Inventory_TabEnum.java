package org.powernukkitx.protocol.types;

public enum InventoryOptions_Left_Inventory_TabEnum {
  NONE,

  RECIPECONSTRUCTION,

  RECIPEEQUIPMENT,

  RECIPEITEMS,

  RECIPENATURE,

  RECIPESEARCH,

  SURVIVAL;

  public static InventoryOptions_Left_Inventory_TabEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
