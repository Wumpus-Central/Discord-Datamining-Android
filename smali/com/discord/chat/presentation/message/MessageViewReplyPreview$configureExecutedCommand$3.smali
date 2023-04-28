.class final Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$3;
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
        "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
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
.field final synthetic $eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/events/ChatEventHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$3;->$eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$3;->invoke(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$3;->$eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    invoke-interface {v0, p1}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V

    return-void
.end method
