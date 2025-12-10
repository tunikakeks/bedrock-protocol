package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortalUsed {
  private Integer sourceDimensionID;

  private Integer targetDimensionID;

  public void encode(ByteBuf buf) {
    buf.writeInt(sourceDimensionID);
    buf.writeInt(targetDimensionID);
  }

  public void decode(ByteBuf buf) {
    sourceDimensionID = buf.readInt();
    targetDimensionID = buf.readInt();
  }
}
