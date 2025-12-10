package org.powernukkitx.protocol.types;

public enum InteractPacket_ActionEnum {
  INVALID,

  STOPRIDING,

  INTERACTUPDATE,

  NPCOPEN,

  OPENINVENTORY;

  public static InteractPacket_ActionEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
