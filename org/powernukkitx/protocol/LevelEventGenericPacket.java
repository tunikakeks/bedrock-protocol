package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types._4158325036;

@Getter
@Setter
public class LevelEventGenericPacket implements IPacket {
  private Integer eventId;

  private _4158325036 ctd;

  public void encode(ByteBuf buf) {
    buf.writeInt(eventId);
    ctd.encode(buf);
  }

  public void decode(ByteBuf buf) {
    eventId = buf.readInt();
    ctd = new _4158325036();
    ctd.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 124;
  }
}
