.class final Lcom/discord/chat/presentation/list/ChatListView$scrollStateObserver$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/list/ChatListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/chat/presentation/list/ScrollState;",
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
        "scrollState",
        "Lcom/discord/chat/presentation/list/ScrollState;",
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
.field final synthetic this$0:Lcom/discord/chat/presentation/list/ChatListView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/list/ChatListView;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollStateObserver$1;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/presentation/list/ScrollState;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/list/ChatListView$scrollStateObserver$1;->invoke(Lcom/discord/chat/presentation/list/ScrollState;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/chat/presentation/list/ScrollState;)V
    .locals 1

    const-string v0, "scrollState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollStateObserver$1;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    invoke-static {v0}, Lcom/discord/chat/presentation/list/ChatListView;->access$getEventHandler$p(Lcom/discord/chat/presentation/list/ChatListView;)Lcom/discord/chat/presentation/events/ChatEventHandler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollStateObserver$1;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    invoke-static {v0}, Lcom/discord/chat/presentation/list/ChatListView;->access$getEventHandler$p(Lcom/discord/chat/presentation/list/ChatListView;)Lcom/discord/chat/presentation/events/ChatEventHandler;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "eventHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0, p1}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onScrollStateChanged(Lcom/discord/chat/presentation/list/ScrollState;)V

    :cond_1
    return-void
.end method
