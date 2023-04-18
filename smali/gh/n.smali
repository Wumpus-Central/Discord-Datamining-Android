.class public final Lgh/n;
.super Lnh/i$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/n$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/i$d<",
        "Lgh/n;",
        ">;"
    }
.end annotation


# static fields
.field private static final F:Lgh/n;

.field public static G:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/n;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private A:I

.field private B:I

.field private C:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private D:B

.field private E:I

.field private final m:Lnh/d;

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:Lgh/q;

.field private s:I

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/s;",
            ">;"
        }
    .end annotation
.end field

.field private u:Lgh/q;

.field private v:I

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/q;",
            ">;"
        }
    .end annotation
.end field

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private y:I

.field private z:Lgh/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/n$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/n$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/n;->G:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/n;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/n;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/n;->F:Lgh/n;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/n;->z0()V

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
    .locals 12

    .line 13
    invoke-direct {p0}, Lnh/i$d;-><init>()V

    const/4 v0, -0x1

    .line 14
    iput v0, p0, Lgh/n;->y:I

    .line 15
    iput-byte v0, p0, Lgh/n;->D:B

    .line 16
    iput v0, p0, Lgh/n;->E:I

    .line 17
    invoke-direct {p0}, Lgh/n;->z0()V

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
    const/16 v5, 0x100

    const/16 v6, 0x2000

    const/16 v7, 0x20

    const/16 v8, 0x200

    if-nez v3, :cond_13

    .line 20
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v9

    const/4 v10, 0x0

    sparse-switch v9, :sswitch_data_0

    .line 21
    invoke-virtual {p0, p1, v2, p2, v9}, Lnh/i$d;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v5

    goto/16 :goto_4

    .line 22
    :sswitch_0
    invoke-virtual {p1}, Lnh/e;->A()I

    move-result v9

    .line 23
    invoke-virtual {p1, v9}, Lnh/e;->j(I)I

    move-result v9

    and-int/lit16 v10, v4, 0x2000

    if-eq v10, v6, :cond_1

    .line 24
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v10

    if-lez v10, :cond_1

    .line 25
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Lgh/n;->C:Ljava/util/List;

    or-int/lit16 v4, v4, 0x2000

    .line 26
    :cond_1
    :goto_1
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v10

    if-lez v10, :cond_2

    .line 27
    iget-object v10, p0, Lgh/n;->C:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 28
    :cond_2
    invoke-virtual {p1, v9}, Lnh/e;->i(I)V

    goto :goto_0

    :sswitch_1
    and-int/lit16 v9, v4, 0x2000

    if-eq v9, v6, :cond_3

    .line 29
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lgh/n;->C:Ljava/util/List;

    or-int/lit16 v4, v4, 0x2000

    .line 30
    :cond_3
    iget-object v9, p0, Lgh/n;->C:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 31
    :sswitch_2
    invoke-virtual {p1}, Lnh/e;->A()I

    move-result v9

    .line 32
    invoke-virtual {p1, v9}, Lnh/e;->j(I)I

    move-result v9

    and-int/lit16 v10, v4, 0x200

    if-eq v10, v8, :cond_4

    .line 33
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v10

    if-lez v10, :cond_4

    .line 34
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Lgh/n;->x:Ljava/util/List;

    or-int/lit16 v4, v4, 0x200

    .line 35
    :cond_4
    :goto_2
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v10

    if-lez v10, :cond_5

    .line 36
    iget-object v10, p0, Lgh/n;->x:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 37
    :cond_5
    invoke-virtual {p1, v9}, Lnh/e;->i(I)V

    goto/16 :goto_0

    :sswitch_3
    and-int/lit16 v9, v4, 0x200

    if-eq v9, v8, :cond_6

    .line 38
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lgh/n;->x:Ljava/util/List;

    or-int/lit16 v4, v4, 0x200

    .line 39
    :cond_6
    iget-object v9, p0, Lgh/n;->x:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :sswitch_4
    and-int/lit16 v9, v4, 0x100

    if-eq v9, v5, :cond_7

    .line 40
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lgh/n;->w:Ljava/util/List;

    or-int/lit16 v4, v4, 0x100

    .line 41
    :cond_7
    iget-object v9, p0, Lgh/n;->w:Ljava/util/List;

    sget-object v10, Lgh/q;->F:Lnh/s;

    invoke-virtual {p1, v10, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 42
    :sswitch_5
    iget v9, p0, Lgh/n;->n:I

    or-int/2addr v9, v1

    iput v9, p0, Lgh/n;->n:I

    .line 43
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v9

    iput v9, p0, Lgh/n;->o:I

    goto/16 :goto_0

    .line 44
    :sswitch_6
    iget v9, p0, Lgh/n;->n:I

    or-int/lit8 v9, v9, 0x40

    iput v9, p0, Lgh/n;->n:I

    .line 45
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v9

    iput v9, p0, Lgh/n;->v:I

    goto/16 :goto_0

    .line 46
    :sswitch_7
    iget v9, p0, Lgh/n;->n:I

    or-int/lit8 v9, v9, 0x10

    iput v9, p0, Lgh/n;->n:I

    .line 47
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v9

    iput v9, p0, Lgh/n;->s:I

    goto/16 :goto_0

    .line 48
    :sswitch_8
    iget v9, p0, Lgh/n;->n:I

    or-int/2addr v9, v8

    iput v9, p0, Lgh/n;->n:I

    .line 49
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v9

    iput v9, p0, Lgh/n;->B:I

    goto/16 :goto_0

    .line 50
    :sswitch_9
    iget v9, p0, Lgh/n;->n:I

    or-int/2addr v9, v5

    iput v9, p0, Lgh/n;->n:I

    .line 51
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v9

    iput v9, p0, Lgh/n;->A:I

    goto/16 :goto_0

    .line 52
    :sswitch_a
    iget v9, p0, Lgh/n;->n:I

    const/16 v11, 0x80

    and-int/2addr v9, v11

    if-ne v9, v11, :cond_8

    .line 53
    iget-object v9, p0, Lgh/n;->z:Lgh/u;

    invoke-virtual {v9}, Lgh/u;->b0()Lgh/u$b;

    move-result-object v10

    .line 54
    :cond_8
    sget-object v9, Lgh/u;->x:Lnh/s;

    invoke-virtual {p1, v9, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v9

    check-cast v9, Lgh/u;

    iput-object v9, p0, Lgh/n;->z:Lgh/u;

    if-eqz v10, :cond_9

    .line 55
    invoke-virtual {v10, v9}, Lgh/u$b;->B(Lgh/u;)Lgh/u$b;

    .line 56
    invoke-virtual {v10}, Lgh/u$b;->x()Lgh/u;

    move-result-object v9

    iput-object v9, p0, Lgh/n;->z:Lgh/u;

    .line 57
    :cond_9
    iget v9, p0, Lgh/n;->n:I

    or-int/2addr v9, v11

    iput v9, p0, Lgh/n;->n:I

    goto/16 :goto_0

    .line 58
    :sswitch_b
    iget v9, p0, Lgh/n;->n:I

    and-int/2addr v9, v7

    if-ne v9, v7, :cond_a

    .line 59
    iget-object v9, p0, Lgh/n;->u:Lgh/q;

    invoke-virtual {v9}, Lgh/q;->B0()Lgh/q$c;

    move-result-object v10

    .line 60
    :cond_a
    sget-object v9, Lgh/q;->F:Lnh/s;

    invoke-virtual {p1, v9, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v9

    check-cast v9, Lgh/q;

    iput-object v9, p0, Lgh/n;->u:Lgh/q;

    if-eqz v10, :cond_b

    .line 61
    invoke-virtual {v10, v9}, Lgh/q$c;->E(Lgh/q;)Lgh/q$c;

    .line 62
    invoke-virtual {v10}, Lgh/q$c;->x()Lgh/q;

    move-result-object v9

    iput-object v9, p0, Lgh/n;->u:Lgh/q;

    .line 63
    :cond_b
    iget v9, p0, Lgh/n;->n:I

    or-int/2addr v9, v7

    iput v9, p0, Lgh/n;->n:I

    goto/16 :goto_0

    :sswitch_c
    and-int/lit8 v9, v4, 0x20

    if-eq v9, v7, :cond_c

    .line 64
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lgh/n;->t:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    .line 65
    :cond_c
    iget-object v9, p0, Lgh/n;->t:Ljava/util/List;

    sget-object v10, Lgh/s;->y:Lnh/s;

    invoke-virtual {p1, v10, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 66
    :sswitch_d
    iget v9, p0, Lgh/n;->n:I

    const/16 v11, 0x8

    and-int/2addr v9, v11

    if-ne v9, v11, :cond_d

    .line 67
    iget-object v9, p0, Lgh/n;->r:Lgh/q;

    invoke-virtual {v9}, Lgh/q;->B0()Lgh/q$c;

    move-result-object v10

    .line 68
    :cond_d
    sget-object v9, Lgh/q;->F:Lnh/s;

    invoke-virtual {p1, v9, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v9

    check-cast v9, Lgh/q;

    iput-object v9, p0, Lgh/n;->r:Lgh/q;

    if-eqz v10, :cond_e

    .line 69
    invoke-virtual {v10, v9}, Lgh/q$c;->E(Lgh/q;)Lgh/q$c;

    .line 70
    invoke-virtual {v10}, Lgh/q$c;->x()Lgh/q;

    move-result-object v9

    iput-object v9, p0, Lgh/n;->r:Lgh/q;

    .line 71
    :cond_e
    iget v9, p0, Lgh/n;->n:I

    or-int/2addr v9, v11

    iput v9, p0, Lgh/n;->n:I

    goto/16 :goto_0

    .line 72
    :sswitch_e
    iget v9, p0, Lgh/n;->n:I

    or-int/lit8 v9, v9, 0x4

    iput v9, p0, Lgh/n;->n:I

    .line 73
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v9

    iput v9, p0, Lgh/n;->q:I

    goto/16 :goto_0

    .line 74
    :sswitch_f
    iget v9, p0, Lgh/n;->n:I

    or-int/lit8 v9, v9, 0x2

    iput v9, p0, Lgh/n;->n:I

    .line 75
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v9

    iput v9, p0, Lgh/n;->p:I
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :goto_3
    :sswitch_10
    move v3, v1

    goto/16 :goto_0

    :goto_4
    if-nez v5, :cond_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_5

    :catch_0
    move-exception p1

    .line 76
    :try_start_1
    new-instance p2, Lnh/k;

    .line 77
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 78
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_5
    and-int/lit8 p2, v4, 0x20

    if-ne p2, v7, :cond_f

    .line 79
    iget-object p2, p0, Lgh/n;->t:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/n;->t:Ljava/util/List;

    :cond_f
    and-int/lit16 p2, v4, 0x100

    if-ne p2, v5, :cond_10

    .line 80
    iget-object p2, p0, Lgh/n;->w:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/n;->w:Ljava/util/List;

    :cond_10
    and-int/lit16 p2, v4, 0x200

    if-ne p2, v8, :cond_11

    .line 81
    iget-object p2, p0, Lgh/n;->x:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/n;->x:Ljava/util/List;

    :cond_11
    and-int/lit16 p2, v4, 0x2000

    if-ne p2, v6, :cond_12

    .line 82
    iget-object p2, p0, Lgh/n;->C:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/n;->C:Ljava/util/List;

    .line 83
    :cond_12
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/n;->m:Lnh/d;

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/n;->m:Lnh/d;

    .line 85
    throw p1

    .line 86
    :goto_6
    invoke-virtual {p0}, Lnh/i$d;->n()V

    .line 87
    throw p1

    :cond_13
    and-int/lit8 p1, v4, 0x20

    if-ne p1, v7, :cond_14

    .line 88
    iget-object p1, p0, Lgh/n;->t:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/n;->t:Ljava/util/List;

    :cond_14
    and-int/lit16 p1, v4, 0x100

    if-ne p1, v5, :cond_15

    .line 89
    iget-object p1, p0, Lgh/n;->w:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/n;->w:Ljava/util/List;

    :cond_15
    and-int/lit16 p1, v4, 0x200

    if-ne p1, v8, :cond_16

    .line 90
    iget-object p1, p0, Lgh/n;->x:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/n;->x:Ljava/util/List;

    :cond_16
    and-int/lit16 p1, v4, 0x2000

    if-ne p1, v6, :cond_17

    .line 91
    iget-object p1, p0, Lgh/n;->C:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/n;->C:Ljava/util/List;

    .line 92
    :cond_17
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 93
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/n;->m:Lnh/d;

    goto :goto_7

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/n;->m:Lnh/d;

    .line 94
    throw p1

    .line 95
    :goto_7
    invoke-virtual {p0}, Lnh/i$d;->n()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_10
        0x8 -> :sswitch_f
        0x10 -> :sswitch_e
        0x1a -> :sswitch_d
        0x22 -> :sswitch_c
        0x2a -> :sswitch_b
        0x32 -> :sswitch_a
        0x38 -> :sswitch_9
        0x40 -> :sswitch_8
        0x48 -> :sswitch_7
        0x50 -> :sswitch_6
        0x58 -> :sswitch_5
        0x62 -> :sswitch_4
        0x68 -> :sswitch_3
        0x6a -> :sswitch_2
        0xf8 -> :sswitch_1
        0xfa -> :sswitch_0
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/n;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/i$c<",
            "Lgh/n;",
            "*>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Lnh/i$d;-><init>(Lnh/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lgh/n;->y:I

    .line 5
    iput-byte v0, p0, Lgh/n;->D:B

    .line 6
    iput v0, p0, Lgh/n;->E:I

    .line 7
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/n;->m:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$c;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/n;-><init>(Lnh/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 8
    invoke-direct {p0}, Lnh/i$d;-><init>()V

    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lgh/n;->y:I

    .line 10
    iput-byte p1, p0, Lgh/n;->D:B

    .line 11
    iput p1, p0, Lgh/n;->E:I

    .line 12
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/n;->m:Lnh/d;

    return-void
.end method

.method public static A0()Lgh/n$b;
    .locals 1

    invoke-static {}, Lgh/n$b;->v()Lgh/n$b;

    move-result-object v0

    return-object v0
.end method

.method static synthetic B(Lgh/n;I)I
    .locals 0

    iput p1, p0, Lgh/n;->o:I

    return p1
.end method

.method public static B0(Lgh/n;)Lgh/n$b;
    .locals 1

    invoke-static {}, Lgh/n;->A0()Lgh/n$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/n$b;->F(Lgh/n;)Lgh/n$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic C(Lgh/n;I)I
    .locals 0

    iput p1, p0, Lgh/n;->p:I

    return p1
.end method

.method static synthetic D(Lgh/n;I)I
    .locals 0

    iput p1, p0, Lgh/n;->q:I

    return p1
.end method

.method static synthetic E(Lgh/n;Lgh/q;)Lgh/q;
    .locals 0

    iput-object p1, p0, Lgh/n;->r:Lgh/q;

    return-object p1
.end method

.method static synthetic F(Lgh/n;I)I
    .locals 0

    iput p1, p0, Lgh/n;->s:I

    return p1
.end method

.method static synthetic G(Lgh/n;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/n;->t:Ljava/util/List;

    return-object p0
.end method

.method static synthetic H(Lgh/n;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/n;->t:Ljava/util/List;

    return-object p1
.end method

.method static synthetic I(Lgh/n;Lgh/q;)Lgh/q;
    .locals 0

    iput-object p1, p0, Lgh/n;->u:Lgh/q;

    return-object p1
.end method

.method static synthetic J(Lgh/n;I)I
    .locals 0

    iput p1, p0, Lgh/n;->v:I

    return p1
.end method

.method static synthetic K(Lgh/n;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/n;->w:Ljava/util/List;

    return-object p0
.end method

.method static synthetic L(Lgh/n;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/n;->w:Ljava/util/List;

    return-object p1
.end method

.method static synthetic M(Lgh/n;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/n;->x:Ljava/util/List;

    return-object p0
.end method

.method static synthetic N(Lgh/n;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/n;->x:Ljava/util/List;

    return-object p1
.end method

.method static synthetic O(Lgh/n;Lgh/u;)Lgh/u;
    .locals 0

    iput-object p1, p0, Lgh/n;->z:Lgh/u;

    return-object p1
.end method

.method static synthetic P(Lgh/n;I)I
    .locals 0

    iput p1, p0, Lgh/n;->A:I

    return p1
.end method

.method static synthetic Q(Lgh/n;I)I
    .locals 0

    iput p1, p0, Lgh/n;->B:I

    return p1
.end method

.method static synthetic R(Lgh/n;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/n;->C:Ljava/util/List;

    return-object p0
.end method

.method static synthetic S(Lgh/n;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/n;->C:Ljava/util/List;

    return-object p1
.end method

.method static synthetic T(Lgh/n;I)I
    .locals 0

    iput p1, p0, Lgh/n;->n:I

    return p1
.end method

.method static synthetic U(Lgh/n;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/n;->m:Lnh/d;

    return-object p0
.end method

.method public static Z()Lgh/n;
    .locals 1

    sget-object v0, Lgh/n;->F:Lgh/n;

    return-object v0
.end method

.method private z0()V
    .locals 2

    .line 1
    const/16 v0, 0x206

    .line 2
    .line 3
    iput v0, p0, Lgh/n;->o:I

    .line 4
    .line 5
    const/16 v0, 0x806

    .line 6
    .line 7
    iput v0, p0, Lgh/n;->p:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lgh/n;->q:I

    .line 11
    .line 12
    invoke-static {}, Lgh/q;->Y()Lgh/q;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Lgh/n;->r:Lgh/q;

    .line 17
    .line 18
    iput v0, p0, Lgh/n;->s:I

    .line 19
    .line 20
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, p0, Lgh/n;->t:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {}, Lgh/q;->Y()Lgh/q;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, p0, Lgh/n;->u:Lgh/q;

    .line 31
    .line 32
    iput v0, p0, Lgh/n;->v:I

    .line 33
    .line 34
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, p0, Lgh/n;->w:Ljava/util/List;

    .line 39
    .line 40
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p0, Lgh/n;->x:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {}, Lgh/u;->J()Lgh/u;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput-object v1, p0, Lgh/n;->z:Lgh/u;

    .line 51
    .line 52
    iput v0, p0, Lgh/n;->A:I

    .line 53
    .line 54
    iput v0, p0, Lgh/n;->B:I

    .line 55
    .line 56
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lgh/n;->C:Ljava/util/List;

    .line 61
    .line 62
    return-void
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


# virtual methods
.method public C0()Lgh/n$b;
    .locals 1

    invoke-static {}, Lgh/n;->A0()Lgh/n$b;

    move-result-object v0

    return-object v0
.end method

.method public D0()Lgh/n$b;
    .locals 1

    invoke-static {p0}, Lgh/n;->B0(Lgh/n;)Lgh/n$b;

    move-result-object v0

    return-object v0
.end method

.method public V(I)Lgh/q;
    .locals 1

    iget-object v0, p0, Lgh/n;->w:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/q;

    return-object p1
.end method

.method public W()I
    .locals 1

    iget-object v0, p0, Lgh/n;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public X()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/n;->x:Ljava/util/List;

    return-object v0
.end method

.method public Y()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/q;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/n;->w:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic a()Lnh/q;
    .locals 1

    invoke-virtual {p0}, Lgh/n;->a0()Lgh/n;

    move-result-object v0

    return-object v0
.end method

.method public a0()Lgh/n;
    .locals 1

    sget-object v0, Lgh/n;->F:Lgh/n;

    return-object v0
.end method

.method public b0()I
    .locals 1

    iget v0, p0, Lgh/n;->o:I

    return v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/n;->D0()Lgh/n$b;

    move-result-object v0

    return-object v0
.end method

.method public c0()I
    .locals 1

    iget v0, p0, Lgh/n;->A:I

    return v0
.end method

.method public d()I
    .locals 8

    .line 1
    iget v0, p0, Lgh/n;->E:I

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
    iget v0, p0, Lgh/n;->n:I

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    and-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    iget v0, p0, Lgh/n;->p:I

    .line 16
    .line 17
    invoke-static {v3, v0}, Lnh/f;->o(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/2addr v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v0, v2

    .line 24
    :goto_0
    iget v4, p0, Lgh/n;->n:I

    .line 25
    .line 26
    const/4 v5, 0x4

    .line 27
    and-int/2addr v4, v5

    .line 28
    if-ne v4, v5, :cond_2

    .line 29
    .line 30
    iget v4, p0, Lgh/n;->q:I

    .line 31
    .line 32
    invoke-static {v1, v4}, Lnh/f;->o(II)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    add-int/2addr v0, v4

    .line 37
    :cond_2
    iget v4, p0, Lgh/n;->n:I

    .line 38
    .line 39
    const/16 v6, 0x8

    .line 40
    .line 41
    and-int/2addr v4, v6

    .line 42
    if-ne v4, v6, :cond_3

    .line 43
    .line 44
    const/4 v4, 0x3

    .line 45
    iget-object v7, p0, Lgh/n;->r:Lgh/q;

    .line 46
    .line 47
    invoke-static {v4, v7}, Lnh/f;->s(ILnh/q;)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    add-int/2addr v0, v4

    .line 52
    :cond_3
    move v4, v2

    .line 53
    :goto_1
    iget-object v7, p0, Lgh/n;->t:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-ge v4, v7, :cond_4

    .line 60
    .line 61
    iget-object v7, p0, Lgh/n;->t:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    check-cast v7, Lnh/q;

    .line 68
    .line 69
    invoke-static {v5, v7}, Lnh/f;->s(ILnh/q;)I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    add-int/2addr v0, v7

    .line 74
    add-int/lit8 v4, v4, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    iget v4, p0, Lgh/n;->n:I

    .line 78
    .line 79
    const/16 v5, 0x20

    .line 80
    .line 81
    and-int/2addr v4, v5

    .line 82
    if-ne v4, v5, :cond_5

    .line 83
    .line 84
    const/4 v4, 0x5

    .line 85
    iget-object v5, p0, Lgh/n;->u:Lgh/q;

    .line 86
    .line 87
    invoke-static {v4, v5}, Lnh/f;->s(ILnh/q;)I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    add-int/2addr v0, v4

    .line 92
    :cond_5
    iget v4, p0, Lgh/n;->n:I

    .line 93
    .line 94
    const/16 v5, 0x80

    .line 95
    .line 96
    and-int/2addr v4, v5

    .line 97
    if-ne v4, v5, :cond_6

    .line 98
    .line 99
    const/4 v4, 0x6

    .line 100
    iget-object v5, p0, Lgh/n;->z:Lgh/u;

    .line 101
    .line 102
    invoke-static {v4, v5}, Lnh/f;->s(ILnh/q;)I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    add-int/2addr v0, v4

    .line 107
    :cond_6
    iget v4, p0, Lgh/n;->n:I

    .line 108
    .line 109
    const/16 v5, 0x100

    .line 110
    .line 111
    and-int/2addr v4, v5

    .line 112
    if-ne v4, v5, :cond_7

    .line 113
    .line 114
    const/4 v4, 0x7

    .line 115
    iget v5, p0, Lgh/n;->A:I

    .line 116
    .line 117
    invoke-static {v4, v5}, Lnh/f;->o(II)I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    add-int/2addr v0, v4

    .line 122
    :cond_7
    iget v4, p0, Lgh/n;->n:I

    .line 123
    .line 124
    const/16 v5, 0x200

    .line 125
    .line 126
    and-int/2addr v4, v5

    .line 127
    if-ne v4, v5, :cond_8

    .line 128
    .line 129
    iget v4, p0, Lgh/n;->B:I

    .line 130
    .line 131
    invoke-static {v6, v4}, Lnh/f;->o(II)I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    add-int/2addr v0, v4

    .line 136
    :cond_8
    iget v4, p0, Lgh/n;->n:I

    .line 137
    .line 138
    const/16 v5, 0x10

    .line 139
    .line 140
    and-int/2addr v4, v5

    .line 141
    if-ne v4, v5, :cond_9

    .line 142
    .line 143
    const/16 v4, 0x9

    .line 144
    .line 145
    iget v5, p0, Lgh/n;->s:I

    .line 146
    .line 147
    invoke-static {v4, v5}, Lnh/f;->o(II)I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    add-int/2addr v0, v4

    .line 152
    :cond_9
    iget v4, p0, Lgh/n;->n:I

    .line 153
    .line 154
    const/16 v5, 0x40

    .line 155
    .line 156
    and-int/2addr v4, v5

    .line 157
    if-ne v4, v5, :cond_a

    .line 158
    .line 159
    const/16 v4, 0xa

    .line 160
    .line 161
    iget v5, p0, Lgh/n;->v:I

    .line 162
    .line 163
    invoke-static {v4, v5}, Lnh/f;->o(II)I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    add-int/2addr v0, v4

    .line 168
    :cond_a
    iget v4, p0, Lgh/n;->n:I

    .line 169
    .line 170
    and-int/2addr v4, v3

    .line 171
    if-ne v4, v3, :cond_b

    .line 172
    .line 173
    const/16 v3, 0xb

    .line 174
    .line 175
    iget v4, p0, Lgh/n;->o:I

    .line 176
    .line 177
    invoke-static {v3, v4}, Lnh/f;->o(II)I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    add-int/2addr v0, v3

    .line 182
    :cond_b
    move v3, v2

    .line 183
    :goto_2
    iget-object v4, p0, Lgh/n;->w:Ljava/util/List;

    .line 184
    .line 185
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    if-ge v3, v4, :cond_c

    .line 190
    .line 191
    iget-object v4, p0, Lgh/n;->w:Ljava/util/List;

    .line 192
    .line 193
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    check-cast v4, Lnh/q;

    .line 198
    .line 199
    const/16 v5, 0xc

    .line 200
    .line 201
    invoke-static {v5, v4}, Lnh/f;->s(ILnh/q;)I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    add-int/2addr v0, v4

    .line 206
    add-int/lit8 v3, v3, 0x1

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_c
    move v3, v2

    .line 210
    move v4, v3

    .line 211
    :goto_3
    iget-object v5, p0, Lgh/n;->x:Ljava/util/List;

    .line 212
    .line 213
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    if-ge v3, v5, :cond_d

    .line 218
    .line 219
    iget-object v5, p0, Lgh/n;->x:Ljava/util/List;

    .line 220
    .line 221
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    check-cast v5, Ljava/lang/Integer;

    .line 226
    .line 227
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    invoke-static {v5}, Lnh/f;->p(I)I

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    add-int/2addr v4, v5

    .line 236
    add-int/lit8 v3, v3, 0x1

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_d
    add-int/2addr v0, v4

    .line 240
    invoke-virtual {p0}, Lgh/n;->X()Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    if-nez v3, :cond_e

    .line 249
    .line 250
    add-int/lit8 v0, v0, 0x1

    .line 251
    .line 252
    invoke-static {v4}, Lnh/f;->p(I)I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    add-int/2addr v0, v3

    .line 257
    :cond_e
    iput v4, p0, Lgh/n;->y:I

    .line 258
    .line 259
    move v3, v2

    .line 260
    :goto_4
    iget-object v4, p0, Lgh/n;->C:Ljava/util/List;

    .line 261
    .line 262
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    if-ge v2, v4, :cond_f

    .line 267
    .line 268
    iget-object v4, p0, Lgh/n;->C:Ljava/util/List;

    .line 269
    .line 270
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    check-cast v4, Ljava/lang/Integer;

    .line 275
    .line 276
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    invoke-static {v4}, Lnh/f;->p(I)I

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    add-int/2addr v3, v4

    .line 285
    add-int/lit8 v2, v2, 0x1

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_f
    add-int/2addr v0, v3

    .line 289
    invoke-virtual {p0}, Lgh/n;->o0()Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    mul-int/2addr v2, v1

    .line 298
    add-int/2addr v0, v2

    .line 299
    invoke-virtual {p0}, Lnh/i$d;->u()I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    add-int/2addr v0, v1

    .line 304
    iget-object v1, p0, Lgh/n;->m:Lnh/d;

    .line 305
    .line 306
    invoke-virtual {v1}, Lnh/d;->size()I

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    add-int/2addr v0, v1

    .line 311
    iput v0, p0, Lgh/n;->E:I

    .line 312
    .line 313
    return v0
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

    iget v0, p0, Lgh/n;->q:I

    return v0
.end method

.method public e(Lnh/f;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lgh/n;->d()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lnh/i$d;->z()Lnh/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lgh/n;->n:I

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    and-int/2addr v1, v2

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget v1, p0, Lgh/n;->p:I

    .line 16
    .line 17
    invoke-virtual {p1, v3, v1}, Lnh/f;->a0(II)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget v1, p0, Lgh/n;->n:I

    .line 21
    .line 22
    const/4 v4, 0x4

    .line 23
    and-int/2addr v1, v4

    .line 24
    if-ne v1, v4, :cond_1

    .line 25
    .line 26
    iget v1, p0, Lgh/n;->q:I

    .line 27
    .line 28
    invoke-virtual {p1, v2, v1}, Lnh/f;->a0(II)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget v1, p0, Lgh/n;->n:I

    .line 32
    .line 33
    const/16 v2, 0x8

    .line 34
    .line 35
    and-int/2addr v1, v2

    .line 36
    if-ne v1, v2, :cond_2

    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    iget-object v5, p0, Lgh/n;->r:Lgh/q;

    .line 40
    .line 41
    invoke-virtual {p1, v1, v5}, Lnh/f;->d0(ILnh/q;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    const/4 v1, 0x0

    .line 45
    move v5, v1

    .line 46
    :goto_0
    iget-object v6, p0, Lgh/n;->t:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-ge v5, v6, :cond_3

    .line 53
    .line 54
    iget-object v6, p0, Lgh/n;->t:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, Lnh/q;

    .line 61
    .line 62
    invoke-virtual {p1, v4, v6}, Lnh/f;->d0(ILnh/q;)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v5, v5, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    iget v4, p0, Lgh/n;->n:I

    .line 69
    .line 70
    const/16 v5, 0x20

    .line 71
    .line 72
    and-int/2addr v4, v5

    .line 73
    if-ne v4, v5, :cond_4

    .line 74
    .line 75
    const/4 v4, 0x5

    .line 76
    iget-object v5, p0, Lgh/n;->u:Lgh/q;

    .line 77
    .line 78
    invoke-virtual {p1, v4, v5}, Lnh/f;->d0(ILnh/q;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    iget v4, p0, Lgh/n;->n:I

    .line 82
    .line 83
    const/16 v5, 0x80

    .line 84
    .line 85
    and-int/2addr v4, v5

    .line 86
    if-ne v4, v5, :cond_5

    .line 87
    .line 88
    const/4 v4, 0x6

    .line 89
    iget-object v5, p0, Lgh/n;->z:Lgh/u;

    .line 90
    .line 91
    invoke-virtual {p1, v4, v5}, Lnh/f;->d0(ILnh/q;)V

    .line 92
    .line 93
    .line 94
    :cond_5
    iget v4, p0, Lgh/n;->n:I

    .line 95
    .line 96
    const/16 v5, 0x100

    .line 97
    .line 98
    and-int/2addr v4, v5

    .line 99
    if-ne v4, v5, :cond_6

    .line 100
    .line 101
    const/4 v4, 0x7

    .line 102
    iget v5, p0, Lgh/n;->A:I

    .line 103
    .line 104
    invoke-virtual {p1, v4, v5}, Lnh/f;->a0(II)V

    .line 105
    .line 106
    .line 107
    :cond_6
    iget v4, p0, Lgh/n;->n:I

    .line 108
    .line 109
    const/16 v5, 0x200

    .line 110
    .line 111
    and-int/2addr v4, v5

    .line 112
    if-ne v4, v5, :cond_7

    .line 113
    .line 114
    iget v4, p0, Lgh/n;->B:I

    .line 115
    .line 116
    invoke-virtual {p1, v2, v4}, Lnh/f;->a0(II)V

    .line 117
    .line 118
    .line 119
    :cond_7
    iget v2, p0, Lgh/n;->n:I

    .line 120
    .line 121
    const/16 v4, 0x10

    .line 122
    .line 123
    and-int/2addr v2, v4

    .line 124
    if-ne v2, v4, :cond_8

    .line 125
    .line 126
    const/16 v2, 0x9

    .line 127
    .line 128
    iget v4, p0, Lgh/n;->s:I

    .line 129
    .line 130
    invoke-virtual {p1, v2, v4}, Lnh/f;->a0(II)V

    .line 131
    .line 132
    .line 133
    :cond_8
    iget v2, p0, Lgh/n;->n:I

    .line 134
    .line 135
    const/16 v4, 0x40

    .line 136
    .line 137
    and-int/2addr v2, v4

    .line 138
    if-ne v2, v4, :cond_9

    .line 139
    .line 140
    const/16 v2, 0xa

    .line 141
    .line 142
    iget v4, p0, Lgh/n;->v:I

    .line 143
    .line 144
    invoke-virtual {p1, v2, v4}, Lnh/f;->a0(II)V

    .line 145
    .line 146
    .line 147
    :cond_9
    iget v2, p0, Lgh/n;->n:I

    .line 148
    .line 149
    and-int/2addr v2, v3

    .line 150
    if-ne v2, v3, :cond_a

    .line 151
    .line 152
    const/16 v2, 0xb

    .line 153
    .line 154
    iget v3, p0, Lgh/n;->o:I

    .line 155
    .line 156
    invoke-virtual {p1, v2, v3}, Lnh/f;->a0(II)V

    .line 157
    .line 158
    .line 159
    :cond_a
    move v2, v1

    .line 160
    :goto_1
    iget-object v3, p0, Lgh/n;->w:Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-ge v2, v3, :cond_b

    .line 167
    .line 168
    iget-object v3, p0, Lgh/n;->w:Ljava/util/List;

    .line 169
    .line 170
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    check-cast v3, Lnh/q;

    .line 175
    .line 176
    const/16 v4, 0xc

    .line 177
    .line 178
    invoke-virtual {p1, v4, v3}, Lnh/f;->d0(ILnh/q;)V

    .line 179
    .line 180
    .line 181
    add-int/lit8 v2, v2, 0x1

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_b
    invoke-virtual {p0}, Lgh/n;->X()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-lez v2, :cond_c

    .line 193
    .line 194
    const/16 v2, 0x6a

    .line 195
    .line 196
    invoke-virtual {p1, v2}, Lnh/f;->o0(I)V

    .line 197
    .line 198
    .line 199
    iget v2, p0, Lgh/n;->y:I

    .line 200
    .line 201
    invoke-virtual {p1, v2}, Lnh/f;->o0(I)V

    .line 202
    .line 203
    .line 204
    :cond_c
    move v2, v1

    .line 205
    :goto_2
    iget-object v3, p0, Lgh/n;->x:Ljava/util/List;

    .line 206
    .line 207
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-ge v2, v3, :cond_d

    .line 212
    .line 213
    iget-object v3, p0, Lgh/n;->x:Ljava/util/List;

    .line 214
    .line 215
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    check-cast v3, Ljava/lang/Integer;

    .line 220
    .line 221
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    invoke-virtual {p1, v3}, Lnh/f;->b0(I)V

    .line 226
    .line 227
    .line 228
    add-int/lit8 v2, v2, 0x1

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_d
    :goto_3
    iget-object v2, p0, Lgh/n;->C:Ljava/util/List;

    .line 232
    .line 233
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-ge v1, v2, :cond_e

    .line 238
    .line 239
    iget-object v2, p0, Lgh/n;->C:Ljava/util/List;

    .line 240
    .line 241
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    check-cast v2, Ljava/lang/Integer;

    .line 246
    .line 247
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    const/16 v3, 0x1f

    .line 252
    .line 253
    invoke-virtual {p1, v3, v2}, Lnh/f;->a0(II)V

    .line 254
    .line 255
    .line 256
    add-int/lit8 v1, v1, 0x1

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_e
    const/16 v1, 0x4a38

    .line 260
    .line 261
    invoke-virtual {v0, v1, p1}, Lnh/i$d$a;->a(ILnh/f;)V

    .line 262
    .line 263
    .line 264
    iget-object v0, p0, Lgh/n;->m:Lnh/d;

    .line 265
    .line 266
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 267
    .line 268
    .line 269
    return-void
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

.method public e0()I
    .locals 1

    iget v0, p0, Lgh/n;->p:I

    return v0
.end method

.method public f0()Lgh/q;
    .locals 1

    iget-object v0, p0, Lgh/n;->u:Lgh/q;

    return-object v0
.end method

.method public bridge synthetic g()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/n;->C0()Lgh/n$b;

    move-result-object v0

    return-object v0
.end method

.method public g0()I
    .locals 1

    iget v0, p0, Lgh/n;->v:I

    return v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/n;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/n;->G:Lnh/s;

    return-object v0
.end method

.method public h0()Lgh/q;
    .locals 1

    iget-object v0, p0, Lgh/n;->r:Lgh/q;

    return-object v0
.end method

.method public i0()I
    .locals 1

    iget v0, p0, Lgh/n;->s:I

    return v0
.end method

.method public final j()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lgh/n;->D:B

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
    invoke-virtual {p0}, Lgh/n;->r0()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lgh/n;->D:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    invoke-virtual {p0}, Lgh/n;->v0()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0}, Lgh/n;->h0()Lgh/q;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lgh/q;->j()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    iput-byte v2, p0, Lgh/n;->D:B

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    move v0, v2

    .line 40
    :goto_0
    invoke-virtual {p0}, Lgh/n;->m0()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-ge v0, v3, :cond_5

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lgh/n;->l0(I)Lgh/s;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v3}, Lgh/s;->j()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_4

    .line 55
    .line 56
    iput-byte v2, p0, Lgh/n;->D:B

    .line 57
    .line 58
    return v2

    .line 59
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_5
    invoke-virtual {p0}, Lgh/n;->t0()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    invoke-virtual {p0}, Lgh/n;->f0()Lgh/q;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lgh/q;->j()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_6

    .line 77
    .line 78
    iput-byte v2, p0, Lgh/n;->D:B

    .line 79
    .line 80
    return v2

    .line 81
    :cond_6
    move v0, v2

    .line 82
    :goto_1
    invoke-virtual {p0}, Lgh/n;->W()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-ge v0, v3, :cond_8

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Lgh/n;->V(I)Lgh/q;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Lgh/q;->j()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-nez v3, :cond_7

    .line 97
    .line 98
    iput-byte v2, p0, Lgh/n;->D:B

    .line 99
    .line 100
    return v2

    .line 101
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_8
    invoke-virtual {p0}, Lgh/n;->y0()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_9

    .line 109
    .line 110
    invoke-virtual {p0}, Lgh/n;->k0()Lgh/u;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Lgh/u;->j()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_9

    .line 119
    .line 120
    iput-byte v2, p0, Lgh/n;->D:B

    .line 121
    .line 122
    return v2

    .line 123
    :cond_9
    invoke-virtual {p0}, Lnh/i$d;->t()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_a

    .line 128
    .line 129
    iput-byte v2, p0, Lgh/n;->D:B

    .line 130
    .line 131
    return v2

    .line 132
    :cond_a
    iput-byte v1, p0, Lgh/n;->D:B

    .line 133
    .line 134
    return v1
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

    iget v0, p0, Lgh/n;->B:I

    return v0
.end method

.method public k0()Lgh/u;
    .locals 1

    iget-object v0, p0, Lgh/n;->z:Lgh/u;

    return-object v0
.end method

.method public l0(I)Lgh/s;
    .locals 1

    iget-object v0, p0, Lgh/n;->t:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/s;

    return-object p1
.end method

.method public m0()I
    .locals 1

    iget-object v0, p0, Lgh/n;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public n0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/n;->t:Ljava/util/List;

    return-object v0
.end method

.method public o0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/n;->C:Ljava/util/List;

    return-object v0
.end method

.method public p0()Z
    .locals 2

    iget v0, p0, Lgh/n;->n:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public q0()Z
    .locals 2

    iget v0, p0, Lgh/n;->n:I

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

.method public r0()Z
    .locals 2

    iget v0, p0, Lgh/n;->n:I

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

.method public s0()Z
    .locals 2

    iget v0, p0, Lgh/n;->n:I

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

.method public t0()Z
    .locals 2

    iget v0, p0, Lgh/n;->n:I

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

.method public u0()Z
    .locals 2

    iget v0, p0, Lgh/n;->n:I

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

.method public v0()Z
    .locals 2

    iget v0, p0, Lgh/n;->n:I

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

.method public w0()Z
    .locals 2

    iget v0, p0, Lgh/n;->n:I

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

.method public x0()Z
    .locals 2

    iget v0, p0, Lgh/n;->n:I

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

.method public y0()Z
    .locals 2

    iget v0, p0, Lgh/n;->n:I

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
