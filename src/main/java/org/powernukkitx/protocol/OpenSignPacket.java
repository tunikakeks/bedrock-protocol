package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.NetworkBlockPosition;

@Getter
@Setter
public class OpenSignPacket implements IPacket {
  private NetworkBlockPosition pos;

  private Boolean isFrontSide;

  public void encode(ByteBuf buf) {
    pos.encode(buf);
    buf.writeBoolean(isFrontSide);
  }

  public void decode(ByteBuf buf) {
    pos = new NetworkBlockPosition();
    pos.decode(buf);
    isFrontSide = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 303;
  }
}
