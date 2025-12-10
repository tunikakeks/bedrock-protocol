package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Object;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraAimAssistCategoryPriorities {
  private Object entities;

  private Object blocks;

  private Object blockTags;

  private Integer entityDefault;

  private Integer blockDefault;

  public void encode(ByteBuf buf) {
    entities.encode(buf);
    blocks.encode(buf);
    blockTags.encode(buf);
    buf.writeInt(entityDefault);
    buf.writeInt(blockDefault);
  }

  public void decode(ByteBuf buf) {
    if (entities == null) entities = new Entities();
    entities.decode(buf);
    if (blocks == null) blocks = new Blocks();
    blocks.decode(buf);
    if (blockTags == null) blockTags = new BlockTags();
    blockTags.decode(buf);
    entityDefault = buf.readInt();
    blockDefault = buf.readInt();
  }
}
