package org.powernukkitx.protocol.types;

public enum ClientboundDebugRendererPacket_TypeEnum {
  INVALID,

  CLEARDEBUGMARKERS,

  ADDDEBUGMARKERCUBE;

  public static ClientboundDebugRendererPacket_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
