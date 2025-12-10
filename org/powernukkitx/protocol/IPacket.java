package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;

public interface IPacket {
  void encode(ByteBuf buf);

  void decode(ByteBuf buf);

  int getPacketId();
}
