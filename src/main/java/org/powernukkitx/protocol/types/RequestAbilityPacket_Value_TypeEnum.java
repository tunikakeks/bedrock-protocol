package org.powernukkitx.protocol.types;

public enum RequestAbilityPacket_Value_TypeEnum {
  UNSET,

  BOOL,

  FLOAT;

  public static RequestAbilityPacket_Value_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
