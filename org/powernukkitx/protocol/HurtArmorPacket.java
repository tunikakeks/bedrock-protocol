package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HurtArmorPacket implements IPacket {
  private Integer cause;

  private Integer damage;

  private Long armorSlots;

  public void encode(ByteBuf buf) {
    buf.writeInt(cause);
    buf.writeInt(damage);
    buf.writeLong(armorSlots);
  }

  public void decode(ByteBuf buf) {
    cause = buf.readInt();
    damage = buf.readInt();
    armorSlots = buf.readLong();
  }

  @Override
  public int getPacketId() {
    return 38;
  }
}
