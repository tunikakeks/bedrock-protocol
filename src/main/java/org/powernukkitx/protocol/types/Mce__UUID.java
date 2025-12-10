package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Long;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mce__UUID {
  private Long mostSignificantBits;

  private Long leastSignificantBits;

  public void encode(ByteBuf buf) {
    buf.writeLong(mostSignificantBits);
    buf.writeLong(leastSignificantBits);
  }

  public void decode(ByteBuf buf) {
    mostSignificantBits = buf.readLong();
    leastSignificantBits = buf.readLong();
  }
}
