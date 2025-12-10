package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourcePackDataInfoPacket implements IPacket {
  private String resourceName;

  private Integer chunkSize;

  private Integer numberOfChunks;

  private Long fileSize;

  private String fileHash;

  private Boolean isPremiumPack;

  private Integer packType;

  public void encode(ByteBuf buf) {
    int __len_resourceName = resourceName != null ? resourceName.length() : 0;
    if (resourceName != null) buf.writeCharSequence(resourceName, StandardCharsets.UTF_8);
    buf.writeInt(chunkSize);
    buf.writeInt(numberOfChunks);
    buf.writeLong(fileSize);
    int __len_fileHash = fileHash != null ? fileHash.length() : 0;
    if (fileHash != null) buf.writeCharSequence(fileHash, StandardCharsets.UTF_8);
    buf.writeBoolean(isPremiumPack);
    buf.writeInt(packType);
  }

  public void decode(ByteBuf buf) {
    int __len_resourceName = buf.readInt();
    resourceName = buf.readCharSequence(__len_resourceName, java.nio.charset.StandardCharsets.UTF_8).toString();
    chunkSize = buf.readInt();
    numberOfChunks = buf.readInt();
    fileSize = buf.readLong();
    int __len_fileHash = buf.readInt();
    fileHash = buf.readCharSequence(__len_fileHash, java.nio.charset.StandardCharsets.UTF_8).toString();
    isPremiumPack = buf.readBoolean();
    packType = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 82;
  }
}
