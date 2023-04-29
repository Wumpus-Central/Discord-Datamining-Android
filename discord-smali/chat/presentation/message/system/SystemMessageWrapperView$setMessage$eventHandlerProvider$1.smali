.class final Lcom/discord/chat/presentation/message/system/SystemMessageWrapperView$setMessage$eventHandlerProvider$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/system/SystemMessageWrapperView;->setMessage(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/presentation/events/ChatEventHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
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

    iput-object p1, p0, Lcom/discord/chat/presentation/message/system/SystemMessageWrapperView$setMessage$eventHandlerProvider$1;->$eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/discord/chat/presentation/events/ChatEventHandler;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageWrapperView$setMessage$eventHandlerProvider$1;->$eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/system/SystemMessageWrapperView$setMessage$eventHandlerProvider$1;->invoke()Lcom/discord/chat/presentation/events/ChatEventHandler;

    move-result-object v0

    return-object v0
.end method
