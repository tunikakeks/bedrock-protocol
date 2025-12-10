package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScriptMessagePacket implements IPacket {
  private String messageId;

  private String messageValue;

  public void encode(ByteBuf buf) {
    int __len_messageId = messageId != null ? messageId.length() : 0;
    if (messageId != null) buf.writeCharSequence(messageId, StandardCharsets.UTF_8);
    int __len_messageValue = messageValue != null ? messageValue.length() : 0;
    if (messageValue != null) buf.writeCharSequence(messageValue, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_messageId = buf.readInt();
    messageId = buf.readCharSequence(__len_messageId, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_messageValue = buf.readInt();
    messageValue = buf.readCharSequence(__len_messageValue, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 177;
  }
}
