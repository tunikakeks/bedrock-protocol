package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;
import org.powernukkitx.protocol.types.Mce__UUID;

@Getter
@Setter
public class EmoteListPacket implements IPacket {
  private ActorRuntimeID runtimeId;

  private List<Mce__UUID> emotePieceIds;

  public void encode(ByteBuf buf) {
    runtimeId.encode(buf);
    buf.writeInt(emotePieceIds != null ? emotePieceIds.size() : 0);
    if (emotePieceIds != null) {
      for (var __v : emotePieceIds) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    runtimeId = new ActorRuntimeID();
    runtimeId.decode(buf);
    int __size_emotePieceIds = buf.readInt();
    emotePieceIds = new java.util.ArrayList<>(__size_emotePieceIds);
    for (int i = 0; i < __size_emotePieceIds; i++) {
      Mce__UUID v = new Mce__UUID();
      v.decode(buf);
      emotePieceIds.add(v);
    }
  }

  @Override
  public int getPacketId() {
    return 152;
  }
}
