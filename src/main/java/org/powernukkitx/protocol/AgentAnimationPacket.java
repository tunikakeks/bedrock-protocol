package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;
import org.powernukkitx.protocol.types.AgentAnimationEnum;
import org.powernukkitx.protocol.types.AgentAnimationPacket_Agent_AnimationEnum;

@Getter
@Setter
public class AgentAnimationPacket implements IPacket {
  private AgentAnimationPacket_Agent_AnimationEnum agentAnimation;

  private ActorRuntimeID runtimeId;

  public void encode(ByteBuf buf) {
    buf.writeInt(agentAnimation.ordinal());
    runtimeId.encode(buf);
  }

  public void decode(ByteBuf buf) {
    agentAnimation = AgentAnimationEnum.values()[buf.readInt()];
    runtimeId = new ActorRuntimeID();
    runtimeId.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 304;
  }
}
