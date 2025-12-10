package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorUniqueID;
import org.powernukkitx.protocol.types._4158325036;

@Getter
@Setter
public class UpdateEquipPacket implements IPacket {
  private Integer containerId;

  private Integer type;

  private Integer size;

  private ActorUniqueID entityUniqueId;

  private _4158325036 data;

  public void encode(ByteBuf buf) {
    buf.writeInt(containerId);
    buf.writeInt(type);
    buf.writeInt(size);
    entityUniqueId.encode(buf);
    data.encode(buf);
  }

  public void decode(ByteBuf buf) {
    containerId = buf.readInt();
    type = buf.readInt();
    size = buf.readInt();
    entityUniqueId = new ActorUniqueID();
    entityUniqueId.decode(buf);
    data = new _4158325036();
    data.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 81;
  }
}
