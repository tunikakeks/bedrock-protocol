package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FullContainerName {
  private FullContainerName_Container_NameEnum containerName;

  private Integer dynamicID;

  public void encode(ByteBuf buf) {
    buf.writeByte(containerName.toByte());
    buf.writeInt(dynamicID);
  }

  public void decode(ByteBuf buf) {
    containerName = ContainerNameEnum.fromByte(buf.readUnsignedByte());
    dynamicID = buf.readInt();
  }
}
