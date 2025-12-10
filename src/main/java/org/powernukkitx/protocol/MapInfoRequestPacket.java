package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorUniqueID;
import org.powernukkitx.protocol.types.Struct__anonymous_namespace___MapInfoRequestPacketAnon__ClientPixelsProxy;

@Getter
@Setter
public class MapInfoRequestPacket implements IPacket {
  private ActorUniqueID mapUniqueID;

  private List<Struct__anonymous_namespace___MapInfoRequestPacketAnon__ClientPixelsProxy> clientPixelsList;

  public void encode(ByteBuf buf) {
    mapUniqueID.encode(buf);
    buf.writeInt(clientPixelsList != null ? clientPixelsList.size() : 0);
    if (clientPixelsList != null) {
      for (var __v : clientPixelsList) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    mapUniqueID = new ActorUniqueID();
    mapUniqueID.decode(buf);
    int __size_clientPixelsList = buf.readInt();
    clientPixelsList = new java.util.ArrayList<>(__size_clientPixelsList);
    for (int i = 0; i < __size_clientPixelsList; i++) {
      Struct__anonymous_namespace___MapInfoRequestPacketAnon__ClientPixelsProxy v = new Struct__anonymous_namespace___MapInfoRequestPacketAnon__ClientPixelsProxy();
      v.decode(buf);
      clientPixelsList.add(v);
    }
  }

  @Override
  public int getPacketId() {
    return 68;
  }
}
