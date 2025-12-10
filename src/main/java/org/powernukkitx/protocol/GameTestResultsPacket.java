package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameTestResultsPacket implements IPacket {
  private Boolean succeeded;

  private String error;

  private String testname;

  public void encode(ByteBuf buf) {
    buf.writeBoolean(succeeded);
    int __len_error = error != null ? error.length() : 0;
    if (error != null) buf.writeCharSequence(error, StandardCharsets.UTF_8);
    int __len_testname = testname != null ? testname.length() : 0;
    if (testname != null) buf.writeCharSequence(testname, StandardCharsets.UTF_8);
  }

  public void decode(ByteBuf buf) {
    succeeded = buf.readBoolean();
    int __len_error = buf.readInt();
    error = buf.readCharSequence(__len_error, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_testname = buf.readInt();
    testname = buf.readCharSequence(__len_testname, java.nio.charset.StandardCharsets.UTF_8).toString();
  }

  @Override
  public int getPacketId() {
    return 195;
  }
}
