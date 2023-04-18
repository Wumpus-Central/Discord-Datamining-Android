.class public final Lgh/b$c;
.super Lnh/i$b;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgh/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/i$b<",
        "Lgh/b;",
        "Lgh/b$c;",
        ">;",
        "Lnh/r;"
    }
.end annotation


# instance fields
.field private l:I

.field private m:I

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/b$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lnh/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lgh/b$c;->n:Ljava/util/List;

    .line 9
    .line 10
    invoke-direct {p0}, Lgh/b$c;->x()V

    .line 11
    .line 12
    .line 13
    return-void
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
.end method

.method static synthetic r()Lgh/b$c;
    .locals 1

    invoke-static {}, Lgh/b$c;->v()Lgh/b$c;

    move-result-object v0

    return-object v0
.end method

.method private static v()Lgh/b$c;
    .locals 1

    new-instance v0, Lgh/b$c;

    invoke-direct {v0}, Lgh/b$c;-><init>()V

    return-object v0
.end method

.method private w()V
    .locals 3

    .line 1
    iget v0, p0, Lgh/b$c;->l:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, p0, Lgh/b$c;->n:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lgh/b$c;->n:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lgh/b$c;->l:I

    .line 17
    .line 18
    or-int/2addr v0, v1

    .line 19
    iput v0, p0, Lgh/b$c;->l:I

    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method private x()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(I)Lgh/b$c;
    .locals 1

    .line 1
    iget v0, p0, Lgh/b$c;->l:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lgh/b$c;->l:I

    .line 6
    .line 7
    iput p1, p0, Lgh/b$c;->m:I

    .line 8
    .line 9
    return-object p0
    .line 10
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
.end method

.method public bridge synthetic build()Lnh/q;
    .locals 1

    invoke-virtual {p0}, Lgh/b$c;->s()Lgh/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgh/b$c;->u()Lgh/b$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic k(Lnh/e;Lnh/g;)Lnh/a$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lgh/b$c;->z(Lnh/e;Lnh/g;)Lgh/b$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Lnh/e;Lnh/g;)Lnh/q$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lgh/b$c;->z(Lnh/e;Lnh/g;)Lgh/b$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n()Lnh/i$b;
    .locals 1

    invoke-virtual {p0}, Lgh/b$c;->u()Lgh/b$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p(Lnh/i;)Lnh/i$b;
    .locals 0

    check-cast p1, Lgh/b;

    invoke-virtual {p0, p1}, Lgh/b$c;->y(Lgh/b;)Lgh/b$c;

    move-result-object p1

    return-object p1
.end method

.method public s()Lgh/b;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lgh/b$c;->t()Lgh/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lgh/b;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {v0}, Lnh/a$a;->m(Lnh/q;)Lnh/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    throw v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public t()Lgh/b;
    .locals 4

    .line 1
    new-instance v0, Lgh/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lgh/b;-><init>(Lnh/i$b;Lgh/a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lgh/b$c;->l:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    and-int/2addr v1, v2

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    iget v1, p0, Lgh/b$c;->m:I

    .line 16
    .line 17
    invoke-static {v0, v1}, Lgh/b;->s(Lgh/b;I)I

    .line 18
    .line 19
    .line 20
    iget v1, p0, Lgh/b$c;->l:I

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    and-int/2addr v1, v3

    .line 24
    if-ne v1, v3, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lgh/b$c;->n:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, Lgh/b$c;->n:Ljava/util/List;

    .line 33
    .line 34
    iget v1, p0, Lgh/b$c;->l:I

    .line 35
    .line 36
    and-int/lit8 v1, v1, -0x3

    .line 37
    .line 38
    iput v1, p0, Lgh/b$c;->l:I

    .line 39
    .line 40
    :cond_1
    iget-object v1, p0, Lgh/b$c;->n:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v0, v1}, Lgh/b;->u(Lgh/b;Ljava/util/List;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v2}, Lgh/b;->v(Lgh/b;I)I

    .line 46
    .line 47
    .line 48
    return-object v0
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public u()Lgh/b$c;
    .locals 2

    invoke-static {}, Lgh/b$c;->v()Lgh/b$c;

    move-result-object v0

    invoke-virtual {p0}, Lgh/b$c;->t()Lgh/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgh/b$c;->y(Lgh/b;)Lgh/b$c;

    move-result-object v0

    return-object v0
.end method

.method public y(Lgh/b;)Lgh/b$c;
    .locals 2

    .line 1
    invoke-static {}, Lgh/b;->A()Lgh/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p1}, Lgh/b;->C()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lgh/b;->B()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, Lgh/b$c;->A(I)Lgh/b$c;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-static {p1}, Lgh/b;->t(Lgh/b;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    iget-object v0, p0, Lgh/b$c;->n:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-static {p1}, Lgh/b;->t(Lgh/b;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lgh/b$c;->n:Ljava/util/List;

    .line 44
    .line 45
    iget v0, p0, Lgh/b$c;->l:I

    .line 46
    .line 47
    and-int/lit8 v0, v0, -0x3

    .line 48
    .line 49
    iput v0, p0, Lgh/b$c;->l:I

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-direct {p0}, Lgh/b$c;->w()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lgh/b$c;->n:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {p1}, Lgh/b;->t(Lgh/b;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lnh/i$b;->o()Lnh/d;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {p1}, Lgh/b;->w(Lgh/b;)Lnh/d;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {v0, p1}, Lnh/d;->e(Lnh/d;)Lnh/d;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, Lnh/i$b;->q(Lnh/d;)Lnh/i$b;

    .line 77
    .line 78
    .line 79
    return-object p0
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public z(Lnh/e;Lnh/g;)Lgh/b$c;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lgh/b;->s:Lnh/s;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, Lnh/s;->c(Lnh/e;Lnh/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lgh/b;
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lgh/b$c;->y(Lgh/b;)Lgh/b$c;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object p0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    :try_start_1
    invoke-virtual {p1}, Lnh/k;->a()Lnh/q;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Lgh/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 26
    :catchall_1
    move-exception p1

    .line 27
    move-object v0, p2

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lgh/b$c;->y(Lgh/b;)Lgh/b$c;

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1
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
    .line 47
    .line 48
    .line 49
.end method
