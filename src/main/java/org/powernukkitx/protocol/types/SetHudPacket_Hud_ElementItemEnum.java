package org.powernukkitx.protocol.types;

public enum SetHudPacket_Hud_ElementItemEnum {
  PAPERDOLL,

  ARMOR,

  TOOLTIPS,

  TOUCHCONTROLS,

  CROSSHAIR,

  HOTBAR,

  HEALTH,

  PROGRESSBAR,

  HUNGER,

  AIRBUBBLES,

  HORSEHEALTH,

  STATUSEFFECTS,

  ITEMTEXT;

  public static SetHudPacket_Hud_ElementItemEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
