package org.powernukkitx.protocol.types;

public enum PacketViolationWarningPacket_Violation_PacketIdEnum {
  UNKNOWN;

  public static PacketViolationWarningPacket_Violation_PacketIdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
