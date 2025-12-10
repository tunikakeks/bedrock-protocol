package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.PacketViolationWarningPacket_Violation_PacketIdEnum;
import org.powernukkitx.protocol.types.PacketViolationWarningPacket_Violation_SeverityEnum;
import org.powernukkitx.protocol.types.PacketViolationWarningPacket_Violation_TypeEnum;
import org.powernukkitx.protocol.types.ViolationPacketIdEnum;
import org.powernukkitx.protocol.types.ViolationSeverityEnum;
import org.powernukkitx.protocol.types.ViolationTypeEnum;

@Getter
@Setter
public class PacketViolationWarningPacket implements IPacket {
  private PacketViolationWarningPacket_Violation_TypeEnum violationType;

  private PacketViolationWarningPacket_Violation_SeverityEnum violationSeverity;

  private PacketViolationWarningPacket_Violation_PacketIdEnum violationPacketId;

  private String violationContext;

  public void encode(ByteBuf buf) {
    buf.writeInt(violationType.ordinal());
    buf.writeInt(violationSeverity.ordinal());
    buf.writeInt(violationPacketId.ordinal());
    int __len_violationContext = violationContext != null ? violationContext.length() : 0;
    if (violationContext != null) buf.writeCharSequence(violationContext, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    violationType = ViolationTypeEnum.values()[buf.readInt()];
    violationSeverity = ViolationSeverityEnum.values()[buf.readInt()];
    violationPacketId = ViolationPacketIdEnum.values()[buf.readInt()];
    int __len_violationContext = buf.readInt();
    violationContext = buf.readCharSequence(__len_violationContext, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 156;
  }
}
