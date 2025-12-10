package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ClientboundControlSchemeSetPacket_Control_SchemeEnum;
import org.powernukkitx.protocol.types.ControlSchemeEnum;

@Getter
@Setter
public class ClientboundControlSchemeSetPacket implements IPacket {
  private ClientboundControlSchemeSetPacket_Control_SchemeEnum controlScheme;

  public void encode(ByteBuf buf) {
    buf.writeByte(controlScheme.toByte());
  }

  public void decode(ByteBuf buf) {
    controlScheme = ControlSchemeEnum.fromByte(buf.readUnsignedByte());
  }

  @Override
  public int getPacketId() {
    return 327;
  }
}
