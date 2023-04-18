.class public final Ljh/a$d$b;
.super Lnh/i$b;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljh/a$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/i$b<",
        "Ljh/a$d;",
        "Ljh/a$d$b;",
        ">;",
        "Lnh/r;"
    }
.end annotation


# instance fields
.field private l:I

.field private m:Ljh/a$b;

.field private n:Ljh/a$c;

.field private o:Ljh/a$c;

.field private p:Ljh/a$c;

.field private q:Ljh/a$c;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lnh/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljh/a$b;->w()Ljh/a$b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Ljh/a$d$b;->m:Ljh/a$b;

    .line 9
    .line 10
    invoke-static {}, Ljh/a$c;->w()Ljh/a$c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Ljh/a$d$b;->n:Ljh/a$c;

    .line 15
    .line 16
    invoke-static {}, Ljh/a$c;->w()Ljh/a$c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Ljh/a$d$b;->o:Ljh/a$c;

    .line 21
    .line 22
    invoke-static {}, Ljh/a$c;->w()Ljh/a$c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Ljh/a$d$b;->p:Ljh/a$c;

    .line 27
    .line 28
    invoke-static {}, Ljh/a$c;->w()Ljh/a$c;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Ljh/a$d$b;->q:Ljh/a$c;

    .line 33
    .line 34
    invoke-direct {p0}, Ljh/a$d$b;->w()V

    .line 35
    .line 36
    .line 37
    return-void
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

.method static synthetic r()Ljh/a$d$b;
    .locals 1

    invoke-static {}, Ljh/a$d$b;->v()Ljh/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method private static v()Ljh/a$d$b;
    .locals 1

    new-instance v0, Ljh/a$d$b;

    invoke-direct {v0}, Ljh/a$d$b;-><init>()V

    return-object v0
.end method

.method private w()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(Lnh/e;Lnh/g;)Ljh/a$d$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Ljh/a$d;->v:Lnh/s;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, Lnh/s;->c(Lnh/e;Lnh/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljh/a$d;
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ljh/a$d$b;->z(Ljh/a$d;)Ljh/a$d$b;

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
    check-cast p2, Ljh/a$d;
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
    invoke-virtual {p0, v0}, Ljh/a$d$b;->z(Ljh/a$d;)Ljh/a$d$b;

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

.method public B(Ljh/a$c;)Ljh/a$d$b;
    .locals 3

    .line 1
    iget v0, p0, Ljh/a$d$b;->l:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ljh/a$d$b;->o:Ljh/a$c;

    .line 8
    .line 9
    invoke-static {}, Ljh/a$c;->w()Ljh/a$c;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Ljh/a$d$b;->o:Ljh/a$c;

    .line 16
    .line 17
    invoke-static {v0}, Ljh/a$c;->D(Ljh/a$c;)Ljh/a$c$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Ljh/a$c$b;->x(Ljh/a$c;)Ljh/a$c$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljh/a$c$b;->t()Ljh/a$c;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Ljh/a$d$b;->o:Ljh/a$c;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, Ljh/a$d$b;->o:Ljh/a$c;

    .line 33
    .line 34
    :goto_0
    iget p1, p0, Ljh/a$d$b;->l:I

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    iput p1, p0, Ljh/a$d$b;->l:I

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

.method public C(Ljh/a$c;)Ljh/a$d$b;
    .locals 3

    .line 1
    iget v0, p0, Ljh/a$d$b;->l:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Ljh/a$d$b;->p:Ljh/a$c;

    .line 9
    .line 10
    invoke-static {}, Ljh/a$c;->w()Ljh/a$c;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Ljh/a$d$b;->p:Ljh/a$c;

    .line 17
    .line 18
    invoke-static {v0}, Ljh/a$c;->D(Ljh/a$c;)Ljh/a$c$b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, Ljh/a$c$b;->x(Ljh/a$c;)Ljh/a$c$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljh/a$c$b;->t()Ljh/a$c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Ljh/a$d$b;->p:Ljh/a$c;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput-object p1, p0, Ljh/a$d$b;->p:Ljh/a$c;

    .line 34
    .line 35
    :goto_0
    iget p1, p0, Ljh/a$d$b;->l:I

    .line 36
    .line 37
    or-int/2addr p1, v1

    .line 38
    iput p1, p0, Ljh/a$d$b;->l:I

    .line 39
    .line 40
    return-object p0
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

.method public D(Ljh/a$c;)Ljh/a$d$b;
    .locals 3

    .line 1
    iget v0, p0, Ljh/a$d$b;->l:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ljh/a$d$b;->n:Ljh/a$c;

    .line 8
    .line 9
    invoke-static {}, Ljh/a$c;->w()Ljh/a$c;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Ljh/a$d$b;->n:Ljh/a$c;

    .line 16
    .line 17
    invoke-static {v0}, Ljh/a$c;->D(Ljh/a$c;)Ljh/a$c$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Ljh/a$c$b;->x(Ljh/a$c;)Ljh/a$c$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljh/a$c$b;->t()Ljh/a$c;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Ljh/a$d$b;->n:Ljh/a$c;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, Ljh/a$d$b;->n:Ljh/a$c;

    .line 33
    .line 34
    :goto_0
    iget p1, p0, Ljh/a$d$b;->l:I

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    iput p1, p0, Ljh/a$d$b;->l:I

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

.method public bridge synthetic build()Lnh/q;
    .locals 1

    invoke-virtual {p0}, Ljh/a$d$b;->s()Ljh/a$d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljh/a$d$b;->u()Ljh/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic k(Lnh/e;Lnh/g;)Lnh/a$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ljh/a$d$b;->A(Lnh/e;Lnh/g;)Ljh/a$d$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Lnh/e;Lnh/g;)Lnh/q$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ljh/a$d$b;->A(Lnh/e;Lnh/g;)Ljh/a$d$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n()Lnh/i$b;
    .locals 1

    invoke-virtual {p0}, Ljh/a$d$b;->u()Ljh/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p(Lnh/i;)Lnh/i$b;
    .locals 0

    check-cast p1, Ljh/a$d;

    invoke-virtual {p0, p1}, Ljh/a$d$b;->z(Ljh/a$d;)Ljh/a$d$b;

    move-result-object p1

    return-object p1
