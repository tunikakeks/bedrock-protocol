package org.powernukkitx.protocol.types;

public enum CorrectPlayerMovePredictionPacket_PredictionTypeEnum {
  PLAYER,

  VEHICLE;

  public static CorrectPlayerMovePredictionPacket_PredictionTypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
