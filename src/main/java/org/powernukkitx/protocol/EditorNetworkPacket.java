package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types._4158325036;

@Getter
@Setter
public class EditorNetworkPacket implements IPacket {
  private Boolean routeToManager;

  private _4158325036 binaryPayload;

  public void encode(ByteBuf buf) {
    buf.writeBoolean(routeToManager);
    binaryPayload.encode(buf);
  }

  public void decode(ByteBuf buf) {
    routeToManager = buf.readBoolean();
    binaryPayload = new _4158325036();
    binaryPayload.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 190;
  }
}
