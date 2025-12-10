package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.CorrectPlayerMovePredictionPacket_PredictionTypeEnum;
import org.powernukkitx.protocol.types.PlayerInputTick;
import org.powernukkitx.protocol.types.PredictiontypeEnum;
import org.powernukkitx.protocol.types.Vec2;
import org.powernukkitx.protocol.types.Vec3;

@Getter
@Setter
public class CorrectPlayerMovePredictionPacket implements IPacket {
  private CorrectPlayerMovePredictionPacket_PredictionTypeEnum predictiontype;

  private Vec3 pos;

  private Vec3 posDelta;

  private Vec2 rotation;

  private Double vehicleangularvelocity;

  private Boolean onGround;

  private PlayerInputTick tick;

  public void encode(ByteBuf buf) {
    buf.writeByte(predictiontype.toByte());
    pos.encode(buf);
    posDelta.encode(buf);
    rotation.encode(buf);
    buf.writeDouble(vehicleangularvelocity);
    buf.writeBoolean(onGround);
    tick.encode(buf);
  }

  public void decode(ByteBuf buf) {
    predictiontype = PredictiontypeEnum.fromByte(buf.readUnsignedByte());
    pos = new Vec3();
    pos.decode(buf);
    posDelta = new Vec3();
    posDelta.decode(buf);
    rotation = new Vec2();
    rotation.decode(buf);
    vehicleangularvelocity = buf.readDouble();
    onGround = buf.readBoolean();
    tick = new PlayerInputTick();
    tick.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 161;
  }
}
