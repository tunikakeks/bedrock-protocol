package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MobBorn {
  private Integer bornBabyEntityType;

  private Integer bornBabyEntityVariant;

  private Integer bornBabyColor;

  public void encode(ByteBuf buf) {
    buf.writeInt(bornBabyEntityType);
    buf.writeInt(bornBabyEntityVariant);
    buf.writeInt(bornBabyColor);
  }

  public void decode(ByteBuf buf) {
    bornBabyEntityType = buf.readInt();
    bornBabyEntityVariant = buf.readInt();
    bornBabyColor = buf.readInt();
  }
}
