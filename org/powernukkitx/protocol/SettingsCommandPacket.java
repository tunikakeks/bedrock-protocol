package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SettingsCommandPacket implements IPacket {
  private String command;

  private Boolean suppressOutput;

  public void encode(ByteBuf buf) {
    int __len_command = command != null ? command.length() : 0;
    if (command != null) buf.writeCharSequence(command, StandardCharsets.UTF_8);
    buf.writeBoolean(suppressOutput);
  }

  public void decode(ByteBuf buf) {
    int __len_command = buf.readInt();
    command = buf.readCharSequence(__len_command, java.nio.charset.StandardCharsets.UTF_8).toString();
    suppressOutput = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 140;
  }
}
