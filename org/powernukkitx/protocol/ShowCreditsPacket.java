package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;

@Getter
@Setter
public class ShowCreditsPacket implements IPacket {
  private ActorRuntimeID playerRuntimeID;

  private Integer creditsState;

  public void encode(ByteBuf buf) {
    playerRuntimeID.encode(buf);
    buf.writeInt(creditsState);
  }

  public void decode(ByteBuf buf) {
    playerRuntimeID = new ActorRuntimeID();
    playerRuntimeID.decode(buf);
    creditsState = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 75;
  }
}
