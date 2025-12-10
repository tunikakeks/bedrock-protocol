package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.ActorRuntimeID;

@Getter
@Setter
public class AnimateEntityPacket implements IPacket {
  private String manimation;

  private String mnextstate;

  private String mstopexpression;

  private Integer mstopexpressionversion;

  private String mcontroller;

  private Double mblendouttime;

  private List<ActorRuntimeID> mruntimeids;

  public void encode(ByteBuf buf) {
    int __len_manimation = manimation != null ? manimation.length() : 0;
    if (manimation != null) buf.writeCharSequence(manimation, StandardCharsets.UTF_8);
    int __len_mnextstate = mnextstate != null ? mnextstate.length() : 0;
    if (mnextstate != null) buf.writeCharSequence(mnextstate, StandardCharsets.UTF_8);
    int __len_mstopexpression = mstopexpression != null ? mstopexpression.length() : 0;
    if (mstopexpression != null) buf.writeCharSequence(mstopexpression, StandardCharsets.UTF_8);
    buf.writeInt(mstopexpressionversion);
    int __len_mcontroller = mcontroller != null ? mcontroller.length() : 0;
    if (mcontroller != null) buf.writeCharSequence(mcontroller, StandardCharsets.UTF_8);
    buf.writeDouble(mblendouttime);
    buf.writeInt(mruntimeids != null ? mruntimeids.size() : 0);
    if (mruntimeids != null) {
      for (var __v : mruntimeids) {
        __v.encode(buf);
      }
    }
  }

  public void decode(ByteBuf buf) {
    int __len_manimation = buf.readInt();
    manimation = buf.readCharSequence(__len_manimation, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_mnextstate = buf.readInt();
    mnextstate = buf.readCharSequence(__len_mnextstate, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_mstopexpression = buf.readInt();
    mstopexpression = buf.readCharSequence(__len_mstopexpression, java.nio.charset.StandardCharsets.UTF_8).toString();
    mstopexpressionversion = buf.readInt();
    int __len_mcontroller = buf.readInt();
    mcontroller = buf.readCharSequence(__len_mcontroller, java.nio.charset.StandardCharsets.UTF_8).toString();
    mblendouttime = buf.readDouble();
    int __size_mruntimeids = buf.readInt();
    mruntimeids = new java.util.ArrayList<>(__size_mruntimeids);
    for (int i = 0; i < __size_mruntimeids; i++) {
      ActorRuntimeID v = new ActorRuntimeID();
      v.decode(buf);
      mruntimeids.add(v);
    }
  }

  @Override
  public int getPacketId() {
    return 158;
  }
}
