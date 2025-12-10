package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EducationLocalLevelSettings {
  private String codeBuilderOverrideUri;

  public void encode(ByteBuf buf) {
    int __len_codeBuilderOverrideUri = codeBuilderOverrideUri != null ? codeBuilderOverrideUri.length() : 0;
    if (codeBuilderOverrideUri != null) buf.writeCharSequence(codeBuilderOverrideUri, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_codeBuilderOverrideUri = buf.readInt();
    codeBuilderOverrideUri = buf.readCharSequence(__len_codeBuilderOverrideUri, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
