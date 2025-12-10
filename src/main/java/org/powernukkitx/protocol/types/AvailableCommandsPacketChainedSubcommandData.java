package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AvailableCommandsPacketChainedSubcommandData {
  private String name;

  private List<AvailableCommandsPacketChainedSubcommandRelationship> subcommandValues;

  public void encode(ByteBuf buf) {
    int __len_name = name != null ? name.length() : 0;
    if (name != null) buf.writeCharSequence(name, StandardCharsets.UTF_8);
    buf.writeInt(subcommandValues != null ? subcommandValues.size() : 0);
    if (subcommandValues != null) {
      for (var __v : subcommandValues) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __len_name = buf.readInt();
    name = buf.readCharSequence(__len_name, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __size_subcommandValues = buf.readInt();
    subcommandValues = new java.util.ArrayList<>(__size_subcommandValues);
    for (int i = 0; i < __size_subcommandValues; i++) {
      AvailableCommandsPacketChainedSubcommandRelationship v = new AvailableCommandsPacketChainedSubcommandRelationship();
      v.decode(buf);
      subcommandValues.add(v);
    }
  }
}
