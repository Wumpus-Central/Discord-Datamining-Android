.class final Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$prepareAudio$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->prepareAudio(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/media_player/MediaPlayer$Event;",
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
        "Lcom/discord/media_player/MediaPlayer$Event;",
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

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$prepareAudio$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/media_player/MediaPlayer$Event;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$prepareAudio$1;->invoke(Lcom/discord/media_player/MediaPlayer$Event;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/media_player/MediaPlayer$Event;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/discord/media_player/MediaPlayer$Event$Paused;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Event$Paused;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$prepareAudio$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$maybeLogPlaybackEnded(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V

    goto :goto_1

    .line 3
    :cond_1
    instance-of v0, p1, Lcom/discord/media_player/MediaPlayer$Event$PlaybackError;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$prepareAudio$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    check-cast p1, Lcom/discord/media_player/MediaPlayer$Event$PlaybackError;

    invoke-virtual {p1}, Lcom/discord/media_player/MediaPlayer$Event$PlaybackError;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$maybeLogPlaybackFailed(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Ljava/lang/String;)V

    goto :goto_1

    .line 4
    :cond_2
    sget-object v0, Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$prepareAudio$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-static {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$maybeLogPlaybackStarted(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V

    .line 5
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$prepareAudio$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v1, v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->setState$default(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;ZILjava/lang/Object;)V

    return-void
.end method
