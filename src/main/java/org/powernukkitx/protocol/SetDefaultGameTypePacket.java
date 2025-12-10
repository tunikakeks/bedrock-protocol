package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.DefaultGameTypeEnum;
import org.powernukkitx.protocol.types.SetDefaultGameTypePacket_Default_Game_TypeEnum;

@Getter
@Setter
public class SetDefaultGameTypePacket implements IPacket {
  private SetDefaultGameTypePacket_Default_Game_TypeEnum defaultGameType;

  public void encode(ByteBuf buf) {
    buf.writeInt(defaultGameType.ordinal());
  }

  public void decode(ByteBuf buf) {
    defaultGameType = DefaultGameTypeEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 105;
  }
}
