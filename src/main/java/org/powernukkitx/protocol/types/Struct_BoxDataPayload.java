package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Struct_BoxDataPayload {
  private Vec3 boxBound;

  public void encode(ByteBuf buf) {
    boxBound.encode(buf);
  }

  public void decode(ByteBuf buf) {
    boxBound = new Vec3();
    boxBound.decode(buf);
  }
}
