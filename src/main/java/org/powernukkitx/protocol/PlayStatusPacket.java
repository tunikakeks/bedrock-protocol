package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.PlayStatusPacket_StatusEnum;
import org.powernukkitx.protocol.types.StatusEnum;

@Getter
@Setter
public class PlayStatusPacket implements IPacket {
  private PlayStatusPacket_StatusEnum status;

  public void encode(ByteBuf buf) {
    buf.writeInt(status.ordinal());
  }

  public void decode(ByteBuf buf) {
    status = StatusEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 2;
  }
}
