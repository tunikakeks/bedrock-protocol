package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestNetworkSettingsPacket implements IPacket {
  private Integer clientnetworkversion;

  public void encode(ByteBuf buf) {
    buf.writeInt(clientnetworkversion);
  }

  public void decode(ByteBuf buf) {
    clientnetworkversion = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 193;
  }
}
