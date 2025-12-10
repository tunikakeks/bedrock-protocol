package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Double;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Struct_ActorLink {
  private ActorUniqueID targetA;

  private ActorUniqueID targetB;

  private Struct_ActorLink_TypeEnum type;

  private Boolean immediate;

  private Boolean passengerInitiated;

  private Double vehicleAngularVelocity;

  public void encode(ByteBuf buf) {
    targetA.encode(buf);
    targetB.encode(buf);
    buf.writeByte(type.toByte());
    buf.writeBoolean(immediate);
    buf.writeBoolean(passengerInitiated);
    buf.writeDouble(vehicleAngularVelocity);
  }

  public void decode(ByteBuf buf) {
    targetA = new ActorUniqueID();
    targetA.decode(buf);
    targetB = new ActorUniqueID();
    targetB.decode(buf);
    type = TypeEnum.fromByte(buf.readUnsignedByte());
    immediate = buf.readBoolean();
    passengerInitiated = buf.readBoolean();
    vehicleAngularVelocity = buf.readDouble();
  }
}