.end method

.method public s()Ljh/a$d;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljh/a$d$b;->t()Ljh/a$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljh/a$d;->j()Z

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

.method public t()Ljh/a$d;
    .locals 5

    .line 1
    new-instance v0, Ljh/a$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ljh/a$d;-><init>(Lnh/i$b;Ljh/a$a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Ljh/a$d$b;->l:I

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
    iget-object v2, p0, Ljh/a$d$b;->m:Ljh/a$b;

    .line 17
    .line 18
    invoke-static {v0, v2}, Ljh/a$d;->s(Ljh/a$d;Ljh/a$b;)Ljh/a$b;

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
    iget-object v2, p0, Ljh/a$d$b;->n:Ljh/a$c;

    .line 29
    .line 30
    invoke-static {v0, v2}, Ljh/a$d;->t(Ljh/a$d;Ljh/a$c;)Ljh/a$c;

    .line 31
    .line 32
    .line 33
    and-int/lit8 v2, v1, 0x4

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    if-ne v2, v4, :cond_2

    .line 37
    .line 38
    or-int/lit8 v3, v3, 0x4

    .line 39
    .line 40
    :cond_2
    iget-object v2, p0, Ljh/a$d$b;->o:Ljh/a$c;

    .line 41
    .line 42
    invoke-static {v0, v2}, Ljh/a$d;->u(Ljh/a$d;Ljh/a$c;)Ljh/a$c;

    .line 43
    .line 44
    .line 45
    and-int/lit8 v2, v1, 0x8

    .line 46
    .line 47
    const/16 v4, 0x8

    .line 48
    .line 49
    if-ne v2, v4, :cond_3

    .line 50
    .line 51
    or-int/lit8 v3, v3, 0x8

    .line 52
    .line 53
    :cond_3
    iget-object v2, p0, Ljh/a$d$b;->p:Ljh/a$c;

    .line 54
    .line 55
    invoke-static {v0, v2}, Ljh/a$d;->v(Ljh/a$d;Ljh/a$c;)Ljh/a$c;

    .line 56
    .line 57
    .line 58
    const/16 v2, 0x10

    .line 59
    .line 60
    and-int/2addr v1, v2

    .line 61
    if-ne v1, v2, :cond_4

    .line 62
    .line 63
    or-int/lit8 v3, v3, 0x10

    .line 64
    .line 65
    :cond_4
    iget-object v1, p0, Ljh/a$d$b;->q:Ljh/a$c;

    .line 66
    .line 67
    invoke-static {v0, v1}, Ljh/a$d;->w(Ljh/a$d;Ljh/a$c;)Ljh/a$c;

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v3}, Ljh/a$d;->x(Ljh/a$d;I)I

    .line 71
    .line 72
    .line 73
    return-object v0
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

