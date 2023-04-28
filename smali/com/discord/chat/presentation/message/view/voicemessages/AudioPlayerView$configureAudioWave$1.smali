.class final Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configureAudioWave(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;",
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
        "progressEvent",
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;",
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
.field final synthetic $state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->$state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->invoke(Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;)V
    .locals 7

    const-string v0, "progressEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$getResetJob$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)Lkotlinx/coroutines/Job;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/Job$a;->a(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->$state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getPlayer$chat_release()Lcom/discord/media_player/MediaPlayer;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;->getEventAction()I

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v2, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 5
    iget-object v3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    iget-object v5, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->$state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    invoke-virtual {v5}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->shouldEmitDuration$chat_release()Z

    move-result v5

    invoke-static {v3, v5}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$toggleDurationEmitter(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Z)V

    .line 6
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;->getProgress()F

    move-result v3

    iget-object v5, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {v5}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$getDurationMs$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)J

    move-result-wide v5

    long-to-float v5, v5

    mul-float/2addr v3, v5

    float-to-long v5, v3

    invoke-virtual {v0, v5, v6}, Lcom/discord/media_player/MediaPlayer;->seekTo(J)V

    .line 7
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$getWasPlayingBeforeBeingPaused$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 8
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {v0, v4}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$setWasPlayingBeforeBeingPaused$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Z)V

    .line 9
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->$state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->play$chat_release()V

    goto :goto_0

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->$state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;->getProgress()F

    move-result v3

    iget-object v5, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {v5}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$getDurationMs$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)J

    move-result-wide v5

    invoke-virtual {v0, v3, v5, v6}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->setCurrentProgress$chat_release(FJ)Lkotlin/Unit;

    goto :goto_0

    :cond_3
    if-eqz v0, :cond_4

    .line 11
    iget-object v3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayer;->shouldPlay()Z

    move-result v0

    invoke-static {v3, v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$setWasPlayingBeforeBeingPaused$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Z)V

    .line 12
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->$state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->pause$chat_release()V

    .line 13
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {v0, v4}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$toggleDurationEmitter(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Z)V

    .line 14
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    int-to-float v3, v2

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;->getProgress()F

    move-result v5

    sub-float/2addr v3, v5

    iget-object v5, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {v5}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$getDurationMs$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)J

    move-result-wide v5

    long-to-float v5, v5

    mul-float/2addr v3, v5

    float-to-long v5, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v5, 0x2

    invoke-static {v0, v3, v4, v5, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configureDuration$default(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Ljava/lang/Long;ZILjava/lang/Object;)V

    .line 15
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->getBinding()Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wave:Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;->getProgress()F

    move-result p1

    invoke-virtual {v0, p1, v2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;->setAudioProgress(FZ)V

    return-void
.end method
