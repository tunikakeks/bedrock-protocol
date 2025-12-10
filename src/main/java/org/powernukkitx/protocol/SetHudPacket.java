package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.HudElementEnum;
import org.powernukkitx.protocol.types.HudVisibleEnum;
import org.powernukkitx.protocol.types.SetHudPacket_Hud_ElementItemEnum;
import org.powernukkitx.protocol.types.SetHudPacket_Hud_VisibleEnum;

@Getter
@Setter
public class SetHudPacket implements IPacket {
  private List<SetHudPacket_Hud_ElementItemEnum> hudElement;

  private SetHudPacket_Hud_VisibleEnum hudVisible;

  public void encode(ByteBuf buf) {
    buf.writeInt(hudElement != null ? hudElement.size() : 0);
    if (hudElement != null) {
      for (var __v : hudElement) {
        buf.writeInt(__v.ordinal());
      }
    }
    buf.writeInt(hudVisible.ordinal());
  }

  public void decode(ByteBuf buf) {
    int __size_hudElement = buf.readInt();
    hudElement = new java.util.ArrayList<>(__size_hudElement);
    for (int i = 0; i < __size_hudElement; i++) {
      hudElement.add(HudElementEnum.values()[buf.readInt()]);
    }
    hudVisible = HudVisibleEnum.values()[buf.readInt()];
  }

  @Override
  public int getPacketId() {
    return 308;
  }
}
