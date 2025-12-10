package org.powernukkitx.protocol.types;

public enum Interaction_Interacted_Entity_IDEnum {
  UNKNOWN;

  public static Interaction_Interacted_Entity_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
