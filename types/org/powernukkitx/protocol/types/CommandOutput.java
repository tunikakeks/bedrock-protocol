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
public class CommandOutput {
  private CommandOutput_Output_TypeEnum outputType;

  private Integer successCount;

  private List<CommandOutputMessage> outputMessages;

  private String dataSet;

  public void encode(ByteBuf buf) {
    buf.writeByte(outputType.toByte());
    buf.writeInt(successCount);
    buf.writeInt(outputMessages != null ? outputMessages.size() : 0);
    if (outputMessages != null) {
      for (var __v : outputMessages) {
        __v.encode(buf);
      }
    }
    int __len_dataSet = dataSet != null ? dataSet.length() : 0;
    if (dataSet != null) buf.writeCharSequence(dataSet, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    outputType = OutputTypeEnum.fromByte(buf.readUnsignedByte());
    successCount = buf.readInt();
    int __size_outputMessages = buf.readInt();
    outputMessages = new java.util.ArrayList<>(__size_outputMessages);
    for (int i = 0; i < __size_outputMessages; i++) {
      CommandOutputMessage v = new CommandOutputMessage();
      v.decode(buf);
      outputMessages.add(v);
    }
    int __len_dataSet = buf.readInt();
    dataSet = buf.readCharSequence(__len_dataSet, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
