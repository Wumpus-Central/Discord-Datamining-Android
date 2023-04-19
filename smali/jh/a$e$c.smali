.class public final Ljh/a$e$c;
.super Lnh/i;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljh/a$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljh/a$e$c$b;,
        Ljh/a$e$c$c;
    }
.end annotation


# static fields
.field private static final x:Ljh/a$e$c;

.field public static y:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Ljh/a$e$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final l:Lnh/d;

.field private m:I

.field private n:I

.field private o:I

.field private p:Ljava/lang/Object;

.field private q:Ljh/a$e$c$c;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private s:I

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
    new-instance v0, Ljh/a$e$c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljh/a$e$c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljh/a$e$c;->y:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Ljh/a$e$c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Ljh/a$e$c;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ljh/a$e$c;->x:Ljh/a$e$c;

    .line 15
    .line 16
    invoke-direct {v0}, Ljh/a$e$c;->R()V

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

    .line 15
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 v0, -0x1

    .line 16
    iput v0, p0, Ljh/a$e$c;->s:I

    .line 17
    iput v0, p0, Ljh/a$e$c;->u:I

    .line 18
    iput-byte v0, p0, Ljh/a$e$c;->v:B

    .line 19
    iput v0, p0, Ljh/a$e$c;->w:I

    .line 20
    invoke-direct {p0}, Ljh/a$e$c;->R()V

    .line 21
    invoke-static {}, Lnh/d;->w()Lnh/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 22
    invoke-static {v0, v1}, Lnh/f;->J(Ljava/io/OutputStream;I)Lnh/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x20

    const/16 v6, 0x10

    if-nez v3, :cond_13

    .line 23
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v7

    if-eqz v7, :cond_10

    const/16 v8, 0x8

    if-eq v7, v8, :cond_f

    if-eq v7, v6, :cond_e

    const/16 v9, 0x18

    if-eq v7, v9, :cond_c

    if-eq v7, v5, :cond_a

    const/16 v8, 0x22

    if-eq v7, v8, :cond_7

    const/16 v8, 0x28

    if-eq v7, v8, :cond_5

    const/16 v8, 0x2a

    if-eq v7, v8, :cond_2

    const/16 v8, 0x32

    if-eq v7, v8, :cond_1

    .line 24
    invoke-virtual {p0, p1, v2, p2, v7}, Lnh/i;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_3

    .line 25
    :cond_1
    invoke-virtual {p1}, Lnh/e;->l()Lnh/d;

    move-result-object v7

    .line 26
    iget v8, p0, Ljh/a$e$c;->m:I

    or-int/lit8 v8, v8, 0x4

    iput v8, p0, Ljh/a$e$c;->m:I

    .line 27
    iput-object v7, p0, Ljh/a$e$c;->p:Ljava/lang/Object;

    goto :goto_0

    .line 28
    :cond_2
    invoke-virtual {p1}, Lnh/e;->A()I

    move-result v7

    .line 29
    invoke-virtual {p1, v7}, Lnh/e;->j(I)I

    move-result v7

    and-int/lit8 v8, v4, 0x20

    if-eq v8, v5, :cond_3

    .line 30
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v8

    if-lez v8, :cond_3

    .line 31
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Ljh/a$e$c;->t:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    .line 32
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v8

    if-lez v8, :cond_4

    .line 33
    iget-object v8, p0, Ljh/a$e$c;->t:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 34
    :cond_4
    invoke-virtual {p1, v7}, Lnh/e;->i(I)V

    goto :goto_0

    :cond_5
    and-int/lit8 v7, v4, 0x20

    if-eq v7, v5, :cond_6

    .line 35
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Ljh/a$e$c;->t:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    .line 36
    :cond_6
    iget-object v7, p0, Ljh/a$e$c;->t:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 37
    :cond_7
    invoke-virtual {p1}, Lnh/e;->A()I

    move-result v7

    .line 38
    invoke-virtual {p1, v7}, Lnh/e;->j(I)I

    move-result v7

    and-int/lit8 v8, v4, 0x10

    if-eq v8, v6, :cond_8

    .line 39
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v8

    if-lez v8, :cond_8

    .line 40
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Ljh/a$e$c;->r:Ljava/util/List;

    or-int/lit8 v4, v4, 0x10

    .line 41
    :cond_8
    :goto_2
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v8

    if-lez v8, :cond_9

    .line 42
    iget-object v8, p0, Ljh/a$e$c;->r:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 43
    :cond_9
    invoke-virtual {p1, v7}, Lnh/e;->i(I)V

    goto/16 :goto_0

    :cond_a
    and-int/lit8 v7, v4, 0x10

    if-eq v7, v6, :cond_b

    .line 44
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Ljh/a$e$c;->r:Ljava/util/List;

    or-int/lit8 v4, v4, 0x10

    .line 45
    :cond_b
    iget-object v7, p0, Ljh/a$e$c;->r:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 46
    :cond_c
    invoke-virtual {p1}, Lnh/e;->n()I

    move-result v9

    .line 47
    invoke-static {v9}, Ljh/a$e$c$c;->a(I)Ljh/a$e$c$c;

    move-result-object v10

    if-nez v10, :cond_d

    .line 48
    invoke-virtual {v2, v7}, Lnh/f;->o0(I)V

    .line 49
    invoke-virtual {v2, v9}, Lnh/f;->o0(I)V

    goto/16 :goto_0

    .line 50
    :cond_d
    iget v7, p0, Ljh/a$e$c;->m:I

    or-int/2addr v7, v8

    iput v7, p0, Ljh/a$e$c;->m:I

    .line 51
    iput-object v10, p0, Ljh/a$e$c;->q:Ljh/a$e$c$c;

    goto/16 :goto_0

    .line 52
    :cond_e
    iget v7, p0, Ljh/a$e$c;->m:I

    or-int/lit8 v7, v7, 0x2

    iput v7, p0, Ljh/a$e$c;->m:I

    .line 53
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v7

    iput v7, p0, Ljh/a$e$c;->o:I

    goto/16 :goto_0

    .line 54
    :cond_f
    iget v7, p0, Ljh/a$e$c;->m:I

    or-int/2addr v7, v1

    iput v7, p0, Ljh/a$e$c;->m:I

    .line 55
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v7

    iput v7, p0, Ljh/a$e$c;->n:I
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_10
    :goto_3
    move v3, v1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    .line 56
    :try_start_1
    new-instance p2, Lnh/k;

    .line 57
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 58
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    and-int/lit8 p2, v4, 0x10

    if-ne p2, v6, :cond_11

    .line 59
    iget-object p2, p0, Ljh/a$e$c;->r:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Ljh/a$e$c;->r:Ljava/util/List;

    :cond_11
    and-int/lit8 p2, v4, 0x20

    if-ne p2, v5, :cond_12

    .line 60
    iget-object p2, p0, Ljh/a$e$c;->t:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Ljh/a$e$c;->t:Ljava/util/List;

    .line 61
    :cond_12
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 62
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Ljh/a$e$c;->l:Lnh/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Ljh/a$e$c;->l:Lnh/d;

    .line 63
    throw p1

    .line 64
    :goto_5
    invoke-virtual {p0}, Lnh/i;->n()V

    .line 65
    throw p1

    :cond_13
    and-int/lit8 p1, v4, 0x10

    if-ne p1, v6, :cond_14

    .line 66
    iget-object p1, p0, Ljh/a$e$c;->r:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ljh/a$e$c;->r:Ljava/util/List;

    :cond_14
    and-int/lit8 p1, v4, 0x20

    if-ne p1, v5, :cond_15

    .line 67
    iget-object p1, p0, Ljh/a$e$c;->t:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ljh/a$e$c;->t:Ljava/util/List;

    .line 68
    :cond_15
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 69
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Ljh/a$e$c;->l:Lnh/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Ljh/a$e$c;->l:Lnh/d;

    .line 70
    throw p1

    .line 71
    :goto_6
    invoke-virtual {p0}, Lnh/i;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Ljh/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljh/a$e$c;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lnh/i;-><init>(Lnh/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Ljh/a$e$c;->s:I

    .line 5
    iput v0, p0, Ljh/a$e$c;->u:I

    .line 6
    iput-byte v0, p0, Ljh/a$e$c;->v:B

    .line 7
    iput v0, p0, Ljh/a$e$c;->w:I

    .line 8
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Ljh/a$e$c;->l:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$b;Ljh/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ljh/a$e$c;-><init>(Lnh/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 9
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 p1, -0x1

    .line 10
    iput p1, p0, Ljh/a$e$c;->s:I

    .line 11
    iput p1, p0, Ljh/a$e$c;->u:I

    .line 12
    iput-byte p1, p0, Ljh/a$e$c;->v:B

    .line 13
    iput p1, p0, Ljh/a$e$c;->w:I

    .line 14
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Ljh/a$e$c;->l:Lnh/d;

    return-void
.end method

.method static synthetic A(Ljh/a$e$c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Ljh/a$e$c;->r:Ljava/util/List;

    return-object p1
.end method

.method static synthetic B(Ljh/a$e$c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ljh/a$e$c;->t:Ljava/util/List;

    return-object p0
.end method

.method static synthetic C(Ljh/a$e$c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Ljh/a$e$c;->t:Ljava/util/List;

    return-object p1
.end method

.method public static D()Ljh/a$e$c;
    .locals 1

    sget-object v0, Ljh/a$e$c;->x:Ljh/a$e$c;

    return-object v0
.end method

.method private R()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ljh/a$e$c;->n:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ljh/a$e$c;->o:I

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    iput-object v0, p0, Ljh/a$e$c;->p:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v0, Ljh/a$e$c$c;->l:Ljh/a$e$c$c;

    .line 12
    .line 13
    iput-object v0, p0, Ljh/a$e$c;->q:Ljh/a$e$c$c;

    .line 14
    .line 15
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Ljh/a$e$c;->r:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Ljh/a$e$c;->t:Ljava/util/List;

    .line 26
    .line 27
    return-void
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

.method public static S()Ljh/a$e$c$b;
    .locals 1

    invoke-static {}, Ljh/a$e$c$b;->r()Ljh/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public static T(Ljh/a$e$c;)Ljh/a$e$c$b;
    .locals 1

    invoke-static {}, Ljh/a$e$c;->S()Ljh/a$e$c$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljh/a$e$c$b;->z(Ljh/a$e$c;)Ljh/a$e$c$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(Ljh/a$e$c;I)I
    .locals 0

    iput p1, p0, Ljh/a$e$c;->m:I

    return p1
.end method

.method static synthetic t(Ljh/a$e$c;)Lnh/d;
    .locals 0

    iget-object p0, p0, Ljh/a$e$c;->l:Lnh/d;

    return-object p0
.end method

.method static synthetic u(Ljh/a$e$c;I)I
    .locals 0

    iput p1, p0, Ljh/a$e$c;->n:I

    return p1
.end method

.method static synthetic v(Ljh/a$e$c;I)I
    .locals 0

    iput p1, p0, Ljh/a$e$c;->o:I

    return p1
.end method

.method static synthetic w(Ljh/a$e$c;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ljh/a$e$c;->p:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic x(Ljh/a$e$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iput-object p1, p0, Ljh/a$e$c;->p:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic y(Ljh/a$e$c;Ljh/a$e$c$c;)Ljh/a$e$c$c;
    .locals 0

    iput-object p1, p0, Ljh/a$e$c;->q:Ljh/a$e$c$c;

    return-object p1
.end method

.method static synthetic z(Ljh/a$e$c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ljh/a$e$c;->r:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public E()Ljh/a$e$c$c;
    .locals 1

    iget-object v0, p0, Ljh/a$e$c;->q:Ljh/a$e$c$c;

    return-object v0
.end method

.method public F()I
    .locals 1

    iget v0, p0, Ljh/a$e$c;->o:I

    return v0
.end method

.method public G()I
    .locals 1

    iget v0, p0, Ljh/a$e$c;->n:I

    return v0
.end method

.method public H()I
    .locals 1

    iget-object v0, p0, Ljh/a$e$c;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public I()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ljh/a$e$c;->t:Ljava/util/List;

    return-object v0
.end method

.method public J()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Ljh/a$e$c;->p:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lnh/d;

    .line 11
    .line 12
    invoke-virtual {v0}, Lnh/d;->C()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, Lnh/d;->t()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iput-object v1, p0, Ljh/a$e$c;->p:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_1
    return-object v1
.end method

.method public K()Lnh/d;
    .locals 2

    .line 1
    iget-object v0, p0, Ljh/a$e$c;->p:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lnh/d;->l(Ljava/lang/String;)Lnh/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Ljh/a$e$c;->p:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lnh/d;

    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public L()I
    .locals 1

    iget-object v0, p0, Ljh/a$e$c;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public M()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ljh/a$e$c;->r:Ljava/util/List;

    return-object v0
.end method

.method public N()Z
    .locals 2

    iget v0, p0, Ljh/a$e$c;->m:I

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

.method public O()Z
    .locals 2

    iget v0, p0, Ljh/a$e$c;->m:I

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

.method public P()Z
    .locals 2

    iget v0, p0, Ljh/a$e$c;->m:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public Q()Z
    .locals 2

    iget v0, p0, Ljh/a$e$c;->m:I

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

.method public U()Ljh/a$e$c$b;
    .locals 1

    invoke-static {}, Ljh/a$e$c;->S()Ljh/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public V()Ljh/a$e$c$b;
    .locals 1

    invoke-static {p0}, Ljh/a$e$c;->T(Ljh/a$e$c;)Ljh/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Ljh/a$e$c;->V()Ljh/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 5

    .line 1
    iget v0, p0, Ljh/a$e$c;->w:I

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
    iget v0, p0, Ljh/a$e$c;->m:I

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
    iget v0, p0, Ljh/a$e$c;->n:I

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
    iget v1, p0, Ljh/a$e$c;->m:I

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    and-int/2addr v1, v3

    .line 27
    if-ne v1, v3, :cond_2

    .line 28
    .line 29
    iget v1, p0, Ljh/a$e$c;->o:I

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
    iget v1, p0, Ljh/a$e$c;->m:I

    .line 37
    .line 38
    const/16 v3, 0x8

    .line 39
    .line 40
    and-int/2addr v1, v3

    .line 41
    if-ne v1, v3, :cond_3

    .line 42
    .line 43
    iget-object v1, p0, Ljh/a$e$c;->q:Ljh/a$e$c$c;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljh/a$e$c$c;->getNumber()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v3, 0x3

    .line 50
    invoke-static {v3, v1}, Lnh/f;->h(II)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    add-int/2addr v0, v1

    .line 55
    :cond_3
    move v1, v2

    .line 56
    move v3, v1

    .line 57
    :goto_1
    iget-object v4, p0, Ljh/a$e$c;->r:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-ge v1, v4, :cond_4

    .line 64
    .line 65
    iget-object v4, p0, Ljh/a$e$c;->r:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-static {v4}, Lnh/f;->p(I)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    add-int/2addr v3, v4

    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    add-int/2addr v0, v3

    .line 86
    invoke-virtual {p0}, Ljh/a$e$c;->M()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_5

    .line 95
    .line 96
    add-int/lit8 v0, v0, 0x1

    .line 97
    .line 98
    invoke-static {v3}, Lnh/f;->p(I)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    add-int/2addr v0, v1

    .line 103
    :cond_5
    iput v3, p0, Ljh/a$e$c;->s:I

    .line 104
    .line 105
    move v1, v2

    .line 106
    :goto_2
    iget-object v3, p0, Ljh/a$e$c;->t:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-ge v2, v3, :cond_6

    .line 113
    .line 114
    iget-object v3, p0, Ljh/a$e$c;->t:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, Ljava/lang/Integer;

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-static {v3}, Lnh/f;->p(I)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    add-int/2addr v1, v3

    .line 131
    add-int/lit8 v2, v2, 0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    add-int/2addr v0, v1

    .line 135
    invoke-virtual {p0}, Ljh/a$e$c;->I()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-nez v2, :cond_7

    .line 144
    .line 145
    add-int/lit8 v0, v0, 0x1

    .line 146
    .line 147
    invoke-static {v1}, Lnh/f;->p(I)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    add-int/2addr v0, v2

    .line 152
    :cond_7
    iput v1, p0, Ljh/a$e$c;->u:I

    .line 153
    .line 154
    iget v1, p0, Ljh/a$e$c;->m:I

    .line 155
    .line 156
    const/4 v2, 0x4

    .line 157
    and-int/2addr v1, v2

    .line 158
    if-ne v1, v2, :cond_8

    .line 159
    .line 160
    const/4 v1, 0x6

    .line 161
    invoke-virtual {p0}, Ljh/a$e$c;->K()Lnh/d;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-static {v1, v2}, Lnh/f;->d(ILnh/d;)I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    add-int/2addr v0, v1

    .line 170
    :cond_8
    iget-object v1, p0, Ljh/a$e$c;->l:Lnh/d;

    .line 171
    .line 172
    invoke-virtual {v1}, Lnh/d;->size()I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    add-int/2addr v0, v1

    .line 177
    iput v0, p0, Ljh/a$e$c;->w:I

    .line 178
    .line 179
    return v0
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
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljh/a$e$c;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ljh/a$e$c;->m:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Ljh/a$e$c;->n:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lnh/f;->a0(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Ljh/a$e$c;->m:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Ljh/a$e$c;->o:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lnh/f;->a0(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, Ljh/a$e$c;->m:I

    .line 27
    .line 28
    const/16 v1, 0x8

    .line 29
    .line 30
    and-int/2addr v0, v1

    .line 31
    if-ne v0, v1, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Ljh/a$e$c;->q:Ljh/a$e$c$c;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljh/a$e$c$c;->getNumber()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x3

    .line 40
    invoke-virtual {p1, v1, v0}, Lnh/f;->S(II)V

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, Ljh/a$e$c;->M()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-lez v0, :cond_3

    .line 52
    .line 53
    const/16 v0, 0x22

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lnh/f;->o0(I)V

    .line 56
    .line 57
    .line 58
    iget v0, p0, Ljh/a$e$c;->s:I

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Lnh/f;->o0(I)V

    .line 61
    .line 62
    .line 63
    :cond_3
    const/4 v0, 0x0

    .line 64
    move v1, v0

    .line 65
    :goto_0
    iget-object v2, p0, Ljh/a$e$c;->r:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-ge v1, v2, :cond_4

    .line 72
    .line 73
    iget-object v2, p0, Ljh/a$e$c;->r:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {p1, v2}, Lnh/f;->b0(I)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    invoke-virtual {p0}, Ljh/a$e$c;->I()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-lez v1, :cond_5

    .line 100
    .line 101
    const/16 v1, 0x2a

    .line 102
    .line 103
    invoke-virtual {p1, v1}, Lnh/f;->o0(I)V

    .line 104
    .line 105
    .line 106
    iget v1, p0, Ljh/a$e$c;->u:I

    .line 107
    .line 108
    invoke-virtual {p1, v1}, Lnh/f;->o0(I)V

    .line 109
    .line 110
    .line 111
    :cond_5
    :goto_1
    iget-object v1, p0, Ljh/a$e$c;->t:Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-ge v0, v1, :cond_6

    .line 118
    .line 119
    iget-object v1, p0, Ljh/a$e$c;->t:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    check-cast v1, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    invoke-virtual {p1, v1}, Lnh/f;->b0(I)V

    .line 132
    .line 133
    .line 134
    add-int/lit8 v0, v0, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_6
    iget v0, p0, Ljh/a$e$c;->m:I

    .line 138
    .line 139
    const/4 v1, 0x4

    .line 140
    and-int/2addr v0, v1

    .line 141
    if-ne v0, v1, :cond_7

    .line 142
    .line 143
    const/4 v0, 0x6

    .line 144
    invoke-virtual {p0}, Ljh/a$e$c;->K()Lnh/d;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {p1, v0, v1}, Lnh/f;->O(ILnh/d;)V

    .line 149
    .line 150
    .line 151
    :cond_7
    iget-object v0, p0, Ljh/a$e$c;->l:Lnh/d;

    .line 152
    .line 153
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 154
    .line 155
    .line 156
    return-void
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

    invoke-virtual {p0}, Ljh/a$e$c;->U()Ljh/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Ljh/a$e$c;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljh/a$e$c;->y:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Ljh/a$e$c;->v:B

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
    iput-byte v1, p0, Ljh/a$e$c;->v:B

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
