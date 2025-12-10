package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Struct_WebSocketPacketData {
  private String websocketServerURI;

  public void encode(ByteBuf buf) {
    int __len_websocketServerURI = websocketServerURI != null ? websocketServerURI.length() : 0;
    if (websocketServerURI != null) buf.writeCharSequence(websocketServerURI, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_websocketServerURI = buf.readInt();
    websocketServerURI = buf.readCharSequence(__len_websocketServerURI, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
