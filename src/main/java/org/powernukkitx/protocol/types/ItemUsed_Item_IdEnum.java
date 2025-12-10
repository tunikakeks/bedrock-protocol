package org.powernukkitx.protocol.types;

public enum ItemUsed_Item_IdEnum {
  UNKNOWN;

  public static ItemUsed_Item_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
