package org.powernukkitx.protocol.types;

public enum PlayerWaxedOrUnwaxedCopper_Player_Waxed_or_Unwaxed_Copper_Block_IDEnum {
  UNKNOWN;

  public static PlayerWaxedOrUnwaxedCopper_Player_Waxed_or_Unwaxed_Copper_Block_IDEnum fromByte(
      int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
