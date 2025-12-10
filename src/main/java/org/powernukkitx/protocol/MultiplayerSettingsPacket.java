package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.MultiplayerSettingsPacket_PacketTypeEnum;
import org.powernukkitx.protocol.types.PackettypeEnum;

@Getter
@Setter
public class MultiplayerSettingsPacket implements IPacket {
  private MultiplayerSettingsPacket_PacketTypeEnum packettype;

  public void encode(ByteBuf buf) {
    buf.writeInt(packettype.ordinal());
  }

  public void decode(ByteBuf buf) {
    packettype = PackettypeEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 139;
  }
}
