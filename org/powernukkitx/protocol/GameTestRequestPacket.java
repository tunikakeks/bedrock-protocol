package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.BlockPos;
import org.powernukkitx.protocol.types.GameTestRequestPacket_RotationEnum;
import org.powernukkitx.protocol.types.RotationEnum;

@Getter
@Setter
public class GameTestRequestPacket implements IPacket {
  private Integer maxtestsperbatch;

  private Integer repeatcount;

  private GameTestRequestPacket_RotationEnum rotation;

  private Boolean stoponfailure;

  private BlockPos testpos;

  private Integer testsperrow;

  private String testname;

  public void encode(ByteBuf buf) {
    buf.writeInt(maxtestsperbatch);
    buf.writeInt(repeatcount);
    buf.writeByte(rotation.toByte());
    buf.writeBoolean(stoponfailure);
    testpos.encode(buf);
    buf.writeInt(testsperrow);
    int __len_testname = testname != null ? testname.length() : 0;
    if (testname != null) buf.writeCharSequence(testname, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    maxtestsperbatch = buf.readInt();
    repeatcount = buf.readInt();
    rotation = RotationEnum.fromByte(buf.readUnsignedByte());
    stoponfailure = buf.readBoolean();
    testpos = new BlockPos();
    testpos.decode(buf);
    testsperrow = buf.readInt();
    int __len_testname = buf.readInt();
    testname = buf.readCharSequence(__len_testname, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 194;
  }
}
