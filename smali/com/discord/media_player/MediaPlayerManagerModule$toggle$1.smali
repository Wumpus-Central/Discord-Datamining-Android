.class final Lcom/discord/media_player/MediaPlayerManagerModule$toggle$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media_player/MediaPlayerManagerModule;->toggle(DZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/android/exoplayer2/SimpleExoPlayer;",
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
        "player",
        "Lcom/google/android/exoplayer2/SimpleExoPlayer;",
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
.field final synthetic $play:Z

.field final synthetic $portal:D

.field final synthetic this$0:Lcom/discord/media_player/MediaPlayerManagerModule;


# direct methods
.method constructor <init>(ZLcom/discord/media_player/MediaPlayerManagerModule;D)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/media_player/MediaPlayerManagerModule$toggle$1;->$play:Z

    iput-object p2, p0, Lcom/discord/media_player/MediaPlayerManagerModule$toggle$1;->this$0:Lcom/discord/media_player/MediaPlayerManagerModule;

    iput-wide p3, p0, Lcom/discord/media_player/MediaPlayerManagerModule$toggle$1;->$portal:D

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {p0, p1}, Lcom/discord/media_player/MediaPlayerManagerModule$toggle$1;->invoke(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V
    .locals 5

    const-string v0, "player"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/discord/media_player/MediaPlayerManagerModule$toggle$1;->$play:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->E()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const-wide/16 v0, 0x0

    .line 3
    invoke-virtual {p1, v0, v1}, Lcom/google/android/exoplayer2/e;->c0(J)V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/discord/media_player/MediaPlayerManagerModule$toggle$1;->$play:Z

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->y(Z)V

    .line 5
    iget-object p1, p0, Lcom/discord/media_player/MediaPlayerManagerModule$toggle$1;->this$0:Lcom/discord/media_player/MediaPlayerManagerModule;

    invoke-static {p1}, Lcom/discord/media_player/MediaPlayerManagerModule;->access$getReactEvents$p(Lcom/discord/media_player/MediaPlayerManagerModule;)Lcom/discord/reactevents/ReactEvents;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lcom/discord/media_player/MediaPlayerManagerModule$toggle$1;->this$0:Lcom/discord/media_player/MediaPlayerManagerModule;

    invoke-static {v0}, Lcom/discord/media_player/MediaPlayerManagerModule;->access$getReactContext$p(Lcom/discord/media_player/MediaPlayerManagerModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    .line 7
    new-instance v1, Lcom/discord/media_player/reactevents/MediaPlayerPause;

    iget-wide v2, p0, Lcom/discord/media_player/MediaPlayerManagerModule$toggle$1;->$portal:D

    iget-boolean v4, p0, Lcom/discord/media_player/MediaPlayerManagerModule$toggle$1;->$play:Z

    xor-int/lit8 v4, v4, 0x1

    invoke-direct {v1, v2, v3, v4}, Lcom/discord/media_player/reactevents/MediaPlayerPause;-><init>(DZ)V

    .line 8
    invoke-virtual {p1, v0, v1}, Lcom/discord/reactevents/ReactEvents;->emitModuleEvent(Landroid/content/Context;Lcom/discord/reactevents/ReactEvent;)V

    return-void
.end method
