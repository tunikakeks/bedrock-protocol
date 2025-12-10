package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EduSharedUriResource {
  private String buttonName;

  private String linkUri;

  public void encode(ByteBuf buf) {
    int __len_buttonName = buttonName != null ? buttonName.length() : 0;
    if (buttonName != null) buf.writeCharSequence(buttonName, StandardCharsets.UTF_8);
    int __len_linkUri = linkUri != null ? linkUri.length() : 0;
    if (linkUri != null) buf.writeCharSequence(linkUri, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_buttonName = buf.readInt();
    buttonName = buf.readCharSequence(__len_buttonName, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_linkUri = buf.readInt();
    linkUri = buf.readCharSequence(__len_linkUri, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
