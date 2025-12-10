package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.DimensionType;
import org.powernukkitx.protocol.types.EntityNetId;

@Getter
@Setter
public class RemoveVolumeEntityPacket implements IPacket {
  private EntityNetId entityNetworkId;

  private DimensionType dimensionType;

  public void encode(ByteBuf buf) {
    entityNetworkId.encode(buf);
    dimensionType.encode(buf);
  }

  public void decode(ByteBuf buf) {
    entityNetworkId = new EntityNetId();
    entityNetworkId.decode(buf);
    dimensionType = new DimensionType();
    dimensionType.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 167;
  }
}