.method public u()Ljh/a$d$b;
    .locals 2

    invoke-static {}, Ljh/a$d$b;->v()Ljh/a$d$b;

    move-result-object v0

    invoke-virtual {p0}, Ljh/a$d$b;->t()Ljh/a$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljh/a$d$b;->z(Ljh/a$d;)Ljh/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public x(Ljh/a$c;)Ljh/a$d$b;
    .locals 3

    .line 1
    iget v0, p0, Ljh/a$d$b;->l:I

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Ljh/a$d$b;->q:Ljh/a$c;

    .line 9
    .line 10
    invoke-static {}, Ljh/a$c;->w()Ljh/a$c;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Ljh/a$d$b;->q:Ljh/a$c;

    .line 17
    .line 18
    invoke-static {v0}, Ljh/a$c;->D(Ljh/a$c;)Ljh/a$c$b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, Ljh/a$c$b;->x(Ljh/a$c;)Ljh/a$c$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljh/a$c$b;->t()Ljh/a$c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Ljh/a$d$b;->q:Ljh/a$c;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput-object p1, p0, Ljh/a$d$b;->q:Ljh/a$c;

    .line 34
    .line 35
    :goto_0
    iget p1, p0, Ljh/a$d$b;->l:I

    .line 36
    .line 37
    or-int/2addr p1, v1

    .line 38
    iput p1, p0, Ljh/a$d$b;->l:I

    .line 39
    .line 40
    return-object p0
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

.method public y(Ljh/a$b;)Ljh/a$d$b;
    .locals 3

    .line 1
    iget v0, p0, Ljh/a$d$b;->l:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ljh/a$d$b;->m:Ljh/a$b;

    .line 8
    .line 9
    invoke-static {}, Ljh/a$b;->w()Ljh/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Ljh/a$d$b;->m:Ljh/a$b;

    .line 16
    .line 17
    invoke-static {v0}, Ljh/a$b;->D(Ljh/a$b;)Ljh/a$b$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Ljh/a$b$b;->x(Ljh/a$b;)Ljh/a$b$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljh/a$b$b;->t()Ljh/a$b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Ljh/a$d$b;->m:Ljh/a$b;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, Ljh/a$d$b;->m:Ljh/a$b;

    .line 33
    .line 34
    :goto_0
    iget p1, p0, Ljh/a$d$b;->l:I

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    iput p1, p0, Ljh/a$d$b;->l:I

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

.method public z(Ljh/a$d;)Ljh/a$d$b;
    .locals 1

    .line 1
    invoke-static {}, Ljh/a$d;->z()Ljh/a$d;

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
    invoke-virtual {p1}, Ljh/a$d;->G()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Ljh/a$d;->B()Ljh/a$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Ljh/a$d$b;->y(Ljh/a$b;)Ljh/a$d$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Ljh/a$d;->J()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Ljh/a$d;->E()Ljh/a$c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Ljh/a$d$b;->D(Ljh/a$c;)Ljh/a$d$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, Ljh/a$d;->H()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Ljh/a$d;->C()Ljh/a$c;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, Ljh/a$d$b;->B(Ljh/a$c;)Ljh/a$d$b;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, Ljh/a$d;->I()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1}, Ljh/a$d;->D()Ljh/a$c;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0, v0}, Ljh/a$d$b;->C(Ljh/a$c;)Ljh/a$d$b;

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p1}, Ljh/a$d;->F()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, Ljh/a$d;->A()Ljh/a$c;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p0, v0}, Ljh/a$d$b;->x(Ljh/a$c;)Ljh/a$d$b;

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p0}, Lnh/i$b;->o()Lnh/d;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {p1}, Ljh/a$d;->y(Ljh/a$d;)Lnh/d;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v0, p1}, Lnh/d;->e(Lnh/d;)Lnh/d;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0, p1}, Lnh/i$b;->q(Lnh/d;)Lnh/i$b;

    .line 86
    .line 87
    .line 88
    return-object p0
    .line 89
    .line 90
.end method
