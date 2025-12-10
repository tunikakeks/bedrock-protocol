package org.powernukkitx.protocol.types;

public enum CameraAimAssistPacket_Target_ModeEnum {
  ANGLE,

  DISTANCE;

  public static CameraAimAssistPacket_Target_ModeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
