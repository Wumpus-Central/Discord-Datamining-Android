.class public final Lnh/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnh/f$a;
    }
.end annotation


# instance fields
.field private final a:[B

.field private final b:I

.field private c:I

.field private d:I

.field private final e:Ljava/io/OutputStream;


# direct methods
.method private constructor <init>(Ljava/io/OutputStream;[B)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lnh/f;->d:I

    .line 6
    .line 7
    iput-object p1, p0, Lnh/f;->e:Ljava/io/OutputStream;

    .line 8
    .line 9
    iput-object p2, p0, Lnh/f;->a:[B

    .line 10
    .line 11
    iput v0, p0, Lnh/f;->c:I

    .line 12
    .line 13
    array-length p1, p2

    .line 14
    iput p1, p0, Lnh/f;->b:I

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
.end method

.method public static A(IJ)I
    .locals 0

    invoke-static {p0}, Lnh/f;->D(I)I

    move-result p0

    invoke-static {p1, p2}, Lnh/f;->B(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static B(J)I
    .locals 0

    invoke-static {p0, p1}, Lnh/f;->H(J)J

    move-result-wide p0

    invoke-static {p0, p1}, Lnh/f;->w(J)I

    move-result p0

    return p0
.end method

.method public static C(Ljava/lang/String;)I
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    array-length v0, p0

    .line 8
    invoke-static {v0}, Lnh/f;->v(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    array-length p0, p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    add-int/2addr v0, p0

    .line 14
    return v0

    .line 15
    :catch_0
    move-exception p0

    .line 16
    new-instance v0, Ljava/lang/RuntimeException;

    .line 17
    .line 18
    const-string v1, "UTF-8 not supported."

    .line 19
    .line 20
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    throw v0
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static D(I)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lnh/z;->c(II)I

    move-result p0

    invoke-static {p0}, Lnh/f;->v(I)I

    move-result p0

    return p0
.end method

.method public static E(I)I
    .locals 0

    invoke-static {p0}, Lnh/f;->v(I)I

    move-result p0

    return p0
.end method

.method public static F(J)I
    .locals 0

    invoke-static {p0, p1}, Lnh/f;->w(J)I

    move-result p0

    return p0
.end method

.method public static G(I)I
    .locals 1

    shl-int/lit8 v0, p0, 0x1

    shr-int/lit8 p0, p0, 0x1f

    xor-int/2addr p0, v0

    return p0
.end method

.method public static H(J)J
    .locals 3

    const/4 v0, 0x1

    shl-long v0, p0, v0

    const/16 v2, 0x3f

    shr-long/2addr p0, v2

    xor-long/2addr p0, v0

    return-wide p0
.end method

.method public static J(Ljava/io/OutputStream;I)Lnh/f;
    .locals 1

    new-instance v0, Lnh/f;

    new-array p1, p1, [B

    invoke-direct {v0, p0, p1}, Lnh/f;-><init>(Ljava/io/OutputStream;[B)V

    return-object v0
.end method

.method private K()V
    .locals 4

    .line 1
    iget-object v0, p0, Lnh/f;->e:Ljava/io/OutputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lnh/f;->a:[B

    .line 6
    .line 7
    iget v2, p0, Lnh/f;->c:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 11
    .line 12
    .line 13
    iput v3, p0, Lnh/f;->c:I

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Lnh/f$a;

    .line 17
    .line 18
    invoke-direct {v0}, Lnh/f$a;-><init>()V

    .line 19
    .line 20
    .line 21
    throw v0
    .line 22
    .line 23
    .line 24
.end method

.method public static a(IZ)I
    .locals 0

    invoke-static {p0}, Lnh/f;->D(I)I

    move-result p0

    invoke-static {p1}, Lnh/f;->b(Z)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static b(Z)I
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static c([B)I
    .locals 1

    array-length v0, p0

    invoke-static {v0}, Lnh/f;->v(I)I

    move-result v0

    array-length p0, p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static d(ILnh/d;)I
    .locals 0

    invoke-static {p0}, Lnh/f;->D(I)I

    move-result p0

    invoke-static {p1}, Lnh/f;->e(Lnh/d;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static e(Lnh/d;)I
    .locals 1

    invoke-virtual {p0}, Lnh/d;->size()I

    move-result v0

    invoke-static {v0}, Lnh/f;->v(I)I

    move-result v0

    invoke-virtual {p0}, Lnh/d;->size()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static f(ID)I
    .locals 0

    invoke-static {p0}, Lnh/f;->D(I)I

    move-result p0

    invoke-static {p1, p2}, Lnh/f;->g(D)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static g(D)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static h(II)I
    .locals 0

    invoke-static {p0}, Lnh/f;->D(I)I

    move-result p0

    invoke-static {p1}, Lnh/f;->i(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static i(I)I
    .locals 0

    invoke-static {p0}, Lnh/f;->p(I)I

    move-result p0

    return p0
.end method

.method public static j(I)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static k(J)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static l(IF)I
    .locals 0

    invoke-static {p0}, Lnh/f;->D(I)I

    move-result p0

    invoke-static {p1}, Lnh/f;->m(F)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static m(F)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static n(Lnh/q;)I
    .locals 0

    invoke-interface {p0}, Lnh/q;->d()I

    move-result p0

    return p0
.end method

.method public static o(II)I
    .locals 0

    invoke-static {p0}, Lnh/f;->D(I)I

    move-result p0

    invoke-static {p1}, Lnh/f;->p(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static p(I)I
    .locals 0

    if-ltz p0, :cond_0

    invoke-static {p0}, Lnh/f;->v(I)I

    move-result p0

    return p0

    :cond_0
    const/16 p0, 0xa

    return p0
.end method

.method public static q(J)I
    .locals 0

    invoke-static {p0, p1}, Lnh/f;->w(J)I

    move-result p0

    return p0
.end method

.method public static r(Lnh/m;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnh/m;->b()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Lnh/f;->v(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0
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
    .line 25
    .line 26
    .line 27
.end method

.method public static s(ILnh/q;)I
    .locals 0

    invoke-static {p0}, Lnh/f;->D(I)I

    move-result p0

    invoke-static {p1}, Lnh/f;->t(Lnh/q;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static t(Lnh/q;)I
    .locals 1

    .line 1
    invoke-interface {p0}, Lnh/q;->d()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Lnh/f;->v(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0
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
    .line 25
    .line 26
    .line 27
.end method

.method static u(I)I
    .locals 1

    const/16 v0, 0x1000

    if-le p0, v0, :cond_0

    return v0

    :cond_0
    return p0
.end method

.method public static v(I)I
    .locals 1

    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr p0, v0

    if-nez p0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, 0x5

    return p0
.end method

.method public static w(J)I
    .locals 4

    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-wide/16 v0, -0x4000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const-wide/32 v0, -0x200000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const-wide/32 v0, -0x10000000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const-wide v0, -0x800000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    const/4 p0, 0x5

    return p0

    :cond_4
    const-wide v0, -0x40000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    const/4 p0, 0x6

    return p0

    :cond_5
    const-wide/high16 v0, -0x2000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_6

    const/4 p0, 0x7

    return p0

    :cond_6
    const-wide/high16 v0, -0x100000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_7

    const/16 p0, 0x8

    return p0

    :cond_7
    const-wide/high16 v0, -0x8000000000000000L

    and-long/2addr p0, v0

    cmp-long p0, p0, v2

    if-nez p0, :cond_8

    const/16 p0, 0x9

    return p0

    :cond_8
    const/16 p0, 0xa

    return p0
.end method

.method public static x(I)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static y(J)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static z(I)I
    .locals 0

    invoke-static {p0}, Lnh/f;->G(I)I

    move-result p0

    invoke-static {p0}, Lnh/f;->v(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public I()V
    .locals 1

    .line 1
    iget-object v0, p0, Lnh/f;->e:Ljava/io/OutputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lnh/f;->K()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
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

.method public L(IZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lnh/f;->w0(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lnh/f;->M(Z)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 25
    .line 26
    .line 27
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
.end method

.method public M(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lnh/f;->h0(I)V

    return-void
.end method

.method public N([B)V
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    invoke-virtual {p0, v0}, Lnh/f;->o0(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lnh/f;->k0([B)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 25
    .line 26
    .line 27
.end method

.method public O(ILnh/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, p1, v0}, Lnh/f;->w0(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lnh/f;->P(Lnh/d;)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 25
    .line 26
    .line 27
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
.end method

.method public P(Lnh/d;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lnh/d;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lnh/f;->o0(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lnh/f;->i0(Lnh/d;)V

    .line 9
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
    .line 25
    .line 26
    .line 27
.end method

.method public Q(ID)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lnh/f;->w0(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2, p3}, Lnh/f;->R(D)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 25
    .line 26
    .line 27
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
.end method

.method public R(D)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lnh/f;->n0(J)V

    return-void
.end method

.method public S(II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lnh/f;->w0(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lnh/f;->T(I)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 25
    .line 26
    .line 27
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
.end method

.method public T(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lnh/f;->b0(I)V

    return-void
.end method

.method public U(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lnh/f;->m0(I)V

    return-void
.end method

.method public V(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnh/f;->n0(J)V

    return-void
.end method

.method public W(IF)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, p1, v0}, Lnh/f;->w0(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lnh/f;->X(F)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 25
    .line 26
    .line 27
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
.end method

.method public X(F)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1}, Lnh/f;->m0(I)V

    return-void
.end method

.method public Y(ILnh/q;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, p1, v0}, Lnh/f;->w0(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lnh/f;->Z(Lnh/q;)V

    .line 6
    .line 7
    .line 8
    const/4 p2, 0x4

    .line 9
    invoke-virtual {p0, p1, p2}, Lnh/f;->w0(II)V

    .line 10
    .line 11
    .line 12
    return-void
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
    .line 25
    .line 26
    .line 27
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
.end method

.method public Z(Lnh/q;)V
    .locals 0

    invoke-interface {p1, p0}, Lnh/q;->e(Lnh/f;)V

    return-void
.end method

.method public a0(II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lnh/f;->w0(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lnh/f;->b0(I)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 25
    .line 26
    .line 27
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
.end method

.method public b0(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnh/f;->o0(I)V

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    int-to-long v0, p1

    .line 8
    invoke-virtual {p0, v0, v1}, Lnh/f;->p0(J)V

    .line 9
    .line 10
    .line 11
    :goto_0
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
    .line 25
    .line 26
    .line 27
.end method

.method public c0(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnh/f;->p0(J)V

    return-void
.end method

.method public d0(ILnh/q;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, p1, v0}, Lnh/f;->w0(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lnh/f;->e0(Lnh/q;)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 25
    .line 26
    .line 27
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
.end method

.method public e0(Lnh/q;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lnh/q;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lnh/f;->o0(I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p0}, Lnh/q;->e(Lnh/f;)V

    .line 9
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
    .line 25
    .line 26
    .line 27
.end method

.method public f0(ILnh/q;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x3

    .line 3
    invoke-virtual {p0, v0, v1}, Lnh/f;->w0(II)V

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-virtual {p0, v2, p1}, Lnh/f;->x0(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1, p2}, Lnh/f;->d0(ILnh/q;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x4

    .line 14
    invoke-virtual {p0, v0, p1}, Lnh/f;->w0(II)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
.end method

.method public g0(B)V
    .locals 3

    .line 1
    iget v0, p0, Lnh/f;->c:I

    .line 2
    .line 3
    iget v1, p0, Lnh/f;->b:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lnh/f;->K()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lnh/f;->a:[B

    .line 11
    .line 12
    iget v1, p0, Lnh/f;->c:I

    .line 13
    .line 14
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    iput v2, p0, Lnh/f;->c:I

    .line 17
    .line 18
    aput-byte p1, v0, v1

    .line 19
    .line 20
    iget p1, p0, Lnh/f;->d:I

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    iput p1, p0, Lnh/f;->d:I

    .line 25
    .line 26
    return-void
    .line 27
.end method

.method public h0(I)V
    .locals 0

    int-to-byte p1, p1

    invoke-virtual {p0, p1}, Lnh/f;->g0(B)V

    return-void
.end method

.method public i0(Lnh/d;)V
    .locals 2

    invoke-virtual {p1}, Lnh/d;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lnh/f;->j0(Lnh/d;II)V

    return-void
.end method

.method public j0(Lnh/d;II)V
    .locals 3

    .line 1
    iget v0, p0, Lnh/f;->b:I

    .line 2
    .line 3
    iget v1, p0, Lnh/f;->c:I

    .line 4
    .line 5
    sub-int v2, v0, v1

    .line 6
    .line 7
    if-lt v2, p3, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lnh/f;->a:[B

    .line 10
    .line 11
    invoke-virtual {p1, v0, p2, v1, p3}, Lnh/d;->n([BIII)V

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lnh/f;->c:I

    .line 15
    .line 16
    add-int/2addr p1, p3

    .line 17
    iput p1, p0, Lnh/f;->c:I

    .line 18
    .line 19
    iget p1, p0, Lnh/f;->d:I

    .line 20
    .line 21
    add-int/2addr p1, p3

    .line 22
    iput p1, p0, Lnh/f;->d:I

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    sub-int/2addr v0, v1

    .line 26
    iget-object v2, p0, Lnh/f;->a:[B

    .line 27
    .line 28
    invoke-virtual {p1, v2, p2, v1, v0}, Lnh/d;->n([BIII)V

    .line 29
    .line 30
    .line 31
    add-int/2addr p2, v0

    .line 32
    sub-int/2addr p3, v0

    .line 33
    iget v1, p0, Lnh/f;->b:I

    .line 34
    .line 35
    iput v1, p0, Lnh/f;->c:I

    .line 36
    .line 37
    iget v1, p0, Lnh/f;->d:I

    .line 38
    .line 39
    add-int/2addr v1, v0

    .line 40
    iput v1, p0, Lnh/f;->d:I

    .line 41
    .line 42
    invoke-direct {p0}, Lnh/f;->K()V

    .line 43
    .line 44
    .line 45
    iget v0, p0, Lnh/f;->b:I

    .line 46
    .line 47
    if-gt p3, v0, :cond_1

    .line 48
    .line 49
    iget-object v0, p0, Lnh/f;->a:[B

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-virtual {p1, v0, p2, v1, p3}, Lnh/d;->n([BIII)V

    .line 53
    .line 54
    .line 55
    iput p3, p0, Lnh/f;->c:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v0, p0, Lnh/f;->e:Ljava/io/OutputStream;

    .line 59
    .line 60
    invoke-virtual {p1, v0, p2, p3}, Lnh/d;->D(Ljava/io/OutputStream;II)V

    .line 61
    .line 62
    .line 63
    :goto_0
    iget p1, p0, Lnh/f;->d:I

    .line 64
    .line 65
    add-int/2addr p1, p3

    .line 66
    iput p1, p0, Lnh/f;->d:I

    .line 67
    .line 68
    :goto_1
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method public k0([B)V
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lnh/f;->l0([BII)V

    return-void
.end method

.method public l0([BII)V
    .locals 3

    .line 1
    iget v0, p0, Lnh/f;->b:I

    .line 2
    .line 3
    iget v1, p0, Lnh/f;->c:I

    .line 4
    .line 5
    sub-int v2, v0, v1

    .line 6
    .line 7
    if-lt v2, p3, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lnh/f;->a:[B

    .line 10
    .line 11
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lnh/f;->c:I

    .line 15
    .line 16
    add-int/2addr p1, p3

    .line 17
    iput p1, p0, Lnh/f;->c:I

    .line 18
    .line 19
    iget p1, p0, Lnh/f;->d:I

    .line 20
    .line 21
    add-int/2addr p1, p3

    .line 22
    iput p1, p0, Lnh/f;->d:I

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    sub-int/2addr v0, v1

    .line 26
    iget-object v2, p0, Lnh/f;->a:[B

    .line 27
    .line 28
    invoke-static {p1, p2, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    add-int/2addr p2, v0

    .line 32
    sub-int/2addr p3, v0

    .line 33
    iget v1, p0, Lnh/f;->b:I

    .line 34
    .line 35
    iput v1, p0, Lnh/f;->c:I

    .line 36
    .line 37
    iget v1, p0, Lnh/f;->d:I

    .line 38
    .line 39
    add-int/2addr v1, v0

    .line 40
    iput v1, p0, Lnh/f;->d:I

    .line 41
    .line 42
    invoke-direct {p0}, Lnh/f;->K()V

    .line 43
    .line 44
    .line 45
    iget v0, p0, Lnh/f;->b:I

    .line 46
    .line 47
    if-gt p3, v0, :cond_1

    .line 48
    .line 49
    iget-object v0, p0, Lnh/f;->a:[B

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 53
    .line 54
    .line 55
    iput p3, p0, Lnh/f;->c:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v0, p0, Lnh/f;->e:Ljava/io/OutputStream;

    .line 59
    .line 60
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 61
    .line 62
    .line 63
    :goto_0
    iget p1, p0, Lnh/f;->d:I

    .line 64
    .line 65
    add-int/2addr p1, p3

    .line 66
    iput p1, p0, Lnh/f;->d:I

    .line 67
    .line 68
    :goto_1
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method public m0(I)V
    .locals 1

    .line 1
    and-int/lit16 v0, p1, 0xff

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnh/f;->h0(I)V

    .line 4
    .line 5
    .line 6
    shr-int/lit8 v0, p1, 0x8

    .line 7
    .line 8
    and-int/lit16 v0, v0, 0xff

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lnh/f;->h0(I)V

    .line 11
    .line 12
    .line 13
    shr-int/lit8 v0, p1, 0x10

    .line 14
    .line 15
    and-int/lit16 v0, v0, 0xff

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lnh/f;->h0(I)V

    .line 18
    .line 19
    .line 20
    shr-int/lit8 p1, p1, 0x18

    .line 21
    .line 22
    and-int/lit16 p1, p1, 0xff

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lnh/f;->h0(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public n0(J)V
    .locals 2

    .line 1
    long-to-int v0, p1

    .line 2
    and-int/lit16 v0, v0, 0xff

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lnh/f;->h0(I)V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    shr-long v0, p1, v0

    .line 10
    .line 11
    long-to-int v0, v0

    .line 12
    and-int/lit16 v0, v0, 0xff

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lnh/f;->h0(I)V

    .line 15
    .line 16
    .line 17
    const/16 v0, 0x10

    .line 18
    .line 19
    shr-long v0, p1, v0

    .line 20
    .line 21
    long-to-int v0, v0

    .line 22
    and-int/lit16 v0, v0, 0xff

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lnh/f;->h0(I)V

    .line 25
    .line 26
    .line 27
    const/16 v0, 0x18

    .line 28
    .line 29
    shr-long v0, p1, v0

    .line 30
    .line 31
    long-to-int v0, v0

    .line 32
    and-int/lit16 v0, v0, 0xff

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lnh/f;->h0(I)V

    .line 35
    .line 36
    .line 37
    const/16 v0, 0x20

    .line 38
    .line 39
    shr-long v0, p1, v0

    .line 40
    .line 41
    long-to-int v0, v0

    .line 42
    and-int/lit16 v0, v0, 0xff

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lnh/f;->h0(I)V

    .line 45
    .line 46
    .line 47
    const/16 v0, 0x28

    .line 48
    .line 49
    shr-long v0, p1, v0

    .line 50
    .line 51
    long-to-int v0, v0

    .line 52
    and-int/lit16 v0, v0, 0xff

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lnh/f;->h0(I)V

    .line 55
    .line 56
    .line 57
    const/16 v0, 0x30

    .line 58
    .line 59
    shr-long v0, p1, v0

    .line 60
    .line 61
    long-to-int v0, v0

    .line 62
    and-int/lit16 v0, v0, 0xff

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lnh/f;->h0(I)V

    .line 65
    .line 66
    .line 67
    const/16 v0, 0x38

    .line 68
    .line 69
    shr-long/2addr p1, v0

    .line 70
    long-to-int p1, p1

    .line 71
    and-int/lit16 p1, p1, 0xff

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lnh/f;->h0(I)V

    .line 74
    .line 75
    .line 76
    return-void
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

.method public o0(I)V
    .locals 1

    .line 1
    :goto_0
    and-int/lit8 v0, p1, -0x80

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lnh/f;->h0(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    and-int/lit8 v0, p1, 0x7f

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lnh/f;->h0(I)V

    .line 14
    .line 15
    .line 16
    ushr-int/lit8 p1, p1, 0x7

    .line 17
    .line 18
    goto :goto_0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public p0(J)V
    .locals 4

    .line 1
    :goto_0
    const-wide/16 v0, -0x80

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    long-to-int p1, p1

    .line 11
    invoke-virtual {p0, p1}, Lnh/f;->h0(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    long-to-int v0, p1

    .line 16
    and-int/lit8 v0, v0, 0x7f

    .line 17
    .line 18
    or-int/lit16 v0, v0, 0x80

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lnh/f;->h0(I)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x7

    .line 24
    ushr-long/2addr p1, v0

    .line 25
    goto :goto_0
    .line 26
    .line 27
.end method

.method public q0(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lnh/f;->m0(I)V

    return-void
.end method

.method public r0(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnh/f;->n0(J)V

    return-void
.end method

.method public s0(I)V
    .locals 0

    invoke-static {p1}, Lnh/f;->G(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lnh/f;->o0(I)V

    return-void
.end method

.method public t0(IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lnh/f;->w0(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2, p3}, Lnh/f;->u0(J)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 25
    .line 26
    .line 27
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
.end method

.method public u0(J)V
    .locals 0

    invoke-static {p1, p2}, Lnh/f;->H(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lnh/f;->p0(J)V

    return-void
.end method

.method public v0(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    array-length v0, p1

    .line 8
    invoke-virtual {p0, v0}, Lnh/f;->o0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lnh/f;->k0([B)V

    .line 12
    .line 13
    .line 14
    return-void
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
    .line 25
    .line 26
    .line 27
.end method

.method public w0(II)V
    .locals 0

    invoke-static {p1, p2}, Lnh/z;->c(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lnh/f;->o0(I)V

    return-void
.end method

.method public x0(II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lnh/f;->w0(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lnh/f;->y0(I)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 25
    .line 26
    .line 27
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
.end method

.method public y0(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lnh/f;->o0(I)V

    return-void
.end method

.method public z0(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnh/f;->p0(J)V

    return-void
.end method
