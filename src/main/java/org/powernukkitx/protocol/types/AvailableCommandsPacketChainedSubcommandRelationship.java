package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AvailableCommandsPacketChainedSubcommandRelationship {
  private Integer subcommandFirstValue;

  private Integer subcommandSecondValue;

  public void encode(ByteBuf buf) {
    buf.writeInt(subcommandFirstValue);
    buf.writeInt(subcommandSecondValue);
  }

  public void decode(ByteBuf buf) {
    subcommandFirstValue = buf.readInt();
    subcommandSecondValue = buf.readInt();
  }
}
