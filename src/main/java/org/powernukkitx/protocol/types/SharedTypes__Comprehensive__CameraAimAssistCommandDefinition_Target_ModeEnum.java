package org.powernukkitx.protocol.types;

public enum SharedTypes__Comprehensive__CameraAimAssistCommandDefinition_Target_ModeEnum {
  ANGLE,

  DISTANCE;

  public static SharedTypes__Comprehensive__CameraAimAssistCommandDefinition_Target_ModeEnum fromByte(
      int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
