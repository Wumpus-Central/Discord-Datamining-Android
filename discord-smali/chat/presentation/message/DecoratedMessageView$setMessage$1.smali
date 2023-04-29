.class final Lcom/discord/chat/presentation/message/DecoratedMessageView$setMessage$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/DecoratedMessageView;->setMessage$default(Lcom/discord/chat/presentation/message/DecoratedMessageView;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lkotlin/jvm/functions/Function0;ZZZILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/discord/chat/presentation/message/MessageView$ChainPart;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/chat/presentation/message/MessageView$ChainPart;",
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
.field public static final INSTANCE:Lcom/discord/chat/presentation/message/DecoratedMessageView$setMessage$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/chat/presentation/message/DecoratedMessageView$setMessage$1;

    invoke-direct {v0}, Lcom/discord/chat/presentation/message/DecoratedMessageView$setMessage$1;-><init>()V

    sput-object v0, Lcom/discord/chat/presentation/message/DecoratedMessageView$setMessage$1;->INSTANCE:Lcom/discord/chat/presentation/message/DecoratedMessageView$setMessage$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/discord/chat/presentation/message/MessageView$ChainPart;
    .locals 1

    .line 1
    sget-object v0, Lcom/discord/chat/presentation/message/MessageView$ChainPart;->ONLY:Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/DecoratedMessageView$setMessage$1;->invoke()Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    move-result-object v0

    return-object v0
.end method
