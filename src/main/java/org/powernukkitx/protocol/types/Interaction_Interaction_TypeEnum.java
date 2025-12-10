package org.powernukkitx.protocol.types;

public enum Interaction_Interaction_TypeEnum {
  BREEDING,

  TAMING,

  CURING,

  CRAFTED,

  SHEARING,

  MILKING,

  TRADING,

  FEEDING,

  IGNITING,

  COLORING,

  NAMING,

  LEASHING,

  UNLEASHING,

  PETSLEEP,

  TRUSTING,

  COMMANDING;

  public static Interaction_Interaction_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
