package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortalUsed {
  private PortalUsed_Source_Dimension_IDEnum sourceDimensionID;

  private PortalUsed_Target_Dimension_IDEnum targetDimensionID;

  public void encode(ByteBuf buf) {
    buf.writeInt(sourceDimensionID.ordinal());
    buf.writeInt(targetDimensionID.ordinal());
  }

  public void decode(ByteBuf buf) {
    sourceDimensionID = SourceDimensionIDEnum.values()[buf.readInt()];
    targetDimensionID = TargetDimensionIDEnum.values()[buf.readInt()];
  }
}
