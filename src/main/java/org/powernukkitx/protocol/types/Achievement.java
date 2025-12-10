package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Achievement {
  private Achievement_Achievement_IDEnum achievementID;

  public void encode(ByteBuf buf) {
    buf.writeInt(achievementID.ordinal());
  }

  public void decode(ByteBuf buf) {
    achievementID = AchievementIDEnum.values()[buf.readInt()];
  }
}
