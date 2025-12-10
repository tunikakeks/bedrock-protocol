package org.powernukkitx.protocol.types;

public enum MobEffectPacket_Effect_IDEnum {
  UNKNOWN;

  public static MobEffectPacket_Effect_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
