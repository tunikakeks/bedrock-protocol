package org.powernukkitx.protocol.types;

public enum ItemData_Item_VersionEnum {
  LEGACY,

  DATADRIVEN,

  NONE;

  public static ItemData_Item_VersionEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
