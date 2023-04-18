.class public final Lgh/d;
.super Lnh/i$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/i$d<",
        "Lgh/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final t:Lgh/d;

.field public static u:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final m:Lnh/d;

.field private n:I

.field private o:I

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/u;",
            ">;"
        }
    .end annotation
.end field

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private r:B

.field private s:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/d;->u:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/d;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/d;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/d;->t:Lgh/d;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/d;->Q()V

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
    .locals 10

    .line 11
    invoke-direct {p0}, Lnh/i$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lgh/d;->r:B

    .line 13
    iput v0, p0, Lgh/d;->s:I

    .line 14
    invoke-direct {p0}, Lgh/d;->Q()V

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

    const/4 v6, 0x4

    if-nez v3, :cond_c

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v7

    if-eqz v7, :cond_9

    const/16 v8, 0x8

    if-eq v7, v8, :cond_8

    const/16 v8, 0x12

    if-eq v7, v8, :cond_6

    const/16 v8, 0xf8

    if-eq v7, v8, :cond_4

    const/16 v8, 0xfa

    if-eq v7, v8, :cond_1

    .line 18
    invoke-virtual {p0, p1, v2, p2, v7}, Lnh/i$d;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_2

    .line 19
    :cond_1
    invoke-virtual {p1}, Lnh/e;->A()I

    move-result v7

    .line 20
    invoke-virtual {p1, v7}, Lnh/e;->j(I)I

    move-result v7

    and-int/lit8 v8, v4, 0x4

    if-eq v8, v6, :cond_2

    .line 21
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v8

    if-lez v8, :cond_2

    .line 22
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Lgh/d;->q:Ljava/util/List;

    or-int/lit8 v4, v4, 0x4

    .line 23
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v8

    if-lez v8, :cond_3

    .line 24
    iget-object v8, p0, Lgh/d;->q:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 25
    :cond_3
    invoke-virtual {p1, v7}, Lnh/e;->i(I)V

    goto :goto_0

    :cond_4
    and-int/lit8 v7, v4, 0x4

    if-eq v7, v6, :cond_5

    .line 26
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lgh/d;->q:Ljava/util/List;

    or-int/lit8 v4, v4, 0x4

    .line 27
    :cond_5
    iget-object v7, p0, Lgh/d;->q:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    and-int/lit8 v7, v4, 0x2

    if-eq v7, v5, :cond_7

    .line 28
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lgh/d;->p:Ljava/util/List;

    or-int/lit8 v4, v4, 0x2

    .line 29
    :cond_7
    iget-object v7, p0, Lgh/d;->p:Ljava/util/List;

    sget-object v8, Lgh/u;->x:Lnh/s;

    invoke-virtual {p1, v8, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 30
    :cond_8
    iget v7, p0, Lgh/d;->n:I

    or-int/2addr v7, v1

    iput v7, p0, Lgh/d;->n:I

    .line 31
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v7

    iput v7, p0, Lgh/d;->o:I
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_9
    :goto_2
    move v3, v1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 32
    :try_start_1
    new-instance p2, Lnh/k;

    .line 33
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 34
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    and-int/lit8 p2, v4, 0x2

    if-ne p2, v5, :cond_a

    .line 35
    iget-object p2, p0, Lgh/d;->p:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/d;->p:Ljava/util/List;

    :cond_a
    and-int/lit8 p2, v4, 0x4

    if-ne p2, v6, :cond_b

    .line 36
    iget-object p2, p0, Lgh/d;->q:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/d;->q:Ljava/util/List;

    .line 37
    :cond_b
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 38
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/d;->m:Lnh/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/d;->m:Lnh/d;

    .line 39
    throw p1

    .line 40
    :goto_4
    invoke-virtual {p0}, Lnh/i$d;->n()V

    .line 41
    throw p1

    :cond_c
    and-int/lit8 p1, v4, 0x2

    if-ne p1, v5, :cond_d

    .line 42
    iget-object p1, p0, Lgh/d;->p:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/d;->p:Ljava/util/List;

    :cond_d
    and-int/lit8 p1, v4, 0x4

    if-ne p1, v6, :cond_e

    .line 43
    iget-object p1, p0, Lgh/d;->q:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/d;->q:Ljava/util/List;

    .line 44
    :cond_e
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 45
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/d;->m:Lnh/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/d;->m:Lnh/d;

    .line 46
    throw p1

    .line 47
    :goto_5
    invoke-virtual {p0}, Lnh/i$d;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/d;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/i$c<",
            "Lgh/d;",
            "*>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Lnh/i$d;-><init>(Lnh/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lgh/d;->r:B

    .line 5
    iput v0, p0, Lgh/d;->s:I

    .line 6
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/d;->m:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$c;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/d;-><init>(Lnh/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lnh/i$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lgh/d;->r:B

    .line 9
    iput p1, p0, Lgh/d;->s:I

    .line 10
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/d;->m:Lnh/d;

    return-void
.end method

.method static synthetic B(Lgh/d;I)I
    .locals 0

    iput p1, p0, Lgh/d;->o:I

    return p1
.end method

.method static synthetic C(Lgh/d;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/d;->p:Ljava/util/List;

    return-object p0
.end method

.method static synthetic D(Lgh/d;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/d;->p:Ljava/util/List;

    return-object p1
.end method

.method static synthetic E(Lgh/d;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/d;->q:Ljava/util/List;

    return-object p0
.end method

.method static synthetic F(Lgh/d;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/d;->q:Ljava/util/List;

    return-object p1
.end method

.method static synthetic G(Lgh/d;I)I
    .locals 0

    iput p1, p0, Lgh/d;->n:I

    return p1
.end method

.method static synthetic H(Lgh/d;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/d;->m:Lnh/d;

    return-object p0
.end method

.method public static I()Lgh/d;
    .locals 1

    sget-object v0, Lgh/d;->t:Lgh/d;

    return-object v0
.end method

.method private Q()V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    iput v0, p0, Lgh/d;->o:I

    .line 3
    .line 4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lgh/d;->p:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lgh/d;->q:Ljava/util/List;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static R()Lgh/d$b;
    .locals 1

    invoke-static {}, Lgh/d$b;->v()Lgh/d$b;

    move-result-object v0

    return-object v0
.end method

.method public static S(Lgh/d;)Lgh/d$b;
    .locals 1

    invoke-static {}, Lgh/d;->R()Lgh/d$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/d$b;->D(Lgh/d;)Lgh/d$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public J()Lgh/d;
    .locals 1

    sget-object v0, Lgh/d;->t:Lgh/d;

    return-object v0
.end method

.method public K()I
    .locals 1

    iget v0, p0, Lgh/d;->o:I

    return v0
.end method

.method public L(I)Lgh/u;
    .locals 1

    iget-object v0, p0, Lgh/d;->p:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/u;

    return-object p1
.end method

.method public M()I
    .locals 1

    iget-object v0, p0, Lgh/d;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public N()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/d;->p:Ljava/util/List;

    return-object v0
.end method

.method public O()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/d;->q:Ljava/util/List;

    return-object v0
.end method

.method public P()Z
    .locals 2

    iget v0, p0, Lgh/d;->n:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public T()Lgh/d$b;
    .locals 1

    invoke-static {}, Lgh/d;->R()Lgh/d$b;

    move-result-object v0

    return-object v0
.end method

.method public U()Lgh/d$b;
    .locals 1

    invoke-static {p0}, Lgh/d;->S(Lgh/d;)Lgh/d$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lnh/q;
    .locals 1

    invoke-virtual {p0}, Lgh/d;->J()Lgh/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/d;->U()Lgh/d$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 5

    .line 1
    iget v0, p0, Lgh/d;->s:I

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
    iget v0, p0, Lgh/d;->n:I

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
    iget v0, p0, Lgh/d;->o:I

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
    move v1, v2

    .line 24
    :goto_1
    iget-object v3, p0, Lgh/d;->p:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v4, 0x2

    .line 31
    if-ge v1, v3, :cond_2

    .line 32
    .line 33
    iget-object v3, p0, Lgh/d;->p:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lnh/q;

    .line 40
    .line 41
    invoke-static {v4, v3}, Lnh/f;->s(ILnh/q;)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/2addr v0, v3

    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v1, v2

    .line 50
    :goto_2
    iget-object v3, p0, Lgh/d;->q:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-ge v2, v3, :cond_3

    .line 57
    .line 58
    iget-object v3, p0, Lgh/d;->q:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-static {v3}, Lnh/f;->p(I)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    add-int/2addr v1, v3

    .line 75
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    add-int/2addr v0, v1

    .line 79
    invoke-virtual {p0}, Lgh/d;->O()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    mul-int/2addr v1, v4

    .line 88
    add-int/2addr v0, v1

    .line 89
    invoke-virtual {p0}, Lnh/i$d;->u()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    add-int/2addr v0, v1

    .line 94
    iget-object v1, p0, Lgh/d;->m:Lnh/d;

    .line 95
    .line 96
    invoke-virtual {v1}, Lnh/d;->size()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    add-int/2addr v0, v1

    .line 101
    iput v0, p0, Lgh/d;->s:I

    .line 102
    .line 103
    return v0
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
.end method

.method public e(Lnh/f;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lgh/d;->d()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lnh/i$d;->z()Lnh/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lgh/d;->n:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget v1, p0, Lgh/d;->o:I

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, Lnh/f;->a0(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    move v2, v1

    .line 21
    :goto_0
    iget-object v3, p0, Lgh/d;->p:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-ge v2, v3, :cond_1

    .line 28
    .line 29
    iget-object v3, p0, Lgh/d;->p:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lnh/q;

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    invoke-virtual {p1, v4, v3}, Lnh/f;->d0(ILnh/q;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :goto_1
    iget-object v2, p0, Lgh/d;->q:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-ge v1, v2, :cond_2

    .line 51
    .line 52
    iget-object v2, p0, Lgh/d;->q:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const/16 v3, 0x1f

    .line 65
    .line 66
    invoke-virtual {p1, v3, v2}, Lnh/f;->a0(II)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const/16 v1, 0x4a38

    .line 73
    .line 74
    invoke-virtual {v0, v1, p1}, Lnh/i$d$a;->a(ILnh/f;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lgh/d;->m:Lnh/d;

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 80
    .line 81
    .line 82
    return-void
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

    invoke-virtual {p0}, Lgh/d;->T()Lgh/d$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/d;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/d;->u:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lgh/d;->r:B

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
    move v0, v2

    .line 12
    :goto_0
    invoke-virtual {p0}, Lgh/d;->M()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v0, v3, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lgh/d;->L(I)Lgh/u;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lgh/u;->j()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    iput-byte v2, p0, Lgh/d;->r:B

    .line 29
    .line 30
    return v2

    .line 31
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    invoke-virtual {p0}, Lnh/i$d;->t()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_4

    .line 39
    .line 40
    iput-byte v2, p0, Lgh/d;->r:B

    .line 41
    .line 42
    return v2

    .line 43
    :cond_4
    iput-byte v1, p0, Lgh/d;->r:B

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
