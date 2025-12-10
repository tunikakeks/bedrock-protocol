package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PiglinBarter {
  private Integer itemId;

  private Boolean wasTargetingBarteringPlayer;

  public void encode(ByteBuf buf) {
    buf.writeInt(itemId);
    buf.writeBoolean(wasTargetingBarteringPlayer);
  }

  public void decode(ByteBuf buf) {
    itemId = buf.readInt();
    wasTargetingBarteringPlayer = buf.readBoolean();
  }
}
