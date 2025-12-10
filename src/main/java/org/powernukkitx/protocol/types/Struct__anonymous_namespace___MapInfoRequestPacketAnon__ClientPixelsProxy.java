package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Struct__anonymous_namespace___MapInfoRequestPacketAnon__ClientPixelsProxy {
  private Integer pixel;

  private Integer index;

  public void encode(ByteBuf buf) {
    buf.writeInt(pixel);
    buf.writeInt(index);
  }

  public void decode(ByteBuf buf) {
    pixel = buf.readInt();
    index = buf.readInt();
  }
}
