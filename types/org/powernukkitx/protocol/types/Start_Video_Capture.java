package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Start_Video_Capture {
  private Integer framerate;

  private String fileprefix;

  public void encode(ByteBuf buf) {
    buf.writeInt(framerate);
    int __len_fileprefix = fileprefix != null ? fileprefix.length() : 0;
    if (fileprefix != null) buf.writeCharSequence(fileprefix, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    framerate = buf.readInt();
    int __len_fileprefix = buf.readInt();
    fileprefix = buf.readCharSequence(__len_fileprefix, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
