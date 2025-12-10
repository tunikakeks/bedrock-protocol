package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActionEnum;
import org.powernukkitx.protocol.types.PositionTrackingDBServerBroadcastPacket_ActionEnum;
import org.powernukkitx.protocol.types.PositionTrackingId;
import org.powernukkitx.protocol.types._4158325036;

@Getter
@Setter
public class PositionTrackingDBServerBroadcastPacket implements IPacket {
  private PositionTrackingDBServerBroadcastPacket_ActionEnum action;

  private PositionTrackingId id;

  private _4158325036 positionTrackingData;

  public void encode(ByteBuf buf) {
    buf.writeByte(action.toByte());
    id.encode(buf);
    positionTrackingData.encode(buf);
  }

  public void decode(ByteBuf buf) {
    action = ActionEnum.fromByte(buf.readUnsignedByte());
    id = new PositionTrackingId();
    id.decode(buf);
    positionTrackingData = new _4158325036();
    positionTrackingData.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 153;
  }
}
