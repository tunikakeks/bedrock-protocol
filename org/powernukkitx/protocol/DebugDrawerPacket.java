package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.Struct_ShapeDataPayload;

@Getter
@Setter
public class DebugDrawerPacket implements IPacket {
  private List<Struct_ShapeDataPayload> arrayOfDebugShapesCanBeAMixOfNewUpdatedOrRemoved;

  public void encode(ByteBuf buf) {
    buf.writeInt(arrayOfDebugShapesCanBeAMixOfNewUpdatedOrRemoved != null ? arrayOfDebugShapesCanBeAMixOfNewUpdatedOrRemoved.size() : 0);
    if (arrayOfDebugShapesCanBeAMixOfNewUpdatedOrRemoved != null) {
      for (var __v : arrayOfDebugShapesCanBeAMixOfNewUpdatedOrRemoved) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __size_arrayOfDebugShapesCanBeAMixOfNewUpdatedOrRemoved = buf.readInt();
    arrayOfDebugShapesCanBeAMixOfNewUpdatedOrRemoved = new java.util.ArrayList<>(__size_arrayOfDebugShapesCanBeAMixOfNewUpdatedOrRemoved);
    for (int i = 0; i < __size_arrayOfDebugShapesCanBeAMixOfNewUpdatedOrRemoved; i++) {
      Struct_ShapeDataPayload v = new Struct_ShapeDataPayload();
      v.decode(buf);
      arrayOfDebugShapesCanBeAMixOfNewUpdatedOrRemoved.add(v);
    }
  }

  @Override
  public int getPacketId() {
    return 328;
  }
}
