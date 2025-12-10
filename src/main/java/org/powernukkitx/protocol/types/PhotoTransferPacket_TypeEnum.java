package org.powernukkitx.protocol.types;

public enum PhotoTransferPacket_TypeEnum {
  PORTFOLIO,

  PHOTOITEM,

  BOOK;

  public static PhotoTransferPacket_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
