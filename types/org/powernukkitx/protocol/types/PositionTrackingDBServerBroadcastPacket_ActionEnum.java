package org.powernukkitx.protocol.types;

public enum PositionTrackingDBServerBroadcastPacket_ActionEnum {
  UPDATE,

  DESTROY,

  NOTFOUND;

  public static PositionTrackingDBServerBroadcastPacket_ActionEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
