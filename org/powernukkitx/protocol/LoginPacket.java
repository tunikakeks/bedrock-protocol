package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginPacket implements IPacket {
  private Integer clientNetworkVersion;

  private String connectionRequest;

  public void encode(ByteBuf buf) {
    buf.writeInt(clientNetworkVersion);
    int __len_connectionRequest = connectionRequest != null ? connectionRequest.length() : 0;
    if (connectionRequest != null) buf.writeCharSequence(connectionRequest, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    clientNetworkVersion = buf.readInt();
    int __len_connectionRequest = buf.readInt();
    connectionRequest = buf.readCharSequence(__len_connectionRequest, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 1;
  }
}
