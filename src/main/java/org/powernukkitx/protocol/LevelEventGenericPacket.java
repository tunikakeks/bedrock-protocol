package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.EventIdEnum;
import org.powernukkitx.protocol.types.LevelEventGenericPacket_Event_IdEnum;
import org.powernukkitx.protocol.types._4158325036;

@Getter
@Setter
public class LevelEventGenericPacket implements IPacket {
  private LevelEventGenericPacket_Event_IdEnum eventId;

  private _4158325036 ctd;

  public void encode(ByteBuf buf) {
    buf.writeInt(eventId.ordinal());
    ctd.encode(buf);
  }

  public void decode(ByteBuf buf) {
    eventId = EventIdEnum.values()[buf.readInt()];
    ctd = new _4158325036();
    ctd.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 124;
  }
}
