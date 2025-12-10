package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.RequestAbilityPacket_Value_TypeEnum;
import org.powernukkitx.protocol.types.ValueTypeEnum;

@Getter
@Setter
public class RequestAbilityPacket implements IPacket {
  private Integer ability;

  private RequestAbilityPacket_Value_TypeEnum valueType;

  private Boolean bool;

  private Double float_;

  public void encode(ByteBuf buf) {
    buf.writeInt(ability);
    buf.writeInt(valueType.ordinal());
    buf.writeBoolean(bool);
    buf.writeDouble(float_);
  }

  public void decode(ByteBuf buf) {
    ability = buf.readInt();
    valueType = ValueTypeEnum.values()[buf.readInt()];
    bool = buf.readBoolean();
    float_ = buf.readDouble();
  }

  @Override
  public int getPacketId() {
    return 184;
  }
}
