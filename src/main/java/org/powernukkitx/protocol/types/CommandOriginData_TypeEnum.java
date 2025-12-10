package org.powernukkitx.protocol.types;

public enum CommandOriginData_TypeEnum {
  PLAYER,

  DEVCONSOLE,

  TEST,

  AUTOMATIONPLAYER;

  public static CommandOriginData_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
