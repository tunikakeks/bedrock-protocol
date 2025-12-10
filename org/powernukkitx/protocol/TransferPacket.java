package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferPacket implements IPacket {
  private String serverAddress;

  private Integer serverPort;

  private Boolean reloadWorld;

  public void encode(ByteBuf buf) {
    int __len_serverAddress = serverAddress != null ? serverAddress.length() : 0;
    if (serverAddress != null) buf.writeCharSequence(serverAddress, StandardCharsets.UTF_8);
    buf.writeInt(serverPort);
    buf.writeBoolean(reloadWorld);
  }

  public void decode(ByteBuf buf) {
    int __len_serverAddress = buf.readInt();
    serverAddress = buf.readCharSequence(__len_serverAddress, java.nio.charset.StandardCharsets.UTF_8).toString();
    serverPort = buf.readInt();
    reloadWorld = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 85;
  }
}
