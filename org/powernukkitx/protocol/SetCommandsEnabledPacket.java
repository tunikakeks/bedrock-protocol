package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetCommandsEnabledPacket implements IPacket {
  private Boolean commandsEnabled;

  public void encode(ByteBuf buf) {
    buf.writeBoolean(commandsEnabled);
  }

  public void decode(ByteBuf buf) {
    commandsEnabled = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 59;
  }
}
