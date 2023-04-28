.class final Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$12;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;->configureMessageContent(Lcom/discord/chat/bridge/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "Lcom/discord/chat/presentation/textutils/LinkStyle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/chat/presentation/textutils/LinkStyle;",
        "it",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$12;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$12;

    invoke-direct {v0}, Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$12;-><init>()V

    sput-object v0, Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$12;->INSTANCE:Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$12;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)Lcom/discord/chat/presentation/textutils/LinkStyle;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lcom/discord/chat/presentation/textutils/LinkStyle;

    .line 3
    sget-object v0, Lcom/discord/fonts/DiscordFont;->PrimaryNormal:Lcom/discord/fonts/DiscordFont;

    .line 4
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getTextNormal()I

    move-result v1

    .line 5
    invoke-direct {p1, v0, v1}, Lcom/discord/chat/presentation/textutils/LinkStyle;-><init>(Lcom/discord/fonts/DiscordFont;I)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/bridge/contentnode/LinkContentNode;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$12;->invoke(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)Lcom/discord/chat/presentation/textutils/LinkStyle;

    move-result-object p1

    return-object p1
.end method
