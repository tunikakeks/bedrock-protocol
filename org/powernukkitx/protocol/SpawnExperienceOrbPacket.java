package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.Vec3;

@Getter
@Setter
public class SpawnExperienceOrbPacket implements IPacket {
  private Vec3 position;

  private Integer xpValue;

  public void encode(ByteBuf buf) {
    position.encode(buf);
    buf.writeInt(xpValue);
  }

  public void decode(ByteBuf buf) {
    position = new Vec3();
    position.decode(buf);
    xpValue = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 66;
  }
}
