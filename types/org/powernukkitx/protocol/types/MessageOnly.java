package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageOnly {
  private MessageOnly_rawEnum raw;

  private MessageOnly_tipEnum tip;

  private MessageOnly_systemMessageEnum systemmessage;

  private MessageOnly_textObjectWhisperEnum textobjectwhisper;

  private MessageOnly_textObjectAnnouncementEnum textobjectannouncement;

  private MessageOnly_textObjectEnum textobject;

  private MessageOnly_Message_TypeEnum messageType;

  private String message;

  public void encode(ByteBuf buf) {
    buf.writeByte(raw.toByte());
    buf.writeByte(tip.toByte());
    buf.writeByte(systemmessage.toByte());
    buf.writeByte(textobjectwhisper.toByte());
    buf.writeByte(textobjectannouncement.toByte());
    buf.writeByte(textobject.toByte());
    buf.writeByte(messageType.toByte());
    int __len_message = message != null ? message.length() : 0;
    if (message != null) buf.writeCharSequence(message, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    raw = RawEnum.fromByte(buf.readUnsignedByte());
    tip = TipEnum.fromByte(buf.readUnsignedByte());
    systemmessage = SystemmessageEnum.fromByte(buf.readUnsignedByte());
    textobjectwhisper = TextobjectwhisperEnum.fromByte(buf.readUnsignedByte());
    textobjectannouncement = TextobjectannouncementEnum.fromByte(buf.readUnsignedByte());
    textobject = TextobjectEnum.fromByte(buf.readUnsignedByte());
    messageType = MessageTypeEnum.fromByte(buf.readUnsignedByte());
    int __len_message = buf.readInt();
    message = buf.readCharSequence(__len_message, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
