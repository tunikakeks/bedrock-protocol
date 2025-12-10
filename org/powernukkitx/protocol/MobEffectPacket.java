package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;
import org.powernukkitx.protocol.types.EventIDEnum;
import org.powernukkitx.protocol.types.MobEffectPacket_Event_IDEnum;
import org.powernukkitx.protocol.types.PlayerInputTick;

@Getter
@Setter
public class MobEffectPacket implements IPacket {
  private ActorRuntimeID targetRuntimeID;

  private MobEffectPacket_Event_IDEnum eventID;

  private Integer effectID;

  private Integer effectAmplifier;

  private Boolean showParticles;

  private Integer effectDurationTicks;

  private PlayerInputTick tick;

  private Boolean ambient;

  public void encode(ByteBuf buf) {
    targetRuntimeID.encode(buf);
    buf.writeByte(eventID.toByte());
    buf.writeInt(effectID);
    buf.writeInt(effectAmplifier);
    buf.writeBoolean(showParticles);
    buf.writeInt(effectDurationTicks);
    tick.encode(buf);
    buf.writeBoolean(ambient);
  }

  public void decode(ByteBuf buf) {
    targetRuntimeID = new ActorRuntimeID();
    targetRuntimeID.decode(buf);
    eventID = EventIDEnum.fromByte(buf.readUnsignedByte());
    effectID = buf.readInt();
    effectAmplifier = buf.readInt();
    showParticles = buf.readBoolean();
    effectDurationTicks = buf.readInt();
    tick = new PlayerInputTick();
    tick.decode(buf);
    ambient = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 28;
  }
}
