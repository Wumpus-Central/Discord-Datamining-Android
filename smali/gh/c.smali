.class public final Lgh/c;
.super Lnh/i$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/c$b;,
        Lgh/c$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/i$d<",
        "Lgh/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final U:Lgh/c;

.field public static V:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/d;",
            ">;"
        }
    .end annotation
.end field

.field private B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/i;",
            ">;"
        }
    .end annotation
.end field

.field private C:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/n;",
            ">;"
        }
    .end annotation
.end field

.field private D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/r;",
            ">;"
        }
    .end annotation
.end field

.field private E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/g;",
            ">;"
        }
    .end annotation
.end field

.field private F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private G:I

.field private H:I

.field private I:Lgh/q;

.field private J:I

.field private K:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private L:I

.field private M:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/q;",
            ">;"
        }
    .end annotation
.end field

.field private N:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private O:I

.field private P:Lgh/t;

.field private Q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private R:Lgh/w;

.field private S:B

.field private T:I

.field private final m:Lnh/d;

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/s;",
            ">;"
        }
    .end annotation
.end field

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

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private w:I

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/q;",
            ">;"
        }
    .end annotation
.end field

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/c;->V:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/c;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/c;->U:Lgh/c;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/c;->t1()V

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
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    .line 23
    invoke-direct/range {p0 .. p0}, Lnh/i$d;-><init>()V

    const/4 v4, -0x1

    .line 24
    iput v4, v1, Lgh/c;->u:I

    .line 25
    iput v4, v1, Lgh/c;->w:I

    .line 26
    iput v4, v1, Lgh/c;->z:I

    .line 27
    iput v4, v1, Lgh/c;->G:I

    .line 28
    iput v4, v1, Lgh/c;->L:I

    .line 29
    iput v4, v1, Lgh/c;->O:I

    .line 30
    iput-byte v4, v1, Lgh/c;->S:B

    .line 31
    iput v4, v1, Lgh/c;->T:I

    .line 32
    invoke-direct/range {p0 .. p0}, Lgh/c;->t1()V

    .line 33
    invoke-static {}, Lnh/d;->w()Lnh/d$b;

    move-result-object v4

    const/4 v5, 0x1

    .line 34
    invoke-static {v4, v5}, Lnh/f;->J(Ljava/io/OutputStream;I)Lnh/f;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    const/high16 v9, 0x80000

    const/high16 v5, 0x400000

    const/high16 v14, 0x100000

    const/high16 v13, 0x40000

    const/16 v11, 0x80

    const/16 v10, 0x40

    if-nez v7, :cond_35

    .line 35
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lnh/e;->K()I

    move-result v15

    const/16 v16, 0x0

    sparse-switch v15, :sswitch_data_0

    const/4 v12, 0x1

    .line 36
    invoke-virtual {v1, v2, v6, v3, v15}, Lnh/i$d;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v5

    goto/16 :goto_a

    .line 37
    :sswitch_0
    iget v15, v1, Lgh/c;->n:I

    and-int/2addr v15, v11

    if-ne v15, v11, :cond_0

    .line 38
    iget-object v15, v1, Lgh/c;->R:Lgh/w;

    invoke-virtual {v15}, Lgh/w;->C()Lgh/w$b;

    move-result-object v16

    :cond_0
    move-object/from16 v15, v16

    .line 39
    sget-object v12, Lgh/w;->q:Lnh/s;

    invoke-virtual {v2, v12, v3}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v12

    check-cast v12, Lgh/w;

    iput-object v12, v1, Lgh/c;->R:Lgh/w;

    if-eqz v15, :cond_1

    .line 40
    invoke-virtual {v15, v12}, Lgh/w$b;->y(Lgh/w;)Lgh/w$b;

    .line 41
    invoke-virtual {v15}, Lgh/w$b;->t()Lgh/w;

    move-result-object v12

    iput-object v12, v1, Lgh/c;->R:Lgh/w;

    .line 42
    :cond_1
    iget v12, v1, Lgh/c;->n:I

    or-int/2addr v12, v11

    iput v12, v1, Lgh/c;->n:I

    goto/16 :goto_8

    .line 43
    :sswitch_1
    invoke-virtual/range {p1 .. p1}, Lnh/e;->A()I

    move-result v12

    .line 44
    invoke-virtual {v2, v12}, Lnh/e;->j(I)I

    move-result v12

    and-int v15, v8, v5

    if-eq v15, v5, :cond_2

    .line 45
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v15

    if-lez v15, :cond_2

    .line 46
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    iput-object v15, v1, Lgh/c;->Q:Ljava/util/List;

    or-int/2addr v8, v5

    .line 47
    :cond_2
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v15

    if-lez v15, :cond_3

    .line 48
    iget-object v15, v1, Lgh/c;->Q:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v15, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 v11, 0x80

    goto :goto_1

    .line 49
    :cond_3
    invoke-virtual {v2, v12}, Lnh/e;->i(I)V

    goto/16 :goto_8

    :sswitch_2
    and-int v11, v8, v5

    if-eq v11, v5, :cond_4

    .line 50
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->Q:Ljava/util/List;

    or-int/2addr v8, v5

    .line 51
    :cond_4
    iget-object v11, v1, Lgh/c;->Q:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    .line 52
    :sswitch_3
    iget v11, v1, Lgh/c;->n:I

    and-int/2addr v11, v10

    if-ne v11, v10, :cond_5

    .line 53
    iget-object v11, v1, Lgh/c;->P:Lgh/t;

    invoke-virtual {v11}, Lgh/t;->H()Lgh/t$b;

    move-result-object v16

    :cond_5
    move-object/from16 v11, v16

    .line 54
    sget-object v12, Lgh/t;->s:Lnh/s;

    invoke-virtual {v2, v12, v3}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v12

    check-cast v12, Lgh/t;

    iput-object v12, v1, Lgh/c;->P:Lgh/t;

    if-eqz v11, :cond_6

    .line 55
    invoke-virtual {v11, v12}, Lgh/t$b;->y(Lgh/t;)Lgh/t$b;

    .line 56
    invoke-virtual {v11}, Lgh/t$b;->t()Lgh/t;

    move-result-object v11

    iput-object v11, v1, Lgh/c;->P:Lgh/t;

    .line 57
    :cond_6
    iget v11, v1, Lgh/c;->n:I

    or-int/2addr v11, v10

    iput v11, v1, Lgh/c;->n:I

    goto/16 :goto_8

    .line 58
    :sswitch_4
    invoke-virtual/range {p1 .. p1}, Lnh/e;->A()I

    move-result v11

    .line 59
    invoke-virtual {v2, v11}, Lnh/e;->j(I)I

    move-result v11

    and-int v12, v8, v14

    if-eq v12, v14, :cond_7

    .line 60
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v12

    if-lez v12, :cond_7

    .line 61
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lgh/c;->N:Ljava/util/List;

    or-int/2addr v8, v14

    .line 62
    :cond_7
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v12

    if-lez v12, :cond_8

    .line 63
    iget-object v12, v1, Lgh/c;->N:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v12, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 64
    :cond_8
    invoke-virtual {v2, v11}, Lnh/e;->i(I)V

    goto/16 :goto_8

    :sswitch_5
    and-int v11, v8, v14

    if-eq v11, v14, :cond_9

    .line 65
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->N:Ljava/util/List;

    or-int/2addr v8, v14

    .line 66
    :cond_9
    iget-object v11, v1, Lgh/c;->N:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_6
    and-int v11, v8, v9

    if-eq v11, v9, :cond_a

    .line 67
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->M:Ljava/util/List;

    or-int/2addr v8, v9

    .line 68
    :cond_a
    iget-object v11, v1, Lgh/c;->M:Ljava/util/List;

    sget-object v12, Lgh/q;->F:Lnh/s;

    invoke-virtual {v2, v12, v3}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    .line 69
    :sswitch_7
    invoke-virtual/range {p1 .. p1}, Lnh/e;->A()I

    move-result v11

    .line 70
    invoke-virtual {v2, v11}, Lnh/e;->j(I)I

    move-result v11

    and-int v12, v8, v13

    if-eq v12, v13, :cond_b

    .line 71
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v12

    if-lez v12, :cond_b

    .line 72
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lgh/c;->K:Ljava/util/List;

    or-int/2addr v8, v13

    .line 73
    :cond_b
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v12

    if-lez v12, :cond_c

    .line 74
    iget-object v12, v1, Lgh/c;->K:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v12, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 75
    :cond_c
    invoke-virtual {v2, v11}, Lnh/e;->i(I)V

    goto/16 :goto_8

    :sswitch_8
    and-int v11, v8, v13

    if-eq v11, v13, :cond_d

    .line 76
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->K:Ljava/util/List;

    or-int/2addr v8, v13

    .line 77
    :cond_d
    iget-object v11, v1, Lgh/c;->K:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    .line 78
    :sswitch_9
    invoke-virtual/range {p1 .. p1}, Lnh/e;->A()I

    move-result v11

    .line 79
    invoke-virtual {v2, v11}, Lnh/e;->j(I)I

    move-result v11

    and-int/lit16 v12, v8, 0x100

    const/16 v15, 0x100

    if-eq v12, v15, :cond_e

    .line 80
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v12

    if-lez v12, :cond_e

    .line 81
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lgh/c;->y:Ljava/util/List;

    or-int/lit16 v8, v8, 0x100

    .line 82
    :cond_e
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v12

    if-lez v12, :cond_f

    .line 83
    iget-object v12, v1, Lgh/c;->y:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v12, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 84
    :cond_f
    invoke-virtual {v2, v11}, Lnh/e;->i(I)V

    goto/16 :goto_8

    :sswitch_a
    and-int/lit16 v11, v8, 0x100

    const/16 v12, 0x100

    if-eq v11, v12, :cond_10

    .line 85
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->y:Ljava/util/List;

    or-int/lit16 v8, v8, 0x100

    .line 86
    :cond_10
    iget-object v11, v1, Lgh/c;->y:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_b
    and-int/lit16 v11, v8, 0x80

    const/16 v12, 0x80

    if-eq v11, v12, :cond_11

    .line 87
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->x:Ljava/util/List;

    or-int/lit16 v8, v8, 0x80

    .line 88
    :cond_11
    iget-object v11, v1, Lgh/c;->x:Ljava/util/List;

    sget-object v12, Lgh/q;->F:Lnh/s;

    invoke-virtual {v2, v12, v3}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    .line 89
    :sswitch_c
    iget v11, v1, Lgh/c;->n:I

    const/16 v12, 0x20

    or-int/2addr v11, v12

    iput v11, v1, Lgh/c;->n:I

    .line 90
    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v11

    iput v11, v1, Lgh/c;->J:I

    goto/16 :goto_8

    .line 91
    :sswitch_d
    iget v11, v1, Lgh/c;->n:I

    const/16 v12, 0x10

    and-int/2addr v11, v12

    if-ne v11, v12, :cond_12

    .line 92
    iget-object v11, v1, Lgh/c;->I:Lgh/q;

    invoke-virtual {v11}, Lgh/q;->B0()Lgh/q$c;

    move-result-object v16

    :cond_12
    move-object/from16 v11, v16

    .line 93
    sget-object v12, Lgh/q;->F:Lnh/s;

    invoke-virtual {v2, v12, v3}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v12

    check-cast v12, Lgh/q;

    iput-object v12, v1, Lgh/c;->I:Lgh/q;

    if-eqz v11, :cond_13

    .line 94
    invoke-virtual {v11, v12}, Lgh/q$c;->E(Lgh/q;)Lgh/q$c;

    .line 95
    invoke-virtual {v11}, Lgh/q$c;->x()Lgh/q;

    move-result-object v11

    iput-object v11, v1, Lgh/c;->I:Lgh/q;

    .line 96
    :cond_13
    iget v11, v1, Lgh/c;->n:I

    const/16 v12, 0x10

    or-int/2addr v11, v12

    iput v11, v1, Lgh/c;->n:I

    goto/16 :goto_8

    .line 97
    :sswitch_e
    iget v11, v1, Lgh/c;->n:I

    const/16 v12, 0x8

    or-int/2addr v11, v12

    iput v11, v1, Lgh/c;->n:I

    .line 98
    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v11

    iput v11, v1, Lgh/c;->H:I

    goto/16 :goto_8

    .line 99
    :sswitch_f
    invoke-virtual/range {p1 .. p1}, Lnh/e;->A()I

    move-result v11

    .line 100
    invoke-virtual {v2, v11}, Lnh/e;->j(I)I

    move-result v11

    and-int/lit16 v12, v8, 0x4000

    const/16 v15, 0x4000

    if-eq v12, v15, :cond_14

    .line 101
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v12

    if-lez v12, :cond_14

    .line 102
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lgh/c;->F:Ljava/util/List;

    or-int/lit16 v8, v8, 0x4000

    .line 103
    :cond_14
    :goto_5
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v12

    if-lez v12, :cond_15

    .line 104
    iget-object v12, v1, Lgh/c;->F:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v12, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 105
    :cond_15
    invoke-virtual {v2, v11}, Lnh/e;->i(I)V

    goto/16 :goto_8

    :sswitch_10
    and-int/lit16 v11, v8, 0x4000

    const/16 v12, 0x4000

    if-eq v11, v12, :cond_16

    .line 106
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->F:Ljava/util/List;

    or-int/lit16 v8, v8, 0x4000

    .line 107
    :cond_16
    iget-object v11, v1, Lgh/c;->F:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_11
    and-int/lit16 v11, v8, 0x2000

    const/16 v12, 0x2000

    if-eq v11, v12, :cond_17

    .line 108
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->E:Ljava/util/List;

    or-int/lit16 v8, v8, 0x2000

    .line 109
    :cond_17
    iget-object v11, v1, Lgh/c;->E:Ljava/util/List;

    sget-object v12, Lgh/g;->s:Lnh/s;

    invoke-virtual {v2, v12, v3}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_12
    and-int/lit16 v11, v8, 0x1000

    const/16 v12, 0x1000

    if-eq v11, v12, :cond_18

    .line 110
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->D:Ljava/util/List;

    or-int/lit16 v8, v8, 0x1000

    .line 111
    :cond_18
    iget-object v11, v1, Lgh/c;->D:Ljava/util/List;

    sget-object v12, Lgh/r;->A:Lnh/s;

    invoke-virtual {v2, v12, v3}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_13
    and-int/lit16 v11, v8, 0x800

    const/16 v12, 0x800

    if-eq v11, v12, :cond_19

    .line 112
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->C:Ljava/util/List;

    or-int/lit16 v8, v8, 0x800

    .line 113
    :cond_19
    iget-object v11, v1, Lgh/c;->C:Ljava/util/List;

    sget-object v12, Lgh/n;->G:Lnh/s;

    invoke-virtual {v2, v12, v3}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_14
    and-int/lit16 v11, v8, 0x400

    const/16 v12, 0x400

    if-eq v11, v12, :cond_1a

    .line 114
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->B:Ljava/util/List;

    or-int/lit16 v8, v8, 0x400

    .line 115
    :cond_1a
    iget-object v11, v1, Lgh/c;->B:Ljava/util/List;

    sget-object v12, Lgh/i;->G:Lnh/s;

    invoke-virtual {v2, v12, v3}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_15
    and-int/lit16 v11, v8, 0x200

    const/16 v12, 0x200

    if-eq v11, v12, :cond_1b

    .line 116
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->A:Ljava/util/List;

    or-int/lit16 v8, v8, 0x200

    .line 117
    :cond_1b
    iget-object v11, v1, Lgh/c;->A:Ljava/util/List;

    sget-object v12, Lgh/d;->u:Lnh/s;

    invoke-virtual {v2, v12, v3}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    .line 118
    :sswitch_16
    invoke-virtual/range {p1 .. p1}, Lnh/e;->A()I

    move-result v11

    .line 119
    invoke-virtual {v2, v11}, Lnh/e;->j(I)I

    move-result v11

    and-int/lit8 v12, v8, 0x40

    if-eq v12, v10, :cond_1c

    .line 120
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v12

    if-lez v12, :cond_1c

    .line 121
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lgh/c;->v:Ljava/util/List;

    or-int/lit8 v8, v8, 0x40

    .line 122
    :cond_1c
    :goto_6
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v12

    if-lez v12, :cond_1d

    .line 123
    iget-object v12, v1, Lgh/c;->v:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v12, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 124
    :cond_1d
    invoke-virtual {v2, v11}, Lnh/e;->i(I)V

    goto/16 :goto_8

    :sswitch_17
    and-int/lit8 v11, v8, 0x40

    if-eq v11, v10, :cond_1e

    .line 125
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->v:Ljava/util/List;

    or-int/lit8 v8, v8, 0x40

    .line 126
    :cond_1e
    iget-object v11, v1, Lgh/c;->v:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_18
    and-int/lit8 v11, v8, 0x10

    const/16 v12, 0x10

    if-eq v11, v12, :cond_1f

    .line 127
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->s:Ljava/util/List;

    or-int/lit8 v8, v8, 0x10

    .line 128
    :cond_1f
    iget-object v11, v1, Lgh/c;->s:Ljava/util/List;

    sget-object v12, Lgh/q;->F:Lnh/s;

    invoke-virtual {v2, v12, v3}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_19
    and-int/lit8 v11, v8, 0x8

    const/16 v12, 0x8

    if-eq v11, v12, :cond_20

    .line 129
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->r:Ljava/util/List;

    or-int/lit8 v8, v8, 0x8

    .line 130
    :cond_20
    iget-object v11, v1, Lgh/c;->r:Ljava/util/List;

    sget-object v12, Lgh/s;->y:Lnh/s;

    invoke-virtual {v2, v12, v3}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 131
    :sswitch_1a
    iget v11, v1, Lgh/c;->n:I

    or-int/lit8 v11, v11, 0x4

    iput v11, v1, Lgh/c;->n:I

    .line 132
    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v11

    iput v11, v1, Lgh/c;->q:I

    goto :goto_8

    .line 133
    :sswitch_1b
    iget v11, v1, Lgh/c;->n:I

    or-int/lit8 v11, v11, 0x2

    iput v11, v1, Lgh/c;->n:I

    .line 134
    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v11

    iput v11, v1, Lgh/c;->p:I

    goto :goto_8

    .line 135
    :sswitch_1c
    invoke-virtual/range {p1 .. p1}, Lnh/e;->A()I

    move-result v11

    .line 136
    invoke-virtual {v2, v11}, Lnh/e;->j(I)I

    move-result v11

    and-int/lit8 v12, v8, 0x20

    const/16 v15, 0x20

    if-eq v12, v15, :cond_21

    .line 137
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v12

    if-lez v12, :cond_21

    .line 138
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lgh/c;->t:Ljava/util/List;

    or-int/lit8 v8, v8, 0x20

    .line 139
    :cond_21
    :goto_7
    invoke-virtual/range {p1 .. p1}, Lnh/e;->e()I

    move-result v12

    if-lez v12, :cond_22

    .line 140
    iget-object v12, v1, Lgh/c;->t:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v12, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 141
    :cond_22
    invoke-virtual {v2, v11}, Lnh/e;->i(I)V

    goto :goto_8

    :sswitch_1d
    and-int/lit8 v11, v8, 0x20

    const/16 v12, 0x20

    if-eq v11, v12, :cond_23

    .line 142
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lgh/c;->t:Ljava/util/List;

    or-int/lit8 v8, v8, 0x20

    .line 143
    :cond_23
    iget-object v11, v1, Lgh/c;->t:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_8
    const/4 v12, 0x1

    goto :goto_b

    .line 144
    :sswitch_1e
    iget v11, v1, Lgh/c;->n:I

    const/4 v12, 0x1

    or-int/2addr v11, v12

    iput v11, v1, Lgh/c;->n:I

    .line 145
    invoke-virtual/range {p1 .. p1}, Lnh/e;->s()I

    move-result v11

    iput v11, v1, Lgh/c;->o:I
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_b

    :sswitch_1f
    const/4 v12, 0x1

    :goto_9
    move v7, v12

    goto :goto_b

    :goto_a
    if-nez v5, :cond_24

    goto :goto_9

    :cond_24
    :goto_b
    move v5, v12

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_c

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 146
    :try_start_1
    new-instance v3, Lnh/k;

    .line 147
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object v2

    throw v2

    :catch_1
    move-exception v0

    move-object v2, v0

    .line 148
    invoke-virtual {v2, v1}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object v2

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_c
    and-int/lit8 v3, v8, 0x20

    const/16 v7, 0x20

    if-ne v3, v7, :cond_25

    .line 149
    iget-object v3, v1, Lgh/c;->t:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->t:Ljava/util/List;

    :cond_25
    and-int/lit8 v3, v8, 0x8

    const/16 v7, 0x8

    if-ne v3, v7, :cond_26

    .line 150
    iget-object v3, v1, Lgh/c;->r:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->r:Ljava/util/List;

    :cond_26
    and-int/lit8 v3, v8, 0x10

    const/16 v7, 0x10

    if-ne v3, v7, :cond_27

    .line 151
    iget-object v3, v1, Lgh/c;->s:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->s:Ljava/util/List;

    :cond_27
    and-int/lit8 v3, v8, 0x40

    if-ne v3, v10, :cond_28

    .line 152
    iget-object v3, v1, Lgh/c;->v:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->v:Ljava/util/List;

    :cond_28
    and-int/lit16 v3, v8, 0x200

    const/16 v7, 0x200

    if-ne v3, v7, :cond_29

    .line 153
    iget-object v3, v1, Lgh/c;->A:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->A:Ljava/util/List;

    :cond_29
    and-int/lit16 v3, v8, 0x400

    const/16 v7, 0x400

    if-ne v3, v7, :cond_2a

    .line 154
    iget-object v3, v1, Lgh/c;->B:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->B:Ljava/util/List;

    :cond_2a
    and-int/lit16 v3, v8, 0x800

    const/16 v7, 0x800

    if-ne v3, v7, :cond_2b

    .line 155
    iget-object v3, v1, Lgh/c;->C:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->C:Ljava/util/List;

    :cond_2b
    and-int/lit16 v3, v8, 0x1000

    const/16 v7, 0x1000

    if-ne v3, v7, :cond_2c

    .line 156
    iget-object v3, v1, Lgh/c;->D:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->D:Ljava/util/List;

    :cond_2c
    and-int/lit16 v3, v8, 0x2000

    const/16 v7, 0x2000

    if-ne v3, v7, :cond_2d

    .line 157
    iget-object v3, v1, Lgh/c;->E:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->E:Ljava/util/List;

    :cond_2d
    and-int/lit16 v3, v8, 0x4000

    const/16 v7, 0x4000

    if-ne v3, v7, :cond_2e

    .line 158
    iget-object v3, v1, Lgh/c;->F:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->F:Ljava/util/List;

    :cond_2e
    and-int/lit16 v3, v8, 0x80

    const/16 v7, 0x80

    if-ne v3, v7, :cond_2f

    .line 159
    iget-object v3, v1, Lgh/c;->x:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->x:Ljava/util/List;

    :cond_2f
    and-int/lit16 v3, v8, 0x100

    const/16 v7, 0x100

    if-ne v3, v7, :cond_30

    .line 160
    iget-object v3, v1, Lgh/c;->y:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->y:Ljava/util/List;

    :cond_30
    and-int v3, v8, v13

    if-ne v3, v13, :cond_31

    .line 161
    iget-object v3, v1, Lgh/c;->K:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->K:Ljava/util/List;

    :cond_31
    and-int v3, v8, v9

    if-ne v3, v9, :cond_32

    .line 162
    iget-object v3, v1, Lgh/c;->M:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->M:Ljava/util/List;

    :cond_32
    and-int v3, v8, v14

    if-ne v3, v14, :cond_33

    .line 163
    iget-object v3, v1, Lgh/c;->N:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->N:Ljava/util/List;

    :cond_33
    and-int v3, v8, v5

    if-ne v3, v5, :cond_34

    .line 164
    iget-object v3, v1, Lgh/c;->Q:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->Q:Ljava/util/List;

    .line 165
    :cond_34
    :try_start_2
    invoke-virtual {v6}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 166
    :catch_2
    invoke-virtual {v4}, Lnh/d$b;->k()Lnh/d;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->m:Lnh/d;

    goto :goto_d

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v4}, Lnh/d$b;->k()Lnh/d;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->m:Lnh/d;

    .line 167
    throw v2

    .line 168
    :goto_d
    invoke-virtual/range {p0 .. p0}, Lnh/i$d;->n()V

    .line 169
    throw v2

    :cond_35
    and-int/lit8 v2, v8, 0x20

    const/16 v3, 0x20

    if-ne v2, v3, :cond_36

    .line 170
    iget-object v2, v1, Lgh/c;->t:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->t:Ljava/util/List;

    :cond_36
    and-int/lit8 v2, v8, 0x8

    const/16 v3, 0x8

    if-ne v2, v3, :cond_37

    .line 171
    iget-object v2, v1, Lgh/c;->r:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->r:Ljava/util/List;

    :cond_37
    and-int/lit8 v2, v8, 0x10

    const/16 v3, 0x10

    if-ne v2, v3, :cond_38

    .line 172
    iget-object v2, v1, Lgh/c;->s:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->s:Ljava/util/List;

    :cond_38
    and-int/lit8 v2, v8, 0x40

    if-ne v2, v10, :cond_39

    .line 173
    iget-object v2, v1, Lgh/c;->v:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->v:Ljava/util/List;

    :cond_39
    and-int/lit16 v2, v8, 0x200

    const/16 v3, 0x200

    if-ne v2, v3, :cond_3a

    .line 174
    iget-object v2, v1, Lgh/c;->A:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->A:Ljava/util/List;

    :cond_3a
    and-int/lit16 v2, v8, 0x400

    const/16 v3, 0x400

    if-ne v2, v3, :cond_3b

    .line 175
    iget-object v2, v1, Lgh/c;->B:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->B:Ljava/util/List;

    :cond_3b
    and-int/lit16 v2, v8, 0x800

    const/16 v3, 0x800

    if-ne v2, v3, :cond_3c

    .line 176
    iget-object v2, v1, Lgh/c;->C:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->C:Ljava/util/List;

    :cond_3c
    and-int/lit16 v2, v8, 0x1000

    const/16 v3, 0x1000

    if-ne v2, v3, :cond_3d

    .line 177
    iget-object v2, v1, Lgh/c;->D:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->D:Ljava/util/List;

    :cond_3d
    and-int/lit16 v2, v8, 0x2000

    const/16 v3, 0x2000

    if-ne v2, v3, :cond_3e

    .line 178
    iget-object v2, v1, Lgh/c;->E:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->E:Ljava/util/List;

    :cond_3e
    and-int/lit16 v2, v8, 0x4000

    const/16 v3, 0x4000

    if-ne v2, v3, :cond_3f

    .line 179
    iget-object v2, v1, Lgh/c;->F:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->F:Ljava/util/List;

    :cond_3f
    and-int/lit16 v2, v8, 0x80

    const/16 v3, 0x80

    if-ne v2, v3, :cond_40

    .line 180
    iget-object v2, v1, Lgh/c;->x:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->x:Ljava/util/List;

    :cond_40
    and-int/lit16 v2, v8, 0x100

    const/16 v3, 0x100

    if-ne v2, v3, :cond_41

    .line 181
    iget-object v2, v1, Lgh/c;->y:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->y:Ljava/util/List;

    :cond_41
    and-int v2, v8, v13

    if-ne v2, v13, :cond_42

    .line 182
    iget-object v2, v1, Lgh/c;->K:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->K:Ljava/util/List;

    :cond_42
    and-int v2, v8, v9

    if-ne v2, v9, :cond_43

    .line 183
    iget-object v2, v1, Lgh/c;->M:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->M:Ljava/util/List;

    :cond_43
    and-int v2, v8, v14

    if-ne v2, v14, :cond_44

    .line 184
    iget-object v2, v1, Lgh/c;->N:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->N:Ljava/util/List;

    :cond_44
    and-int v2, v8, v5

    if-ne v2, v5, :cond_45

    .line 185
    iget-object v2, v1, Lgh/c;->Q:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->Q:Ljava/util/List;

    .line 186
    :cond_45
    :try_start_3
    invoke-virtual {v6}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 187
    :catch_3
    invoke-virtual {v4}, Lnh/d$b;->k()Lnh/d;

    move-result-object v2

    iput-object v2, v1, Lgh/c;->m:Lnh/d;

    goto :goto_e

    :catchall_2
    move-exception v0

    move-object v2, v0

    invoke-virtual {v4}, Lnh/d$b;->k()Lnh/d;

    move-result-object v3

    iput-object v3, v1, Lgh/c;->m:Lnh/d;

    .line 188
    throw v2

    .line 189
    :goto_e
    invoke-virtual/range {p0 .. p0}, Lnh/i$d;->n()V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1f
        0x8 -> :sswitch_1e
        0x10 -> :sswitch_1d
        0x12 -> :sswitch_1c
        0x18 -> :sswitch_1b
        0x20 -> :sswitch_1a
        0x2a -> :sswitch_19
        0x32 -> :sswitch_18
        0x38 -> :sswitch_17
        0x3a -> :sswitch_16
        0x42 -> :sswitch_15
        0x4a -> :sswitch_14
        0x52 -> :sswitch_13
        0x5a -> :sswitch_12
        0x6a -> :sswitch_11
        0x80 -> :sswitch_10
        0x82 -> :sswitch_f
        0x88 -> :sswitch_e
        0x92 -> :sswitch_d
        0x98 -> :sswitch_c
        0xa2 -> :sswitch_b
        0xa8 -> :sswitch_a
        0xaa -> :sswitch_9
        0xb0 -> :sswitch_8
        0xb2 -> :sswitch_7
        0xba -> :sswitch_6
        0xc0 -> :sswitch_5
        0xc2 -> :sswitch_4
        0xf2 -> :sswitch_3
        0xf8 -> :sswitch_2
        0xfa -> :sswitch_1
        0x102 -> :sswitch_0
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/c;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/i$c<",
            "Lgh/c;",
            "*>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Lnh/i$d;-><init>(Lnh/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lgh/c;->u:I

    .line 5
    iput v0, p0, Lgh/c;->w:I

    .line 6
    iput v0, p0, Lgh/c;->z:I

    .line 7
    iput v0, p0, Lgh/c;->G:I

    .line 8
    iput v0, p0, Lgh/c;->L:I

    .line 9
    iput v0, p0, Lgh/c;->O:I

    .line 10
    iput-byte v0, p0, Lgh/c;->S:B

    .line 11
    iput v0, p0, Lgh/c;->T:I

    .line 12
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/c;->m:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$c;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/c;-><init>(Lnh/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 13
    invoke-direct {p0}, Lnh/i$d;-><init>()V

    const/4 p1, -0x1

    .line 14
    iput p1, p0, Lgh/c;->u:I

    .line 15
    iput p1, p0, Lgh/c;->w:I

    .line 16
    iput p1, p0, Lgh/c;->z:I

    .line 17
    iput p1, p0, Lgh/c;->G:I

    .line 18
    iput p1, p0, Lgh/c;->L:I

    .line 19
    iput p1, p0, Lgh/c;->O:I

    .line 20
    iput-byte p1, p0, Lgh/c;->S:B

    .line 21
    iput p1, p0, Lgh/c;->T:I

    .line 22
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/c;->m:Lnh/d;

    return-void
.end method

.method static synthetic B(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->C:Ljava/util/List;

    return-object p0
.end method

.method static synthetic C(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->C:Ljava/util/List;

    return-object p1
.end method

.method static synthetic D(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->D:Ljava/util/List;

    return-object p0
.end method

.method static synthetic E(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->D:Ljava/util/List;

    return-object p1
.end method

.method static synthetic F(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->E:Ljava/util/List;

    return-object p0
.end method

.method static synthetic G(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->E:Ljava/util/List;

    return-object p1
.end method

.method static synthetic H(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->F:Ljava/util/List;

    return-object p0
.end method

.method static synthetic I(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->F:Ljava/util/List;

    return-object p1
.end method

.method static synthetic J(Lgh/c;I)I
    .locals 0

    iput p1, p0, Lgh/c;->H:I

    return p1
.end method

.method static synthetic K(Lgh/c;Lgh/q;)Lgh/q;
    .locals 0

    iput-object p1, p0, Lgh/c;->I:Lgh/q;

    return-object p1
.end method

.method static synthetic L(Lgh/c;I)I
    .locals 0

    iput p1, p0, Lgh/c;->J:I

    return p1
.end method

.method static synthetic M(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->K:Ljava/util/List;

    return-object p0
.end method

.method static synthetic N(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->K:Ljava/util/List;

    return-object p1
.end method

.method static synthetic O(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->M:Ljava/util/List;

    return-object p0
.end method

.method static synthetic P(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->M:Ljava/util/List;

    return-object p1
.end method

.method static synthetic Q(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->N:Ljava/util/List;

    return-object p0
.end method

.method static synthetic R(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->N:Ljava/util/List;

    return-object p1
.end method

.method static synthetic S(Lgh/c;Lgh/t;)Lgh/t;
    .locals 0

    iput-object p1, p0, Lgh/c;->P:Lgh/t;

    return-object p1
.end method

.method static synthetic T(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->Q:Ljava/util/List;

    return-object p0
.end method

.method static synthetic U(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->Q:Ljava/util/List;

    return-object p1
.end method

.method static synthetic V(Lgh/c;Lgh/w;)Lgh/w;
    .locals 0

    iput-object p1, p0, Lgh/c;->R:Lgh/w;

    return-object p1
.end method

.method static synthetic W(Lgh/c;I)I
    .locals 0

    iput p1, p0, Lgh/c;->n:I

    return p1
.end method

.method static synthetic X(Lgh/c;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/c;->m:Lnh/d;

    return-object p0
.end method

.method static synthetic Y(Lgh/c;I)I
    .locals 0

    iput p1, p0, Lgh/c;->o:I

    return p1
.end method

.method static synthetic Z(Lgh/c;I)I
    .locals 0

    iput p1, p0, Lgh/c;->p:I

    return p1
.end method

.method static synthetic a0(Lgh/c;I)I
    .locals 0

    iput p1, p0, Lgh/c;->q:I

    return p1
.end method

.method static synthetic b0(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->r:Ljava/util/List;

    return-object p0
.end method

.method static synthetic c0(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->r:Ljava/util/List;

    return-object p1
.end method

.method static synthetic d0(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->s:Ljava/util/List;

    return-object p0
.end method

.method static synthetic e0(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->s:Ljava/util/List;

    return-object p1
.end method

.method static synthetic f0(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->t:Ljava/util/List;

    return-object p0
.end method

.method static synthetic g0(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->t:Ljava/util/List;

    return-object p1
.end method

.method static synthetic h0(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->v:Ljava/util/List;

    return-object p0
.end method

.method static synthetic i0(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->v:Ljava/util/List;

    return-object p1
.end method

.method static synthetic j0(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->x:Ljava/util/List;

    return-object p0
.end method

.method static synthetic k0(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->x:Ljava/util/List;

    return-object p1
.end method

.method static synthetic l0(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->y:Ljava/util/List;

    return-object p0
.end method

.method static synthetic m0(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->y:Ljava/util/List;

    return-object p1
.end method

.method static synthetic n0(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->A:Ljava/util/List;

    return-object p0
.end method

.method static synthetic o0(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->A:Ljava/util/List;

    return-object p1
.end method

.method static synthetic p0(Lgh/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/c;->B:Ljava/util/List;

    return-object p0
.end method

.method static synthetic q0(Lgh/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/c;->B:Ljava/util/List;

    return-object p1
.end method

.method private t1()V
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    iput v0, p0, Lgh/c;->o:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lgh/c;->p:I

    .line 6
    .line 7
    iput v0, p0, Lgh/c;->q:I

    .line 8
    .line 9
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lgh/c;->r:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, Lgh/c;->s:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, p0, Lgh/c;->t:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, p0, Lgh/c;->v:Ljava/util/List;

    .line 32
    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, p0, Lgh/c;->x:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, Lgh/c;->y:Ljava/util/List;

    .line 44
    .line 45
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iput-object v1, p0, Lgh/c;->A:Ljava/util/List;

    .line 50
    .line 51
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iput-object v1, p0, Lgh/c;->B:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, p0, Lgh/c;->C:Ljava/util/List;

    .line 62
    .line 63
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, p0, Lgh/c;->D:Ljava/util/List;

    .line 68
    .line 69
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, p0, Lgh/c;->E:Ljava/util/List;

    .line 74
    .line 75
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, p0, Lgh/c;->F:Ljava/util/List;

    .line 80
    .line 81
    iput v0, p0, Lgh/c;->H:I

    .line 82
    .line 83
    invoke-static {}, Lgh/q;->Y()Lgh/q;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iput-object v1, p0, Lgh/c;->I:Lgh/q;

    .line 88
    .line 89
    iput v0, p0, Lgh/c;->J:I

    .line 90
    .line 91
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, Lgh/c;->K:Ljava/util/List;

    .line 96
    .line 97
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iput-object v0, p0, Lgh/c;->M:Ljava/util/List;

    .line 102
    .line 103
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, p0, Lgh/c;->N:Ljava/util/List;

    .line 108
    .line 109
    invoke-static {}, Lgh/t;->x()Lgh/t;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, Lgh/c;->P:Lgh/t;

    .line 114
    .line 115
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iput-object v0, p0, Lgh/c;->Q:Ljava/util/List;

    .line 120
    .line 121
    invoke-static {}, Lgh/w;->v()Lgh/w;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iput-object v0, p0, Lgh/c;->R:Lgh/w;

    .line 126
    .line 127
    return-void
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

.method public static u1()Lgh/c$b;
    .locals 1

    invoke-static {}, Lgh/c$b;->v()Lgh/c$b;

    move-result-object v0

    return-object v0
.end method

.method public static v1(Lgh/c;)Lgh/c$b;
    .locals 1

    invoke-static {}, Lgh/c;->u1()Lgh/c$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/c$b;->R(Lgh/c;)Lgh/c$b;

    move-result-object p0

    return-object p0
.end method

.method public static x1(Ljava/io/InputStream;Lnh/g;)Lgh/c;
    .locals 1

    sget-object v0, Lgh/c;->V:Lnh/s;

    invoke-interface {v0, p0, p1}, Lnh/s;->a(Ljava/io/InputStream;Lnh/g;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgh/c;

    return-object p0
.end method

.method public static z0()Lgh/c;
    .locals 1

    sget-object v0, Lgh/c;->U:Lgh/c;

    return-object v0
.end method


# virtual methods
.method public A0()Lgh/c;
    .locals 1

    sget-object v0, Lgh/c;->U:Lgh/c;

    return-object v0
.end method

.method public B0(I)Lgh/g;
    .locals 1

    iget-object v0, p0, Lgh/c;->E:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/g;

    return-object p1
.end method

.method public C0()I
    .locals 1

    iget-object v0, p0, Lgh/c;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public D0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->E:Ljava/util/List;

    return-object v0
.end method

.method public E0()I
    .locals 1

    iget v0, p0, Lgh/c;->o:I

    return v0
.end method

.method public F0()I
    .locals 1

    iget v0, p0, Lgh/c;->p:I

    return v0
.end method

.method public G0(I)Lgh/i;
    .locals 1

    iget-object v0, p0, Lgh/c;->B:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/i;

    return-object p1
.end method

.method public H0()I
    .locals 1

    iget-object v0, p0, Lgh/c;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public I0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->B:Ljava/util/List;

    return-object v0
.end method

.method public J0()I
    .locals 1

    iget v0, p0, Lgh/c;->H:I

    return v0
.end method

.method public K0()Lgh/q;
    .locals 1

    iget-object v0, p0, Lgh/c;->I:Lgh/q;

    return-object v0
.end method

.method public L0()I
    .locals 1

    iget v0, p0, Lgh/c;->J:I

    return v0
.end method

.method public M0()I
    .locals 1

    iget-object v0, p0, Lgh/c;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public N0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->K:Ljava/util/List;

    return-object v0
.end method

.method public O0(I)Lgh/q;
    .locals 1

    iget-object v0, p0, Lgh/c;->M:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/q;

    return-object p1
.end method

.method public P0()I
    .locals 1

    iget-object v0, p0, Lgh/c;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public Q0()I
    .locals 1

    iget-object v0, p0, Lgh/c;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public R0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->N:Ljava/util/List;

    return-object v0
.end method

.method public S0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/q;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->M:Ljava/util/List;

    return-object v0
.end method

.method public T0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->v:Ljava/util/List;

    return-object v0
.end method

.method public U0(I)Lgh/n;
    .locals 1

    iget-object v0, p0, Lgh/c;->C:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/n;

    return-object p1
.end method

.method public V0()I
    .locals 1

    iget-object v0, p0, Lgh/c;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public W0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->C:Ljava/util/List;

    return-object v0
.end method

.method public X0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->F:Ljava/util/List;

    return-object v0
.end method

.method public Y0(I)Lgh/q;
    .locals 1

    iget-object v0, p0, Lgh/c;->s:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/q;

    return-object p1
.end method

.method public Z0()I
    .locals 1

    iget-object v0, p0, Lgh/c;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic a()Lnh/q;
    .locals 1

    invoke-virtual {p0}, Lgh/c;->A0()Lgh/c;

    move-result-object v0

    return-object v0
.end method

.method public a1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->t:Ljava/util/List;

    return-object v0
.end method

.method public b1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/q;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->s:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/c;->y1()Lgh/c$b;

    move-result-object v0

    return-object v0
.end method

.method public c1(I)Lgh/r;
    .locals 1

    iget-object v0, p0, Lgh/c;->D:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/r;

    return-object p1
.end method

.method public d()I
    .locals 7

    .line 1
    iget v0, p0, Lgh/c;->T:I

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
    iget v0, p0, Lgh/c;->n:I

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
    iget v0, p0, Lgh/c;->o:I

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
    move v3, v1

    .line 25
    :goto_1
    iget-object v4, p0, Lgh/c;->t:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-ge v1, v4, :cond_2

    .line 32
    .line 33
    iget-object v4, p0, Lgh/c;->t:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-static {v4}, Lnh/f;->p(I)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    add-int/2addr v3, v4

    .line 50
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    add-int/2addr v0, v3

    .line 54
    invoke-virtual {p0}, Lgh/c;->a1()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    add-int/lit8 v0, v0, 0x1

    .line 65
    .line 66
    invoke-static {v3}, Lnh/f;->p(I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/2addr v0, v1

    .line 71
    :cond_3
    iput v3, p0, Lgh/c;->u:I

    .line 72
    .line 73
    iget v1, p0, Lgh/c;->n:I

    .line 74
    .line 75
    const/4 v3, 0x2

    .line 76
    and-int/2addr v1, v3

    .line 77
    if-ne v1, v3, :cond_4

    .line 78
    .line 79
    const/4 v1, 0x3

    .line 80
    iget v4, p0, Lgh/c;->p:I

    .line 81
    .line 82
    invoke-static {v1, v4}, Lnh/f;->o(II)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    add-int/2addr v0, v1

    .line 87
    :cond_4
    iget v1, p0, Lgh/c;->n:I

    .line 88
    .line 89
    const/4 v4, 0x4

    .line 90
    and-int/2addr v1, v4

    .line 91
    if-ne v1, v4, :cond_5

    .line 92
    .line 93
    iget v1, p0, Lgh/c;->q:I

    .line 94
    .line 95
    invoke-static {v4, v1}, Lnh/f;->o(II)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    add-int/2addr v0, v1

    .line 100
    :cond_5
    move v1, v2

    .line 101
    :goto_2
    iget-object v4, p0, Lgh/c;->r:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-ge v1, v4, :cond_6

    .line 108
    .line 109
    iget-object v4, p0, Lgh/c;->r:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, Lnh/q;

    .line 116
    .line 117
    const/4 v5, 0x5

    .line 118
    invoke-static {v5, v4}, Lnh/f;->s(ILnh/q;)I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    add-int/2addr v0, v4

    .line 123
    add-int/lit8 v1, v1, 0x1

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    move v1, v2

    .line 127
    :goto_3
    iget-object v4, p0, Lgh/c;->s:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-ge v1, v4, :cond_7

    .line 134
    .line 135
    iget-object v4, p0, Lgh/c;->s:Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Lnh/q;

    .line 142
    .line 143
    const/4 v5, 0x6

    .line 144
    invoke-static {v5, v4}, Lnh/f;->s(ILnh/q;)I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    add-int/2addr v0, v4

    .line 149
    add-int/lit8 v1, v1, 0x1

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_7
    move v1, v2

    .line 153
    move v4, v1

    .line 154
    :goto_4
    iget-object v5, p0, Lgh/c;->v:Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-ge v1, v5, :cond_8

    .line 161
    .line 162
    iget-object v5, p0, Lgh/c;->v:Ljava/util/List;

    .line 163
    .line 164
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    check-cast v5, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    invoke-static {v5}, Lnh/f;->p(I)I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    add-int/2addr v4, v5

    .line 179
    add-int/lit8 v1, v1, 0x1

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_8
    add-int/2addr v0, v4

    .line 183
    invoke-virtual {p0}, Lgh/c;->T0()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-nez v1, :cond_9

    .line 192
    .line 193
    add-int/lit8 v0, v0, 0x1

    .line 194
    .line 195
    invoke-static {v4}, Lnh/f;->p(I)I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    add-int/2addr v0, v1

    .line 200
    :cond_9
    iput v4, p0, Lgh/c;->w:I

    .line 201
    .line 202
    move v1, v2

    .line 203
    :goto_5
    iget-object v4, p0, Lgh/c;->A:Ljava/util/List;

    .line 204
    .line 205
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    const/16 v5, 0x8

    .line 210
    .line 211
    if-ge v1, v4, :cond_a

    .line 212
    .line 213
    iget-object v4, p0, Lgh/c;->A:Ljava/util/List;

    .line 214
    .line 215
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    check-cast v4, Lnh/q;

    .line 220
    .line 221
    invoke-static {v5, v4}, Lnh/f;->s(ILnh/q;)I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    add-int/2addr v0, v4

    .line 226
    add-int/lit8 v1, v1, 0x1

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_a
    move v1, v2

    .line 230
    :goto_6
    iget-object v4, p0, Lgh/c;->B:Ljava/util/List;

    .line 231
    .line 232
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    if-ge v1, v4, :cond_b

    .line 237
    .line 238
    iget-object v4, p0, Lgh/c;->B:Ljava/util/List;

    .line 239
    .line 240
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    check-cast v4, Lnh/q;

    .line 245
    .line 246
    const/16 v6, 0x9

    .line 247
    .line 248
    invoke-static {v6, v4}, Lnh/f;->s(ILnh/q;)I

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    add-int/2addr v0, v4

    .line 253
    add-int/lit8 v1, v1, 0x1

    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_b
    move v1, v2

    .line 257
    :goto_7
    iget-object v4, p0, Lgh/c;->C:Ljava/util/List;

    .line 258
    .line 259
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-ge v1, v4, :cond_c

    .line 264
    .line 265
    iget-object v4, p0, Lgh/c;->C:Ljava/util/List;

    .line 266
    .line 267
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    check-cast v4, Lnh/q;

    .line 272
    .line 273
    const/16 v6, 0xa

    .line 274
    .line 275
    invoke-static {v6, v4}, Lnh/f;->s(ILnh/q;)I

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    add-int/2addr v0, v4

    .line 280
    add-int/lit8 v1, v1, 0x1

    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_c
    move v1, v2

    .line 284
    :goto_8
    iget-object v4, p0, Lgh/c;->D:Ljava/util/List;

    .line 285
    .line 286
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-ge v1, v4, :cond_d

    .line 291
    .line 292
    iget-object v4, p0, Lgh/c;->D:Ljava/util/List;

    .line 293
    .line 294
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    check-cast v4, Lnh/q;

    .line 299
    .line 300
    const/16 v6, 0xb

    .line 301
    .line 302
    invoke-static {v6, v4}, Lnh/f;->s(ILnh/q;)I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    add-int/2addr v0, v4

    .line 307
    add-int/lit8 v1, v1, 0x1

    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_d
    move v1, v2

    .line 311
    :goto_9
    iget-object v4, p0, Lgh/c;->E:Ljava/util/List;

    .line 312
    .line 313
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-ge v1, v4, :cond_e

    .line 318
    .line 319
    iget-object v4, p0, Lgh/c;->E:Ljava/util/List;

    .line 320
    .line 321
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    check-cast v4, Lnh/q;

    .line 326
    .line 327
    const/16 v6, 0xd

    .line 328
    .line 329
    invoke-static {v6, v4}, Lnh/f;->s(ILnh/q;)I

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    add-int/2addr v0, v4

    .line 334
    add-int/lit8 v1, v1, 0x1

    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_e
    move v1, v2

    .line 338
    move v4, v1

    .line 339
    :goto_a
    iget-object v6, p0, Lgh/c;->F:Ljava/util/List;

    .line 340
    .line 341
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 342
    .line 343
    .line 344
    move-result v6

    .line 345
    if-ge v1, v6, :cond_f

    .line 346
    .line 347
    iget-object v6, p0, Lgh/c;->F:Ljava/util/List;

    .line 348
    .line 349
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    check-cast v6, Ljava/lang/Integer;

    .line 354
    .line 355
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 356
    .line 357
    .line 358
    move-result v6

    .line 359
    invoke-static {v6}, Lnh/f;->p(I)I

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    add-int/2addr v4, v6

    .line 364
    add-int/lit8 v1, v1, 0x1

    .line 365
    .line 366
    goto :goto_a

    .line 367
    :cond_f
    add-int/2addr v0, v4

    .line 368
    invoke-virtual {p0}, Lgh/c;->X0()Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    if-nez v1, :cond_10

    .line 377
    .line 378
    add-int/lit8 v0, v0, 0x2

    .line 379
    .line 380
    invoke-static {v4}, Lnh/f;->p(I)I

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    add-int/2addr v0, v1

    .line 385
    :cond_10
    iput v4, p0, Lgh/c;->G:I

    .line 386
    .line 387
    iget v1, p0, Lgh/c;->n:I

    .line 388
    .line 389
    and-int/2addr v1, v5

    .line 390
    if-ne v1, v5, :cond_11

    .line 391
    .line 392
    const/16 v1, 0x11

    .line 393
    .line 394
    iget v4, p0, Lgh/c;->H:I

    .line 395
    .line 396
    invoke-static {v1, v4}, Lnh/f;->o(II)I

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    add-int/2addr v0, v1

    .line 401
    :cond_11
    iget v1, p0, Lgh/c;->n:I

    .line 402
    .line 403
    const/16 v4, 0x10

    .line 404
    .line 405
    and-int/2addr v1, v4

    .line 406
    if-ne v1, v4, :cond_12

    .line 407
    .line 408
    const/16 v1, 0x12

    .line 409
    .line 410
    iget-object v4, p0, Lgh/c;->I:Lgh/q;

    .line 411
    .line 412
    invoke-static {v1, v4}, Lnh/f;->s(ILnh/q;)I

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    add-int/2addr v0, v1

    .line 417
    :cond_12
    iget v1, p0, Lgh/c;->n:I

    .line 418
    .line 419
    const/16 v4, 0x20

    .line 420
    .line 421
    and-int/2addr v1, v4

    .line 422
    if-ne v1, v4, :cond_13

    .line 423
    .line 424
    const/16 v1, 0x13

    .line 425
    .line 426
    iget v5, p0, Lgh/c;->J:I

    .line 427
    .line 428
    invoke-static {v1, v5}, Lnh/f;->o(II)I

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    add-int/2addr v0, v1

    .line 433
    :cond_13
    move v1, v2

    .line 434
    :goto_b
    iget-object v5, p0, Lgh/c;->x:Ljava/util/List;

    .line 435
    .line 436
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 437
    .line 438
    .line 439
    move-result v5

    .line 440
    if-ge v1, v5, :cond_14

    .line 441
    .line 442
    iget-object v5, p0, Lgh/c;->x:Ljava/util/List;

    .line 443
    .line 444
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v5

    .line 448
    check-cast v5, Lnh/q;

    .line 449
    .line 450
    const/16 v6, 0x14

    .line 451
    .line 452
    invoke-static {v6, v5}, Lnh/f;->s(ILnh/q;)I

    .line 453
    .line 454
    .line 455
    move-result v5

    .line 456
    add-int/2addr v0, v5

    .line 457
    add-int/lit8 v1, v1, 0x1

    .line 458
    .line 459
    goto :goto_b

    .line 460
    :cond_14
    move v1, v2

    .line 461
    move v5, v1

    .line 462
    :goto_c
    iget-object v6, p0, Lgh/c;->y:Ljava/util/List;

    .line 463
    .line 464
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 465
    .line 466
    .line 467
    move-result v6

    .line 468
    if-ge v1, v6, :cond_15

    .line 469
    .line 470
    iget-object v6, p0, Lgh/c;->y:Ljava/util/List;

    .line 471
    .line 472
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v6

    .line 476
    check-cast v6, Ljava/lang/Integer;

    .line 477
    .line 478
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 479
    .line 480
    .line 481
    move-result v6

    .line 482
    invoke-static {v6}, Lnh/f;->p(I)I

    .line 483
    .line 484
    .line 485
    move-result v6

    .line 486
    add-int/2addr v5, v6

    .line 487
    add-int/lit8 v1, v1, 0x1

    .line 488
    .line 489
    goto :goto_c

    .line 490
    :cond_15
    add-int/2addr v0, v5

    .line 491
    invoke-virtual {p0}, Lgh/c;->x0()Ljava/util/List;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 496
    .line 497
    .line 498
    move-result v1

    .line 499
    if-nez v1, :cond_16

    .line 500
    .line 501
    add-int/lit8 v0, v0, 0x2

    .line 502
    .line 503
    invoke-static {v5}, Lnh/f;->p(I)I

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    add-int/2addr v0, v1

    .line 508
    :cond_16
    iput v5, p0, Lgh/c;->z:I

    .line 509
    .line 510
    move v1, v2

    .line 511
    move v5, v1

    .line 512
    :goto_d
    iget-object v6, p0, Lgh/c;->K:Ljava/util/List;

    .line 513
    .line 514
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 515
    .line 516
    .line 517
    move-result v6

    .line 518
    if-ge v1, v6, :cond_17

    .line 519
    .line 520
    iget-object v6, p0, Lgh/c;->K:Ljava/util/List;

    .line 521
    .line 522
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v6

    .line 526
    check-cast v6, Ljava/lang/Integer;

    .line 527
    .line 528
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 529
    .line 530
    .line 531
    move-result v6

    .line 532
    invoke-static {v6}, Lnh/f;->p(I)I

    .line 533
    .line 534
    .line 535
    move-result v6

    .line 536
    add-int/2addr v5, v6

    .line 537
    add-int/lit8 v1, v1, 0x1

    .line 538
    .line 539
    goto :goto_d

    .line 540
    :cond_17
    add-int/2addr v0, v5

    .line 541
    invoke-virtual {p0}, Lgh/c;->N0()Ljava/util/List;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 546
    .line 547
    .line 548
    move-result v1

    .line 549
    if-nez v1, :cond_18

    .line 550
    .line 551
    add-int/lit8 v0, v0, 0x2

    .line 552
    .line 553
    invoke-static {v5}, Lnh/f;->p(I)I

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    add-int/2addr v0, v1

    .line 558
    :cond_18
    iput v5, p0, Lgh/c;->L:I

    .line 559
    .line 560
    move v1, v2

    .line 561
    :goto_e
    iget-object v5, p0, Lgh/c;->M:Ljava/util/List;

    .line 562
    .line 563
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 564
    .line 565
    .line 566
    move-result v5

    .line 567
    if-ge v1, v5, :cond_19

    .line 568
    .line 569
    iget-object v5, p0, Lgh/c;->M:Ljava/util/List;

    .line 570
    .line 571
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v5

    .line 575
    check-cast v5, Lnh/q;

    .line 576
    .line 577
    const/16 v6, 0x17

    .line 578
    .line 579
    invoke-static {v6, v5}, Lnh/f;->s(ILnh/q;)I

    .line 580
    .line 581
    .line 582
    move-result v5

    .line 583
    add-int/2addr v0, v5

    .line 584
    add-int/lit8 v1, v1, 0x1

    .line 585
    .line 586
    goto :goto_e

    .line 587
    :cond_19
    move v1, v2

    .line 588
    move v5, v1

    .line 589
    :goto_f
    iget-object v6, p0, Lgh/c;->N:Ljava/util/List;

    .line 590
    .line 591
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 592
    .line 593
    .line 594
    move-result v6

    .line 595
    if-ge v1, v6, :cond_1a

    .line 596
    .line 597
    iget-object v6, p0, Lgh/c;->N:Ljava/util/List;

    .line 598
    .line 599
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v6

    .line 603
    check-cast v6, Ljava/lang/Integer;

    .line 604
    .line 605
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 606
    .line 607
    .line 608
    move-result v6

    .line 609
    invoke-static {v6}, Lnh/f;->p(I)I

    .line 610
    .line 611
    .line 612
    move-result v6

    .line 613
    add-int/2addr v5, v6

    .line 614
    add-int/lit8 v1, v1, 0x1

    .line 615
    .line 616
    goto :goto_f

    .line 617
    :cond_1a
    add-int/2addr v0, v5

    .line 618
    invoke-virtual {p0}, Lgh/c;->R0()Ljava/util/List;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 623
    .line 624
    .line 625
    move-result v1

    .line 626
    if-nez v1, :cond_1b

    .line 627
    .line 628
    add-int/lit8 v0, v0, 0x2

    .line 629
    .line 630
    invoke-static {v5}, Lnh/f;->p(I)I

    .line 631
    .line 632
    .line 633
    move-result v1

    .line 634
    add-int/2addr v0, v1

    .line 635
    :cond_1b
    iput v5, p0, Lgh/c;->O:I

    .line 636
    .line 637
    iget v1, p0, Lgh/c;->n:I

    .line 638
    .line 639
    const/16 v5, 0x40

    .line 640
    .line 641
    and-int/2addr v1, v5

    .line 642
    if-ne v1, v5, :cond_1c

    .line 643
    .line 644
    const/16 v1, 0x1e

    .line 645
    .line 646
    iget-object v5, p0, Lgh/c;->P:Lgh/t;

    .line 647
    .line 648
    invoke-static {v1, v5}, Lnh/f;->s(ILnh/q;)I

    .line 649
    .line 650
    .line 651
    move-result v1

    .line 652
    add-int/2addr v0, v1

    .line 653
    :cond_1c
    move v1, v2

    .line 654
    :goto_10
    iget-object v5, p0, Lgh/c;->Q:Ljava/util/List;

    .line 655
    .line 656
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 657
    .line 658
    .line 659
    move-result v5

    .line 660
    if-ge v2, v5, :cond_1d

    .line 661
    .line 662
    iget-object v5, p0, Lgh/c;->Q:Ljava/util/List;

    .line 663
    .line 664
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v5

    .line 668
    check-cast v5, Ljava/lang/Integer;

    .line 669
    .line 670
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 671
    .line 672
    .line 673
    move-result v5

    .line 674
    invoke-static {v5}, Lnh/f;->p(I)I

    .line 675
    .line 676
    .line 677
    move-result v5

    .line 678
    add-int/2addr v1, v5

    .line 679
    add-int/lit8 v2, v2, 0x1

    .line 680
    .line 681
    goto :goto_10

    .line 682
    :cond_1d
    add-int/2addr v0, v1

    .line 683
    invoke-virtual {p0}, Lgh/c;->j1()Ljava/util/List;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 688
    .line 689
    .line 690
    move-result v1

    .line 691
    mul-int/2addr v1, v3

    .line 692
    add-int/2addr v0, v1

    .line 693
    iget v1, p0, Lgh/c;->n:I

    .line 694
    .line 695
    const/16 v2, 0x80

    .line 696
    .line 697
    and-int/2addr v1, v2

    .line 698
    if-ne v1, v2, :cond_1e

    .line 699
    .line 700
    iget-object v1, p0, Lgh/c;->R:Lgh/w;

    .line 701
    .line 702
    invoke-static {v4, v1}, Lnh/f;->s(ILnh/q;)I

    .line 703
    .line 704
    .line 705
    move-result v1

    .line 706
    add-int/2addr v0, v1

    .line 707
    :cond_1e
    invoke-virtual {p0}, Lnh/i$d;->u()I

    .line 708
    .line 709
    .line 710
    move-result v1

    .line 711
    add-int/2addr v0, v1

    .line 712
    iget-object v1, p0, Lgh/c;->m:Lnh/d;

    .line 713
    .line 714
    invoke-virtual {v1}, Lnh/d;->size()I

    .line 715
    .line 716
    .line 717
    move-result v1

    .line 718
    add-int/2addr v0, v1

    .line 719
    iput v0, p0, Lgh/c;->T:I

    .line 720
    .line 721
    return v0
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
.end method

.method public d1()I
    .locals 1

    iget-object v0, p0, Lgh/c;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public e(Lnh/f;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lgh/c;->d()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lnh/i$d;->z()Lnh/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lgh/c;->n:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget v1, p0, Lgh/c;->o:I

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, Lnh/f;->a0(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lgh/c;->a1()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/16 v2, 0x12

    .line 28
    .line 29
    if-lez v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Lnh/f;->o0(I)V

    .line 32
    .line 33
    .line 34
    iget v1, p0, Lgh/c;->u:I

    .line 35
    .line 36
    invoke-virtual {p1, v1}, Lnh/f;->o0(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 v1, 0x0

    .line 40
    move v3, v1

    .line 41
    :goto_0
    iget-object v4, p0, Lgh/c;->t:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-ge v3, v4, :cond_2

    .line 48
    .line 49
    iget-object v4, p0, Lgh/c;->t:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-virtual {p1, v4}, Lnh/f;->b0(I)V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iget v3, p0, Lgh/c;->n:I

    .line 68
    .line 69
    const/4 v4, 0x2

    .line 70
    and-int/2addr v3, v4

    .line 71
    if-ne v3, v4, :cond_3

    .line 72
    .line 73
    const/4 v3, 0x3

    .line 74
    iget v4, p0, Lgh/c;->p:I

    .line 75
    .line 76
    invoke-virtual {p1, v3, v4}, Lnh/f;->a0(II)V

    .line 77
    .line 78
    .line 79
    :cond_3
    iget v3, p0, Lgh/c;->n:I

    .line 80
    .line 81
    const/4 v4, 0x4

    .line 82
    and-int/2addr v3, v4

    .line 83
    if-ne v3, v4, :cond_4

    .line 84
    .line 85
    iget v3, p0, Lgh/c;->q:I

    .line 86
    .line 87
    invoke-virtual {p1, v4, v3}, Lnh/f;->a0(II)V

    .line 88
    .line 89
    .line 90
    :cond_4
    move v3, v1

    .line 91
    :goto_1
    iget-object v4, p0, Lgh/c;->r:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-ge v3, v4, :cond_5

    .line 98
    .line 99
    iget-object v4, p0, Lgh/c;->r:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    check-cast v4, Lnh/q;

    .line 106
    .line 107
    const/4 v5, 0x5

    .line 108
    invoke-virtual {p1, v5, v4}, Lnh/f;->d0(ILnh/q;)V

    .line 109
    .line 110
    .line 111
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_5
    move v3, v1

    .line 115
    :goto_2
    iget-object v4, p0, Lgh/c;->s:Ljava/util/List;

    .line 116
    .line 117
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-ge v3, v4, :cond_6

    .line 122
    .line 123
    iget-object v4, p0, Lgh/c;->s:Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Lnh/q;

    .line 130
    .line 131
    const/4 v5, 0x6

    .line 132
    invoke-virtual {p1, v5, v4}, Lnh/f;->d0(ILnh/q;)V

    .line 133
    .line 134
    .line 135
    add-int/lit8 v3, v3, 0x1

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_6
    invoke-virtual {p0}, Lgh/c;->T0()Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-lez v3, :cond_7

    .line 147
    .line 148
    const/16 v3, 0x3a

    .line 149
    .line 150
    invoke-virtual {p1, v3}, Lnh/f;->o0(I)V

    .line 151
    .line 152
    .line 153
    iget v3, p0, Lgh/c;->w:I

    .line 154
    .line 155
    invoke-virtual {p1, v3}, Lnh/f;->o0(I)V

    .line 156
    .line 157
    .line 158
    :cond_7
    move v3, v1

    .line 159
    :goto_3
    iget-object v4, p0, Lgh/c;->v:Ljava/util/List;

    .line 160
    .line 161
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-ge v3, v4, :cond_8

    .line 166
    .line 167
    iget-object v4, p0, Lgh/c;->v:Ljava/util/List;

    .line 168
    .line 169
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    check-cast v4, Ljava/lang/Integer;

    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    invoke-virtual {p1, v4}, Lnh/f;->b0(I)V

    .line 180
    .line 181
    .line 182
    add-int/lit8 v3, v3, 0x1

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_8
    move v3, v1

    .line 186
    :goto_4
    iget-object v4, p0, Lgh/c;->A:Ljava/util/List;

    .line 187
    .line 188
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    const/16 v5, 0x8

    .line 193
    .line 194
    if-ge v3, v4, :cond_9

    .line 195
    .line 196
    iget-object v4, p0, Lgh/c;->A:Ljava/util/List;

    .line 197
    .line 198
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    check-cast v4, Lnh/q;

    .line 203
    .line 204
    invoke-virtual {p1, v5, v4}, Lnh/f;->d0(ILnh/q;)V

    .line 205
    .line 206
    .line 207
    add-int/lit8 v3, v3, 0x1

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_9
    move v3, v1

    .line 211
    :goto_5
    iget-object v4, p0, Lgh/c;->B:Ljava/util/List;

    .line 212
    .line 213
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    if-ge v3, v4, :cond_a

    .line 218
    .line 219
    iget-object v4, p0, Lgh/c;->B:Ljava/util/List;

    .line 220
    .line 221
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    check-cast v4, Lnh/q;

    .line 226
    .line 227
    const/16 v6, 0x9

    .line 228
    .line 229
    invoke-virtual {p1, v6, v4}, Lnh/f;->d0(ILnh/q;)V

    .line 230
    .line 231
    .line 232
    add-int/lit8 v3, v3, 0x1

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_a
    move v3, v1

    .line 236
    :goto_6
    iget-object v4, p0, Lgh/c;->C:Ljava/util/List;

    .line 237
    .line 238
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    if-ge v3, v4, :cond_b

    .line 243
    .line 244
    iget-object v4, p0, Lgh/c;->C:Ljava/util/List;

    .line 245
    .line 246
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    check-cast v4, Lnh/q;

    .line 251
    .line 252
    const/16 v6, 0xa

    .line 253
    .line 254
    invoke-virtual {p1, v6, v4}, Lnh/f;->d0(ILnh/q;)V

    .line 255
    .line 256
    .line 257
    add-int/lit8 v3, v3, 0x1

    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_b
    move v3, v1

    .line 261
    :goto_7
    iget-object v4, p0, Lgh/c;->D:Ljava/util/List;

    .line 262
    .line 263
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-ge v3, v4, :cond_c

    .line 268
    .line 269
    iget-object v4, p0, Lgh/c;->D:Ljava/util/List;

    .line 270
    .line 271
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    check-cast v4, Lnh/q;

    .line 276
    .line 277
    const/16 v6, 0xb

    .line 278
    .line 279
    invoke-virtual {p1, v6, v4}, Lnh/f;->d0(ILnh/q;)V

    .line 280
    .line 281
    .line 282
    add-int/lit8 v3, v3, 0x1

    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_c
    move v3, v1

    .line 286
    :goto_8
    iget-object v4, p0, Lgh/c;->E:Ljava/util/List;

    .line 287
    .line 288
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-ge v3, v4, :cond_d

    .line 293
    .line 294
    iget-object v4, p0, Lgh/c;->E:Ljava/util/List;

    .line 295
    .line 296
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    check-cast v4, Lnh/q;

    .line 301
    .line 302
    const/16 v6, 0xd

    .line 303
    .line 304
    invoke-virtual {p1, v6, v4}, Lnh/f;->d0(ILnh/q;)V

    .line 305
    .line 306
    .line 307
    add-int/lit8 v3, v3, 0x1

    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_d
    invoke-virtual {p0}, Lgh/c;->X0()Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    if-lez v3, :cond_e

    .line 319
    .line 320
    const/16 v3, 0x82

    .line 321
    .line 322
    invoke-virtual {p1, v3}, Lnh/f;->o0(I)V

    .line 323
    .line 324
    .line 325
    iget v3, p0, Lgh/c;->G:I

    .line 326
    .line 327
    invoke-virtual {p1, v3}, Lnh/f;->o0(I)V

    .line 328
    .line 329
    .line 330
    :cond_e
    move v3, v1

    .line 331
    :goto_9
    iget-object v4, p0, Lgh/c;->F:Ljava/util/List;

    .line 332
    .line 333
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    if-ge v3, v4, :cond_f

    .line 338
    .line 339
    iget-object v4, p0, Lgh/c;->F:Ljava/util/List;

    .line 340
    .line 341
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    check-cast v4, Ljava/lang/Integer;

    .line 346
    .line 347
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 348
    .line 349
    .line 350
    move-result v4

    .line 351
    invoke-virtual {p1, v4}, Lnh/f;->b0(I)V

    .line 352
    .line 353
    .line 354
    add-int/lit8 v3, v3, 0x1

    .line 355
    .line 356
    goto :goto_9

    .line 357
    :cond_f
    iget v3, p0, Lgh/c;->n:I

    .line 358
    .line 359
    and-int/2addr v3, v5

    .line 360
    if-ne v3, v5, :cond_10

    .line 361
    .line 362
    const/16 v3, 0x11

    .line 363
    .line 364
    iget v4, p0, Lgh/c;->H:I

    .line 365
    .line 366
    invoke-virtual {p1, v3, v4}, Lnh/f;->a0(II)V

    .line 367
    .line 368
    .line 369
    :cond_10
    iget v3, p0, Lgh/c;->n:I

    .line 370
    .line 371
    const/16 v4, 0x10

    .line 372
    .line 373
    and-int/2addr v3, v4

    .line 374
    if-ne v3, v4, :cond_11

    .line 375
    .line 376
    iget-object v3, p0, Lgh/c;->I:Lgh/q;

    .line 377
    .line 378
    invoke-virtual {p1, v2, v3}, Lnh/f;->d0(ILnh/q;)V

    .line 379
    .line 380
    .line 381
    :cond_11
    iget v2, p0, Lgh/c;->n:I

    .line 382
    .line 383
    const/16 v3, 0x20

    .line 384
    .line 385
    and-int/2addr v2, v3

    .line 386
    if-ne v2, v3, :cond_12

    .line 387
    .line 388
    const/16 v2, 0x13

    .line 389
    .line 390
    iget v4, p0, Lgh/c;->J:I

    .line 391
    .line 392
    invoke-virtual {p1, v2, v4}, Lnh/f;->a0(II)V

    .line 393
    .line 394
    .line 395
    :cond_12
    move v2, v1

    .line 396
    :goto_a
    iget-object v4, p0, Lgh/c;->x:Ljava/util/List;

    .line 397
    .line 398
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    if-ge v2, v4, :cond_13

    .line 403
    .line 404
    iget-object v4, p0, Lgh/c;->x:Ljava/util/List;

    .line 405
    .line 406
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    check-cast v4, Lnh/q;

    .line 411
    .line 412
    const/16 v5, 0x14

    .line 413
    .line 414
    invoke-virtual {p1, v5, v4}, Lnh/f;->d0(ILnh/q;)V

    .line 415
    .line 416
    .line 417
    add-int/lit8 v2, v2, 0x1

    .line 418
    .line 419
    goto :goto_a

    .line 420
    :cond_13
    invoke-virtual {p0}, Lgh/c;->x0()Ljava/util/List;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    if-lez v2, :cond_14

    .line 429
    .line 430
    const/16 v2, 0xaa

    .line 431
    .line 432
    invoke-virtual {p1, v2}, Lnh/f;->o0(I)V

    .line 433
    .line 434
    .line 435
    iget v2, p0, Lgh/c;->z:I

    .line 436
    .line 437
    invoke-virtual {p1, v2}, Lnh/f;->o0(I)V

    .line 438
    .line 439
    .line 440
    :cond_14
    move v2, v1

    .line 441
    :goto_b
    iget-object v4, p0, Lgh/c;->y:Ljava/util/List;

    .line 442
    .line 443
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 444
    .line 445
    .line 446
    move-result v4

    .line 447
    if-ge v2, v4, :cond_15

    .line 448
    .line 449
    iget-object v4, p0, Lgh/c;->y:Ljava/util/List;

    .line 450
    .line 451
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    check-cast v4, Ljava/lang/Integer;

    .line 456
    .line 457
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    invoke-virtual {p1, v4}, Lnh/f;->b0(I)V

    .line 462
    .line 463
    .line 464
    add-int/lit8 v2, v2, 0x1

    .line 465
    .line 466
    goto :goto_b

    .line 467
    :cond_15
    invoke-virtual {p0}, Lgh/c;->N0()Ljava/util/List;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    if-lez v2, :cond_16

    .line 476
    .line 477
    const/16 v2, 0xb2

    .line 478
    .line 479
    invoke-virtual {p1, v2}, Lnh/f;->o0(I)V

    .line 480
    .line 481
    .line 482
    iget v2, p0, Lgh/c;->L:I

    .line 483
    .line 484
    invoke-virtual {p1, v2}, Lnh/f;->o0(I)V

    .line 485
    .line 486
    .line 487
    :cond_16
    move v2, v1

    .line 488
    :goto_c
    iget-object v4, p0, Lgh/c;->K:Ljava/util/List;

    .line 489
    .line 490
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    if-ge v2, v4, :cond_17

    .line 495
    .line 496
    iget-object v4, p0, Lgh/c;->K:Ljava/util/List;

    .line 497
    .line 498
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    check-cast v4, Ljava/lang/Integer;

    .line 503
    .line 504
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 505
    .line 506
    .line 507
    move-result v4

    .line 508
    invoke-virtual {p1, v4}, Lnh/f;->b0(I)V

    .line 509
    .line 510
    .line 511
    add-int/lit8 v2, v2, 0x1

    .line 512
    .line 513
    goto :goto_c

    .line 514
    :cond_17
    move v2, v1

    .line 515
    :goto_d
    iget-object v4, p0, Lgh/c;->M:Ljava/util/List;

    .line 516
    .line 517
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    if-ge v2, v4, :cond_18

    .line 522
    .line 523
    iget-object v4, p0, Lgh/c;->M:Ljava/util/List;

    .line 524
    .line 525
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    check-cast v4, Lnh/q;

    .line 530
    .line 531
    const/16 v5, 0x17

    .line 532
    .line 533
    invoke-virtual {p1, v5, v4}, Lnh/f;->d0(ILnh/q;)V

    .line 534
    .line 535
    .line 536
    add-int/lit8 v2, v2, 0x1

    .line 537
    .line 538
    goto :goto_d

    .line 539
    :cond_18
    invoke-virtual {p0}, Lgh/c;->R0()Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    if-lez v2, :cond_19

    .line 548
    .line 549
    const/16 v2, 0xc2

    .line 550
    .line 551
    invoke-virtual {p1, v2}, Lnh/f;->o0(I)V

    .line 552
    .line 553
    .line 554
    iget v2, p0, Lgh/c;->O:I

    .line 555
    .line 556
    invoke-virtual {p1, v2}, Lnh/f;->o0(I)V

    .line 557
    .line 558
    .line 559
    :cond_19
    move v2, v1

    .line 560
    :goto_e
    iget-object v4, p0, Lgh/c;->N:Ljava/util/List;

    .line 561
    .line 562
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 563
    .line 564
    .line 565
    move-result v4

    .line 566
    if-ge v2, v4, :cond_1a

    .line 567
    .line 568
    iget-object v4, p0, Lgh/c;->N:Ljava/util/List;

    .line 569
    .line 570
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    check-cast v4, Ljava/lang/Integer;

    .line 575
    .line 576
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 577
    .line 578
    .line 579
    move-result v4

    .line 580
    invoke-virtual {p1, v4}, Lnh/f;->b0(I)V

    .line 581
    .line 582
    .line 583
    add-int/lit8 v2, v2, 0x1

    .line 584
    .line 585
    goto :goto_e

    .line 586
    :cond_1a
    iget v2, p0, Lgh/c;->n:I

    .line 587
    .line 588
    const/16 v4, 0x40

    .line 589
    .line 590
    and-int/2addr v2, v4

    .line 591
    if-ne v2, v4, :cond_1b

    .line 592
    .line 593
    const/16 v2, 0x1e

    .line 594
    .line 595
    iget-object v4, p0, Lgh/c;->P:Lgh/t;

    .line 596
    .line 597
    invoke-virtual {p1, v2, v4}, Lnh/f;->d0(ILnh/q;)V

    .line 598
    .line 599
    .line 600
    :cond_1b
    :goto_f
    iget-object v2, p0, Lgh/c;->Q:Ljava/util/List;

    .line 601
    .line 602
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 603
    .line 604
    .line 605
    move-result v2

    .line 606
    if-ge v1, v2, :cond_1c

    .line 607
    .line 608
    iget-object v2, p0, Lgh/c;->Q:Ljava/util/List;

    .line 609
    .line 610
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    check-cast v2, Ljava/lang/Integer;

    .line 615
    .line 616
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    const/16 v4, 0x1f

    .line 621
    .line 622
    invoke-virtual {p1, v4, v2}, Lnh/f;->a0(II)V

    .line 623
    .line 624
    .line 625
    add-int/lit8 v1, v1, 0x1

    .line 626
    .line 627
    goto :goto_f

    .line 628
    :cond_1c
    iget v1, p0, Lgh/c;->n:I

    .line 629
    .line 630
    const/16 v2, 0x80

    .line 631
    .line 632
    and-int/2addr v1, v2

    .line 633
    if-ne v1, v2, :cond_1d

    .line 634
    .line 635
    iget-object v1, p0, Lgh/c;->R:Lgh/w;

    .line 636
    .line 637
    invoke-virtual {p1, v3, v1}, Lnh/f;->d0(ILnh/q;)V

    .line 638
    .line 639
    .line 640
    :cond_1d
    const/16 v1, 0x4a38

    .line 641
    .line 642
    invoke-virtual {v0, v1, p1}, Lnh/i$d$a;->a(ILnh/f;)V

    .line 643
    .line 644
    .line 645
    iget-object v0, p0, Lgh/c;->m:Lnh/d;

    .line 646
    .line 647
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 648
    .line 649
    .line 650
    return-void
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
.end method

.method public e1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/r;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->D:Ljava/util/List;

    return-object v0
.end method

.method public f1(I)Lgh/s;
    .locals 1

    iget-object v0, p0, Lgh/c;->r:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/s;

    return-object p1
.end method

.method public bridge synthetic g()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/c;->w1()Lgh/c$b;

    move-result-object v0

    return-object v0
.end method

.method public g1()I
    .locals 1

    iget-object v0, p0, Lgh/c;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/c;->V:Lnh/s;

    return-object v0
.end method

.method public h1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->r:Ljava/util/List;

    return-object v0
.end method

.method public i1()Lgh/t;
    .locals 1

    iget-object v0, p0, Lgh/c;->P:Lgh/t;

    return-object v0
.end method

.method public final j()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lgh/c;->S:B

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
    invoke-virtual {p0}, Lgh/c;->n1()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lgh/c;->S:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    move v0, v2

    .line 21
    :goto_0
    invoke-virtual {p0}, Lgh/c;->g1()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-ge v0, v3, :cond_4

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lgh/c;->f1(I)Lgh/s;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Lgh/s;->j()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    iput-byte v2, p0, Lgh/c;->S:B

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
    move v0, v2

    .line 44
    :goto_1
    invoke-virtual {p0}, Lgh/c;->Z0()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-ge v0, v3, :cond_6

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lgh/c;->Y0(I)Lgh/q;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3}, Lgh/q;->j()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_5

    .line 59
    .line 60
    iput-byte v2, p0, Lgh/c;->S:B

    .line 61
    .line 62
    return v2

    .line 63
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_6
    move v0, v2

    .line 67
    :goto_2
    invoke-virtual {p0}, Lgh/c;->w0()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-ge v0, v3, :cond_8

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lgh/c;->v0(I)Lgh/q;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v3}, Lgh/q;->j()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_7

    .line 82
    .line 83
    iput-byte v2, p0, Lgh/c;->S:B

    .line 84
    .line 85
    return v2

    .line 86
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_8
    move v0, v2

    .line 90
    :goto_3
    invoke-virtual {p0}, Lgh/c;->t0()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-ge v0, v3, :cond_a

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Lgh/c;->s0(I)Lgh/d;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v3}, Lgh/d;->j()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-nez v3, :cond_9

    .line 105
    .line 106
    iput-byte v2, p0, Lgh/c;->S:B

    .line 107
    .line 108
    return v2

    .line 109
    :cond_9
    add-int/lit8 v0, v0, 0x1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_a
    move v0, v2

    .line 113
    :goto_4
    invoke-virtual {p0}, Lgh/c;->H0()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-ge v0, v3, :cond_c

    .line 118
    .line 119
    invoke-virtual {p0, v0}, Lgh/c;->G0(I)Lgh/i;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v3}, Lgh/i;->j()Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-nez v3, :cond_b

    .line 128
    .line 129
    iput-byte v2, p0, Lgh/c;->S:B

    .line 130
    .line 131
    return v2

    .line 132
    :cond_b
    add-int/lit8 v0, v0, 0x1

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_c
    move v0, v2

    .line 136
    :goto_5
    invoke-virtual {p0}, Lgh/c;->V0()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-ge v0, v3, :cond_e

    .line 141
    .line 142
    invoke-virtual {p0, v0}, Lgh/c;->U0(I)Lgh/n;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v3}, Lgh/n;->j()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-nez v3, :cond_d

    .line 151
    .line 152
    iput-byte v2, p0, Lgh/c;->S:B

    .line 153
    .line 154
    return v2

    .line 155
    :cond_d
    add-int/lit8 v0, v0, 0x1

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_e
    move v0, v2

    .line 159
    :goto_6
    invoke-virtual {p0}, Lgh/c;->d1()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-ge v0, v3, :cond_10

    .line 164
    .line 165
    invoke-virtual {p0, v0}, Lgh/c;->c1(I)Lgh/r;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v3}, Lgh/r;->j()Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-nez v3, :cond_f

    .line 174
    .line 175
    iput-byte v2, p0, Lgh/c;->S:B

    .line 176
    .line 177
    return v2

    .line 178
    :cond_f
    add-int/lit8 v0, v0, 0x1

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_10
    move v0, v2

    .line 182
    :goto_7
    invoke-virtual {p0}, Lgh/c;->C0()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-ge v0, v3, :cond_12

    .line 187
    .line 188
    invoke-virtual {p0, v0}, Lgh/c;->B0(I)Lgh/g;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v3}, Lgh/g;->j()Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-nez v3, :cond_11

    .line 197
    .line 198
    iput-byte v2, p0, Lgh/c;->S:B

    .line 199
    .line 200
    return v2

    .line 201
    :cond_11
    add-int/lit8 v0, v0, 0x1

    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_12
    invoke-virtual {p0}, Lgh/c;->p1()Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_13

    .line 209
    .line 210
    invoke-virtual {p0}, Lgh/c;->K0()Lgh/q;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Lgh/q;->j()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_13

    .line 219
    .line 220
    iput-byte v2, p0, Lgh/c;->S:B

    .line 221
    .line 222
    return v2

    .line 223
    :cond_13
    move v0, v2

    .line 224
    :goto_8
    invoke-virtual {p0}, Lgh/c;->P0()I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-ge v0, v3, :cond_15

    .line 229
    .line 230
    invoke-virtual {p0, v0}, Lgh/c;->O0(I)Lgh/q;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-virtual {v3}, Lgh/q;->j()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-nez v3, :cond_14

    .line 239
    .line 240
    iput-byte v2, p0, Lgh/c;->S:B

    .line 241
    .line 242
    return v2

    .line 243
    :cond_14
    add-int/lit8 v0, v0, 0x1

    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_15
    invoke-virtual {p0}, Lgh/c;->r1()Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-eqz v0, :cond_16

    .line 251
    .line 252
    invoke-virtual {p0}, Lgh/c;->i1()Lgh/t;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0}, Lgh/t;->j()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-nez v0, :cond_16

    .line 261
    .line 262
    iput-byte v2, p0, Lgh/c;->S:B

    .line 263
    .line 264
    return v2

    .line 265
    :cond_16
    invoke-virtual {p0}, Lnh/i$d;->t()Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-nez v0, :cond_17

    .line 270
    .line 271
    iput-byte v2, p0, Lgh/c;->S:B

    .line 272
    .line 273
    return v2

    .line 274
    :cond_17
    iput-byte v1, p0, Lgh/c;->S:B

    .line 275
    .line 276
    return v1
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

.method public j1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->Q:Ljava/util/List;

    return-object v0
.end method

.method public k1()Lgh/w;
    .locals 1

    iget-object v0, p0, Lgh/c;->R:Lgh/w;

    return-object v0
.end method

.method public l1()Z
    .locals 2

    iget v0, p0, Lgh/c;->n:I

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

.method public m1()Z
    .locals 2

    iget v0, p0, Lgh/c;->n:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public n1()Z
    .locals 2

    iget v0, p0, Lgh/c;->n:I

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

.method public o1()Z
    .locals 2

    iget v0, p0, Lgh/c;->n:I

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

.method public p1()Z
    .locals 2

    iget v0, p0, Lgh/c;->n:I

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

.method public q1()Z
    .locals 2

    iget v0, p0, Lgh/c;->n:I

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

.method public r0()I
    .locals 1

    iget v0, p0, Lgh/c;->q:I

    return v0
.end method

.method public r1()Z
    .locals 2

    iget v0, p0, Lgh/c;->n:I

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

.method public s0(I)Lgh/d;
    .locals 1

    iget-object v0, p0, Lgh/c;->A:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/d;

    return-object p1
.end method

.method public s1()Z
    .locals 2

    iget v0, p0, Lgh/c;->n:I

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

.method public t0()I
    .locals 1

    iget-object v0, p0, Lgh/c;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public u0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->A:Ljava/util/List;

    return-object v0
.end method

.method public v0(I)Lgh/q;
    .locals 1

    iget-object v0, p0, Lgh/c;->x:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/q;

    return-object p1
.end method

.method public w0()I
    .locals 1

    iget-object v0, p0, Lgh/c;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public w1()Lgh/c$b;
    .locals 1

    invoke-static {}, Lgh/c;->u1()Lgh/c$b;

    move-result-object v0

    return-object v0
.end method

.method public x0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->y:Ljava/util/List;

    return-object v0
.end method

.method public y0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgh/q;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgh/c;->x:Ljava/util/List;

    return-object v0
.end method

.method public y1()Lgh/c$b;
    .locals 1

    invoke-static {p0}, Lgh/c;->v1(Lgh/c;)Lgh/c$b;

    move-result-object v0

    return-object v0
.end method
