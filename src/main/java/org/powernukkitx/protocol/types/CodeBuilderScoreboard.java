package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CodeBuilderScoreboard {
  private String objectiveName;

  private Integer score;

  public void encode(ByteBuf buf) {
    int __len_objectiveName = objectiveName != null ? objectiveName.length() : 0;
    if (objectiveName != null) buf.writeCharSequence(objectiveName, StandardCharsets.UTF_8);
    buf.writeInt(score);
  }

  public void decode(ByteBuf buf) {
    int __len_objectiveName = buf.readInt();
    objectiveName = buf.readCharSequence(__len_objectiveName, java.nio.charset.StandardCharsets.UTF_8).toString();
    score = buf.readInt();
  }
}
