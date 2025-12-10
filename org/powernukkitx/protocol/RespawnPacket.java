package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;
import org.powernukkitx.protocol.types.RespawnPacket_StateEnum;
import org.powernukkitx.protocol.types.StateEnum;
import org.powernukkitx.protocol.types.Vec3;

@Getter
@Setter
public class RespawnPacket implements IPacket {
  private Vec3 position;

  private RespawnPacket_StateEnum state;

  private ActorRuntimeID playerRuntimeId;

  public void encode(ByteBuf buf) {
    position.encode(buf);
    buf.writeByte(state.toByte());
    playerRuntimeId.encode(buf);
  }

  public void decode(ByteBuf buf) {
    position = new Vec3();
    position.decode(buf);
    state = StateEnum.fromByte(buf.readUnsignedByte());
    playerRuntimeId = new ActorRuntimeID();
    playerRuntimeId.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 45;
  }
}
