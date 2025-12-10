package org.powernukkitx.protocol.types;

public enum LevelSoundEventPacket_Actor_Unique_IdEnum {
  UNKNOWN;

  public static LevelSoundEventPacket_Actor_Unique_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
