package org.powernukkitx.protocol.types;

public enum AgentActionEventPacket_ActionEnum {
  ATTACK,

  COLLECT,

  DESTROY,

  DETECTREDSTONE,

  DETECTOBSTACLE,

  DROP,

  DROPALL,

  INSPECT,

  INSPECTDATA,

  INSPECTITEMCOUNT,

  INSPECTITEMDETAIL,

  INSPECTITEMSPACE,

  INTERACT,

  MOVE,

  PLACEBLOCK,

  TILL,

  TRANSFERITEMTO,

  TURN;

  public static AgentActionEventPacket_ActionEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
