package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgentCapabilities {
  private Boolean canModifyBlocks;

  public void encode(ByteBuf buf) {
    buf.writeBoolean(canModifyBlocks);
  }

  public void decode(ByteBuf buf) {
    canModifyBlocks = buf.readBoolean();
  }
}
