.class public Lcom/brentvatne/exoplayer/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/brentvatne/exoplayer/e;


# instance fields
.field private final a:Ld9/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ld9/o$b;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ld9/o$b;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ld9/o$b;->a()Ld9/o;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lcom/brentvatne/exoplayer/c;->a:Ld9/o;

    .line 14
    .line 15
    return-void
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
.method public a(I)Lcom/google/android/exoplayer2/upstream/g;
    .locals 1

    new-instance v0, Lcom/google/android/exoplayer2/upstream/d;

    invoke-direct {v0, p1}, Lcom/google/android/exoplayer2/upstream/d;-><init>(I)V

    return-object v0
.end method

.method public b()Ld9/o;
    .locals 1

    iget-object v0, p0, Lcom/brentvatne/exoplayer/c;->a:Ld9/o;

    return-object v0
.end method
