package org.powernukkitx.protocol.types;

public enum Struct_ShapeDataPayload_Shape_TypeEnum {
  LINE,

  BOX,

  SPHERE,

  CIRCLE,

  TEXT,

  ARROW;

  public static Struct_ShapeDataPayload_Shape_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
