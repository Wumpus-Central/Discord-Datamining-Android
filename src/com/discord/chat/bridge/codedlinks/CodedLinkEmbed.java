package com.discord.chat.bridge.codedlinks;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import p450yi.AbstractC14370f;

@AbstractC14370f(with = CodedLinkSerializer.class)
@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u0012\u0010\u0016\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0012\u0010\u001e\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u0014\u0010 \u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u000eR\u0014\u0010\"\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u000eR\u0014\u0010$\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001bR\u0014\u0010*\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u000eR\u0014\u0010.\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u000eR\u0014\u00100\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u000eR\u0014\u00108\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u000eR\u0014\u0010:\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0006R\u0014\u0010<\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u000eR\u0014\u0010>\u001a\u0004\u0018\u00010?X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A\u0082\u0001\u0005CDEFG¨\u0006H"}, m15073d2 = {"Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "", "()V", "acceptLabelBackgroundColor", "", "getAcceptLabelBackgroundColor", "()Ljava/lang/Integer;", "acceptLabelBorderColor", "getAcceptLabelBorderColor", "acceptLabelColor", "getAcceptLabelColor", "acceptLabelText", "", "getAcceptLabelText", "()Ljava/lang/String;", ViewProps.BACKGROUND_COLOR, "getBackgroundColor", "()I", "bodyText", "getBodyText", "bodyTextColor", "getBodyTextColor", ViewProps.BORDER_COLOR, "getBorderColor", "canBeAccepted", "", "getCanBeAccepted", "()Ljava/lang/Boolean;", "embedCanBeTapped", "getEmbedCanBeTapped", "headerColor", "getHeaderColor", "headerText", "getHeaderText", "inviteSplash", "getInviteSplash", "resolvingGradientEnd", "getResolvingGradientEnd", "resolvingGradientStart", "getResolvingGradientStart", "splashHasRadialGradient", "getSplashHasRadialGradient", "splashOpacity", "getSplashOpacity", "splashUrl", "getSplashUrl", "subtitle", "getSubtitle", "subtitleColor", "getSubtitleColor", "thumbnailBackgroundColor", "getThumbnailBackgroundColor", "thumbnailCornerRadius", "getThumbnailCornerRadius", "thumbnailText", "getThumbnailText", "thumbnailUrl", "getThumbnailUrl", "titleColor", "getTitleColor", "titleText", "getTitleText", "type", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "getType", "()Lcom/discord/chat/bridge/codedlinks/InviteType;", "Companion", "Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public abstract class CodedLinkEmbed {
    public static final Companion Companion = new Companion(null);

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CodedLinkEmbed> serializer() {
            return CodedLinkSerializer.INSTANCE;
        }
    }

    private CodedLinkEmbed() {
    }

    public /* synthetic */ CodedLinkEmbed(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Integer getAcceptLabelBackgroundColor();

    public abstract Integer getAcceptLabelBorderColor();

    public abstract Integer getAcceptLabelColor();

    public abstract String getAcceptLabelText();

    public abstract int getBackgroundColor();

    public abstract String getBodyText();

    public abstract Integer getBodyTextColor();

    public abstract int getBorderColor();

    public abstract Boolean getCanBeAccepted();

    public abstract Boolean getEmbedCanBeTapped();

    public abstract int getHeaderColor();

    public abstract String getHeaderText();

    public abstract String getInviteSplash();

    public abstract Integer getResolvingGradientEnd();

    public abstract Integer getResolvingGradientStart();

    public abstract Boolean getSplashHasRadialGradient();

    public abstract Integer getSplashOpacity();

    public abstract String getSplashUrl();

    public abstract String getSubtitle();

    public abstract Integer getSubtitleColor();

    public abstract Integer getThumbnailBackgroundColor();

    public abstract Integer getThumbnailCornerRadius();

    public abstract String getThumbnailText();

    public abstract String getThumbnailUrl();

    public abstract Integer getTitleColor();

    public abstract String getTitleText();

    public abstract InviteType getType();
}
