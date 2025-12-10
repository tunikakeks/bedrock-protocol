package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorUniqueID;
import org.powernukkitx.protocol.types.EventTypeEnum;
import org.powernukkitx.protocol.types.LegacyTelemetryEventPacket_Event_TypeEnum;

@Getter
@Setter
public class LegacyTelemetryEventPacket implements IPacket {
  private ActorUniqueID targetActorID;

  private LegacyTelemetryEventPacket_Event_TypeEnum eventType;

  private Boolean usePlayerID;

  private Object eventData;

  public void encode(ByteBuf buf) {
    targetActorID.encode(buf);
    buf.writeInt(eventType.ordinal());
    buf.writeBoolean(usePlayerID);
    // unknown type for field eventData
  }

  public void decode(ByteBuf buf) {
    targetActorID = new ActorUniqueID();
    targetActorID.decode(buf);
    eventType = EventTypeEnum.values()[buf.readInt()];
    usePlayerID = buf.readBoolean();
    // unknown type for field eventData
  }

  @Override
  public int getPacketId() {
    return 65;
  }
}
