package org.powernukkitx.protocol.types;

public enum CameraPresets_ListenerEnum {
  CAMERA,

  PLAYER;

  public static CameraPresets_ListenerEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
