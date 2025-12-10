package org.powernukkitx.protocol.types;

public enum StructureTemplateDataResponsePacket_Response_TypeEnum {
  NONE,

  EXPORT,

  QUERY;

  public static StructureTemplateDataResponsePacket_Response_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
