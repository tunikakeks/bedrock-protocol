package org.powernukkitx.protocol.types;

public enum NpcDialoguePacket_Npc_Dialogue_Action_TypeEnum {
  OPEN,

  CLOSE;

  public static NpcDialoguePacket_Npc_Dialogue_Action_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
