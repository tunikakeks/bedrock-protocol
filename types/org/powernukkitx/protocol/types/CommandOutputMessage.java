package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommandOutputMessage {
  private String messageID;

  private Boolean successful;

  private List<String> parameters;

  public void encode(ByteBuf buf) {
    int __len_messageID = messageID != null ? messageID.length() : 0;
    if (messageID != null) buf.writeCharSequence(messageID, StandardCharsets.UTF_8);
    buf.writeBoolean(successful);
    buf.writeInt(parameters != null ? parameters.size() : 0);
    if (parameters != null) {
      for (var __v : parameters) {
        buf.writeInt(__v != null ? __v.length() : 0);
        if (__v != null) buf.writeCharSequence(__v, StandardCharsets.UTF_8);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __len_messageID = buf.readInt();
    messageID = buf.readCharSequence(__len_messageID, java.nio.charset.StandardCharsets.UTF_8).toString();
    successful = buf.readBoolean();
    int __size_parameters = buf.readInt();
    parameters = new java.util.ArrayList<>(__size_parameters);
    for (int i = 0; i < __size_parameters; i++) {
      int __len_parameters_item = buf.readInt();
      parameters.add(buf.readCharSequence(__len_parameters_item, java.nio.charset.StandardCharsets.UTF_8).toString());
    }
  }
}
