package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.NetworkBlockPosition;

@Getter
@Setter
public class BlockEventPacket implements IPacket {
  private NetworkBlockPosition blockPosition;

  private Integer eventType;

  private Integer eventValue;

  public void encode(ByteBuf buf) {
    blockPosition.encode(buf);
    buf.writeInt(eventType);
    buf.writeInt(eventValue);
  }

  public void decode(ByteBuf buf) {
    blockPosition = new NetworkBlockPosition();
    blockPosition.decode(buf);
    eventType = buf.readInt();
    eventValue = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 26;
  }
}
