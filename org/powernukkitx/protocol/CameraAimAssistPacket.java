package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActionEnum;
import org.powernukkitx.protocol.types.CameraAimAssistPacket_ActionEnum;
import org.powernukkitx.protocol.types.CameraAimAssistPacket_Target_ModeEnum;
import org.powernukkitx.protocol.types.TargetModeEnum;
import org.powernukkitx.protocol.types.Vec2;

@Getter
@Setter
public class CameraAimAssistPacket implements IPacket {
  private String presetId;

  private Vec2 viewAngle;

  private Double distance;

  private CameraAimAssistPacket_Target_ModeEnum targetMode;

  private CameraAimAssistPacket_ActionEnum action;

  private Boolean showDebugRender;

  public void encode(ByteBuf buf) {
    int __len_presetId = presetId != null ? presetId.length() : 0;
    if (presetId != null) buf.writeCharSequence(presetId, StandardCharsets.UTF_8);
    viewAngle.encode(buf);
    buf.writeDouble(distance);
    buf.writeByte(targetMode.toByte());
    buf.writeByte(action.toByte());
    buf.writeBoolean(showDebugRender);
  }

  public void decode(ByteBuf buf) {
    int __len_presetId = buf.readInt();
    presetId = buf.readCharSequence(__len_presetId, java.nio.charset.StandardCharsets.UTF_8).toString();
    viewAngle = new Vec2();
    viewAngle.decode(buf);
    distance = buf.readDouble();
    targetMode = TargetModeEnum.fromByte(buf.readUnsignedByte());
    action = ActionEnum.fromByte(buf.readUnsignedByte());
    showDebugRender = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 316;
  }
}
