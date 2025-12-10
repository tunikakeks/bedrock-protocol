package org.powernukkitx.protocol.types;

public enum SimulationTypePacket_Sim_TypeEnum {
  GAME,

  EDITOR,

  TEST,

  INVALID;

  public static SimulationTypePacket_Sim_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
