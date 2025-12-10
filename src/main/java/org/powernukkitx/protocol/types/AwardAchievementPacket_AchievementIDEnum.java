package org.powernukkitx.protocol.types;

public enum AwardAchievementPacket_AchievementIDEnum {
  UNKNOWN;

  public static AwardAchievementPacket_AchievementIDEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
