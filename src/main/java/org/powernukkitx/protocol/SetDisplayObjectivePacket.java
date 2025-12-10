package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetDisplayObjectivePacket implements IPacket {
  private String displayslotname;

  private String objectivename;

  private String objectivedisplayname;

  private String criterianame;

  private Integer sortorder;

  public void encode(ByteBuf buf) {
    int __len_displayslotname = displayslotname != null ? displayslotname.length() : 0;
    if (displayslotname != null) buf.writeCharSequence(displayslotname, StandardCharsets.UTF_8);
    int __len_objectivename = objectivename != null ? objectivename.length() : 0;
    if (objectivename != null) buf.writeCharSequence(objectivename, StandardCharsets.UTF_8);
    int __len_objectivedisplayname = objectivedisplayname != null ? objectivedisplayname.length() : 0;
    if (objectivedisplayname != null) buf.writeCharSequence(objectivedisplayname, StandardCharsets.UTF_8);
    int __len_criterianame = criterianame != null ? criterianame.length() : 0;
    if (criterianame != null) buf.writeCharSequence(criterianame, StandardCharsets.UTF_8);
    buf.writeInt(sortorder);
  }

  public void decode(ByteBuf buf) {
    int __len_displayslotname = buf.readInt();
    displayslotname = buf.readCharSequence(__len_displayslotname, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_objectivename = buf.readInt();
    objectivename = buf.readCharSequence(__len_objectivename, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_objectivedisplayname = buf.readInt();
    objectivedisplayname = buf.readCharSequence(__len_objectivedisplayname, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_criterianame = buf.readInt();
    criterianame = buf.readCharSequence(__len_criterianame, java.nio.charset.StandardCharsets.UTF_8).toString();
    sortorder = buf.readInt();
  }

  @Override
  public int getPacketId() {
    return 107;
  }
}
