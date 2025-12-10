package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.EventIdEnum;
import org.powernukkitx.protocol.types.LevelEventPacket_Event_IdEnum;
import org.powernukkitx.protocol.types.Vec3;

@Getter
@Setter
public class LevelEventPacket implements IPacket {
  private LevelEventPacket_Event_IdEnum eventId;

  private Vec3 position;

  private Integer data;

  public void encode(ByteBuf buf) {
    buf.writeInt(eventId.ordinal());
    position.encode(buf);
    buf.writeInt(data);
  }

  public void decode(ByteBuf buf) {
    eventId = EventIdEnum.values()[buf.readInt()];
    position = new Vec3();
    position.decode(buf);
    data = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 25;
  }
}
