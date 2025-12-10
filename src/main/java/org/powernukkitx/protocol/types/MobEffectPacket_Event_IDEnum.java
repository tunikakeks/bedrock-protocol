package org.powernukkitx.protocol.types;

public enum MobEffectPacket_Event_IDEnum {
  INVALID,

  ADD,

  UPDATE,

  REMOVE;

  public static MobEffectPacket_Event_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
