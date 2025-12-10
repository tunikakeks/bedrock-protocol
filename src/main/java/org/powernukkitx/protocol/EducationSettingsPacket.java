package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.EducationLevelSettings;

@Getter
@Setter
public class EducationSettingsPacket implements IPacket {
  private EducationLevelSettings educationLevelSettings;

  public void encode(ByteBuf buf) {
    educationLevelSettings.encode(buf);
  }

  public void decode(ByteBuf buf) {
    educationLevelSettings = new EducationLevelSettings();
    educationLevelSettings.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 137;
  }
}
