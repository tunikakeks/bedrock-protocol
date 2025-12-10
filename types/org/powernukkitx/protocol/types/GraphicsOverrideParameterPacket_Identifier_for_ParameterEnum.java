package org.powernukkitx.protocol.types;

public enum GraphicsOverrideParameterPacket_Identifier_for_ParameterEnum {
  SKYZENITHCOLOR,

  SKYHORIZONCOLOR,

  HORIZONBLENDMIN,

  HORIZONBLENDMAX,

  HORIZONBLENDSTART,

  HORIZONBLENDMIESTART,

  RAYLEIGHSTRENGTH,

  SUNMIESTRENGTH,

  MOONMIESTRENGTH,

  SUNGLARESHAPE;

  public static GraphicsOverrideParameterPacket_Identifier_for_ParameterEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
