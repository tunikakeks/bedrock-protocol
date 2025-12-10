package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActionEnum;
import org.powernukkitx.protocol.types.ActorRuntimeID;
import org.powernukkitx.protocol.types.AnimatePacket_ActionEnum;
import org.powernukkitx.protocol.types.AnimatePacket_Swing_SourceEnum;
import org.powernukkitx.protocol.types.SwingSourceEnum;

@Getter
@Setter
public class AnimatePacket implements IPacket {
  private AnimatePacket_ActionEnum action;

  private ActorRuntimeID targetActorRuntimeID;

  private Double data;

  private AnimatePacket_Swing_SourceEnum swingSource;

  public void encode(ByteBuf buf) {
    buf.writeInt(action.ordinal());
    targetActorRuntimeID.encode(buf);
    buf.writeDouble(data);
    buf.writeInt(swingSource.ordinal());
  }

  public void decode(ByteBuf buf) {
    action = ActionEnum.values()[buf.readInt()];
    targetActorRuntimeID = new ActorRuntimeID();
    targetActorRuntimeID.decode(buf);
    data = buf.readDouble();
    swingSource = SwingSourceEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 44;
  }
}
