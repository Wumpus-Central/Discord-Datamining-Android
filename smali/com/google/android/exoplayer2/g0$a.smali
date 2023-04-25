.class Lcom/google/android/exoplayer2/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/t0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/exoplayer2/g0;->q(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/exoplayer2/g0;


# direct methods
.method constructor <init>(Lcom/google/android/exoplayer2/g0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/g0$a;->a:Lcom/google/android/exoplayer2/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0$a;->a:Lcom/google/android/exoplayer2/g0;

    invoke-static {v0}, Lcom/google/android/exoplayer2/g0;->h(Lcom/google/android/exoplayer2/g0;)Lf9/m;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lf9/m;->h(I)Z

    return-void
.end method

.method public b(J)V
    .locals 2

    const-wide/16 v0, 0x7d0

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/exoplayer2/g0$a;->a:Lcom/google/android/exoplayer2/g0;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/google/android/exoplayer2/g0;->g(Lcom/google/android/exoplayer2/g0;Z)Z

    :cond_0
    return-void
.end method
