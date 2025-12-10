package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Double;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraPresets {
  private Struct_SharedTypes__Identifier_7_ name;

  private _3640473056 inheritFrom;

  private Double posX;

  private Double posY;

  private Double posZ;

  private Double rotX;

  private Double rotY;

  private Double rotationSpeed;

  private Boolean snapToTarget;

  private Vec2 horizontalRotationLimit;

  private Vec2 verticalRotationLimit;

  private Boolean continueTargeting;

  private Double blockListeningRadius;

  private Vec2 viewOffset;

  private Vec3 entityOffset;

  private Double radius;

  private Double yawLimitMin;

  private Double yawLimitMax;

  private CameraPresets_ListenerEnum listener;

  private Boolean playerEffects;

  private _950654229 aimAssist;

  private CameraPresets_Control_SchemeEnum controlScheme;

  public void encode(ByteBuf buf) {
    name.encode(buf);
    inheritFrom.encode(buf);
    buf.writeDouble(posX);
    buf.writeDouble(posY);
    buf.writeDouble(posZ);
    buf.writeDouble(rotX);
    buf.writeDouble(rotY);
    buf.writeDouble(rotationSpeed);
    buf.writeBoolean(snapToTarget);
    horizontalRotationLimit.encode(buf);
    verticalRotationLimit.encode(buf);
    buf.writeBoolean(continueTargeting);
    buf.writeDouble(blockListeningRadius);
    viewOffset.encode(buf);
    entityOffset.encode(buf);
    buf.writeDouble(radius);
    buf.writeDouble(yawLimitMin);
    buf.writeDouble(yawLimitMax);
    buf.writeByte(listener.toByte());
    buf.writeBoolean(playerEffects);
    aimAssist.encode(buf);
    buf.writeByte(controlScheme.toByte());
  }

  public void decode(ByteBuf buf) {
    name = new Struct_SharedTypes__Identifier_7_();
    name.decode(buf);
    inheritFrom = new _3640473056();
    inheritFrom.decode(buf);
    posX = buf.readDouble();
    posY = buf.readDouble();
    posZ = buf.readDouble();
    rotX = buf.readDouble();
    rotY = buf.readDouble();
    rotationSpeed = buf.readDouble();
    snapToTarget = buf.readBoolean();
    horizontalRotationLimit = new Vec2();
    horizontalRotationLimit.decode(buf);
    verticalRotationLimit = new Vec2();
    verticalRotationLimit.decode(buf);
    continueTargeting = buf.readBoolean();
    blockListeningRadius = buf.readDouble();
    viewOffset = new Vec2();
    viewOffset.decode(buf);
    entityOffset = new Vec3();
    entityOffset.decode(buf);
    radius = buf.readDouble();
    yawLimitMin = buf.readDouble();
    yawLimitMax = buf.readDouble();
    listener = ListenerEnum.fromByte(buf.readUnsignedByte());
    playerEffects = buf.readBoolean();
    aimAssist = new _950654229();
    aimAssist.decode(buf);
    controlScheme = ControlSchemeEnum.fromByte(buf.readUnsignedByte());
  }
}
