.class final Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "mediaViewAttached",
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
.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1;->invoke(Z)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Z)V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$getPlayerJob$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)Lkotlinx/coroutines/Job;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/Job$a;->a(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {v0}, Lcom/discord/misc/utilities/coroutines/CoroutineViewUtilsKt;->getAttachedScope(Landroid/view/View;)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1$1;

    iget-object v6, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-direct {v5, v6, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1$1;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$setPlayerJob$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lkotlinx/coroutines/Job;)V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$getState$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x0

    move v5, p1

    invoke-static/range {v2 .. v7}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->copy-P6IPuNM$default(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, p1, v2, v3, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->setState$default(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;ZILjava/lang/Object;)V

    return-void
.end method
