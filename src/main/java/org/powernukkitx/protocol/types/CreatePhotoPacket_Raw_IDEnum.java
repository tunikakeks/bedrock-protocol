package org.powernukkitx.protocol.types;

public enum CreatePhotoPacket_Raw_IDEnum {
  UNKNOWN;

  public static CreatePhotoPacket_Raw_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
