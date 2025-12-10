package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.CameraShakePacket_Shake_ActionEnum;
import org.powernukkitx.protocol.types.CameraShakePacket_Shake_TypeEnum;
import org.powernukkitx.protocol.types.ShakeActionEnum;
import org.powernukkitx.protocol.types.ShakeTypeEnum;

@Getter
@Setter
public class CameraShakePacket implements IPacket {
  private Double intensity;

  private Double seconds;

  private CameraShakePacket_Shake_TypeEnum shakeType;

  private CameraShakePacket_Shake_ActionEnum shakeAction;

  public void encode(ByteBuf buf) {
    buf.writeDouble(intensity);
    buf.writeDouble(seconds);
    buf.writeInt(shakeType.ordinal());
    buf.writeInt(shakeAction.ordinal());
  }

  public void decode(ByteBuf buf) {
    intensity = buf.readDouble();
    seconds = buf.readDouble();
    shakeType = ShakeTypeEnum.values()[buf.readInt()];
    shakeAction = ShakeActionEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 159;
  }
}
