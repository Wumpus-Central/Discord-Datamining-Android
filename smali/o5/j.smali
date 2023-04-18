.class public Lo5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/common/internal/Supplier;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/common/internal/Supplier<",
        "Lcom/facebook/imagepipeline/cache/MemoryCacheParams;",
        ">;"
    }
.end annotation


# static fields
.field private static final MAX_CACHE_ENTRIES:I = 0x100

.field private static final MAX_CACHE_ENTRY_SIZE:I = 0x7fffffff

.field private static final MAX_EVICTION_QUEUE_ENTRIES:I = 0x7fffffff

.field private static final MAX_EVICTION_QUEUE_SIZE:I = 0x7fffffff

.field private static final PARAMS_CHECK_INTERVAL_MS:J


# instance fields
.field private final mActivityManager:Landroid/app/ActivityManager;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lo5/j;->PARAMS_CHECK_INTERVAL_MS:J

    return-void
.end method

.method public constructor <init>(Landroid/app/ActivityManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo5/j;->mActivityManager:Landroid/app/ActivityManager;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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

.method private getMaxCacheSize()I
    .locals 2

    .line 1
    iget-object v0, p0, Lo5/j;->mActivityManager:Landroid/app/ActivityManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x100000

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    const v1, 0x7fffffff

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/high16 v1, 0x2000000

    .line 18
    .line 19
    if-ge v0, v1, :cond_0

    .line 20
    .line 21
    const/high16 v0, 0x400000

    .line 22
    .line 23
    return v0

    .line 24
    :cond_0
    const/high16 v1, 0x4000000

    .line 25
    .line 26
    if-ge v0, v1, :cond_1

    .line 27
    .line 28
    const/high16 v0, 0x600000

    .line 29
    .line 30
    return v0

    .line 31
    :cond_1
    div-int/lit8 v0, v0, 0x4

    .line 32
    .line 33
    return v0
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
.method public get()Lcom/facebook/imagepipeline/cache/MemoryCacheParams;
    .locals 9

    .line 2
    new-instance v8, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;

    .line 3
    invoke-direct {p0}, Lo5/j;->getMaxCacheSize()I

    move-result v1

    const/16 v2, 0x100

    const v3, 0x7fffffff

    const v4, 0x7fffffff

    const v5, 0x7fffffff

    sget-wide v6, Lo5/j;->PARAMS_CHECK_INTERVAL_MS:J

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;-><init>(IIIIIJ)V

    return-object v8
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lo5/j;->get()Lcom/facebook/imagepipeline/cache/MemoryCacheParams;

    move-result-object v0

    return-object v0
.end method
