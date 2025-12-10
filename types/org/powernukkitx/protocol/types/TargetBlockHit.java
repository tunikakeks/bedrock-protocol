package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TargetBlockHit {
  private Integer redstoneLevel;

  public void encode(ByteBuf buf) {
    buf.writeInt(redstoneLevel);
  }

  public void decode(ByteBuf buf) {
    redstoneLevel = buf.readInt();
  }
}
