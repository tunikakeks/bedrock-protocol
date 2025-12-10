package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.EventIDEnum;
import org.powernukkitx.protocol.types.LevelSoundEventPacket_Event_IDEnum;
import org.powernukkitx.protocol.types.Vec3;

@Getter
@Setter
public class LevelSoundEventPacket implements IPacket {
  private LevelSoundEventPacket_Event_IDEnum eventID;

  private Vec3 position;

  private Integer data;

  private String actorIdentifier;

  private Boolean isBaby;

  private Boolean isGlobal;

  private Long actorUniqueId;

  public void encode(ByteBuf buf) {
    buf.writeByte(eventID.toByte());
    position.encode(buf);
    buf.writeInt(data);
    int __len_actorIdentifier = actorIdentifier != null ? actorIdentifier.length() : 0;
    if (actorIdentifier != null) buf.writeCharSequence(actorIdentifier, StandardCharsets.UTF_8);
    buf.writeBoolean(isBaby);
    buf.writeBoolean(isGlobal);
    buf.writeLong(actorUniqueId);
  }

  public void decode(ByteBuf buf) {
    eventID = EventIDEnum.fromByte(buf.readUnsignedByte());
    position = new Vec3();
    position.decode(buf);
    data = buf.readInt();
    int __len_actorIdentifier = buf.readInt();
    actorIdentifier = buf.readCharSequence(__len_actorIdentifier, java.nio.charset.StandardCharsets.UTF_8).toString();
    isBaby = buf.readBoolean();
    isGlobal = buf.readBoolean();
    actorUniqueId = buf.readLong();
  }

  @Override
  public int getPacketId() {
    return 123;
  }
}
