package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Object;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerVideoCapturePacket implements IPacket {
  private Object startVideoCapture;

  private Object stopVideoCapture;

  public void encode(ByteBuf buf) {
    // unknown type for field startVideoCapture
    // unknown type for field stopVideoCapture
  }

  public void decode(ByteBuf buf) {
    // unknown type for field startVideoCapture
    // unknown type for field stopVideoCapture
  }

  @Override
  public int getPacketId() {
    return 324;
  }
}
