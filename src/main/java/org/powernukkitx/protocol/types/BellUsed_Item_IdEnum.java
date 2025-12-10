package org.powernukkitx.protocol.types;

public enum BellUsed_Item_IdEnum {
  UNKNOWN;

  public static BellUsed_Item_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
