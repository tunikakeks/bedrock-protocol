package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Struct_ArrowDataPayload {
  private Vec3 arrowEndLocation;

  private Double arrowHeadLength;

  private Double arrowHeadRadius;

  private Integer numSegments;

  public void encode(ByteBuf buf) {
    arrowEndLocation.encode(buf);
    buf.writeDouble(arrowHeadLength);
    buf.writeDouble(arrowHeadRadius);
    buf.writeInt(numSegments);
  }

  public void decode(ByteBuf buf) {
    arrowEndLocation = new Vec3();
    arrowEndLocation.decode(buf);
    arrowHeadLength = buf.readDouble();
    arrowHeadRadius = buf.readDouble();
    numSegments = buf.readInt();
  }
}
