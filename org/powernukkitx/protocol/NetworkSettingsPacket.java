package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.CompressionalgorithmEnum;
import org.powernukkitx.protocol.types.NetworkSettingsPacket_CompressionAlgorithmEnum;

@Getter
@Setter
public class NetworkSettingsPacket implements IPacket {
  private Integer compressionThreshold;

  private NetworkSettingsPacket_CompressionAlgorithmEnum compressionalgorithm;

  private Boolean clientThrottleEnabled;

  private Integer clientThrottleThreshold;

  private Double clientThrottleScalar;

  public void encode(ByteBuf buf) {
    buf.writeInt(compressionThreshold);
    buf.writeByte(compressionalgorithm.toByte());
    buf.writeBoolean(clientThrottleEnabled);
    buf.writeInt(clientThrottleThreshold);
    buf.writeDouble(clientThrottleScalar);
  }

  public void decode(ByteBuf buf) {
    compressionThreshold = buf.readInt();
    compressionalgorithm = CompressionalgorithmEnum.fromByte(buf.readUnsignedByte());
    clientThrottleEnabled = buf.readBoolean();
    clientThrottleThreshold = buf.readInt();
    clientThrottleScalar = buf.readDouble();
  }

  @Override
  public int getPacketId() {
    return 143;
  }
}
