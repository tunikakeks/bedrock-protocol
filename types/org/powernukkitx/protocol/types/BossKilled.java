package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Long;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BossKilled {
  private Long bossActorID;

  private Integer partySize;

  private Integer bossType;

  public void encode(ByteBuf buf) {
    buf.writeLong(bossActorID);
    buf.writeInt(partySize);
    buf.writeInt(bossType);
  }

  public void decode(ByteBuf buf) {
    bossActorID = buf.readLong();
    partySize = buf.readInt();
    bossType = buf.readInt();
  }
}
