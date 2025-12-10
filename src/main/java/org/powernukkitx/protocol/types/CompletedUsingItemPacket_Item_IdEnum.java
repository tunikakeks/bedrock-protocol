package org.powernukkitx.protocol.types;

public enum CompletedUsingItemPacket_Item_IdEnum {
  UNKNOWN;

  public static CompletedUsingItemPacket_Item_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
