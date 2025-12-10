package org.powernukkitx.protocol.types;

public enum UpdateBlockSyncedPacket_Block_Runtime_IDEnum {
  UNKNOWN;

  public static UpdateBlockSyncedPacket_Block_Runtime_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
