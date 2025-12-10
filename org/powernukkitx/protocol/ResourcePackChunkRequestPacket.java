package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourcePackChunkRequestPacket implements IPacket {
  private String resourceName;

  private Integer chunk;

  public void encode(ByteBuf buf) {
    int __len_resourceName = resourceName != null ? resourceName.length() : 0;
    if (resourceName != null) buf.writeCharSequence(resourceName, StandardCharsets.UTF_8);
    buf.writeInt(chunk);
  }

  public void decode(ByteBuf buf) {
    int __len_resourceName = buf.readInt();
    resourceName = buf.readCharSequence(__len_resourceName, java.nio.charset.StandardCharsets.UTF_8).toString();
    chunk = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 84;
  }
}
