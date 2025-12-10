package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.GraphicsOverrideParameterPacket_Identifier_for_ParameterEnum;
import org.powernukkitx.protocol.types.IdentifierForParameterEnum;
import org.powernukkitx.protocol.types.ParameterKeyframeValues;

@Getter
@Setter
public class GraphicsOverrideParameterPacket implements IPacket {
  private Object parameterKeyframeValues;

  private String biomeIdentifier;

  private GraphicsOverrideParameterPacket_Identifier_for_ParameterEnum identifierForParameter;

  private Boolean resetParameter;

  public void encode(ByteBuf buf) {
    parameterKeyframeValues.encode(buf);
    int __len_biomeIdentifier = biomeIdentifier != null ? biomeIdentifier.length() : 0;
    if (biomeIdentifier != null) buf.writeCharSequence(biomeIdentifier, StandardCharsets.UTF_8);
    buf.writeInt(identifierForParameter.ordinal());
    buf.writeBoolean(resetParameter);
  }

  public void decode(ByteBuf buf) {
    if (parameterKeyframeValues == null) parameterKeyframeValues = new ParameterKeyframeValues();
    parameterKeyframeValues.decode(buf);
    int __len_biomeIdentifier = buf.readInt();
    biomeIdentifier = buf.readCharSequence(__len_biomeIdentifier, java.nio.charset.StandardCharsets.UTF_8).toString();
    identifierForParameter = IdentifierForParameterEnum.values()[buf.readInt()];
    resetParameter = buf.readBoolean();
  }

  @Override
  public int getPacketId() {
    return 331;
  }
}
