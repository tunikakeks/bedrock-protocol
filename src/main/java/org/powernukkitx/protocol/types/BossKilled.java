package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BossKilled {
  private BossKilled_Boss_Actor_IDEnum bossActorID;

  private Integer partySize;

  private Integer bossType;

  public void encode(ByteBuf buf) {
    buf.writeInt(bossActorID.ordinal());
    buf.writeInt(partySize);
    buf.writeInt(bossType);
  }

  public void decode(ByteBuf buf) {
    bossActorID = BossActorIDEnum.values()[buf.readInt()];
    partySize = buf.readInt();
    bossType = buf.readInt();
  }
}
