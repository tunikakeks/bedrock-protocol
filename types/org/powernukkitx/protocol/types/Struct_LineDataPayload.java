package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Struct_LineDataPayload {
  private Vec3 lineEndLocation;

  public void encode(ByteBuf buf) {
    lineEndLocation.encode(buf);
  }

  public void decode(ByteBuf buf) {
    lineEndLocation = new Vec3();
    lineEndLocation.decode(buf);
  }
}
