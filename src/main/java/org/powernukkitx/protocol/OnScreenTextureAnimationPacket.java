package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.EffectIdEnum;
import org.powernukkitx.protocol.types.OnScreenTextureAnimationPacket_Effect_IdEnum;

@Getter
@Setter
public class OnScreenTextureAnimationPacket implements IPacket {
  private OnScreenTextureAnimationPacket_Effect_IdEnum effectId;

  public void encode(ByteBuf buf) {
    buf.writeInt(effectId.ordinal());
  }

  public void decode(ByteBuf buf) {
    effectId = EffectIdEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 130;
  }
}
