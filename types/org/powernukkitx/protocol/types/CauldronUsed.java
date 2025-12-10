package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CauldronUsed {
  private Integer contentsColor;

  private Integer contentsType;

  private Integer fillLevel;

  public void encode(ByteBuf buf) {
    buf.writeInt(contentsColor);
    buf.writeInt(contentsType);
    buf.writeInt(fillLevel);
  }

  public void decode(ByteBuf buf) {
    contentsColor = buf.readInt();
    contentsType = buf.readInt();
    fillLevel = buf.readInt();
  }
}
