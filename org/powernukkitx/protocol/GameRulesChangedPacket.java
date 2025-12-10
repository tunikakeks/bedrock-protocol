package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.GameRulesChangedPacketData;

@Getter
@Setter
public class GameRulesChangedPacket implements IPacket {
  private GameRulesChangedPacketData ruleData;

  public void encode(ByteBuf buf) {
    ruleData.encode(buf);
  }

  public void decode(ByteBuf buf) {
    ruleData = new GameRulesChangedPacketData();
    ruleData.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 72;
  }
}
