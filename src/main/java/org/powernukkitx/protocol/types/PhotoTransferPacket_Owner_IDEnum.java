package org.powernukkitx.protocol.types;

public enum PhotoTransferPacket_Owner_IDEnum {
  UNKNOWN;

  public static PhotoTransferPacket_Owner_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
