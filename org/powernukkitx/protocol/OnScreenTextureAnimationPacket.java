package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OnScreenTextureAnimationPacket implements IPacket {
  private Integer effectId;

  public void encode(ByteBuf buf) {
    buf.writeInt(effectId);
  }

  public void decode(ByteBuf buf) {
    effectId = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 130;
  }
}
