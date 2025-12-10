package org.powernukkitx.protocol.types;

public enum CommandOriginData_PlayerIdEnum {
  UNKNOWN;

  public static CommandOriginData_PlayerIdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
