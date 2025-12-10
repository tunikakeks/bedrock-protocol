package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;
import org.powernukkitx.protocol.types.EffectIDEnum;
import org.powernukkitx.protocol.types.MovementEffectPacket_Effect_IDEnum;
import org.powernukkitx.protocol.types.PlayerInputTick;

@Getter
@Setter
public class MovementEffectPacket implements IPacket {
  private ActorRuntimeID targetRuntimeID;

  private MovementEffectPacket_Effect_IDEnum effectID;

  private Integer effectDuration;

  private PlayerInputTick tick;

  public void encode(ByteBuf buf) {
    targetRuntimeID.encode(buf);
    buf.writeInt(effectID.ordinal());
    buf.writeInt(effectDuration);
    tick.encode(buf);
  }

  public void decode(ByteBuf buf) {
    targetRuntimeID = new ActorRuntimeID();
    targetRuntimeID.decode(buf);
    effectID = EffectIDEnum.values()[buf.readInt()];
    effectDuration = buf.readInt();
    tick = new PlayerInputTick();
    tick.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 318;
  }
}
