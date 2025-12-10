package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Struct_SphereDataPayload {
  private Integer numSegments;

  public void encode(ByteBuf buf) {
    buf.writeInt(numSegments);
  }

  public void decode(ByteBuf buf) {
    numSegments = buf.readInt();
  }
}
