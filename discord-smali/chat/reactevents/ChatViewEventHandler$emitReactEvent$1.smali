.class final Lcom/discord/chat/reactevents/ChatViewEventHandler$emitReactEvent$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/reactevents/ChatViewEventHandler;-><init>(Landroid/content/Context;Lcom/discord/reactevents/ReactEvents;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/reactevents/ReactEvent;",
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
        "event",
        "Lcom/discord/reactevents/ReactEvent;",
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
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $reactEvents:Lcom/discord/reactevents/ReactEvents;

.field final synthetic $reactTag:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/discord/reactevents/ReactEvents;Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/reactevents/ReactEvents;",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/chat/reactevents/ChatViewEventHandler$emitReactEvent$1;->$reactEvents:Lcom/discord/reactevents/ReactEvents;

    iput-object p2, p0, Lcom/discord/chat/reactevents/ChatViewEventHandler$emitReactEvent$1;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/discord/chat/reactevents/ChatViewEventHandler$emitReactEvent$1;->$reactTag:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/reactevents/ReactEvent;

    invoke-virtual {p0, p1}, Lcom/discord/chat/reactevents/ChatViewEventHandler$emitReactEvent$1;->invoke(Lcom/discord/reactevents/ReactEvent;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/reactevents/ReactEvent;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/chat/reactevents/ChatViewEventHandler$emitReactEvent$1;->$reactEvents:Lcom/discord/reactevents/ReactEvents;

    iget-object v1, p0, Lcom/discord/chat/reactevents/ChatViewEventHandler$emitReactEvent$1;->$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/discord/chat/reactevents/ChatViewEventHandler$emitReactEvent$1;->$reactTag:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/discord/reactevents/ReactEvents;->emitEvent(Landroid/content/Context;Lcom/discord/reactevents/ReactEvent;I)V

    return-void
.end method
