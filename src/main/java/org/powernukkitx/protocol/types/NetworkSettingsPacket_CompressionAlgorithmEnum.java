package org.powernukkitx.protocol.types;

public enum NetworkSettingsPacket_CompressionAlgorithmEnum {
  ZLIB,

  SNAPPY,

  NONE;

  public static NetworkSettingsPacket_CompressionAlgorithmEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
