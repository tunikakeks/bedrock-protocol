package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Struct_AdventureSettings {
  private Boolean noPvM;

  private Boolean noMvP;

  private Boolean immutableWorld;

  private Boolean showNameTags;

  private Boolean autoJump;

  public void encode(ByteBuf buf) {
    buf.writeBoolean(noPvM);
    buf.writeBoolean(noMvP);
    buf.writeBoolean(immutableWorld);
    buf.writeBoolean(showNameTags);
    buf.writeBoolean(autoJump);
  }

  public void decode(ByteBuf buf) {
    noPvM = buf.readBoolean();
    noMvP = buf.readBoolean();
    immutableWorld = buf.readBoolean();
    showNameTags = buf.readBoolean();
    autoJump = buf.readBoolean();
  }
}
