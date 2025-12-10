package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameRule {
  private String ruleName;

  private Boolean ruleCanBeModified;

  private Object ruleValue;

  public void encode(ByteBuf buf) {
    int __len_ruleName = ruleName != null ? ruleName.length() : 0;
    if (ruleName != null) buf.writeCharSequence(ruleName, StandardCharsets.UTF_8);
    buf.writeBoolean(ruleCanBeModified);
    // unknown type for field ruleValue
  }

  public void decode(ByteBuf buf) {
    int __len_ruleName = buf.readInt();
    ruleName = buf.readCharSequence(__len_ruleName, java.nio.charset.StandardCharsets.UTF_8).toString();
    ruleCanBeModified = buf.readBoolean();
    // unknown type for field ruleValue
  }
}
