package org.powernukkitx.protocol.types;

public enum CameraShakePacket_Shake_ActionEnum {
  ADD,

  STOP;

  public static CameraShakePacket_Shake_ActionEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
