package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ContainerIDEnum;
import org.powernukkitx.protocol.types.ContainerSetDataPacket_Container_IDEnum;
import org.powernukkitx.protocol.types.ContainerSetDataPacket_IDEnum;
import org.powernukkitx.protocol.types.IdEnum;

@Getter
@Setter
public class ContainerSetDataPacket implements IPacket {
  private ContainerSetDataPacket_Container_IDEnum containerID;

  private ContainerSetDataPacket_IDEnum id;

  private Integer value;

  public void encode(ByteBuf buf) {
    buf.writeInt(containerID.ordinal());
    buf.writeInt(id.ordinal());
    buf.writeInt(value);
  }

  public void decode(ByteBuf buf) {
    containerID = ContainerIDEnum.values()[buf.readInt()];
    id = IdEnum.values()[buf.readInt()];
    value = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 51;
  }
}
