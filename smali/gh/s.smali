.class public final Lgh/s;
.super Lnh/i$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/s$b;,
        Lgh/s$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/i$d<",
        "Lgh/s;",
        ">;"
    }
.end annotation


# static fields
.field private static final x:Lgh/s;

.field public static y:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/s;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final m:Lnh/d;

.field private n:I

.field private o:I

.field private p:I

.field private q:Z

.field private r:Lgh/s$c;

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/q;",
            ">;"
        }
    .end annotation
.end field

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private u:I

.field private v:B

.field private w:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/s$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/s$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/s;->y:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/s;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/s;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/s;->x:Lgh/s;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/s;->Z()V

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
    .locals 11

    .line 13
    invoke-direct {p0}, Lnh/i$d;-><init>()V

    const/4 v0, -0x1

    .line 14
    iput v0, p0, Lgh/s;->u:I

    .line 15
    iput-byte v0, p0, Lgh/s;->v:B

    .line 16
    iput v0, p0, Lgh/s;->w:I

    .line 17
    invoke-direct {p0}, Lgh/s;->Z()V

    .line 18
    invoke-static {}, Lnh/d;->w()Lnh/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 19
    invoke-static {v0, v1}, Lnh/f;->J(Ljava/io/OutputStream;I)Lnh/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x10

    const/16 v6, 0x20

    if-nez v3, :cond_10

    .line 20
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v7

    if-eqz v7, :cond_d

    const/16 v8, 0x8

    if-eq v7, v8, :cond_c

    if-eq v7, v5, :cond_b

    const/16 v9, 0x18

    if-eq v7, v9, :cond_a

    if-eq v7, v6, :cond_8

    const/16 v8, 0x2a

    if-eq v7, v8, :cond_6

    const/16 v8, 0x30

    if-eq v7, v8, :cond_4

    const/16 v8, 0x32

    if-eq v7, v8, :cond_1

    .line 21
    invoke-virtual {p0, p1, v2, p2, v7}, Lnh/i$d;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_2

    .line 22
    :cond_1
    invoke-virtual {p1}, Lnh/e;->A()I

    move-result v7

    .line 23
    invoke-virtual {p1, v7}, Lnh/e;->j(I)I

    move-result v7

    and-int/lit8 v8, v4, 0x20

    if-eq v8, v6, :cond_2

    .line 24
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v8

    if-lez v8, :cond_2

    .line 25
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Lgh/s;->t:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    .line 26
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v8

    if-lez v8, :cond_3

    .line 27
    iget-object v8, p0, Lgh/s;->t:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 28
    :cond_3
    invoke-virtual {p1, v7}, Lnh/e;->i(I)V

    goto :goto_0

    :cond_4
    and-int/lit8 v7, v4, 0x20

    if-eq v7, v6, :cond_5

    .line 29
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lgh/s;->t:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    .line 30
    :cond_5
    iget-object v7, p0, Lgh/s;->t:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    and-int/lit8 v7, v4, 0x10

    if-eq v7, v5, :cond_7

    .line 31
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lgh/s;->s:Ljava/util/List;

    or-int/lit8 v4, v4, 0x10

    .line 32
    :cond_7
    iget-object v7, p0, Lgh/s;->s:Ljava/util/List;

    sget-object v8, Lgh/q;->F:Lnh/s;

    invoke-virtual {p1, v8, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 33
    :cond_8
    invoke-virtual {p1}, Lnh/e;->n()I

    move-result v9

    .line 34
    invoke-static {v9}, Lgh/s$c;->a(I)Lgh/s$c;

    move-result-object v10

    if-nez v10, :cond_9

    .line 35
    invoke-virtual {v2, v7}, Lnh/f;->o0(I)V

    .line 36
    invoke-virtual {v2, v9}, Lnh/f;->o0(I)V

    goto/16 :goto_0

    .line 37
    :cond_9
    iget v7, p0, Lgh/s;->n:I

    or-int/2addr v7, v8

    iput v7, p0, Lgh/s;->n:I

    .line 38
    iput-object v10, p0, Lgh/s;->r:Lgh/s$c;

    goto/16 :goto_0

    .line 39
    :cond_a
    iget v7, p0, Lgh/s;->n:I

    or-int/lit8 v7, v7, 0x4

    iput v7, p0, Lgh/s;->n:I

    .line 40
    invoke-virtual {p1}, Lnh/e;->k()Z

    move-result v7

    iput-boolean v7, p0, Lgh/s;->q:Z

    goto/16 :goto_0

    .line 41
    :cond_b
    iget v7, p0, Lgh/s;->n:I

    or-int/lit8 v7, v7, 0x2

    iput v7, p0, Lgh/s;->n:I

    .line 42
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v7

    iput v7, p0, Lgh/s;->p:I

    goto/16 :goto_0

    .line 43
    :cond_c
    iget v7, p0, Lgh/s;->n:I

    or-int/2addr v7, v1

    iput v7, p0, Lgh/s;->n:I

    .line 44
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v7

    iput v7, p0, Lgh/s;->o:I
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_d
    :goto_2
    move v3, v1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 45
    :try_start_1
    new-instance p2, Lnh/k;

    .line 46
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 47
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    and-int/lit8 p2, v4, 0x10

    if-ne p2, v5, :cond_e

    .line 48
    iget-object p2, p0, Lgh/s;->s:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/s;->s:Ljava/util/List;

    :cond_e
    and-int/lit8 p2, v4, 0x20

    if-ne p2, v6, :cond_f

    .line 49
    iget-object p2, p0, Lgh/s;->t:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/s;->t:Ljava/util/List;

    .line 50
    :cond_f
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/s;->m:Lnh/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/s;->m:Lnh/d;

    .line 52
    throw p1

    .line 53
    :goto_4
    invoke-virtual {p0}, Lnh/i$d;->n()V

    .line 54
    throw p1

    :cond_10
    and-int/lit8 p1, v4, 0x10

    if-ne p1, v5, :cond_11

    .line 55
    iget-object p1, p0, Lgh/s;->s:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/s;->s:Ljava/util/List;

    :cond_11
    and-int/lit8 p1, v4, 0x20

    if-ne p1, v6, :cond_12

    .line 56
    iget-object p1, p0, Lgh/s;->t:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/s;->t:Ljava/util/List;

    .line 57
    :cond_12
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 58
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/s;->m:Lnh/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/s;->m:Lnh/d;

    .line 59
    throw p1

    .line 60
    :goto_5
    invoke-virtual {p0}, Lnh/i$d;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/s;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/i$c<",
            "Lgh/s;",
            "*>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Lnh/i$d;-><init>(Lnh/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lgh/s;->u:I

    .line 5
    iput-byte v0, p0, Lgh/s;->v:B

    .line 6
    iput v0, p0, Lgh/s;->w:I

    .line 7
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/s;->m:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$c;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/s;-><init>(Lnh/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 8
    invoke-direct {p0}, Lnh/i$d;-><init>()V

    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lgh/s;->u:I

    .line 10
    iput-byte p1, p0, Lgh/s;->v:B

    .line 11
    iput p1, p0, Lgh/s;->w:I

    .line 12
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/s;->m:Lnh/d;

    return-void
.end method

.method static synthetic B(Lgh/s;I)I
    .locals 0

    iput p1, p0, Lgh/s;->o:I

    return p1
.end method

.method static synthetic C(Lgh/s;I)I
    .locals 0

    iput p1, p0, Lgh/s;->p:I

    return p1
.end method

.method static synthetic D(Lgh/s;Z)Z
    .locals 0

    iput-boolean p1, p0, Lgh/s;->q:Z

    return p1
.end method

.method static synthetic E(Lgh/s;Lgh/s$c;)Lgh/s$c;
    .locals 0

    iput-object p1, p0, Lgh/s;->r:Lgh/s$c;

    return-object p1
.end method

.method static synthetic F(Lgh/s;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/s;->s:Ljava/util/List;

    return-object p0
.end method

.method static synthetic G(Lgh/s;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/s;->s:Ljava/util/List;

    return-object p1
.end method

.method static synthetic H(Lgh/s;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/s;->t:Ljava/util/List;

    return-object p0
.end method

.method static synthetic I(Lgh/s;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/s;->t:Ljava/util/List;

    return-object p1
.end method

.method static synthetic J(Lgh/s;I)I
    .locals 0

    iput p1, p0, Lgh/s;->n:I

    return p1
.end method

.method static synthetic K(Lgh/s;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/s;->m:Lnh/d;

    return-object p0
.end method

.method public static L()Lgh/s;
    .locals 1

    sget-object v0, Lgh/s;->x:Lgh/s;

    return-object v0
.end method

.method private Z()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lgh/s;->o:I

    .line 3
    .line 4
    iput v0, p0, Lgh/s;->p:I

    .line 5
    .line 6
    iput-boolean v0, p0, Lgh/s;->q:Z

    .line 7
    .line 8
    sget-object v0, Lgh/s$c;->n:Lgh/s$c;

    .line 9
    .line 10
    iput-object v0, p0, Lgh/s;->r:Lgh/s$c;

    .line 11
    .line 12
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lgh/s;->s:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lgh/s;->t:Ljava/util/List;

    .line 23
    .line 24
    return-void
.end method

.method public static a0()Lgh/s$b;
    .locals 1

    invoke-static {}, Lgh/s$b;->v()Lgh/s$b;

    move-result-object v0

    return-object v0
.end method

.method public static b0(Lgh/s;)Lgh/s$b;
    .locals 1

    invoke-static {}, Lgh/s;->a0()Lgh/s$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/s$b;->D(Lgh/s;)Lgh/s$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public M()Lgh/s;
    .locals 1

    sget-object v0, Lgh/s;->x:Lgh/s;

    return-object v0
.end method

.method public N()I
    .locals 1

    iget v0, p0, Lgh/s;->o:I

    return v0
.end method

.method public O()I
    .locals 1

    iget v0, p0, Lgh/s;->p:I

    return v0
.end method

.method public P()Z
    .locals 1

    iget-boolean v0, p0, Lgh/s;->q:Z

    return v0
.end method

.method public Q(I)Lgh/q;
    .locals 1

    iget-object v0, p0, Lgh/s;->s:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/q;

    return-object p1
.end method

.method public R()I
    .locals 1

    iget-object v0, p0, Lgh/s;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public S()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/s;->t:Ljava/util/List;

    return-object v0
.end method

.method public T()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/q;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/s;->s:Ljava/util/List;

    return-object v0
.end method

.method public U()Lgh/s$c;
    .locals 1

    iget-object v0, p0, Lgh/s;->r:Lgh/s$c;

    return-object v0
.end method

.method public V()Z
    .locals 2

    iget v0, p0, Lgh/s;->n:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public W()Z
    .locals 2

    iget v0, p0, Lgh/s;->n:I

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

.method public X()Z
    .locals 2

    iget v0, p0, Lgh/s;->n:I

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

.method public Y()Z
    .locals 2

    iget v0, p0, Lgh/s;->n:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic a()Lnh/q;
    .locals 1

    invoke-virtual {p0}, Lgh/s;->M()Lgh/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/s;->d0()Lgh/s$b;

    move-result-object v0

    return-object v0
.end method

.method public c0()Lgh/s$b;
    .locals 1

    invoke-static {}, Lgh/s;->a0()Lgh/s$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 5

    .line 1
    iget v0, p0, Lgh/s;->w:I

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
    iget v0, p0, Lgh/s;->n:I

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
    iget v0, p0, Lgh/s;->o:I

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
    iget v1, p0, Lgh/s;->n:I

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    and-int/2addr v1, v3

    .line 27
    if-ne v1, v3, :cond_2

    .line 28
    .line 29
    iget v1, p0, Lgh/s;->p:I

    .line 30
    .line 31
    invoke-static {v3, v1}, Lnh/f;->o(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v0, v1

    .line 36
    :cond_2
    iget v1, p0, Lgh/s;->n:I

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
    iget-boolean v4, p0, Lgh/s;->q:Z

    .line 44
    .line 45
    invoke-static {v1, v4}, Lnh/f;->a(IZ)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    add-int/2addr v0, v1

    .line 50
    :cond_3
    iget v1, p0, Lgh/s;->n:I

    .line 51
    .line 52
    const/16 v4, 0x8

    .line 53
    .line 54
    and-int/2addr v1, v4

    .line 55
    if-ne v1, v4, :cond_4

    .line 56
    .line 57
    iget-object v1, p0, Lgh/s;->r:Lgh/s$c;

    .line 58
    .line 59
    invoke-virtual {v1}, Lgh/s$c;->getNumber()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-static {v3, v1}, Lnh/f;->h(II)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/2addr v0, v1

    .line 68
    :cond_4
    move v1, v2

    .line 69
    :goto_1
    iget-object v3, p0, Lgh/s;->s:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-ge v1, v3, :cond_5

    .line 76
    .line 77
    iget-object v3, p0, Lgh/s;->s:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Lnh/q;

    .line 84
    .line 85
    const/4 v4, 0x5

    .line 86
    invoke-static {v4, v3}, Lnh/f;->s(ILnh/q;)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    add-int/2addr v0, v3

    .line 91
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_5
    move v1, v2

    .line 95
    :goto_2
    iget-object v3, p0, Lgh/s;->t:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-ge v2, v3, :cond_6

    .line 102
    .line 103
    iget-object v3, p0, Lgh/s;->t:Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    invoke-static {v3}, Lnh/f;->p(I)I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    add-int/2addr v1, v3

    .line 120
    add-int/lit8 v2, v2, 0x1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    add-int/2addr v0, v1

    .line 124
    invoke-virtual {p0}, Lgh/s;->S()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-nez v2, :cond_7

    .line 133
    .line 134
    add-int/lit8 v0, v0, 0x1

    .line 135
    .line 136
    invoke-static {v1}, Lnh/f;->p(I)I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    add-int/2addr v0, v2

    .line 141
    :cond_7
    iput v1, p0, Lgh/s;->u:I

    .line 142
    .line 143
    invoke-virtual {p0}, Lnh/i$d;->u()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    add-int/2addr v0, v1

    .line 148
    iget-object v1, p0, Lgh/s;->m:Lnh/d;

    .line 149
    .line 150
    invoke-virtual {v1}, Lnh/d;->size()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    add-int/2addr v0, v1

    .line 155
    iput v0, p0, Lgh/s;->w:I

    .line 156
    .line 157
    return v0
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

.method public d0()Lgh/s$b;
    .locals 1

    invoke-static {p0}, Lgh/s;->b0(Lgh/s;)Lgh/s$b;

    move-result-object v0

    return-object v0
.end method

.method public e(Lnh/f;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lgh/s;->d()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lnh/i$d;->z()Lnh/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lgh/s;->n:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget v1, p0, Lgh/s;->o:I

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, Lnh/f;->a0(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget v1, p0, Lgh/s;->n:I

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    and-int/2addr v1, v2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    iget v1, p0, Lgh/s;->p:I

    .line 26
    .line 27
    invoke-virtual {p1, v2, v1}, Lnh/f;->a0(II)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget v1, p0, Lgh/s;->n:I

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
    iget-boolean v3, p0, Lgh/s;->q:Z

    .line 38
    .line 39
    invoke-virtual {p1, v1, v3}, Lnh/f;->L(IZ)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget v1, p0, Lgh/s;->n:I

    .line 43
    .line 44
    const/16 v3, 0x8

    .line 45
    .line 46
    and-int/2addr v1, v3

    .line 47
    if-ne v1, v3, :cond_3

    .line 48
    .line 49
    iget-object v1, p0, Lgh/s;->r:Lgh/s$c;

    .line 50
    .line 51
    invoke-virtual {v1}, Lgh/s$c;->getNumber()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {p1, v2, v1}, Lnh/f;->S(II)V

    .line 56
    .line 57
    .line 58
    :cond_3
    const/4 v1, 0x0

    .line 59
    move v2, v1

    .line 60
    :goto_0
    iget-object v3, p0, Lgh/s;->s:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-ge v2, v3, :cond_4

    .line 67
    .line 68
    iget-object v3, p0, Lgh/s;->s:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Lnh/q;

    .line 75
    .line 76
    const/4 v4, 0x5

    .line 77
    invoke-virtual {p1, v4, v3}, Lnh/f;->d0(ILnh/q;)V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    invoke-virtual {p0}, Lgh/s;->S()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-lez v2, :cond_5

    .line 92
    .line 93
    const/16 v2, 0x32

    .line 94
    .line 95
    invoke-virtual {p1, v2}, Lnh/f;->o0(I)V

    .line 96
    .line 97
    .line 98
    iget v2, p0, Lgh/s;->u:I

    .line 99
    .line 100
    invoke-virtual {p1, v2}, Lnh/f;->o0(I)V

    .line 101
    .line 102
    .line 103
    :cond_5
    :goto_1
    iget-object v2, p0, Lgh/s;->t:Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-ge v1, v2, :cond_6

    .line 110
    .line 111
    iget-object v2, p0, Lgh/s;->t:Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-virtual {p1, v2}, Lnh/f;->b0(I)V

    .line 124
    .line 125
    .line 126
    add-int/lit8 v1, v1, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_6
    const/16 v1, 0x3e8

    .line 130
    .line 131
    invoke-virtual {v0, v1, p1}, Lnh/i$d$a;->a(ILnh/f;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lgh/s;->m:Lnh/d;

    .line 135
    .line 136
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 137
    .line 138
    .line 139
    return-void
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
.end method

.method public bridge synthetic g()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/s;->c0()Lgh/s$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/s;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/s;->y:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lgh/s;->v:B

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
    invoke-virtual {p0}, Lgh/s;->V()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lgh/s;->v:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    invoke-virtual {p0}, Lgh/s;->W()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    iput-byte v2, p0, Lgh/s;->v:B

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    move v0, v2

    .line 30
    :goto_0
    invoke-virtual {p0}, Lgh/s;->R()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-ge v0, v3, :cond_5

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lgh/s;->Q(I)Lgh/q;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Lgh/q;->j()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_4

    .line 45
    .line 46
    iput-byte v2, p0, Lgh/s;->v:B

    .line 47
    .line 48
    return v2

    .line 49
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    invoke-virtual {p0}, Lnh/i$d;->t()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_6

    .line 57
    .line 58
    iput-byte v2, p0, Lgh/s;->v:B

    .line 59
    .line 60
    return v2

    .line 61
    :cond_6
    iput-byte v1, p0, Lgh/s;->v:B

    .line 62
    .line 63
    return v1
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
