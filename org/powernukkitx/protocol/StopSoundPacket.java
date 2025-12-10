package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StopSoundPacket implements IPacket {
  private String soundName;

  private Boolean stopAllSounds;

  private Boolean stopMusicLegacy;

  public void encode(ByteBuf buf) {
    int __len_soundName = soundName != null ? soundName.length() : 0;
    if (soundName != null) buf.writeCharSequence(soundName, StandardCharsets.UTF_8);
    buf.writeBoolean(stopAllSounds);
    buf.writeBoolean(stopMusicLegacy);
  }

  public void decode(ByteBuf buf) {
    int __len_soundName = buf.readInt();
    soundName = buf.readCharSequence(__len_soundName, java.nio.charset.StandardCharsets.UTF_8).toString();
    stopAllSounds = buf.readBoolean();
    stopMusicLegacy = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 87;
  }
}
