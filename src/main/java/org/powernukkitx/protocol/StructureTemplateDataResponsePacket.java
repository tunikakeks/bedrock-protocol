package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ResponseTypeEnum;
import org.powernukkitx.protocol.types.StructureTemplateDataResponsePacket_Response_TypeEnum;
import org.powernukkitx.protocol.types._4158325036;

@Getter
@Setter
public class StructureTemplateDataResponsePacket implements IPacket {
  private String structureName;

  private _4158325036 structureSNBT;

  private StructureTemplateDataResponsePacket_Response_TypeEnum responseType;

  public void encode(ByteBuf buf) {
    int __len_structureName = structureName != null ? structureName.length() : 0;
    if (structureName != null) buf.writeCharSequence(structureName, StandardCharsets.UTF_8);
    structureSNBT.encode(buf);
    buf.writeInt(responseType.ordinal());
  }

  public void decode(ByteBuf buf) {
    int __len_structureName = buf.readInt();
    structureName = buf.readCharSequence(__len_structureName, java.nio.charset.StandardCharsets.UTF_8).toString();
    structureSNBT = new _4158325036();
    structureSNBT.decode(buf);
    responseType = ResponseTypeEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 133;
  }
}
