package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AvailableCommandsPacketConstrainedValueData {
  private Integer enumValueSymbol;

  private Integer enumSymbol;

  private List<Integer> constraintIndices;

  public void encode(ByteBuf buf) {
    buf.writeInt(enumValueSymbol);
    buf.writeInt(enumSymbol);
    buf.writeInt(constraintIndices != null ? constraintIndices.size() : 0);
    if (constraintIndices != null) {
      for (var __v : constraintIndices) {
        buf.writeInt(__v);
      }
    }
  }

  public void decode(ByteBuf buf) {
    enumValueSymbol = buf.readInt();
    enumSymbol = buf.readInt();
    int __size_constraintIndices = buf.readInt();
    constraintIndices = new java.util.ArrayList<>(__size_constraintIndices);
    for (int i = 0; i < __size_constraintIndices; i++) {
      constraintIndices.add(buf.readInt());
    }
  }
}
