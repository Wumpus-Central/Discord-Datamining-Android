.class final Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;",
        "emit",
        "(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
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

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1$1$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object p2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1$1$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$getState$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getAudioSource()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1$1$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$getState$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$configurePlayButton(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V

    .line 4
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1$1$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$getState$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->shouldEmitDuration$chat_release()Z

    move-result p2

    invoke-static {p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$toggleDurationEmitter(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Z)V

    .line 5
    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1$1$1;->emit(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
