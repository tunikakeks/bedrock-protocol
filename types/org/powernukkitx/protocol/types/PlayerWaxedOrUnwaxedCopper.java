package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerWaxedOrUnwaxedCopper {
  private Integer playerWaxedOrUnwaxedCopperBlockID;

  public void encode(ByteBuf buf) {
    buf.writeInt(playerWaxedOrUnwaxedCopperBlockID);
  }

  public void decode(ByteBuf buf) {
    playerWaxedOrUnwaxedCopperBlockID = buf.readInt();
  }
}
