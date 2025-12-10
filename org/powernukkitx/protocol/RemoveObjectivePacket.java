package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RemoveObjectivePacket implements IPacket {
  private String objectiveName;

  public void encode(ByteBuf buf) {
    int __len_objectiveName = objectiveName != null ? objectiveName.length() : 0;
    if (objectiveName != null) buf.writeCharSequence(objectiveName, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_objectiveName = buf.readInt();
    objectiveName = buf.readCharSequence(__len_objectiveName, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 106;
  }
}
