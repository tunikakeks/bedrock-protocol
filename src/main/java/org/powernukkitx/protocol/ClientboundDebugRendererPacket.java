package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ClientboundDebugRendererPacket_TypeEnum;
import org.powernukkitx.protocol.types.DebugMarkerData;
import org.powernukkitx.protocol.types.TypeEnum;

@Getter
@Setter
public class ClientboundDebugRendererPacket implements IPacket {
  private ClientboundDebugRendererPacket_TypeEnum type;

  private DebugMarkerData debugmarkerdata;

  public void encode(ByteBuf buf) {
    buf.writeInt(type.ordinal());
    debugmarkerdata.encode(buf);
  }

  public void decode(ByteBuf buf) {
    type = TypeEnum.values()[buf.readInt()];
    debugmarkerdata = new DebugMarkerData();
    debugmarkerdata.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 164;
  }
}
