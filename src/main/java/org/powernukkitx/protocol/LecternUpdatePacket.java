package org.powernukkitx.protocol;

import io.netty.buffer.ByteBuf;
import java.lang.Integer;
import java.lang.Override;
import lombok.Getter;
import lombok.Setter;
import org.powernukkitx.protocol.types.NetworkBlockPosition;

@Getter
@Setter
public class LecternUpdatePacket implements IPacket {
  private Integer newPageToShow;

  private Integer totalPages;

  private NetworkBlockPosition positionOfLecternToUpdate;

  public void encode(ByteBuf buf) {
    buf.writeInt(newPageToShow);
    buf.writeInt(totalPages);
    positionOfLecternToUpdate.encode(buf);
  }

  public void decode(ByteBuf buf) {
    newPageToShow = buf.readInt();
    totalPages = buf.readInt();
    positionOfLecternToUpdate = new NetworkBlockPosition();
    positionOfLecternToUpdate.decode(buf);
  }

  @Override
  public int getPacketId() {
    return 125;
  }
}
