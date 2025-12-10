package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorUniqueID;

@Getter
@Setter
public class CameraPacket implements IPacket {
  private ActorUniqueID cameraID;

  private ActorUniqueID targetPlayerID;

  public void encode(ByteBuf buf) {
    cameraID.encode(buf);
    targetPlayerID.encode(buf);
  }

  public void decode(ByteBuf buf) {
    cameraID = new ActorUniqueID();
    cameraID.decode(buf);
    targetPlayerID = new ActorUniqueID();
    targetPlayerID.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 73;
  }
}
