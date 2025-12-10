package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.EduSharedUriResource;

@Getter
@Setter
public class EduUriResourcePacket implements IPacket {
  private EduSharedUriResource eduSharedURIResource;

  public void encode(ByteBuf buf) {
    eduSharedURIResource.encode(buf);
  }

  public void decode(ByteBuf buf) {
    eduSharedURIResource = new EduSharedUriResource();
    eduSharedURIResource.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 170;
  }
}
