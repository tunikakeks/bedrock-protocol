package org.powernukkitx.protocol.types;

public enum SetTitlePacket_Title_TypeEnum {
  CLEAR,

  RESET,

  TITLE,

  SUBTITLE,

  ACTIONBAR,

  TIMES,

  TITLETEXTOBJECT,

  SUBTITLETEXTOBJECT,

  ACTIONBARTEXTOBJECT;

  public static SetTitlePacket_Title_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
