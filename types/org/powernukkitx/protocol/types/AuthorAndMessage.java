package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorAndMessage {
  private AuthorAndMessage_chatEnum chat;

  private AuthorAndMessage_whisperEnum whisper;

  private AuthorAndMessage_announcementEnum announcement;

  private AuthorAndMessage_Message_TypeEnum messageType;

  private String playerName;

  private String message;

  public void encode(ByteBuf buf) {
    buf.writeByte(chat.toByte());
    buf.writeByte(whisper.toByte());
    buf.writeByte(announcement.toByte());
    buf.writeByte(messageType.toByte());
    int __len_playerName = playerName != null ? playerName.length() : 0;
    if (playerName != null) buf.writeCharSequence(playerName, StandardCharsets.UTF_8);
    int __len_message = message != null ? message.length() : 0;
    if (message != null) buf.writeCharSequence(message, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    chat = ChatEnum.fromByte(buf.readUnsignedByte());
    whisper = WhisperEnum.fromByte(buf.readUnsignedByte());
    announcement = AnnouncementEnum.fromByte(buf.readUnsignedByte());
    messageType = MessageTypeEnum.fromByte(buf.readUnsignedByte());
    int __len_playerName = buf.readInt();
    playerName = buf.readCharSequence(__len_playerName, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_message = buf.readInt();
    message = buf.readCharSequence(__len_message, java.nio.charset.StandardCharsets.UTF_8).toString();
  }
}
