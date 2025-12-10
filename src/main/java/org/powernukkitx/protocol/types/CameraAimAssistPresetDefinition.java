package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Object;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraAimAssistPresetDefinition {
  private Identifier identifier;

  private _1582287622 exclusionSettings;

  private List<_3470474886> liquidTargetingList;

  private Object itemSettings;

  private _3674175389 defaultItemSettings;

  private _3674175389 handSettings;

  public void encode(ByteBuf buf) {
    identifier.encode(buf);
    exclusionSettings.encode(buf);
    buf.writeInt(liquidTargetingList != null ? liquidTargetingList.size() : 0);
    if (liquidTargetingList != null) {
      for (var __v : liquidTargetingList) {
        __v.encode(buf);
      }
    }
    itemSettings.encode(buf);
    defaultItemSettings.encode(buf);
    handSettings.encode(buf);
  }

  public void decode(ByteBuf buf) {
    identifier = new Identifier();
    identifier.decode(buf);
    exclusionSettings = new _1582287622();
    exclusionSettings.decode(buf);
    int __size_liquidTargetingList = buf.readInt();
    liquidTargetingList = new java.util.ArrayList<>(__size_liquidTargetingList);
    for (int i = 0; i < __size_liquidTargetingList; i++) {
      _3470474886 v = new _3470474886();
      v.decode(buf);
      liquidTargetingList.add(v);
    }
    if (itemSettings == null) itemSettings = new ItemSettings();
    itemSettings.decode(buf);
    defaultItemSettings = new _3674175389();
    defaultItemSettings.decode(buf);
    handSettings = new _3674175389();
    handSettings.decode(buf);
  }
}
