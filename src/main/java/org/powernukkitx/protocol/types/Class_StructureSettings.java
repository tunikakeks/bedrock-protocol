package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Class_StructureSettings {
  private String structurePaletteName;

  private Boolean shouldIgnoreEntities;

  private Boolean shouldIgnoreBlocks;

  private Boolean shouldAllowNonTickingPlayerAndTickingAreaChunks;

  private NetworkBlockPosition structureSize;

  private NetworkBlockPosition structureOffset;

  private ActorUniqueID lastEditPlayer;

  private Class_StructureSettings_RotationEnum rotation;

  private Class_StructureSettings_MirrorEnum mirror;

  private Class_StructureSettings_Animation_ModeEnum animationMode;

  private Double animationSeconds;

  private Double integrityValue;

  private Integer integritySeed;

  private Vec3 rotationPivot;

  public void encode(ByteBuf buf) {
    int __len_structurePaletteName = structurePaletteName != null ? structurePaletteName.length() : 0;
    if (structurePaletteName != null) buf.writeCharSequence(structurePaletteName, StandardCharsets.UTF_8);
    buf.writeBoolean(shouldIgnoreEntities);
    buf.writeBoolean(shouldIgnoreBlocks);
    buf.writeBoolean(shouldAllowNonTickingPlayerAndTickingAreaChunks);
    structureSize.encode(buf);
    structureOffset.encode(buf);
    lastEditPlayer.encode(buf);
    buf.writeInt(rotation.ordinal());
    buf.writeInt(mirror.ordinal());
    buf.writeInt(animationMode.ordinal());
    buf.writeDouble(animationSeconds);
    buf.writeDouble(integrityValue);
    buf.writeInt(integritySeed);
    rotationPivot.encode(buf);
  }

  public void decode(ByteBuf buf) {
    int __len_structurePaletteName = buf.readInt();
    structurePaletteName = buf.readCharSequence(__len_structurePaletteName, java.nio.charset.StandardCharsets.UTF_8).toString();
    shouldIgnoreEntities = buf.readBoolean();
    shouldIgnoreBlocks = buf.readBoolean();
    shouldAllowNonTickingPlayerAndTickingAreaChunks = buf.readBoolean();
    structureSize = new NetworkBlockPosition();
    structureSize.decode(buf);
    structureOffset = new NetworkBlockPosition();
    structureOffset.decode(buf);
    lastEditPlayer = new ActorUniqueID();
    lastEditPlayer.decode(buf);
    rotation = RotationEnum.values()[buf.readInt()];
    mirror = MirrorEnum.values()[buf.readInt()];
    animationMode = AnimationModeEnum.values()[buf.readInt()];
    animationSeconds = buf.readDouble();
    integrityValue = buf.readDouble();
    integritySeed = buf.readInt();
    rotationPivot = new Vec3();
    rotationPivot.decode(buf);
  }
}
