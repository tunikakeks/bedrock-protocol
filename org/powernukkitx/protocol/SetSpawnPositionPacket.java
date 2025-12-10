package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.DimensionType;
import org.powernukkitx.protocol.types.NetworkBlockPosition;
import org.powernukkitx.protocol.types.SetSpawnPositionPacket_Spawn_Position_TypeEnum;
import org.powernukkitx.protocol.types.SpawnPositionTypeEnum;

@Getter
@Setter
public class SetSpawnPositionPacket implements IPacket {
  private SetSpawnPositionPacket_Spawn_Position_TypeEnum spawnPositionType;

  private NetworkBlockPosition blockPosition;

  private DimensionType dimensionType;

  private NetworkBlockPosition spawnBlockPos;

  public void encode(ByteBuf buf) {
    buf.writeByte(spawnPositionType.toByte());
    blockPosition.encode(buf);
    dimensionType.encode(buf);
    spawnBlockPos.encode(buf);
  }

  public void decode(ByteBuf buf) {
    spawnPositionType = SpawnPositionTypeEnum.fromByte(buf.readUnsignedByte());
    blockPosition = new NetworkBlockPosition();
    blockPosition.decode(buf);
    dimensionType = new DimensionType();
    dimensionType.decode(buf);
    spawnBlockPos = new NetworkBlockPosition();
    spawnBlockPos.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 43;
  }
}
