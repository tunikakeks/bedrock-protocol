package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__SplineInstruction {
  private Double totaltime;

  private Integer type;

  private List<Vec3> curve;

  private List<Vec2> progresskeyframes;

  private List<_3609314310> rotationoption;

  public void encode(ByteBuf buf) {
    buf.writeDouble(totaltime);
    buf.writeInt(type);
    buf.writeInt(curve != null ? curve.size() : 0);
    if (curve != null) {
      for (var __v : curve) {
        __v.encode(buf);
      }
    }
    buf.writeInt(progresskeyframes != null ? progresskeyframes.size() : 0);
    if (progresskeyframes != null) {
      for (var __v : progresskeyframes) {
        __v.encode(buf);
      }
    }
    buf.writeInt(rotationoption != null ? rotationoption.size() : 0);
    if (rotationoption != null) {
      for (var __v : rotationoption) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    totaltime = buf.readDouble();
    type = buf.readInt();
    int __size_curve = buf.readInt();
    curve = new java.util.ArrayList<>(__size_curve);
    for (int i = 0; i < __size_curve; i++) {
      Vec3 v = new Vec3();
      v.decode(buf);
      curve.add(v);
    }
    int __size_progresskeyframes = buf.readInt();
    progresskeyframes = new java.util.ArrayList<>(__size_progresskeyframes);
    for (int i = 0; i < __size_progresskeyframes; i++) {
      Vec2 v = new Vec2();
      v.decode(buf);
      progresskeyframes.add(v);
    }
    int __size_rotationoption = buf.readInt();
    rotationoption = new java.util.ArrayList<>(__size_rotationoption);
    for (int i = 0; i < __size_rotationoption; i++) {
      _3609314310 v = new _3609314310();
      v.decode(buf);
      rotationoption.add(v);
    }
  }
}
