package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContainerSetDataPacket implements IPacket {
  private Integer containerID;

  private Integer id;

  private Integer value;

  public void encode(ByteBuf buf) {
    buf.writeInt(containerID);
    buf.writeInt(id);
    buf.writeInt(value);
  }

  public void decode(ByteBuf buf) {
    containerID = buf.readInt();
    id = buf.readInt();
    value = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 51;
  }
}
