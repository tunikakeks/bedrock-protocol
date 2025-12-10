package org.powernukkitx.protocol.types;

public enum PacketViolationWarningPacket_Violation_TypeEnum {
  UNKNOWN,

  PACKETMALFORMED;

  public static PacketViolationWarningPacket_Violation_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
