package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntityNetId {
  private EntityNetId_Raw_IdEnum rawId;

  public void encode(ByteBuf buf) {
    buf.writeInt(rawId.ordinal());
  }

  public void decode(ByteBuf buf) {
    rawId = RawIdEnum.values()[buf.readInt()];
  }
}
