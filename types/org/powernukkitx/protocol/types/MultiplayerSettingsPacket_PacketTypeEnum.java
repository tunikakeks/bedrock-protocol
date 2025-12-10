package org.powernukkitx.protocol.types;

public enum MultiplayerSettingsPacket_PacketTypeEnum {
  ENABLEMULTIPLAYER,

  DISABLEMULTIPLAYER,

  REFRESHJOINCODE;

  public static MultiplayerSettingsPacket_PacketTypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
