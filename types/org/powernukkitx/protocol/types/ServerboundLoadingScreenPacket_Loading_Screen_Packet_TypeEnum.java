package org.powernukkitx.protocol.types;

public enum ServerboundLoadingScreenPacket_Loading_Screen_Packet_TypeEnum {
  STARTLOADINGSCREEN,

  ENDLOADINGSCREEN;

  public static ServerboundLoadingScreenPacket_Loading_Screen_Packet_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
