package org.powernukkitx.protocol.types;

public enum ClientCameraAimAssistPacket_ActionEnum {
  SETFROMCAMERAPRESET,

  CLEAR;

  public static ClientCameraAimAssistPacket_ActionEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
