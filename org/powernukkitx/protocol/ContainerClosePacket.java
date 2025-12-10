package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContainerClosePacket implements IPacket {
  private Integer containerId;

  private Integer containerType;

  private Boolean serverInitiatedClose;

  public void encode(ByteBuf buf) {
    buf.writeInt(containerId);
    buf.writeInt(containerType);
    buf.writeBoolean(serverInitiatedClose);
  }

  public void decode(ByteBuf buf) {
    containerId = buf.readInt();
    containerType = buf.readInt();
    serverInitiatedClose = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 47;
  }
}
