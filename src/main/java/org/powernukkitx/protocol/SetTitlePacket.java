package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.SetTitlePacket_Title_TypeEnum;
import org.powernukkitx.protocol.types.TitleTypeEnum;

@Getter
@Setter
public class SetTitlePacket implements IPacket {
  private SetTitlePacket_Title_TypeEnum titleType;

  private String titleText;

  private Integer fadeInTime;

  private Integer stayTime;

  private Integer fadeOutTime;

  private String xuid;

  private String platformOnlineId;

  private String filteredTitleMessage;

  public void encode(ByteBuf buf) {
    buf.writeInt(titleType.ordinal());
    int __len_titleText = titleText != null ? titleText.length() : 0;
    if (titleText != null) buf.writeCharSequence(titleText, StandardCharsets.UTF_8);
    buf.writeInt(fadeInTime);
    buf.writeInt(stayTime);
    buf.writeInt(fadeOutTime);
    int __len_xuid = xuid != null ? xuid.length() : 0;
    if (xuid != null) buf.writeCharSequence(xuid, StandardCharsets.UTF_8);
    int __len_platformOnlineId = platformOnlineId != null ? platformOnlineId.length() : 0;
    if (platformOnlineId != null) buf.writeCharSequence(platformOnlineId, StandardCharsets.UTF_8);
    int __len_filteredTitleMessage = filteredTitleMessage != null ? filteredTitleMessage.length() : 0;
    if (filteredTitleMessage != null) buf.writeCharSequence(filteredTitleMessage, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    titleType = TitleTypeEnum.values()[buf.readInt()];
    int __len_titleText = buf.readInt();
    titleText = buf.readCharSequence(__len_titleText, java.nio.charset.StandardCharsets.UTF_8).toString();
    fadeInTime = buf.readInt();
    stayTime = buf.readInt();
    fadeOutTime = buf.readInt();
    int __len_xuid = buf.readInt();
    xuid = buf.readCharSequence(__len_xuid, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_platformOnlineId = buf.readInt();
    platformOnlineId = buf.readCharSequence(__len_platformOnlineId, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_filteredTitleMessage = buf.readInt();
    filteredTitleMessage = buf.readCharSequence(__len_filteredTitleMessage, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 88;
  }
}
