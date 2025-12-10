package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActionEnum;
import org.powernukkitx.protocol.types.AgentActionEventPacket_ActionEnum;
import org.powernukkitx.protocol.types.Json__Value;

@Getter
@Setter
public class AgentActionEventPacket implements IPacket {
  private String requestId;

  private AgentActionEventPacket_ActionEnum action;

  private Json__Value response;

  public void encode(ByteBuf buf) {
    int __len_requestId = requestId != null ? requestId.length() : 0;
    if (requestId != null) buf.writeCharSequence(requestId, StandardCharsets.UTF_8);
    buf.writeInt(action.ordinal());
    response.encode(buf);
  }

  public void decode(ByteBuf buf) {
    int __len_requestId = buf.readInt();
    requestId = buf.readCharSequence(__len_requestId, java.nio.charset.StandardCharsets.UTF_8).toString();
    action = ActionEnum.values()[buf.readInt()];
    response = new Json__Value();
    response.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 181;
  }
}
