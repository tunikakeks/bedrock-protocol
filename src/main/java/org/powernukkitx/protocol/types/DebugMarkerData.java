package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Long;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DebugMarkerData {
  private String text;

  private Vec3 position;

  private Color color;

  private Long duration;

  public void encode(ByteBuf buf) {
    int __len_text = text != null ? text.length() : 0;
    if (text != null) buf.writeCharSequence(text, StandardCharsets.UTF_8);
    position.encode(buf);
    color.encode(buf);
    buf.writeLong(duration);
  }

  public void decode(ByteBuf buf) {
    int __len_text = buf.readInt();
    text = buf.readCharSequence(__len_text, java.nio.charset.StandardCharsets.UTF_8).toString();
    position = new Vec3();
    position.decode(buf);
    color = new Color();
    color.decode(buf);
    duration = buf.readLong();
  }
}
