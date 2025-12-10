package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Struct_TextDataPayload {
  private String text;

  public void encode(ByteBuf buf) {
    int __len_text = text != null ? text.length() : 0;
    if (text != null) buf.writeCharSequence(text, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_text = buf.readInt();
    text = buf.readCharSequence(__len_text, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
