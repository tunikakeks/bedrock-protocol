package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.LasthurtbyEnum;
import org.powernukkitx.protocol.types.SetLastHurtByPacket_LastHurtByEnum;

@Getter
@Setter
public class SetLastHurtByPacket implements IPacket {
  private SetLastHurtByPacket_LastHurtByEnum lasthurtby;

  public void encode(ByteBuf buf) {
    buf.writeInt(lasthurtby.ordinal());
  }

  public void decode(ByteBuf buf) {
    lasthurtby = LasthurtbyEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 96;
  }
}
