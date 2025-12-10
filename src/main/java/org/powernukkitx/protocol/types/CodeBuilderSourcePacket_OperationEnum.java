package org.powernukkitx.protocol.types;

public enum CodeBuilderSourcePacket_OperationEnum {
  NONE,

  GET,

  SET,

  RESET;

  public static CodeBuilderSourcePacket_OperationEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
