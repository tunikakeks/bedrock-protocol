package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.FormCancelReasonEnum;
import org.powernukkitx.protocol.types.Json__Value;
import org.powernukkitx.protocol.types.ModalFormResponsePacket_Form_Cancel_ReasonEnum;

@Getter
@Setter
public class ModalFormResponsePacket implements IPacket {
  private Integer formID;

  private Json__Value jsonResponse;

  private ModalFormResponsePacket_Form_Cancel_ReasonEnum formCancelReason;

  public void encode(ByteBuf buf) {
    buf.writeInt(formID);
    jsonResponse.encode(buf);
    buf.writeByte(formCancelReason.toByte());
  }

  public void decode(ByteBuf buf) {
    formID = buf.readInt();
    jsonResponse = new Json__Value();
    jsonResponse.decode(buf);
    formCancelReason = FormCancelReasonEnum.fromByte(buf.readUnsignedByte());
  }

  @Override
  public int getPacketId() {
    return 101;
  }
}
