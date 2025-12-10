package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActorPickRequestPacket implements IPacket {
  private Long actorID;

  private Integer maxSlots;

  private Boolean withData;

  public void encode(ByteBuf buf) {
    buf.writeLong(actorID);
    buf.writeInt(maxSlots);
    buf.writeBoolean(withData);
  }

  public void decode(ByteBuf buf) {
    actorID = buf.readLong();
    maxSlots = buf.readInt();
    withData = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 35;
  }
}
