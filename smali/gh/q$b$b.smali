.class public final Lgh/q$b$b;
.super Lnh/i$b;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgh/q$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/i$b<",
        "Lgh/q$b;",
        "Lgh/q$b$b;",
        ">;",
        "Lnh/r;"
    }
.end annotation


# instance fields
.field private l:I

.field private m:Lgh/q$b$c;

.field private n:Lgh/q;

.field private o:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lnh/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lgh/q$b$c;->n:Lgh/q$b$c;

    .line 5
    .line 6
    iput-object v0, p0, Lgh/q$b$b;->m:Lgh/q$b$c;

    .line 7
    .line 8
    invoke-static {}, Lgh/q;->Y()Lgh/q;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lgh/q$b$b;->n:Lgh/q;

    .line 13
    .line 14
    invoke-direct {p0}, Lgh/q$b$b;->w()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method static synthetic r()Lgh/q$b$b;
    .locals 1

    invoke-static {}, Lgh/q$b$b;->v()Lgh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method private static v()Lgh/q$b$b;
    .locals 1

    new-instance v0, Lgh/q$b$b;

    invoke-direct {v0}, Lgh/q$b$b;-><init>()V

    return-object v0
.end method

.method private w()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(Lgh/q$b$c;)Lgh/q$b$b;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lgh/q$b$b;->l:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iput v0, p0, Lgh/q$b$b;->l:I

    .line 9
    .line 10
    iput-object p1, p0, Lgh/q$b$b;->m:Lgh/q$b$c;

    .line 11
    .line 12
    return-object p0
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

.method public B(I)Lgh/q$b$b;
    .locals 1

    .line 1
    iget v0, p0, Lgh/q$b$b;->l:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iput v0, p0, Lgh/q$b$b;->l:I

    .line 6
    .line 7
    iput p1, p0, Lgh/q$b$b;->o:I

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

    invoke-virtual {p0}, Lgh/q$b$b;->s()Lgh/q$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgh/q$b$b;->u()Lgh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic k(Lnh/e;Lnh/g;)Lnh/a$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lgh/q$b$b;->y(Lnh/e;Lnh/g;)Lgh/q$b$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Lnh/e;Lnh/g;)Lnh/q$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lgh/q$b$b;->y(Lnh/e;Lnh/g;)Lgh/q$b$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n()Lnh/i$b;
    .locals 1

    invoke-virtual {p0}, Lgh/q$b$b;->u()Lgh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p(Lnh/i;)Lnh/i$b;
    .locals 0

    check-cast p1, Lgh/q$b;

    invoke-virtual {p0, p1}, Lgh/q$b$b;->x(Lgh/q$b;)Lgh/q$b$b;

    move-result-object p1

    return-object p1
.end method

.method public s()Lgh/q$b;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lgh/q$b$b;->t()Lgh/q$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lgh/q$b;->j()Z

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

.method public t()Lgh/q$b;
    .locals 5

    .line 1
    new-instance v0, Lgh/q$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lgh/q$b;-><init>(Lnh/i$b;Lgh/a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lgh/q$b$b;->l:I

    .line 8
    .line 9
    and-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    :goto_0
    iget-object v2, p0, Lgh/q$b$b;->m:Lgh/q$b$c;

    .line 17
    .line 18
    invoke-static {v0, v2}, Lgh/q$b;->s(Lgh/q$b;Lgh/q$b$c;)Lgh/q$b$c;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v2, v1, 0x2

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    if-ne v2, v4, :cond_1

    .line 25
    .line 26
    or-int/lit8 v3, v3, 0x2

    .line 27
    .line 28
    :cond_1
    iget-object v2, p0, Lgh/q$b$b;->n:Lgh/q;

    .line 29
    .line 30
    invoke-static {v0, v2}, Lgh/q$b;->t(Lgh/q$b;Lgh/q;)Lgh/q;

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    and-int/2addr v1, v2

    .line 35
    if-ne v1, v2, :cond_2

    .line 36
    .line 37
    or-int/lit8 v3, v3, 0x4

    .line 38
    .line 39
    :cond_2
    iget v1, p0, Lgh/q$b$b;->o:I

    .line 40
    .line 41
    invoke-static {v0, v1}, Lgh/q$b;->u(Lgh/q$b;I)I

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v3}, Lgh/q$b;->v(Lgh/q$b;I)I

    .line 45
    .line 46
    .line 47
    return-object v0
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

.method public u()Lgh/q$b$b;
    .locals 2

    invoke-static {}, Lgh/q$b$b;->v()Lgh/q$b$b;

    move-result-object v0

    invoke-virtual {p0}, Lgh/q$b$b;->t()Lgh/q$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgh/q$b$b;->x(Lgh/q$b;)Lgh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public x(Lgh/q$b;)Lgh/q$b$b;
    .locals 1

    .line 1
    invoke-static {}, Lgh/q$b;->x()Lgh/q$b;

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
    invoke-virtual {p1}, Lgh/q$b;->B()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lgh/q$b;->y()Lgh/q$b$c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Lgh/q$b$b;->A(Lgh/q$b$c;)Lgh/q$b$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Lgh/q$b;->C()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lgh/q$b;->z()Lgh/q;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Lgh/q$b$b;->z(Lgh/q;)Lgh/q$b$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, Lgh/q$b;->D()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Lgh/q$b;->A()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p0, v0}, Lgh/q$b$b;->B(I)Lgh/q$b$b;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p0}, Lnh/i$b;->o()Lnh/d;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {p1}, Lgh/q$b;->w(Lgh/q$b;)Lnh/d;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Lnh/d;->e(Lnh/d;)Lnh/d;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p0, p1}, Lnh/i$b;->q(Lnh/d;)Lnh/i$b;

    .line 60
    .line 61
    .line 62
    return-object p0
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
.end method

.method public y(Lnh/e;Lnh/g;)Lgh/q$b$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lgh/q$b;->t:Lnh/s;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, Lnh/s;->c(Lnh/e;Lnh/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lgh/q$b;
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lgh/q$b$b;->x(Lgh/q$b;)Lgh/q$b$b;

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
    check-cast p2, Lgh/q$b;
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
    invoke-virtual {p0, v0}, Lgh/q$b$b;->x(Lgh/q$b;)Lgh/q$b$b;

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

.method public z(Lgh/q;)Lgh/q$b$b;
    .locals 3

    .line 1
    iget v0, p0, Lgh/q$b$b;->l:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lgh/q$b$b;->n:Lgh/q;

    .line 8
    .line 9
    invoke-static {}, Lgh/q;->Y()Lgh/q;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lgh/q$b$b;->n:Lgh/q;

    .line 16
    .line 17
    invoke-static {v0}, Lgh/q;->z0(Lgh/q;)Lgh/q$c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Lgh/q$c;->E(Lgh/q;)Lgh/q$c;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lgh/q$c;->x()Lgh/q;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lgh/q$b$b;->n:Lgh/q;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, Lgh/q$b$b;->n:Lgh/q;

    .line 33
    .line 34
    :goto_0
    iget p1, p0, Lgh/q$b$b;->l:I

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    iput p1, p0, Lgh/q$b$b;->l:I

    .line 38
    .line 39
    return-object p0
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
.end method
