package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.Vec3;

@Getter
@Setter
public class UpdateClientInputLocksPacket implements IPacket {
  private Integer inputLockComponentData;

  private Vec3 serverPos;

  public void encode(ByteBuf buf) {
    buf.writeInt(inputLockComponentData);
    serverPos.encode(buf);
  }

  public void decode(ByteBuf buf) {
    inputLockComponentData = buf.readInt();
    serverPos = new Vec3();
    serverPos.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 196;
  }
}
