package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.BlockPos;
import org.powernukkitx.protocol.types.LabTablePacket_ReactionEnum;
import org.powernukkitx.protocol.types.LabTablePacket_TypeEnum;
import org.powernukkitx.protocol.types.ReactionEnum;
import org.powernukkitx.protocol.types.TypeEnum;

@Getter
@Setter
public class LabTablePacket implements IPacket {
  private LabTablePacket_TypeEnum type;

  private BlockPos position;

  private LabTablePacket_ReactionEnum reaction;

  public void encode(ByteBuf buf) {
    buf.writeByte(type.toByte());
    position.encode(buf);
    buf.writeByte(reaction.toByte());
  }

  public void decode(ByteBuf buf) {
    type = TypeEnum.fromByte(buf.readUnsignedByte());
    position = new BlockPos();
    position.decode(buf);
    reaction = ReactionEnum.fromByte(buf.readUnsignedByte());
  }

  @Override
  public int getPacketId() {
    return 109;
  }
}
