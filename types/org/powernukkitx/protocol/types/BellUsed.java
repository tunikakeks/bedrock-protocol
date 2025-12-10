package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BellUsed {
  private Integer itemId;

  public void encode(ByteBuf buf) {
    buf.writeInt(itemId);
  }

  public void decode(ByteBuf buf) {
    itemId = buf.readInt();
  }
}
