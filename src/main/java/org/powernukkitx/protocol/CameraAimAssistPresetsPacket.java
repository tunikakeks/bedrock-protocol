package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.CameraAimAssistCategoryDefinition;
import org.powernukkitx.protocol.types.CameraAimAssistPresetDefinition;
import org.powernukkitx.protocol.types.CameraAimAssistPresetsPacket_OperationEnum;
import org.powernukkitx.protocol.types.OperationEnum;

@Getter
@Setter
public class CameraAimAssistPresetsPacket implements IPacket {
  private List<CameraAimAssistCategoryDefinition> cameraAimAssistPresets;

  private List<CameraAimAssistPresetDefinition> cameraAimAssistCategories;

  private CameraAimAssistPresetsPacket_OperationEnum operation;

  public void encode(ByteBuf buf) {
    buf.writeInt(cameraAimAssistPresets != null ? cameraAimAssistPresets.size() : 0);
    if (cameraAimAssistPresets != null) {
      for (var __v : cameraAimAssistPresets) {
        __v.encode(buf);
      }
    }
    buf.writeInt(cameraAimAssistCategories != null ? cameraAimAssistCategories.size() : 0);
    if (cameraAimAssistCategories != null) {
      for (var __v : cameraAimAssistCategories) {
        __v.encode(buf);
      }
    }
    buf.writeInt(operation.ordinal());
  }

  public void decode(ByteBuf buf) {
    int __size_cameraAimAssistPresets = buf.readInt();
    cameraAimAssistPresets = new java.util.ArrayList<>(__size_cameraAimAssistPresets);
    for (int i = 0; i < __size_cameraAimAssistPresets; i++) {
      CameraAimAssistCategoryDefinition v = new CameraAimAssistCategoryDefinition();
      v.decode(buf);
      cameraAimAssistPresets.add(v);
    }
    int __size_cameraAimAssistCategories = buf.readInt();
    cameraAimAssistCategories = new java.util.ArrayList<>(__size_cameraAimAssistCategories);
    for (int i = 0; i < __size_cameraAimAssistCategories; i++) {
      CameraAimAssistPresetDefinition v = new CameraAimAssistPresetDefinition();
      v.decode(buf);
      cameraAimAssistCategories.add(v);
    }
    operation = OperationEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 320;
  }
}
