package org.powernukkitx.protocol.types;

public enum ComposterUsed_Item_IdEnum {
  UNKNOWN;

  public static ComposterUsed_Item_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
