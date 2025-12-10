package org.powernukkitx.protocol.types;

public enum ContainerClosePacket_Container_IdEnum {
  UNKNOWN;

  public static ContainerClosePacket_Container_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
