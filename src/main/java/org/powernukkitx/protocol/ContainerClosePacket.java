package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ContainerClosePacket_Container_IdEnum;
import org.powernukkitx.protocol.types.ContainerIdEnum;

@Getter
@Setter
public class ContainerClosePacket implements IPacket {
  private ContainerClosePacket_Container_IdEnum containerId;

  private Integer containerType;

  private Boolean serverInitiatedClose;

  public void encode(ByteBuf buf) {
    buf.writeInt(containerId.ordinal());
    buf.writeInt(containerType);
    buf.writeBoolean(serverInitiatedClose);
  }

  public void decode(ByteBuf buf) {
    containerId = ContainerIdEnum.values()[buf.readInt()];
    containerType = buf.readInt();
    serverInitiatedClose = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 47;
  }
}
