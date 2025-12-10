package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.NetworkBlockPosition;
import org.powernukkitx.protocol.types._4158325036;

@Getter
@Setter
public class BlockActorDataPacket implements IPacket {
  private NetworkBlockPosition blockPosition;

  private _4158325036 actorDataTags;

  public void encode(ByteBuf buf) {
    blockPosition.encode(buf);
    actorDataTags.encode(buf);
  }

  public void decode(ByteBuf buf) {
    blockPosition = new NetworkBlockPosition();
    blockPosition.decode(buf);
    actorDataTags = new _4158325036();
    actorDataTags.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 56;
  }
}
