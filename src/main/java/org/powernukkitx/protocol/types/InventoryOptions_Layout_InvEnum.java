package org.powernukkitx.protocol.types;

public enum InventoryOptions_Layout_InvEnum {
  NONE,

  SURVIVAL,

  RECIPEBOOK,

  CREATIVE;

  public static InventoryOptions_Layout_InvEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
