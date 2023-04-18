.class public final Lgh/o$c;
.super Lnh/i;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgh/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/o$c$b;,
        Lgh/o$c$c;
    }
.end annotation


# static fields
.field private static final s:Lgh/o$c;

.field public static t:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/o$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final l:Lnh/d;

.field private m:I

.field private n:I

.field private o:I

.field private p:Lgh/o$c$c;

.field private q:B

.field private r:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/o$c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/o$c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/o$c;->t:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/o$c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/o$c;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/o$c;->s:Lgh/o$c;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/o$c;->E()V

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
    iput-byte v0, p0, Lgh/o$c;->q:B

    .line 13
    iput v0, p0, Lgh/o$c;->r:I

    .line 14
    invoke-direct {p0}, Lgh/o$c;->E()V

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
    if-nez v3, :cond_6

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v4

    if-eqz v4, :cond_5

    const/16 v5, 0x8

    if-eq v4, v5, :cond_4

    const/16 v5, 0x10

    if-eq v4, v5, :cond_3

    const/16 v5, 0x18

    if-eq v4, v5, :cond_1

    .line 18
    invoke-virtual {p0, p1, v2, p2, v4}, Lnh/i;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p1}, Lnh/e;->n()I

    move-result v5

    .line 20
    invoke-static {v5}, Lgh/o$c$c;->a(I)Lgh/o$c$c;

    move-result-object v6

    if-nez v6, :cond_2

    .line 21
    invoke-virtual {v2, v4}, Lnh/f;->o0(I)V

    .line 22
    invoke-virtual {v2, v5}, Lnh/f;->o0(I)V

    goto :goto_0

    .line 23
    :cond_2
    iget v4, p0, Lgh/o$c;->m:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, Lgh/o$c;->m:I

    .line 24
    iput-object v6, p0, Lgh/o$c;->p:Lgh/o$c$c;

    goto :goto_0

    .line 25
    :cond_3
    iget v4, p0, Lgh/o$c;->m:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lgh/o$c;->m:I

    .line 26
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v4

    iput v4, p0, Lgh/o$c;->o:I

    goto :goto_0

    .line 27
    :cond_4
    iget v4, p0, Lgh/o$c;->m:I

    or-int/2addr v4, v1

    iput v4, p0, Lgh/o$c;->m:I

    .line 28
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v4

    iput v4, p0, Lgh/o$c;->n:I
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_5
    :goto_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 29
    :try_start_1
    new-instance p2, Lnh/k;

    .line 30
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 31
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :goto_2
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 33
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/o$c;->l:Lnh/d;

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/o$c;->l:Lnh/d;

    .line 34
    throw p1

    .line 35
    :goto_3
    invoke-virtual {p0}, Lnh/i;->n()V

    .line 36
    throw p1

    .line 37
    :cond_6
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 38
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/o$c;->l:Lnh/d;

    goto :goto_4

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/o$c;->l:Lnh/d;

    .line 39
    throw p1

    .line 40
    :goto_4
    invoke-virtual {p0}, Lnh/i;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/o$c;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lnh/i;-><init>(Lnh/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lgh/o$c;->q:B

    .line 5
    iput v0, p0, Lgh/o$c;->r:I

    .line 6
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/o$c;->l:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$b;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/o$c;-><init>(Lnh/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lgh/o$c;->q:B

    .line 9
    iput p1, p0, Lgh/o$c;->r:I

    .line 10
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/o$c;->l:Lnh/d;

    return-void
.end method

.method private E()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lgh/o$c;->n:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lgh/o$c;->o:I

    .line 6
    .line 7
    sget-object v0, Lgh/o$c$c;->m:Lgh/o$c$c;

    .line 8
    .line 9
    iput-object v0, p0, Lgh/o$c;->p:Lgh/o$c$c;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
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

.method public static F()Lgh/o$c$b;
    .locals 1

    invoke-static {}, Lgh/o$c$b;->r()Lgh/o$c$b;

    move-result-object v0

    return-object v0
.end method

.method public static G(Lgh/o$c;)Lgh/o$c$b;
    .locals 1

    invoke-static {}, Lgh/o$c;->F()Lgh/o$c$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/o$c$b;->x(Lgh/o$c;)Lgh/o$c$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(Lgh/o$c;I)I
    .locals 0

    iput p1, p0, Lgh/o$c;->o:I

    return p1
.end method

.method static synthetic t(Lgh/o$c;Lgh/o$c$c;)Lgh/o$c$c;
    .locals 0

    iput-object p1, p0, Lgh/o$c;->p:Lgh/o$c$c;

    return-object p1
.end method

.method static synthetic u(Lgh/o$c;I)I
    .locals 0

    iput p1, p0, Lgh/o$c;->m:I

    return p1
.end method

.method static synthetic v(Lgh/o$c;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/o$c;->l:Lnh/d;

    return-object p0
.end method

.method static synthetic w(Lgh/o$c;I)I
    .locals 0

    iput p1, p0, Lgh/o$c;->n:I

    return p1
.end method

.method public static x()Lgh/o$c;
    .locals 1

    sget-object v0, Lgh/o$c;->s:Lgh/o$c;

    return-object v0
.end method


# virtual methods
.method public A()I
    .locals 1

    iget v0, p0, Lgh/o$c;->o:I

    return v0
.end method

.method public B()Z
    .locals 2

    iget v0, p0, Lgh/o$c;->m:I

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

.method public C()Z
    .locals 2

    iget v0, p0, Lgh/o$c;->m:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public D()Z
    .locals 2

    iget v0, p0, Lgh/o$c;->m:I

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

.method public H()Lgh/o$c$b;
    .locals 1

    invoke-static {}, Lgh/o$c;->F()Lgh/o$c$b;

    move-result-object v0

    return-object v0
.end method

.method public I()Lgh/o$c$b;
    .locals 1

    invoke-static {p0}, Lgh/o$c;->G(Lgh/o$c;)Lgh/o$c$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/o$c;->I()Lgh/o$c$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 3

    .line 1
    iget v0, p0, Lgh/o$c;->r:I

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
    iget v0, p0, Lgh/o$c;->m:I

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
    iget v0, p0, Lgh/o$c;->n:I

    .line 15
    .line 16
    invoke-static {v1, v0}, Lnh/f;->o(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/2addr v2, v0

    .line 21
    :cond_1
    iget v0, p0, Lgh/o$c;->m:I

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    and-int/2addr v0, v1

    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    iget v0, p0, Lgh/o$c;->o:I

    .line 28
    .line 29
    invoke-static {v1, v0}, Lnh/f;->o(II)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    add-int/2addr v2, v0

    .line 34
    :cond_2
    iget v0, p0, Lgh/o$c;->m:I

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    and-int/2addr v0, v1

    .line 38
    if-ne v0, v1, :cond_3

    .line 39
    .line 40
    iget-object v0, p0, Lgh/o$c;->p:Lgh/o$c$c;

    .line 41
    .line 42
    invoke-virtual {v0}, Lgh/o$c$c;->getNumber()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/4 v1, 0x3

    .line 47
    invoke-static {v1, v0}, Lnh/f;->h(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    add-int/2addr v2, v0

    .line 52
    :cond_3
    iget-object v0, p0, Lgh/o$c;->l:Lnh/d;

    .line 53
    .line 54
    invoke-virtual {v0}, Lnh/d;->size()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/2addr v2, v0

    .line 59
    iput v2, p0, Lgh/o$c;->r:I

    .line 60
    .line 61
    return v2
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

.method public e(Lnh/f;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lgh/o$c;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lgh/o$c;->m:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lgh/o$c;->n:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lnh/f;->a0(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lgh/o$c;->m:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Lgh/o$c;->o:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lnh/f;->a0(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, Lgh/o$c;->m:I

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    and-int/2addr v0, v1

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lgh/o$c;->p:Lgh/o$c$c;

    .line 33
    .line 34
    invoke-virtual {v0}, Lgh/o$c$c;->getNumber()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v1, 0x3

    .line 39
    invoke-virtual {p1, v1, v0}, Lnh/f;->S(II)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Lgh/o$c;->l:Lnh/d;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 45
    .line 46
    .line 47
    return-void
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
.end method

.method public bridge synthetic g()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/o$c;->H()Lgh/o$c$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/o$c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/o$c;->t:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 3

    .line 1
    iget-byte v0, p0, Lgh/o$c;->q:B

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
    invoke-virtual {p0}, Lgh/o$c;->D()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lgh/o$c;->q:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iput-byte v1, p0, Lgh/o$c;->q:B

    .line 21
    .line 22
    return v1
    .line 23
    .line 24
.end method

.method public y()Lgh/o$c$c;
    .locals 1

    iget-object v0, p0, Lgh/o$c;->p:Lgh/o$c$c;

    return-object v0
.end method

.method public z()I
    .locals 1

    iget v0, p0, Lgh/o$c;->n:I

    return v0
.end method
