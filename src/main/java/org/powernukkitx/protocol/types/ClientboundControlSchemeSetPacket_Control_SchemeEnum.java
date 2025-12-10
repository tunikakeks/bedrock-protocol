package org.powernukkitx.protocol.types;

public enum ClientboundControlSchemeSetPacket_Control_SchemeEnum {
  LOCKED_PLAYER_RELATIVE_STRAFE,

  CAMERA_RELATIVE,

  CAMERA_RELATIVE_STRAFE,

  PLAYER_RELATIVE,

  PLAYER_RELATIVE_STRAFE;

  public static ClientboundControlSchemeSetPacket_Control_SchemeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
