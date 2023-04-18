.class public Lcom/facebook/imagepipeline/cache/MemoryCacheParams;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:J


# direct methods
.method public constructor <init>(IIIII)V
    .locals 11

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    .line 2
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v9

    move-object v3, p0

    move v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    move/from16 v8, p5

    .line 3
    invoke-direct/range {v3 .. v10}, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;-><init>(IIIIIJ)V

    return-void
.end method

.method public constructor <init>(IIIIIJ)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;->a:I

    .line 6
    iput p2, p0, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;->b:I

    .line 7
    iput p3, p0, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;->c:I

    .line 8
    iput p4, p0, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;->d:I

    .line 9
    iput p5, p0, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;->e:I

    .line 10
    iput-wide p6, p0, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;->f:J

    return-void
.end method
