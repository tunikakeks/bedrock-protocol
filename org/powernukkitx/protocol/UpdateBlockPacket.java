package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.NetworkBlockPosition;

@Getter
@Setter
public class UpdateBlockPacket implements IPacket {
  private NetworkBlockPosition blockPosition;

  private Integer blockRuntimeID;

  private Integer flags;

  private Integer layer;

  public void encode(ByteBuf buf) {
    blockPosition.encode(buf);
    buf.writeInt(blockRuntimeID);
    buf.writeInt(flags);
    buf.writeInt(layer);
  }

  public void decode(ByteBuf buf) {
    blockPosition = new NetworkBlockPosition();
    blockPosition.decode(buf);
    blockRuntimeID = buf.readInt();
    flags = buf.readInt();
    layer = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 21;
  }
}
