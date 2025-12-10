package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServerboundDiagnosticsPacket implements IPacket {
  private Double avgfps;

  private Double avgserversimticktimems;

  private Double avgclientsimticktimems;

  private Double avgbeginframetimems;

  private Double avginputtimems;

  private Double avgrendertimems;

  private Double avgendframetimems;

  private Double avgremaindertimepercent;

  private Double avgunaccountedtimepercent;

  public void encode(ByteBuf buf) {
    buf.writeDouble(avgfps);
    buf.writeDouble(avgserversimticktimems);
    buf.writeDouble(avgclientsimticktimems);
    buf.writeDouble(avgbeginframetimems);
    buf.writeDouble(avginputtimems);
    buf.writeDouble(avgrendertimems);
    buf.writeDouble(avgendframetimems);
    buf.writeDouble(avgremaindertimepercent);
    buf.writeDouble(avgunaccountedtimepercent);
  }

  public void decode(ByteBuf buf) {
    avgfps = buf.readDouble();
    avgserversimticktimems = buf.readDouble();
    avgclientsimticktimems = buf.readDouble();
    avgbeginframetimems = buf.readDouble();
    avginputtimems = buf.readDouble();
    avgrendertimems = buf.readDouble();
    avgendframetimems = buf.readDouble();
    avgremaindertimepercent = buf.readDouble();
    avgunaccountedtimepercent = buf.readDouble();
  }

  @Override
  public int getPacketId() {
    return 315;
  }
}
