.class final Lcom/discord/chat/presentation/message/MessageView$setMessage$3;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/MessageView;->setMessage(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lkotlin/jvm/functions/Function0;ZZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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

.field final synthetic $message:Lcom/discord/chat/bridge/Message;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/Message;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageView$setMessage$3;->$eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/MessageView$setMessage$3;->$message:Lcom/discord/chat/bridge/Message;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/MessageView$setMessage$3;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageView$setMessage$3;->$eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageView$setMessage$3;->$message:Lcom/discord/chat/bridge/Message;

    invoke-virtual {v1}, Lcom/discord/chat/bridge/Message;->getChannelId-o4g7jtM()J

    move-result-wide v1

    iget-object v3, p0, Lcom/discord/chat/presentation/message/MessageView$setMessage$3;->$message:Lcom/discord/chat/bridge/Message;

    invoke-virtual {v3}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapMessageReply-0eiqbug(JLjava/lang/String;)V

    return-void
.end method
