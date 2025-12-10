package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types._4158325036;

@Getter
@Setter
public class JigsawStructureDataPacket implements IPacket {
  private _4158325036 jigsawStructureDataTag;

  public void encode(ByteBuf buf) {
    jigsawStructureDataTag.encode(buf);
  }

  public void decode(ByteBuf buf) {
    jigsawStructureDataTag = new _4158325036();
    jigsawStructureDataTag.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 313;
  }
}
