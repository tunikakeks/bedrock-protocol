package org.powernukkitx.protocol.types;

public enum CodeBuilderSourcePacket_CategoryEnum {
  NONE,

  CODESTATUS,

  INSTANTIATION;

  public static CodeBuilderSourcePacket_CategoryEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
