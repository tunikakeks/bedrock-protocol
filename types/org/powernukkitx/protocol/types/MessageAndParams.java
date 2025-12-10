package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageAndParams {
  private MessageAndParams_translateEnum translate;

  private MessageAndParams_popupEnum popup;

  private MessageAndParams_jukeboxPopupEnum jukeboxpopup;

  private MessageAndParams_Message_TypeEnum messageType;

  private String message;

  private List<String> parameterList;

  public void encode(ByteBuf buf) {
    buf.writeByte(translate.toByte());
    buf.writeByte(popup.toByte());
    buf.writeByte(jukeboxpopup.toByte());
    buf.writeByte(messageType.toByte());
    int __len_message = message != null ? message.length() : 0;
    if (message != null) buf.writeCharSequence(message, StandardCharsets.UTF_8);
    buf.writeInt(parameterList != null ? parameterList.size() : 0);
    if (parameterList != null) {
      for (var __v : parameterList) {
        buf.writeInt(__v != null ? __v.length() : 0);
        if (__v != null) buf.writeCharSequence(__v, StandardCharsets.UTF_8);
      }
    }
  }

  public void decode(ByteBuf buf) {
    translate = TranslateEnum.fromByte(buf.readUnsignedByte());
    popup = PopupEnum.fromByte(buf.readUnsignedByte());
    jukeboxpopup = JukeboxpopupEnum.fromByte(buf.readUnsignedByte());
    messageType = MessageTypeEnum.fromByte(buf.readUnsignedByte());
    int __len_message = buf.readInt();
    message = buf.readCharSequence(__len_message, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __size_parameterList = buf.readInt();
    parameterList = new java.util.ArrayList<>(__size_parameterList);
    for (int i = 0; i < __size_parameterList; i++) {
      int __len_parameterList_item = buf.readInt();
      parameterList.add(buf.readCharSequence(__len_parameterList_item, java.nio.charset.StandardCharsets.UTF_8).toString());
    }
  }
}
