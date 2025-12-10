package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AvailableCommandsPacketCommandData {
  private String name;

  private String description;

  private Integer flags;

  private AvailableCommandsPacketCommandData_Permission_LevelEnum permissionLevel;

  private Integer aliasEnum;

  private List<Integer> commanddataChainedSubcommandIndexes;

  private List<_2332778279> overloads;

  public void encode(ByteBuf buf) {
    int __len_name = name != null ? name.length() : 0;
    if (name != null) buf.writeCharSequence(name, StandardCharsets.UTF_8);
    int __len_description = description != null ? description.length() : 0;
    if (description != null) buf.writeCharSequence(description, StandardCharsets.UTF_8);
    buf.writeInt(flags);
    buf.writeByte(permissionLevel.toByte());
    buf.writeInt(aliasEnum);
    buf.writeInt(commanddataChainedSubcommandIndexes != null ? commanddataChainedSubcommandIndexes.size() : 0);
    if (commanddataChainedSubcommandIndexes != null) {
      for (var __v : commanddataChainedSubcommandIndexes) {
        buf.writeInt(__v);
      }
    }
    buf.writeInt(overloads != null ? overloads.size() : 0);
    if (overloads != null) {
      for (var __v : overloads) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __len_name = buf.readInt();
    name = buf.readCharSequence(__len_name, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_description = buf.readInt();
    description = buf.readCharSequence(__len_description, java.nio.charset.StandardCharsets.UTF_8).toString();
    flags = buf.readInt();
    permissionLevel = PermissionLevelEnum.fromByte(buf.readUnsignedByte());
    aliasEnum = buf.readInt();
    int __size_commanddataChainedSubcommandIndexes = buf.readInt();
    commanddataChainedSubcommandIndexes = new java.util.ArrayList<>(__size_commanddataChainedSubcommandIndexes);
    for (int i = 0; i < __size_commanddataChainedSubcommandIndexes; i++) {
      commanddataChainedSubcommandIndexes.add(buf.readInt());
    }
    int __size_overloads = buf.readInt();
    overloads = new java.util.ArrayList<>(__size_overloads);
    for (int i = 0; i < __size_overloads; i++) {
      _2332778279 v = new _2332778279();
      v.decode(buf);
      overloads.add(v);
    }
  }
}
