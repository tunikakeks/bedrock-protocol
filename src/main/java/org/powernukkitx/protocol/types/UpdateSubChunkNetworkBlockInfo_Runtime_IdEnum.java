package org.powernukkitx.protocol.types;

public enum UpdateSubChunkNetworkBlockInfo_Runtime_IdEnum {
  UNKNOWN;

  public static UpdateSubChunkNetworkBlockInfo_Runtime_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
