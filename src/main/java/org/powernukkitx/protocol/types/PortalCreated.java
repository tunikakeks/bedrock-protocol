package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortalCreated {
  private PortalCreated_Dimension_IDEnum dimensionID;

  public void encode(ByteBuf buf) {
    buf.writeInt(dimensionID.ordinal());
  }

  public void decode(ByteBuf buf) {
    dimensionID = DimensionIDEnum.values()[buf.readInt()];
  }
}
