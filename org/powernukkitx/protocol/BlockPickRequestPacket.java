package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.BlockPos;

@Getter
@Setter
public class BlockPickRequestPacket implements IPacket {
  private BlockPos position;

  private Boolean withData;

  private Integer maxSlots;

  public void encode(ByteBuf buf) {
    position.encode(buf);
    buf.writeBoolean(withData);
    buf.writeInt(maxSlots);
  }

  public void decode(ByteBuf buf) {
    position = new BlockPos();
    position.decode(buf);
    withData = buf.readBoolean();
    maxSlots = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 34;
  }
}
