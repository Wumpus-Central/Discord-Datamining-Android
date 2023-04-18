.class final Lco/discord/media_engine/Connection$GetStatsCallbackNative;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/discord/media_engine/Connection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "GetStatsCallbackNative"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/discord/media_engine/Connection$GetStatsCallbackNative;",
        "",
        "callback",
        "Lco/discord/media_engine/Connection$GetStatsCallback;",
        "(Lco/discord/media_engine/Connection$GetStatsCallback;)V",
        "getCallback",
        "()Lco/discord/media_engine/Connection$GetStatsCallback;",
        "onStats",
        "",
        "stats",
        "",
        "android_release"
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
.field private final callback:Lco/discord/media_engine/Connection$GetStatsCallback;


# direct methods
.method public constructor <init>(Lco/discord/media_engine/Connection$GetStatsCallback;)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lco/discord/media_engine/Connection$GetStatsCallbackNative;->callback:Lco/discord/media_engine/Connection$GetStatsCallback;

    .line 10
    .line 11
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
.end method


# virtual methods
.method public final getCallback()Lco/discord/media_engine/Connection$GetStatsCallback;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/Connection$GetStatsCallbackNative;->callback:Lco/discord/media_engine/Connection$GetStatsCallback;

    return-object v0
.end method

.method public final onStats(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "stats"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lco/discord/media_engine/Connection$GetStatsCallbackNative;->callback:Lco/discord/media_engine/Connection$GetStatsCallback;

    .line 7
    .line 8
    invoke-static {p1}, Lco/discord/media_engine/internal/TransformStats;->transform(Ljava/lang/String;)Lco/discord/media_engine/Stats;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p1}, Lco/discord/media_engine/Connection$GetStatsCallback;->onStats(Lco/discord/media_engine/Stats;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    iget-object v0, p0, Lco/discord/media_engine/Connection$GetStatsCallbackNative;->callback:Lco/discord/media_engine/Connection$GetStatsCallback;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lco/discord/media_engine/Connection$GetStatsCallback;->onStatsError(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
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
.end method
