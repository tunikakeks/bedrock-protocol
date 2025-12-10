package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Interaction {
  private Interaction_Interacted_Entity_IDEnum interactedEntityID;

  private Interaction_Interaction_TypeEnum interactionType;

  private Integer interactionActorType;

  private Integer interactionActorVariant;

  private Integer interactionActorColor;

  public void encode(ByteBuf buf) {
    buf.writeInt(interactedEntityID.ordinal());
    buf.writeInt(interactionType.ordinal());
    buf.writeInt(interactionActorType);
    buf.writeInt(interactionActorVariant);
    buf.writeInt(interactionActorColor);
  }

  public void decode(ByteBuf buf) {
    interactedEntityID = InteractedEntityIDEnum.values()[buf.readInt()];
    interactionType = InteractionTypeEnum.values()[buf.readInt()];
    interactionActorType = buf.readInt();
    interactionActorVariant = buf.readInt();
    interactionActorColor = buf.readInt();
  }
}
