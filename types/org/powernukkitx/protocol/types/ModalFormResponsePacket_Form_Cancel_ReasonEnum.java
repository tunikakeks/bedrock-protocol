package org.powernukkitx.protocol.types;

public enum ModalFormResponsePacket_Form_Cancel_ReasonEnum {
  USERCLOSED,

  USERBUSY;

  public static ModalFormResponsePacket_Form_Cancel_ReasonEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
