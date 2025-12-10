package org.powernukkitx.protocol.types;

public enum CameraShakePacket_Shake_TypeEnum {
  POSITIONAL,

  ROTATIONAL;

  public static CameraShakePacket_Shake_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
