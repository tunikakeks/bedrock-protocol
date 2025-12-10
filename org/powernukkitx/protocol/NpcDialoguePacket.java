package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.NpcDialogueActionTypeEnum;
import org.powernukkitx.protocol.types.NpcDialoguePacket_Npc_Dialogue_Action_TypeEnum;

@Getter
@Setter
public class NpcDialoguePacket implements IPacket {
  private Long npcIdRawId;

  private NpcDialoguePacket_Npc_Dialogue_Action_TypeEnum npcDialogueActionType;

  private String dialogue;

  private String sceneName;

  private String npcName;

  private String actionJSON;

  public void encode(ByteBuf buf) {
    buf.writeLong(npcIdRawId);
    buf.writeByte(npcDialogueActionType.toByte());
    int __len_dialogue = dialogue != null ? dialogue.length() : 0;
    if (dialogue != null) buf.writeCharSequence(dialogue, StandardCharsets.UTF_8);
    int __len_sceneName = sceneName != null ? sceneName.length() : 0;
    if (sceneName != null) buf.writeCharSequence(sceneName, StandardCharsets.UTF_8);
    int __len_npcName = npcName != null ? npcName.length() : 0;
    if (npcName != null) buf.writeCharSequence(npcName, StandardCharsets.UTF_8);
    int __len_actionJSON = actionJSON != null ? actionJSON.length() : 0;
    if (actionJSON != null) buf.writeCharSequence(actionJSON, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    npcIdRawId = buf.readLong();
    npcDialogueActionType = NpcDialogueActionTypeEnum.fromByte(buf.readUnsignedByte());
    int __len_dialogue = buf.readInt();
    dialogue = buf.readCharSequence(__len_dialogue, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_sceneName = buf.readInt();
    sceneName = buf.readCharSequence(__len_sceneName, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_npcName = buf.readInt();
    npcName = buf.readCharSequence(__len_npcName, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_actionJSON = buf.readInt();
    actionJSON = buf.readCharSequence(__len_actionJSON, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 169;
  }
}
