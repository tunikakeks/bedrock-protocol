package org.powernukkitx.protocol.types;

public enum RequestPermissionsPacket_Target_Player_Id_s_Raw_IDEnum {
  UNKNOWN;

  public static RequestPermissionsPacket_Target_Player_Id_s_Raw_IDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
