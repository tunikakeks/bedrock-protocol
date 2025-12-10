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
    buf.writeByte(leftInventoryTab.toByte());
    buf.writeByte(rightInventoryTab.toByte());
    buf.writeBoolean(filtering);
    buf.writeByte(layoutInv.toByte());
    buf.writeByte(layoutCraft.toByte());
  }

  public void decode(ByteBuf buf) {
    leftInventoryTab = LeftInventoryTabEnum.fromByte(buf.readUnsignedByte());
    rightInventoryTab = RightInventoryTabEnum.fromByte(buf.readUnsignedByte());
    filtering = buf.readBoolean();
    layoutInv = LayoutInvEnum.fromByte(buf.readUnsignedByte());
    layoutCraft = LayoutCraftEnum.fromByte(buf.readUnsignedByte());
  }
}
