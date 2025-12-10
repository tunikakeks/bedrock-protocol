package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.InventoryOptions;

@Getter
@Setter
public class SetPlayerInventoryOptionsPacket implements IPacket {
  private InventoryOptions inventoryOptions;

  public void encode(ByteBuf buf) {
    inventoryOptions.encode(buf);
  }

  public void decode(ByteBuf buf) {
    inventoryOptions = new InventoryOptions();
    inventoryOptions.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 307;
  }
}
