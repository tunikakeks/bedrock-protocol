package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enum_RequestAbilityPacketPayload__Type implements IPacket {
  public void encode(ByteBuf buf) {
    // no fields;
  }

  public void decode(ByteBuf buf) {
    // no fields;
  }

  @Override
  public int getPacketId() {
    return 0;
  }
}
