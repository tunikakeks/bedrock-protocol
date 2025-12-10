package org.powernukkitx.protocol.types;

public enum PacketViolationWarningPacket_Violation_SeverityEnum {
  UNKNOWN,

  WARNING,

  FINALWARNING,

  TERMINATINGCONNECTION;

  public static PacketViolationWarningPacket_Violation_SeverityEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
