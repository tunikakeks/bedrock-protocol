package org.powernukkitx.protocol.types;

public enum ActorUniqueID_Actor_Unique_IDEnum {
  UNKNOWN;

  public static ActorUniqueID_Actor_Unique_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
