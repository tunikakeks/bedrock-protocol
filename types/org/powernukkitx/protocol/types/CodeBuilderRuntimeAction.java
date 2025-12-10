package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CodeBuilderRuntimeAction {
  private String codebuilderRuntimeAction;

  public void encode(ByteBuf buf) {
    int __len_codebuilderRuntimeAction = codebuilderRuntimeAction != null ? codebuilderRuntimeAction.length() : 0;
    if (codebuilderRuntimeAction != null) buf.writeCharSequence(codebuilderRuntimeAction, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_codebuilderRuntimeAction = buf.readInt();
    codebuilderRuntimeAction = buf.readCharSequence(__len_codebuilderRuntimeAction, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
