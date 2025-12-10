package org.powernukkitx.protocol.types;

public enum AnimatePacket_ActionEnum {
  NOACTION,

  SWING,

  WAKEUP,

  CRITICALHIT,

  MAGICCRITICALHIT;

  public static AnimatePacket_ActionEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
