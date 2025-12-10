package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.DeathCauseMessageType;

@Getter
@Setter
public class DeathInfoPacket implements IPacket {
  private DeathCauseMessageType deathCauseMessage;

  public void encode(ByteBuf buf) {
    deathCauseMessage.encode(buf);
  }

  public void decode(ByteBuf buf) {
    deathCauseMessage = new DeathCauseMessageType();
    deathCauseMessage.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 189;
  }
}
