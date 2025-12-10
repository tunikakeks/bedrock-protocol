package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Long;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommandOriginData {
  private CommandOriginData_TypeEnum type;

  private Mce__UUID uuid;

  private String requestid;

  private Long playerid;

  public void encode(ByteBuf buf) {
    buf.writeByte(type.toByte());
    uuid.encode(buf);
    int __len_requestid = requestid != null ? requestid.length() : 0;
    if (requestid != null) buf.writeCharSequence(requestid, StandardCharsets.UTF_8);
    buf.writeLong(playerid);
  }

  public void decode(ByteBuf buf) {
    type = TypeEnum.fromByte(buf.readUnsignedByte());
    uuid = new Mce__UUID();
    uuid.decode(buf);
    int __len_requestid = buf.readInt();
    requestid = buf.readCharSequence(__len_requestid, java.nio.charset.StandardCharsets.UTF_8).toString();
    playerid = buf.readLong();
  }
}
