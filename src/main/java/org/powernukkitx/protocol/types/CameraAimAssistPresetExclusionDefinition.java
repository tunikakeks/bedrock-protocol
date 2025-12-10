package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraAimAssistPresetExclusionDefinition {
  private List<Reference> blocks;

  private List<Reference> entities;

  private List<String> blockTags;

  public void encode(ByteBuf buf) {
    buf.writeInt(blocks != null ? blocks.size() : 0);
    if (blocks != null) {
      for (var __v : blocks) {
        __v.encode(buf);
      }
    }
    buf.writeInt(entities != null ? entities.size() : 0);
    if (entities != null) {
      for (var __v : entities) {
        __v.encode(buf);
      }
    }
    buf.writeInt(blockTags != null ? blockTags.size() : 0);
    if (blockTags != null) {
      for (var __v : blockTags) {
        buf.writeInt(__v != null ? __v.length() : 0);
        if (__v != null) buf.writeCharSequence(__v, StandardCharsets.UTF_8);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __size_blocks = buf.readInt();
    blocks = new java.util.ArrayList<>(__size_blocks);
    for (int i = 0; i < __size_blocks; i++) {
      Reference v = new Reference();
      v.decode(buf);
      blocks.add(v);
    }
    int __size_entities = buf.readInt();
    entities = new java.util.ArrayList<>(__size_entities);
    for (int i = 0; i < __size_entities; i++) {
      Reference v = new Reference();
      v.decode(buf);
      entities.add(v);
    }
    int __size_blockTags = buf.readInt();
    blockTags = new java.util.ArrayList<>(__size_blockTags);
    for (int i = 0; i < __size_blockTags; i++) {
      int __len_blockTags_item = buf.readInt();
      blockTags.add(buf.readCharSequence(__len_blockTags_item, java.nio.charset.StandardCharsets.UTF_8).toString());
    }
  }
}
