package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ContainerIDEnum;
import org.powernukkitx.protocol.types.PlayerHotbarPacket_Container_IDEnum;

@Getter
@Setter
public class PlayerHotbarPacket implements IPacket {
  private Integer selectedSlot;

  private PlayerHotbarPacket_Container_IDEnum containerID;

  private Boolean shouldSelectSlot;

  public void encode(ByteBuf buf) {
    buf.writeInt(selectedSlot);
    buf.writeInt(containerID.ordinal());
    buf.writeBoolean(shouldSelectSlot);
  }

  public void decode(ByteBuf buf) {
    selectedSlot = buf.readInt();
    containerID = ContainerIDEnum.values()[buf.readInt()];
    shouldSelectSlot = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 48;
  }
}
