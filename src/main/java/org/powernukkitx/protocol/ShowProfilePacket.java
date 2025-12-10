package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowProfilePacket implements IPacket {
  private String playerXUID;

  public void encode(ByteBuf buf) {
    int __len_playerXUID = playerXUID != null ? playerXUID.length() : 0;
    if (playerXUID != null) buf.writeCharSequence(playerXUID, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_playerXUID = buf.readInt();
    playerXUID = buf.readCharSequence(__len_playerXUID, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 104;
  }
}
