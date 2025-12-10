package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeathCauseMessageType {
  private String deathCauseAttackName;

  private List<String> deathCauseMessageList;

  public void encode(ByteBuf buf) {
    int __len_deathCauseAttackName = deathCauseAttackName != null ? deathCauseAttackName.length() : 0;
    if (deathCauseAttackName != null) buf.writeCharSequence(deathCauseAttackName, StandardCharsets.UTF_8);
    buf.writeInt(deathCauseMessageList != null ? deathCauseMessageList.size() : 0);
    if (deathCauseMessageList != null) {
      for (var __v : deathCauseMessageList) {
        buf.writeInt(__v != null ? __v.length() : 0);
        if (__v != null) buf.writeCharSequence(__v, StandardCharsets.UTF_8);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __len_deathCauseAttackName = buf.readInt();
    deathCauseAttackName = buf.readCharSequence(__len_deathCauseAttackName, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __size_deathCauseMessageList = buf.readInt();
    deathCauseMessageList = new java.util.ArrayList<>(__size_deathCauseMessageList);
    for (int i = 0; i < __size_deathCauseMessageList; i++) {
      int __len_deathCauseMessageList_item = buf.readInt();
      deathCauseMessageList.add(buf.readCharSequence(__len_deathCauseMessageList_item, java.nio.charset.StandardCharsets.UTF_8).toString());
    }
  }
}
