package org.powernukkitx.protocol.types;

public enum RespawnPacket_StateEnum {
  SEARCHINGFORSPAWN,

  READYTOSPAWN,

  CLIENTREADYTOSPAWN;

  public static RespawnPacket_StateEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
