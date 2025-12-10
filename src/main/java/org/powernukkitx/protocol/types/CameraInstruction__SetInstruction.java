package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction__SetInstruction {
  private Integer preset;

  private _2528270022 ease;

  private _4108615044 pos;

  private _1279771591 rot;

  private _1386558 facing;

  private _3822099314 viewOffset;

  private _2532313488 entityOffset;

  private Boolean default_;

  private Boolean removeignorestartingvaluescomponent;

  public void encode(ByteBuf buf) {
    buf.writeInt(preset);
    ease.encode(buf);
    pos.encode(buf);
    rot.encode(buf);
    facing.encode(buf);
    viewOffset.encode(buf);
    entityOffset.encode(buf);
    buf.writeBoolean(default_);
    buf.writeBoolean(removeignorestartingvaluescomponent);
  }

  public void decode(ByteBuf buf) {
    preset = buf.readInt();
    ease = new _2528270022();
    ease.decode(buf);
    pos = new _4108615044();
    pos.decode(buf);
    rot = new _1279771591();
    rot.decode(buf);
    facing = new _1386558();
    facing.decode(buf);
    viewOffset = new _3822099314();
    viewOffset.decode(buf);
    entityOffset = new _2532313488();
    entityOffset.decode(buf);
    default_ = buf.readBoolean();
    removeignorestartingvaluescomponent = buf.readBoolean();
  }
}
