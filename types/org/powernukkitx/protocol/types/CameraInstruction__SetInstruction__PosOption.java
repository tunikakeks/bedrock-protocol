package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__SetInstruction__PosOption {
  private Vec3 pos;

  public void encode(ByteBuf buf) {
    pos.encode(buf);
  }

  public void decode(ByteBuf buf) {
    pos = new Vec3();
    pos.decode(buf);
  }
}
