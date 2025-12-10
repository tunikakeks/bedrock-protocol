package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.AchievementidEnum;
import org.powernukkitx.protocol.types.AwardAchievementPacket_AchievementIDEnum;

@Getter
@Setter
public class AwardAchievementPacket implements IPacket {
  private AwardAchievementPacket_AchievementIDEnum achievementid;

  public void encode(ByteBuf buf) {
    buf.writeInt(achievementid.ordinal());
  }

  public void decode(ByteBuf buf) {
    achievementid = AchievementidEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 309;
  }
}
