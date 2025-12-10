package org.powernukkitx.protocol.types;

public enum LevelEventPacket_Event_IdEnum {
  UNKNOWN;

  public static LevelEventPacket_Event_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
