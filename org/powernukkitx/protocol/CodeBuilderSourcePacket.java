package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.CategoryEnum;
import org.powernukkitx.protocol.types.CodeBuilderSourcePacket_CategoryEnum;
import org.powernukkitx.protocol.types.CodeBuilderSourcePacket_CodeStatusEnum;
import org.powernukkitx.protocol.types.CodeBuilderSourcePacket_OperationEnum;
import org.powernukkitx.protocol.types.CodestatusEnum;
import org.powernukkitx.protocol.types.OperationEnum;

@Getter
@Setter
public class CodeBuilderSourcePacket implements IPacket {
  private CodeBuilderSourcePacket_OperationEnum operation;

  private CodeBuilderSourcePacket_CategoryEnum category;

  private CodeBuilderSourcePacket_CodeStatusEnum codestatus;

  public void encode(ByteBuf buf) {
    buf.writeByte(operation.toByte());
    buf.writeByte(category.toByte());
    buf.writeByte(codestatus.toByte());
  }

  public void decode(ByteBuf buf) {
    operation = OperationEnum.fromByte(buf.readUnsignedByte());
    category = CategoryEnum.fromByte(buf.readUnsignedByte());
    codestatus = CodestatusEnum.fromByte(buf.readUnsignedByte());
  }

  @Override
  public int getPacketId() {
    return 178;
  }
}
