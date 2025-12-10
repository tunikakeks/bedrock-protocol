package org.powernukkitx.protocol.types;

public enum SetHudPacket_Hud_VisibleEnum {
  HIDE,

  RESET;

  public static SetHudPacket_Hud_VisibleEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
