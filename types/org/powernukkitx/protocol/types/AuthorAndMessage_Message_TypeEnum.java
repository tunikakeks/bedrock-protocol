package org.powernukkitx.protocol.types;

public enum AuthorAndMessage_Message_TypeEnum {
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

  public static AuthorAndMessage_Message_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
