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
    buf.writeInt(operation.ordinal());
    buf.writeInt(category.ordinal());
    buf.writeInt(codestatus.ordinal());
  }

  public void decode(ByteBuf buf) {
    operation = OperationEnum.values()[buf.readInt()];
    category = CategoryEnum.values()[buf.readInt()];
    codestatus = CodestatusEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 178;
  }
}
