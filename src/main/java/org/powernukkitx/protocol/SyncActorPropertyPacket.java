package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types._4158325036;

@Getter
@Setter
public class SyncActorPropertyPacket implements IPacket {
  private _4158325036 propertyData;

  public void encode(ByteBuf buf) {
    propertyData.encode(buf);
  }

  public void decode(ByteBuf buf) {
    propertyData = new _4158325036();
    propertyData.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 165;
  }
}
