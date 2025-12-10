package org.powernukkitx.protocol.types;

public enum CommandOutput_Output_TypeEnum {
  NONE,

  LASTOUTPUT,

  SILENT,

  ALLOUTPUT,

  DATASET;

  public static CommandOutput_Output_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
