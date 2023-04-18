.class public final Lgh/g;
.super Lnh/i$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/g$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/i$d<",
        "Lgh/g;",
        ">;"
    }
.end annotation


# static fields
.field private static final r:Lgh/g;

.field public static s:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final m:Lnh/d;

.field private n:I

.field private o:I

.field private p:B

.field private q:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/g$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/g$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/g;->s:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/g;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/g;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/g;->r:Lgh/g;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/g;->I()V

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
    .locals 6

    .line 11
    invoke-direct {p0}, Lnh/i$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lgh/g;->p:B

    .line 13
    iput v0, p0, Lgh/g;->q:I

    .line 14
    invoke-direct {p0}, Lgh/g;->I()V

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
    if-nez v3, :cond_3

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v4

    if-eqz v4, :cond_2

    const/16 v5, 0x8

    if-eq v4, v5, :cond_1

    .line 18
    invoke-virtual {p0, p1, v2, p2, v4}, Lnh/i$d;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    .line 19
    :cond_1
    iget v4, p0, Lgh/g;->n:I

    or-int/2addr v4, v1

    iput v4, p0, Lgh/g;->n:I

    .line 20
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v4

    iput v4, p0, Lgh/g;->o:I
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_2
    :goto_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 21
    :try_start_1
    new-instance p2, Lnh/k;

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 23
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    :goto_2
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 25
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/g;->m:Lnh/d;

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/g;->m:Lnh/d;

    .line 26
    throw p1

    .line 27
    :goto_3
    invoke-virtual {p0}, Lnh/i$d;->n()V

    .line 28
    throw p1

    .line 29
    :cond_3
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 30
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/g;->m:Lnh/d;

    goto :goto_4

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/g;->m:Lnh/d;

    .line 31
    throw p1

    .line 32
    :goto_4
    invoke-virtual {p0}, Lnh/i$d;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/g;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/i$c<",
            "Lgh/g;",
            "*>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Lnh/i$d;-><init>(Lnh/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lgh/g;->p:B

    .line 5
    iput v0, p0, Lgh/g;->q:I

    .line 6
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/g;->m:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$c;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/g;-><init>(Lnh/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lnh/i$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lgh/g;->p:B

    .line 9
    iput p1, p0, Lgh/g;->q:I

    .line 10
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/g;->m:Lnh/d;

    return-void
.end method

.method static synthetic B(Lgh/g;I)I
    .locals 0

    iput p1, p0, Lgh/g;->o:I

    return p1
.end method

.method static synthetic C(Lgh/g;I)I
    .locals 0

    iput p1, p0, Lgh/g;->n:I

    return p1
.end method

.method static synthetic D(Lgh/g;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/g;->m:Lnh/d;

    return-object p0
.end method

.method public static E()Lgh/g;
    .locals 1

    sget-object v0, Lgh/g;->r:Lgh/g;

    return-object v0
.end method

.method private I()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lgh/g;->o:I

    return-void
.end method

.method public static J()Lgh/g$b;
    .locals 1

    invoke-static {}, Lgh/g$b;->v()Lgh/g$b;

    move-result-object v0

    return-object v0
.end method

.method public static K(Lgh/g;)Lgh/g$b;
    .locals 1

    invoke-static {}, Lgh/g;->J()Lgh/g$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/g$b;->B(Lgh/g;)Lgh/g$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public F()Lgh/g;
    .locals 1

    sget-object v0, Lgh/g;->r:Lgh/g;

    return-object v0
.end method

.method public G()I
    .locals 1

    iget v0, p0, Lgh/g;->o:I

    return v0
.end method

.method public H()Z
    .locals 2

    iget v0, p0, Lgh/g;->n:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public L()Lgh/g$b;
    .locals 1

    invoke-static {}, Lgh/g;->J()Lgh/g$b;

    move-result-object v0

    return-object v0
.end method

.method public M()Lgh/g$b;
    .locals 1

    invoke-static {p0}, Lgh/g;->K(Lgh/g;)Lgh/g$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lnh/q;
    .locals 1

    invoke-virtual {p0}, Lgh/g;->F()Lgh/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/g;->M()Lgh/g$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 3

    .line 1
    iget v0, p0, Lgh/g;->q:I

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
    iget v0, p0, Lgh/g;->n:I

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
    iget v0, p0, Lgh/g;->o:I

    .line 15
    .line 16
    invoke-static {v1, v0}, Lnh/f;->o(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/2addr v2, v0

    .line 21
    :cond_1
    invoke-virtual {p0}, Lnh/i$d;->u()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/2addr v2, v0

    .line 26
    iget-object v0, p0, Lgh/g;->m:Lnh/d;

    .line 27
    .line 28
    invoke-virtual {v0}, Lnh/d;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/2addr v2, v0

    .line 33
    iput v2, p0, Lgh/g;->q:I

    .line 34
    .line 35
    return v2
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

.method public e(Lnh/f;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lgh/g;->d()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lnh/i$d;->z()Lnh/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lgh/g;->n:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget v1, p0, Lgh/g;->o:I

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, Lnh/f;->a0(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/16 v1, 0xc8

    .line 20
    .line 21
    invoke-virtual {v0, v1, p1}, Lnh/i$d$a;->a(ILnh/f;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lgh/g;->m:Lnh/d;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 27
    .line 28
    .line 29
    return-void
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

    invoke-virtual {p0}, Lgh/g;->L()Lgh/g$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/g;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/g;->s:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 3

    .line 1
    iget-byte v0, p0, Lgh/g;->p:B

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
    invoke-virtual {p0}, Lnh/i$d;->t()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lgh/g;->p:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iput-byte v1, p0, Lgh/g;->p:B

    .line 21
    .line 22
    return v1
    .line 23
    .line 24
.end method
