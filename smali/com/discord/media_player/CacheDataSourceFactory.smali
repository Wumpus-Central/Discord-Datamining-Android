.class public final Lcom/discord/media_player/CacheDataSourceFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/DataSource$Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/media_player/CacheDataSourceFactory$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\u0008\u0002\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/discord/media_player/CacheDataSourceFactory;",
        "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;",
        "defaultDatasourceFactory",
        "Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;",
        "(Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;)V",
        "createDataSource",
        "Lcom/google/android/exoplayer2/upstream/DataSource;",
        "Companion",
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
.field private static final CACHE_DIR_NAME:Ljava/lang/String; = "app_media_player"

.field private static final CACHE_MAX_SIZE:J = 0x6400000L

.field public static final Companion:Lcom/discord/media_player/CacheDataSourceFactory$Companion;

.field private static cache:Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;

.field private static factory:Lcom/discord/media_player/CacheDataSourceFactory;


# instance fields
.field private final defaultDatasourceFactory:Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/media_player/CacheDataSourceFactory$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/media_player/CacheDataSourceFactory$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/media_player/CacheDataSourceFactory;->Companion:Lcom/discord/media_player/CacheDataSourceFactory$Companion;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/discord/media_player/CacheDataSourceFactory;->defaultDatasourceFactory:Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;-><init>()V

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/discord/media_player/CacheDataSourceFactory;-><init>(Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;)V

    return-void
.end method

.method public static final synthetic access$getFactory$cp()Lcom/discord/media_player/CacheDataSourceFactory;
    .locals 1

    sget-object v0, Lcom/discord/media_player/CacheDataSourceFactory;->factory:Lcom/discord/media_player/CacheDataSourceFactory;

    return-object v0
.end method

.method public static final synthetic access$setCache$cp(Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;)V
    .locals 0

    sput-object p0, Lcom/discord/media_player/CacheDataSourceFactory;->cache:Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;

    return-void
.end method

.method public static final synthetic access$setFactory$cp(Lcom/discord/media_player/CacheDataSourceFactory;)V
    .locals 0

    sput-object p0, Lcom/discord/media_player/CacheDataSourceFactory;->factory:Lcom/discord/media_player/CacheDataSourceFactory;

    return-void
.end method


# virtual methods
.method public createDataSource()Lcom/google/android/exoplayer2/upstream/DataSource;
    .locals 11

    .line 1
    const/4 v5, 0x3

    .line 2
    new-instance v7, Lcom/google/android/exoplayer2/upstream/cache/c;

    .line 3
    .line 4
    sget-object v0, Lcom/discord/media_player/CacheDataSourceFactory;->cache:Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "cache"

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object v3, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v3, v0

    .line 17
    :goto_0
    iget-object v0, p0, Lcom/discord/media_player/CacheDataSourceFactory;->defaultDatasourceFactory:Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;->a()Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    new-instance v6, Le9/r;

    .line 24
    .line 25
    invoke-direct {v6}, Le9/r;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v8, Lcom/google/android/exoplayer2/upstream/cache/b;

    .line 29
    .line 30
    sget-object v0, Lcom/discord/media_player/CacheDataSourceFactory;->cache:Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object v1, v0

    .line 39
    :goto_1
    const-wide/32 v9, 0x6400000

    .line 40
    .line 41
    .line 42
    invoke-direct {v8, v1, v9, v10}, Lcom/google/android/exoplayer2/upstream/cache/b;-><init>(Lcom/google/android/exoplayer2/upstream/cache/a;J)V

    .line 43
    .line 44
    .line 45
    const/4 v9, 0x0

    .line 46
    move-object v0, v7

    .line 47
    move-object v1, v3

    .line 48
    move-object v2, v4

    .line 49
    move-object v3, v6

    .line 50
    move-object v4, v8

    .line 51
    move-object v6, v9

    .line 52
    invoke-direct/range {v0 .. v6}, Lcom/google/android/exoplayer2/upstream/cache/c;-><init>(Lcom/google/android/exoplayer2/upstream/cache/a;Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSource;Le9/j;ILcom/google/android/exoplayer2/upstream/cache/c$a;)V

    .line 53
    .line 54
    .line 55
    return-object v7
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
.end method
