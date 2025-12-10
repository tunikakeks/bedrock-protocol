package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TextPacket implements IPacket {
  private Boolean localize;

  private Object body;

  private String senderSXUID;

  private String platformId;

  private String filteredMessage;

  public void encode(ByteBuf buf) {
    buf.writeBoolean(localize);
    // unknown type for field body
    int __len_senderSXUID = senderSXUID != null ? senderSXUID.length() : 0;
    if (senderSXUID != null) buf.writeCharSequence(senderSXUID, StandardCharsets.UTF_8);
    int __len_platformId = platformId != null ? platformId.length() : 0;
    if (platformId != null) buf.writeCharSequence(platformId, StandardCharsets.UTF_8);
    int __len_filteredMessage = filteredMessage != null ? filteredMessage.length() : 0;
    if (filteredMessage != null) buf.writeCharSequence(filteredMessage, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    localize = buf.readBoolean();
    // unknown type for field body
    int __len_senderSXUID = buf.readInt();
    senderSXUID = buf.readCharSequence(__len_senderSXUID, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_platformId = buf.readInt();
    platformId = buf.readCharSequence(__len_platformId, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_filteredMessage = buf.readInt();
    filteredMessage = buf.readCharSequence(__len_filteredMessage, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 9;
  }
}
