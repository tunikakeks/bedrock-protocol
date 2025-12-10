package org.powernukkitx.protocol;

import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServerSettingsRequestPacket implements IPacket {
  @Override
  public int getPacketId() {
    return 102;
  }
}
