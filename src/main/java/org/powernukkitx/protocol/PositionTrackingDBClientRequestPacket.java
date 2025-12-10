package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActionEnum;
import org.powernukkitx.protocol.types.PositionTrackingDBClientRequestPacket_ActionEnum;
import org.powernukkitx.protocol.types.PositionTrackingId;

@Getter
@Setter
public class PositionTrackingDBClientRequestPacket implements IPacket {
  private PositionTrackingDBClientRequestPacket_ActionEnum action;

  private PositionTrackingId id;

  public void encode(ByteBuf buf) {
    buf.writeInt(action.ordinal());
    id.encode(buf);
  }

  public void decode(ByteBuf buf) {
    action = ActionEnum.values()[buf.readInt()];
    id = new PositionTrackingId();
    id.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 154;
  }
}
