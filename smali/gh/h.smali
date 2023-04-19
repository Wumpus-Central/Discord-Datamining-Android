.class public final Lgh/h;
.super Lnh/i;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/h$b;,
        Lgh/h$c;
    }
.end annotation


# static fields
.field private static final w:Lgh/h;

.field public static x:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final l:Lnh/d;

.field private m:I

.field private n:I

.field private o:I

.field private p:Lgh/h$c;

.field private q:Lgh/q;

.field private r:I

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/h;",
            ">;"
        }
    .end annotation
.end field

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/h;",
            ">;"
        }
    .end annotation
.end field

.field private u:B

.field private v:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/h$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/h$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/h;->x:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/h;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/h;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/h;->w:Lgh/h;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/h;->S()V

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

    .line 11
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lgh/h;->u:B

    .line 13
    iput v0, p0, Lgh/h;->v:I

    .line 14
    invoke-direct {p0}, Lgh/h;->S()V

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
    const/16 v5, 0x40

    const/16 v6, 0x20

    if-nez v3, :cond_10

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v7

    if-eqz v7, :cond_d

    const/16 v8, 0x8

    if-eq v7, v8, :cond_c

    const/16 v9, 0x10

    if-eq v7, v9, :cond_b

    const/16 v10, 0x18

    if-eq v7, v10, :cond_9

    const/16 v10, 0x22

    if-eq v7, v10, :cond_6

    const/16 v8, 0x28

    if-eq v7, v8, :cond_5

    const/16 v8, 0x32

    if-eq v7, v8, :cond_3

    const/16 v8, 0x3a

    if-eq v7, v8, :cond_1

    .line 18
    invoke-virtual {p0, p1, v2, p2, v7}, Lnh/i;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_2

    :cond_1
    and-int/lit8 v7, v4, 0x40

    if-eq v7, v5, :cond_2

    .line 19
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lgh/h;->t:Ljava/util/List;

    or-int/lit8 v4, v4, 0x40

    .line 20
    :cond_2
    iget-object v7, p0, Lgh/h;->t:Ljava/util/List;

    sget-object v8, Lgh/h;->x:Lnh/s;

    invoke-virtual {p1, v8, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    and-int/lit8 v7, v4, 0x20

    if-eq v7, v6, :cond_4

    .line 21
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lgh/h;->s:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    .line 22
    :cond_4
    iget-object v7, p0, Lgh/h;->s:Ljava/util/List;

    sget-object v8, Lgh/h;->x:Lnh/s;

    invoke-virtual {p1, v8, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 23
    :cond_5
    iget v7, p0, Lgh/h;->m:I

    or-int/2addr v7, v9

    iput v7, p0, Lgh/h;->m:I

    .line 24
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v7

    iput v7, p0, Lgh/h;->r:I

    goto :goto_0

    .line 25
    :cond_6
    iget v7, p0, Lgh/h;->m:I

    and-int/2addr v7, v8

    if-ne v7, v8, :cond_7

    .line 26
    iget-object v7, p0, Lgh/h;->q:Lgh/q;

    invoke-virtual {v7}, Lgh/q;->B0()Lgh/q$c;

    move-result-object v7

    goto :goto_1

    :cond_7
    const/4 v7, 0x0

    .line 27
    :goto_1
    sget-object v9, Lgh/q;->F:Lnh/s;

    invoke-virtual {p1, v9, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v9

    check-cast v9, Lgh/q;

    iput-object v9, p0, Lgh/h;->q:Lgh/q;

    if-eqz v7, :cond_8

    .line 28
    invoke-virtual {v7, v9}, Lgh/q$c;->E(Lgh/q;)Lgh/q$c;

    .line 29
    invoke-virtual {v7}, Lgh/q$c;->x()Lgh/q;

    move-result-object v7

    iput-object v7, p0, Lgh/h;->q:Lgh/q;

    .line 30
    :cond_8
    iget v7, p0, Lgh/h;->m:I

    or-int/2addr v7, v8

    iput v7, p0, Lgh/h;->m:I

    goto/16 :goto_0

    .line 31
    :cond_9
    invoke-virtual {p1}, Lnh/e;->n()I

    move-result v8

    .line 32
    invoke-static {v8}, Lgh/h$c;->a(I)Lgh/h$c;

    move-result-object v9

    if-nez v9, :cond_a

    .line 33
    invoke-virtual {v2, v7}, Lnh/f;->o0(I)V

    .line 34
    invoke-virtual {v2, v8}, Lnh/f;->o0(I)V

    goto/16 :goto_0

    .line 35
    :cond_a
    iget v7, p0, Lgh/h;->m:I

    or-int/lit8 v7, v7, 0x4

    iput v7, p0, Lgh/h;->m:I

    .line 36
    iput-object v9, p0, Lgh/h;->p:Lgh/h$c;

    goto/16 :goto_0

    .line 37
    :cond_b
    iget v7, p0, Lgh/h;->m:I

    or-int/lit8 v7, v7, 0x2

    iput v7, p0, Lgh/h;->m:I

    .line 38
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v7

    iput v7, p0, Lgh/h;->o:I

    goto/16 :goto_0

    .line 39
    :cond_c
    iget v7, p0, Lgh/h;->m:I

    or-int/2addr v7, v1

    iput v7, p0, Lgh/h;->m:I

    .line 40
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v7

    iput v7, p0, Lgh/h;->n:I
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

    .line 41
    :try_start_1
    new-instance p2, Lnh/k;

    .line 42
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 43
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    and-int/lit8 p2, v4, 0x20

    if-ne p2, v6, :cond_e

    .line 44
    iget-object p2, p0, Lgh/h;->s:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/h;->s:Ljava/util/List;

    :cond_e
    and-int/lit8 p2, v4, 0x40

    if-ne p2, v5, :cond_f

    .line 45
    iget-object p2, p0, Lgh/h;->t:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/h;->t:Ljava/util/List;

    .line 46
    :cond_f
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 47
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/h;->l:Lnh/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/h;->l:Lnh/d;

    .line 48
    throw p1

    .line 49
    :goto_4
    invoke-virtual {p0}, Lnh/i;->n()V

    .line 50
    throw p1

    :cond_10
    and-int/lit8 p1, v4, 0x20

    if-ne p1, v6, :cond_11

    .line 51
    iget-object p1, p0, Lgh/h;->s:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/h;->s:Ljava/util/List;

    :cond_11
    and-int/lit8 p1, v4, 0x40

    if-ne p1, v5, :cond_12

    .line 52
    iget-object p1, p0, Lgh/h;->t:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/h;->t:Ljava/util/List;

    .line 53
    :cond_12
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 54
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/h;->l:Lnh/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/h;->l:Lnh/d;

    .line 55
    throw p1

    .line 56
    :goto_5
    invoke-virtual {p0}, Lnh/i;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/h;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lnh/i;-><init>(Lnh/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lgh/h;->u:B

    .line 5
    iput v0, p0, Lgh/h;->v:I

    .line 6
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/h;->l:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$b;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/h;-><init>(Lnh/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lgh/h;->u:B

    .line 9
    iput p1, p0, Lgh/h;->v:I

    .line 10
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/h;->l:Lnh/d;

    return-void
.end method

.method static synthetic A(Lgh/h;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/h;->t:Ljava/util/List;

    return-object p1
.end method

.method static synthetic B(Lgh/h;I)I
    .locals 0

    iput p1, p0, Lgh/h;->m:I

    return p1
.end method

.method static synthetic C(Lgh/h;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/h;->l:Lnh/d;

    return-object p0
.end method

.method public static G()Lgh/h;
    .locals 1

    sget-object v0, Lgh/h;->w:Lgh/h;

    return-object v0
.end method

.method private S()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lgh/h;->n:I

    .line 3
    .line 4
    iput v0, p0, Lgh/h;->o:I

    .line 5
    .line 6
    sget-object v1, Lgh/h$c;->l:Lgh/h$c;

    .line 7
    .line 8
    iput-object v1, p0, Lgh/h;->p:Lgh/h$c;

    .line 9
    .line 10
    invoke-static {}, Lgh/q;->Y()Lgh/q;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Lgh/h;->q:Lgh/q;

    .line 15
    .line 16
    iput v0, p0, Lgh/h;->r:I

    .line 17
    .line 18
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lgh/h;->s:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lgh/h;->t:Ljava/util/List;

    .line 29
    .line 30
    return-void
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

.method public static T()Lgh/h$b;
    .locals 1

    invoke-static {}, Lgh/h$b;->r()Lgh/h$b;

    move-result-object v0

    return-object v0
.end method

.method public static U(Lgh/h;)Lgh/h$b;
    .locals 1

    invoke-static {}, Lgh/h;->T()Lgh/h$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/h$b;->z(Lgh/h;)Lgh/h$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(Lgh/h;I)I
    .locals 0

    iput p1, p0, Lgh/h;->n:I

    return p1
.end method

.method static synthetic t(Lgh/h;I)I
    .locals 0

    iput p1, p0, Lgh/h;->o:I

    return p1
.end method

.method static synthetic u(Lgh/h;Lgh/h$c;)Lgh/h$c;
    .locals 0

    iput-object p1, p0, Lgh/h;->p:Lgh/h$c;

    return-object p1
.end method

.method static synthetic v(Lgh/h;Lgh/q;)Lgh/q;
    .locals 0

    iput-object p1, p0, Lgh/h;->q:Lgh/q;

    return-object p1
.end method

.method static synthetic w(Lgh/h;I)I
    .locals 0

    iput p1, p0, Lgh/h;->r:I

    return p1
.end method

.method static synthetic x(Lgh/h;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/h;->s:Ljava/util/List;

    return-object p0
.end method

.method static synthetic y(Lgh/h;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/h;->s:Ljava/util/List;

    return-object p1
.end method

.method static synthetic z(Lgh/h;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/h;->t:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public D(I)Lgh/h;
    .locals 1

    iget-object v0, p0, Lgh/h;->s:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/h;

    return-object p1
.end method

.method public E()I
    .locals 1

    iget-object v0, p0, Lgh/h;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public F()Lgh/h$c;
    .locals 1

    iget-object v0, p0, Lgh/h;->p:Lgh/h$c;

    return-object v0
.end method

.method public H()I
    .locals 1

    iget v0, p0, Lgh/h;->n:I

    return v0
.end method

.method public I()Lgh/q;
    .locals 1

    iget-object v0, p0, Lgh/h;->q:Lgh/q;

    return-object v0
.end method

.method public J()I
    .locals 1

    iget v0, p0, Lgh/h;->r:I

    return v0
.end method

.method public K(I)Lgh/h;
    .locals 1

    iget-object v0, p0, Lgh/h;->t:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/h;

    return-object p1
.end method

.method public L()I
    .locals 1

    iget-object v0, p0, Lgh/h;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public M()I
    .locals 1

    iget v0, p0, Lgh/h;->o:I

    return v0
.end method

.method public N()Z
    .locals 2

    iget v0, p0, Lgh/h;->m:I

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

.method public O()Z
    .locals 2

    iget v0, p0, Lgh/h;->m:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public P()Z
    .locals 2

    iget v0, p0, Lgh/h;->m:I

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

.method public Q()Z
    .locals 2

    iget v0, p0, Lgh/h;->m:I

    const/16 v1, 0x10

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

    iget v0, p0, Lgh/h;->m:I

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

.method public V()Lgh/h$b;
    .locals 1

    invoke-static {}, Lgh/h;->T()Lgh/h$b;

    move-result-object v0

    return-object v0
.end method

.method public W()Lgh/h$b;
    .locals 1

    invoke-static {p0}, Lgh/h;->U(Lgh/h;)Lgh/h$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/h;->W()Lgh/h$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 5

    .line 1
    iget v0, p0, Lgh/h;->v:I

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
    iget v0, p0, Lgh/h;->m:I

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
    iget v0, p0, Lgh/h;->n:I

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
    iget v1, p0, Lgh/h;->m:I

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    and-int/2addr v1, v3

    .line 27
    if-ne v1, v3, :cond_2

    .line 28
    .line 29
    iget v1, p0, Lgh/h;->o:I

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
    iget v1, p0, Lgh/h;->m:I

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    and-int/2addr v1, v3

    .line 40
    if-ne v1, v3, :cond_3

    .line 41
    .line 42
    iget-object v1, p0, Lgh/h;->p:Lgh/h$c;

    .line 43
    .line 44
    invoke-virtual {v1}, Lgh/h$c;->getNumber()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/4 v4, 0x3

    .line 49
    invoke-static {v4, v1}, Lnh/f;->h(II)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v0, v1

    .line 54
    :cond_3
    iget v1, p0, Lgh/h;->m:I

    .line 55
    .line 56
    const/16 v4, 0x8

    .line 57
    .line 58
    and-int/2addr v1, v4

    .line 59
    if-ne v1, v4, :cond_4

    .line 60
    .line 61
    iget-object v1, p0, Lgh/h;->q:Lgh/q;

    .line 62
    .line 63
    invoke-static {v3, v1}, Lnh/f;->s(ILnh/q;)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/2addr v0, v1

    .line 68
    :cond_4
    iget v1, p0, Lgh/h;->m:I

    .line 69
    .line 70
    const/16 v3, 0x10

    .line 71
    .line 72
    and-int/2addr v1, v3

    .line 73
    if-ne v1, v3, :cond_5

    .line 74
    .line 75
    const/4 v1, 0x5

    .line 76
    iget v3, p0, Lgh/h;->r:I

    .line 77
    .line 78
    invoke-static {v1, v3}, Lnh/f;->o(II)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    add-int/2addr v0, v1

    .line 83
    :cond_5
    move v1, v2

    .line 84
    :goto_1
    iget-object v3, p0, Lgh/h;->s:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-ge v1, v3, :cond_6

    .line 91
    .line 92
    iget-object v3, p0, Lgh/h;->s:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, Lnh/q;

    .line 99
    .line 100
    const/4 v4, 0x6

    .line 101
    invoke-static {v4, v3}, Lnh/f;->s(ILnh/q;)I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    add-int/2addr v0, v3

    .line 106
    add-int/lit8 v1, v1, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_6
    :goto_2
    iget-object v1, p0, Lgh/h;->t:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-ge v2, v1, :cond_7

    .line 116
    .line 117
    iget-object v1, p0, Lgh/h;->t:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Lnh/q;

    .line 124
    .line 125
    const/4 v3, 0x7

    .line 126
    invoke-static {v3, v1}, Lnh/f;->s(ILnh/q;)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    add-int/2addr v0, v1

    .line 131
    add-int/lit8 v2, v2, 0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_7
    iget-object v1, p0, Lgh/h;->l:Lnh/d;

    .line 135
    .line 136
    invoke-virtual {v1}, Lnh/d;->size()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    add-int/2addr v0, v1

    .line 141
    iput v0, p0, Lgh/h;->v:I

    .line 142
    .line 143
    return v0
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
    .locals 4

    .line 1
    invoke-virtual {p0}, Lgh/h;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lgh/h;->m:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lgh/h;->n:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lnh/f;->a0(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lgh/h;->m:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Lgh/h;->o:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lnh/f;->a0(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, Lgh/h;->m:I

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    and-int/2addr v0, v1

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lgh/h;->p:Lgh/h$c;

    .line 33
    .line 34
    invoke-virtual {v0}, Lgh/h$c;->getNumber()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v2, 0x3

    .line 39
    invoke-virtual {p1, v2, v0}, Lnh/f;->S(II)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget v0, p0, Lgh/h;->m:I

    .line 43
    .line 44
    const/16 v2, 0x8

    .line 45
    .line 46
    and-int/2addr v0, v2

    .line 47
    if-ne v0, v2, :cond_3

    .line 48
    .line 49
    iget-object v0, p0, Lgh/h;->q:Lgh/q;

    .line 50
    .line 51
    invoke-virtual {p1, v1, v0}, Lnh/f;->d0(ILnh/q;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    iget v0, p0, Lgh/h;->m:I

    .line 55
    .line 56
    const/16 v1, 0x10

    .line 57
    .line 58
    and-int/2addr v0, v1

    .line 59
    if-ne v0, v1, :cond_4

    .line 60
    .line 61
    const/4 v0, 0x5

    .line 62
    iget v1, p0, Lgh/h;->r:I

    .line 63
    .line 64
    invoke-virtual {p1, v0, v1}, Lnh/f;->a0(II)V

    .line 65
    .line 66
    .line 67
    :cond_4
    const/4 v0, 0x0

    .line 68
    move v1, v0

    .line 69
    :goto_0
    iget-object v2, p0, Lgh/h;->s:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-ge v1, v2, :cond_5

    .line 76
    .line 77
    iget-object v2, p0, Lgh/h;->s:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Lnh/q;

    .line 84
    .line 85
    const/4 v3, 0x6

    .line 86
    invoke-virtual {p1, v3, v2}, Lnh/f;->d0(ILnh/q;)V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_5
    :goto_1
    iget-object v1, p0, Lgh/h;->t:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-ge v0, v1, :cond_6

    .line 99
    .line 100
    iget-object v1, p0, Lgh/h;->t:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Lnh/q;

    .line 107
    .line 108
    const/4 v2, 0x7

    .line 109
    invoke-virtual {p1, v2, v1}, Lnh/f;->d0(ILnh/q;)V

    .line 110
    .line 111
    .line 112
    add-int/lit8 v0, v0, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    iget-object v0, p0, Lgh/h;->l:Lnh/d;

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 118
    .line 119
    .line 120
    return-void
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
.end method

.method public bridge synthetic g()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/h;->V()Lgh/h$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/h;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/h;->x:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lgh/h;->u:B

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
    invoke-virtual {p0}, Lgh/h;->P()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lgh/h;->I()Lgh/q;

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
    iput-byte v2, p0, Lgh/h;->u:B

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    move v0, v2

    .line 31
    :goto_0
    invoke-virtual {p0}, Lgh/h;->E()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-ge v0, v3, :cond_4

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lgh/h;->D(I)Lgh/h;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Lgh/h;->j()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    iput-byte v2, p0, Lgh/h;->u:B

    .line 48
    .line 49
    return v2

    .line 50
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    move v0, v2

    .line 54
    :goto_1
    invoke-virtual {p0}, Lgh/h;->L()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-ge v0, v3, :cond_6

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lgh/h;->K(I)Lgh/h;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Lgh/h;->j()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_5

    .line 69
    .line 70
    iput-byte v2, p0, Lgh/h;->u:B

    .line 71
    .line 72
    return v2

    .line 73
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_6
    iput-byte v1, p0, Lgh/h;->u:B

    .line 77
    .line 78
    return v1
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
