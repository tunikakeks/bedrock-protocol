package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToastRequestPacket implements IPacket {
  private String title;

  private String content;

  public void encode(ByteBuf buf) {
    int __len_title = title != null ? title.length() : 0;
    if (title != null) buf.writeCharSequence(title, StandardCharsets.UTF_8);
    int __len_content = content != null ? content.length() : 0;
    if (content != null) buf.writeCharSequence(content, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_title = buf.readInt();
    title = buf.readCharSequence(__len_title, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_content = buf.readInt();
    content = buf.readCharSequence(__len_content, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 186;
  }
}
