package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FullContainerName {
  private FullContainerName_Container_NameEnum containerName;

  private FullContainerName_Dynamic_IDEnum dynamicID;

  public void encode(ByteBuf buf) {
    buf.writeInt(containerName.ordinal());
    buf.writeInt(dynamicID.ordinal());
  }

  public void decode(ByteBuf buf) {
    containerName = ContainerNameEnum.values()[buf.readInt()];
    dynamicID = DynamicIDEnum.values()[buf.readInt()];
  }
}
