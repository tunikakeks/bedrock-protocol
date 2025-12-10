package org.powernukkitx.protocol.types;

public enum UpdateBlockSyncedPacket_Unique_Actor_IdEnum {
  UNKNOWN;

  public static UpdateBlockSyncedPacket_Unique_Actor_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
