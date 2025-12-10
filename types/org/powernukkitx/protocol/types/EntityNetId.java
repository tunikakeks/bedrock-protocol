package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntityNetId {
  private Integer rawId;

  public void encode(ByteBuf buf) {
    buf.writeInt(rawId);
  }

  public void decode(ByteBuf buf) {
    rawId = buf.readInt();
  }
}
