package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.UpdateSoftEnumPacket_Update_TypeEnum;
import org.powernukkitx.protocol.types.UpdateTypeEnum;

@Getter
@Setter
public class UpdateSoftEnumPacket implements IPacket {
  private String enumName;

  private List<String> values;

  private UpdateSoftEnumPacket_Update_TypeEnum updateType;

  public void encode(ByteBuf buf) {
    int __len_enumName = enumName != null ? enumName.length() : 0;
    if (enumName != null) buf.writeCharSequence(enumName, StandardCharsets.UTF_8);
    buf.writeInt(values != null ? values.size() : 0);
    if (values != null) {
      for (var __v : values) {
        buf.writeInt(__v != null ? __v.length() : 0);
        if (__v != null) buf.writeCharSequence(__v, StandardCharsets.UTF_8);
      }
    }
    buf.writeByte(updateType.toByte());
  }

  public void decode(ByteBuf buf) {
    int __len_enumName = buf.readInt();
    enumName = buf.readCharSequence(__len_enumName, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __size_values = buf.readInt();
    values = new java.util.ArrayList<>(__size_values);
    for (int i = 0; i < __size_values; i++) {
      int __len_values_item = buf.readInt();
      values.add(buf.readCharSequence(__len_values_item, java.nio.charset.StandardCharsets.UTF_8).toString());
    }
    updateType = UpdateTypeEnum.fromByte(buf.readUnsignedByte());
  }

  @Override
  public int getPacketId() {
    return 114;
  }
}
