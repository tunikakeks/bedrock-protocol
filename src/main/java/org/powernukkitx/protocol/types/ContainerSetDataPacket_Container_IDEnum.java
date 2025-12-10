package org.powernukkitx.protocol.types;

public enum ContainerSetDataPacket_Container_IDEnum {
  UNKNOWN;

  public static ContainerSetDataPacket_Container_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
