package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;
import org.powernukkitx.protocol.types.NpcRequestPacket_Request_TypeEnum;
import org.powernukkitx.protocol.types.RequestTypeEnum;

@Getter
@Setter
public class NpcRequestPacket implements IPacket {
  private ActorRuntimeID npcRuntimeID;

  private NpcRequestPacket_Request_TypeEnum requestType;

  private String actions;

  private Integer actionIndex;

  private String sceneName;

  public void encode(ByteBuf buf) {
    npcRuntimeID.encode(buf);
    buf.writeInt(requestType.ordinal());
    int __len_actions = actions != null ? actions.length() : 0;
    if (actions != null) buf.writeCharSequence(actions, StandardCharsets.UTF_8);
    buf.writeInt(actionIndex);
    int __len_sceneName = sceneName != null ? sceneName.length() : 0;
    if (sceneName != null) buf.writeCharSequence(sceneName, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    npcRuntimeID = new ActorRuntimeID();
    npcRuntimeID.decode(buf);
    requestType = RequestTypeEnum.values()[buf.readInt()];
    int __len_actions = buf.readInt();
    actions = buf.readCharSequence(__len_actions, java.nio.charset.StandardCharsets.UTF_8).toString();
    actionIndex = buf.readInt();
    int __len_sceneName = buf.readInt();
    sceneName = buf.readCharSequence(__len_sceneName, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 98;
  }
}
