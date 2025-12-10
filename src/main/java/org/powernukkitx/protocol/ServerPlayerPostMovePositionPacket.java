package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.Vec3;

@Getter
@Setter
public class ServerPlayerPostMovePositionPacket implements IPacket {
  private Vec3 pos;

  public void encode(ByteBuf buf) {
    pos.encode(buf);
  }

  public void decode(ByteBuf buf) {
    pos = new Vec3();
    pos.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 16;
  }
}
