package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.FeatureRegistry__FeatureBinaryJsonFormat;

@Getter
@Setter
public class FeatureRegistryPacket implements IPacket {
  private List<FeatureRegistry__FeatureBinaryJsonFormat> featuresdatalist;

  public void encode(ByteBuf buf) {
    buf.writeInt(featuresdatalist != null ? featuresdatalist.size() : 0);
    if (featuresdatalist != null) {
      for (var __v : featuresdatalist) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __size_featuresdatalist = buf.readInt();
    featuresdatalist = new java.util.ArrayList<>(__size_featuresdatalist);
    for (int i = 0; i < __size_featuresdatalist; i++) {
      FeatureRegistry__FeatureBinaryJsonFormat v = new FeatureRegistry__FeatureBinaryJsonFormat();
      v.decode(buf);
      featuresdatalist.add(v);
    }
  }

  @Override
  public int getPacketId() {
    return 191;
  }
}
