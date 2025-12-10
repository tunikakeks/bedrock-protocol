package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorUniqueID;
import org.powernukkitx.protocol.types.PlayerGameTypeEnum;
import org.powernukkitx.protocol.types.PlayerInputTick;
import org.powernukkitx.protocol.types.UpdatePlayerGameTypePacket_Player_Game_TypeEnum;

@Getter
@Setter
public class UpdatePlayerGameTypePacket implements IPacket {
  private UpdatePlayerGameTypePacket_Player_Game_TypeEnum playerGameType;

  private ActorUniqueID targetPlayer;

  private PlayerInputTick tick;

  public void encode(ByteBuf buf) {
    buf.writeByte(playerGameType.toByte());
    targetPlayer.encode(buf);
    tick.encode(buf);
  }

  public void decode(ByteBuf buf) {
    playerGameType = PlayerGameTypeEnum.fromByte(buf.readUnsignedByte());
    targetPlayer = new ActorUniqueID();
    targetPlayer.decode(buf);
    tick = new PlayerInputTick();
    tick.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 151;
  }
}
