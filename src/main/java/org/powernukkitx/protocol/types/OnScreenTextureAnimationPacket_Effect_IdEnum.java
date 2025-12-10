package org.powernukkitx.protocol.types;

public enum OnScreenTextureAnimationPacket_Effect_IdEnum {
  UNKNOWN;

  public static OnScreenTextureAnimationPacket_Effect_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
