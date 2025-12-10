package org.powernukkitx.protocol.types;

public enum MessageAndParams_popupEnum {
  RAW,

  CHAT,

  TRANSLATE,

  POPUP,

  JUKEBOXPOPUP,

  TIP,

  SYSTEMMESSAGE,

  WHISPER,

  ANNOUNCEMENT,

  TEXTOBJECTWHISPER,

  TEXTOBJECT,

  TEXTOBJECTANNOUNCEMENT;

  public static MessageAndParams_popupEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
