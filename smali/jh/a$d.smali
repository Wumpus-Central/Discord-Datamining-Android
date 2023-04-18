.class public final Ljh/a$d;
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
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljh/a$d$b;
    }
.end annotation


# static fields
.field private static final u:Ljh/a$d;

.field public static v:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Ljh/a$d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final l:Lnh/d;

.field private m:I

.field private n:Ljh/a$b;

.field private o:Ljh/a$c;

.field private p:Ljh/a$c;

.field private q:Ljh/a$c;

.field private r:Ljh/a$c;

.field private s:B

.field private t:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljh/a$d$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljh/a$d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljh/a$d;->v:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Ljh/a$d;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Ljh/a$d;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ljh/a$d;->u:Ljh/a$d;

    .line 15
    .line 16
    invoke-direct {v0}, Ljh/a$d;->K()V

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
    .locals 7

    .line 11
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Ljh/a$d;->s:B

    .line 13
    iput v0, p0, Ljh/a$d;->t:I

    .line 14
    invoke-direct {p0}, Ljh/a$d;->K()V

    .line 15
    invoke-static {}, Lnh/d;->w()Lnh/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 16
    invoke-static {v0, v1}, Lnh/f;->J(Ljava/io/OutputStream;I)Lnh/f;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_11

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v4

    if-eqz v4, :cond_10

    const/16 v5, 0xa

    const/4 v6, 0x0

    if-eq v4, v5, :cond_d

    const/16 v5, 0x12

    if-eq v4, v5, :cond_a

    const/16 v5, 0x1a

    if-eq v4, v5, :cond_7

    const/16 v5, 0x22

    if-eq v4, v5, :cond_4

    const/16 v5, 0x2a

    if-eq v4, v5, :cond_1

    .line 18
    invoke-virtual {p0, p1, v2, p2, v4}, Lnh/i;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_1

    .line 19
    :cond_1
    iget v4, p0, Ljh/a$d;->m:I

    const/16 v5, 0x10

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_2

    .line 20
    iget-object v4, p0, Ljh/a$d;->r:Ljh/a$c;

    invoke-virtual {v4}, Ljh/a$c;->F()Ljh/a$c$b;

    move-result-object v6

    .line 21
    :cond_2
    sget-object v4, Ljh/a$c;->s:Lnh/s;

    invoke-virtual {p1, v4, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v4

    check-cast v4, Ljh/a$c;

    iput-object v4, p0, Ljh/a$d;->r:Ljh/a$c;

    if-eqz v6, :cond_3

    .line 22
    invoke-virtual {v6, v4}, Ljh/a$c$b;->x(Ljh/a$c;)Ljh/a$c$b;

    .line 23
    invoke-virtual {v6}, Ljh/a$c$b;->t()Ljh/a$c;

    move-result-object v4

    iput-object v4, p0, Ljh/a$d;->r:Ljh/a$c;

    .line 24
    :cond_3
    iget v4, p0, Ljh/a$d;->m:I

    or-int/2addr v4, v5

    iput v4, p0, Ljh/a$d;->m:I

    goto :goto_0

    .line 25
    :cond_4
    iget v4, p0, Ljh/a$d;->m:I

    const/16 v5, 0x8

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_5

    .line 26
    iget-object v4, p0, Ljh/a$d;->q:Ljh/a$c;

    invoke-virtual {v4}, Ljh/a$c;->F()Ljh/a$c$b;

    move-result-object v6

    .line 27
    :cond_5
    sget-object v4, Ljh/a$c;->s:Lnh/s;

    invoke-virtual {p1, v4, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v4

    check-cast v4, Ljh/a$c;

    iput-object v4, p0, Ljh/a$d;->q:Ljh/a$c;

    if-eqz v6, :cond_6

    .line 28
    invoke-virtual {v6, v4}, Ljh/a$c$b;->x(Ljh/a$c;)Ljh/a$c$b;

    .line 29
    invoke-virtual {v6}, Ljh/a$c$b;->t()Ljh/a$c;

    move-result-object v4

    iput-object v4, p0, Ljh/a$d;->q:Ljh/a$c;

    .line 30
    :cond_6
    iget v4, p0, Ljh/a$d;->m:I

    or-int/2addr v4, v5

    iput v4, p0, Ljh/a$d;->m:I

    goto :goto_0

    .line 31
    :cond_7
    iget v4, p0, Ljh/a$d;->m:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_8

    .line 32
    iget-object v4, p0, Ljh/a$d;->p:Ljh/a$c;

    invoke-virtual {v4}, Ljh/a$c;->F()Ljh/a$c$b;

    move-result-object v6

    .line 33
    :cond_8
    sget-object v4, Ljh/a$c;->s:Lnh/s;

    invoke-virtual {p1, v4, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v4

    check-cast v4, Ljh/a$c;

    iput-object v4, p0, Ljh/a$d;->p:Ljh/a$c;

    if-eqz v6, :cond_9

    .line 34
    invoke-virtual {v6, v4}, Ljh/a$c$b;->x(Ljh/a$c;)Ljh/a$c$b;

    .line 35
    invoke-virtual {v6}, Ljh/a$c$b;->t()Ljh/a$c;

    move-result-object v4

    iput-object v4, p0, Ljh/a$d;->p:Ljh/a$c;

    .line 36
    :cond_9
    iget v4, p0, Ljh/a$d;->m:I

    or-int/2addr v4, v5

    iput v4, p0, Ljh/a$d;->m:I

    goto/16 :goto_0

    .line 37
    :cond_a
    iget v4, p0, Ljh/a$d;->m:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_b

    .line 38
    iget-object v4, p0, Ljh/a$d;->o:Ljh/a$c;

    invoke-virtual {v4}, Ljh/a$c;->F()Ljh/a$c$b;

    move-result-object v6

    .line 39
    :cond_b
    sget-object v4, Ljh/a$c;->s:Lnh/s;

    invoke-virtual {p1, v4, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v4

    check-cast v4, Ljh/a$c;

    iput-object v4, p0, Ljh/a$d;->o:Ljh/a$c;

    if-eqz v6, :cond_c

    .line 40
    invoke-virtual {v6, v4}, Ljh/a$c$b;->x(Ljh/a$c;)Ljh/a$c$b;

    .line 41
    invoke-virtual {v6}, Ljh/a$c$b;->t()Ljh/a$c;

    move-result-object v4

    iput-object v4, p0, Ljh/a$d;->o:Ljh/a$c;

    .line 42
    :cond_c
    iget v4, p0, Ljh/a$d;->m:I

    or-int/2addr v4, v5

    iput v4, p0, Ljh/a$d;->m:I

    goto/16 :goto_0

    .line 43
    :cond_d
    iget v4, p0, Ljh/a$d;->m:I

    and-int/2addr v4, v1

    if-ne v4, v1, :cond_e

    .line 44
    iget-object v4, p0, Ljh/a$d;->n:Ljh/a$b;

    invoke-virtual {v4}, Ljh/a$b;->F()Ljh/a$b$b;

    move-result-object v6

    .line 45
    :cond_e
    sget-object v4, Ljh/a$b;->s:Lnh/s;

    invoke-virtual {p1, v4, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v4

    check-cast v4, Ljh/a$b;

    iput-object v4, p0, Ljh/a$d;->n:Ljh/a$b;

    if-eqz v6, :cond_f

    .line 46
    invoke-virtual {v6, v4}, Ljh/a$b$b;->x(Ljh/a$b;)Ljh/a$b$b;

    .line 47
    invoke-virtual {v6}, Ljh/a$b$b;->t()Ljh/a$b;

    move-result-object v4

    iput-object v4, p0, Ljh/a$d;->n:Ljh/a$b;

    .line 48
    :cond_f
    iget v4, p0, Ljh/a$d;->m:I

    or-int/2addr v4, v1

    iput v4, p0, Ljh/a$d;->m:I
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_10
    :goto_1
    move v3, v1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 49
    :try_start_1
    new-instance p2, Lnh/k;

    .line 50
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 51
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    :goto_2
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Ljh/a$d;->l:Lnh/d;

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Ljh/a$d;->l:Lnh/d;

    .line 54
    throw p1

    .line 55
    :goto_3
    invoke-virtual {p0}, Lnh/i;->n()V

    .line 56
    throw p1

    .line 57
    :cond_11
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 58
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Ljh/a$d;->l:Lnh/d;

    goto :goto_4

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Ljh/a$d;->l:Lnh/d;

    .line 59
    throw p1

    .line 60
    :goto_4
    invoke-virtual {p0}, Lnh/i;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Ljh/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljh/a$d;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lnh/i;-><init>(Lnh/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Ljh/a$d;->s:B

    .line 5
    iput v0, p0, Ljh/a$d;->t:I

    .line 6
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Ljh/a$d;->l:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$b;Ljh/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ljh/a$d;-><init>(Lnh/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Ljh/a$d;->s:B

    .line 9
    iput p1, p0, Ljh/a$d;->t:I

    .line 10
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Ljh/a$d;->l:Lnh/d;

    return-void
.end method

.method private K()V
    .locals 1

    .line 1
    invoke-static {}, Ljh/a$b;->w()Ljh/a$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Ljh/a$d;->n:Ljh/a$b;

    .line 6
    .line 7
    invoke-static {}, Ljh/a$c;->w()Ljh/a$c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ljh/a$d;->o:Ljh/a$c;

    .line 12
    .line 13
    invoke-static {}, Ljh/a$c;->w()Ljh/a$c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ljh/a$d;->p:Ljh/a$c;

    .line 18
    .line 19
    invoke-static {}, Ljh/a$c;->w()Ljh/a$c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Ljh/a$d;->q:Ljh/a$c;

    .line 24
    .line 25
    invoke-static {}, Ljh/a$c;->w()Ljh/a$c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Ljh/a$d;->r:Ljh/a$c;

    .line 30
    .line 31
    return-void
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

.method public static L()Ljh/a$d$b;
    .locals 1

    invoke-static {}, Ljh/a$d$b;->r()Ljh/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public static M(Ljh/a$d;)Ljh/a$d$b;
    .locals 1

    invoke-static {}, Ljh/a$d;->L()Ljh/a$d$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljh/a$d$b;->z(Ljh/a$d;)Ljh/a$d$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(Ljh/a$d;Ljh/a$b;)Ljh/a$b;
    .locals 0

    iput-object p1, p0, Ljh/a$d;->n:Ljh/a$b;

    return-object p1
.end method

.method static synthetic t(Ljh/a$d;Ljh/a$c;)Ljh/a$c;
    .locals 0

    iput-object p1, p0, Ljh/a$d;->o:Ljh/a$c;

    return-object p1
.end method

.method static synthetic u(Ljh/a$d;Ljh/a$c;)Ljh/a$c;
    .locals 0

    iput-object p1, p0, Ljh/a$d;->p:Ljh/a$c;

    return-object p1
.end method

.method static synthetic v(Ljh/a$d;Ljh/a$c;)Ljh/a$c;
    .locals 0

    iput-object p1, p0, Ljh/a$d;->q:Ljh/a$c;

    return-object p1
.end method

.method static synthetic w(Ljh/a$d;Ljh/a$c;)Ljh/a$c;
    .locals 0

    iput-object p1, p0, Ljh/a$d;->r:Ljh/a$c;

    return-object p1
.end method

.method static synthetic x(Ljh/a$d;I)I
    .locals 0

    iput p1, p0, Ljh/a$d;->m:I

    return p1
.end method

.method static synthetic y(Ljh/a$d;)Lnh/d;
    .locals 0

    iget-object p0, p0, Ljh/a$d;->l:Lnh/d;

    return-object p0
.end method

.method public static z()Ljh/a$d;
    .locals 1

    sget-object v0, Ljh/a$d;->u:Ljh/a$d;

    return-object v0
.end method


# virtual methods
.method public A()Ljh/a$c;
    .locals 1

    iget-object v0, p0, Ljh/a$d;->r:Ljh/a$c;

    return-object v0
.end method

.method public B()Ljh/a$b;
    .locals 1

    iget-object v0, p0, Ljh/a$d;->n:Ljh/a$b;

    return-object v0
.end method

.method public C()Ljh/a$c;
    .locals 1

    iget-object v0, p0, Ljh/a$d;->p:Ljh/a$c;

    return-object v0
.end method

.method public D()Ljh/a$c;
    .locals 1

    iget-object v0, p0, Ljh/a$d;->q:Ljh/a$c;

    return-object v0
.end method

.method public E()Ljh/a$c;
    .locals 1

    iget-object v0, p0, Ljh/a$d;->o:Ljh/a$c;

    return-object v0
.end method

.method public F()Z
    .locals 2

    iget v0, p0, Ljh/a$d;->m:I

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

.method public G()Z
    .locals 2

    iget v0, p0, Ljh/a$d;->m:I

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

    iget v0, p0, Ljh/a$d;->m:I

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

.method public I()Z
    .locals 2

    iget v0, p0, Ljh/a$d;->m:I

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

.method public J()Z
    .locals 2

    iget v0, p0, Ljh/a$d;->m:I

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

.method public N()Ljh/a$d$b;
    .locals 1

    invoke-static {}, Ljh/a$d;->L()Ljh/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public O()Ljh/a$d$b;
    .locals 1

    invoke-static {p0}, Ljh/a$d;->M(Ljh/a$d;)Ljh/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Ljh/a$d;->O()Ljh/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 4

    .line 1
    iget v0, p0, Ljh/a$d;->t:I

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
    iget v0, p0, Ljh/a$d;->m:I

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
    iget-object v0, p0, Ljh/a$d;->n:Ljh/a$b;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lnh/f;->s(ILnh/q;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/2addr v2, v0

    .line 21
    :cond_1
    iget v0, p0, Ljh/a$d;->m:I

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    and-int/2addr v0, v1

    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Ljh/a$d;->o:Ljh/a$c;

    .line 28
    .line 29
    invoke-static {v1, v0}, Lnh/f;->s(ILnh/q;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    add-int/2addr v2, v0

    .line 34
    :cond_2
    iget v0, p0, Ljh/a$d;->m:I

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    and-int/2addr v0, v1

    .line 38
    if-ne v0, v1, :cond_3

    .line 39
    .line 40
    const/4 v0, 0x3

    .line 41
    iget-object v3, p0, Ljh/a$d;->p:Ljh/a$c;

    .line 42
    .line 43
    invoke-static {v0, v3}, Lnh/f;->s(ILnh/q;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    add-int/2addr v2, v0

    .line 48
    :cond_3
    iget v0, p0, Ljh/a$d;->m:I

    .line 49
    .line 50
    const/16 v3, 0x8

    .line 51
    .line 52
    and-int/2addr v0, v3

    .line 53
    if-ne v0, v3, :cond_4

    .line 54
    .line 55
    iget-object v0, p0, Ljh/a$d;->q:Ljh/a$c;

    .line 56
    .line 57
    invoke-static {v1, v0}, Lnh/f;->s(ILnh/q;)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    add-int/2addr v2, v0

    .line 62
    :cond_4
    iget v0, p0, Ljh/a$d;->m:I

    .line 63
    .line 64
    const/16 v1, 0x10

    .line 65
    .line 66
    and-int/2addr v0, v1

    .line 67
    if-ne v0, v1, :cond_5

    .line 68
    .line 69
    const/4 v0, 0x5

    .line 70
    iget-object v1, p0, Ljh/a$d;->r:Ljh/a$c;

    .line 71
    .line 72
    invoke-static {v0, v1}, Lnh/f;->s(ILnh/q;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    add-int/2addr v2, v0

    .line 77
    :cond_5
    iget-object v0, p0, Ljh/a$d;->l:Lnh/d;

    .line 78
    .line 79
    invoke-virtual {v0}, Lnh/d;->size()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    add-int/2addr v2, v0

    .line 84
    iput v2, p0, Ljh/a$d;->t:I

    .line 85
    .line 86
    return v2
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

.method public e(Lnh/f;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljh/a$d;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ljh/a$d;->m:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ljh/a$d;->n:Ljh/a$b;

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lnh/f;->d0(ILnh/q;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Ljh/a$d;->m:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Ljh/a$d;->o:Ljh/a$c;

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lnh/f;->d0(ILnh/q;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, Ljh/a$d;->m:I

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    and-int/2addr v0, v1

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    iget-object v2, p0, Ljh/a$d;->p:Ljh/a$c;

    .line 34
    .line 35
    invoke-virtual {p1, v0, v2}, Lnh/f;->d0(ILnh/q;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget v0, p0, Ljh/a$d;->m:I

    .line 39
    .line 40
    const/16 v2, 0x8

    .line 41
    .line 42
    and-int/2addr v0, v2

    .line 43
    if-ne v0, v2, :cond_3

    .line 44
    .line 45
    iget-object v0, p0, Ljh/a$d;->q:Ljh/a$c;

    .line 46
    .line 47
    invoke-virtual {p1, v1, v0}, Lnh/f;->d0(ILnh/q;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    iget v0, p0, Ljh/a$d;->m:I

    .line 51
    .line 52
    const/16 v1, 0x10

    .line 53
    .line 54
    and-int/2addr v0, v1

    .line 55
    if-ne v0, v1, :cond_4

    .line 56
    .line 57
    const/4 v0, 0x5

    .line 58
    iget-object v1, p0, Ljh/a$d;->r:Ljh/a$c;

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, Lnh/f;->d0(ILnh/q;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    iget-object v0, p0, Ljh/a$d;->l:Lnh/d;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 66
    .line 67
    .line 68
    return-void
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
.end method

.method public bridge synthetic g()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Ljh/a$d;->N()Ljh/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Ljh/a$d;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljh/a$d;->v:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Ljh/a$d;->s:B

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
    iput-byte v1, p0, Ljh/a$d;->s:B

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
