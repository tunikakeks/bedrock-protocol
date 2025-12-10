package org.powernukkitx.protocol.types;

public enum StructureTemplateDataRequestPacket_Requested_OperationEnum {
  NONE,

  EXPORTFROMSAVEMODE,

  EXPORTFROMLOADMODE,

  QUERYSAVEDSTRUCTURE;

  public static StructureTemplateDataRequestPacket_Requested_OperationEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
