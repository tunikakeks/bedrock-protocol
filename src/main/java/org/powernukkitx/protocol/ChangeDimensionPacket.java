package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ChangeDimensionPacket_Loading_Screen_IdEnum;
import org.powernukkitx.protocol.types.DimensionType;
import org.powernukkitx.protocol.types.LoadingScreenIdEnum;
import org.powernukkitx.protocol.types.Vec3;

@Getter
@Setter
public class ChangeDimensionPacket implements IPacket {
  private DimensionType dimensionID;

  private Vec3 position;

  private Boolean respawn;

  private ChangeDimensionPacket_Loading_Screen_IdEnum loadingScreenId;

  public void encode(ByteBuf buf) {
    dimensionID.encode(buf);
    position.encode(buf);
    buf.writeBoolean(respawn);
    buf.writeInt(loadingScreenId.ordinal());
  }

  public void decode(ByteBuf buf) {
    dimensionID = new DimensionType();
    dimensionID.decode(buf);
    position = new Vec3();
    position.decode(buf);
    respawn = buf.readBoolean();
    loadingScreenId = LoadingScreenIdEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 61;
  }
}
