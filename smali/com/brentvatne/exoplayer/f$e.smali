.class Lcom/brentvatne/exoplayer/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/Player$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/brentvatne/exoplayer/f;->o0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/brentvatne/exoplayer/f;


# direct methods
.method constructor <init>(Lcom/brentvatne/exoplayer/f;)V
    .locals 0

    iput-object p1, p0, Lcom/brentvatne/exoplayer/f$e;->k:Lcom/brentvatne/exoplayer/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic onEvents(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/Player$Events;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ld7/q;->a(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/Player$Events;)V

    return-void
.end method

.method public synthetic onExperimentalOffloadSchedulingEnabledChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->b(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onExperimentalSleepingForOffloadChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->c(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onIsLoadingChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->d(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onIsPlayingChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->e(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onLoadingChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->f(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onMediaItemTransition(Lcom/google/android/exoplayer2/MediaItem;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Ld7/q;->g(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/MediaItem;I)V

    return-void
.end method

.method public synthetic onPlayWhenReadyChanged(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Ld7/q;->h(Lcom/google/android/exoplayer2/Player$a;ZI)V

    return-void
.end method

.method public synthetic onPlaybackParametersChanged(Lcom/google/android/exoplayer2/PlaybackParameters;)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->i(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/PlaybackParameters;)V

    return-void
.end method

.method public synthetic onPlaybackStateChanged(I)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->j(Lcom/google/android/exoplayer2/Player$a;I)V

    return-void
.end method

.method public synthetic onPlaybackSuppressionReasonChanged(I)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->k(Lcom/google/android/exoplayer2/Player$a;I)V

    return-void
.end method

.method public synthetic onPlayerError(Lcom/google/android/exoplayer2/ExoPlaybackException;)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->l(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/ExoPlaybackException;)V

    return-void
.end method

.method public onPlayerStateChanged(ZI)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$e;->k:Lcom/brentvatne/exoplayer/f;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->N(Lcom/brentvatne/exoplayer/f;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-static {p1, p2}, Lcom/brentvatne/exoplayer/f;->O(Lcom/brentvatne/exoplayer/f;Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$e;->k:Lcom/brentvatne/exoplayer/f;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p2, p0, Lcom/brentvatne/exoplayer/f$e;->k:Lcom/brentvatne/exoplayer/f;

    .line 17
    .line 18
    invoke-static {p2}, Lcom/brentvatne/exoplayer/f;->P(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/Player$a;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->l(Lcom/google/android/exoplayer2/Player$a;)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public synthetic onPositionDiscontinuity(I)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->n(Lcom/google/android/exoplayer2/Player$a;I)V

    return-void
.end method

.method public synthetic onRepeatModeChanged(I)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->o(Lcom/google/android/exoplayer2/Player$a;I)V

    return-void
.end method

.method public synthetic onSeekProcessed()V
    .locals 0

    invoke-static {p0}, Ld7/q;->p(Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method public synthetic onShuffleModeEnabledChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->q(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onStaticMetadataChanged(Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->r(Lcom/google/android/exoplayer2/Player$a;Ljava/util/List;)V

    return-void
.end method

.method public synthetic onTimelineChanged(Lcom/google/android/exoplayer2/Timeline;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Ld7/q;->s(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/Timeline;I)V

    return-void
.end method

.method public synthetic onTimelineChanged(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ld7/q;->t(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;I)V

    return-void
.end method

.method public synthetic onTracksChanged(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ld7/q;->u(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V

    return-void
.end method
