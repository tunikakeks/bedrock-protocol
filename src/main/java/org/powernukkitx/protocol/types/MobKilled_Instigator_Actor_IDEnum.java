package org.powernukkitx.protocol.types;

public enum MobKilled_Instigator_Actor_IDEnum {
  UNKNOWN;

  public static MobKilled_Instigator_Actor_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
