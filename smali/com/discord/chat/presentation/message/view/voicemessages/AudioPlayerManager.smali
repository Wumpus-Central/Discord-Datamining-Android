.class public final Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;,
        Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002;<B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00112\u0008\u0010\"\u001a\u0004\u0018\u00010\u0005J\u0012\u0010#\u001a\u0004\u0018\u00010\u00172\u0008\u0010\"\u001a\u0004\u0018\u00010\u0005J\u0012\u0010$\u001a\u0004\u0018\u00010\u00192\u0008\u0010\"\u001a\u0004\u0018\u00010\u0005J\u0010\u0010%\u001a\u00020\u001e2\u0008\u0010&\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\'\u001a\u00020 2\u0006\u0010(\u001a\u00020)J\u001a\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020 J\u0008\u0010.\u001a\u00020 H\u0002J\u0010\u0010.\u001a\u00020 2\u0008\u0010&\u001a\u0004\u0018\u00010\u0005J\u000e\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020\u001eJ\u0008\u00101\u001a\u00020 H\u0002J\u0010\u00101\u001a\u00020 2\u0008\u0010&\u001a\u0004\u0018\u00010\u0005J\u0010\u00102\u001a\u00020 2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0005J\u0008\u00103\u001a\u00020\u001eH\u0002J\u001e\u00104\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00052\u0006\u00105\u001a\u0002062\u0006\u0010+\u001a\u00020,J2\u00107\u001a\u00020 2\u0006\u0010(\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 09J\u0010\u0010:\u001a\u00020 2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0005R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0008\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;",
        "",
        "()V",
        "_currentPlayerSourceFlow",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;",
        "audioManager",
        "Landroid/media/AudioManager;",
        "currentPlayerSource",
        "getCurrentPlayerSource",
        "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;",
        "currentPlayerSourceFlow",
        "Lkotlinx/coroutines/flow/Flow;",
        "getCurrentPlayerSourceFlow",
        "()Lkotlinx/coroutines/flow/Flow;",
        "currentProgressMap",
        "",
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;",
        "focusListener",
        "Landroid/media/AudioManager$OnAudioFocusChangeListener;",
        "focusRequest",
        "Landroid/media/AudioFocusRequest;",
        "mediaPlayer",
        "Lcom/discord/media_player/MediaPlayer;",
        "mediaPlayerState",
        "Lcom/discord/media_player/MediaPlayer$Event;",
        "playbackAttributes",
        "Landroid/media/AudioAttributes;",
        "kotlin.jvm.PlatformType",
        "wasPlayingBeforePause",
        "",
        "abandonAudioFocus",
        "",
        "getCurrentProgress",
        "source",
        "getPlayer",
        "getState",
        "hasCurrentPlayer",
        "audioSource",
        "init",
        "context",
        "Landroid/content/Context;",
        "maybeCreateDuration",
        "durationMs",
        "",
        "maybePlayCurrentPlayer",
        "pause",
        "pauseCurrentPlayer",
        "storePauseState",
        "play",
        "releasePlayer",
        "requestAudioFocus",
        "setCurrentProgress",
        "progress",
        "",
        "setupPlayer",
        "onStateChanged",
        "Lkotlin/Function1;",
        "storeDuration",
        "AudioSource",
        "CurrentProgress",
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


# static fields
.field public static final INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

.field private static final _currentPlayerSourceFlow:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;",
            ">;"
        }
    .end annotation
.end field

.field private static audioManager:Landroid/media/AudioManager;

.field private static final currentPlayerSourceFlow:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;",
            ">;"
        }
    .end annotation
.end field

.field private static final currentProgressMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;",
            "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;",
            ">;"
        }
    .end annotation
.end field

.field private static final focusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private static focusRequest:Landroid/media/AudioFocusRequest;

.field private static mediaPlayer:Lcom/discord/media_player/MediaPlayer;

.field private static mediaPlayerState:Lcom/discord/media_player/MediaPlayer$Event;

.field private static final playbackAttributes:Landroid/media/AudioAttributes;

