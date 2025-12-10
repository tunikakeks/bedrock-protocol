package org.powernukkitx.protocol.types;

public enum ActorRuntimeID_Actor_Runtime_IDEnum {
  UNKNOWN;

  public static ActorRuntimeID_Actor_Runtime_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
