package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.Class_MoveActorAbsoluteData;

@Getter
@Setter
public class MoveActorAbsolutePacket implements IPacket {
  private Class_MoveActorAbsoluteData moveData;

  public void encode(ByteBuf buf) {
    moveData.encode(buf);
  }

  public void decode(ByteBuf buf) {
    moveData = new Class_MoveActorAbsoluteData();
    moveData.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 18;
  }
}
