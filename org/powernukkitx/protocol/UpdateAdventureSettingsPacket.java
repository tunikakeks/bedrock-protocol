package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.Struct_AdventureSettings;

@Getter
@Setter
public class UpdateAdventureSettingsPacket implements IPacket {
  private Struct_AdventureSettings adventureSettings;

  public void encode(ByteBuf buf) {
    adventureSettings.encode(buf);
  }

  public void decode(ByteBuf buf) {
    adventureSettings = new Struct_AdventureSettings();
    adventureSettings.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 188;
  }
}
