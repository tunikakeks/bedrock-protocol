package org.powernukkitx.protocol.types;

public enum ItemData_Item_IdEnum {
  UNKNOWN;

  public static ItemData_Item_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
