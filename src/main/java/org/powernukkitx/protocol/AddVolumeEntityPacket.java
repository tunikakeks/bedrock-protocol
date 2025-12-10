package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.DimensionType;
import org.powernukkitx.protocol.types.EntityNetId;
import org.powernukkitx.protocol.types.NetworkBlockPosition;
import org.powernukkitx.protocol.types._4158325036;

@Getter
@Setter
public class AddVolumeEntityPacket implements IPacket {
  private EntityNetId entityNetworkId;

  private _4158325036 components;

  private String jsonIdentifier;

  private String instanceName;

  private NetworkBlockPosition minBounds;

  private NetworkBlockPosition maxBounds;

  private DimensionType dimensionType;

  private String engineVersion;

  public void encode(ByteBuf buf) {
    entityNetworkId.encode(buf);
    components.encode(buf);
    int __len_jsonIdentifier = jsonIdentifier != null ? jsonIdentifier.length() : 0;
    if (jsonIdentifier != null) buf.writeCharSequence(jsonIdentifier, StandardCharsets.UTF_8);
    int __len_instanceName = instanceName != null ? instanceName.length() : 0;
    if (instanceName != null) buf.writeCharSequence(instanceName, StandardCharsets.UTF_8);
    minBounds.encode(buf);
    maxBounds.encode(buf);
    dimensionType.encode(buf);
    int __len_engineVersion = engineVersion != null ? engineVersion.length() : 0;
    if (engineVersion != null) buf.writeCharSequence(engineVersion, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    entityNetworkId = new EntityNetId();
    entityNetworkId.decode(buf);
    components = new _4158325036();
    components.decode(buf);
    int __len_jsonIdentifier = buf.readInt();
    jsonIdentifier = buf.readCharSequence(__len_jsonIdentifier, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_instanceName = buf.readInt();
    instanceName = buf.readCharSequence(__len_instanceName, java.nio.charset.StandardCharsets.UTF_8).toString();
    minBounds = new NetworkBlockPosition();
    minBounds.decode(buf);
    maxBounds = new NetworkBlockPosition();
    maxBounds.decode(buf);
    dimensionType = new DimensionType();
    dimensionType.decode(buf);
    int __len_engineVersion = buf.readInt();
    engineVersion = buf.readCharSequence(__len_engineVersion, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 166;
  }
}
