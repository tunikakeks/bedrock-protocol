package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerFogPacket implements IPacket {
  private List<String> fogStack;

  public void encode(ByteBuf buf) {
    buf.writeInt(fogStack != null ? fogStack.size() : 0);
    if (fogStack != null) {
      for (var __v : fogStack) {
        buf.writeInt(__v != null ? __v.length() : 0);
        if (__v != null) buf.writeCharSequence(__v, StandardCharsets.UTF_8);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __size_fogStack = buf.readInt();
    fogStack = new java.util.ArrayList<>(__size_fogStack);
    for (int i = 0; i < __size_fogStack; i++) {
      int __len_fogStack_item = buf.readInt();
      fogStack.add(buf.readCharSequence(__len_fogStack_item, java.nio.charset.StandardCharsets.UTF_8).toString());
    }
  }

  @Override
  public int getPacketId() {
    return 160;
  }
}
