package org.powernukkitx.protocol.types;

public enum UnlockedRecipesPacket_Packet_TypeEnum {
  EMPTY,

  INITIALLYUNLOCKEDRECIPES,

  NEWLYUNLOCKEDRECIPES,

  REMOVEUNLOCKEDRECIPES,

  REMOVEALLUNLOCKEDRECIPES;

  public static UnlockedRecipesPacket_Packet_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
