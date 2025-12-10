package org.powernukkitx.protocol.types;

public enum LabTablePacket_TypeEnum {
  STARTCOMBINE,

  STARTREACTION,

  RESET;

  public static LabTablePacket_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
