package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AwardAchievementPacket implements IPacket {
  private Integer achievementid;

  public void encode(ByteBuf buf) {
    buf.writeInt(achievementid);
  }

  public void decode(ByteBuf buf) {
    achievementid = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 309;
  }
}
