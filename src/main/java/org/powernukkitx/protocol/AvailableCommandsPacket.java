package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.AvailableCommandsPacketChainedSubcommandData;
import org.powernukkitx.protocol.types.AvailableCommandsPacketCommandData;
import org.powernukkitx.protocol.types.AvailableCommandsPacketConstrainedValueData;
import org.powernukkitx.protocol.types.AvailableCommandsPacketEnumData;
import org.powernukkitx.protocol.types.AvailableCommandsPacketSoftEnumData;

@Getter
@Setter
public class AvailableCommandsPacket implements IPacket {
  private List<String> enumValues;

  private List<String> chainedSubcommandValues;

  private List<String> postFixes;

  private List<AvailableCommandsPacketEnumData> enumData;

  private List<AvailableCommandsPacketChainedSubcommandData> chainedSubcommandData;

  private List<AvailableCommandsPacketCommandData> commands;

  private List<AvailableCommandsPacketSoftEnumData> softEnums;

  private List<AvailableCommandsPacketConstrainedValueData> constraints;

  public void encode(ByteBuf buf) {
    buf.writeInt(enumValues != null ? enumValues.size() : 0);
    if (enumValues != null) {
      for (var __v : enumValues) {
        buf.writeInt(__v != null ? __v.length() : 0);
        if (__v != null) buf.writeCharSequence(__v, StandardCharsets.UTF_8);
      }
    }
    buf.writeInt(chainedSubcommandValues != null ? chainedSubcommandValues.size() : 0);
    if (chainedSubcommandValues != null) {
      for (var __v : chainedSubcommandValues) {
        buf.writeInt(__v != null ? __v.length() : 0);
        if (__v != null) buf.writeCharSequence(__v, StandardCharsets.UTF_8);
      }
    }
    buf.writeInt(postFixes != null ? postFixes.size() : 0);
    if (postFixes != null) {
      for (var __v : postFixes) {
        buf.writeInt(__v != null ? __v.length() : 0);
        if (__v != null) buf.writeCharSequence(__v, StandardCharsets.UTF_8);
      }
    }
    buf.writeInt(enumData != null ? enumData.size() : 0);
    if (enumData != null) {
      for (var __v : enumData) {
        __v.encode(buf);
      }
    }
    buf.writeInt(chainedSubcommandData != null ? chainedSubcommandData.size() : 0);
    if (chainedSubcommandData != null) {
      for (var __v : chainedSubcommandData) {
        __v.encode(buf);
      }
    }
    buf.writeInt(commands != null ? commands.size() : 0);
    if (commands != null) {
      for (var __v : commands) {
        __v.encode(buf);
      }
    }
    buf.writeInt(softEnums != null ? softEnums.size() : 0);
    if (softEnums != null) {
      for (var __v : softEnums) {
        __v.encode(buf);
      }
    }
    buf.writeInt(constraints != null ? constraints.size() : 0);
    if (constraints != null) {
      for (var __v : constraints) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __size_enumValues = buf.readInt();
    enumValues = new java.util.ArrayList<>(__size_enumValues);
    for (int i = 0; i < __size_enumValues; i++) {
      int __len_enumValues_item = buf.readInt();
      enumValues.add(buf.readCharSequence(__len_enumValues_item, java.nio.charset.StandardCharsets.UTF_8).toString());
    }
    int __size_chainedSubcommandValues = buf.readInt();
    chainedSubcommandValues = new java.util.ArrayList<>(__size_chainedSubcommandValues);
    for (int i = 0; i < __size_chainedSubcommandValues; i++) {
      int __len_chainedSubcommandValues_item = buf.readInt();
      chainedSubcommandValues.add(buf.readCharSequence(__len_chainedSubcommandValues_item, java.nio.charset.StandardCharsets.UTF_8).toString());
    }
    int __size_postFixes = buf.readInt();
    postFixes = new java.util.ArrayList<>(__size_postFixes);
    for (int i = 0; i < __size_postFixes; i++) {
      int __len_postFixes_item = buf.readInt();
      postFixes.add(buf.readCharSequence(__len_postFixes_item, java.nio.charset.StandardCharsets.UTF_8).toString());
    }
    int __size_enumData = buf.readInt();
    enumData = new java.util.ArrayList<>(__size_enumData);
    for (int i = 0; i < __size_enumData; i++) {
      AvailableCommandsPacketEnumData v = new AvailableCommandsPacketEnumData();
      v.decode(buf);
      enumData.add(v);
    }
    int __size_chainedSubcommandData = buf.readInt();
    chainedSubcommandData = new java.util.ArrayList<>(__size_chainedSubcommandData);
    for (int i = 0; i < __size_chainedSubcommandData; i++) {
      AvailableCommandsPacketChainedSubcommandData v = new AvailableCommandsPacketChainedSubcommandData();
      v.decode(buf);
      chainedSubcommandData.add(v);
    }
    int __size_commands = buf.readInt();
    commands = new java.util.ArrayList<>(__size_commands);
    for (int i = 0; i < __size_commands; i++) {
      AvailableCommandsPacketCommandData v = new AvailableCommandsPacketCommandData();
      v.decode(buf);
      commands.add(v);
    }
    int __size_softEnums = buf.readInt();
    softEnums = new java.util.ArrayList<>(__size_softEnums);
    for (int i = 0; i < __size_softEnums; i++) {
      AvailableCommandsPacketSoftEnumData v = new AvailableCommandsPacketSoftEnumData();
      v.decode(buf);
      softEnums.add(v);
    }
    int __size_constraints = buf.readInt();
    constraints = new java.util.ArrayList<>(__size_constraints);
    for (int i = 0; i < __size_constraints; i++) {
      AvailableCommandsPacketConstrainedValueData v = new AvailableCommandsPacketConstrainedValueData();
      v.decode(buf);
      constraints.add(v);
    }
  }

  @Override
  public int getPacketId() {
    return 76;
  }
}
