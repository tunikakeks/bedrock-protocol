package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CodeBuilderPacket implements IPacket {
  private String url;

  private Boolean shouldOpenCodeBuilder;

  public void encode(ByteBuf buf) {
    int __len_url = url != null ? url.length() : 0;
    if (url != null) buf.writeCharSequence(url, StandardCharsets.UTF_8);
    buf.writeBoolean(shouldOpenCodeBuilder);
  }

  public void decode(ByteBuf buf) {
    int __len_url = buf.readInt();
    url = buf.readCharSequence(__len_url, java.nio.charset.StandardCharsets.UTF_8).toString();
    shouldOpenCodeBuilder = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 150;
  }
}
