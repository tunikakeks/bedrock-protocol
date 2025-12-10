package org.powernukkitx.protocol.types;

public enum CameraInstruction__AttachToEntityInstruction_Entity_Actor_IDEnum {
  UNKNOWN;

  public static CameraInstruction__AttachToEntityInstruction_Entity_Actor_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
