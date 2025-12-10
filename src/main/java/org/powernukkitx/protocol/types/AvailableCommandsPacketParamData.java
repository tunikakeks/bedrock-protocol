package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AvailableCommandsPacketParamData {
  private String name;

  private Integer parseSymbol;

  private Boolean isOptional;

  private Integer options;

  public void encode(ByteBuf buf) {
    int __len_name = name != null ? name.length() : 0;
    if (name != null) buf.writeCharSequence(name, StandardCharsets.UTF_8);
    buf.writeInt(parseSymbol);
    buf.writeBoolean(isOptional);
    buf.writeInt(options);
  }

  public void decode(ByteBuf buf) {
    int __len_name = buf.readInt();
    name = buf.readCharSequence(__len_name, java.nio.charset.StandardCharsets.UTF_8).toString();
    parseSymbol = buf.readInt();
    isOptional = buf.readBoolean();
    options = buf.readInt();
  }
}
