package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Data_Store_Removal {
  private String dataStoreName;

  public void encode(ByteBuf buf) {
    int __len_dataStoreName = dataStoreName != null ? dataStoreName.length() : 0;
    if (dataStoreName != null) buf.writeCharSequence(dataStoreName, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_dataStoreName = buf.readInt();
    dataStoreName = buf.readCharSequence(__len_dataStoreName, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
