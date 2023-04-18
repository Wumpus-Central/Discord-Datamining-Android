.class public Lcom/facebook/imagepipeline/core/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/core/a$c;,
        Lcom/facebook/imagepipeline/core/a$d;,
        Lcom/facebook/imagepipeline/core/a$b;
    }
.end annotation


# instance fields
.field private final A:Z

.field private final B:Z

.field private final a:Z

.field private final b:Z

.field private final c:Le4/b;

.field private final d:Z

.field private final e:Z

.field private final f:I

.field private final g:I

.field private h:Z

.field private final i:I

.field private final j:Z

.field private final k:Z

.field private final l:Lcom/facebook/imagepipeline/core/a$d;

.field private final m:Lcom/facebook/common/internal/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Z

.field private final o:Z

.field private final p:I

.field private final q:Lcom/facebook/common/internal/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Z

.field private final s:J

.field private t:Z

.field private u:Z

.field private v:Z

.field private final w:Z

.field private final x:Z

.field private final y:Z

.field private final z:I


# direct methods
.method private constructor <init>(Lcom/facebook/imagepipeline/core/a$b;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->a(Lcom/facebook/imagepipeline/core/a$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->a:Z

    .line 4
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->b(Lcom/facebook/imagepipeline/core/a$b;)Le4/b$a;

    .line 5
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->k(Lcom/facebook/imagepipeline/core/a$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Z

    .line 6
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->l(Lcom/facebook/imagepipeline/core/a$b;)Le4/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->c:Le4/b;

    .line 7
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->m(Lcom/facebook/imagepipeline/core/a$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->d:Z

    .line 8
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->n(Lcom/facebook/imagepipeline/core/a$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->e:Z

    .line 9
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->o(Lcom/facebook/imagepipeline/core/a$b;)I

    move-result v0

    iput v0, p0, Lcom/facebook/imagepipeline/core/a;->f:I

    .line 10
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->p(Lcom/facebook/imagepipeline/core/a$b;)I

    move-result v0

    iput v0, p0, Lcom/facebook/imagepipeline/core/a;->g:I

    .line 11
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/a$b;->i:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->h:Z

    .line 12
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->q(Lcom/facebook/imagepipeline/core/a$b;)I

    move-result v0

    iput v0, p0, Lcom/facebook/imagepipeline/core/a;->i:I

    .line 13
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->r(Lcom/facebook/imagepipeline/core/a$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->j:Z

    .line 14
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->c(Lcom/facebook/imagepipeline/core/a$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->k:Z

    .line 15
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->d(Lcom/facebook/imagepipeline/core/a$b;)Lcom/facebook/imagepipeline/core/a$d;

    move-result-object v0

    if-nez v0, :cond_0

    .line 16
    new-instance v0, Lcom/facebook/imagepipeline/core/a$c;

    invoke-direct {v0}, Lcom/facebook/imagepipeline/core/a$c;-><init>()V

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->l:Lcom/facebook/imagepipeline/core/a$d;

    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->d(Lcom/facebook/imagepipeline/core/a$b;)Lcom/facebook/imagepipeline/core/a$d;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->l:Lcom/facebook/imagepipeline/core/a$d;

    .line 18
    :goto_0
    iget-object v0, p1, Lcom/facebook/imagepipeline/core/a$b;->n:Lcom/facebook/common/internal/Supplier;

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->m:Lcom/facebook/common/internal/Supplier;

    .line 19
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/a$b;->o:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->n:Z

    .line 20
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/a$b;->p:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->o:Z

    .line 21
    iget v0, p1, Lcom/facebook/imagepipeline/core/a$b;->q:I

    iput v0, p0, Lcom/facebook/imagepipeline/core/a;->p:I

    .line 22
    iget-object v0, p1, Lcom/facebook/imagepipeline/core/a$b;->r:Lcom/facebook/common/internal/Supplier;

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->q:Lcom/facebook/common/internal/Supplier;

    .line 23
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/a$b;->s:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->r:Z

    .line 24
    iget-wide v0, p1, Lcom/facebook/imagepipeline/core/a$b;->t:J

    iput-wide v0, p0, Lcom/facebook/imagepipeline/core/a;->s:J

    .line 25
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->e(Lcom/facebook/imagepipeline/core/a$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->t:Z

    .line 26
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/a$b;->v:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->u:Z

    .line 27
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/a$b;->w:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->v:Z

    .line 28
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/a$b;->x:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->w:Z

    .line 29
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->f(Lcom/facebook/imagepipeline/core/a$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->x:Z

    .line 30
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->g(Lcom/facebook/imagepipeline/core/a$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->y:Z

    .line 31
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->h(Lcom/facebook/imagepipeline/core/a$b;)I

    move-result v0

    iput v0, p0, Lcom/facebook/imagepipeline/core/a;->z:I

    .line 32
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->i(Lcom/facebook/imagepipeline/core/a$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->A:Z

    .line 33
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a$b;->j(Lcom/facebook/imagepipeline/core/a$b;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/facebook/imagepipeline/core/a;->B:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/imagepipeline/core/a$b;Lcom/facebook/imagepipeline/core/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/core/a;-><init>(Lcom/facebook/imagepipeline/core/a$b;)V

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->o:Z

    return v0
.end method

.method public B()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->t:Z

    return v0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->A:Z

    return v0
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->B:Z

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/facebook/imagepipeline/core/a;->p:I

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->h:Z

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/facebook/imagepipeline/core/a;->g:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/facebook/imagepipeline/core/a;->f:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/facebook/imagepipeline/core/a;->i:I

    return v0
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/imagepipeline/core/a;->s:J

    return-wide v0
.end method

.method public h()Lcom/facebook/imagepipeline/core/a$d;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->l:Lcom/facebook/imagepipeline/core/a$d;

    return-object v0
.end method

.method public i()Lcom/facebook/common/internal/Supplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->q:Lcom/facebook/common/internal/Supplier;

    return-object v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lcom/facebook/imagepipeline/core/a;->z:I

    return v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->e:Z

    return v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->d:Z

    return v0
.end method

.method public m()Le4/b;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->c:Le4/b;

    return-object v0
.end method

.method public n()Le4/b$a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Z

    return v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->y:Z

    return v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->v:Z

    return v0
.end method

.method public r()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->x:Z

    return v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->w:Z

    return v0
.end method

.method public t()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->r:Z

    return v0
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->n:Z

    return v0
.end method

.method public v()Lcom/facebook/common/internal/Supplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->m:Lcom/facebook/common/internal/Supplier;

    return-object v0
.end method

.method public w()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->j:Z

    return v0
.end method

.method public x()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->k:Z

    return v0
.end method

.method public y()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->a:Z

    return v0
.end method

.method public z()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/a;->u:Z

    return v0
.end method
