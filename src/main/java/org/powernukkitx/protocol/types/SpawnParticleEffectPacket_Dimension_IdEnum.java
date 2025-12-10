package org.powernukkitx.protocol.types;

public enum SpawnParticleEffectPacket_Dimension_IdEnum {
  UNKNOWN;

  public static SpawnParticleEffectPacket_Dimension_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
