package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComposterUsed {
  private ComposterUsed_Block_Interaction_TypeEnum blockInteractionType;

  private Integer itemId;

  public void encode(ByteBuf buf) {
    buf.writeByte(blockInteractionType.toByte());
    buf.writeInt(itemId);
  }

  public void decode(ByteBuf buf) {
    blockInteractionType = BlockInteractionTypeEnum.fromByte(buf.readUnsignedByte());
    itemId = buf.readInt();
  }
}
