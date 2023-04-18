.class public final Lgh/p;
.super Lnh/i;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/p$b;
    }
.end annotation


# static fields
.field private static final p:Lgh/p;

.field public static q:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final l:Lnh/d;

.field private m:Lnh/o;

.field private n:B

.field private o:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/p$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/p$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/p;->q:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/p;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/p;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/p;->p:Lgh/p;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/p;->y()V

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
    iput-byte v0, p0, Lgh/p;->n:B

    .line 13
    iput v0, p0, Lgh/p;->o:I

    .line 14
    invoke-direct {p0}, Lgh/p;->y()V

    .line 15
    invoke-static {}, Lnh/d;->w()Lnh/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 16
    invoke-static {v0, v1}, Lnh/f;->J(Ljava/io/OutputStream;I)Lnh/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    if-nez v3, :cond_5

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v5

    if-eqz v5, :cond_3

    const/16 v6, 0xa

    if-eq v5, v6, :cond_1

    .line 18
    invoke-virtual {p0, p1, v2, p2, v5}, Lnh/i;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p1}, Lnh/e;->l()Lnh/d;

    move-result-object v5

    and-int/lit8 v6, v4, 0x1

    if-eq v6, v1, :cond_2

    .line 20
    new-instance v6, Lnh/n;

    invoke-direct {v6}, Lnh/n;-><init>()V

    iput-object v6, p0, Lgh/p;->m:Lnh/o;

    or-int/lit8 v4, v4, 0x1

    .line 21
    :cond_2
    iget-object v6, p0, Lgh/p;->m:Lnh/o;

    invoke-interface {v6, v5}, Lnh/o;->m(Lnh/d;)V
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_3
    :goto_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 22
    :try_start_1
    new-instance p2, Lnh/k;

    .line 23
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 24
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    and-int/lit8 p2, v4, 0x1

    if-ne p2, v1, :cond_4

    .line 25
    iget-object p2, p0, Lgh/p;->m:Lnh/o;

    invoke-interface {p2}, Lnh/o;->p()Lnh/o;

    move-result-object p2

    iput-object p2, p0, Lgh/p;->m:Lnh/o;

    .line 26
    :cond_4
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/p;->l:Lnh/d;

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/p;->l:Lnh/d;

    .line 28
    throw p1

    .line 29
    :goto_3
    invoke-virtual {p0}, Lnh/i;->n()V

    .line 30
    throw p1

    :cond_5
    and-int/lit8 p1, v4, 0x1

    if-ne p1, v1, :cond_6

    .line 31
    iget-object p1, p0, Lgh/p;->m:Lnh/o;

    invoke-interface {p1}, Lnh/o;->p()Lnh/o;

    move-result-object p1

    iput-object p1, p0, Lgh/p;->m:Lnh/o;

    .line 32
    :cond_6
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 33
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/p;->l:Lnh/d;

    goto :goto_4

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/p;->l:Lnh/d;

    .line 34
    throw p1

    .line 35
    :goto_4
    invoke-virtual {p0}, Lnh/i;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/p;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lnh/i;-><init>(Lnh/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lgh/p;->n:B

    .line 5
    iput v0, p0, Lgh/p;->o:I

    .line 6
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/p;->l:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$b;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/p;-><init>(Lnh/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lgh/p;->n:B

    .line 9
    iput p1, p0, Lgh/p;->o:I

    .line 10
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/p;->l:Lnh/d;

    return-void
.end method

.method public static A(Lgh/p;)Lgh/p$b;
    .locals 1

    invoke-static {}, Lgh/p;->z()Lgh/p$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/p$b;->y(Lgh/p;)Lgh/p$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(Lgh/p;)Lnh/o;
    .locals 0

    iget-object p0, p0, Lgh/p;->m:Lnh/o;

    return-object p0
.end method

.method static synthetic t(Lgh/p;Lnh/o;)Lnh/o;
    .locals 0

    iput-object p1, p0, Lgh/p;->m:Lnh/o;

    return-object p1
.end method

.method static synthetic u(Lgh/p;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/p;->l:Lnh/d;

    return-object p0
.end method

.method public static v()Lgh/p;
    .locals 1

    sget-object v0, Lgh/p;->p:Lgh/p;

    return-object v0
.end method

.method private y()V
    .locals 1

    sget-object v0, Lnh/n;->l:Lnh/o;

    iput-object v0, p0, Lgh/p;->m:Lnh/o;

    return-void
.end method

.method public static z()Lgh/p$b;
    .locals 1

    invoke-static {}, Lgh/p$b;->r()Lgh/p$b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public B()Lgh/p$b;
    .locals 1

    invoke-static {}, Lgh/p;->z()Lgh/p$b;

    move-result-object v0

    return-object v0
.end method

.method public C()Lgh/p$b;
    .locals 1

    invoke-static {p0}, Lgh/p;->A(Lgh/p;)Lgh/p$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/p;->C()Lgh/p$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 4

    .line 1
    iget v0, p0, Lgh/p;->o:I

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
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    iget-object v3, p0, Lgh/p;->m:Lnh/o;

    .line 11
    .line 12
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v1, v3, :cond_1

    .line 17
    .line 18
    iget-object v3, p0, Lgh/p;->m:Lnh/o;

    .line 19
    .line 20
    invoke-interface {v3, v1}, Lnh/o;->o(I)Lnh/d;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, Lnh/f;->e(Lnh/d;)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    add-int/2addr v2, v3

    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    add-int/2addr v0, v2

    .line 33
    invoke-virtual {p0}, Lgh/p;->x()Lnh/t;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    mul-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    add-int/2addr v0, v1

    .line 44
    iget-object v1, p0, Lgh/p;->l:Lnh/d;

    .line 45
    .line 46
    invoke-virtual {v1}, Lnh/d;->size()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    add-int/2addr v0, v1

    .line 51
    iput v0, p0, Lgh/p;->o:I

    .line 52
    .line 53
    return v0
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

.method public e(Lnh/f;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lgh/p;->d()I

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget-object v1, p0, Lgh/p;->m:Lnh/o;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lgh/p;->m:Lnh/o;

    .line 14
    .line 15
    invoke-interface {v1, v0}, Lnh/o;->o(I)Lnh/d;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {p1, v2, v1}, Lnh/f;->O(ILnh/d;)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lgh/p;->l:Lnh/d;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
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
.end method

.method public bridge synthetic g()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/p;->B()Lgh/p$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/p;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/p;->q:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lgh/p;->n:B

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
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_1
    iput-byte v1, p0, Lgh/p;->n:B

    .line 12
    .line 13
    return v1
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

.method public w(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgh/p;->m:Lnh/o;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public x()Lnh/t;
    .locals 1

    iget-object v0, p0, Lgh/p;->m:Lnh/o;

    return-object v0
.end method
