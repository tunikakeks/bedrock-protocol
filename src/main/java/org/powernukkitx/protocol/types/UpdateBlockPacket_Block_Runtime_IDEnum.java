package org.powernukkitx.protocol.types;

public enum UpdateBlockPacket_Block_Runtime_IDEnum {
  UNKNOWN;

  public static UpdateBlockPacket_Block_Runtime_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
