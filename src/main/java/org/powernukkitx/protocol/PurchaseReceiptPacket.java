package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseReceiptPacket implements IPacket {
  private List<String> purchasereceipts;

  public void encode(ByteBuf buf) {
    buf.writeInt(purchasereceipts != null ? purchasereceipts.size() : 0);
    if (purchasereceipts != null) {
      for (var __v : purchasereceipts) {
        buf.writeInt(__v != null ? __v.length() : 0);
        if (__v != null) buf.writeCharSequence(__v, StandardCharsets.UTF_8);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __size_purchasereceipts = buf.readInt();
    purchasereceipts = new java.util.ArrayList<>(__size_purchasereceipts);
    for (int i = 0; i < __size_purchasereceipts; i++) {
      int __len_purchasereceipts_item = buf.readInt();
      purchasereceipts.add(buf.readCharSequence(__len_purchasereceipts_item, java.nio.charset.StandardCharsets.UTF_8).toString());
    }
  }

  @Override
  public int getPacketId() {
    return 92;
  }
}
