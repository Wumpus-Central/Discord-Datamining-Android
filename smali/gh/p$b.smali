.class public final Lgh/p$b;
.super Lnh/i$b;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgh/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/i$b<",
        "Lgh/p;",
        "Lgh/p$b;",
        ">;",
        "Lnh/r;"
    }
.end annotation


# instance fields
.field private l:I

.field private m:Lnh/o;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lnh/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lnh/n;->l:Lnh/o;

    .line 5
    .line 6
    iput-object v0, p0, Lgh/p$b;->m:Lnh/o;

    .line 7
    .line 8
    invoke-direct {p0}, Lgh/p$b;->x()V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method static synthetic r()Lgh/p$b;
    .locals 1

    invoke-static {}, Lgh/p$b;->v()Lgh/p$b;

    move-result-object v0

    return-object v0
.end method

.method private static v()Lgh/p$b;
    .locals 1

    new-instance v0, Lgh/p$b;

    invoke-direct {v0}, Lgh/p$b;-><init>()V

    return-object v0
.end method

.method private w()V
    .locals 3

    .line 1
    iget v0, p0, Lgh/p$b;->l:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lnh/n;

    .line 8
    .line 9
    iget-object v2, p0, Lgh/p$b;->m:Lnh/o;

    .line 10
    .line 11
    invoke-direct {v0, v2}, Lnh/n;-><init>(Lnh/o;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lgh/p$b;->m:Lnh/o;

    .line 15
    .line 16
    iget v0, p0, Lgh/p$b;->l:I

    .line 17
    .line 18
    or-int/2addr v0, v1

    .line 19
    iput v0, p0, Lgh/p$b;->l:I

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
.method public bridge synthetic build()Lnh/q;
    .locals 1

    invoke-virtual {p0}, Lgh/p$b;->s()Lgh/p;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgh/p$b;->u()Lgh/p$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic k(Lnh/e;Lnh/g;)Lnh/a$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lgh/p$b;->z(Lnh/e;Lnh/g;)Lgh/p$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Lnh/e;Lnh/g;)Lnh/q$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lgh/p$b;->z(Lnh/e;Lnh/g;)Lgh/p$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n()Lnh/i$b;
    .locals 1

    invoke-virtual {p0}, Lgh/p$b;->u()Lgh/p$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p(Lnh/i;)Lnh/i$b;
    .locals 0

    check-cast p1, Lgh/p;

    invoke-virtual {p0, p1}, Lgh/p$b;->y(Lgh/p;)Lgh/p$b;

    move-result-object p1

    return-object p1
.end method

.method public s()Lgh/p;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lgh/p$b;->t()Lgh/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lgh/p;->j()Z

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

.method public t()Lgh/p;
    .locals 3

    .line 1
    new-instance v0, Lgh/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lgh/p;-><init>(Lnh/i$b;Lgh/a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lgh/p$b;->l:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    and-int/2addr v1, v2

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lgh/p$b;->m:Lnh/o;

    .line 14
    .line 15
    invoke-interface {v1}, Lnh/o;->p()Lnh/o;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, Lgh/p$b;->m:Lnh/o;

    .line 20
    .line 21
    iget v1, p0, Lgh/p$b;->l:I

    .line 22
    .line 23
    and-int/lit8 v1, v1, -0x2

    .line 24
    .line 25
    iput v1, p0, Lgh/p$b;->l:I

    .line 26
    .line 27
    :cond_0
    iget-object v1, p0, Lgh/p$b;->m:Lnh/o;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lgh/p;->t(Lgh/p;Lnh/o;)Lnh/o;

    .line 30
    .line 31
    .line 32
    return-object v0
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
    .line 47
    .line 48
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

.method public u()Lgh/p$b;
    .locals 2

    invoke-static {}, Lgh/p$b;->v()Lgh/p$b;

    move-result-object v0

    invoke-virtual {p0}, Lgh/p$b;->t()Lgh/p;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgh/p$b;->y(Lgh/p;)Lgh/p$b;

    move-result-object v0

    return-object v0
.end method

.method public y(Lgh/p;)Lgh/p$b;
    .locals 2

    .line 1
    invoke-static {}, Lgh/p;->v()Lgh/p;

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
    invoke-static {p1}, Lgh/p;->s(Lgh/p;)Lnh/o;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lgh/p$b;->m:Lnh/o;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {p1}, Lgh/p;->s(Lgh/p;)Lnh/o;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lgh/p$b;->m:Lnh/o;

    .line 31
    .line 32
    iget v0, p0, Lgh/p$b;->l:I

    .line 33
    .line 34
    and-int/lit8 v0, v0, -0x2

    .line 35
    .line 36
    iput v0, p0, Lgh/p$b;->l:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-direct {p0}, Lgh/p$b;->w()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lgh/p$b;->m:Lnh/o;

    .line 43
    .line 44
    invoke-static {p1}, Lgh/p;->s(Lgh/p;)Lnh/o;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lnh/i$b;->o()Lnh/d;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {p1}, Lgh/p;->u(Lgh/p;)Lnh/d;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v0, p1}, Lnh/d;->e(Lnh/d;)Lnh/d;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p0, p1}, Lnh/i$b;->q(Lnh/d;)Lnh/i$b;

    .line 64
    .line 65
    .line 66
    return-object p0
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
.end method

.method public z(Lnh/e;Lnh/g;)Lgh/p$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lgh/p;->q:Lnh/s;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, Lnh/s;->c(Lnh/e;Lnh/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lgh/p;
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lgh/p$b;->y(Lgh/p;)Lgh/p$b;

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
    check-cast p2, Lgh/p;
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
    invoke-virtual {p0, v0}, Lgh/p$b;->y(Lgh/p;)Lgh/p$b;

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
