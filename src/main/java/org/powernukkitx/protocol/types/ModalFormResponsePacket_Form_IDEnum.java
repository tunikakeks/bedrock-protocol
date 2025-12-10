package org.powernukkitx.protocol.types;

public enum ModalFormResponsePacket_Form_IDEnum {
  UNKNOWN;

  public static ModalFormResponsePacket_Form_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
