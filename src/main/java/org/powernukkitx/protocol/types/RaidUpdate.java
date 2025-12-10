package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RaidUpdate {
  private Integer currentWave;

  private Integer totalWaves;

  private Boolean success;

  public void encode(ByteBuf buf) {
    buf.writeInt(currentWave);
    buf.writeInt(totalWaves);
    buf.writeBoolean(success);
  }

  public void decode(ByteBuf buf) {
    currentWave = buf.readInt();
    totalWaves = buf.readInt();
    success = buf.readBoolean();
  }
}
