package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorIDEnum;
import org.powernukkitx.protocol.types.ActorPickRequestPacket_Actor_IDEnum;

@Getter
@Setter
public class ActorPickRequestPacket implements IPacket {
  private ActorPickRequestPacket_Actor_IDEnum actorID;

  private Integer maxSlots;

  private Boolean withData;

  public void encode(ByteBuf buf) {
    buf.writeInt(actorID.ordinal());
    buf.writeInt(maxSlots);
    buf.writeBoolean(withData);
  }

  public void decode(ByteBuf buf) {
    actorID = ActorIDEnum.values()[buf.readInt()];
    maxSlots = buf.readInt();
    withData = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 35;
  }
}
