package org.powernukkitx.protocol.types;

public enum CameraInstruction__FovInstruction_FOV_Ease_TypeEnum {
  LINEAR,

  SPRING,

  IN_QUAD,

  OUT_QUAD,

  IN_OUT_QUAD,

  IN_CUBIC,

  OUT_CUBIC,

  IN_OUT_CUBIC,

  IN_QUART,

  OUT_QUART,

  IN_OUT_QUART,

  IN_QUINT,

  OUT_QUINT,

  IN_OUT_QUINT,

  IN_SINE,

  OUT_SINE,

  IN_OUT_SINE,

  IN_EXPO,

  OUT_EXPO,

  IN_OUT_EXPO,

  IN_CIRC,

  OUT_CIRC,

  IN_OUT_CIRC,

  IN_BOUNCE,

  OUT_BOUNCE,

  IN_OUT_BOUNCE,

  IN_BACK,

  OUT_BACK,

  IN_OUT_BACK,

  IN_ELASTIC,

  OUT_ELASTIC,

  IN_OUT_ELASTIC;

  public static CameraInstruction__FovInstruction_FOV_Ease_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
