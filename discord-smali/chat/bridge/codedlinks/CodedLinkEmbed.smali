.class public abstract Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008%\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0006R\u0014\u0010\t\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0006R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0006R\u0012\u0010\u0016\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001bR\u0012\u0010\u001e\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u0011R\u0014\u0010 \u001a\u0004\u0018\u00010\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u000eR\u0014\u0010\"\u001a\u0004\u0018\u00010\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u000eR\u0014\u0010$\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\u0006R\u0014\u0010&\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\u0006R\u0014\u0010(\u001a\u0004\u0018\u00010\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010\u001bR\u0014\u0010*\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010\u0006R\u0014\u0010,\u001a\u0004\u0018\u00010\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010\u000eR\u0014\u0010.\u001a\u0004\u0018\u00010\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010\u000eR\u0014\u00100\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00081\u0010\u0006R\u0014\u00102\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00083\u0010\u0006R\u0014\u00104\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00085\u0010\u0006R\u0014\u00106\u001a\u0004\u0018\u00010\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00087\u0010\u000eR\u0014\u00108\u001a\u0004\u0018\u00010\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u0010\u000eR\u0014\u0010:\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010\u0006R\u0014\u0010<\u001a\u0004\u0018\u00010\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010\u000eR\u0014\u0010>\u001a\u0004\u0018\u00010?X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010A\u0082\u0001\u0005CDEFG\u00a8\u0006H"
    }
    d2 = {
        "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;",
        "",
        "()V",
        "acceptLabelBackgroundColor",
        "",
        "getAcceptLabelBackgroundColor",
        "()Ljava/lang/Integer;",
        "acceptLabelBorderColor",
        "getAcceptLabelBorderColor",
        "acceptLabelColor",
        "getAcceptLabelColor",
        "acceptLabelText",
        "",
        "getAcceptLabelText",
        "()Ljava/lang/String;",
        "backgroundColor",
        "getBackgroundColor",
        "()I",
        "bodyText",
        "getBodyText",
        "bodyTextColor",
        "getBodyTextColor",
        "borderColor",
        "getBorderColor",
        "canBeAccepted",
        "",
        "getCanBeAccepted",
        "()Ljava/lang/Boolean;",
        "embedCanBeTapped",
        "getEmbedCanBeTapped",
        "headerColor",
        "getHeaderColor",
        "headerText",
        "getHeaderText",
        "inviteSplash",
        "getInviteSplash",
        "resolvingGradientEnd",
        "getResolvingGradientEnd",
        "resolvingGradientStart",
        "getResolvingGradientStart",
        "splashHasRadialGradient",
        "getSplashHasRadialGradient",
        "splashOpacity",
        "getSplashOpacity",
        "splashUrl",
        "getSplashUrl",
        "subtitle",
        "getSubtitle",
        "subtitleColor",
        "getSubtitleColor",
        "thumbnailBackgroundColor",
        "getThumbnailBackgroundColor",
        "thumbnailCornerRadius",
        "getThumbnailCornerRadius",
        "thumbnailText",
        "getThumbnailText",
        "thumbnailUrl",
        "getThumbnailUrl",
        "titleColor",
        "getTitleColor",
        "titleText",
        "getTitleText",
        "type",
        "Lcom/discord/chat/bridge/codedlinks/InviteType;",
        "getType",
        "()Lcom/discord/chat/bridge/codedlinks/InviteType;",
        "Companion",
        "Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;",
        "Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;",
        "Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;",
        "Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;",
        "Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lyi/f;
    with = Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;->Companion:Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getAcceptLabelBackgroundColor()Ljava/lang/Integer;
.end method

.method public abstract getAcceptLabelBorderColor()Ljava/lang/Integer;
.end method

.method public abstract getAcceptLabelColor()Ljava/lang/Integer;
.end method

.method public abstract getAcceptLabelText()Ljava/lang/String;
.end method

.method public abstract getBackgroundColor()I
.end method

.method public abstract getBodyText()Ljava/lang/String;
.end method

.method public abstract getBodyTextColor()Ljava/lang/Integer;
.end method

.method public abstract getBorderColor()I
.end method

.method public abstract getCanBeAccepted()Ljava/lang/Boolean;
.end method

.method public abstract getEmbedCanBeTapped()Ljava/lang/Boolean;
.end method

.method public abstract getHeaderColor()I
.end method

.method public abstract getHeaderText()Ljava/lang/String;
.end method

.method public abstract getInviteSplash()Ljava/lang/String;
.end method

.method public abstract getResolvingGradientEnd()Ljava/lang/Integer;
.end method

.method public abstract getResolvingGradientStart()Ljava/lang/Integer;
.end method

.method public abstract getSplashHasRadialGradient()Ljava/lang/Boolean;
.end method

.method public abstract getSplashOpacity()Ljava/lang/Integer;
.end method

.method public abstract getSplashUrl()Ljava/lang/String;
.end method

.method public abstract getSubtitle()Ljava/lang/String;
.end method

.method public abstract getSubtitleColor()Ljava/lang/Integer;
.end method

.method public abstract getThumbnailBackgroundColor()Ljava/lang/Integer;
.end method

.method public abstract getThumbnailCornerRadius()Ljava/lang/Integer;
.end method

.method public abstract getThumbnailText()Ljava/lang/String;
.end method

.method public abstract getThumbnailUrl()Ljava/lang/String;
.end method

.method public abstract getTitleColor()Ljava/lang/Integer;
.end method

.method public abstract getTitleText()Ljava/lang/String;
.end method

.method public abstract getType()Lcom/discord/chat/bridge/codedlinks/InviteType;
.end method
