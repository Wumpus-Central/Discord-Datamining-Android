.class public final Lcom/discord/media_player/MediaPlayer$Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/media_player/MediaPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/discord/media_player/MediaPlayer$Factory;",
        "",
        "()V",
        "create",
        "Lcom/discord/media_player/MediaPlayer;",
        "context",
        "Landroid/content/Context;",
        "media_player_release"
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
.field public static final INSTANCE:Lcom/discord/media_player/MediaPlayer$Factory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/media_player/MediaPlayer$Factory;

    invoke-direct {v0}, Lcom/discord/media_player/MediaPlayer$Factory;-><init>()V

    sput-object v0, Lcom/discord/media_player/MediaPlayer$Factory;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Factory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Landroid/content/Context;)Lcom/discord/media_player/MediaPlayer;
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ld7/e$a;

    .line 7
    .line 8
    invoke-direct {v0}, Ld7/e$a;-><init>()V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x9c4

    .line 12
    .line 13
    const/16 v2, 0x1388

    .line 14
    .line 15
    const/16 v3, 0x2710

    .line 16
    .line 17
    const/16 v4, 0x7530

    .line 18
    .line 19
    invoke-virtual {v0, v3, v4, v1, v2}, Ld7/e$a;->d(IIII)Ld7/e$a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ld7/e$a;->a()Ld7/e;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "Builder()\n              \u2026\n                .build()"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;

    .line 33
    .line 34
    invoke-direct {v1, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->y(Ld7/n;)Lcom/google/android/exoplayer2/SimpleExoPlayer$b;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->w()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v0, "Builder(context)\n       \u2026\n                .build()"

    .line 46
    .line 47
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Lcom/discord/media_player/MediaPlayer;

    .line 51
    .line 52
    sget-object v1, Lcom/discord/media_player/CacheDataSourceFactory;->Companion:Lcom/discord/media_player/CacheDataSourceFactory$Companion;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/discord/media_player/CacheDataSourceFactory$Companion;->getInstance()Lcom/discord/media_player/CacheDataSourceFactory;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-direct {v0, p1, v1}, Lcom/discord/media_player/MediaPlayer;-><init>(Lcom/google/android/exoplayer2/SimpleExoPlayer;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 59
    .line 60
    .line 61
    return-object v0
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
.end method
