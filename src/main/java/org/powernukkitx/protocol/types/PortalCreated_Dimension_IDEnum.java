package org.powernukkitx.protocol.types;

public enum PortalCreated_Dimension_IDEnum {
  UNKNOWN;

  public static PortalCreated_Dimension_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
