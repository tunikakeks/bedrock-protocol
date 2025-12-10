package org.powernukkitx.protocol.types;

public enum POICauldronUsed_Item_IdEnum {
  UNKNOWN;

  public static POICauldronUsed_Item_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
