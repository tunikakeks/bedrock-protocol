package org.powernukkitx.protocol.types;

public enum UpdateSubChunkNetworkBlockInfo_Sync_Message___Entity_Unique_IDEnum {
  UNKNOWN;

  public static UpdateSubChunkNetworkBlockInfo_Sync_Message___Entity_Unique_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
