package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;
import org.powernukkitx.protocol.types.PlayerInputTick;
import org.powernukkitx.protocol.types.Vec3;

@Getter
@Setter
public class SetActorMotionPacket implements IPacket {
  private ActorRuntimeID targetRuntimeID;

  private Vec3 motion;

  private PlayerInputTick tick;

  public void encode(ByteBuf buf) {
    targetRuntimeID.encode(buf);
    motion.encode(buf);
    tick.encode(buf);
  }

  public void decode(ByteBuf buf) {
    targetRuntimeID = new ActorRuntimeID();
    targetRuntimeID.decode(buf);
    motion = new Vec3();
    motion.decode(buf);
    tick = new PlayerInputTick();
    tick.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 40;
  }
}
