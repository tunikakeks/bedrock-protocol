package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__FadeInstruction {
  private _1454186641 time;

  private _3843718221 color;

  public void encode(ByteBuf buf) {
    time.encode(buf);
    color.encode(buf);
  }

  public void decode(ByteBuf buf) {
    time = new _1454186641();
    time.decode(buf);
    color = new _3843718221();
    color.decode(buf);
  }
}
