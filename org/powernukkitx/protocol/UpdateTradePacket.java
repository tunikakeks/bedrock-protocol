package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorUniqueID;
import org.powernukkitx.protocol.types._4158325036;

@Getter
@Setter
public class UpdateTradePacket implements IPacket {
  private Integer containerId;

  private Integer type;

  private Integer size;

  private Integer traderTier;

  private ActorUniqueID entityUniqueId;

  private ActorUniqueID lastTradingPlayer;

  private String displayName;

  private Boolean useNewTradeScreen;

  private Boolean usingEconomyTrade;

  private _4158325036 data;

  public void encode(ByteBuf buf) {
    buf.writeInt(containerId);
    buf.writeInt(type);
    buf.writeInt(size);
    buf.writeInt(traderTier);
    entityUniqueId.encode(buf);
    lastTradingPlayer.encode(buf);
    int __len_displayName = displayName != null ? displayName.length() : 0;
    if (displayName != null) buf.writeCharSequence(displayName, StandardCharsets.UTF_8);
    buf.writeBoolean(useNewTradeScreen);
    buf.writeBoolean(usingEconomyTrade);
    data.encode(buf);
  }

  public void decode(ByteBuf buf) {
    containerId = buf.readInt();
    type = buf.readInt();
    size = buf.readInt();
    traderTier = buf.readInt();
    entityUniqueId = new ActorUniqueID();
    entityUniqueId.decode(buf);
    lastTradingPlayer = new ActorUniqueID();
    lastTradingPlayer.decode(buf);
    int __len_displayName = buf.readInt();
    displayName = buf.readCharSequence(__len_displayName, java.nio.charset.StandardCharsets.UTF_8).toString();
    useNewTradeScreen = buf.readBoolean();
    usingEconomyTrade = buf.readBoolean();
    data = new _4158325036();
    data.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 80;
  }
}
