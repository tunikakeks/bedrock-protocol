package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.CameraInstruction;

@Getter
@Setter
public class CameraInstructionPacket implements IPacket {
  private CameraInstruction cameraInstruction;

  public void encode(ByteBuf buf) {
    cameraInstruction.encode(buf);
  }

  public void decode(ByteBuf buf) {
    cameraInstruction = new CameraInstruction();
    cameraInstruction.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 300;
  }
}
