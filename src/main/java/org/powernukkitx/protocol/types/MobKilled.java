package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MobKilled {
  private MobKilled_Instigator_Actor_IDEnum instigatorActorID;

  private MobKilled_Target_Actor_IDEnum targetActorID;

  private MobKilled_Instigator_s_Child_Actor_TypeEnum instigatorSChildActorType;

  private Integer damageSource;

  private Integer tradeTier;

  private String traderName;

  public void encode(ByteBuf buf) {
    buf.writeInt(instigatorActorID.ordinal());
    buf.writeInt(targetActorID.ordinal());
    buf.writeInt(instigatorSChildActorType.ordinal());
    buf.writeInt(damageSource);
    buf.writeInt(tradeTier);
    int __len_traderName = traderName != null ? traderName.length() : 0;
    if (traderName != null) buf.writeCharSequence(traderName, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    instigatorActorID = InstigatorActorIDEnum.values()[buf.readInt()];
    targetActorID = TargetActorIDEnum.values()[buf.readInt()];
    instigatorSChildActorType = InstigatorSChildActorTypeEnum.values()[buf.readInt()];
    damageSource = buf.readInt();
    tradeTier = buf.readInt();
    int __len_traderName = buf.readInt();
    traderName = buf.readCharSequence(__len_traderName, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
