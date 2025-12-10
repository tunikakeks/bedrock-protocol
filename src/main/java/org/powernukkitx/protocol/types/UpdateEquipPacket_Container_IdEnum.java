package org.powernukkitx.protocol.types;

public enum UpdateEquipPacket_Container_IdEnum {
  UNKNOWN;

  public static UpdateEquipPacket_Container_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
