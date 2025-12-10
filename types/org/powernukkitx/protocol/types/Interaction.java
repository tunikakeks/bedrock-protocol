package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Long;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Interaction {
  private Long interactedEntityID;

  private Interaction_Interaction_TypeEnum interactionType;

  private Integer interactionActorType;

  private Integer interactionActorVariant;

  private Integer interactionActorColor;

  public void encode(ByteBuf buf) {
    buf.writeLong(interactedEntityID);
    buf.writeByte(interactionType.toByte());
    buf.writeInt(interactionActorType);
    buf.writeInt(interactionActorVariant);
    buf.writeInt(interactionActorColor);
  }

  public void decode(ByteBuf buf) {
    interactedEntityID = buf.readLong();
    interactionType = InteractionTypeEnum.fromByte(buf.readUnsignedByte());
    interactionActorType = buf.readInt();
    interactionActorVariant = buf.readInt();
    interactionActorColor = buf.readInt();
  }
}
