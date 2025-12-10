package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExternalLinkSettings {
  private String url;

  private String displayName;

  public void encode(ByteBuf buf) {
    int __len_url = url != null ? url.length() : 0;
    if (url != null) buf.writeCharSequence(url, StandardCharsets.UTF_8);
    int __len_displayName = displayName != null ? displayName.length() : 0;
    if (displayName != null) buf.writeCharSequence(displayName, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_url = buf.readInt();
    url = buf.readCharSequence(__len_url, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_displayName = buf.readInt();
    displayName = buf.readCharSequence(__len_displayName, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
