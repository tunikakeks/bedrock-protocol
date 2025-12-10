package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import java.lang.Object;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Struct_ShapeDataPayload {
  private Struct_ShapeDataPayload_NetworkIdEnum networkid;

  private Struct_ShapeDataPayload_Shape_TypeEnum shapeType;

  private Vec3 location;

  private Double scale;

  private Vec3 rotation;

  private Double totalTimeLeft;

  private _1315424487 color;

  private DimensionType dimensionID;

  private Object extraShapeData;

  public void encode(ByteBuf buf) {
    buf.writeInt(networkid.ordinal());
    buf.writeInt(shapeType.ordinal());
    location.encode(buf);
    buf.writeDouble(scale);
    rotation.encode(buf);
    buf.writeDouble(totalTimeLeft);
    color.encode(buf);
    dimensionID.encode(buf);
    // unknown type for field extraShapeData
  }

  public void decode(ByteBuf buf) {
    networkid = NetworkidEnum.values()[buf.readInt()];
    shapeType = ShapeTypeEnum.values()[buf.readInt()];
    location = new Vec3();
    location.decode(buf);
    scale = buf.readDouble();
    rotation = new Vec3();
    rotation.decode(buf);
    totalTimeLeft = buf.readDouble();
    color = new _1315424487();
    color.decode(buf);
    dimensionID = new DimensionType();
    dimensionID.decode(buf);
    // unknown type for field extraShapeData
  }
}
