package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetHealthPacket implements IPacket {
  private Integer health;

  public void encode(ByteBuf buf) {
    buf.writeInt(health);
  }

  public void decode(ByteBuf buf) {
    health = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 42;
  }
}
