package org.powernukkitx.protocol.types;

public enum AgentAnimationPacket_Agent_AnimationEnum {
  ARMSWING,

  SHRUG;

  public static AgentAnimationPacket_Agent_AnimationEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
