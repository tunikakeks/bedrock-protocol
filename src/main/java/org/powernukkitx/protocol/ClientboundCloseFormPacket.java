package org.powernukkitx.protocol;

import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientboundCloseFormPacket implements IPacket {
  @Override
  public int getPacketId() {
    return 310;
  }
}
