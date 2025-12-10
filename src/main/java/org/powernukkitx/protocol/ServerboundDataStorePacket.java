package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.Data_Store_Update;

@Getter
@Setter
public class ServerboundDataStorePacket implements IPacket {
  private Data_Store_Update update;

  public void encode(ByteBuf buf) {
    update.encode(buf);
  }

  public void decode(ByteBuf buf) {
    update = new Data_Store_Update();
    update.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 332;
  }
}
