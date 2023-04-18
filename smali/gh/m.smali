.class public final Lgh/m;
.super Lnh/i$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/m$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/i$d<",
        "Lgh/m;",
        ">;"
    }
.end annotation


# static fields
.field private static final u:Lgh/m;

.field public static v:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/m;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final m:Lnh/d;

.field private n:I

.field private o:Lgh/p;

.field private p:Lgh/o;

.field private q:Lgh/l;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/c;",
            ">;"
        }
    .end annotation
.end field

.field private s:B

.field private t:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/m$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/m$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/m;->v:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/m;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/m;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/m;->u:Lgh/m;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/m;->T()V

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
    .locals 9

    .line 11
    invoke-direct {p0}, Lnh/i$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lgh/m;->s:B

    .line 13
    iput v0, p0, Lgh/m;->t:I

    .line 14
    invoke-direct {p0}, Lgh/m;->T()V

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
    const/16 v5, 0x8

    if-nez v3, :cond_e

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v6

    if-eqz v6, :cond_c

    const/16 v7, 0xa

    const/4 v8, 0x0

    if-eq v6, v7, :cond_9

    const/16 v7, 0x12

    if-eq v6, v7, :cond_6

    const/16 v7, 0x1a

    if-eq v6, v7, :cond_3

    const/16 v7, 0x22

    if-eq v6, v7, :cond_1

    .line 18
    invoke-virtual {p0, p1, v2, p2, v6}, Lnh/i$d;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_1

    :cond_1
    and-int/lit8 v6, v4, 0x8

    if-eq v6, v5, :cond_2

    .line 19
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lgh/m;->r:Ljava/util/List;

    or-int/lit8 v4, v4, 0x8

    .line 20
    :cond_2
    iget-object v6, p0, Lgh/m;->r:Ljava/util/List;

    sget-object v7, Lgh/c;->V:Lnh/s;

    invoke-virtual {p1, v7, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_3
    iget v6, p0, Lgh/m;->n:I

    const/4 v7, 0x4

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_4

    .line 22
    iget-object v6, p0, Lgh/m;->q:Lgh/l;

    invoke-virtual {v6}, Lgh/l;->f0()Lgh/l$b;

    move-result-object v8

    .line 23
    :cond_4
    sget-object v6, Lgh/l;->w:Lnh/s;

    invoke-virtual {p1, v6, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v6

    check-cast v6, Lgh/l;

    iput-object v6, p0, Lgh/m;->q:Lgh/l;

    if-eqz v8, :cond_5

    .line 24
    invoke-virtual {v8, v6}, Lgh/l$b;->E(Lgh/l;)Lgh/l$b;

    .line 25
    invoke-virtual {v8}, Lgh/l$b;->x()Lgh/l;

    move-result-object v6

    iput-object v6, p0, Lgh/m;->q:Lgh/l;

    .line 26
    :cond_5
    iget v6, p0, Lgh/m;->n:I

    or-int/2addr v6, v7

    iput v6, p0, Lgh/m;->n:I

    goto :goto_0

    .line 27
    :cond_6
    iget v6, p0, Lgh/m;->n:I

    const/4 v7, 0x2

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_7

    .line 28
    iget-object v6, p0, Lgh/m;->p:Lgh/o;

    invoke-virtual {v6}, Lgh/o;->C()Lgh/o$b;

    move-result-object v8

    .line 29
    :cond_7
    sget-object v6, Lgh/o;->q:Lnh/s;

    invoke-virtual {p1, v6, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v6

    check-cast v6, Lgh/o;

    iput-object v6, p0, Lgh/m;->p:Lgh/o;

    if-eqz v8, :cond_8

    .line 30
    invoke-virtual {v8, v6}, Lgh/o$b;->y(Lgh/o;)Lgh/o$b;

    .line 31
    invoke-virtual {v8}, Lgh/o$b;->t()Lgh/o;

    move-result-object v6

    iput-object v6, p0, Lgh/m;->p:Lgh/o;

    .line 32
    :cond_8
    iget v6, p0, Lgh/m;->n:I

    or-int/2addr v6, v7

    iput v6, p0, Lgh/m;->n:I

    goto/16 :goto_0

    .line 33
    :cond_9
    iget v6, p0, Lgh/m;->n:I

    and-int/2addr v6, v1

    if-ne v6, v1, :cond_a

    .line 34
    iget-object v6, p0, Lgh/m;->o:Lgh/p;

    invoke-virtual {v6}, Lgh/p;->C()Lgh/p$b;

    move-result-object v8

    .line 35
    :cond_a
    sget-object v6, Lgh/p;->q:Lnh/s;

    invoke-virtual {p1, v6, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v6

    check-cast v6, Lgh/p;

    iput-object v6, p0, Lgh/m;->o:Lgh/p;

    if-eqz v8, :cond_b

    .line 36
    invoke-virtual {v8, v6}, Lgh/p$b;->y(Lgh/p;)Lgh/p$b;

    .line 37
    invoke-virtual {v8}, Lgh/p$b;->t()Lgh/p;

    move-result-object v6

    iput-object v6, p0, Lgh/m;->o:Lgh/p;

    .line 38
    :cond_b
    iget v6, p0, Lgh/m;->n:I

    or-int/2addr v6, v1

    iput v6, p0, Lgh/m;->n:I
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_c
    :goto_1
    move v3, v1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 39
    :try_start_1
    new-instance p2, Lnh/k;

    .line 40
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 41
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    and-int/lit8 p2, v4, 0x8

    if-ne p2, v5, :cond_d

    .line 42
    iget-object p2, p0, Lgh/m;->r:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/m;->r:Ljava/util/List;

    .line 43
    :cond_d
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 44
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/m;->m:Lnh/d;

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/m;->m:Lnh/d;

    .line 45
    throw p1

    .line 46
    :goto_3
    invoke-virtual {p0}, Lnh/i$d;->n()V

    .line 47
    throw p1

    :cond_e
    and-int/lit8 p1, v4, 0x8

    if-ne p1, v5, :cond_f

    .line 48
    iget-object p1, p0, Lgh/m;->r:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/m;->r:Ljava/util/List;

    .line 49
    :cond_f
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 50
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/m;->m:Lnh/d;

    goto :goto_4

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/m;->m:Lnh/d;

    .line 51
    throw p1

    .line 52
    :goto_4
    invoke-virtual {p0}, Lnh/i$d;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/m;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/i$c<",
            "Lgh/m;",
            "*>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Lnh/i$d;-><init>(Lnh/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lgh/m;->s:B

    .line 5
    iput v0, p0, Lgh/m;->t:I

    .line 6
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/m;->m:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$c;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/m;-><init>(Lnh/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lnh/i$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lgh/m;->s:B

    .line 9
    iput p1, p0, Lgh/m;->t:I

    .line 10
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/m;->m:Lnh/d;

    return-void
.end method

.method static synthetic B(Lgh/m;Lgh/p;)Lgh/p;
    .locals 0

    iput-object p1, p0, Lgh/m;->o:Lgh/p;

    return-object p1
.end method

.method static synthetic C(Lgh/m;Lgh/o;)Lgh/o;
    .locals 0

    iput-object p1, p0, Lgh/m;->p:Lgh/o;

    return-object p1
.end method

.method static synthetic D(Lgh/m;Lgh/l;)Lgh/l;
    .locals 0

    iput-object p1, p0, Lgh/m;->q:Lgh/l;

    return-object p1
.end method

.method static synthetic E(Lgh/m;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/m;->r:Ljava/util/List;

    return-object p0
.end method

.method static synthetic F(Lgh/m;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/m;->r:Ljava/util/List;

    return-object p1
.end method

.method static synthetic G(Lgh/m;I)I
    .locals 0

    iput p1, p0, Lgh/m;->n:I

    return p1
.end method

.method static synthetic H(Lgh/m;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/m;->m:Lnh/d;

    return-object p0
.end method

.method public static L()Lgh/m;
    .locals 1

    sget-object v0, Lgh/m;->u:Lgh/m;

    return-object v0
.end method

.method private T()V
    .locals 1

    .line 1
    invoke-static {}, Lgh/p;->v()Lgh/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lgh/m;->o:Lgh/p;

    .line 6
    .line 7
    invoke-static {}, Lgh/o;->v()Lgh/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lgh/m;->p:Lgh/o;

    .line 12
    .line 13
    invoke-static {}, Lgh/l;->L()Lgh/l;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lgh/m;->q:Lgh/l;

    .line 18
    .line 19
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lgh/m;->r:Ljava/util/List;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public static U()Lgh/m$b;
    .locals 1

    invoke-static {}, Lgh/m$b;->v()Lgh/m$b;

    move-result-object v0

    return-object v0
.end method

.method public static V(Lgh/m;)Lgh/m$b;
    .locals 1

    invoke-static {}, Lgh/m;->U()Lgh/m$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/m$b;->C(Lgh/m;)Lgh/m$b;

    move-result-object p0

    return-object p0
.end method

.method public static X(Ljava/io/InputStream;Lnh/g;)Lgh/m;
    .locals 1

    sget-object v0, Lgh/m;->v:Lnh/s;

    invoke-interface {v0, p0, p1}, Lnh/s;->a(Ljava/io/InputStream;Lnh/g;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgh/m;

    return-object p0
.end method


# virtual methods
.method public I(I)Lgh/c;
    .locals 1

    iget-object v0, p0, Lgh/m;->r:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/c;

    return-object p1
.end method

.method public J()I
    .locals 1

    iget-object v0, p0, Lgh/m;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public K()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/m;->r:Ljava/util/List;

    return-object v0
.end method

.method public M()Lgh/m;
    .locals 1

    sget-object v0, Lgh/m;->u:Lgh/m;

    return-object v0
.end method

.method public N()Lgh/l;
    .locals 1

    iget-object v0, p0, Lgh/m;->q:Lgh/l;

    return-object v0
.end method

.method public O()Lgh/o;
    .locals 1

    iget-object v0, p0, Lgh/m;->p:Lgh/o;

    return-object v0
.end method

.method public P()Lgh/p;
    .locals 1

    iget-object v0, p0, Lgh/m;->o:Lgh/p;

    return-object v0
.end method

.method public Q()Z
    .locals 2

    iget v0, p0, Lgh/m;->n:I

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

.method public R()Z
    .locals 2

    iget v0, p0, Lgh/m;->n:I

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

.method public S()Z
    .locals 2

    iget v0, p0, Lgh/m;->n:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public W()Lgh/m$b;
    .locals 1

    invoke-static {}, Lgh/m;->U()Lgh/m$b;

    move-result-object v0

    return-object v0
.end method

.method public Y()Lgh/m$b;
    .locals 1

    invoke-static {p0}, Lgh/m;->V(Lgh/m;)Lgh/m$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lnh/q;
    .locals 1

    invoke-virtual {p0}, Lgh/m;->M()Lgh/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/m;->Y()Lgh/m$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 5

    .line 1
    iget v0, p0, Lgh/m;->t:I

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
    iget v0, p0, Lgh/m;->n:I

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
    iget-object v0, p0, Lgh/m;->o:Lgh/p;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lnh/f;->s(ILnh/q;)I

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
    iget v1, p0, Lgh/m;->n:I

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    and-int/2addr v1, v3

    .line 27
    if-ne v1, v3, :cond_2

    .line 28
    .line 29
    iget-object v1, p0, Lgh/m;->p:Lgh/o;

    .line 30
    .line 31
    invoke-static {v3, v1}, Lnh/f;->s(ILnh/q;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v0, v1

    .line 36
    :cond_2
    iget v1, p0, Lgh/m;->n:I

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    and-int/2addr v1, v3

    .line 40
    if-ne v1, v3, :cond_3

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    iget-object v4, p0, Lgh/m;->q:Lgh/l;

    .line 44
    .line 45
    invoke-static {v1, v4}, Lnh/f;->s(ILnh/q;)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    add-int/2addr v0, v1

    .line 50
    :cond_3
    :goto_1
    iget-object v1, p0, Lgh/m;->r:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-ge v2, v1, :cond_4

    .line 57
    .line 58
    iget-object v1, p0, Lgh/m;->r:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lnh/q;

    .line 65
    .line 66
    invoke-static {v3, v1}, Lnh/f;->s(ILnh/q;)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/2addr v0, v1

    .line 71
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    invoke-virtual {p0}, Lnh/i$d;->u()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    add-int/2addr v0, v1

    .line 79
    iget-object v1, p0, Lgh/m;->m:Lnh/d;

    .line 80
    .line 81
    invoke-virtual {v1}, Lnh/d;->size()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    add-int/2addr v0, v1

    .line 86
    iput v0, p0, Lgh/m;->t:I

    .line 87
    .line 88
    return v0
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
    .locals 4

    .line 1
    invoke-virtual {p0}, Lgh/m;->d()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lnh/i$d;->z()Lnh/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lgh/m;->n:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lgh/m;->o:Lgh/p;

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, Lnh/f;->d0(ILnh/q;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget v1, p0, Lgh/m;->n:I

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    and-int/2addr v1, v2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, Lgh/m;->p:Lgh/o;

    .line 26
    .line 27
    invoke-virtual {p1, v2, v1}, Lnh/f;->d0(ILnh/q;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget v1, p0, Lgh/m;->n:I

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    and-int/2addr v1, v2

    .line 34
    if-ne v1, v2, :cond_2

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    iget-object v3, p0, Lgh/m;->q:Lgh/l;

    .line 38
    .line 39
    invoke-virtual {p1, v1, v3}, Lnh/f;->d0(ILnh/q;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    const/4 v1, 0x0

    .line 43
    :goto_0
    iget-object v3, p0, Lgh/m;->r:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-ge v1, v3, :cond_3

    .line 50
    .line 51
    iget-object v3, p0, Lgh/m;->r:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Lnh/q;

    .line 58
    .line 59
    invoke-virtual {p1, v2, v3}, Lnh/f;->d0(ILnh/q;)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/16 v1, 0xc8

    .line 66
    .line 67
    invoke-virtual {v0, v1, p1}, Lnh/i$d$a;->a(ILnh/f;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lgh/m;->m:Lnh/d;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 73
    .line 74
    .line 75
    return-void
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

    invoke-virtual {p0}, Lgh/m;->W()Lgh/m$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/m;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/m;->v:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lgh/m;->s:B

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
    invoke-virtual {p0}, Lgh/m;->R()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lgh/m;->O()Lgh/o;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lgh/o;->j()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iput-byte v2, p0, Lgh/m;->s:B

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    invoke-virtual {p0}, Lgh/m;->Q()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Lgh/m;->N()Lgh/l;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lgh/l;->j()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    iput-byte v2, p0, Lgh/m;->s:B

    .line 47
    .line 48
    return v2

    .line 49
    :cond_3
    move v0, v2

    .line 50
    :goto_0
    invoke-virtual {p0}, Lgh/m;->J()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-ge v0, v3, :cond_5

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lgh/m;->I(I)Lgh/c;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Lgh/c;->j()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_4

    .line 65
    .line 66
    iput-byte v2, p0, Lgh/m;->s:B

    .line 67
    .line 68
    return v2

    .line 69
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    invoke-virtual {p0}, Lnh/i$d;->t()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_6

    .line 77
    .line 78
    iput-byte v2, p0, Lgh/m;->s:B

    .line 79
    .line 80
    return v2

    .line 81
    :cond_6
    iput-byte v1, p0, Lgh/m;->s:B

    .line 82
    .line 83
    return v1
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
