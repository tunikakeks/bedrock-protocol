package org.powernukkitx.protocol.types;

public enum ResourcePackChunkDataPacket_Chunk_IDEnum {
  UNKNOWN;

  public static ResourcePackChunkDataPacket_Chunk_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
