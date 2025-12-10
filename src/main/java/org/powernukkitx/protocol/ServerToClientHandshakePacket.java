package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServerToClientHandshakePacket implements IPacket {
  private String handshakeWebToken;

  public void encode(ByteBuf buf) {
    int __len_handshakeWebToken = handshakeWebToken != null ? handshakeWebToken.length() : 0;
    if (handshakeWebToken != null) buf.writeCharSequence(handshakeWebToken, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_handshakeWebToken = buf.readInt();
    handshakeWebToken = buf.readCharSequence(__len_handshakeWebToken, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 3;
  }
}
