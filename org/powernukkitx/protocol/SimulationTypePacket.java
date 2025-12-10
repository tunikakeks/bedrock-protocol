package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.SimTypeEnum;
import org.powernukkitx.protocol.types.SimulationTypePacket_Sim_TypeEnum;

@Getter
@Setter
public class SimulationTypePacket implements IPacket {
  private SimulationTypePacket_Sim_TypeEnum simType;

  public void encode(ByteBuf buf) {
    buf.writeByte(simType.toByte());
  }

  public void decode(ByteBuf buf) {
    simType = SimTypeEnum.fromByte(buf.readUnsignedByte());
  }

  @Override
  public int getPacketId() {
    return 168;
  }
}
