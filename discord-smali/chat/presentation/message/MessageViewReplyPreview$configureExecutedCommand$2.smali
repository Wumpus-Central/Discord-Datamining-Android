.class final Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$2;
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
.field final synthetic $eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

.field final synthetic $messageId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$2;->$eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$2;->$messageId:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/bridge/contentnode/LinkContentNode;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$2;->invoke(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$2;->$eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$2;->$messageId:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V

    return-void
.end method
