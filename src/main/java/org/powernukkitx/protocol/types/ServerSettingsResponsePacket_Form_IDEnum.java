package org.powernukkitx.protocol.types;

public enum ServerSettingsResponsePacket_Form_IDEnum {
  UNKNOWN;

  public static ServerSettingsResponsePacket_Form_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
