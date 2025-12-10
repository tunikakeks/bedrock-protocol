package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestPermissionsPacket implements IPacket {
  private Long targetPlayerIdSRawID;

  private Integer playerPermissionLevel;

  private Integer customPermissionFlags;

  public void encode(ByteBuf buf) {
    buf.writeLong(targetPlayerIdSRawID);
    buf.writeInt(playerPermissionLevel);
    buf.writeInt(customPermissionFlags);
  }

  public void decode(ByteBuf buf) {
    targetPlayerIdSRawID = buf.readLong();
    playerPermissionLevel = buf.readInt();
    customPermissionFlags = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 185;
  }
}
