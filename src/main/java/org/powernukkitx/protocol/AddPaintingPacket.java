package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;
import org.powernukkitx.protocol.types.ActorUniqueID;
import org.powernukkitx.protocol.types.Vec3;

@Getter
@Setter
public class AddPaintingPacket implements IPacket {
  private ActorUniqueID targetActorID;

  private ActorRuntimeID targetRuntimeID;

  private Vec3 position;

  private Integer direction;

  private String motif;

  public void encode(ByteBuf buf) {
    targetActorID.encode(buf);
    targetRuntimeID.encode(buf);
    position.encode(buf);
    buf.writeInt(direction);
    int __len_motif = motif != null ? motif.length() : 0;
    if (motif != null) buf.writeCharSequence(motif, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    targetActorID = new ActorUniqueID();
    targetActorID.decode(buf);
    targetRuntimeID = new ActorRuntimeID();
    targetRuntimeID.decode(buf);
    position = new Vec3();
    position.decode(buf);
    direction = buf.readInt();
    int __len_motif = buf.readInt();
    motif = buf.readCharSequence(__len_motif, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 22;
  }
}
