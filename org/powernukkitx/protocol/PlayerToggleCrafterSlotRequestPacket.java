package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerToggleCrafterSlotRequestPacket implements IPacket {
  private Integer posX;

  private Integer posY;

  private Integer posZ;

  private Integer slotIndex;

  private Boolean isDisabled;

  public void encode(ByteBuf buf) {
    buf.writeInt(posX);
    buf.writeInt(posY);
    buf.writeInt(posZ);
    buf.writeInt(slotIndex);
    buf.writeBoolean(isDisabled);
  }

  public void decode(ByteBuf buf) {
    posX = buf.readInt();
    posY = buf.readInt();
    posZ = buf.readInt();
    slotIndex = buf.readInt();
    isDisabled = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 306;
  }
}
