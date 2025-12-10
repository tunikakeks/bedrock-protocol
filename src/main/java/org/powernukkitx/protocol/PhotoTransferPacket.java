package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.OwnerIDEnum;
import org.powernukkitx.protocol.types.PhotoTransferPacket_Owner_IDEnum;
import org.powernukkitx.protocol.types.PhotoTransferPacket_Source_TypeEnum;
import org.powernukkitx.protocol.types.PhotoTransferPacket_TypeEnum;
import org.powernukkitx.protocol.types.SourceTypeEnum;
import org.powernukkitx.protocol.types.TypeEnum;

@Getter
@Setter
public class PhotoTransferPacket implements IPacket {
  private String photoName;

  private String photoData;

  private String bookID;

  private PhotoTransferPacket_TypeEnum type;

  private PhotoTransferPacket_Source_TypeEnum sourceType;

  private PhotoTransferPacket_Owner_IDEnum ownerID;

  private String newPhotoName;

  public void encode(ByteBuf buf) {
    int __len_photoName = photoName != null ? photoName.length() : 0;
    if (photoName != null) buf.writeCharSequence(photoName, StandardCharsets.UTF_8);
    int __len_photoData = photoData != null ? photoData.length() : 0;
    if (photoData != null) buf.writeCharSequence(photoData, StandardCharsets.UTF_8);
    int __len_bookID = bookID != null ? bookID.length() : 0;
    if (bookID != null) buf.writeCharSequence(bookID, StandardCharsets.UTF_8);
    buf.writeInt(type.ordinal());
    buf.writeInt(sourceType.ordinal());
    buf.writeInt(ownerID.ordinal());
    int __len_newPhotoName = newPhotoName != null ? newPhotoName.length() : 0;
    if (newPhotoName != null) buf.writeCharSequence(newPhotoName, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    int __len_photoName = buf.readInt();
    photoName = buf.readCharSequence(__len_photoName, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_photoData = buf.readInt();
    photoData = buf.readCharSequence(__len_photoData, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_bookID = buf.readInt();
    bookID = buf.readCharSequence(__len_bookID, java.nio.charset.StandardCharsets.UTF_8).toString();
    type = TypeEnum.values()[buf.readInt()];
    sourceType = SourceTypeEnum.values()[buf.readInt()];
    ownerID = OwnerIDEnum.values()[buf.readInt()];
    int __len_newPhotoName = buf.readInt();
    newPhotoName = buf.readCharSequence(__len_newPhotoName, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 99;
  }
}
