package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.Struct_WebSocketPacketData;

@Getter
@Setter
public class AutomationClientConnectPacket implements IPacket {
  private Struct_WebSocketPacketData webSocketData;

  public void encode(ByteBuf buf) {
    webSocketData.encode(buf);
  }

  public void decode(ByteBuf buf) {
    webSocketData = new Struct_WebSocketPacketData();
    webSocketData.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 95;
  }
}
