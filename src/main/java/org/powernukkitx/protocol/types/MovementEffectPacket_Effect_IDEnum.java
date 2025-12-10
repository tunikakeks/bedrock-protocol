package org.powernukkitx.protocol.types;

public enum MovementEffectPacket_Effect_IDEnum {
  GLIDE_BOOST,

  DOLPHIN_BOOST;

  public static MovementEffectPacket_Effect_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
