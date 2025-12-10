package org.powernukkitx.protocol.types;

public enum ModalFormRequestPacket_Form_IDEnum {
  UNKNOWN;

  public static ModalFormRequestPacket_Form_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
