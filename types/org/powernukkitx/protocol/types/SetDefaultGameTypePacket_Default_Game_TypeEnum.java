package org.powernukkitx.protocol.types;

public enum SetDefaultGameTypePacket_Default_Game_TypeEnum {
  SURVIVAL,

  CREATIVE,

  ADVENTURE,

  DEFAULT,

  SPECTATOR,

  WORLDDEFAULT;

  public static SetDefaultGameTypePacket_Default_Game_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
