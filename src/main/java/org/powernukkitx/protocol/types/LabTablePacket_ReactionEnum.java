package org.powernukkitx.protocol.types;

public enum LabTablePacket_ReactionEnum {
  NONE,

  ICEBOMB,

  BLEACH,

  ELEPHANTTOOTHPASTE,

  FERTILIZER,

  HEATBLOCK,

  MAGNESIUMSALTS,

  MISCFIRE,

  MISCEXPLOSION,

  MISCLAVA,

  MISCMYSTICAL,

  MISCSMOKE,

  MISCLARGESMOKE;

  public static LabTablePacket_ReactionEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
