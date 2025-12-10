package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.NetworkBlockPosition;

@Getter
@Setter
public class PlaySoundPacket implements IPacket {
  private String name;

  private NetworkBlockPosition position;

  private Double volume;

  private Double pitch;

  public void encode(ByteBuf buf) {
    int __len_name = name != null ? name.length() : 0;
    if (name != null) buf.writeCharSequence(name, StandardCharsets.UTF_8);
    position.encode(buf);
    buf.writeDouble(volume);
    buf.writeDouble(pitch);
  }

  public void decode(ByteBuf buf) {
    int __len_name = buf.readInt();
    name = buf.readCharSequence(__len_name, java.nio.charset.StandardCharsets.UTF_8).toString();
    position = new NetworkBlockPosition();
    position.decode(buf);
    volume = buf.readDouble();
    pitch = buf.readDouble();
  }

  @Override
  public int getPacketId() {
    return 86;
  }
}
