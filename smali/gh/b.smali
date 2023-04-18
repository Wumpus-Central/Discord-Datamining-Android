.class public final Lgh/b;
.super Lnh/i;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/b$c;,
        Lgh/b$b;
    }
.end annotation


# static fields
.field private static final r:Lgh/b;

.field public static s:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final l:Lnh/d;

.field private m:I

.field private n:I

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/b$b;",
            ">;"
        }
    .end annotation
.end field

.field private p:B

.field private q:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/b;->s:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/b;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/b;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/b;->r:Lgh/b;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/b;->D()V

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
    .locals 8

    .line 11
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lgh/b;->p:B

    .line 13
    iput v0, p0, Lgh/b;->q:I

    .line 14
    invoke-direct {p0}, Lgh/b;->D()V

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
    const/4 v5, 0x2

    if-nez v3, :cond_6

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v6

    if-eqz v6, :cond_4

    const/16 v7, 0x8

    if-eq v6, v7, :cond_3

    const/16 v7, 0x12

    if-eq v6, v7, :cond_1

    .line 18
    invoke-virtual {p0, p1, v2, p2, v6}, Lnh/i;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_1
    and-int/lit8 v6, v4, 0x2

    if-eq v6, v5, :cond_2

    .line 19
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lgh/b;->o:Ljava/util/List;

    or-int/lit8 v4, v4, 0x2

    .line 20
    :cond_2
    iget-object v6, p0, Lgh/b;->o:Ljava/util/List;

    sget-object v7, Lgh/b$b;->s:Lnh/s;

    invoke-virtual {p1, v7, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_3
    iget v6, p0, Lgh/b;->m:I

    or-int/2addr v6, v1

    iput v6, p0, Lgh/b;->m:I

    .line 22
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v6

    iput v6, p0, Lgh/b;->n:I
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_4
    :goto_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 23
    :try_start_1
    new-instance p2, Lnh/k;

    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 25
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    and-int/lit8 p2, v4, 0x2

    if-ne p2, v5, :cond_5

    .line 26
    iget-object p2, p0, Lgh/b;->o:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/b;->o:Ljava/util/List;

    .line 27
    :cond_5
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/b;->l:Lnh/d;

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/b;->l:Lnh/d;

    .line 29
    throw p1

    .line 30
    :goto_3
    invoke-virtual {p0}, Lnh/i;->n()V

    .line 31
    throw p1

    :cond_6
    and-int/lit8 p1, v4, 0x2

    if-ne p1, v5, :cond_7

    .line 32
    iget-object p1, p0, Lgh/b;->o:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/b;->o:Ljava/util/List;

    .line 33
    :cond_7
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 34
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/b;->l:Lnh/d;

    goto :goto_4

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/b;->l:Lnh/d;

    .line 35
    throw p1

    .line 36
    :goto_4
    invoke-virtual {p0}, Lnh/i;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/b;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lnh/i;-><init>(Lnh/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lgh/b;->p:B

    .line 5
    iput v0, p0, Lgh/b;->q:I

    .line 6
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/b;->l:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$b;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/b;-><init>(Lnh/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lgh/b;->p:B

    .line 9
    iput p1, p0, Lgh/b;->q:I

    .line 10
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/b;->l:Lnh/d;

    return-void
.end method

.method public static A()Lgh/b;
    .locals 1

    sget-object v0, Lgh/b;->r:Lgh/b;

    return-object v0
.end method

.method private D()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lgh/b;->n:I

    .line 3
    .line 4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lgh/b;->o:Ljava/util/List;

    .line 9
    .line 10
    return-void
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

.method public static E()Lgh/b$c;
    .locals 1

    invoke-static {}, Lgh/b$c;->r()Lgh/b$c;

    move-result-object v0

    return-object v0
.end method

.method public static F(Lgh/b;)Lgh/b$c;
    .locals 1

    invoke-static {}, Lgh/b;->E()Lgh/b$c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/b$c;->y(Lgh/b;)Lgh/b$c;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(Lgh/b;I)I
    .locals 0

    iput p1, p0, Lgh/b;->n:I

    return p1
.end method

.method static synthetic t(Lgh/b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/b;->o:Ljava/util/List;

    return-object p0
.end method

.method static synthetic u(Lgh/b;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/b;->o:Ljava/util/List;

    return-object p1
.end method

.method static synthetic v(Lgh/b;I)I
    .locals 0

    iput p1, p0, Lgh/b;->m:I

    return p1
.end method

.method static synthetic w(Lgh/b;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/b;->l:Lnh/d;

    return-object p0
.end method


# virtual methods
.method public B()I
    .locals 1

    iget v0, p0, Lgh/b;->n:I

    return v0
.end method

.method public C()Z
    .locals 2

    iget v0, p0, Lgh/b;->m:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public G()Lgh/b$c;
    .locals 1

    invoke-static {}, Lgh/b;->E()Lgh/b$c;

    move-result-object v0

    return-object v0
.end method

.method public H()Lgh/b$c;
    .locals 1

    invoke-static {p0}, Lgh/b;->F(Lgh/b;)Lgh/b$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/b;->H()Lgh/b$c;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 4

    .line 1
    iget v0, p0, Lgh/b;->q:I

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
    iget v0, p0, Lgh/b;->m:I

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
    iget v0, p0, Lgh/b;->n:I

    .line 15
    .line 16
    invoke-static {v1, v0}, Lnh/f;->o(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/2addr v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v0, v2

    .line 23
    :goto_0
    iget-object v1, p0, Lgh/b;->o:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-ge v2, v1, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Lgh/b;->o:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lnh/q;

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    invoke-static {v3, v1}, Lnh/f;->s(ILnh/q;)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/2addr v0, v1

    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object v1, p0, Lgh/b;->l:Lnh/d;

    .line 49
    .line 50
    invoke-virtual {v1}, Lnh/d;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    add-int/2addr v0, v1

    .line 55
    iput v0, p0, Lgh/b;->q:I

    .line 56
    .line 57
    return v0
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
    invoke-virtual {p0}, Lgh/b;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lgh/b;->m:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lgh/b;->n:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lnh/f;->a0(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-object v1, p0, Lgh/b;->o:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-ge v0, v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lgh/b;->o:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lnh/q;

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    invoke-virtual {p1, v2, v1}, Lnh/f;->d0(ILnh/q;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v0, p0, Lgh/b;->l:Lnh/d;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 42
    .line 43
    .line 44
    return-void
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

    invoke-virtual {p0}, Lgh/b;->G()Lgh/b$c;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/b;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/b;->s:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lgh/b;->p:B

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
    invoke-virtual {p0}, Lgh/b;->C()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lgh/b;->p:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    move v0, v2

    .line 21
    :goto_0
    invoke-virtual {p0}, Lgh/b;->y()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-ge v0, v3, :cond_4

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lgh/b;->x(I)Lgh/b$b;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Lgh/b$b;->j()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    iput-byte v2, p0, Lgh/b;->p:B

    .line 38
    .line 39
    return v2

    .line 40
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iput-byte v1, p0, Lgh/b;->p:B

    .line 44
    .line 45
    return v1
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

.method public x(I)Lgh/b$b;
    .locals 1

    iget-object v0, p0, Lgh/b;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/b$b;

    return-object p1
.end method

.method public y()I
    .locals 1

    iget-object v0, p0, Lgh/b;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public z()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/b$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/b;->o:Ljava/util/List;

    return-object v0
.end method
