package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerWaxedOrUnwaxedCopper {
  private PlayerWaxedOrUnwaxedCopper_Player_Waxed_or_Unwaxed_Copper_Block_IDEnum playerWaxedOrUnwaxedCopperBlockID;

  public void encode(ByteBuf buf) {
    buf.writeInt(playerWaxedOrUnwaxedCopperBlockID.ordinal());
  }

  public void decode(ByteBuf buf) {
    playerWaxedOrUnwaxedCopperBlockID = PlayerWaxedOrUnwaxedCopperBlockIDEnum.values()[buf.readInt()];
  }
}
