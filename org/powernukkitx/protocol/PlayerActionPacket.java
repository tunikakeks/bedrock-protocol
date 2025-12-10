package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActionEnum;
import org.powernukkitx.protocol.types.ActorRuntimeID;
import org.powernukkitx.protocol.types.NetworkBlockPosition;
import org.powernukkitx.protocol.types.PlayerActionPacket_ActionEnum;

@Getter
@Setter
public class PlayerActionPacket implements IPacket {
  private ActorRuntimeID playerRuntimeID;

  private PlayerActionPacket_ActionEnum action;

  private NetworkBlockPosition blockPosition;

  private NetworkBlockPosition resultPos;

  private Integer face;

  public void encode(ByteBuf buf) {
    playerRuntimeID.encode(buf);
    buf.writeByte(action.toByte());
    blockPosition.encode(buf);
    resultPos.encode(buf);
    buf.writeInt(face);
  }

  public void decode(ByteBuf buf) {
    playerRuntimeID = new ActorRuntimeID();
    playerRuntimeID.decode(buf);
    action = ActionEnum.fromByte(buf.readUnsignedByte());
    blockPosition = new NetworkBlockPosition();
    blockPosition.decode(buf);
    resultPos = new NetworkBlockPosition();
    resultPos.decode(buf);
    face = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 36;
  }
}
