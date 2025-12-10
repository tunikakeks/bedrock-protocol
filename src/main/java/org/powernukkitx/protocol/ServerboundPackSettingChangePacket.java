package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.Mce__UUID;

@Getter
@Setter
public class ServerboundPackSettingChangePacket implements IPacket {
  private Mce__UUID packid;

  private String packsettingname;

  private Object packsettingvalue;

  public void encode(ByteBuf buf) {
    packid.encode(buf);
    int __len_packsettingname = packsettingname != null ? packsettingname.length() : 0;
    if (packsettingname != null) buf.writeCharSequence(packsettingname, StandardCharsets.UTF_8);
    // unknown type for field packsettingvalue
  }

  public void decode(ByteBuf buf) {
    packid = new Mce__UUID();
    packid.decode(buf);
    int __len_packsettingname = buf.readInt();
    packsettingname = buf.readCharSequence(__len_packsettingname, java.nio.charset.StandardCharsets.UTF_8).toString();
    // unknown type for field packsettingvalue
  }

  @Override
  public int getPacketId() {
    return 329;
  }
}
