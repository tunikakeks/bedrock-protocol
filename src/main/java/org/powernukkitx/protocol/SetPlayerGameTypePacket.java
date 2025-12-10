package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.PlayerGameTypeEnum;
import org.powernukkitx.protocol.types.SetPlayerGameTypePacket_Player_Game_TypeEnum;

@Getter
@Setter
public class SetPlayerGameTypePacket implements IPacket {
  private SetPlayerGameTypePacket_Player_Game_TypeEnum playerGameType;

  public void encode(ByteBuf buf) {
    buf.writeInt(playerGameType.ordinal());
  }

  public void decode(ByteBuf buf) {
    playerGameType = PlayerGameTypeEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 62;
  }
}
