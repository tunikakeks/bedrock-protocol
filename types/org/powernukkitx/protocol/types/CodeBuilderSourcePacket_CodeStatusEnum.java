package org.powernukkitx.protocol.types;

public enum CodeBuilderSourcePacket_CodeStatusEnum {
  NONE,

  NOTSTARTED,

  INPROGRESS,

  PAUSED,

  ERROR,

  SUCCEEDED;

  public static CodeBuilderSourcePacket_CodeStatusEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
