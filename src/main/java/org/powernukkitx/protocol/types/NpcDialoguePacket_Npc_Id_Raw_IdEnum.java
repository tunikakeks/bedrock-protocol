package org.powernukkitx.protocol.types;

public enum NpcDialoguePacket_Npc_Id_Raw_IdEnum {
  UNKNOWN;

  public static NpcDialoguePacket_Npc_Id_Raw_IdEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
