package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NetworkStackLatencyPacket implements IPacket {
  private Long creationTime;

  private Boolean isFromServer;

  public void encode(ByteBuf buf) {
    buf.writeLong(creationTime);
    buf.writeBoolean(isFromServer);
  }

  public void decode(ByteBuf buf) {
    creationTime = buf.readLong();
    isFromServer = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 115;
  }
}
