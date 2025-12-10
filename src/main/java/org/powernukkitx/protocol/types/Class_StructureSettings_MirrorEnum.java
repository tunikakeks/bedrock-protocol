package org.powernukkitx.protocol.types;

public enum Class_StructureSettings_MirrorEnum {
  NONE,

  X,

  Z,

  XZ;

  public static Class_StructureSettings_MirrorEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
