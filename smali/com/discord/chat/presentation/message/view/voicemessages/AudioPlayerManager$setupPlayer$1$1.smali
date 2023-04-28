.class final Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$setupPlayer$1$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->setupPlayer(Landroid/content/Context;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;JLkotlin/jvm/functions/Function1;)V
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
.field final synthetic $onStateChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/media_player/MediaPlayer$Event;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $source:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/media_player/MediaPlayer$Event;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$setupPlayer$1$1;->$source:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$setupPlayer$1$1;->$onStateChanged:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/media_player/MediaPlayer$Event;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$setupPlayer$1$1;->invoke(Lcom/discord/media_player/MediaPlayer$Event;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/media_player/MediaPlayer$Event;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->access$getCurrentProgressMap$p()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$setupPlayer$1$1;->$source:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    invoke-static {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->access$abandonAudioFocus(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;)V

    goto :goto_0

    .line 5
    :cond_0
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$setupPlayer$1$1;->$source:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    invoke-virtual {v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->storeDuration(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)V

    .line 6
    :goto_0
    invoke-static {}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->access$getMediaPlayerState$p()Lcom/discord/media_player/MediaPlayer$Event;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    invoke-static {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->access$setMediaPlayerState$p(Lcom/discord/media_player/MediaPlayer$Event;)V

    .line 8
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$setupPlayer$1$1;->$onStateChanged:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
