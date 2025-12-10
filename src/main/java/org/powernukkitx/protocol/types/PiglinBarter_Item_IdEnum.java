package org.powernukkitx.protocol.types;

public enum PiglinBarter_Item_IdEnum {
  UNKNOWN;

  public static PiglinBarter_Item_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
