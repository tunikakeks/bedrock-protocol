package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.FormIDEnum;
import org.powernukkitx.protocol.types.ServerSettingsResponsePacket_Form_IDEnum;

@Getter
@Setter
public class ServerSettingsResponsePacket implements IPacket {
  private ServerSettingsResponsePacket_Form_IDEnum formID;

  private String formUIJSON;

  public void encode(ByteBuf buf) {
    buf.writeInt(formID.ordinal());
    int __len_formUIJSON = formUIJSON != null ? formUIJSON.length() : 0;
    if (formUIJSON != null) buf.writeCharSequence(formUIJSON, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    formID = FormIDEnum.values()[buf.readInt()];
    int __len_formUIJSON = buf.readInt();
    formUIJSON = buf.readCharSequence(__len_formUIJSON, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 103;
  }
}
