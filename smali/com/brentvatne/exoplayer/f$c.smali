.class Lcom/brentvatne/exoplayer/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/brentvatne/exoplayer/f;->o0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/brentvatne/exoplayer/f;


# direct methods
.method constructor <init>(Lcom/brentvatne/exoplayer/f;)V
    .locals 0

    iput-object p1, p0, Lcom/brentvatne/exoplayer/f$c;->k:Lcom/brentvatne/exoplayer/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$c;->k:Lcom/brentvatne/exoplayer/f;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$c;->k:Lcom/brentvatne/exoplayer/f;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->E()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v0, 0x4

    .line 20
    if-ne p1, v0, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$c;->k:Lcom/brentvatne/exoplayer/f;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-wide/16 v0, 0x0

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Lcom/google/android/exoplayer2/e;->c0(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$c;->k:Lcom/brentvatne/exoplayer/f;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Lcom/brentvatne/exoplayer/f;->J0(Z)V

    .line 37
    .line 38
    .line 39
    return-void
    .line 40
.end method
