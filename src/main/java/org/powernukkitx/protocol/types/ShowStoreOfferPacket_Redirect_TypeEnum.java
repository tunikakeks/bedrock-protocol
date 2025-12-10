package org.powernukkitx.protocol.types;

public enum ShowStoreOfferPacket_Redirect_TypeEnum {
  MARKETPLACEOFFER,

  DRESSINGROOMOFFER,

  THIRDPARTYSERVERPAGE;

  public static ShowStoreOfferPacket_Redirect_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
