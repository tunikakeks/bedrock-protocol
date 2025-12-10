package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AvailableCommandsPacketEnumData {
  private String name;

  private List<Integer> values;

  public void encode(ByteBuf buf) {
    int __len_name = name != null ? name.length() : 0;
    if (name != null) buf.writeCharSequence(name, StandardCharsets.UTF_8);
    buf.writeInt(values != null ? values.size() : 0);
    if (values != null) {
      for (var __v : values) {
        buf.writeInt(__v);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __len_name = buf.readInt();
    name = buf.readCharSequence(__len_name, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __size_values = buf.readInt();
    values = new java.util.ArrayList<>(__size_values);
    for (int i = 0; i < __size_values; i++) {
      values.add(buf.readInt());
    }
  }
}
