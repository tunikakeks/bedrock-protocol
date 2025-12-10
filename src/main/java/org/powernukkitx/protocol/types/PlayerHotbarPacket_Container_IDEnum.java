package org.powernukkitx.protocol.types;

public enum PlayerHotbarPacket_Container_IDEnum {
  UNKNOWN;

  public static PlayerHotbarPacket_Container_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
