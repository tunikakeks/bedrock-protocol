package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.CameraPresets;

@Getter
@Setter
public class CameraPresetsPacket implements IPacket {
  private CameraPresets cameraPresets;

  public void encode(ByteBuf buf) {
    cameraPresets.encode(buf);
  }

  public void decode(ByteBuf buf) {
    cameraPresets = new CameraPresets();
    cameraPresets.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 198;
  }
}
