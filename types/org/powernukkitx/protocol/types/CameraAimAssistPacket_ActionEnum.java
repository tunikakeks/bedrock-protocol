package org.powernukkitx.protocol.types;

public enum CameraAimAssistPacket_ActionEnum {
  SET,

  CLEAR;

  public static CameraAimAssistPacket_ActionEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
