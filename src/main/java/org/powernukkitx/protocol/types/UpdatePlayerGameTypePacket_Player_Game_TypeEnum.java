package org.powernukkitx.protocol.types;

public enum UpdatePlayerGameTypePacket_Player_Game_TypeEnum {
  UNDEFINED,

  SURVIVAL,

  CREATIVE,

  ADVENTURE,

  DEFAULT,

  SPECTATOR,

  WORLDDEFAULT;

  public static UpdatePlayerGameTypePacket_Player_Game_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
