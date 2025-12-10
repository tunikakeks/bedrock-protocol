package org.powernukkitx.protocol.types;

public enum EntityNetId_Raw_IdEnum {
  UNKNOWN;

  public static EntityNetId_Raw_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
