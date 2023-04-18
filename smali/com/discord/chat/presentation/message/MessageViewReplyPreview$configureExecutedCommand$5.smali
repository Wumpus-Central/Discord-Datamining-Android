.class final Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$5;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->configureExecutedCommand-LdU2QRA(Ljava/lang/String;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;ZZZLcom/discord/chat/presentation/events/ChatEventHandler;)V
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


# instance fields
.field final synthetic $executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;


# direct methods
.method constructor <init>(Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$5;->$executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)Lcom/discord/chat/presentation/textutils/LinkStyle;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/discord/chat/bridge/contentnode/LinkContentNode;->getTarget()Ljava/lang/String;

    move-result-object p1

    const-string v0, "usernameOnClick"

    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$5;->$executedCommand:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    invoke-virtual {p1}, Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;->getUsernameColor()I

    move-result p1

    .line 5
    sget-object v0, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    .line 6
    new-instance v1, Lcom/discord/chat/presentation/textutils/LinkStyle;

    invoke-direct {v1, v0, p1}, Lcom/discord/chat/presentation/textutils/LinkStyle;-><init>(Lcom/discord/fonts/DiscordFont;I)V

    goto :goto_0

    .line 7
    :cond_0
    new-instance v1, Lcom/discord/chat/presentation/textutils/LinkStyle;

    sget-object p1, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    const/4 v0, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3, v0, v2}, Lcom/discord/chat/presentation/textutils/LinkStyle;-><init>(Lcom/discord/fonts/DiscordFont;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/bridge/contentnode/LinkContentNode;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$5;->invoke(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)Lcom/discord/chat/presentation/textutils/LinkStyle;

    move-result-object p1

    return-object p1
.end method
