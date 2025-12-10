package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorUniqueID;

@Getter
@Setter
public class DebugInfoPacket implements IPacket {
  private ActorUniqueID actorId;

  private String data;

  public void encode(ByteBuf buf) {
    actorId.encode(buf);
    int __len_data = data != null ? data.length() : 0;
    if (data != null) buf.writeCharSequence(data, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    actorId = new ActorUniqueID();
    actorId.decode(buf);
    int __len_data = buf.readInt();
    data = buf.readCharSequence(__len_data, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 155;
  }
}
