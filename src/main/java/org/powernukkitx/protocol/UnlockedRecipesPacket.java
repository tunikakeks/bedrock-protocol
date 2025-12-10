package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.PacketTypeEnum;
import org.powernukkitx.protocol.types.UnlockedRecipesPacket_Packet_TypeEnum;

@Getter
@Setter
public class UnlockedRecipesPacket implements IPacket {
  private UnlockedRecipesPacket_Packet_TypeEnum packetType;

  private List<String> unlockedRecipesList;

  public void encode(ByteBuf buf) {
    buf.writeInt(packetType.ordinal());
    buf.writeInt(unlockedRecipesList != null ? unlockedRecipesList.size() : 0);
    if (unlockedRecipesList != null) {
      for (var __v : unlockedRecipesList) {
        buf.writeInt(__v != null ? __v.length() : 0);
        if (__v != null) buf.writeCharSequence(__v, StandardCharsets.UTF_8);
      }
    }
  }

  public void decode(ByteBuf buf) {
    packetType = PacketTypeEnum.values()[buf.readInt()];
    int __size_unlockedRecipesList = buf.readInt();
    unlockedRecipesList = new java.util.ArrayList<>(__size_unlockedRecipesList);
    for (int i = 0; i < __size_unlockedRecipesList; i++) {
      int __len_unlockedRecipesList_item = buf.readInt();
      unlockedRecipesList.add(buf.readCharSequence(__len_unlockedRecipesList_item, java.nio.charset.StandardCharsets.UTF_8).toString());
    }
  }

  @Override
  public int getPacketId() {
    return 199;
  }
}
