package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChunkPos {
  private Integer x;

  private Integer z;

  public void encode(ByteBuf buf) {
    buf.writeInt(x);
    buf.writeInt(z);
  }

  public void decode(ByteBuf buf) {
    x = buf.readInt();
    z = buf.readInt();
  }
}
