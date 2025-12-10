package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorUniqueID;

@Getter
@Setter
public class ChangeMobPropertyPacket implements IPacket {
  private ActorUniqueID actorId;

  private String propertyName;

  private Boolean boolcomponentValue;

  private String stringcomponentValue;

  private Integer intcomponentValue;

  private Double floatcomponentValue;

  public void encode(ByteBuf buf) {
    actorId.encode(buf);
    int __len_propertyName = propertyName != null ? propertyName.length() : 0;
    if (propertyName != null) buf.writeCharSequence(propertyName, StandardCharsets.UTF_8);
    buf.writeBoolean(boolcomponentValue);
    int __len_stringcomponentValue = stringcomponentValue != null ? stringcomponentValue.length() : 0;
    if (stringcomponentValue != null) buf.writeCharSequence(stringcomponentValue, StandardCharsets.UTF_8);
    buf.writeInt(intcomponentValue);
    buf.writeDouble(floatcomponentValue);
  }

  public void decode(ByteBuf buf) {
    actorId = new ActorUniqueID();
    actorId.decode(buf);
    int __len_propertyName = buf.readInt();
    propertyName = buf.readCharSequence(__len_propertyName, java.nio.charset.StandardCharsets.UTF_8).toString();
    boolcomponentValue = buf.readBoolean();
    int __len_stringcomponentValue = buf.readInt();
    stringcomponentValue = buf.readCharSequence(__len_stringcomponentValue, java.nio.charset.StandardCharsets.UTF_8).toString();
    intcomponentValue = buf.readInt();
    floatcomponentValue = buf.readDouble();
  }

  @Override
  public int getPacketId() {
    return 182;
  }
}
