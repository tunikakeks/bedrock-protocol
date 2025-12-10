package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourcePackChunkDataPacket implements IPacket {
  private String resourceName;

  private Integer chunkID;

  private Long byteOffset;

  private String chunkData;

  public void encode(ByteBuf buf) {
    int __len_resourceName = resourceName != null ? resourceName.length() : 0;
    if (resourceName != null) buf.writeCharSequence(resourceName, StandardCharsets.UTF_8);
    buf.writeInt(chunkID);
    buf.writeLong(byteOffset);
    int __len_chunkData = chunkData != null ? chunkData.length() : 0;
    if (chunkData != null) buf.writeCharSequence(chunkData, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_resourceName = buf.readInt();
    resourceName = buf.readCharSequence(__len_resourceName, java.nio.charset.StandardCharsets.UTF_8).toString();
    chunkID = buf.readInt();
    byteOffset = buf.readLong();
    int __len_chunkData = buf.readInt();
    chunkData = buf.readCharSequence(__len_chunkData, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 83;
  }
}
