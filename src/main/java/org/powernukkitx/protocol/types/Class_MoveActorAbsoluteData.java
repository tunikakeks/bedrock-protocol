package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Class_MoveActorAbsoluteData {
  private ActorRuntimeID actorruntimeid;

  private Integer header;

  private Vec3 position;

  private Integer rotationX;

  private Integer rotationY;

  private Integer rotationYHead;

  public void encode(ByteBuf buf) {
    actorruntimeid.encode(buf);
    buf.writeInt(header);
    position.encode(buf);
    buf.writeInt(rotationX);
    buf.writeInt(rotationY);
    buf.writeInt(rotationYHead);
  }

  public void decode(ByteBuf buf) {
    actorruntimeid = new ActorRuntimeID();
    actorruntimeid.decode(buf);
    header = buf.readInt();
    position = new Vec3();
    position.decode(buf);
    rotationX = buf.readInt();
    rotationY = buf.readInt();
    rotationYHead = buf.readInt();
  }
}
