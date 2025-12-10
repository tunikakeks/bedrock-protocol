package org.powernukkitx.protocol.types;

public enum SetSpawnPositionPacket_Spawn_Position_TypeEnum {
  PLAYERRESPAWN,

  WORLDSPAWN;

  public static SetSpawnPositionPacket_Spawn_Position_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
