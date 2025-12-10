package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.CommandOriginData;
import org.powernukkitx.protocol.types.CommandRequestPacket_VersionEnum;
import org.powernukkitx.protocol.types.VersionEnum;

@Getter
@Setter
public class CommandRequestPacket implements IPacket {
  private String command;

  private CommandOriginData origin;

  private Boolean isinternal;

  private CommandRequestPacket_VersionEnum version;

  public void encode(ByteBuf buf) {
    int __len_command = command != null ? command.length() : 0;
    if (command != null) buf.writeCharSequence(command, StandardCharsets.UTF_8);
    origin.encode(buf);
    buf.writeBoolean(isinternal);
    buf.writeByte(version.toByte());
  }

  public void decode(ByteBuf buf) {
    int __len_command = buf.readInt();
    command = buf.readCharSequence(__len_command, java.nio.charset.StandardCharsets.UTF_8).toString();
    origin = new CommandOriginData();
    origin.decode(buf);
    isinternal = buf.readBoolean();
    version = VersionEnum.fromByte(buf.readUnsignedByte());
  }

  @Override
  public int getPacketId() {
    return 77;
  }
}
