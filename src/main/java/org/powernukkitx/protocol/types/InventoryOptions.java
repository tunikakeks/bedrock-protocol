package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoryOptions {
  private InventoryOptions_Left_Inventory_TabEnum leftInventoryTab;

  private InventoryOptions_Right_Inventory_TabEnum rightInventoryTab;

  private Boolean filtering;

  private InventoryOptions_Layout_InvEnum layoutInv;

  private InventoryOptions_Layout_CraftEnum layoutCraft;

  public void encode(ByteBuf buf) {
    buf.writeInt(leftInventoryTab.ordinal());
    buf.writeInt(rightInventoryTab.ordinal());
    buf.writeBoolean(filtering);
    buf.writeInt(layoutInv.ordinal());
    buf.writeInt(layoutCraft.ordinal());
  }

  public void decode(ByteBuf buf) {
    leftInventoryTab = LeftInventoryTabEnum.values()[buf.readInt()];
    rightInventoryTab = RightInventoryTabEnum.values()[buf.readInt()];
    filtering = buf.readBoolean();
    layoutInv = LayoutInvEnum.values()[buf.readInt()];
    layoutCraft = LayoutCraftEnum.values()[buf.readInt()];
  }
}
