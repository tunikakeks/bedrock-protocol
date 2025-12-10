package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerHotbarPacket implements IPacket {
  private Integer selectedSlot;

  private Integer containerID;

  private Boolean shouldSelectSlot;

  public void encode(ByteBuf buf) {
    buf.writeInt(selectedSlot);
    buf.writeInt(containerID);
    buf.writeBoolean(shouldSelectSlot);
  }

  public void decode(ByteBuf buf) {
    selectedSlot = buf.readInt();
    containerID = buf.readInt();
    shouldSelectSlot = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 48;
  }
}
