package org.powernukkitx.protocol.types;

public enum NpcRequestPacket_Request_TypeEnum {
  SETACTIONS,

  EXECUTEACTION,

  EXECUTECLOSINGCOMMANDS,

  SETNAME,

  SETSKIN,

  SETINTERACTTEXT,

  EXECUTEOPENINGCOMMANDS;

  public static NpcRequestPacket_Request_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
