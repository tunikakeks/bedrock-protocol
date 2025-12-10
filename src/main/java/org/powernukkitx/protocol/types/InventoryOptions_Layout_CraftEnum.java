package org.powernukkitx.protocol.types;

public enum InventoryOptions_Layout_CraftEnum {
  NONE,

  SURVIVAL,

  RECIPEBOOK,

  CREATIVE;

  public static InventoryOptions_Layout_CraftEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
