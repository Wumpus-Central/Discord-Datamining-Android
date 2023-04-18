.class public Li2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/c;
.implements Lj2/a$b;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj2/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ln2/s$a;

.field private final e:Lj2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj2/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lj2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj2/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lj2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj2/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo2/b;Ln2/s;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Li2/u;->c:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {p2}, Ln2/s;->c()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Li2/u;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p2}, Ln2/s;->g()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput-boolean v0, p0, Li2/u;->b:Z

    .line 22
    .line 23
    invoke-virtual {p2}, Ln2/s;->f()Ln2/s$a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Li2/u;->d:Ln2/s$a;

    .line 28
    .line 29
    invoke-virtual {p2}, Ln2/s;->e()Lm2/b;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lm2/b;->a()Lj2/a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Li2/u;->e:Lj2/a;

    .line 38
    .line 39
    invoke-virtual {p2}, Ln2/s;->b()Lm2/b;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Lm2/b;->a()Lj2/a;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, p0, Li2/u;->f:Lj2/a;

    .line 48
    .line 49
    invoke-virtual {p2}, Ln2/s;->d()Lm2/b;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2}, Lm2/b;->a()Lj2/a;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    iput-object p2, p0, Li2/u;->g:Lj2/a;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lo2/b;->j(Lj2/a;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1}, Lo2/b;->j(Lj2/a;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p2}, Lo2/b;->j(Lj2/a;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p0}, Lj2/a;->a(Lj2/a$b;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p0}, Lj2/a;->a(Lj2/a$b;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, p0}, Lj2/a;->a(Lj2/a$b;)V

    .line 75
    .line 76
    .line 77
    return-void
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Li2/u;->c:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Li2/u;->c:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lj2/a$b;

    .line 17
    .line 18
    invoke-interface {v1}, Lj2/a$b;->a()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
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

.method public b(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li2/c;",
            ">;",
            "Ljava/util/List<",
            "Li2/c;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method d(Lj2/a$b;)V
    .locals 1

    iget-object v0, p0, Li2/u;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public f()Lj2/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj2/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li2/u;->f:Lj2/a;

    return-object v0
.end method

.method public i()Lj2/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj2/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li2/u;->g:Lj2/a;

    return-object v0
.end method

.method public j()Lj2/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj2/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li2/u;->e:Lj2/a;

    return-object v0
.end method

.method k()Ln2/s$a;
    .locals 1

    iget-object v0, p0, Li2/u;->d:Ln2/s$a;

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Li2/u;->b:Z

    return v0
.end method
