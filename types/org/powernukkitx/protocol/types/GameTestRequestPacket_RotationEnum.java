package org.powernukkitx.protocol.types;

public enum GameTestRequestPacket_RotationEnum {
  NONE,

  ROTATE90,

  ROTATE180,

  ROTATE270,

  CLOCKWISE90,

  CLOCKWISE180,

  COUNTERCLOCKWISE90;

  public static GameTestRequestPacket_RotationEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
