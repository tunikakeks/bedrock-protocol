package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorUniqueID;
import org.powernukkitx.protocol.types.Class_MolangVariableMap;
import org.powernukkitx.protocol.types.Vec3;

@Getter
@Setter
public class SpawnParticleEffectPacket implements IPacket {
  private Integer dimensionId;

  private ActorUniqueID actorId;

  private Vec3 position;

  private String effectName;

  private Class_MolangVariableMap molangVariables;

  public void encode(ByteBuf buf) {
    buf.writeInt(dimensionId);
    actorId.encode(buf);
    position.encode(buf);
    int __len_effectName = effectName != null ? effectName.length() : 0;
    if (effectName != null) buf.writeCharSequence(effectName, StandardCharsets.UTF_8);
    molangVariables.encode(buf);
  }

  public void decode(ByteBuf buf) {
    dimensionId = buf.readInt();
    actorId = new ActorUniqueID();
    actorId.decode(buf);
    position = new Vec3();
    position.decode(buf);
    int __len_effectName = buf.readInt();
    effectName = buf.readCharSequence(__len_effectName, java.nio.charset.StandardCharsets.UTF_8).toString();
    molangVariables = new Class_MolangVariableMap();
    molangVariables.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 118;
  }
}
