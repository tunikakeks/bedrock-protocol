package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Long;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerInputTick {
  private Long inputTick;

  public void encode(ByteBuf buf) {
    buf.writeLong(inputTick);
  }

  public void decode(ByteBuf buf) {
    inputTick = buf.readLong();
  }
}
