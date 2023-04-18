.class public final Lgh/q;
.super Lnh/i$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/q$c;,
        Lgh/q$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/i$d<",
        "Lgh/q;",
        ">;"
    }
.end annotation


# static fields
.field private static final E:Lgh/q;

.field public static F:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/q;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private A:I

.field private B:I

.field private C:B

.field private D:I

.field private final m:Lnh/d;

.field private n:I

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/q$b;",
            ">;"
        }
    .end annotation
.end field

.field private p:Z

.field private q:I

.field private r:Lgh/q;

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:Lgh/q;

.field private y:I

.field private z:Lgh/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/q$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/q$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/q;->F:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/q;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/q;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/q;->E:Lgh/q;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/q;->x0()V

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
    invoke-direct {p0}, Lnh/i$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lgh/q;->C:B

    .line 13
    iput v0, p0, Lgh/q;->D:I

    .line 14
    invoke-direct {p0}, Lgh/q;->x0()V

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
    if-nez v3, :cond_9

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v5

    const/4 v6, 0x0

    sparse-switch v5, :sswitch_data_0

    .line 18
    invoke-virtual {p0, p1, v2, p2, v5}, Lnh/i$d;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v5

    goto/16 :goto_2

    .line 19
    :sswitch_0
    iget v5, p0, Lgh/q;->n:I

    or-int/lit16 v5, v5, 0x800

    iput v5, p0, Lgh/q;->n:I

    .line 20
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v5

    iput v5, p0, Lgh/q;->A:I

    goto :goto_0

    .line 21
    :sswitch_1
    iget v5, p0, Lgh/q;->n:I

    const/16 v7, 0x400

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_1

    .line 22
    iget-object v5, p0, Lgh/q;->z:Lgh/q;

    invoke-virtual {v5}, Lgh/q;->B0()Lgh/q$c;

    move-result-object v6

    .line 23
    :cond_1
    sget-object v5, Lgh/q;->F:Lnh/s;

    invoke-virtual {p1, v5, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v5

    check-cast v5, Lgh/q;

    iput-object v5, p0, Lgh/q;->z:Lgh/q;

    if-eqz v6, :cond_2

    .line 24
    invoke-virtual {v6, v5}, Lgh/q$c;->E(Lgh/q;)Lgh/q$c;

    .line 25
    invoke-virtual {v6}, Lgh/q$c;->x()Lgh/q;

    move-result-object v5

    iput-object v5, p0, Lgh/q;->z:Lgh/q;

    .line 26
    :cond_2
    iget v5, p0, Lgh/q;->n:I

    or-int/2addr v5, v7

    iput v5, p0, Lgh/q;->n:I

    goto :goto_0

    .line 27
    :sswitch_2
    iget v5, p0, Lgh/q;->n:I

    or-int/lit16 v5, v5, 0x80

    iput v5, p0, Lgh/q;->n:I

    .line 28
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v5

    iput v5, p0, Lgh/q;->w:I

    goto :goto_0

    .line 29
    :sswitch_3
    iget v5, p0, Lgh/q;->n:I

    or-int/lit16 v5, v5, 0x200

    iput v5, p0, Lgh/q;->n:I

    .line 30
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v5

    iput v5, p0, Lgh/q;->y:I

    goto :goto_0

    .line 31
    :sswitch_4
    iget v5, p0, Lgh/q;->n:I

    const/16 v7, 0x100

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_3

    .line 32
    iget-object v5, p0, Lgh/q;->x:Lgh/q;

    invoke-virtual {v5}, Lgh/q;->B0()Lgh/q$c;

    move-result-object v6

    .line 33
    :cond_3
    sget-object v5, Lgh/q;->F:Lnh/s;

    invoke-virtual {p1, v5, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v5

    check-cast v5, Lgh/q;

    iput-object v5, p0, Lgh/q;->x:Lgh/q;

    if-eqz v6, :cond_4

    .line 34
    invoke-virtual {v6, v5}, Lgh/q$c;->E(Lgh/q;)Lgh/q$c;

    .line 35
    invoke-virtual {v6}, Lgh/q$c;->x()Lgh/q;

    move-result-object v5

    iput-object v5, p0, Lgh/q;->x:Lgh/q;

    .line 36
    :cond_4
    iget v5, p0, Lgh/q;->n:I

    or-int/2addr v5, v7

    iput v5, p0, Lgh/q;->n:I

    goto/16 :goto_0

    .line 37
    :sswitch_5
    iget v5, p0, Lgh/q;->n:I

    or-int/lit8 v5, v5, 0x40

    iput v5, p0, Lgh/q;->n:I

    .line 38
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v5

    iput v5, p0, Lgh/q;->v:I

    goto/16 :goto_0

    .line 39
    :sswitch_6
    iget v5, p0, Lgh/q;->n:I

    or-int/lit8 v5, v5, 0x8

    iput v5, p0, Lgh/q;->n:I

    .line 40
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v5

    iput v5, p0, Lgh/q;->s:I

    goto/16 :goto_0

    .line 41
    :sswitch_7
    iget v5, p0, Lgh/q;->n:I

    or-int/lit8 v5, v5, 0x20

    iput v5, p0, Lgh/q;->n:I

    .line 42
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v5

    iput v5, p0, Lgh/q;->u:I

    goto/16 :goto_0

    .line 43
    :sswitch_8
    iget v5, p0, Lgh/q;->n:I

    or-int/lit8 v5, v5, 0x10

    iput v5, p0, Lgh/q;->n:I

    .line 44
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v5

    iput v5, p0, Lgh/q;->t:I

    goto/16 :goto_0

    .line 45
    :sswitch_9
    iget v5, p0, Lgh/q;->n:I

    const/4 v7, 0x4

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_5

    .line 46
    iget-object v5, p0, Lgh/q;->r:Lgh/q;

    invoke-virtual {v5}, Lgh/q;->B0()Lgh/q$c;

    move-result-object v6

    .line 47
    :cond_5
    sget-object v5, Lgh/q;->F:Lnh/s;

    invoke-virtual {p1, v5, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v5

    check-cast v5, Lgh/q;

    iput-object v5, p0, Lgh/q;->r:Lgh/q;

    if-eqz v6, :cond_6

    .line 48
    invoke-virtual {v6, v5}, Lgh/q$c;->E(Lgh/q;)Lgh/q$c;

    .line 49
    invoke-virtual {v6}, Lgh/q$c;->x()Lgh/q;

    move-result-object v5

    iput-object v5, p0, Lgh/q;->r:Lgh/q;

    .line 50
    :cond_6
    iget v5, p0, Lgh/q;->n:I

    or-int/2addr v5, v7

    iput v5, p0, Lgh/q;->n:I

    goto/16 :goto_0

    .line 51
    :sswitch_a
    iget v5, p0, Lgh/q;->n:I

    or-int/lit8 v5, v5, 0x2

    iput v5, p0, Lgh/q;->n:I

    .line 52
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v5

    iput v5, p0, Lgh/q;->q:I

    goto/16 :goto_0

    .line 53
    :sswitch_b
    iget v5, p0, Lgh/q;->n:I

    or-int/2addr v5, v1

    iput v5, p0, Lgh/q;->n:I

    .line 54
    invoke-virtual {p1}, Lnh/e;->k()Z

    move-result v5

    iput-boolean v5, p0, Lgh/q;->p:Z

    goto/16 :goto_0

    :sswitch_c
    and-int/lit8 v5, v4, 0x1

    if-eq v5, v1, :cond_7

    .line 55
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lgh/q;->o:Ljava/util/List;

    or-int/lit8 v4, v4, 0x1

    .line 56
    :cond_7
    iget-object v5, p0, Lgh/q;->o:Ljava/util/List;

    sget-object v6, Lgh/q$b;->t:Lnh/s;

    invoke-virtual {p1, v6, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 57
    :sswitch_d
    iget v5, p0, Lgh/q;->n:I

    or-int/lit16 v5, v5, 0x1000

    iput v5, p0, Lgh/q;->n:I

    .line 58
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v5

    iput v5, p0, Lgh/q;->B:I
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :goto_1
    :sswitch_e
    move v3, v1

    goto/16 :goto_0

    :goto_2
    if-nez v5, :cond_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 59
    :try_start_1
    new-instance p2, Lnh/k;

    .line 60
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 61
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    and-int/lit8 p2, v4, 0x1

    if-ne p2, v1, :cond_8

    .line 62
    iget-object p2, p0, Lgh/q;->o:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/q;->o:Ljava/util/List;

    .line 63
    :cond_8
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/q;->m:Lnh/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/q;->m:Lnh/d;

    .line 65
    throw p1

    .line 66
    :goto_4
    invoke-virtual {p0}, Lnh/i$d;->n()V

    .line 67
    throw p1

    :cond_9
    and-int/lit8 p1, v4, 0x1

    if-ne p1, v1, :cond_a

    .line 68
    iget-object p1, p0, Lgh/q;->o:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/q;->o:Ljava/util/List;

    .line 69
    :cond_a
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 70
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/q;->m:Lnh/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/q;->m:Lnh/d;

    .line 71
    throw p1

    .line 72
    :goto_5
    invoke-virtual {p0}, Lnh/i$d;->n()V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_e
        0x8 -> :sswitch_d
        0x12 -> :sswitch_c
        0x18 -> :sswitch_b
        0x20 -> :sswitch_a
        0x2a -> :sswitch_9
        0x30 -> :sswitch_8
        0x38 -> :sswitch_7
        0x40 -> :sswitch_6
        0x48 -> :sswitch_5
        0x52 -> :sswitch_4
        0x58 -> :sswitch_3
        0x60 -> :sswitch_2
        0x6a -> :sswitch_1
        0x70 -> :sswitch_0
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/q;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/i$c<",
            "Lgh/q;",
            "*>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Lnh/i$d;-><init>(Lnh/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lgh/q;->C:B

    .line 5
    iput v0, p0, Lgh/q;->D:I

    .line 6
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/q;->m:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$c;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/q;-><init>(Lnh/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lnh/i$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lgh/q;->C:B

    .line 9
    iput p1, p0, Lgh/q;->D:I

    .line 10
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/q;->m:Lnh/d;

    return-void
.end method

.method static synthetic B(Lgh/q;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/q;->o:Ljava/util/List;

    return-object p0
.end method

.method static synthetic C(Lgh/q;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/q;->o:Ljava/util/List;

    return-object p1
.end method

.method static synthetic D(Lgh/q;Z)Z
    .locals 0

    iput-boolean p1, p0, Lgh/q;->p:Z

    return p1
.end method

.method static synthetic E(Lgh/q;I)I
    .locals 0

    iput p1, p0, Lgh/q;->q:I

    return p1
.end method

.method static synthetic F(Lgh/q;Lgh/q;)Lgh/q;
    .locals 0

    iput-object p1, p0, Lgh/q;->r:Lgh/q;

    return-object p1
.end method

.method static synthetic G(Lgh/q;I)I
    .locals 0

    iput p1, p0, Lgh/q;->s:I

    return p1
.end method

.method static synthetic H(Lgh/q;I)I
    .locals 0

    iput p1, p0, Lgh/q;->t:I

    return p1
.end method

.method static synthetic I(Lgh/q;I)I
    .locals 0

    iput p1, p0, Lgh/q;->u:I

    return p1
.end method

.method static synthetic J(Lgh/q;I)I
    .locals 0

    iput p1, p0, Lgh/q;->v:I

    return p1
.end method

.method static synthetic K(Lgh/q;I)I
    .locals 0

    iput p1, p0, Lgh/q;->w:I

    return p1
.end method

.method static synthetic L(Lgh/q;Lgh/q;)Lgh/q;
    .locals 0

    iput-object p1, p0, Lgh/q;->x:Lgh/q;

    return-object p1
.end method

.method static synthetic M(Lgh/q;I)I
    .locals 0

    iput p1, p0, Lgh/q;->y:I

    return p1
.end method

.method static synthetic N(Lgh/q;Lgh/q;)Lgh/q;
    .locals 0

    iput-object p1, p0, Lgh/q;->z:Lgh/q;

    return-object p1
.end method

.method static synthetic O(Lgh/q;I)I
    .locals 0

    iput p1, p0, Lgh/q;->A:I

    return p1
.end method

.method static synthetic P(Lgh/q;I)I
    .locals 0

    iput p1, p0, Lgh/q;->B:I

    return p1
.end method

.method static synthetic Q(Lgh/q;I)I
    .locals 0

    iput p1, p0, Lgh/q;->n:I

    return p1
.end method

.method static synthetic R(Lgh/q;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/q;->m:Lnh/d;

    return-object p0
.end method

.method public static Y()Lgh/q;
    .locals 1

    sget-object v0, Lgh/q;->E:Lgh/q;

    return-object v0
.end method

.method private x0()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lgh/q;->o:Ljava/util/List;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lgh/q;->p:Z

    .line 9
    .line 10
    iput v0, p0, Lgh/q;->q:I

    .line 11
    .line 12
    invoke-static {}, Lgh/q;->Y()Lgh/q;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Lgh/q;->r:Lgh/q;

    .line 17
    .line 18
    iput v0, p0, Lgh/q;->s:I

    .line 19
    .line 20
    iput v0, p0, Lgh/q;->t:I

    .line 21
    .line 22
    iput v0, p0, Lgh/q;->u:I

    .line 23
    .line 24
    iput v0, p0, Lgh/q;->v:I

    .line 25
    .line 26
    iput v0, p0, Lgh/q;->w:I

    .line 27
    .line 28
    invoke-static {}, Lgh/q;->Y()Lgh/q;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, Lgh/q;->x:Lgh/q;

    .line 33
    .line 34
    iput v0, p0, Lgh/q;->y:I

    .line 35
    .line 36
    invoke-static {}, Lgh/q;->Y()Lgh/q;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, Lgh/q;->z:Lgh/q;

    .line 41
    .line 42
    iput v0, p0, Lgh/q;->A:I

    .line 43
    .line 44
    iput v0, p0, Lgh/q;->B:I

    .line 45
    .line 46
    return-void
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

.method public static y0()Lgh/q$c;
    .locals 1

    invoke-static {}, Lgh/q$c;->v()Lgh/q$c;

    move-result-object v0

    return-object v0
.end method

.method public static z0(Lgh/q;)Lgh/q$c;
    .locals 1

    invoke-static {}, Lgh/q;->y0()Lgh/q$c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/q$c;->E(Lgh/q;)Lgh/q$c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A0()Lgh/q$c;
    .locals 1

    invoke-static {}, Lgh/q;->y0()Lgh/q$c;

    move-result-object v0

    return-object v0
.end method

.method public B0()Lgh/q$c;
    .locals 1

    invoke-static {p0}, Lgh/q;->z0(Lgh/q;)Lgh/q$c;

    move-result-object v0

    return-object v0
.end method

.method public S()Lgh/q;
    .locals 1

    iget-object v0, p0, Lgh/q;->z:Lgh/q;

    return-object v0
.end method

.method public T()I
    .locals 1

    iget v0, p0, Lgh/q;->A:I

    return v0
.end method

.method public U(I)Lgh/q$b;
    .locals 1

    iget-object v0, p0, Lgh/q;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/q$b;

    return-object p1
.end method

.method public V()I
    .locals 1

    iget-object v0, p0, Lgh/q;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public W()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/q$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/q;->o:Ljava/util/List;

    return-object v0
.end method

.method public X()I
    .locals 1

    iget v0, p0, Lgh/q;->t:I

    return v0
.end method

.method public Z()Lgh/q;
    .locals 1

    sget-object v0, Lgh/q;->E:Lgh/q;

    return-object v0
.end method

.method public bridge synthetic a()Lnh/q;
    .locals 1

    invoke-virtual {p0}, Lgh/q;->Z()Lgh/q;

    move-result-object v0

    return-object v0
.end method

.method public a0()I
    .locals 1

    iget v0, p0, Lgh/q;->B:I

    return v0
.end method

.method public b0()I
    .locals 1

    iget v0, p0, Lgh/q;->q:I

    return v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/q;->B0()Lgh/q$c;

    move-result-object v0

    return-object v0
.end method

.method public c0()Lgh/q;
    .locals 1

    iget-object v0, p0, Lgh/q;->r:Lgh/q;

    return-object v0
.end method

.method public d()I
    .locals 5

    .line 1
    iget v0, p0, Lgh/q;->D:I

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
    iget v0, p0, Lgh/q;->n:I

    .line 8
    .line 9
    const/16 v1, 0x1000

    .line 10
    .line 11
    and-int/2addr v0, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    iget v0, p0, Lgh/q;->B:I

    .line 17
    .line 18
    invoke-static {v3, v0}, Lnh/f;->o(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/2addr v0, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v0, v2

    .line 25
    :goto_0
    iget-object v1, p0, Lgh/q;->o:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v4, 0x2

    .line 32
    if-ge v2, v1, :cond_2

    .line 33
    .line 34
    iget-object v1, p0, Lgh/q;->o:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lnh/q;

    .line 41
    .line 42
    invoke-static {v4, v1}, Lnh/f;->s(ILnh/q;)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v0, v1

    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget v1, p0, Lgh/q;->n:I

    .line 51
    .line 52
    and-int/2addr v1, v3

    .line 53
    if-ne v1, v3, :cond_3

    .line 54
    .line 55
    const/4 v1, 0x3

    .line 56
    iget-boolean v2, p0, Lgh/q;->p:Z

    .line 57
    .line 58
    invoke-static {v1, v2}, Lnh/f;->a(IZ)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    add-int/2addr v0, v1

    .line 63
    :cond_3
    iget v1, p0, Lgh/q;->n:I

    .line 64
    .line 65
    and-int/2addr v1, v4

    .line 66
    const/4 v2, 0x4

    .line 67
    if-ne v1, v4, :cond_4

    .line 68
    .line 69
    iget v1, p0, Lgh/q;->q:I

    .line 70
    .line 71
    invoke-static {v2, v1}, Lnh/f;->o(II)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    add-int/2addr v0, v1

    .line 76
    :cond_4
    iget v1, p0, Lgh/q;->n:I

    .line 77
    .line 78
    and-int/2addr v1, v2

    .line 79
    if-ne v1, v2, :cond_5

    .line 80
    .line 81
    const/4 v1, 0x5

    .line 82
    iget-object v2, p0, Lgh/q;->r:Lgh/q;

    .line 83
    .line 84
    invoke-static {v1, v2}, Lnh/f;->s(ILnh/q;)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    add-int/2addr v0, v1

    .line 89
    :cond_5
    iget v1, p0, Lgh/q;->n:I

    .line 90
    .line 91
    const/16 v2, 0x10

    .line 92
    .line 93
    and-int/2addr v1, v2

    .line 94
    if-ne v1, v2, :cond_6

    .line 95
    .line 96
    const/4 v1, 0x6

    .line 97
    iget v2, p0, Lgh/q;->t:I

    .line 98
    .line 99
    invoke-static {v1, v2}, Lnh/f;->o(II)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    add-int/2addr v0, v1

    .line 104
    :cond_6
    iget v1, p0, Lgh/q;->n:I

    .line 105
    .line 106
    const/16 v2, 0x20

    .line 107
    .line 108
    and-int/2addr v1, v2

    .line 109
    if-ne v1, v2, :cond_7

    .line 110
    .line 111
    const/4 v1, 0x7

    .line 112
    iget v2, p0, Lgh/q;->u:I

    .line 113
    .line 114
    invoke-static {v1, v2}, Lnh/f;->o(II)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    add-int/2addr v0, v1

    .line 119
    :cond_7
    iget v1, p0, Lgh/q;->n:I

    .line 120
    .line 121
    const/16 v2, 0x8

    .line 122
    .line 123
    and-int/2addr v1, v2

    .line 124
    if-ne v1, v2, :cond_8

    .line 125
    .line 126
    iget v1, p0, Lgh/q;->s:I

    .line 127
    .line 128
    invoke-static {v2, v1}, Lnh/f;->o(II)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    add-int/2addr v0, v1

    .line 133
    :cond_8
    iget v1, p0, Lgh/q;->n:I

    .line 134
    .line 135
    const/16 v2, 0x40

    .line 136
    .line 137
    and-int/2addr v1, v2

    .line 138
    if-ne v1, v2, :cond_9

    .line 139
    .line 140
    const/16 v1, 0x9

    .line 141
    .line 142
    iget v2, p0, Lgh/q;->v:I

    .line 143
    .line 144
    invoke-static {v1, v2}, Lnh/f;->o(II)I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    add-int/2addr v0, v1

    .line 149
    :cond_9
    iget v1, p0, Lgh/q;->n:I

    .line 150
    .line 151
    const/16 v2, 0x100

    .line 152
    .line 153
    and-int/2addr v1, v2

    .line 154
    if-ne v1, v2, :cond_a

    .line 155
    .line 156
    const/16 v1, 0xa

    .line 157
    .line 158
    iget-object v2, p0, Lgh/q;->x:Lgh/q;

    .line 159
    .line 160
    invoke-static {v1, v2}, Lnh/f;->s(ILnh/q;)I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    add-int/2addr v0, v1

    .line 165
    :cond_a
    iget v1, p0, Lgh/q;->n:I

    .line 166
    .line 167
    const/16 v2, 0x200

    .line 168
    .line 169
    and-int/2addr v1, v2

    .line 170
    if-ne v1, v2, :cond_b

    .line 171
    .line 172
    const/16 v1, 0xb

    .line 173
    .line 174
    iget v2, p0, Lgh/q;->y:I

    .line 175
    .line 176
    invoke-static {v1, v2}, Lnh/f;->o(II)I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    add-int/2addr v0, v1

    .line 181
    :cond_b
    iget v1, p0, Lgh/q;->n:I

    .line 182
    .line 183
    const/16 v2, 0x80

    .line 184
    .line 185
    and-int/2addr v1, v2

    .line 186
    if-ne v1, v2, :cond_c

    .line 187
    .line 188
    const/16 v1, 0xc

    .line 189
    .line 190
    iget v2, p0, Lgh/q;->w:I

    .line 191
    .line 192
    invoke-static {v1, v2}, Lnh/f;->o(II)I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    add-int/2addr v0, v1

    .line 197
    :cond_c
    iget v1, p0, Lgh/q;->n:I

    .line 198
    .line 199
    const/16 v2, 0x400

    .line 200
    .line 201
    and-int/2addr v1, v2

    .line 202
    if-ne v1, v2, :cond_d

    .line 203
    .line 204
    const/16 v1, 0xd

    .line 205
    .line 206
    iget-object v2, p0, Lgh/q;->z:Lgh/q;

    .line 207
    .line 208
    invoke-static {v1, v2}, Lnh/f;->s(ILnh/q;)I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    add-int/2addr v0, v1

    .line 213
    :cond_d
    iget v1, p0, Lgh/q;->n:I

    .line 214
    .line 215
    const/16 v2, 0x800

    .line 216
    .line 217
    and-int/2addr v1, v2

    .line 218
    if-ne v1, v2, :cond_e

    .line 219
    .line 220
    const/16 v1, 0xe

    .line 221
    .line 222
    iget v2, p0, Lgh/q;->A:I

    .line 223
    .line 224
    invoke-static {v1, v2}, Lnh/f;->o(II)I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    add-int/2addr v0, v1

    .line 229
    :cond_e
    invoke-virtual {p0}, Lnh/i$d;->u()I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    add-int/2addr v0, v1

    .line 234
    iget-object v1, p0, Lgh/q;->m:Lnh/d;

    .line 235
    .line 236
    invoke-virtual {v1}, Lnh/d;->size()I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    add-int/2addr v0, v1

    .line 241
    iput v0, p0, Lgh/q;->D:I

    .line 242
    .line 243
    return v0
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

.method public d0()I
    .locals 1

    iget v0, p0, Lgh/q;->s:I

    return v0
.end method

.method public e(Lnh/f;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lgh/q;->d()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lnh/i$d;->z()Lnh/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lgh/q;->n:I

    .line 9
    .line 10
    const/16 v2, 0x1000

    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget v1, p0, Lgh/q;->B:I

    .line 17
    .line 18
    invoke-virtual {p1, v3, v1}, Lnh/f;->a0(II)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    iget-object v2, p0, Lgh/q;->o:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v4, 0x2

    .line 29
    if-ge v1, v2, :cond_1

    .line 30
    .line 31
    iget-object v2, p0, Lgh/q;->o:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lnh/q;

    .line 38
    .line 39
    invoke-virtual {p1, v4, v2}, Lnh/f;->d0(ILnh/q;)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget v1, p0, Lgh/q;->n:I

    .line 46
    .line 47
    and-int/2addr v1, v3

    .line 48
    if-ne v1, v3, :cond_2

    .line 49
    .line 50
    const/4 v1, 0x3

    .line 51
    iget-boolean v2, p0, Lgh/q;->p:Z

    .line 52
    .line 53
    invoke-virtual {p1, v1, v2}, Lnh/f;->L(IZ)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget v1, p0, Lgh/q;->n:I

    .line 57
    .line 58
    and-int/2addr v1, v4

    .line 59
    const/4 v2, 0x4

    .line 60
    if-ne v1, v4, :cond_3

    .line 61
    .line 62
    iget v1, p0, Lgh/q;->q:I

    .line 63
    .line 64
    invoke-virtual {p1, v2, v1}, Lnh/f;->a0(II)V

    .line 65
    .line 66
    .line 67
    :cond_3
    iget v1, p0, Lgh/q;->n:I

    .line 68
    .line 69
    and-int/2addr v1, v2

    .line 70
    if-ne v1, v2, :cond_4

    .line 71
    .line 72
    const/4 v1, 0x5

    .line 73
    iget-object v2, p0, Lgh/q;->r:Lgh/q;

    .line 74
    .line 75
    invoke-virtual {p1, v1, v2}, Lnh/f;->d0(ILnh/q;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    iget v1, p0, Lgh/q;->n:I

    .line 79
    .line 80
    const/16 v2, 0x10

    .line 81
    .line 82
    and-int/2addr v1, v2

    .line 83
    if-ne v1, v2, :cond_5

    .line 84
    .line 85
    const/4 v1, 0x6

    .line 86
    iget v2, p0, Lgh/q;->t:I

    .line 87
    .line 88
    invoke-virtual {p1, v1, v2}, Lnh/f;->a0(II)V

    .line 89
    .line 90
    .line 91
    :cond_5
    iget v1, p0, Lgh/q;->n:I

    .line 92
    .line 93
    const/16 v2, 0x20

    .line 94
    .line 95
    and-int/2addr v1, v2

    .line 96
    if-ne v1, v2, :cond_6

    .line 97
    .line 98
    const/4 v1, 0x7

    .line 99
    iget v2, p0, Lgh/q;->u:I

    .line 100
    .line 101
    invoke-virtual {p1, v1, v2}, Lnh/f;->a0(II)V

    .line 102
    .line 103
    .line 104
    :cond_6
    iget v1, p0, Lgh/q;->n:I

    .line 105
    .line 106
    const/16 v2, 0x8

    .line 107
    .line 108
    and-int/2addr v1, v2

    .line 109
    if-ne v1, v2, :cond_7

    .line 110
    .line 111
    iget v1, p0, Lgh/q;->s:I

    .line 112
    .line 113
    invoke-virtual {p1, v2, v1}, Lnh/f;->a0(II)V

    .line 114
    .line 115
    .line 116
    :cond_7
    iget v1, p0, Lgh/q;->n:I

    .line 117
    .line 118
    const/16 v2, 0x40

    .line 119
    .line 120
    and-int/2addr v1, v2

    .line 121
    if-ne v1, v2, :cond_8

    .line 122
    .line 123
    const/16 v1, 0x9

    .line 124
    .line 125
    iget v2, p0, Lgh/q;->v:I

    .line 126
    .line 127
    invoke-virtual {p1, v1, v2}, Lnh/f;->a0(II)V

    .line 128
    .line 129
    .line 130
    :cond_8
    iget v1, p0, Lgh/q;->n:I

    .line 131
    .line 132
    const/16 v2, 0x100

    .line 133
    .line 134
    and-int/2addr v1, v2

    .line 135
    if-ne v1, v2, :cond_9

    .line 136
    .line 137
    const/16 v1, 0xa

    .line 138
    .line 139
    iget-object v2, p0, Lgh/q;->x:Lgh/q;

    .line 140
    .line 141
    invoke-virtual {p1, v1, v2}, Lnh/f;->d0(ILnh/q;)V

    .line 142
    .line 143
    .line 144
    :cond_9
    iget v1, p0, Lgh/q;->n:I

    .line 145
    .line 146
    const/16 v2, 0x200

    .line 147
    .line 148
    and-int/2addr v1, v2

    .line 149
    if-ne v1, v2, :cond_a

    .line 150
    .line 151
    const/16 v1, 0xb

    .line 152
    .line 153
    iget v2, p0, Lgh/q;->y:I

    .line 154
    .line 155
    invoke-virtual {p1, v1, v2}, Lnh/f;->a0(II)V

    .line 156
    .line 157
    .line 158
    :cond_a
    iget v1, p0, Lgh/q;->n:I

    .line 159
    .line 160
    const/16 v2, 0x80

    .line 161
    .line 162
    and-int/2addr v1, v2

    .line 163
    if-ne v1, v2, :cond_b

    .line 164
    .line 165
    const/16 v1, 0xc

    .line 166
    .line 167
    iget v2, p0, Lgh/q;->w:I

    .line 168
    .line 169
    invoke-virtual {p1, v1, v2}, Lnh/f;->a0(II)V

    .line 170
    .line 171
    .line 172
    :cond_b
    iget v1, p0, Lgh/q;->n:I

    .line 173
    .line 174
    const/16 v2, 0x400

    .line 175
    .line 176
    and-int/2addr v1, v2

    .line 177
    if-ne v1, v2, :cond_c

    .line 178
    .line 179
    const/16 v1, 0xd

    .line 180
    .line 181
    iget-object v2, p0, Lgh/q;->z:Lgh/q;

    .line 182
    .line 183
    invoke-virtual {p1, v1, v2}, Lnh/f;->d0(ILnh/q;)V

    .line 184
    .line 185
    .line 186
    :cond_c
    iget v1, p0, Lgh/q;->n:I

    .line 187
    .line 188
    const/16 v2, 0x800

    .line 189
    .line 190
    and-int/2addr v1, v2

    .line 191
    if-ne v1, v2, :cond_d

    .line 192
    .line 193
    const/16 v1, 0xe

    .line 194
    .line 195
    iget v2, p0, Lgh/q;->A:I

    .line 196
    .line 197
    invoke-virtual {p1, v1, v2}, Lnh/f;->a0(II)V

    .line 198
    .line 199
    .line 200
    :cond_d
    const/16 v1, 0xc8

    .line 201
    .line 202
    invoke-virtual {v0, v1, p1}, Lnh/i$d$a;->a(ILnh/f;)V

    .line 203
    .line 204
    .line 205
    iget-object v0, p0, Lgh/q;->m:Lnh/d;

    .line 206
    .line 207
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 208
    .line 209
    .line 210
    return-void
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

.method public e0()Z
    .locals 1

    iget-boolean v0, p0, Lgh/q;->p:Z

    return v0
.end method

.method public f0()Lgh/q;
    .locals 1

    iget-object v0, p0, Lgh/q;->x:Lgh/q;

    return-object v0
.end method

.method public bridge synthetic g()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/q;->A0()Lgh/q$c;

    move-result-object v0

    return-object v0
.end method

.method public g0()I
    .locals 1

    iget v0, p0, Lgh/q;->y:I

    return v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/q;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/q;->F:Lnh/s;

    return-object v0
.end method

.method public h0()I
    .locals 1

    iget v0, p0, Lgh/q;->w:I

    return v0
.end method

.method public i0()I
    .locals 1

    iget v0, p0, Lgh/q;->u:I

    return v0
.end method

.method public final j()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lgh/q;->C:B

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
    invoke-virtual {p0}, Lgh/q;->V()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v0, v3, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lgh/q;->U(I)Lgh/q$b;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lgh/q$b;->j()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    iput-byte v2, p0, Lgh/q;->C:B

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
    invoke-virtual {p0}, Lgh/q;->p0()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    invoke-virtual {p0}, Lgh/q;->c0()Lgh/q;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lgh/q;->j()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    iput-byte v2, p0, Lgh/q;->C:B

    .line 51
    .line 52
    return v2

    .line 53
    :cond_4
    invoke-virtual {p0}, Lgh/q;->s0()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    invoke-virtual {p0}, Lgh/q;->f0()Lgh/q;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lgh/q;->j()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    iput-byte v2, p0, Lgh/q;->C:B

    .line 70
    .line 71
    return v2

    .line 72
    :cond_5
    invoke-virtual {p0}, Lgh/q;->k0()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_6

    .line 77
    .line 78
    invoke-virtual {p0}, Lgh/q;->S()Lgh/q;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lgh/q;->j()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_6

    .line 87
    .line 88
    iput-byte v2, p0, Lgh/q;->C:B

    .line 89
    .line 90
    return v2

    .line 91
    :cond_6
    invoke-virtual {p0}, Lnh/i$d;->t()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_7

    .line 96
    .line 97
    iput-byte v2, p0, Lgh/q;->C:B

    .line 98
    .line 99
    return v2

    .line 100
    :cond_7
    iput-byte v1, p0, Lgh/q;->C:B

    .line 101
    .line 102
    return v1
    .line 103
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

.method public j0()I
    .locals 1

    iget v0, p0, Lgh/q;->v:I

    return v0
.end method

.method public k0()Z
    .locals 2

    iget v0, p0, Lgh/q;->n:I

    const/16 v1, 0x400

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l0()Z
    .locals 2

    iget v0, p0, Lgh/q;->n:I

    const/16 v1, 0x800

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m0()Z
    .locals 2

    iget v0, p0, Lgh/q;->n:I

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

.method public n0()Z
    .locals 2

    iget v0, p0, Lgh/q;->n:I

    const/16 v1, 0x1000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o0()Z
    .locals 2

    iget v0, p0, Lgh/q;->n:I

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

.method public p0()Z
    .locals 2

    iget v0, p0, Lgh/q;->n:I

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

.method public q0()Z
    .locals 2

    iget v0, p0, Lgh/q;->n:I

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

.method public r0()Z
    .locals 2

    iget v0, p0, Lgh/q;->n:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public s0()Z
    .locals 2

    iget v0, p0, Lgh/q;->n:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t0()Z
    .locals 2

    iget v0, p0, Lgh/q;->n:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u0()Z
    .locals 2

    iget v0, p0, Lgh/q;->n:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public v0()Z
    .locals 2

    iget v0, p0, Lgh/q;->n:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public w0()Z
    .locals 2

    iget v0, p0, Lgh/q;->n:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
