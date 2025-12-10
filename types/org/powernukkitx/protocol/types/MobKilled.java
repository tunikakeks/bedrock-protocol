package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MobKilled {
  private Long instigatorActorID;

  private Long targetActorID;

  private MobKilled_Instigator_s_Child_Actor_TypeEnum instigatorSChildActorType;

  private Integer damageSource;

  private Integer tradeTier;

  private String traderName;

  public void encode(ByteBuf buf) {
    buf.writeLong(instigatorActorID);
    buf.writeLong(targetActorID);
    buf.writeByte(instigatorSChildActorType.toByte());
    buf.writeInt(damageSource);
    buf.writeInt(tradeTier);
    int __len_traderName = traderName != null ? traderName.length() : 0;
    if (traderName != null) buf.writeCharSequence(traderName, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    instigatorActorID = buf.readLong();
    targetActorID = buf.readLong();
    instigatorSChildActorType = InstigatorSChildActorTypeEnum.fromByte(buf.readUnsignedByte());
    damageSource = buf.readInt();
    tradeTier = buf.readInt();
    int __len_traderName = buf.readInt();
    traderName = buf.readCharSequence(__len_traderName, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
