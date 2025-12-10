package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AvailableCommandsPacketSoftEnumData {
  private String enumName;

  private List<String> enumOptions;

  public void encode(ByteBuf buf) {
    int __len_enumName = enumName != null ? enumName.length() : 0;
    if (enumName != null) buf.writeCharSequence(enumName, StandardCharsets.UTF_8);
    buf.writeInt(enumOptions != null ? enumOptions.size() : 0);
    if (enumOptions != null) {
      for (var __v : enumOptions) {
        buf.writeInt(__v != null ? __v.length() : 0);
        if (__v != null) buf.writeCharSequence(__v, StandardCharsets.UTF_8);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __len_enumName = buf.readInt();
    enumName = buf.readCharSequence(__len_enumName, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __size_enumOptions = buf.readInt();
    enumOptions = new java.util.ArrayList<>(__size_enumOptions);
    for (int i = 0; i < __size_enumOptions; i++) {
      int __len_enumOptions_item = buf.readInt();
      enumOptions.add(buf.readCharSequence(__len_enumOptions_item, java.nio.charset.StandardCharsets.UTF_8).toString());
    }
  }
}
