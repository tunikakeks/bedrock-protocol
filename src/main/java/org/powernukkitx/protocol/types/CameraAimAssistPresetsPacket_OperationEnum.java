package org.powernukkitx.protocol.types;

public enum CameraAimAssistPresetsPacket_OperationEnum {
  SET,

  ADDTOEXISTING;

  public static CameraAimAssistPresetsPacket_OperationEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
