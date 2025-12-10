package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NetworkBlockPosition {
  private Integer x;

  private Integer y;

  private Integer z;

  public void encode(ByteBuf buf) {
    buf.writeInt(x);
    buf.writeInt(y);
    buf.writeInt(z);
  }

  public void decode(ByteBuf buf) {
    x = buf.readInt();
    y = buf.readInt();
    z = buf.readInt();
  }
}
