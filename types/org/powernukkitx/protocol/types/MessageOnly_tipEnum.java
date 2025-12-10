package org.powernukkitx.protocol.types;

public enum MessageOnly_tipEnum {
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

  public static MessageOnly_tipEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
