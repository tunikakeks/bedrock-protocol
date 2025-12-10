package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraInstruction {
  private _22859905 set;

  private Boolean clear;

  private _3776911233 fade;

  private _3785693680 target;

  private Boolean removetarget;

  private _1293790908 fieldofview;

  private _3931859532 spline;

  private _311463350 attachtoentity;

  private Boolean detachfromentity;

  public void encode(ByteBuf buf) {
    set.encode(buf);
    buf.writeBoolean(clear);
    fade.encode(buf);
    target.encode(buf);
    buf.writeBoolean(removetarget);
    fieldofview.encode(buf);
    spline.encode(buf);
    attachtoentity.encode(buf);
    buf.writeBoolean(detachfromentity);
  }

  public void decode(ByteBuf buf) {
    set = new _22859905();
    set.decode(buf);
    clear = buf.readBoolean();
    fade = new _3776911233();
    fade.decode(buf);
    target = new _3785693680();
    target.decode(buf);
    removetarget = buf.readBoolean();
    fieldofview = new _1293790908();
    fieldofview.decode(buf);
    spline = new _3931859532();
    spline.decode(buf);
    attachtoentity = new _311463350();
    attachtoentity.decode(buf);
    detachfromentity = buf.readBoolean();
  }
}
