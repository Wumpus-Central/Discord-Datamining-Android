.class public final Ljh/a$e;
.super Lnh/i;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljh/a$e$b;,
        Ljh/a$e$c;
    }
.end annotation


# static fields
.field private static final r:Ljh/a$e;

.field public static s:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Ljh/a$e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final l:Lnh/d;

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljh/a$e$c;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private o:I

.field private p:B

.field private q:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljh/a$e$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljh/a$e$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljh/a$e;->s:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Ljh/a$e;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Ljh/a$e;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ljh/a$e;->r:Ljh/a$e;

    .line 15
    .line 16
    invoke-direct {v0}, Ljh/a$e;->A()V

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

    .line 13
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 v0, -0x1

    .line 14
    iput v0, p0, Ljh/a$e;->o:I

    .line 15
    iput-byte v0, p0, Ljh/a$e;->p:B

    .line 16
    iput v0, p0, Ljh/a$e;->q:I

    .line 17
    invoke-direct {p0}, Ljh/a$e;->A()V

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
    const/4 v5, 0x2

    if-nez v3, :cond_b

    .line 20
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v6

    if-eqz v6, :cond_8

    const/16 v7, 0xa

    if-eq v6, v7, :cond_6

    const/16 v7, 0x28

    if-eq v6, v7, :cond_4

    const/16 v7, 0x2a

    if-eq v6, v7, :cond_1

    .line 21
    invoke-virtual {p0, p1, v2, p2, v6}, Lnh/i;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_2

    .line 22
    :cond_1
    invoke-virtual {p1}, Lnh/e;->A()I

    move-result v6

    .line 23
    invoke-virtual {p1, v6}, Lnh/e;->j(I)I

    move-result v6

    and-int/lit8 v7, v4, 0x2

    if-eq v7, v5, :cond_2

    .line 24
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v7

    if-lez v7, :cond_2

    .line 25
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Ljh/a$e;->n:Ljava/util/List;

    or-int/lit8 v4, v4, 0x2

    .line 26
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lnh/e;->e()I

    move-result v7

    if-lez v7, :cond_3

    .line 27
    iget-object v7, p0, Ljh/a$e;->n:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 28
    :cond_3
    invoke-virtual {p1, v6}, Lnh/e;->i(I)V

    goto :goto_0

    :cond_4
    and-int/lit8 v6, v4, 0x2

    if-eq v6, v5, :cond_5

    .line 29
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Ljh/a$e;->n:Ljava/util/List;

    or-int/lit8 v4, v4, 0x2

    .line 30
    :cond_5
    iget-object v6, p0, Ljh/a$e;->n:Ljava/util/List;

    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    and-int/lit8 v6, v4, 0x1

    if-eq v6, v1, :cond_7

    .line 31
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Ljh/a$e;->m:Ljava/util/List;

    or-int/lit8 v4, v4, 0x1

    .line 32
    :cond_7
    iget-object v6, p0, Ljh/a$e;->m:Ljava/util/List;

    sget-object v7, Ljh/a$e$c;->y:Lnh/s;

    invoke-virtual {p1, v7, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_8
    :goto_2
    move v3, v1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 33
    :try_start_1
    new-instance p2, Lnh/k;

    .line 34
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 35
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    and-int/lit8 p2, v4, 0x1

    if-ne p2, v1, :cond_9

    .line 36
    iget-object p2, p0, Ljh/a$e;->m:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Ljh/a$e;->m:Ljava/util/List;

    :cond_9
    and-int/lit8 p2, v4, 0x2

    if-ne p2, v5, :cond_a

    .line 37
    iget-object p2, p0, Ljh/a$e;->n:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Ljh/a$e;->n:Ljava/util/List;

    .line 38
    :cond_a
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 39
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Ljh/a$e;->l:Lnh/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Ljh/a$e;->l:Lnh/d;

    .line 40
    throw p1

    .line 41
    :goto_4
    invoke-virtual {p0}, Lnh/i;->n()V

    .line 42
    throw p1

    :cond_b
    and-int/lit8 p1, v4, 0x1

    if-ne p1, v1, :cond_c

    .line 43
    iget-object p1, p0, Ljh/a$e;->m:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ljh/a$e;->m:Ljava/util/List;

    :cond_c
    and-int/lit8 p1, v4, 0x2

    if-ne p1, v5, :cond_d

    .line 44
    iget-object p1, p0, Ljh/a$e;->n:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ljh/a$e;->n:Ljava/util/List;

    .line 45
    :cond_d
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 46
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Ljh/a$e;->l:Lnh/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Ljh/a$e;->l:Lnh/d;

    .line 47
    throw p1

    .line 48
    :goto_5
    invoke-virtual {p0}, Lnh/i;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Ljh/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljh/a$e;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lnh/i;-><init>(Lnh/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Ljh/a$e;->o:I

    .line 5
    iput-byte v0, p0, Ljh/a$e;->p:B

    .line 6
    iput v0, p0, Ljh/a$e;->q:I

    .line 7
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Ljh/a$e;->l:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$b;Ljh/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ljh/a$e;-><init>(Lnh/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 8
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 p1, -0x1

    .line 9
    iput p1, p0, Ljh/a$e;->o:I

    .line 10
    iput-byte p1, p0, Ljh/a$e;->p:B

    .line 11
    iput p1, p0, Ljh/a$e;->q:I

    .line 12
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Ljh/a$e;->l:Lnh/d;

    return-void
.end method

.method private A()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Ljh/a$e;->m:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ljh/a$e;->n:Ljava/util/List;

    .line 12
    .line 13
    return-void
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

.method public static B()Ljh/a$e$b;
    .locals 1

    invoke-static {}, Ljh/a$e$b;->r()Ljh/a$e$b;

    move-result-object v0

    return-object v0
.end method

.method public static C(Ljh/a$e;)Ljh/a$e$b;
    .locals 1

    invoke-static {}, Ljh/a$e;->B()Ljh/a$e$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljh/a$e$b;->z(Ljh/a$e;)Ljh/a$e$b;

    move-result-object p0

    return-object p0
.end method

.method public static E(Ljava/io/InputStream;Lnh/g;)Ljh/a$e;
    .locals 1

    sget-object v0, Ljh/a$e;->s:Lnh/s;

    invoke-interface {v0, p0, p1}, Lnh/s;->d(Ljava/io/InputStream;Lnh/g;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljh/a$e;

    return-object p0
.end method

.method static synthetic s(Ljh/a$e;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ljh/a$e;->m:Ljava/util/List;

    return-object p0
.end method

.method static synthetic t(Ljh/a$e;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Ljh/a$e;->m:Ljava/util/List;

    return-object p1
.end method

.method static synthetic u(Ljh/a$e;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ljh/a$e;->n:Ljava/util/List;

    return-object p0
.end method

.method static synthetic v(Ljh/a$e;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Ljh/a$e;->n:Ljava/util/List;

    return-object p1
.end method

.method static synthetic w(Ljh/a$e;)Lnh/d;
    .locals 0

    iget-object p0, p0, Ljh/a$e;->l:Lnh/d;

    return-object p0
.end method

.method public static x()Ljh/a$e;
    .locals 1

    sget-object v0, Ljh/a$e;->r:Ljh/a$e;

    return-object v0
.end method


# virtual methods
.method public D()Ljh/a$e$b;
    .locals 1

    invoke-static {}, Ljh/a$e;->B()Ljh/a$e$b;

    move-result-object v0

    return-object v0
.end method

.method public F()Ljh/a$e$b;
    .locals 1

    invoke-static {p0}, Ljh/a$e;->C(Ljh/a$e;)Ljh/a$e$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Ljh/a$e;->F()Ljh/a$e$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 5

    .line 1
    iget v0, p0, Ljh/a$e;->q:I

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
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    iget-object v3, p0, Ljh/a$e;->m:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v1, v3, :cond_1

    .line 17
    .line 18
    iget-object v3, p0, Ljh/a$e;->m:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lnh/q;

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    invoke-static {v4, v3}, Lnh/f;->s(ILnh/q;)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    add-int/2addr v2, v3

    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v1, v0

    .line 36
    :goto_1
    iget-object v3, p0, Ljh/a$e;->n:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ge v0, v3, :cond_2

    .line 43
    .line 44
    iget-object v3, p0, Ljh/a$e;->n:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-static {v3}, Lnh/f;->p(I)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    add-int/2addr v1, v3

    .line 61
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    add-int/2addr v2, v1

    .line 65
    invoke-virtual {p0}, Ljh/a$e;->y()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_3

    .line 74
    .line 75
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    invoke-static {v1}, Lnh/f;->p(I)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    add-int/2addr v2, v0

    .line 82
    :cond_3
    iput v1, p0, Ljh/a$e;->o:I

    .line 83
    .line 84
    iget-object v0, p0, Ljh/a$e;->l:Lnh/d;

    .line 85
    .line 86
    invoke-virtual {v0}, Lnh/d;->size()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    add-int/2addr v2, v0

    .line 91
    iput v2, p0, Ljh/a$e;->q:I

    .line 92
    .line 93
    return v2
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public e(Lnh/f;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljh/a$e;->d()I

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    iget-object v2, p0, Ljh/a$e;->m:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, Ljh/a$e;->m:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lnh/q;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-virtual {p1, v3, v2}, Lnh/f;->d0(ILnh/q;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0}, Ljh/a$e;->y()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-lez v1, :cond_1

    .line 38
    .line 39
    const/16 v1, 0x2a

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Lnh/f;->o0(I)V

    .line 42
    .line 43
    .line 44
    iget v1, p0, Ljh/a$e;->o:I

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Lnh/f;->o0(I)V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_1
    iget-object v1, p0, Ljh/a$e;->n:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-ge v0, v1, :cond_2

    .line 56
    .line 57
    iget-object v1, p0, Ljh/a$e;->n:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {p1, v1}, Lnh/f;->b0(I)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    iget-object v0, p0, Ljh/a$e;->l:Lnh/d;

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 78
    .line 79
    .line 80
    return-void
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

    invoke-virtual {p0}, Ljh/a$e;->D()Ljh/a$e$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Ljh/a$e;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljh/a$e;->s:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Ljh/a$e;->p:B

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
    iput-byte v1, p0, Ljh/a$e;->p:B

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

.method public y()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ljh/a$e;->n:Ljava/util/List;

    return-object v0
.end method

.method public z()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljh/a$e$c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ljh/a$e;->m:Ljava/util/List;

    return-object v0
.end method
