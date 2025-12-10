package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetDifficultyPacket implements IPacket {
  private Integer difficulty;

  public void encode(ByteBuf buf) {
    buf.writeInt(difficulty);
  }

  public void decode(ByteBuf buf) {
    difficulty = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 60;
  }
}
