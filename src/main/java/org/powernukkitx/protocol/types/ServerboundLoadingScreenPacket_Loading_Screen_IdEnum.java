package org.powernukkitx.protocol.types;

public enum ServerboundLoadingScreenPacket_Loading_Screen_IdEnum {
  UNKNOWN;

  public static ServerboundLoadingScreenPacket_Loading_Screen_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
