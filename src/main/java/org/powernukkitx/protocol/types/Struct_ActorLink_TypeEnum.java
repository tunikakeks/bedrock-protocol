package org.powernukkitx.protocol.types;

public enum Struct_ActorLink_TypeEnum {
  NONE,

  RIDING,

  PASSENGER;

  public static Struct_ActorLink_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
