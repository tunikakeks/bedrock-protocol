package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.NetworkBlockPosition;

@Getter
@Setter
public class AnvilDamagePacket implements IPacket {
  private Integer damageAmount;

  private NetworkBlockPosition blockPosition;

  public void encode(ByteBuf buf) {
    buf.writeInt(damageAmount);
    blockPosition.encode(buf);
  }

  public void decode(ByteBuf buf) {
    damageAmount = buf.readInt();
    blockPosition = new NetworkBlockPosition();
    blockPosition.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 141;
  }
}
