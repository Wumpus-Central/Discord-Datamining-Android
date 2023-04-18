.class public final Ljh/a$c;
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
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljh/a$c$b;
    }
.end annotation


# static fields
.field private static final r:Ljh/a$c;

.field public static s:Lnh/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/s<",
            "Ljh/a$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final l:Lnh/d;

.field private m:I

.field private n:I

.field private o:I

.field private p:B

.field private q:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljh/a$c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljh/a$c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljh/a$c;->s:Lnh/s;

    .line 7
    .line 8
    new-instance v0, Ljh/a$c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Ljh/a$c;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ljh/a$c;->r:Ljh/a$c;

    .line 15
    .line 16
    invoke-direct {v0}, Ljh/a$c;->B()V

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
    .locals 6

    .line 11
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Ljh/a$c;->p:B

    .line 13
    iput v0, p0, Ljh/a$c;->q:I

    .line 14
    invoke-direct {p0}, Ljh/a$c;->B()V

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
    if-nez v3, :cond_4

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lnh/e;->K()I

    move-result v4

    if-eqz v4, :cond_3

    const/16 v5, 0x8

    if-eq v4, v5, :cond_2

    const/16 v5, 0x10

    if-eq v4, v5, :cond_1

    .line 18
    invoke-virtual {p0, p1, v2, p2, v4}, Lnh/i;->q(Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    .line 19
    :cond_1
    iget v4, p0, Ljh/a$c;->m:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Ljh/a$c;->m:I

    .line 20
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v4

    iput v4, p0, Ljh/a$c;->o:I

    goto :goto_0

    .line 21
    :cond_2
    iget v4, p0, Ljh/a$c;->m:I

    or-int/2addr v4, v1

    iput v4, p0, Ljh/a$c;->m:I

    .line 22
    invoke-virtual {p1}, Lnh/e;->s()I

    move-result v4

    iput v4, p0, Ljh/a$c;->n:I
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_3
    :goto_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 23
    :try_start_1
    new-instance p2, Lnh/k;

    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 25
    invoke-virtual {p1, p0}, Lnh/k;->i(Lnh/q;)Lnh/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :goto_2
    :try_start_2
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    :catch_2
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Ljh/a$c;->l:Lnh/d;

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Ljh/a$c;->l:Lnh/d;

    .line 28
    throw p1

    .line 29
    :goto_3
    invoke-virtual {p0}, Lnh/i;->n()V

    .line 30
    throw p1

    .line 31
    :cond_4
    :try_start_3
    invoke-virtual {v2}, Lnh/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 32
    :catch_3
    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Ljh/a$c;->l:Lnh/d;

    goto :goto_4

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lnh/d$b;->k()Lnh/d;

    move-result-object p2

    iput-object p2, p0, Ljh/a$c;->l:Lnh/d;

    .line 33
    throw p1

    .line 34
    :goto_4
    invoke-virtual {p0}, Lnh/i;->n()V

    return-void
.end method

.method synthetic constructor <init>(Lnh/e;Lnh/g;Ljh/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljh/a$c;-><init>(Lnh/e;Lnh/g;)V

    return-void
.end method

.method private constructor <init>(Lnh/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lnh/i;-><init>(Lnh/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Ljh/a$c;->p:B

    .line 5
    iput v0, p0, Ljh/a$c;->q:I

    .line 6
    invoke-virtual {p1}, Lnh/i$b;->o()Lnh/d;

    move-result-object p1

    iput-object p1, p0, Ljh/a$c;->l:Lnh/d;

    return-void
.end method

.method synthetic constructor <init>(Lnh/i$b;Ljh/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ljh/a$c;-><init>(Lnh/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lnh/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Ljh/a$c;->p:B

    .line 9
    iput p1, p0, Ljh/a$c;->q:I

    .line 10
    sget-object p1, Lnh/d;->k:Lnh/d;

    iput-object p1, p0, Ljh/a$c;->l:Lnh/d;

    return-void
.end method

.method private B()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ljh/a$c;->n:I

    .line 3
    .line 4
    iput v0, p0, Ljh/a$c;->o:I

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
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

.method public static C()Ljh/a$c$b;
    .locals 1

    invoke-static {}, Ljh/a$c$b;->r()Ljh/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public static D(Ljh/a$c;)Ljh/a$c$b;
    .locals 1

    invoke-static {}, Ljh/a$c;->C()Ljh/a$c$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljh/a$c$b;->x(Ljh/a$c;)Ljh/a$c$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(Ljh/a$c;I)I
    .locals 0

    iput p1, p0, Ljh/a$c;->n:I

    return p1
.end method

.method static synthetic t(Ljh/a$c;I)I
    .locals 0

    iput p1, p0, Ljh/a$c;->o:I

    return p1
.end method

.method static synthetic u(Ljh/a$c;I)I
    .locals 0

    iput p1, p0, Ljh/a$c;->m:I

    return p1
.end method

.method static synthetic v(Ljh/a$c;)Lnh/d;
    .locals 0

    iget-object p0, p0, Ljh/a$c;->l:Lnh/d;

    return-object p0
.end method

.method public static w()Ljh/a$c;
    .locals 1

    sget-object v0, Ljh/a$c;->r:Ljh/a$c;

    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 2

    iget v0, p0, Ljh/a$c;->m:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public E()Ljh/a$c$b;
    .locals 1

    invoke-static {}, Ljh/a$c;->C()Ljh/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public F()Ljh/a$c$b;
    .locals 1

    invoke-static {p0}, Ljh/a$c;->D(Ljh/a$c;)Ljh/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lnh/q$a;
    .locals 1

    invoke-virtual {p0}, Ljh/a$c;->F()Ljh/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 3

    .line 1
    iget v0, p0, Ljh/a$c;->q:I

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
    iget v0, p0, Ljh/a$c;->m:I

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
    iget v0, p0, Ljh/a$c;->n:I

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
    iget v0, p0, Ljh/a$c;->m:I

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    and-int/2addr v0, v1

    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    iget v0, p0, Ljh/a$c;->o:I

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
    iget-object v0, p0, Ljh/a$c;->l:Lnh/d;

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
    iput v2, p0, Ljh/a$c;->q:I

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
    invoke-virtual {p0}, Ljh/a$c;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ljh/a$c;->m:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Ljh/a$c;->n:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lnh/f;->a0(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Ljh/a$c;->m:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Ljh/a$c;->o:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lnh/f;->a0(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Ljh/a$c;->l:Lnh/d;

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

    invoke-virtual {p0}, Ljh/a$c;->E()Ljh/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lnh/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/s<",
            "Ljh/a$c;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljh/a$c;->s:Lnh/s;

    return-object v0
.end method

.method public final j()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Ljh/a$c;->p:B

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
    iput-byte v1, p0, Ljh/a$c;->p:B

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

.method public x()I
    .locals 1

    iget v0, p0, Ljh/a$c;->o:I

    return v0
.end method

.method public y()I
    .locals 1

    iget v0, p0, Ljh/a$c;->n:I

    return v0
.end method

.method public z()Z
    .locals 2

    iget v0, p0, Ljh/a$c;->m:I

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
