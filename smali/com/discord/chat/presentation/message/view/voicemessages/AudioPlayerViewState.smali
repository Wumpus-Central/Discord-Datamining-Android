.class public final Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0008\u0008\u0086\u0008\u0018\u00002\u00020\u0001B*\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0008J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0010J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J8\u0010\u0017\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0000\u00a2\u0006\u0002\u0008\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010 H\u0000\u00a2\u0006\u0002\u0008!J\u000f\u0010\"\u001a\u0004\u0018\u00010#H\u0000\u00a2\u0006\u0002\u0008$J\t\u0010%\u001a\u00020&H\u00d6\u0001J\u0015\u0010\'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\u0008)J\r\u0010*\u001a\u00020+H\u0000\u00a2\u0006\u0002\u0008,J\r\u0010-\u001a\u00020+H\u0000\u00a2\u0006\u0002\u0008.J\r\u0010/\u001a\u00020+H\u0000\u00a2\u0006\u0002\u00080J!\u00101\u001a\u0004\u0018\u00010+2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0000\u00a2\u0006\u0004\u00086\u00107J\r\u00108\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\u00089J\r\u0010:\u001a\u00020+H\u0000\u00a2\u0006\u0002\u0008;J\t\u0010<\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0010\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006="
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;",
        "",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "sourceUrl",
        "",
        "attached",
        "",
        "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getAttached",
        "()Z",
        "audioSource",
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;",
        "getAudioSource",
        "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;",
        "getMessageId-N_6c4I0",
        "()Ljava/lang/String;",
        "Ljava/lang/String;",
        "getSourceUrl",
        "component1",
        "component1-N_6c4I0",
        "component2",
        "component3",
        "copy",
        "copy-P6IPuNM",
        "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;",
        "equals",
        "other",
        "getCurrentProgress",
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;",
        "getCurrentProgress$chat_release",
        "getMediaState",
        "Lcom/discord/media_player/MediaPlayer$Event;",
        "getMediaState$chat_release",
        "getPlayer",
        "Lcom/discord/media_player/MediaPlayer;",
        "getPlayer$chat_release",
        "hashCode",
        "",
        "isPlaying",
        "wasPlayingBeforeBeingPaused",
        "isPlaying$chat_release",
        "pause",
        "",
        "pause$chat_release",
        "play",
        "play$chat_release",
        "releasePlayer",
        "releasePlayer$chat_release",
        "setCurrentProgress",
        "progress",
        "",
        "durationMs",
        "",
        "setCurrentProgress$chat_release",
        "(FJ)Lkotlin/Unit;",
        "shouldEmitDuration",
        "shouldEmitDuration$chat_release",
        "storeDuration",
        "storeDuration$chat_release",
        "toString",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final attached:Z

.field private final audioSource:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

.field private final messageId:Ljava/lang/String;

.field private final sourceUrl:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->messageId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->sourceUrl:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->attached:Z

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 5
    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    invoke-direct {v0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p3, v0

    .line 6
    :cond_0
    iput-object p3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->audioSource:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;-><init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy-P6IPuNM$default(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->messageId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->sourceUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->attached:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->copy-P6IPuNM(Ljava/lang/String;Ljava/lang/String;Z)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1-N_6c4I0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->sourceUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->attached:Z

    return v0
.end method

.method public final copy-P6IPuNM(Ljava/lang/String;Ljava/lang/String;Z)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;
    .locals 2

    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;-><init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->messageId:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->messageId:Ljava/lang/String;

    if-nez v1, :cond_2

    if-nez v3, :cond_3

    move v1, v0

    goto :goto_0

    :cond_2
    if-nez v3, :cond_4

    :cond_3
    move v1, v2

    goto :goto_0

    :cond_4
    invoke-static {v1, v3}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    :goto_0
    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->sourceUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->sourceUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->attached:Z

    iget-boolean p1, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->attached:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAttached()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->attached:Z

    return v0
.end method

.method public final getAudioSource()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->audioSource:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    return-object v0
.end method

.method public final getCurrentProgress$chat_release()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;
    .locals 2

    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->audioSource:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    invoke-virtual {v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->getCurrentProgress(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    move-result-object v0

    return-object v0
.end method

.method public final getMediaState$chat_release()Lcom/discord/media_player/MediaPlayer$Event;
    .locals 2

    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->audioSource:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    invoke-virtual {v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->getState(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Lcom/discord/media_player/MediaPlayer$Event;

    move-result-object v0

    return-object v0
.end method

.method public final getMessageId-N_6c4I0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPlayer$chat_release()Lcom/discord/media_player/MediaPlayer;
    .locals 2

    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->audioSource:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    invoke-virtual {v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->getPlayer(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Lcom/discord/media_player/MediaPlayer;

    move-result-object v0

    return-object v0
.end method

.method public final getSourceUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->sourceUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->messageId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/discord/primitives/MessageId;->hashCode-impl(Ljava/lang/String;)I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->sourceUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->attached:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method

.method public final isPlaying$chat_release(Z)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getPlayer$chat_release()Lcom/discord/media_player/MediaPlayer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayer;->shouldPlay()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayer;->isPlaying()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayer;->hasError()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    move v0, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v0, v2

    .line 30
    :goto_0
    if-nez v0, :cond_3

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move v1, v2

    .line 36
    :cond_3
    :goto_1
    return v1
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
.end method

.method public final pause$chat_release()V
    .locals 2

    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->audioSource:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    invoke-virtual {v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->pause(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)V

    return-void
.end method

.method public final play$chat_release()V
    .locals 2

    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->audioSource:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    invoke-virtual {v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->play(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)V

    return-void
.end method

.method public final releasePlayer$chat_release()V
    .locals 2

    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->audioSource:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    invoke-virtual {v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->releasePlayer(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)V

    return-void
.end method

.method public final setCurrentProgress$chat_release(FJ)Lkotlin/Unit;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->audioSource:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    .line 6
    .line 7
    invoke-virtual {v1, v0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->setCurrentProgress(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;FJ)V

    .line 8
    .line 9
    .line 10
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    return-object p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
.end method

.method public final shouldEmitDuration$chat_release()Z
    .locals 3

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getPlayer$chat_release()Lcom/discord/media_player/MediaPlayer;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayer;->shouldPlay()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method

.method public final storeDuration$chat_release()V
    .locals 2

    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->audioSource:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    invoke-virtual {v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->storeDuration(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->messageId:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "null"

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->sourceUrl:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->attached:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AudioPlayerViewState(messageId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", sourceUrl="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", attached="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
