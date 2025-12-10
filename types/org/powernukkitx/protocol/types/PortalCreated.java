package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortalCreated {
  private Integer dimensionID;

  public void encode(ByteBuf buf) {
    buf.writeInt(dimensionID);
  }

  public void decode(ByteBuf buf) {
    dimensionID = buf.readInt();
  }
}
