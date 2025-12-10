package org.powernukkitx.protocol.types;

public enum Struct_ShapeDataPayload_NetworkIdEnum {
  UNKNOWN;

  public static Struct_ShapeDataPayload_NetworkIdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
