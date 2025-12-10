package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.Struct_ActorLink;

@Getter
@Setter
public class SetActorLinkPacket implements IPacket {
  private Struct_ActorLink link;

  public void encode(ByteBuf buf) {
    link.encode(buf);
  }

  public void decode(ByteBuf buf) {
    link = new Struct_ActorLink();
    link.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 41;
  }
}
