package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddBehaviorTreePacket implements IPacket {
  private String behaviorTreeStructureJSON;

  public void encode(ByteBuf buf) {
    int __len_behaviorTreeStructureJSON = behaviorTreeStructureJSON != null ? behaviorTreeStructureJSON.length() : 0;
    if (behaviorTreeStructureJSON != null) buf.writeCharSequence(behaviorTreeStructureJSON, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_behaviorTreeStructureJSON = buf.readInt();
    behaviorTreeStructureJSON = buf.readCharSequence(__len_behaviorTreeStructureJSON, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 89;
  }
}
