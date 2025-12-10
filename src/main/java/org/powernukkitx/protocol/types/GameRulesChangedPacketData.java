package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameRulesChangedPacketData {
  private List<_238291841> rulesList;

  public void encode(ByteBuf buf) {
    buf.writeInt(rulesList != null ? rulesList.size() : 0);
    if (rulesList != null) {
      for (var __v : rulesList) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __size_rulesList = buf.readInt();
    rulesList = new java.util.ArrayList<>(__size_rulesList);
    for (int i = 0; i < __size_rulesList; i++) {
      _238291841 v = new _238291841();
      v.decode(buf);
      rulesList.add(v);
    }
  }
}
