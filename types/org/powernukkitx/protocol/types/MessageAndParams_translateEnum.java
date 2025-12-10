package org.powernukkitx.protocol.types;

public enum MessageAndParams_translateEnum {
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

  public static MessageAndParams_translateEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
