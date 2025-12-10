package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateSubChunkBlocksChangedInfo {
  private List<_775058941> blocksChangedStandards;

  private List<_775058941> blocksChangedExtras;

  public void encode(ByteBuf buf) {
    buf.writeInt(blocksChangedStandards != null ? blocksChangedStandards.size() : 0);
    if (blocksChangedStandards != null) {
      for (var __v : blocksChangedStandards) {
        __v.encode(buf);
      }
    }
    buf.writeInt(blocksChangedExtras != null ? blocksChangedExtras.size() : 0);
    if (blocksChangedExtras != null) {
      for (var __v : blocksChangedExtras) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __size_blocksChangedStandards = buf.readInt();
    blocksChangedStandards = new java.util.ArrayList<>(__size_blocksChangedStandards);
    for (int i = 0; i < __size_blocksChangedStandards; i++) {
      _775058941 v = new _775058941();
      v.decode(buf);
      blocksChangedStandards.add(v);
    }
    int __size_blocksChangedExtras = buf.readInt();
    blocksChangedExtras = new java.util.ArrayList<>(__size_blocksChangedExtras);
    for (int i = 0; i < __size_blocksChangedExtras; i++) {
      _775058941 v = new _775058941();
      v.decode(buf);
      blocksChangedExtras.add(v);
    }
  }
}
