package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServerStatsPacket implements IPacket {
  private Double servertime;

  private Double networktime;

  public void encode(ByteBuf buf) {
    buf.writeDouble(servertime);
    buf.writeDouble(networktime);
  }

  public void decode(ByteBuf buf) {
    servertime = buf.readDouble();
    networktime = buf.readDouble();
  }

  @Override
  public int getPacketId() {
    return 192;
  }
}
