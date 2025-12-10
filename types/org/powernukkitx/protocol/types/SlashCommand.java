package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SlashCommand {
  private Integer successCount;

  private Integer errorCount;

  private String commandName;

  private String errorList;

  public void encode(ByteBuf buf) {
    buf.writeInt(successCount);
    buf.writeInt(errorCount);
    int __len_commandName = commandName != null ? commandName.length() : 0;
    if (commandName != null) buf.writeCharSequence(commandName, StandardCharsets.UTF_8);
    int __len_errorList = errorList != null ? errorList.length() : 0;
    if (errorList != null) buf.writeCharSequence(errorList, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    successCount = buf.readInt();
    errorCount = buf.readInt();
    int __len_commandName = buf.readInt();
    commandName = buf.readCharSequence(__len_commandName, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_errorList = buf.readInt();
    errorList = buf.readCharSequence(__len_errorList, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
