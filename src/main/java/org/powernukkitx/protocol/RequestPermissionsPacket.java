package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.RequestPermissionsPacket_Target_Player_Id_s_Raw_IDEnum;
import org.powernukkitx.protocol.types.TargetPlayerIdSRawIDEnum;

@Getter
@Setter
public class RequestPermissionsPacket implements IPacket {
  private RequestPermissionsPacket_Target_Player_Id_s_Raw_IDEnum targetPlayerIdSRawID;

  private Integer playerPermissionLevel;

  private Integer customPermissionFlags;

  public void encode(ByteBuf buf) {
    buf.writeInt(targetPlayerIdSRawID.ordinal());
    buf.writeInt(playerPermissionLevel);
    buf.writeInt(customPermissionFlags);
  }

  public void decode(ByteBuf buf) {
    targetPlayerIdSRawID = TargetPlayerIdSRawIDEnum.values()[buf.readInt()];
    playerPermissionLevel = buf.readInt();
    customPermissionFlags = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 185;
  }
}
