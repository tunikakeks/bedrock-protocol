package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.CreatePhotoPacket_Raw_IDEnum;
import org.powernukkitx.protocol.types.RawIDEnum;

@Getter
@Setter
public class CreatePhotoPacket implements IPacket {
  private CreatePhotoPacket_Raw_IDEnum rawID;

  private String photoName;

  private String photoItemName;

  public void encode(ByteBuf buf) {
    buf.writeInt(rawID.ordinal());
    int __len_photoName = photoName != null ? photoName.length() : 0;
    if (photoName != null) buf.writeCharSequence(photoName, StandardCharsets.UTF_8);
    int __len_photoItemName = photoItemName != null ? photoItemName.length() : 0;
    if (photoItemName != null) buf.writeCharSequence(photoItemName, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    rawID = RawIDEnum.values()[buf.readInt()];
    int __len_photoName = buf.readInt();
    photoName = buf.readCharSequence(__len_photoName, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_photoItemName = buf.readInt();
    photoItemName = buf.readCharSequence(__len_photoItemName, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 171;
  }
}
