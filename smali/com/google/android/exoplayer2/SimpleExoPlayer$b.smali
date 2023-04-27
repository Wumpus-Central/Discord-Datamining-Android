.class public final Lcom/google/android/exoplayer2/SimpleExoPlayer$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/SimpleExoPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Le7/v;

.field private c:Lg9/c;

.field private d:Lb9/m;

.field private e:Li8/c0;

.field private f:Le7/n;

.field private g:Le9/e;

.field private h:Lf7/d1;

.field private i:Landroid/os/Looper;

.field private j:Lg9/a0;

.field private k:Lg7/e;

.field private l:Z

.field private m:I

.field private n:Z

.field private o:Z

.field private p:I

.field private q:Z

.field private r:Le7/w;

.field private s:Lcom/google/android/exoplayer2/h0;

.field private t:J

.field private u:J

.field private v:Z

.field private w:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Le7/f;

    invoke-direct {v0, p1}, Le7/f;-><init>(Landroid/content/Context;)V

    new-instance v1, Lm7/g;

    invoke-direct {v1}, Lm7/g;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;-><init>(Landroid/content/Context;Le7/v;Lm7/o;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le7/v;)V
    .locals 1

    .line 2
    new-instance v0, Lm7/g;

    invoke-direct {v0}, Lm7/g;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;-><init>(Landroid/content/Context;Le7/v;Lm7/o;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le7/v;Lb9/m;Li8/c0;Le7/n;Le9/e;Lf7/d1;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->a:Landroid/content/Context;

    .line 8
    iput-object p2, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->b:Le7/v;

    .line 9
    iput-object p3, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->d:Lb9/m;

    .line 10
    iput-object p4, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->e:Li8/c0;

    .line 11
    iput-object p5, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->f:Le7/n;

    .line 12
    iput-object p6, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->g:Le9/e;

    .line 13
    iput-object p7, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->h:Lf7/d1;

    .line 14
    invoke-static {}, Lg9/q0;->P()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->i:Landroid/os/Looper;

    .line 15
    sget-object p1, Lg7/e;->f:Lg7/e;

    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->k:Lg7/e;

    const/4 p1, 0x0

    .line 16
    iput p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->m:I

    const/4 p1, 0x1

    .line 17
    iput p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->p:I

    .line 18
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->q:Z

    .line 19
    sget-object p1, Le7/w;->g:Le7/w;

    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->r:Le7/w;

    .line 20
    new-instance p1, Lcom/google/android/exoplayer2/g$b;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/g$b;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/g$b;->a()Lcom/google/android/exoplayer2/g;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->s:Lcom/google/android/exoplayer2/h0;

    .line 21
    sget-object p1, Lg9/c;->a:Lg9/c;

    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->c:Lg9/c;

    const-wide/16 p1, 0x1f4

    .line 22
    iput-wide p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->t:J

    const-wide/16 p1, 0x7d0

    .line 23
    iput-wide p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->u:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le7/v;Lm7/o;)V
    .locals 8

    .line 3
    new-instance v3, Lb9/f;

    invoke-direct {v3, p1}, Lb9/f;-><init>(Landroid/content/Context;)V

    new-instance v4, Li8/j;

    invoke-direct {v4, p1, p3}, Li8/j;-><init>(Landroid/content/Context;Lm7/o;)V

    new-instance v5, Le7/e;

    invoke-direct {v5}, Le7/e;-><init>()V

    .line 4
    invoke-static {p1}, Le9/o;->l(Landroid/content/Context;)Le9/o;

    move-result-object v6

    new-instance v7, Lf7/d1;

    sget-object p3, Lg9/c;->a:Lg9/c;

    invoke-direct {v7, p3}, Lf7/d1;-><init>(Lg9/c;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 5
    invoke-direct/range {v0 .. v7}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;-><init>(Landroid/content/Context;Le7/v;Lb9/m;Li8/c0;Le7/n;Le9/e;Lf7/d1;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->a:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic b(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Lf7/d1;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->h:Lf7/d1;

    return-object p0
.end method

.method static synthetic c(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Lb9/m;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->d:Lb9/m;

    return-object p0
.end method

.method static synthetic d(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Li8/c0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->e:Li8/c0;

    return-object p0
.end method

.method static synthetic e(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Le7/n;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->f:Le7/n;

    return-object p0
.end method

.method static synthetic f(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Le9/e;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->g:Le9/e;

    return-object p0
.end method

.method static synthetic g(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->q:Z

    return p0
.end method

.method static synthetic h(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Le7/w;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->r:Le7/w;

    return-object p0
.end method

.method static synthetic i(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Lcom/google/android/exoplayer2/h0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->s:Lcom/google/android/exoplayer2/h0;

    return-object p0
.end method

.method static synthetic j(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->t:J

    return-wide v0
.end method

.method static synthetic k(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->v:Z

    return p0
.end method

.method static synthetic l(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Lg9/c;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->c:Lg9/c;

    return-object p0
.end method

.method static synthetic m(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Lg9/a0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->j:Lg9/a0;

    return-object p0
.end method

.method static synthetic n(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->n:Z

    return p0
.end method

.method static synthetic o(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->l:Z

    return p0
.end method

.method static synthetic p(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)I
    .locals 0

    iget p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->m:I

    return p0
.end method

.method static synthetic q(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Lg7/e;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->k:Lg7/e;

    return-object p0
.end method

.method static synthetic r(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)I
    .locals 0

    iget p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->p:I

    return p0
.end method

.method static synthetic s(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->o:Z

    return p0
.end method

.method static synthetic t(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->u:J

    return-wide v0
.end method

.method static synthetic u(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Landroid/os/Looper;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->i:Landroid/os/Looper;

    return-object p0
.end method

.method static synthetic v(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Le7/v;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->b:Le7/v;

    return-object p0
.end method


# virtual methods
.method public w()Lcom/google/android/exoplayer2/SimpleExoPlayer;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->w:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lg9/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->w:Z

    .line 9
    .line 10
    new-instance v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;-><init>(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
.end method

.method public x(Le9/e;)Lcom/google/android/exoplayer2/SimpleExoPlayer$b;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->w:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lg9/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->g:Le9/e;

    .line 9
    .line 10
    return-object p0
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
.end method

.method public y(Le7/n;)Lcom/google/android/exoplayer2/SimpleExoPlayer$b;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->w:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lg9/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->f:Le7/n;

    .line 9
    .line 10
    return-object p0
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
.end method

.method public z(Lb9/m;)Lcom/google/android/exoplayer2/SimpleExoPlayer$b;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->w:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lg9/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->d:Lb9/m;

    .line 9
    .line 10
    return-object p0
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
.end method
