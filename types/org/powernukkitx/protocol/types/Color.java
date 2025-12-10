package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Color {
  private Integer color;

  public void encode(ByteBuf buf) {
    buf.writeInt(color);
  }

  public void decode(ByteBuf buf) {
    color = buf.readInt();
  }
}
