package org.powernukkitx.protocol.types;

public enum FullContainerName_Dynamic_IDEnum {
  UNKNOWN;

  public static FullContainerName_Dynamic_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
