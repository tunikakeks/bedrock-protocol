package org.powernukkitx.protocol.types;

public enum Class_StructureSettings_Animation_ModeEnum {
  NONE,

  LAYERS,

  BLOCKS;

  public static Class_StructureSettings_Animation_ModeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
