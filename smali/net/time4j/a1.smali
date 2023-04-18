.class final Lnet/time4j/a1;
.super Lnet/time4j/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/time4j/a1$b;,
        Lnet/time4j/a1$c;,
        Lnet/time4j/a1$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/time4j/a<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field private static final p:Lfj/m0;

.field static final q:Lnet/time4j/a1;

.field private static final serialVersionUID:J = -0x5fdba1420201c0f4L


# instance fields
.field private final transient n:Lnet/time4j/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/o<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field private final transient o:Lnet/time4j/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/o<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lnet/time4j/a1$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lnet/time4j/a1$c;-><init>(Lnet/time4j/a1$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lnet/time4j/a1;->p:Lfj/m0;

    .line 8
    .line 9
    new-instance v0, Lnet/time4j/a1;

    .line 10
    .line 11
    const-string v1, "YEAR_OF_WEEKDATE"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lnet/time4j/a1;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lnet/time4j/a1;->q:Lnet/time4j/a1;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/a;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lnet/time4j/a1$d;

    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {p1, v0, v1, v2}, Lnet/time4j/a1$d;-><init>(JLnet/time4j/a1$a;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lnet/time4j/a1;->n:Lnet/time4j/o;

    .line 13
    .line 14
    new-instance p1, Lnet/time4j/a1$d;

    .line 15
    .line 16
    const-wide/16 v0, 0x1

    .line 17
    .line 18
    invoke-direct {p1, v0, v1, v2}, Lnet/time4j/a1$d;-><init>(JLnet/time4j/a1$a;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lnet/time4j/a1;->o:Lnet/time4j/o;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method static synthetic A(Lnet/time4j/f0;I)I
    .locals 0

    invoke-static {p0, p1}, Lnet/time4j/a1;->L(Lnet/time4j/f0;I)I

    move-result p0

    return p0
.end method

.method static synthetic B(Lnet/time4j/f0;I)I
    .locals 0

    invoke-static {p0, p1}, Lnet/time4j/a1;->M(Lnet/time4j/f0;I)I

    move-result p0

    return p0
.end method

.method static synthetic C(I)I
    .locals 0

    invoke-static {p0}, Lnet/time4j/a1;->J(I)I

    move-result p0

    return p0
.end method

.method static D(Ljava/lang/Class;)Lfj/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lfj/z<",
            "TT;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance p0, Lnet/time4j/a1$b;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnet/time4j/a1$b;-><init>(Lnet/time4j/a1$a;)V

    return-object p0
.end method

.method private static J(I)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0, v0}, Lnet/time4j/base/b;->c(III)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    invoke-static {p0}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v0, Lnet/time4j/z0;->w:Lnet/time4j/z0;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-virtual {v0}, Lnet/time4j/z0;->g()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    rsub-int/lit8 v0, v0, 0x8

    .line 21
    .line 22
    if-gt p0, v0, :cond_0

    .line 23
    .line 24
    rsub-int/lit8 p0, p0, 0x2

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    rsub-int/lit8 p0, p0, 0x9

    .line 28
    .line 29
    :goto_0
    return p0
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
.end method

.method private static L(Lnet/time4j/f0;I)I
    .locals 0

    invoke-virtual {p0}, Lnet/time4j/f0;->i()I

    move-result p0

    add-int/2addr p0, p1

    invoke-static {p0}, Lnet/time4j/a1;->J(I)I

    move-result p0

    return p0
.end method

.method private static M(Lnet/time4j/f0;I)I
    .locals 0

    invoke-virtual {p0}, Lnet/time4j/f0;->i()I

    move-result p0

    add-int/2addr p0, p1

    invoke-static {p0}, Lnet/time4j/base/b;->e(I)Z

    move-result p0

    if-eqz p0, :cond_0

    const/16 p0, 0x16e

    goto :goto_0

    :cond_0
    const/16 p0, 0x16d

    :goto_0
    return p0
.end method

.method private static N(Lnet/time4j/f0;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lnet/time4j/f0;->F0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p0, v1}, Lnet/time4j/a1;->L(Lnet/time4j/f0;I)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x1

    .line 11
    if-gt v2, v0, :cond_1

    .line 12
    .line 13
    sub-int v2, v0, v2

    .line 14
    .line 15
    div-int/lit8 v2, v2, 0x7

    .line 16
    .line 17
    add-int/2addr v2, v3

    .line 18
    const/16 v4, 0x35

    .line 19
    .line 20
    if-lt v2, v4, :cond_0

    .line 21
    .line 22
    invoke-static {p0, v3}, Lnet/time4j/a1;->L(Lnet/time4j/f0;I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-static {p0, v1}, Lnet/time4j/a1;->M(Lnet/time4j/f0;I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr v4, p0

    .line 31
    if-gt v4, v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v3, v2

    .line 35
    :goto_0
    return v3

    .line 36
    :cond_1
    const/4 v1, -0x1

    .line 37
    invoke-static {p0, v1}, Lnet/time4j/a1;->L(Lnet/time4j/f0;I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {p0, v1}, Lnet/time4j/a1;->M(Lnet/time4j/f0;I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    add-int/2addr v0, p0

    .line 46
    sub-int/2addr v0, v2

    .line 47
    div-int/lit8 v0, v0, 0x7

    .line 48
    .line 49
    add-int/2addr v0, v3

    .line 50
    return v0
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

.method static O()Lfj/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>()",
            "Lfj/m0<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lnet/time4j/a1;->p:Lfj/m0;

    return-object v0
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lnet/time4j/a1;->q:Lnet/time4j/a1;

    return-object v0
.end method

.method static synthetic y(Lnet/time4j/f0;)I
    .locals 0

    invoke-static {p0}, Lnet/time4j/a1;->N(Lnet/time4j/f0;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public E()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lnet/time4j/f0;->q:Ljava/lang/Integer;

    return-object v0
.end method

.method public F()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lnet/time4j/f0;->p:Ljava/lang/Integer;

    return-object v0
.end method

.method public G()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/a1;->F()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()C
    .locals 1

    const/16 v0, 0x59

    return v0
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/a1;->E()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-class v0, Ljava/lang/Integer;

    return-object v0
.end method

.method protected w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
