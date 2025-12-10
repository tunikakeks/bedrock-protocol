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
    buf.writeInt(raw.ordinal());
    buf.writeInt(tip.ordinal());
    buf.writeInt(systemmessage.ordinal());
    buf.writeInt(textobjectwhisper.ordinal());
    buf.writeInt(textobjectannouncement.ordinal());
    buf.writeInt(textobject.ordinal());
    buf.writeInt(messageType.ordinal());
    int __len_message = message != null ? message.length() : 0;
    if (message != null) buf.writeCharSequence(message, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    raw = RawEnum.values()[buf.readInt()];
    tip = TipEnum.values()[buf.readInt()];
    systemmessage = SystemmessageEnum.values()[buf.readInt()];
    textobjectwhisper = TextobjectwhisperEnum.values()[buf.readInt()];
    textobjectannouncement = TextobjectannouncementEnum.values()[buf.readInt()];
    textobject = TextobjectEnum.values()[buf.readInt()];
    messageType = MessageTypeEnum.values()[buf.readInt()];
    int __len_message = buf.readInt();
    message = buf.readCharSequence(__len_message, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
