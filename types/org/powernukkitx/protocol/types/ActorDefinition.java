package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActorDefinition {
  private String eventName;

  public void encode(ByteBuf buf) {
    int __len_eventName = eventName != null ? eventName.length() : 0;
    if (eventName != null) buf.writeCharSequence(eventName, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_eventName = buf.readInt();
    eventName = buf.readCharSequence(__len_eventName, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
