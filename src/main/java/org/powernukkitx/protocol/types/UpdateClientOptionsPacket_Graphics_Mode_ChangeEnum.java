package org.powernukkitx.protocol.types;

public enum UpdateClientOptionsPacket_Graphics_Mode_ChangeEnum {
  SIMPLE,

  FANCY,

  ADVANCED,

  RAYTRACED;

  public static UpdateClientOptionsPacket_Graphics_Mode_ChangeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
