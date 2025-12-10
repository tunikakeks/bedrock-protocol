package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TickingAreasLoadStatusPacket implements IPacket {
  private Boolean waitingForPreload;

  public void encode(ByteBuf buf) {
    buf.writeBoolean(waitingForPreload);
  }

  public void decode(ByteBuf buf) {
    waitingForPreload = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 179;
  }
}
