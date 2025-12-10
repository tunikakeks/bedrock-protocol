package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompletedUsingItemPacket implements IPacket {
  private Integer itemId;

  private Integer itemUseMethod;

  public void encode(ByteBuf buf) {
    buf.writeInt(itemId);
    buf.writeInt(itemUseMethod);
  }

  public void decode(ByteBuf buf) {
    itemId = buf.readInt();
    itemUseMethod = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 142;
  }
}
