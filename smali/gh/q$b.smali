.class public final Lgh/q$b;
.super Lnh/i;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgh/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/q$b$b;,
        Lgh/q$b$c;
    }
.end annotation


# static fields
.field private static final s:Lgh/q$b;

.field public static t:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/q$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final l:Lnh/d;

.field private m:I

.field private n:Lgh/q$b$c;

.field private o:Lgh/q;

.field private p:I

.field private q:B

.field private r:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/q$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/q$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/q$b;->t:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/q$b;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/q$b;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/q$b;->s:Lgh/q$b;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/q$b;->E()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private constructor <init>(Lnh/e;Lnh/g;)V
    .locals 7

    .line 11
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lgh/q$b;->q:B

    .line 13
    iput v0, p0, Lgh/q$b;->r:I

    .line 14
    invoke-direct {p0}, Lgh/q$b;->E()V

    .line 15
    invoke-static {}, Lnh/d;->w()Lnh/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 16
    invoke-static {v0, v1}, Lnh/f;->J(Ljava/io/OutputStream;I)Lnh/f;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_8

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v4

    if-eqz v4, :cond_7

    const/16 v5, 0x8

    if-eq v4, v5, :cond_5

    const/16 v5, 0x12

    if-eq v4, v5, :cond_2

    const/16 v5, 0x18

    if-eq v4, v5, :cond_1

    .line 18
    invoke-virtual {p0, p1, v2, p2, v4}, Lnh/i;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    .line 19
    :cond_1
    iget v4, p0, Lgh/q$b;->m:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, Lgh/q$b;->m:I

    .line 20
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v4

    iput v4, p0, Lgh/q$b;->p:I

    goto :goto_0

    .line 21
    :cond_2
    iget v4, p0, Lgh/q$b;->m:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_3

    .line 22
    iget-object v4, p0, Lgh/q$b;->o:Lgh/q;

    invoke-virtual {v4}, Lgh/q;->B0()Lgh/q$c;

    move-result-object v4

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    .line 23
    :goto_1
    sget-object v6, Lgh/q;->F:Lnh/s;

    invoke-virtual {p1, v6, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v6

    check-cast v6, Lgh/q;

    iput-object v6, p0, Lgh/q$b;->o:Lgh/q;

    if-eqz v4, :cond_4

    .line 24
    invoke-virtual {v4, v6}, Lgh/q$c;->E(Lgh/q;)Lgh/q$c;

    .line 25
    invoke-virtual {v4}, Lgh/q$c;->x()Lgh/q;

    move-result-object v4

    iput-object v4, p0, Lgh/q$b;->o:Lgh/q;

    .line 26
    :cond_4
    iget v4, p0, Lgh/q$b;->m:I

    or-int/2addr v4, v5

    iput v4, p0, Lgh/q$b;->m:I

    goto :goto_0

    .line 27
    :cond_5
    invoke-virtual {p1}, Lnh/e;->n()I

    move-result v5

    .line 28
    invoke-static {v5}, Lgh/q$b$c;->a(I)Lgh/q$b$c;

    move-result-object v6

    if-nez v6, :cond_6

    .line 29
    invoke-virtual {v2, v4}, Lnh/f;->o0(I)V

    .line 30
    invoke-virtual {v2, v5}, Lnh/f;->o0(I)V

    goto :goto_0

    .line 31
    :cond_6
    iget v4, p0, Lgh/q$b;->m:I

    or-int/2addr v4, v1

    iput v4, p0, Lgh/q$b;->m:I

    .line 32
    iput-object v6, p0, Lgh/q$b;->n:Lgh/q$b$c;
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_7
    :goto_2
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 33
    :try_start_1
    new-instance p2, Lnh/k;

    .line 34
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 35
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_3
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/q$b;->l:Lnh/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/q$b;->l:Lnh/d;

    .line 38
    throw p1

    .line 39
    :goto_4
    invoke-virtual {p0}, Lnh/i;->n()V

    .line 40
    throw p1

    .line 41
    :cond_8
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 42
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/q$b;->l:Lnh/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/q$b;->l:Lnh/d;

    .line 43
    throw p1

    .line 44
    :goto_5
    invoke-virtual {p0}, Lnh/i;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/q$b;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lnh/i;-><init>(Lnh/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lgh/q$b;->q:B

    .line 5
    iput v0, p0, Lgh/q$b;->r:I

    .line 6
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/q$b;->l:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$b;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/q$b;-><init>(Lnh/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lgh/q$b;->q:B

    .line 9
    iput p1, p0, Lgh/q$b;->r:I

    .line 10
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/q$b;->l:Lnh/d;

    return-void
.end method

.method private E()V
    .locals 1

    .line 1
    sget-object v0, Lgh/q$b$c;->n:Lgh/q$b$c;

    .line 2
    .line 3
    iput-object v0, p0, Lgh/q$b;->n:Lgh/q$b$c;

    .line 4
    .line 5
    invoke-static {}, Lgh/q;->Y()Lgh/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lgh/q$b;->o:Lgh/q;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lgh/q$b;->p:I

    .line 13
    .line 14
    return-void
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

.method public static F()Lgh/q$b$b;
    .locals 1

    invoke-static {}, Lgh/q$b$b;->r()Lgh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public static G(Lgh/q$b;)Lgh/q$b$b;
    .locals 1

    invoke-static {}, Lgh/q$b;->F()Lgh/q$b$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/q$b$b;->x(Lgh/q$b;)Lgh/q$b$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(Lgh/q$b;Lgh/q$b$c;)Lgh/q$b$c;
    .locals 0

    iput-object p1, p0, Lgh/q$b;->n:Lgh/q$b$c;

    return-object p1
.end method

.method static synthetic t(Lgh/q$b;Lgh/q;)Lgh/q;
    .locals 0

    iput-object p1, p0, Lgh/q$b;->o:Lgh/q;

    return-object p1
.end method

.method static synthetic u(Lgh/q$b;I)I
    .locals 0

    iput p1, p0, Lgh/q$b;->p:I

    return p1
.end method

.method static synthetic v(Lgh/q$b;I)I
    .locals 0

    iput p1, p0, Lgh/q$b;->m:I

    return p1
.end method

.method static synthetic w(Lgh/q$b;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/q$b;->l:Lnh/d;

    return-object p0
.end method

.method public static x()Lgh/q$b;
    .locals 1

    sget-object v0, Lgh/q$b;->s:Lgh/q$b;

    return-object v0
.end method


# virtual methods
.method public A()I
    .locals 1

    iget v0, p0, Lgh/q$b;->p:I

    return v0
.end method

.method public B()Z
    .locals 2

    iget v0, p0, Lgh/q$b;->m:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public C()Z
    .locals 2

    iget v0, p0, Lgh/q$b;->m:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public D()Z
    .locals 2

    iget v0, p0, Lgh/q$b;->m:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public H()Lgh/q$b$b;
    .locals 1

    invoke-static {}, Lgh/q$b;->F()Lgh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public I()Lgh/q$b$b;
    .locals 1

    invoke-static {p0}, Lgh/q$b;->G(Lgh/q$b;)Lgh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/q$b;->I()Lgh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 3

    .line 1
    iget v0, p0, Lgh/q$b;->r:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lgh/q$b;->m:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lgh/q$b;->n:Lgh/q$b$c;

    .line 15
    .line 16
    invoke-virtual {v0}, Lgh/q$b$c;->getNumber()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v1, v0}, Lnh/f;->h(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v2, v0

    .line 25
    :cond_1
    iget v0, p0, Lgh/q$b;->m:I

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    and-int/2addr v0, v1

    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lgh/q$b;->o:Lgh/q;

    .line 32
    .line 33
    invoke-static {v1, v0}, Lnh/f;->s(ILnh/q;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v2, v0

    .line 38
    :cond_2
    iget v0, p0, Lgh/q$b;->m:I

    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    and-int/2addr v0, v1

    .line 42
    if-ne v0, v1, :cond_3

    .line 43
    .line 44
    const/4 v0, 0x3

    .line 45
    iget v1, p0, Lgh/q$b;->p:I

    .line 46
    .line 47
    invoke-static {v0, v1}, Lnh/f;->o(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    add-int/2addr v2, v0

    .line 52
    :cond_3
    iget-object v0, p0, Lgh/q$b;->l:Lnh/d;

    .line 53
    .line 54
    invoke-virtual {v0}, Lnh/d;->size()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/2addr v2, v0

    .line 59
    iput v2, p0, Lgh/q$b;->r:I

    .line 60
    .line 61
    return v2
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

.method public e(Lnh/f;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lgh/q$b;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lgh/q$b;->m:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lgh/q$b;->n:Lgh/q$b$c;

    .line 11
    .line 12
    invoke-virtual {v0}, Lgh/q$b$c;->getNumber()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1, v1, v0}, Lnh/f;->S(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget v0, p0, Lgh/q$b;->m:I

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    and-int/2addr v0, v1

    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lgh/q$b;->o:Lgh/q;

    .line 26
    .line 27
    invoke-virtual {p1, v1, v0}, Lnh/f;->d0(ILnh/q;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget v0, p0, Lgh/q$b;->m:I

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    and-int/2addr v0, v1

    .line 34
    if-ne v0, v1, :cond_2

    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    iget v1, p0, Lgh/q$b;->p:I

    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, Lnh/f;->a0(II)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Lgh/q$b;->l:Lnh/d;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 45
    .line 46
    .line 47
    return-void
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

.method public bridge synthetic g()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/q$b;->H()Lgh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/q$b;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/q$b;->t:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 3

    .line 1
    iget-byte v0, p0, Lgh/q$b;->q:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-virtual {p0}, Lgh/q$b;->C()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lgh/q$b;->z()Lgh/q;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lgh/q;->j()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iput-byte v2, p0, Lgh/q$b;->q:B

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    iput-byte v1, p0, Lgh/q$b;->q:B

    .line 31
    .line 32
    return v1
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

.method public y()Lgh/q$b$c;
    .locals 1

    iget-object v0, p0, Lgh/q$b;->n:Lgh/q$b$c;

    return-object v0
.end method

.method public z()Lgh/q;
    .locals 1

    iget-object v0, p0, Lgh/q$b;->o:Lgh/q;

    return-object v0
.end method
