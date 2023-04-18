.class public final Lgh/b$b;
.super Lnh/i;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgh/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh/b$b$b;,
        Lgh/b$b$c;
    }
.end annotation


# static fields
.field private static final r:Lgh/b$b;

.field public static s:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Lgh/b$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final l:Lnh/d;

.field private m:I

.field private n:I

.field private o:Lgh/b$b$c;

.field private p:B

.field private q:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgh/b$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgh/b$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgh/b$b;->s:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Lgh/b$b;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lgh/b$b;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lgh/b$b;->r:Lgh/b$b;

    .line 15
    .line 16
    invoke-direct {v0}, Lgh/b$b;->B()V

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
    iput-byte v0, p0, Lgh/b$b;->p:B

    .line 13
    iput v0, p0, Lgh/b$b;->q:I

    .line 14
    invoke-direct {p0}, Lgh/b$b;->B()V

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

    const/16 v5, 0x12

    if-eq v4, v5, :cond_1

    .line 18
    invoke-virtual {p0, p1, v2, p2, v4}, Lnh/i;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    .line 19
    :cond_1
    iget v4, p0, Lgh/b$b;->m:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_2

    .line 20
    iget-object v4, p0, Lgh/b$b;->o:Lgh/b$b$c;

    invoke-virtual {v4}, Lgh/b$b$c;->i0()Lgh/b$b$c$b;

    move-result-object v4

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    .line 21
    :goto_1
    sget-object v6, Lgh/b$b$c;->B:Lnh/s;

    invoke-virtual {p1, v6, p2}, Lnh/e;->u(Lnh/s;Lnh/g;)Lnh/q;

    move-result-object v6

    check-cast v6, Lgh/b$b$c;

    iput-object v6, p0, Lgh/b$b;->o:Lgh/b$b$c;

    if-eqz v4, :cond_3

    .line 22
    invoke-virtual {v4, v6}, Lgh/b$b$c$b;->z(Lgh/b$b$c;)Lgh/b$b$c$b;

    .line 23
    invoke-virtual {v4}, Lgh/b$b$c$b;->t()Lgh/b$b$c;

    move-result-object v4

    iput-object v4, p0, Lgh/b$b;->o:Lgh/b$b$c;

    .line 24
    :cond_3
    iget v4, p0, Lgh/b$b;->m:I

    or-int/2addr v4, v5

    iput v4, p0, Lgh/b$b;->m:I

    goto :goto_0

    .line 25
    :cond_4
    iget v4, p0, Lgh/b$b;->m:I

    or-int/2addr v4, v1

    iput v4, p0, Lgh/b$b;->m:I

    .line 26
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v4

    iput v4, p0, Lgh/b$b;->n:I
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_5
    :goto_2
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 27
    :try_start_1
    new-instance p2, Lnh/k;

    .line 28
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 29
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    :goto_3
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 31
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/b$b;->l:Lnh/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/b$b;->l:Lnh/d;

    .line 32
    throw p1

    .line 33
    :goto_4
    invoke-virtual {p0}, Lnh/i;->n()V

    .line 34
    throw p1

    .line 35
    :cond_6
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 36
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/b$b;->l:Lnh/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Lgh/b$b;->l:Lnh/d;

    .line 37
    throw p1

    .line 38
    :goto_5
    invoke-virtual {p0}, Lnh/i;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Lgh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgh/b$b;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lnh/i;-><init>(Lnh/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lgh/b$b;->p:B

    .line 5
    iput v0, p0, Lgh/b$b;->q:I

    .line 6
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Lgh/b$b;->l:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$b;Lgh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lgh/b$b;-><init>(Lnh/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lgh/b$b;->p:B

    .line 9
    iput p1, p0, Lgh/b$b;->q:I

    .line 10
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Lgh/b$b;->l:Lnh/d;

    return-void
.end method

.method private B()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lgh/b$b;->n:I

    .line 3
    .line 4
    invoke-static {}, Lgh/b$b$c;->M()Lgh/b$b$c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lgh/b$b;->o:Lgh/b$b$c;

    .line 9
    .line 10
    return-void
    .line 11
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

.method public static C()Lgh/b$b$b;
    .locals 1

    invoke-static {}, Lgh/b$b$b;->r()Lgh/b$b$b;

    move-result-object v0

    return-object v0
.end method

.method public static D(Lgh/b$b;)Lgh/b$b$b;
    .locals 1

    invoke-static {}, Lgh/b$b;->C()Lgh/b$b$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgh/b$b$b;->x(Lgh/b$b;)Lgh/b$b$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(Lgh/b$b;I)I
    .locals 0

    iput p1, p0, Lgh/b$b;->n:I

    return p1
.end method

.method static synthetic t(Lgh/b$b;Lgh/b$b$c;)Lgh/b$b$c;
    .locals 0

    iput-object p1, p0, Lgh/b$b;->o:Lgh/b$b$c;

    return-object p1
.end method

.method static synthetic u(Lgh/b$b;I)I
    .locals 0

    iput p1, p0, Lgh/b$b;->m:I

    return p1
.end method

.method static synthetic v(Lgh/b$b;)Lnh/d;
    .locals 0

    iget-object p0, p0, Lgh/b$b;->l:Lnh/d;

    return-object p0
.end method

.method public static w()Lgh/b$b;
    .locals 1

    sget-object v0, Lgh/b$b;->r:Lgh/b$b;

    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 2

    iget v0, p0, Lgh/b$b;->m:I

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

.method public E()Lgh/b$b$b;
    .locals 1

    invoke-static {}, Lgh/b$b;->C()Lgh/b$b$b;

    move-result-object v0

    return-object v0
.end method

.method public F()Lgh/b$b$b;
    .locals 1

    invoke-static {p0}, Lgh/b$b;->D(Lgh/b$b;)Lgh/b$b$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/b$b;->F()Lgh/b$b$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 3

    .line 1
    iget v0, p0, Lgh/b$b;->q:I

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
    iget v0, p0, Lgh/b$b;->m:I

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
    iget v0, p0, Lgh/b$b;->n:I

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
    iget v0, p0, Lgh/b$b;->m:I

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    and-int/2addr v0, v1

    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Lgh/b$b;->o:Lgh/b$b$c;

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
    iget-object v0, p0, Lgh/b$b;->l:Lnh/d;

    .line 35
    .line 36
    invoke-virtual {v0}, Lnh/d;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/2addr v2, v0

    .line 41
    iput v2, p0, Lgh/b$b;->q:I

    .line 42
    .line 43
    return v2
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

.method public e(Lnh/f;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lgh/b$b;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lgh/b$b;->m:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lgh/b$b;->n:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lnh/f;->a0(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lgh/b$b;->m:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lgh/b$b;->o:Lgh/b$b$c;

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lnh/f;->d0(ILnh/q;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lgh/b$b;->l:Lnh/d;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lnh/f;->i0(Lnh/d;)V

    .line 29
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
.end method

.method public bridge synthetic g()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Lgh/b$b;->E()Lgh/b$b$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Lgh/b$b;",
            ">;"
        }
    .end annotation

    sget-object v0, Lgh/b$b;->s:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 3

    .line 1
    iget-byte v0, p0, Lgh/b$b;->p:B

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
    invoke-virtual {p0}, Lgh/b$b;->z()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lgh/b$b;->p:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    invoke-virtual {p0}, Lgh/b$b;->A()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    iput-byte v2, p0, Lgh/b$b;->p:B

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    invoke-virtual {p0}, Lgh/b$b;->y()Lgh/b$b$c;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lgh/b$b$c;->j()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    iput-byte v2, p0, Lgh/b$b;->p:B

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iput-byte v1, p0, Lgh/b$b;->p:B

    .line 43
    .line 44
    return v1
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

.method public x()I
    .locals 1

    iget v0, p0, Lgh/b$b;->n:I

    return v0
.end method

.method public y()Lgh/b$b$c;
    .locals 1

    iget-object v0, p0, Lgh/b$b;->o:Lgh/b$b$c;

    return-object v0
.end method

.method public z()Z
    .locals 2

    iget v0, p0, Lgh/b$b;->m:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
