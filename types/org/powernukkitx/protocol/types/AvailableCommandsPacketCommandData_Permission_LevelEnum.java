package org.powernukkitx.protocol.types;

public enum AvailableCommandsPacketCommandData_Permission_LevelEnum {
  ANY,

  GAMEDIRECTORS,

  ADMIN,

  HOST,

  OWNER,

  INTERNAL;

  public static AvailableCommandsPacketCommandData_Permission_LevelEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
