package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientCacheStatusPacket implements IPacket {
  private Boolean isCacheSupported;

  public void encode(ByteBuf buf) {
    buf.writeBoolean(isCacheSupported);
  }

  public void decode(ByteBuf buf) {
    isCacheSupported = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 129;
  }
}
