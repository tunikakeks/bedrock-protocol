package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AvailableCommandsPacketOverloadData {
  private Boolean ischaining;

  private List<_3535626250> parameterData;

  public void encode(ByteBuf buf) {
    buf.writeBoolean(ischaining);
    buf.writeInt(parameterData != null ? parameterData.size() : 0);
    if (parameterData != null) {
      for (var __v : parameterData) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    ischaining = buf.readBoolean();
    int __size_parameterData = buf.readInt();
    parameterData = new java.util.ArrayList<>(__size_parameterData);
    for (int i = 0; i < __size_parameterData; i++) {
      _3535626250 v = new _3535626250();
      v.decode(buf);
      parameterData.add(v);
    }
  }
}
