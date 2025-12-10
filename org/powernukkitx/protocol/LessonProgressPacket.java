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
public class LessonProgressPacket implements IPacket {
  private Integer lessonAction;

  private Integer score;

  private String activityId;

  public void encode(ByteBuf buf) {
    buf.writeInt(lessonAction);
    buf.writeInt(score);
    int __len_activityId = activityId != null ? activityId.length() : 0;
    if (activityId != null) buf.writeCharSequence(activityId, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    lessonAction = buf.readInt();
    score = buf.readInt();
    int __len_activityId = buf.readInt();
    activityId = buf.readCharSequence(__len_activityId, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 183;
  }
}
