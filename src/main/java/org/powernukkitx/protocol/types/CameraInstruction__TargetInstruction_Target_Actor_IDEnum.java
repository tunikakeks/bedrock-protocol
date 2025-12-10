package org.powernukkitx.protocol.types;

public enum CameraInstruction__TargetInstruction_Target_Actor_IDEnum {
  UNKNOWN;

  public static CameraInstruction__TargetInstruction_Target_Actor_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
