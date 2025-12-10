package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;

@Getter
@Setter
public class EmotePacket implements IPacket {
  private ActorRuntimeID actorRuntimeId;

  private String emoteId;

  private Integer emoteLengthTicks;

  private String xuid;

  private String platformid;

  private Integer flags;

  public void encode(ByteBuf buf) {
    actorRuntimeId.encode(buf);
    int __len_emoteId = emoteId != null ? emoteId.length() : 0;
    if (emoteId != null) buf.writeCharSequence(emoteId, StandardCharsets.UTF_8);
    buf.writeInt(emoteLengthTicks);
    int __len_xuid = xuid != null ? xuid.length() : 0;
    if (xuid != null) buf.writeCharSequence(xuid, StandardCharsets.UTF_8);
    int __len_platformid = platformid != null ? platformid.length() : 0;
    if (platformid != null) buf.writeCharSequence(platformid, StandardCharsets.UTF_8);
    buf.writeInt(flags);
  }

  public void decode(ByteBuf buf) {
    actorRuntimeId = new ActorRuntimeID();
    actorRuntimeId.decode(buf);
    int __len_emoteId = buf.readInt();
    emoteId = buf.readCharSequence(__len_emoteId, java.nio.charset.StandardCharsets.UTF_8).toString();
    emoteLengthTicks = buf.readInt();
    int __len_xuid = buf.readInt();
    xuid = buf.readCharSequence(__len_xuid, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_platformid = buf.readInt();
    platformid = buf.readCharSequence(__len_platformid, java.nio.charset.StandardCharsets.UTF_8).toString();
    flags = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 138;
  }
}