.field private static wasPlayingBeforePause:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    .line 7
    .line 8
    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/b;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->focusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 14
    .line 15
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->playbackAttributes:Landroid/media/AudioAttributes;

    .line 35
    .line 36
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->currentProgressMap:Ljava/util/Map;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-static {v0}, Lkotlinx/coroutines/flow/q;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->_currentPlayerSourceFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 49
    .line 50
    sput-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->currentPlayerSourceFlow:Lkotlinx/coroutines/flow/Flow;

    .line 51
    .line 52
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(I)V
    .locals 0

    invoke-static {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->focusListener$lambda$0(I)V

    return-void
.end method

.method private final abandonAudioFocus()V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const-string v2, "audioManager"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-lt v0, v1, :cond_2

    .line 9
    .line 10
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->audioManager:Landroid/media/AudioManager;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    move-object v0, v3

    .line 18
    :cond_0
    sget-object v1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->focusRequest:Landroid/media/AudioFocusRequest;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    const-string v1, "focusRequest"

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v3, v1

    .line 29
    :goto_0
    invoke-static {v0, v3}, Lcom/discord/audio/c;->a(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->audioManager:Landroid/media/AudioManager;

    .line 34
    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    move-object v3, v0

    .line 42
    :goto_1
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->focusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 43
    .line 44
    invoke-virtual {v3, v0}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 45
    .line 46
    .line 47
    :goto_2
    return-void
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
.end method

.method public static final synthetic access$abandonAudioFocus(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->abandonAudioFocus()V

    return-void
.end method

.method public static final synthetic access$getCurrentProgressMap$p()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->currentProgressMap:Ljava/util/Map;

    return-object v0
.end method

.method public static final synthetic access$getMediaPlayerState$p()Lcom/discord/media_player/MediaPlayer$Event;
    .locals 1

    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayerState:Lcom/discord/media_player/MediaPlayer$Event;

    return-object v0
.end method

.method public static final synthetic access$setMediaPlayerState$p(Lcom/discord/media_player/MediaPlayer$Event;)V
    .locals 0

    sput-object p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayerState:Lcom/discord/media_player/MediaPlayer$Event;

    return-void
.end method

.method private static final focusListener$lambda$0(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    sget-object p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->maybePlayCurrentPlayer()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->pauseCurrentPlayer(Z)V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
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
.end method

.method private final getCurrentPlayerSource()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;
    .locals 1

    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->_currentPlayerSourceFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    return-object v0
.end method

.method private final maybeCreateDuration(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;J)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;
    .locals 4

    .line 1
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->currentProgressMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    new-instance v1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    .line 12
    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    invoke-direct {v1, v2, v3, p2, p3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;-><init>(JJ)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1
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

.method private final pause()V
    .locals 1

    .line 1
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayer;->pause()V

    :cond_0
    return-void
.end method

.method private final play()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->requestAudioFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayer;->play()V

    :cond_0
    return-void
.end method

.method private final requestAudioFocus()Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const-string v2, "audioManager"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-lt v0, v1, :cond_2

    .line 9
    .line 10
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->audioManager:Landroid/media/AudioManager;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    move-object v0, v3

    .line 18
    :cond_0
    sget-object v1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->focusRequest:Landroid/media/AudioFocusRequest;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    const-string v1, "focusRequest"

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v3, v1

    .line 29
    :goto_0
    invoke-static {v0, v3}, Lcom/discord/audio/h;->a(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->audioManager:Landroid/media/AudioManager;

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    move-object v3, v0

    .line 43
    :goto_1
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->focusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 44
    .line 45
    const/4 v1, 0x3

    .line 46
    const/4 v2, 0x4

    .line 47
    invoke-virtual {v3, v0, v1, v2}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    :goto_2
    const/4 v1, 0x1

    .line 52
    if-ne v0, v1, :cond_4

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_4
    const/4 v1, 0x0

    .line 56
    :goto_3
    return v1
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
.end method


# virtual methods
.method public final getCurrentPlayerSourceFlow()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->currentPlayerSourceFlow:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public final getCurrentProgress(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;
    .locals 1

    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->currentProgressMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    return-object p1
.end method

.method public final getPlayer(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Lcom/discord/media_player/MediaPlayer;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->hasCurrentPlayer(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final getState(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Lcom/discord/media_player/MediaPlayer$Event;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->hasCurrentPlayer(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayerState:Lcom/discord/media_player/MediaPlayer$Event;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final hasCurrentPlayer(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Z
    .locals 1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->getCurrentPlayerSource()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final init(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "audio"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "null cannot be cast to non-null type android.media.AudioManager"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p1, Landroid/media/AudioManager;

    .line 18
    .line 19
    sput-object p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->audioManager:Landroid/media/AudioManager;

    .line 20
    .line 21
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v0, 0x1a

    .line 24
    .line 25
    if-lt p1, v0, :cond_0

    .line 26
    .line 27
    new-instance p1, Landroid/media/AudioFocusRequest$Builder;

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    invoke-direct {p1, v0}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->focusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 34
    .line 35
    invoke-static {p1, v0}, Lcom/discord/chat/presentation/message/view/voicemessages/a;->a(Landroid/media/AudioFocusRequest$Builder;Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->playbackAttributes:Landroid/media/AudioAttributes;

    .line 40
    .line 41
    invoke-static {p1, v0}, Lcom/discord/audio/f;->a(Landroid/media/AudioFocusRequest$Builder;Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Lcom/discord/audio/g;->a(Landroid/media/AudioFocusRequest$Builder;)Landroid/media/AudioFocusRequest;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v0, "Builder(AudioManager.AUD\u2026\n                .build()"

    .line 50
    .line 51
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    sput-object p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->focusRequest:Landroid/media/AudioFocusRequest;

    .line 55
    .line 56
    :cond_0
    return-void
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

.method public final maybePlayCurrentPlayer()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->wasPlayingBeforePause:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    sput-boolean v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->wasPlayingBeforePause:Z

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->play()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
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
.end method

.method public final pause(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->hasCurrentPlayer(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->pause()V

    :cond_0
    return-void
.end method

.method public final pauseCurrentPlayer(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    sget-object p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/discord/media_player/MediaPlayer;->shouldPlay()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v1, 0x1

    .line 13
    if-ne p1, v1, :cond_0

    .line 14
    .line 15
    move v0, v1

    .line 16
    :cond_0
    sput-boolean v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->wasPlayingBeforePause:Z

    .line 17
    .line 18
    :cond_1
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->pause()V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->getCurrentPlayerSource()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->storeDuration(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)V

    .line 26
    .line 27
    .line 28
    return-void
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
.end method

.method public final play(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->hasCurrentPlayer(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->play()V

    :cond_0
    return-void
.end method

.method public final releasePlayer(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->hasCurrentPlayer(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    sget-object p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->_currentPlayerSourceFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/discord/media_player/MediaPlayer;->reset()V

    .line 18
    .line 19
    .line 20
    :cond_0
    sput-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayerState:Lcom/discord/media_player/MediaPlayer$Event;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    sput-boolean p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->wasPlayingBeforePause:Z

    .line 24
    .line 25
    :cond_1
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

.method public final setCurrentProgress(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;FJ)V
    .locals 9

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->currentProgressMap:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, p1, p3, p4}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->maybeCreateDuration(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;J)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    move-object v2, v1

    .line 24
    long-to-float p3, p3

    .line 25
    mul-float/2addr p2, p3

    .line 26
    float-to-long v3, p2

    .line 27
    const-wide/16 v5, 0x0

    .line 28
    .line 29
    const/4 v7, 0x2

    .line 30
    const/4 v8, 0x0

    .line 31
    invoke-static/range {v2 .. v8}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;->copy$default(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;JJILjava/lang/Object;)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void
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
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
.end method

.method public final setupPlayer(Landroid/content/Context;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;JLkotlin/jvm/functions/Function1;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;",
            "J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/media_player/MediaPlayer$Event;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "source"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onStateChanged"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Lcom/discord/media_player/MediaPlayer$Factory;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Factory;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lcom/discord/media_player/MediaPlayer$Factory;->create(Landroid/content/Context;)Lcom/discord/media_player/MediaPlayer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sput-object p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 27
    .line 28
    :cond_0
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->getCurrentPlayerSource()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->getCurrentPlayerSource()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->storeDuration(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    sput-object p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayerState:Lcom/discord/media_player/MediaPlayer$Event;

    .line 47
    .line 48
    sget-object p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->_currentPlayerSourceFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 49
    .line 50
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, p2, p3, p4}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->maybeCreateDuration(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;J)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->requestAudioFocus()Z

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    if-eqz p3, :cond_2

    .line 61
    .line 62
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 66
    .line 67
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance p1, Lcom/discord/media_player/MediaSource;

    .line 71
    .line 72
    invoke-virtual {p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;->getUrl()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-virtual {p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;->getUrl()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    new-instance p4, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v1, "audio attachment: "

    .line 87
    .line 88
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    sget-object v5, Lcom/discord/media_player/MediaType;->AUDIO:Lcom/discord/media_player/MediaType;

    .line 99
    .line 100
    const/4 v6, 0x0

    .line 101
    const/4 v7, 0x0

    .line 102
    const/16 v8, 0x32

    .line 103
    .line 104
    const/4 v9, 0x0

    .line 105
    move-object v1, p1

    .line 106
    invoke-direct/range {v1 .. v9}, Lcom/discord/media_player/MediaSource;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLjava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 107
    .line 108
    .line 109
    const/4 v2, 0x1

    .line 110
    const/4 v3, 0x0

    .line 111
    sget-object p3, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->currentProgressMap:Ljava/util/Map;

    .line 112
    .line 113
    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    check-cast p3, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    .line 118
    .line 119
    if-eqz p3, :cond_1

    .line 120
    .line 121
    invoke-virtual {p3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;->getCurrentProgress()J

    .line 122
    .line 123
    .line 124
    move-result-wide p3

    .line 125
    goto :goto_0

    .line 126
    :cond_1
    const-wide/16 p3, 0x0

    .line 127
    .line 128
    :goto_0
    move-wide v4, p3

    .line 129
    const/4 v6, 0x0

    .line 130
    const/4 v7, 0x0

    .line 131
    const/16 v8, 0x34

    .line 132
    .line 133
    const/4 v9, 0x0

    .line 134
    move-object v1, p1

    .line 135
    invoke-static/range {v0 .. v9}, Lcom/discord/media_player/MediaPlayer;->preparePlayer$default(Lcom/discord/media_player/MediaPlayer;Lcom/discord/media_player/MediaSource;ZZJLcom/discord/media_player/MediaPlayerView;Lcom/discord/media_player/MediaPlayerView$ControlView;ILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_2
    sget-object p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 139
    .line 140
    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    new-instance p3, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$setupPlayer$1$1;

    .line 144
    .line 145
    invoke-direct {p3, p2, p5}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$setupPlayer$1$1;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;Lkotlin/jvm/functions/Function1;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, p3}, Lcom/discord/media_player/MediaPlayer;->setEventListener(Lkotlin/jvm/functions/Function1;)V

    .line 149
    .line 150
    .line 151
    const/high16 p2, 0x3f800000    # 1.0f

    .line 152
    .line 153
    invoke-virtual {p1, p2}, Lcom/discord/media_player/MediaPlayer;->setVolume(F)V

    .line 154
    .line 155
    .line 156
    return-void
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
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
.end method

.method public final storeDuration(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)V
    .locals 10

    .line 1
    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->hasCurrentPlayer(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object v1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->currentProgressMap:Ljava/util/Map;

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v3, v2

    .line 21
    check-cast v3, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayer;->currentPositionMs()J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    const/4 v8, 0x2

    .line 32
    const/4 v9, 0x0

    .line 33
    invoke-static/range {v3 .. v9}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;->copy$default(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;JJILjava/lang/Object;)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    nop

    .line 44
    :cond_1
    :goto_0
    return-void
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
