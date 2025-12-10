package org.powernukkitx.protocol.types;

public enum AnimatePacket_Swing_SourceEnum {
  NONE,

  BUILD,

  MINE,

  INTERACT,

  ATTACK,

  USEITEM,

  THROWITEM,

  DROPITEM,

  EVENT;

  public static AnimatePacket_Swing_SourceEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
