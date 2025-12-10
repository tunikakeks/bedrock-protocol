package org.powernukkitx.protocol.types;

public enum UpdateTradePacket_Container_IdEnum {
  UNKNOWN;

  public static UpdateTradePacket_Container_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
