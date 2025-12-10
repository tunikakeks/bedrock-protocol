package org.powernukkitx.protocol.types;

public enum MessageOnly_textObjectWhisperEnum {
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

  public static MessageOnly_textObjectWhisperEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
