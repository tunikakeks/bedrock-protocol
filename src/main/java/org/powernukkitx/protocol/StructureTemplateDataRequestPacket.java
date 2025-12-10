package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.Class_StructureSettings;
import org.powernukkitx.protocol.types.NetworkBlockPosition;
import org.powernukkitx.protocol.types.RequestedOperationEnum;
import org.powernukkitx.protocol.types.StructureTemplateDataRequestPacket_Requested_OperationEnum;

@Getter
@Setter
public class StructureTemplateDataRequestPacket implements IPacket {
  private String structureName;

  private NetworkBlockPosition structurePosition;

  private Class_StructureSettings structureSettings;

  private StructureTemplateDataRequestPacket_Requested_OperationEnum requestedOperation;

  public void encode(ByteBuf buf) {
    int __len_structureName = structureName != null ? structureName.length() : 0;
    if (structureName != null) buf.writeCharSequence(structureName, StandardCharsets.UTF_8);
    structurePosition.encode(buf);
    structureSettings.encode(buf);
    buf.writeInt(requestedOperation.ordinal());
  }

  public void decode(ByteBuf buf) {
    int __len_structureName = buf.readInt();
    structureName = buf.readCharSequence(__len_structureName, java.nio.charset.StandardCharsets.UTF_8).toString();
    structurePosition = new NetworkBlockPosition();
    structurePosition.decode(buf);
    structureSettings = new Class_StructureSettings();
    structureSettings.decode(buf);
    requestedOperation = RequestedOperationEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 132;
  }
}
