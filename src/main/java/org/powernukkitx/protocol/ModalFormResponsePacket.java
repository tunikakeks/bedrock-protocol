package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.FormCancelReasonEnum;
import org.powernukkitx.protocol.types.FormIDEnum;
import org.powernukkitx.protocol.types.Json__Value;
import org.powernukkitx.protocol.types.ModalFormResponsePacket_Form_Cancel_ReasonEnum;
import org.powernukkitx.protocol.types.ModalFormResponsePacket_Form_IDEnum;

@Getter
@Setter
public class ModalFormResponsePacket implements IPacket {
  private ModalFormResponsePacket_Form_IDEnum formID;

  private Json__Value jsonResponse;

  private ModalFormResponsePacket_Form_Cancel_ReasonEnum formCancelReason;

  public void encode(ByteBuf buf) {
    buf.writeInt(formID.ordinal());
    jsonResponse.encode(buf);
    buf.writeInt(formCancelReason.ordinal());
  }

  public void decode(ByteBuf buf) {
    formID = FormIDEnum.values()[buf.readInt()];
    jsonResponse = new Json__Value();
    jsonResponse.decode(buf);
    formCancelReason = FormCancelReasonEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 101;
  }
}
