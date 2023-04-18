.class public Lo5/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo5/o;


# static fields
.field private static a:Lo5/v;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized o()Lo5/v;
    .locals 2

    .line 1
    const-class v0, Lo5/v;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lo5/v;->a:Lo5/v;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lo5/v;

    .line 9
    .line 10
    invoke-direct {v1}, Lo5/v;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lo5/v;->a:Lo5/v;

    .line 14
    .line 15
    :cond_0
    sget-object v1, Lo5/v;->a:Lo5/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-object v1

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    monitor-exit v0

    .line 21
    throw v1
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
.end method


# virtual methods
.method public a(Lcom/facebook/cache/common/CacheKey;)V
    .locals 0

    return-void
.end method

.method public b(Lo5/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/s<",
            "**>;)V"
        }
    .end annotation

    return-void
.end method

.method public c(Lcom/facebook/cache/common/CacheKey;)V
    .locals 0

    return-void
.end method

.method public d(Lcom/facebook/cache/common/CacheKey;)V
    .locals 0

    return-void
.end method

.method public e(Lcom/facebook/cache/common/CacheKey;)V
    .locals 0

    return-void
.end method

.method public f(Lcom/facebook/cache/common/CacheKey;)V
    .locals 0

    return-void
.end method

.method public g(Lcom/facebook/cache/common/CacheKey;)V
    .locals 0

    return-void
.end method

.method public h(Lcom/facebook/cache/common/CacheKey;)V
    .locals 0

    return-void
.end method

.method public i(Lcom/facebook/cache/common/CacheKey;)V
    .locals 0

    return-void
.end method

.method public j(Lo5/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/s<",
            "**>;)V"
        }
    .end annotation

    return-void
.end method

.method public k(Lcom/facebook/cache/common/CacheKey;)V
    .locals 0

    return-void
.end method

.method public l(Lcom/facebook/cache/common/CacheKey;)V
    .locals 0

    return-void
.end method

.method public m(Lcom/facebook/cache/common/CacheKey;)V
    .locals 0

    return-void
.end method

.method public n(Lcom/facebook/cache/common/CacheKey;)V
    .locals 0

    return-void
.end method
