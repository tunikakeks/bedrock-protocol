package org.powernukkitx.protocol.types;

public enum PositionTrackingDBClientRequestPacket_ActionEnum {
  QUERY;

  public static PositionTrackingDBClientRequestPacket_ActionEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
