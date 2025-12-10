package org.powernukkitx.protocol.types;

public enum SimpleEventPacket_TypeEnum {
  UNINITIALIZEDSUBTYPE,

  ENABLECOMMANDS,

  DISABLECOMMANDS,

  UNLOCKWORLDTEMPLATESETTINGS;

  public static SimpleEventPacket_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
