package org.powernukkitx.protocol.types;

public enum UpdateSoftEnumPacket_Update_TypeEnum {
  ADD,

  REMOVE,

  REPLACE;

  public static UpdateSoftEnumPacket_Update_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
