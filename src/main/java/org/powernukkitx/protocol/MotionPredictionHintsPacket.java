package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;
import org.powernukkitx.protocol.types.Vec3;

@Getter
@Setter
public class MotionPredictionHintsPacket implements IPacket {
  private ActorRuntimeID mruntimeid;

  private Vec3 mmotion;

  private Boolean monground;

  public void encode(ByteBuf buf) {
    mruntimeid.encode(buf);
    mmotion.encode(buf);
    buf.writeBoolean(monground);
  }

  public void decode(ByteBuf buf) {
    mruntimeid = new ActorRuntimeID();
    mruntimeid.decode(buf);
    mmotion = new Vec3();
    mmotion.decode(buf);
    monground = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 157;
  }
}
