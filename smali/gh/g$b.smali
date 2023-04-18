.class public final Lgh/g$b;
.super Lnh/i$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgh/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/i$c<",
        "Lgh/g;",
        "Lgh/g$b;",
        ">;"
    }
.end annotation


# instance fields
.field private n:I

.field private o:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnh/i$c;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lgh/g$b;->A()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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
.end method

.method private A()V
    .locals 0

    return-void
.end method

.method static synthetic v()Lgh/g$b;
    .locals 1

    invoke-static {}, Lgh/g$b;->z()Lgh/g$b;

    move-result-object v0

    return-object v0
.end method

.method private static z()Lgh/g$b;
    .locals 1

    new-instance v0, Lgh/g$b;

    invoke-direct {v0}, Lgh/g$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public B(Lgh/g;)Lgh/g$b;
    .locals 1

    .line 1
    invoke-static {}, Lgh/g;->E()Lgh/g;

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
    invoke-virtual {p1}, Lgh/g;->H()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lgh/g;->G()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, Lgh/g$b;->D(I)Lgh/g$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p0, p1}, Lnh/i$c;->u(Lnh/i$d;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lnh/i$b;->o()Lnh/d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {p1}, Lgh/g;->D(Lgh/g;)Lnh/d;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Lnh/d;->e(Lnh/d;)Lnh/d;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, p1}, Lnh/i$b;->q(Lnh/d;)Lnh/i$b;

    .line 37
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

.method public C(Lnh/e;Lnh/g;)Lgh/g$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lgh/g;->s:Lnh/s;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, Lnh/s;->c(Lnh/e;Lnh/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lgh/g;
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lgh/g$b;->B(Lgh/g;)Lgh/g$b;

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
    check-cast p2, Lgh/g;
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
    invoke-virtual {p0, v0}, Lgh/g$b;->B(Lgh/g;)Lgh/g$b;

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

.method public D(I)Lgh/g$b;
    .locals 1

    .line 1
    iget v0, p0, Lgh/g$b;->n:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lgh/g$b;->n:I

    .line 6
    .line 7
    iput p1, p0, Lgh/g$b;->o:I

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

    invoke-virtual {p0}, Lgh/g$b;->w()Lgh/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgh/g$b;->y()Lgh/g$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic k(Lnh/e;Lnh/g;)Lnh/a$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lgh/g$b;->C(Lnh/e;Lnh/g;)Lgh/g$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Lnh/e;Lnh/g;)Lnh/q$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lgh/g$b;->C(Lnh/e;Lnh/g;)Lgh/g$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n()Lnh/i$b;
    .locals 1

    invoke-virtual {p0}, Lgh/g$b;->y()Lgh/g$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p(Lnh/i;)Lnh/i$b;
    .locals 0

    check-cast p1, Lgh/g;

    invoke-virtual {p0, p1}, Lgh/g$b;->B(Lgh/g;)Lgh/g$b;

    move-result-object p1

    return-object p1
.end method

.method public w()Lgh/g;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lgh/g$b;->x()Lgh/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lgh/g;->j()Z

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

.method public x()Lgh/g;
    .locals 3

    .line 1
    new-instance v0, Lgh/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lgh/g;-><init>(Lnh/i$c;Lgh/a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lgh/g$b;->n:I

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
    iget v1, p0, Lgh/g$b;->o:I

    .line 16
    .line 17
    invoke-static {v0, v1}, Lgh/g;->B(Lgh/g;I)I

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2}, Lgh/g;->C(Lgh/g;I)I

    .line 21
    .line 22
    .line 23
    return-object v0
    .line 24
.end method

.method public y()Lgh/g$b;
    .locals 2

    invoke-static {}, Lgh/g$b;->z()Lgh/g$b;

    move-result-object v0

    invoke-virtual {p0}, Lgh/g$b;->x()Lgh/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgh/g$b;->B(Lgh/g;)Lgh/g$b;

    move-result-object v0

    return-object v0
.end method
