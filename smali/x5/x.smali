.class public Lx5/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx5/x$b;
    }
.end annotation


# instance fields
.field private final a:Lx5/z;

.field private final b:Lx5/a0;

.field private final c:Lx5/z;

.field private final d:Ly3/c;

.field private final e:Lx5/z;

.field private final f:Lx5/a0;

.field private final g:Lx5/z;

.field private final h:Lx5/a0;

.field private final i:Ljava/lang/String;

.field private final j:I

.field private final k:I

.field private final l:Z

.field private final m:Z


# direct methods
.method private constructor <init>(Lx5/x$b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lz5/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "PoolConfig()"

    .line 4
    invoke-static {v0}, Lz5/b;->a(Ljava/lang/String;)V

    .line 5
    :cond_0
    invoke-static {p1}, Lx5/x$b;->a(Lx5/x$b;)Lx5/z;

    move-result-object v0

    if-nez v0, :cond_1

    .line 6
    invoke-static {}, Lx5/k;->a()Lx5/z;

    move-result-object v0

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {p1}, Lx5/x$b;->a(Lx5/x$b;)Lx5/z;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lx5/x;->a:Lx5/z;

    .line 8
    invoke-static {p1}, Lx5/x$b;->b(Lx5/x$b;)Lx5/a0;

    move-result-object v0

    if-nez v0, :cond_2

    .line 9
    invoke-static {}, Lx5/v;->h()Lx5/v;

    move-result-object v0

    goto :goto_1

    .line 10
    :cond_2
    invoke-static {p1}, Lx5/x$b;->b(Lx5/x$b;)Lx5/a0;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lx5/x;->b:Lx5/a0;

    .line 11
    invoke-static {p1}, Lx5/x$b;->e(Lx5/x$b;)Lx5/z;

    move-result-object v0

    if-nez v0, :cond_3

    .line 12
    invoke-static {}, Lx5/m;->b()Lx5/z;

    move-result-object v0

    goto :goto_2

    .line 13
    :cond_3
    invoke-static {p1}, Lx5/x$b;->e(Lx5/x$b;)Lx5/z;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lx5/x;->c:Lx5/z;

    .line 14
    invoke-static {p1}, Lx5/x$b;->f(Lx5/x$b;)Ly3/c;

    move-result-object v0

    if-nez v0, :cond_4

    .line 15
    invoke-static {}, Ly3/d;->b()Ly3/d;

    move-result-object v0

    goto :goto_3

    .line 16
    :cond_4
    invoke-static {p1}, Lx5/x$b;->f(Lx5/x$b;)Ly3/c;

    move-result-object v0

    :goto_3
    iput-object v0, p0, Lx5/x;->d:Ly3/c;

    .line 17
    invoke-static {p1}, Lx5/x$b;->g(Lx5/x$b;)Lx5/z;

    move-result-object v0

    if-nez v0, :cond_5

    .line 18
    invoke-static {}, Lx5/n;->a()Lx5/z;

    move-result-object v0

    goto :goto_4

    .line 19
    :cond_5
    invoke-static {p1}, Lx5/x$b;->g(Lx5/x$b;)Lx5/z;

    move-result-object v0

    :goto_4
    iput-object v0, p0, Lx5/x;->e:Lx5/z;

    .line 20
    invoke-static {p1}, Lx5/x$b;->h(Lx5/x$b;)Lx5/a0;

    move-result-object v0

    if-nez v0, :cond_6

    .line 21
    invoke-static {}, Lx5/v;->h()Lx5/v;

    move-result-object v0

    goto :goto_5

    .line 22
    :cond_6
    invoke-static {p1}, Lx5/x$b;->h(Lx5/x$b;)Lx5/a0;

    move-result-object v0

    :goto_5
    iput-object v0, p0, Lx5/x;->f:Lx5/a0;

    .line 23
    invoke-static {p1}, Lx5/x$b;->i(Lx5/x$b;)Lx5/z;

    move-result-object v0

    if-nez v0, :cond_7

    .line 24
    invoke-static {}, Lx5/l;->a()Lx5/z;

    move-result-object v0

    goto :goto_6

    .line 25
    :cond_7
    invoke-static {p1}, Lx5/x$b;->i(Lx5/x$b;)Lx5/z;

    move-result-object v0

    :goto_6
    iput-object v0, p0, Lx5/x;->g:Lx5/z;

    .line 26
    invoke-static {p1}, Lx5/x$b;->j(Lx5/x$b;)Lx5/a0;

    move-result-object v0

    if-nez v0, :cond_8

    .line 27
    invoke-static {}, Lx5/v;->h()Lx5/v;

    move-result-object v0

    goto :goto_7

    .line 28
    :cond_8
    invoke-static {p1}, Lx5/x$b;->j(Lx5/x$b;)Lx5/a0;

    move-result-object v0

    :goto_7
    iput-object v0, p0, Lx5/x;->h:Lx5/a0;

    .line 29
    invoke-static {p1}, Lx5/x$b;->k(Lx5/x$b;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    const-string v0, "legacy"

    goto :goto_8

    :cond_9
    invoke-static {p1}, Lx5/x$b;->k(Lx5/x$b;)Ljava/lang/String;

    move-result-object v0

    :goto_8
    iput-object v0, p0, Lx5/x;->i:Ljava/lang/String;

    .line 30
    invoke-static {p1}, Lx5/x$b;->l(Lx5/x$b;)I

    move-result v0

    iput v0, p0, Lx5/x;->j:I

    .line 31
    invoke-static {p1}, Lx5/x$b;->c(Lx5/x$b;)I

    move-result v0

    if-lez v0, :cond_a

    .line 32
    invoke-static {p1}, Lx5/x$b;->c(Lx5/x$b;)I

    move-result v0

    goto :goto_9

    :cond_a
    const/high16 v0, 0x400000

    :goto_9
    iput v0, p0, Lx5/x;->k:I

    .line 33
    invoke-static {p1}, Lx5/x$b;->d(Lx5/x$b;)Z

    move-result v0

    iput-boolean v0, p0, Lx5/x;->l:Z

    .line 34
    invoke-static {}, Lz5/b;->d()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 35
    invoke-static {}, Lz5/b;->b()V

    .line 36
    :cond_b
    iget-boolean p1, p1, Lx5/x$b;->m:Z

    iput-boolean p1, p0, Lx5/x;->m:Z

    return-void
.end method

.method synthetic constructor <init>(Lx5/x$b;Lx5/x$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lx5/x;-><init>(Lx5/x$b;)V

    return-void
.end method

.method public static n()Lx5/x$b;
    .locals 2

    new-instance v0, Lx5/x$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx5/x$b;-><init>(Lx5/x$a;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lx5/x;->k:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lx5/x;->j:I

    return v0
.end method

.method public c()Lx5/z;
    .locals 1

    iget-object v0, p0, Lx5/x;->a:Lx5/z;

    return-object v0
.end method

.method public d()Lx5/a0;
    .locals 1

    iget-object v0, p0, Lx5/x;->b:Lx5/a0;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx5/x;->i:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lx5/z;
    .locals 1

    iget-object v0, p0, Lx5/x;->c:Lx5/z;

    return-object v0
.end method

.method public g()Lx5/z;
    .locals 1

    iget-object v0, p0, Lx5/x;->e:Lx5/z;

    return-object v0
.end method

.method public h()Lx5/a0;
    .locals 1

    iget-object v0, p0, Lx5/x;->f:Lx5/a0;

    return-object v0
.end method

.method public i()Ly3/c;
    .locals 1

    iget-object v0, p0, Lx5/x;->d:Ly3/c;

    return-object v0
.end method

.method public j()Lx5/z;
    .locals 1

    iget-object v0, p0, Lx5/x;->g:Lx5/z;

    return-object v0
.end method

.method public k()Lx5/a0;
    .locals 1

    iget-object v0, p0, Lx5/x;->h:Lx5/a0;

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lx5/x;->m:Z

    return v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lx5/x;->l:Z

    return v0
.end method
