package org.powernukkitx.protocol.types;

import io.netty.buffer.ByteBuf;
import java.lang.Boolean;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EducationLevelSettings {
  private String codeBuilderDefaultURI;

  private String codeBuilderTitle;

  private Boolean canResizeCodeBuilder;

  private Boolean disableLegacyTitleBar;

  private String postProcessFilter;

  private String screenshotBorderResourcePath;

  private _899239475 agentCapabilities;

  private _3861729832 localSettings;

  private Boolean deprecatedAlwaysFalse;

  private _1442396934 externalLinkSettings;

  public void encode(ByteBuf buf) {
    int __len_codeBuilderDefaultURI = codeBuilderDefaultURI != null ? codeBuilderDefaultURI.length() : 0;
    if (codeBuilderDefaultURI != null) buf.writeCharSequence(codeBuilderDefaultURI, StandardCharsets.UTF_8);
    int __len_codeBuilderTitle = codeBuilderTitle != null ? codeBuilderTitle.length() : 0;
    if (codeBuilderTitle != null) buf.writeCharSequence(codeBuilderTitle, StandardCharsets.UTF_8);
    buf.writeBoolean(canResizeCodeBuilder);
    buf.writeBoolean(disableLegacyTitleBar);
    int __len_postProcessFilter = postProcessFilter != null ? postProcessFilter.length() : 0;
    if (postProcessFilter != null) buf.writeCharSequence(postProcessFilter, StandardCharsets.UTF_8);
    int __len_screenshotBorderResourcePath = screenshotBorderResourcePath != null ? screenshotBorderResourcePath.length() : 0;
    if (screenshotBorderResourcePath != null) buf.writeCharSequence(screenshotBorderResourcePath, StandardCharsets.UTF_8);
    agentCapabilities.encode(buf);
    localSettings.encode(buf);
    buf.writeBoolean(deprecatedAlwaysFalse);
    externalLinkSettings.encode(buf);
  }

  public void decode(ByteBuf buf) {
    int __len_codeBuilderDefaultURI = buf.readInt();
    codeBuilderDefaultURI = buf.readCharSequence(__len_codeBuilderDefaultURI, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_codeBuilderTitle = buf.readInt();
    codeBuilderTitle = buf.readCharSequence(__len_codeBuilderTitle, java.nio.charset.StandardCharsets.UTF_8).toString();
    canResizeCodeBuilder = buf.readBoolean();
    disableLegacyTitleBar = buf.readBoolean();
    int __len_postProcessFilter = buf.readInt();
    postProcessFilter = buf.readCharSequence(__len_postProcessFilter, java.nio.charset.StandardCharsets.UTF_8).toString();
    int __len_screenshotBorderResourcePath = buf.readInt();
    screenshotBorderResourcePath = buf.readCharSequence(__len_screenshotBorderResourcePath, java.nio.charset.StandardCharsets.UTF_8).toString();
    agentCapabilities = new _899239475();
    agentCapabilities.decode(buf);
    localSettings = new _3861729832();
    localSettings.decode(buf);
    deprecatedAlwaysFalse = buf.readBoolean();
    externalLinkSettings = new _1442396934();
    externalLinkSettings.decode(buf);
  }
}
