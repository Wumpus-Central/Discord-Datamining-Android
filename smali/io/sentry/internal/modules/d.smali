.class public final Lio/sentry/internal/modules/d;
.super Lio/sentry/internal/modules/b;
.source "SourceFile"


# instance fields
.field private final c:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Lio/sentry/g0;)V
    .locals 1

    .line 1
    const-class v0, Lio/sentry/internal/modules/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/sentry/internal/modules/d;-><init>(Lio/sentry/g0;Ljava/lang/ClassLoader;)V

    return-void
.end method

.method constructor <init>(Lio/sentry/g0;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lio/sentry/internal/modules/b;-><init>(Lio/sentry/g0;)V

    if-nez p2, :cond_0

    .line 3
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/internal/modules/d;->c:Ljava/lang/ClassLoader;

    goto :goto_0

    .line 4
    :cond_0
    iput-object p2, p0, Lio/sentry/internal/modules/d;->c:Ljava/lang/ClassLoader;

    :goto_0
    return-void
.end method


# virtual methods
.method protected b()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "sentry-external-modules.txt"

    .line 2
    .line 3
    new-instance v1, Ljava/util/TreeMap;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v2, p0, Lio/sentry/internal/modules/d;->c:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, Lio/sentry/internal/modules/b;->a:Lio/sentry/g0;

    .line 17
    .line 18
    sget-object v3, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 19
    .line 20
    const-string v4, "%s file was not found."

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    new-array v5, v5, [Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    aput-object v0, v5, v6

    .line 27
    .line 28
    invoke-interface {v2, v3, v4, v5}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_0
    invoke-virtual {p0, v2}, Lio/sentry/internal/modules/b;->c(Ljava/io/InputStream;)Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    return-object v0

    .line 37
    :catch_0
    move-exception v0

    .line 38
    iget-object v2, p0, Lio/sentry/internal/modules/b;->a:Lio/sentry/g0;

    .line 39
    .line 40
    sget-object v3, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 41
    .line 42
    const-string v4, "Access to resources denied."

    .line 43
    .line 44
    invoke-interface {v2, v3, v4, v0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    return-object v1
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
.end method
