package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActionEnum;
import org.powernukkitx.protocol.types.ActorRuntimeID;
import org.powernukkitx.protocol.types.InteractPacket_ActionEnum;
import org.powernukkitx.protocol.types.Vec3;

@Getter
@Setter
public class InteractPacket implements IPacket {
  private InteractPacket_ActionEnum action;

  private ActorRuntimeID targetRuntimeID;

  private Vec3 position;

  public void encode(ByteBuf buf) {
    buf.writeInt(action.ordinal());
    targetRuntimeID.encode(buf);
    position.encode(buf);
  }

  public void decode(ByteBuf buf) {
    action = ActionEnum.values()[buf.readInt()];
    targetRuntimeID = new ActorRuntimeID();
    targetRuntimeID.decode(buf);
    position = new Vec3();
    position.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 33;
  }
}
