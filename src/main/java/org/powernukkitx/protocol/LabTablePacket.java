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
    buf.writeInt(type.ordinal());
    position.encode(buf);
    buf.writeInt(reaction.ordinal());
  }

  public void decode(ByteBuf buf) {
    type = TypeEnum.values()[buf.readInt()];
    position = new BlockPos();
    position.decode(buf);
    reaction = ReactionEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 109;
  }
}
