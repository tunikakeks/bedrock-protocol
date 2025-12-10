package org.powernukkitx.protocol.types;

public enum ChangeDimensionPacket_Loading_Screen_IdEnum {
  UNKNOWN;

  public static ChangeDimensionPacket_Loading_Screen_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
