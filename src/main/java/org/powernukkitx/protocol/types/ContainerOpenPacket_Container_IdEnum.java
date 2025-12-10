package org.powernukkitx.protocol.types;

public enum ContainerOpenPacket_Container_IdEnum {
  UNKNOWN;

  public static ContainerOpenPacket_Container_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
