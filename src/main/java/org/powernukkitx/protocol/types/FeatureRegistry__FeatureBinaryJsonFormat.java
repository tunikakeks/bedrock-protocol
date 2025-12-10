package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeatureRegistry__FeatureBinaryJsonFormat {
  private String featureName;

  private String binaryJsonOutput;

  public void encode(ByteBuf buf) {
    int __len_featureName = featureName != null ? featureName.length() : 0;
    if (featureName != null) buf.writeCharSequence(featureName, StandardCharsets.UTF_8);
    int __len_binaryJsonOutput = binaryJsonOutput != null ? binaryJsonOutput.length() : 0;
    if (binaryJsonOutput != null) buf.writeCharSequence(binaryJsonOutput, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_featureName = buf.readInt();
    featureName = buf.readCharSequence(__len_featureName, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_binaryJsonOutput = buf.readInt();
    binaryJsonOutput = buf.readCharSequence(__len_binaryJsonOutput, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
