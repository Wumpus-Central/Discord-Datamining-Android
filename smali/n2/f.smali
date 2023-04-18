.class public Ln2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln2/c;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ln2/g;

.field private final c:Lm2/c;

.field private final d:Lm2/d;

.field private final e:Lm2/f;

.field private final f:Lm2/f;

.field private final g:Lm2/b;

.field private final h:Ln2/r$b;

.field private final i:Ln2/r$c;

.field private final j:F

.field private final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm2/b;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lm2/b;

.field private final m:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln2/g;Lm2/c;Lm2/d;Lm2/f;Lm2/f;Lm2/b;Ln2/r$b;Ln2/r$c;FLjava/util/List;Lm2/b;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln2/g;",
            "Lm2/c;",
            "Lm2/d;",
            "Lm2/f;",
            "Lm2/f;",
            "Lm2/b;",
            "Ln2/r$b;",
            "Ln2/r$c;",
            "F",
            "Ljava/util/List<",
            "Lm2/b;",
            ">;",
            "Lm2/b;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln2/f;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Ln2/f;->b:Ln2/g;

    .line 4
    iput-object p3, p0, Ln2/f;->c:Lm2/c;

    .line 5
    iput-object p4, p0, Ln2/f;->d:Lm2/d;

    .line 6
    iput-object p5, p0, Ln2/f;->e:Lm2/f;

    .line 7
    iput-object p6, p0, Ln2/f;->f:Lm2/f;

    .line 8
    iput-object p7, p0, Ln2/f;->g:Lm2/b;

    .line 9
    iput-object p8, p0, Ln2/f;->h:Ln2/r$b;

    .line 10
    iput-object p9, p0, Ln2/f;->i:Ln2/r$c;

    .line 11
    iput p10, p0, Ln2/f;->j:F

    .line 12
    iput-object p11, p0, Ln2/f;->k:Ljava/util/List;

    .line 13
    iput-object p12, p0, Ln2/f;->l:Lm2/b;

    .line 14
    iput-boolean p13, p0, Ln2/f;->m:Z

    return-void
.end method


# virtual methods
.method public a(Lg2/e0;Lo2/b;)Li2/c;
    .locals 1

    new-instance v0, Li2/i;

    invoke-direct {v0, p1, p2, p0}, Li2/i;-><init>(Lg2/e0;Lo2/b;Ln2/f;)V

    return-object v0
.end method

.method public b()Ln2/r$b;
    .locals 1

    iget-object v0, p0, Ln2/f;->h:Ln2/r$b;

    return-object v0
.end method

.method public c()Lm2/b;
    .locals 1

    iget-object v0, p0, Ln2/f;->l:Lm2/b;

    return-object v0
.end method

.method public d()Lm2/f;
    .locals 1

    iget-object v0, p0, Ln2/f;->f:Lm2/f;

    return-object v0
.end method

.method public e()Lm2/c;
    .locals 1

    iget-object v0, p0, Ln2/f;->c:Lm2/c;

    return-object v0
.end method

.method public f()Ln2/g;
    .locals 1

    iget-object v0, p0, Ln2/f;->b:Ln2/g;

    return-object v0
.end method

.method public g()Ln2/r$c;
    .locals 1

    iget-object v0, p0, Ln2/f;->i:Ln2/r$c;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm2/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln2/f;->k:Ljava/util/List;

    return-object v0
.end method

.method public i()F
    .locals 1

    iget v0, p0, Ln2/f;->j:F

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln2/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public k()Lm2/d;
    .locals 1

    iget-object v0, p0, Ln2/f;->d:Lm2/d;

    return-object v0
.end method

.method public l()Lm2/f;
    .locals 1

    iget-object v0, p0, Ln2/f;->e:Lm2/f;

    return-object v0
.end method

.method public m()Lm2/b;
    .locals 1

    iget-object v0, p0, Ln2/f;->g:Lm2/b;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Ln2/f;->m:Z

    return v0
.end method
