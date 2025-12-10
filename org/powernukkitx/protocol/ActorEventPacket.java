package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorEventPacket_Event_IDEnum;
import org.powernukkitx.protocol.types.ActorRuntimeID;
import org.powernukkitx.protocol.types.EventIDEnum;

@Getter
@Setter
public class ActorEventPacket implements IPacket {
  private ActorRuntimeID targetRuntimeID;

  private ActorEventPacket_Event_IDEnum eventID;

  private Integer data;

  public void encode(ByteBuf buf) {
    targetRuntimeID.encode(buf);
    buf.writeByte(eventID.toByte());
    buf.writeInt(data);
  }

  public void decode(ByteBuf buf) {
    targetRuntimeID = new ActorRuntimeID();
    targetRuntimeID.decode(buf);
    eventID = EventIDEnum.fromByte(buf.readUnsignedByte());
    data = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 27;
  }
}
