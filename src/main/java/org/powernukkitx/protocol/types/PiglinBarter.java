package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PiglinBarter {
  private PiglinBarter_Item_IdEnum itemId;

  private Boolean wasTargetingBarteringPlayer;

  public void encode(ByteBuf buf) {
    buf.writeInt(itemId.ordinal());
    buf.writeBoolean(wasTargetingBarteringPlayer);
  }

  public void decode(ByteBuf buf) {
    itemId = ItemIdEnum.values()[buf.readInt()];
    wasTargetingBarteringPlayer = buf.readBoolean();
  }
}
