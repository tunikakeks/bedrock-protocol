package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActionEnum;
import org.powernukkitx.protocol.types.ClientCameraAimAssistPacket_ActionEnum;

@Getter
@Setter
public class ClientCameraAimAssistPacket implements IPacket {
  private String cameraPresetId;

  private ClientCameraAimAssistPacket_ActionEnum action;

  private Boolean allowAimAssist;

  public void encode(ByteBuf buf) {
    int __len_cameraPresetId = cameraPresetId != null ? cameraPresetId.length() : 0;
    if (cameraPresetId != null) buf.writeCharSequence(cameraPresetId, StandardCharsets.UTF_8);
    buf.writeByte(action.toByte());
    buf.writeBoolean(allowAimAssist);
  }

  public void decode(ByteBuf buf) {
    int __len_cameraPresetId = buf.readInt();
    cameraPresetId = buf.readCharSequence(__len_cameraPresetId, java.nio.charset.StandardCharsets.UTF_8).toString();
    action = ActionEnum.fromByte(buf.readUnsignedByte());
    allowAimAssist = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 321;
  }
}
