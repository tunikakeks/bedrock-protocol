package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types._4158325036;

@Getter
@Setter
public class AvailableActorIdentifiersPacket implements IPacket {
  private _4158325036 identifierList;

  public void encode(ByteBuf buf) {
    identifierList.encode(buf);
  }

  public void decode(ByteBuf buf) {
    identifierList = new _4158325036();
    identifierList.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 119;
  }
}
