.class public final Lgh/f;
.super Lnh/i;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/f$b;,
        Lgh/f$d;,
        Lgh/f$c;
    }
.end annotation


# static fields
.field private static final t:Lgh/f;

.field public static u:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final l:Lnh/d;

.field private m:I

.field private n:Lgh/f$c;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgh/h;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lgh/h;

.field private q:Lgh/f$d;

.field private r:B

.field private s:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/f$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/f$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/f;->u:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/f;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/f;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/f;->t:Lgh/f;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/f;->I()V

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
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lgh/f;->r:B

    .line 13
    iput v0, p0, Lgh/f;->s:I

    .line 14
    invoke-direct {p0}, Lgh/f;->I()V

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

    if-nez v3, :cond_c

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v6

    if-eqz v6, :cond_a

    const/16 v7, 0x8

    if-eq v6, v7, :cond_8

    const/16 v7, 0x12

    if-eq v6, v7, :cond_6

    const/16 v7, 0x1a

    if-eq v6, v7, :cond_3

    const/16 v7, 0x20

    if-eq v6, v7, :cond_1

    .line 18
    invoke-virtual {p0, p1, v2, p2, v6}, Lnh/i;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_2

    .line 19
    :cond_1
    invoke-virtual {p1}, Lnh/e;->n()I

    move-result v7

    .line 20
    invoke-static {v7}, Lgh/f$d;->a(I)Lgh/f$d;

    move-result-object v8

    if-nez v8, :cond_2

    .line 21
    invoke-virtual {v2, v6}, Lnh/f;->o0(I)V

    .line 22
    invoke-virtual {v2, v7}, Lnh/f;->o0(I)V

    goto :goto_0

    .line 23
    :cond_2
    iget v6, p0, Lgh/f;->m:I

    or-int/lit8 v6, v6, 0x4

    iput v6, p0, Lgh/f;->m:I

    .line 24
    iput-object v8, p0, Lgh/f;->q:Lgh/f$d;

    goto :goto_0

    .line 25
    :cond_3
    iget v6, p0, Lgh/f;->m:I

    and-int/2addr v6, v5

    if-ne v6, v5, :cond_4

    .line 26
    iget-object v6, p0, Lgh/f;->p:Lgh/h;

    invoke-virtual {v6}, Lgh/h;->W()Lgh/h$b;

    move-result-object v6

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    .line 27
    :goto_1
    sget-object v7, Lgh/h;->x:Lnh/s;

    invoke-virtual {p1, v7, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v7

    check-cast v7, Lgh/h;

    iput-object v7, p0, Lgh/f;->p:Lgh/h;

    if-eqz v6, :cond_5

    .line 28
    invoke-virtual {v6, v7}, Lgh/h$b;->z(Lgh/h;)Lgh/h$b;

    .line 29
    invoke-virtual {v6}, Lgh/h$b;->t()Lgh/h;

    move-result-object v6

    iput-object v6, p0, Lgh/f;->p:Lgh/h;

    .line 30
    :cond_5
    iget v6, p0, Lgh/f;->m:I

    or-int/2addr v6, v5

    iput v6, p0, Lgh/f;->m:I

    goto :goto_0

    :cond_6
    and-int/lit8 v6, v4, 0x2

    if-eq v6, v5, :cond_7

    .line 31
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lgh/f;->o:Ljava/util/List;

    or-int/lit8 v4, v4, 0x2

    .line 32
    :cond_7
    iget-object v6, p0, Lgh/f;->o:Ljava/util/List;

    sget-object v7, Lgh/h;->x:Lnh/s;

    invoke-virtual {p1, v7, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 33
    :cond_8
    invoke-virtual {p1}, Lnh/e;->n()I

    move-result v7

    .line 34
    invoke-static {v7}, Lgh/f$c;->a(I)Lgh/f$c;

    move-result-object v8

    if-nez v8, :cond_9

    .line 35
    invoke-virtual {v2, v6}, Lnh/f;->o0(I)V

    .line 36
    invoke-virtual {v2, v7}, Lnh/f;->o0(I)V

    goto/16 :goto_0

    .line 37
    :cond_9
    iget v6, p0, Lgh/f;->m:I

    or-int/2addr v6, v1

    iput v6, p0, Lgh/f;->m:I

    .line 38
    iput-object v8, p0, Lgh/f;->n:Lgh/f$c;
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_a
    :goto_2
    move v3, v1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

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

    :goto_3
    and-int/lit8 p2, v4, 0x2

    if-ne p2, v5, :cond_b

    .line 42
    iget-object p2, p0, Lgh/f;->o:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lgh/f;->o:Ljava/util/List;

    .line 43
    :cond_b
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 44
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/f;->l:Lnh/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/f;->l:Lnh/d;

    .line 45
    throw p1

    .line 46
    :goto_4
    invoke-virtual {p0}, Lnh/i;->n()V

    .line 47
    throw p1

    :cond_c
    and-int/lit8 p1, v4, 0x2

    if-ne p1, v5, :cond_d

    .line 48
    iget-object p1, p0, Lgh/f;->o:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgh/f;->o:Ljava/util/List;

    .line 49
    :cond_d
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 50
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/f;->l:Lnh/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/f;->l:Lnh/d;

    .line 51
    throw p1

    .line 52
    :goto_5
    invoke-virtual {p0}, Lnh/i;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/f;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lnh/i;-><init>(Lnh/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lgh/f;->r:B

    .line 5
    iput v0, p0, Lgh/f;->s:I

    .line 6
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/f;->l:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$b;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/f;-><init>(Lnh/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lgh/f;->r:B

    .line 9
    iput p1, p0, Lgh/f;->s:I

    .line 10
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/f;->l:Lnh/d;

    return-void
.end method

.method public static A()Lgh/f;
    .locals 1

    sget-object v0, Lgh/f;->t:Lgh/f;

    return-object v0
.end method

.method private I()V
    .locals 1

    .line 1
    sget-object v0, Lgh/f$c;->l:Lgh/f$c;

    .line 2
    .line 3
    iput-object v0, p0, Lgh/f;->n:Lgh/f$c;

    .line 4
    .line 5
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lgh/f;->o:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {}, Lgh/h;->G()Lgh/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lgh/f;->p:Lgh/h;

    .line 16
    .line 17
    sget-object v0, Lgh/f$d;->l:Lgh/f$d;

    .line 18
    .line 19
    iput-object v0, p0, Lgh/f;->q:Lgh/f$d;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method public static J()Lgh/f$b;
    .locals 1

    invoke-static {}, Lgh/f$b;->r()Lgh/f$b;

    move-result-object v0

    return-object v0
.end method

.method public static K(Lgh/f;)Lgh/f$b;
    .locals 1

    invoke-static {}, Lgh/f;->J()Lgh/f$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/f$b;->z(Lgh/f;)Lgh/f$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(Lgh/f;Lgh/f$c;)Lgh/f$c;
    .locals 0

    iput-object p1, p0, Lgh/f;->n:Lgh/f$c;

    return-object p1
.end method

.method static synthetic t(Lgh/f;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lgh/f;->o:Ljava/util/List;

    return-object p0
.end method

.method static synthetic u(Lgh/f;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lgh/f;->o:Ljava/util/List;

    return-object p1
.end method

.method static synthetic v(Lgh/f;Lgh/h;)Lgh/h;
    .locals 0

    iput-object p1, p0, Lgh/f;->p:Lgh/h;

    return-object p1
.end method

.method static synthetic w(Lgh/f;Lgh/f$d;)Lgh/f$d;
    .locals 0

    iput-object p1, p0, Lgh/f;->q:Lgh/f$d;

    return-object p1
.end method

.method static synthetic x(Lgh/f;I)I
    .locals 0

    iput p1, p0, Lgh/f;->m:I

    return p1
.end method

.method static synthetic y(Lgh/f;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/f;->l:Lnh/d;

    return-object p0
.end method


# virtual methods
.method public B(I)Lgh/h;
    .locals 1

    iget-object v0, p0, Lgh/f;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgh/h;

    return-object p1
.end method

.method public C()I
    .locals 1

    iget-object v0, p0, Lgh/f;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public D()Lgh/f$c;
    .locals 1

    iget-object v0, p0, Lgh/f;->n:Lgh/f$c;

    return-object v0
.end method

.method public E()Lgh/f$d;
    .locals 1

    iget-object v0, p0, Lgh/f;->q:Lgh/f$d;

    return-object v0
.end method

.method public F()Z
    .locals 2

    iget v0, p0, Lgh/f;->m:I

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

.method public G()Z
    .locals 2

    iget v0, p0, Lgh/f;->m:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public H()Z
    .locals 2

    iget v0, p0, Lgh/f;->m:I

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

.method public L()Lgh/f$b;
    .locals 1

    invoke-static {}, Lgh/f;->J()Lgh/f$b;

    move-result-object v0

    return-object v0
.end method

.method public M()Lgh/f$b;
    .locals 1

    invoke-static {p0}, Lgh/f;->K(Lgh/f;)Lgh/f$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/f;->M()Lgh/f$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 4

    .line 1
    iget v0, p0, Lgh/f;->s:I

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
    iget v0, p0, Lgh/f;->m:I

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
    iget-object v0, p0, Lgh/f;->n:Lgh/f$c;

    .line 15
    .line 16
    invoke-virtual {v0}, Lgh/f$c;->getNumber()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v1, v0}, Lnh/f;->h(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v2

    .line 27
    :goto_0
    iget-object v1, p0, Lgh/f;->o:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v3, 0x2

    .line 34
    if-ge v2, v1, :cond_2

    .line 35
    .line 36
    iget-object v1, p0, Lgh/f;->o:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lnh/q;

    .line 43
    .line 44
    invoke-static {v3, v1}, Lnh/f;->s(ILnh/q;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/2addr v0, v1

    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iget v1, p0, Lgh/f;->m:I

    .line 53
    .line 54
    and-int/2addr v1, v3

    .line 55
    if-ne v1, v3, :cond_3

    .line 56
    .line 57
    const/4 v1, 0x3

    .line 58
    iget-object v2, p0, Lgh/f;->p:Lgh/h;

    .line 59
    .line 60
    invoke-static {v1, v2}, Lnh/f;->s(ILnh/q;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v0, v1

    .line 65
    :cond_3
    iget v1, p0, Lgh/f;->m:I

    .line 66
    .line 67
    const/4 v2, 0x4

    .line 68
    and-int/2addr v1, v2

    .line 69
    if-ne v1, v2, :cond_4

    .line 70
    .line 71
    iget-object v1, p0, Lgh/f;->q:Lgh/f$d;

    .line 72
    .line 73
    invoke-virtual {v1}, Lgh/f$d;->getNumber()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-static {v2, v1}, Lnh/f;->h(II)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    add-int/2addr v0, v1

    .line 82
    :cond_4
    iget-object v1, p0, Lgh/f;->l:Lnh/d;

    .line 83
    .line 84
    invoke-virtual {v1}, Lnh/d;->size()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    add-int/2addr v0, v1

    .line 89
    iput v0, p0, Lgh/f;->s:I

    .line 90
    .line 91
    return v0
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
    invoke-virtual {p0}, Lgh/f;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lgh/f;->m:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lgh/f;->n:Lgh/f$c;

    .line 11
    .line 12
    invoke-virtual {v0}, Lgh/f$c;->getNumber()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1, v1, v0}, Lnh/f;->S(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iget-object v1, p0, Lgh/f;->o:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x2

    .line 27
    if-ge v0, v1, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, Lgh/f;->o:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lnh/q;

    .line 36
    .line 37
    invoke-virtual {p1, v2, v1}, Lnh/f;->d0(ILnh/q;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget v0, p0, Lgh/f;->m:I

    .line 44
    .line 45
    and-int/2addr v0, v2

    .line 46
    if-ne v0, v2, :cond_2

    .line 47
    .line 48
    const/4 v0, 0x3

    .line 49
    iget-object v1, p0, Lgh/f;->p:Lgh/h;

    .line 50
    .line 51
    invoke-virtual {p1, v0, v1}, Lnh/f;->d0(ILnh/q;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    iget v0, p0, Lgh/f;->m:I

    .line 55
    .line 56
    const/4 v1, 0x4

    .line 57
    and-int/2addr v0, v1

    .line 58
    if-ne v0, v1, :cond_3

    .line 59
    .line 60
    iget-object v0, p0, Lgh/f;->q:Lgh/f$d;

    .line 61
    .line 62
    invoke-virtual {v0}, Lgh/f$d;->getNumber()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p1, v1, v0}, Lnh/f;->S(II)V

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object v0, p0, Lgh/f;->l:Lnh/d;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 72
    .line 73
    .line 74
    return-void
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

    invoke-virtual {p0}, Lgh/f;->L()Lgh/f$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/f;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/f;->u:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lgh/f;->r:B

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
    invoke-virtual {p0}, Lgh/f;->C()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v0, v3, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lgh/f;->B(I)Lgh/h;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lgh/h;->j()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    iput-byte v2, p0, Lgh/f;->r:B

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
    invoke-virtual {p0}, Lgh/f;->F()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    invoke-virtual {p0}, Lgh/f;->z()Lgh/h;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lgh/h;->j()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    iput-byte v2, p0, Lgh/f;->r:B

    .line 51
    .line 52
    return v2

    .line 53
    :cond_4
    iput-byte v1, p0, Lgh/f;->r:B

    .line 54
    .line 55
    return v1
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

.method public z()Lgh/h;
    .locals 1

    iget-object v0, p0, Lgh/f;->p:Lgh/h;

    return-object v0
.end method
