package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.Mce__UUID;
import org.powernukkitx.protocol.types.RedirectTypeEnum;
import org.powernukkitx.protocol.types.ShowStoreOfferPacket_Redirect_TypeEnum;

@Getter
@Setter
public class ShowStoreOfferPacket implements IPacket {
  private Mce__UUID offerId;

  private ShowStoreOfferPacket_Redirect_TypeEnum redirectType;

  public void encode(ByteBuf buf) {
    offerId.encode(buf);
    buf.writeByte(redirectType.toByte());
  }

  public void decode(ByteBuf buf) {
    offerId = new Mce__UUID();
    offerId.decode(buf);
    redirectType = RedirectTypeEnum.fromByte(buf.readUnsignedByte());
  }

  @Override
  public int getPacketId() {
    return 91;
  }
}
