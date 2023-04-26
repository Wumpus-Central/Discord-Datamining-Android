.class public final Lcom/google/android/exoplayer2/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:F

.field private b:F

.field private c:J

.field private d:F

.field private e:J

.field private f:J

.field private g:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x3f7851ec    # 0.97f

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lcom/google/android/exoplayer2/g$b;->a:F

    .line 8
    .line 9
    const v0, 0x3f83d70a    # 1.03f

    .line 10
    .line 11
    .line 12
    iput v0, p0, Lcom/google/android/exoplayer2/g$b;->b:F

    .line 13
    .line 14
    const-wide/16 v0, 0x3e8

    .line 15
    .line 16
    iput-wide v0, p0, Lcom/google/android/exoplayer2/g$b;->c:J

    .line 17
    .line 18
    const v0, 0x33d6bf95    # 1.0E-7f

    .line 19
    .line 20
    .line 21
    iput v0, p0, Lcom/google/android/exoplayer2/g$b;->d:F

    .line 22
    .line 23
    const-wide/16 v0, 0x14

    .line 24
    .line 25
    invoke-static {v0, v1}, Ld7/c;->c(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iput-wide v0, p0, Lcom/google/android/exoplayer2/g$b;->e:J

    .line 30
    .line 31
    const-wide/16 v0, 0x1f4

    .line 32
    .line 33
    invoke-static {v0, v1}, Ld7/c;->c(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    iput-wide v0, p0, Lcom/google/android/exoplayer2/g$b;->f:J

    .line 38
    .line 39
    const v0, 0x3f7fbe77    # 0.999f

    .line 40
    .line 41
    .line 42
    iput v0, p0, Lcom/google/android/exoplayer2/g$b;->g:F

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/exoplayer2/g;
    .locals 13

    new-instance v12, Lcom/google/android/exoplayer2/g;

    iget v1, p0, Lcom/google/android/exoplayer2/g$b;->a:F

    iget v2, p0, Lcom/google/android/exoplayer2/g$b;->b:F

    iget-wide v3, p0, Lcom/google/android/exoplayer2/g$b;->c:J

    iget v5, p0, Lcom/google/android/exoplayer2/g$b;->d:F

    iget-wide v6, p0, Lcom/google/android/exoplayer2/g$b;->e:J

    iget-wide v8, p0, Lcom/google/android/exoplayer2/g$b;->f:J

    iget v10, p0, Lcom/google/android/exoplayer2/g$b;->g:F

    const/4 v11, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lcom/google/android/exoplayer2/g;-><init>(FFJFJJFLcom/google/android/exoplayer2/g$a;)V

    return-object v12
.end method
