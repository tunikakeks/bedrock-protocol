package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Data_Store_Change {
  private String dataStoreName;

  private String property;

  private Integer updateCount;

  private Object theNewPropertyValue;

  public void encode(ByteBuf buf) {
    int __len_dataStoreName = dataStoreName != null ? dataStoreName.length() : 0;
    if (dataStoreName != null) buf.writeCharSequence(dataStoreName, StandardCharsets.UTF_8);
    int __len_property = property != null ? property.length() : 0;
    if (property != null) buf.writeCharSequence(property, StandardCharsets.UTF_8);
    buf.writeInt(updateCount);
    // unknown type for field theNewPropertyValue
  }

  public void decode(ByteBuf buf) {
    int __len_dataStoreName = buf.readInt();
    dataStoreName = buf.readCharSequence(__len_dataStoreName, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_property = buf.readInt();
    property = buf.readCharSequence(__len_property, java.nio.charset.StandardCharsets.UTF_8).toString();
    updateCount = buf.readInt();
    // unknown type for field theNewPropertyValue
  }
}
