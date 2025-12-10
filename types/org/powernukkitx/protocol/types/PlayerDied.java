package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDied {
  private Integer instigatorActorID;

  private Integer instigatorMobVariant;

  private Integer damageSource;

  private Boolean diedInRaid;

  public void encode(ByteBuf buf) {
    buf.writeInt(instigatorActorID);
    buf.writeInt(instigatorMobVariant);
    buf.writeInt(damageSource);
    buf.writeBoolean(diedInRaid);
  }

  public void decode(ByteBuf buf) {
    instigatorActorID = buf.readInt();
    instigatorMobVariant = buf.readInt();
    damageSource = buf.readInt();
    diedInRaid = buf.readBoolean();
  }
}
