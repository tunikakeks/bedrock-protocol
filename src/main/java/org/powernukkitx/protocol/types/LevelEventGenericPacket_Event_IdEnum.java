package org.powernukkitx.protocol.types;

public enum LevelEventGenericPacket_Event_IdEnum {
  UNKNOWN;

  public static LevelEventGenericPacket_Event_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
