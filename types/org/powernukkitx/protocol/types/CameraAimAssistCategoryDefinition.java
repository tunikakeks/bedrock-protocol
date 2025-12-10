package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraAimAssistCategoryDefinition {
  private Identifier name;

  private _1765013198 priorities;

  public void encode(ByteBuf buf) {
    name.encode(buf);
    priorities.encode(buf);
  }

  public void decode(ByteBuf buf) {
    name = new Identifier();
    name.decode(buf);
    priorities = new _1765013198();
    priorities.decode(buf);
  }
}
