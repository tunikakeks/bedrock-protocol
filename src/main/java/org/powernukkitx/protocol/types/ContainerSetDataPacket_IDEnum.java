package org.powernukkitx.protocol.types;

public enum ContainerSetDataPacket_IDEnum {
  UNKNOWN;

  public static ContainerSetDataPacket_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
