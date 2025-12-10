package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PositionTrackingId {
  private Integer value;

  public void encode(ByteBuf buf) {
    buf.writeInt(value);
  }

  public void decode(ByteBuf buf) {
    value = buf.readInt();
  }
}
