package org.powernukkitx.protocol.types;

public enum PortalUsed_Source_Dimension_IDEnum {
  UNKNOWN;

  public static PortalUsed_Source_Dimension_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
