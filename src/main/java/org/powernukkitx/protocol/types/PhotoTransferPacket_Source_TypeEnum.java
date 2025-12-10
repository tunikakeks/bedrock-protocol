package org.powernukkitx.protocol.types;

public enum PhotoTransferPacket_Source_TypeEnum {
  PORTFOLIO,

  PHOTOITEM,

  BOOK;

  public static PhotoTransferPacket_Source_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
