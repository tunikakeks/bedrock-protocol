package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.CommandOriginData;
import org.powernukkitx.protocol.types.CommandOutput;

@Getter
@Setter
public class CommandOutputPacket implements IPacket {
  private CommandOriginData originData;

  private CommandOutput output;

  public void encode(ByteBuf buf) {
    originData.encode(buf);
    output.encode(buf);
  }

  public void decode(ByteBuf buf) {
    originData = new CommandOriginData();
    originData.decode(buf);
    output = new CommandOutput();
    output.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 79;
  }
}
