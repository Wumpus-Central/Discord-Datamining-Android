.class abstract Lnet/time4j/calendar/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Lnet/time4j/calendar/f<",
        "*TD;>;>",
        "Ljava/lang/Object;",
        "Lfj/k<",
        "TD;>;"
    }
.end annotation


# static fields
.field private static final a:J

.field private static final b:J

.field private static final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    const/16 v1, 0x66d

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-static {v1, v2, v0}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lfj/m;->b()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sput-wide v0, Lnet/time4j/calendar/d;->a:J

    .line 15
    .line 16
    const/16 v0, 0xbb8

    .line 17
    .line 18
    const/16 v1, 0x1b

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lfj/m;->b()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    sput-wide v0, Lnet/time4j/calendar/d;->b:J

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    const/16 v1, 0xf

    .line 32
    .line 33
    const/16 v2, -0xa4c

    .line 34
    .line 35
    invoke-static {v2, v0, v1}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lfj/m;->b()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    sput-wide v0, Lnet/time4j/calendar/d;->c:J

    .line 44
    .line 45
    return-void
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

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private f(IILnet/time4j/calendar/h;)J
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->q(II)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-virtual {p3}, Lnet/time4j/calendar/h;->getNumber()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    mul-int/lit8 v0, v0, 0x1d

    .line 12
    .line 13
    int-to-long v0, v0

    .line 14
    add-long/2addr p1, v0

    .line 15
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->p(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->v(J)Lnet/time4j/calendar/f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p3, v0}, Lnet/time4j/calendar/h;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    return-wide p1

    .line 34
    :cond_0
    const-wide/16 v0, 0x1

    .line 35
    .line 36
    add-long/2addr p1, v0

    .line 37
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->p(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    return-wide p1
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

.method private j(JJ)Z
    .locals 1

    cmp-long v0, p3, p1

    if-ltz v0, :cond_1

    invoke-virtual {p0, p3, p4}, Lnet/time4j/calendar/d;->k(J)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p3, p4}, Lnet/time4j/calendar/d;->o(J)J

    move-result-wide p3

    invoke-direct {p0, p1, p2, p3, p4}, Lnet/time4j/calendar/d;->j(JJ)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private static m(JJ)J
    .locals 0

    sub-long/2addr p2, p0

    long-to-double p0, p2

    const-wide p2, 0x403d87d4abed9decL    # 29.530588861

    div-double/2addr p0, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    return-wide p0
.end method

.method private o(J)J
    .locals 2

    .line 1
    sget-object v0, Lej/d;->l:Lej/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->n(J)Lnet/time4j/a0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lej/d;->c(Lnet/time4j/a0;)Lnet/time4j/a0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->i(J)Lnet/time4j/tz/p;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Lnet/time4j/a0;->w0(Lnet/time4j/tz/k;)Lnet/time4j/h0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lnet/time4j/h0;->i0()Lnet/time4j/f0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lfj/m;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    return-wide p1
.end method

.method private r(J)J
    .locals 8

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/time4j/calendar/d;->w(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    const-wide/16 v0, 0x172

    .line 6
    .line 7
    add-long/2addr v0, p1

    .line 8
    invoke-direct {p0, v0, v1}, Lnet/time4j/calendar/d;->w(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x1

    .line 13
    .line 14
    add-long/2addr p1, v2

    .line 15
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->p(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    add-long v4, p1, v2

    .line 20
    .line 21
    invoke-virtual {p0, v4, v5}, Lnet/time4j/calendar/d;->p(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    add-long/2addr v0, v2

    .line 26
    invoke-direct {p0, v0, v1}, Lnet/time4j/calendar/d;->o(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-static {p1, p2, v0, v1}, Lnet/time4j/calendar/d;->m(JJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide/16 v6, 0xc

    .line 35
    .line 36
    cmp-long v0, v0, v6

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->k(J)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0, v4, v5}, Lnet/time4j/calendar/d;->k(J)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    :cond_0
    add-long/2addr v4, v2

    .line 53
    invoke-virtual {p0, v4, v5}, Lnet/time4j/calendar/d;->p(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    return-wide p1

    .line 58
    :cond_1
    return-wide v4
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

.method private s(J)J
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/time4j/calendar/d;->r(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    cmp-long v2, p1, v0

    .line 6
    .line 7
    if-ltz v2, :cond_0

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0xb4

    .line 11
    .line 12
    sub-long/2addr p1, v0

    .line 13
    invoke-direct {p0, p1, p2}, Lnet/time4j/calendar/d;->r(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    return-wide p1
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

.method private w(J)J
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->i(J)Lnet/time4j/tz/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lfj/a0;->k:Lfj/a0;

    .line 6
    .line 7
    invoke-static {p1, p2, v1}, Lnet/time4j/f0;->Q0(JLfj/a0;)Lnet/time4j/f0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lnet/time4j/f0;->j()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/16 v1, 0xb

    .line 16
    .line 17
    if-le p2, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lnet/time4j/f0;->p()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    const/16 v1, 0xf

    .line 24
    .line 25
    if-gt p2, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p1}, Lnet/time4j/f0;->i()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lnet/time4j/f0;->i()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    add-int/lit8 p2, p2, -0x1

    .line 38
    .line 39
    :goto_1
    sget-object v1, Lej/b;->n:Lej/b;

    .line 40
    .line 41
    invoke-virtual {v1, p2}, Lej/b;->c(I)Lnet/time4j/a0;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2, v0}, Lnet/time4j/a0;->w0(Lnet/time4j/tz/k;)Lnet/time4j/h0;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Lnet/time4j/h0;->Y()Lnet/time4j/f0;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2, p1}, Lfj/m;->S(Lfj/g;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    add-int/lit8 p2, p2, -0x1

    .line 60
    .line 61
    invoke-virtual {v1, p2}, Lej/b;->c(I)Lnet/time4j/a0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1, v0}, Lnet/time4j/a0;->w0(Lnet/time4j/tz/k;)Lnet/time4j/h0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lnet/time4j/h0;->Y()Lnet/time4j/f0;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    :cond_2
    invoke-virtual {v2}, Lfj/m;->b()J

    .line 74
    .line 75
    .line 76
    move-result-wide p1

    .line 77
    return-wide p1
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


# virtual methods
.method public bridge synthetic a(J)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->v(J)Lnet/time4j/calendar/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)J
    .locals 2

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/d;->u(Lnet/time4j/calendar/f;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()J
    .locals 2

    sget-wide v0, Lnet/time4j/calendar/d;->b:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    sget-wide v0, Lnet/time4j/calendar/d;->a:J

    return-wide v0
.end method

.method abstract e(IILnet/time4j/calendar/h;IJ)Lnet/time4j/calendar/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lnet/time4j/calendar/h;",
            "IJ)TD;"
        }
    .end annotation
.end method

.method final g(II)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lnet/time4j/calendar/d;->h()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    add-int/lit8 p1, p1, -0x1

    .line 6
    .line 7
    mul-int/lit8 p1, p1, 0x3c

    .line 8
    .line 9
    add-int/2addr p1, p2

    .line 10
    add-int/lit8 p1, p1, -0x1

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    aget v1, v0, p2

    .line 14
    .line 15
    sub-int v1, p1, v1

    .line 16
    .line 17
    div-int/lit8 v1, v1, 0x3

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    mul-int/2addr v1, v2

    .line 21
    :goto_0
    array-length v3, v0

    .line 22
    if-ge v1, v3, :cond_2

    .line 23
    .line 24
    aget v3, v0, v1

    .line 25
    .line 26
    if-ge v3, p1, :cond_0

    .line 27
    .line 28
    sub-int v3, p1, v3

    .line 29
    .line 30
    div-int/lit8 v3, v3, 0x3

    .line 31
    .line 32
    mul-int/2addr v3, v2

    .line 33
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    add-int/2addr v1, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    if-le v3, p1, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    aget p2, v0, v1

    .line 45
    .line 46
    :cond_2
    :goto_1
    return p2
    .line 47
    .line 48
    .line 49
.end method

.method abstract h()[I
.end method

.method abstract i(J)Lnet/time4j/tz/p;
.end method

.method final k(J)Z
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->n(J)Lnet/time4j/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lej/c;->g(Lnet/time4j/a0;)Lej/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lej/c;->c()D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1}, Lnet/time4j/calendar/p;->n(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    .line 18
    .line 19
    div-double/2addr v0, v2

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    double-to-int v0, v0

    .line 25
    add-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    rem-int/lit8 v0, v0, 0xc

    .line 28
    .line 29
    const-wide/16 v4, 0x1

    .line 30
    .line 31
    add-long/2addr p1, v4

    .line 32
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->p(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->n(J)Lnet/time4j/a0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, Lej/c;->g(Lnet/time4j/a0;)Lej/c;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lej/c;->c()D

    .line 45
    .line 46
    .line 47
    move-result-wide p1

    .line 48
    invoke-static {p1, p2}, Lnet/time4j/calendar/p;->n(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    div-double/2addr p1, v2

    .line 53
    invoke-static {p1, p2}, Ljava/lang/Math;->floor(D)D

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    double-to-int p1, p1

    .line 58
    add-int/lit8 p1, p1, 0x2

    .line 59
    .line 60
    rem-int/lit8 p1, p1, 0xc

    .line 61
    .line 62
    if-ne v0, p1, :cond_0

    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 p1, 0x0

    .line 67
    :goto_0
    return p1
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

.method l(IILnet/time4j/calendar/h;I)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x48

    .line 3
    .line 4
    if-lt p1, v1, :cond_5

    .line 5
    .line 6
    const/16 v2, 0x5e

    .line 7
    .line 8
    if-gt p1, v2, :cond_5

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-lt p2, v3, :cond_5

    .line 12
    .line 13
    const/16 v4, 0x3c

    .line 14
    .line 15
    if-gt p2, v4, :cond_5

    .line 16
    .line 17
    if-ne p1, v1, :cond_0

    .line 18
    .line 19
    const/16 v1, 0x16

    .line 20
    .line 21
    if-lt p2, v1, :cond_5

    .line 22
    .line 23
    :cond_0
    if-ne p1, v2, :cond_1

    .line 24
    .line 25
    const/16 v1, 0x38

    .line 26
    .line 27
    if-gt p2, v1, :cond_5

    .line 28
    .line 29
    :cond_1
    if-lt p4, v3, :cond_5

    .line 30
    .line 31
    const/16 v1, 0x1e

    .line 32
    .line 33
    if-gt p4, v1, :cond_5

    .line 34
    .line 35
    if-eqz p3, :cond_5

    .line 36
    .line 37
    invoke-virtual {p3}, Lnet/time4j/calendar/h;->c()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-virtual {p3}, Lnet/time4j/calendar/h;->getNumber()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->g(II)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eq v2, v4, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    if-ne p4, v1, :cond_4

    .line 55
    .line 56
    invoke-direct {p0, p1, p2, p3}, Lnet/time4j/calendar/d;->f(IILnet/time4j/calendar/h;)J

    .line 57
    .line 58
    .line 59
    move-result-wide p1

    .line 60
    const-wide/16 p3, 0x1

    .line 61
    .line 62
    add-long/2addr p3, p1

    .line 63
    invoke-virtual {p0, p3, p4}, Lnet/time4j/calendar/d;->p(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide p3

    .line 67
    sub-long/2addr p3, p1

    .line 68
    const-wide/16 p1, 0x1e

    .line 69
    .line 70
    cmp-long p1, p3, p1

    .line 71
    .line 72
    if-nez p1, :cond_3

    .line 73
    .line 74
    move v0, v3

    .line 75
    :cond_3
    return v0

    .line 76
    :cond_4
    return v3

    .line 77
    :cond_5
    :goto_0
    return v0
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
.end method

.method n(J)Lnet/time4j/a0;
    .locals 1

    sget-object v0, Lfj/a0;->k:Lfj/a0;

    invoke-static {p1, p2, v0}, Lnet/time4j/f0;->Q0(JLfj/a0;)Lnet/time4j/f0;

    move-result-object v0

    invoke-virtual {v0}, Lnet/time4j/f0;->t0()Lnet/time4j/h0;

    move-result-object v0

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->i(J)Lnet/time4j/tz/p;

    move-result-object p1

    invoke-virtual {v0, p1}, Lnet/time4j/h0;->T(Lnet/time4j/tz/p;)Lnet/time4j/a0;

    move-result-object p1

    return-object p1
.end method

.method final p(J)J
    .locals 2

    .line 1
    sget-object v0, Lej/d;->l:Lej/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->n(J)Lnet/time4j/a0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lej/d;->b(Lnet/time4j/a0;)Lnet/time4j/a0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/d;->i(J)Lnet/time4j/tz/p;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Lnet/time4j/a0;->w0(Lnet/time4j/tz/k;)Lnet/time4j/h0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lnet/time4j/h0;->i0()Lnet/time4j/f0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lfj/m;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    return-wide p1
.end method

.method final q(II)J
    .locals 4

    .line 1
    sget-wide v0, Lnet/time4j/calendar/d;->c:J

    .line 2
    .line 3
    long-to-double v0, v0

    .line 4
    add-int/lit8 p1, p1, -0x1

    .line 5
    .line 6
    mul-int/lit8 p1, p1, 0x3c

    .line 7
    .line 8
    add-int/2addr p1, p2

    .line 9
    int-to-double p1, p1

    .line 10
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 11
    .line 12
    sub-double/2addr p1, v2

    .line 13
    const-wide v2, 0x4076d3e00192a737L    # 365.242189

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    mul-double/2addr p1, v2

    .line 19
    add-double/2addr v0, p1

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    double-to-long p1, p1

    .line 25
    invoke-direct {p0, p1, p2}, Lnet/time4j/calendar/d;->s(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    return-wide p1
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

.method final t(IILnet/time4j/calendar/h;I)J
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/time4j/calendar/d;->l(IILnet/time4j/calendar/h;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1, p2, p3}, Lnet/time4j/calendar/d;->f(IILnet/time4j/calendar/h;)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    int-to-long p3, p4

    .line 12
    add-long/2addr p1, p3

    .line 13
    const-wide/16 p3, 0x1

    .line 14
    .line 15
    sub-long/2addr p1, p3

    .line 16
    return-wide p1

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string p2, "Invalid date."

    .line 20
    .line 21
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1
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
.end method

.method public final u(Lnet/time4j/calendar/f;)J
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)J"
        }
    .end annotation

    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Z()I

    move-result v0

    invoke-virtual {p1}, Lnet/time4j/calendar/f;->j0()Lnet/time4j/calendar/c;

    move-result-object v1

    invoke-virtual {v1}, Lnet/time4j/calendar/o;->getNumber()I

    move-result v1

    invoke-virtual {p1}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    move-result-object v2

    invoke-virtual {p1}, Lnet/time4j/calendar/f;->p()I

    move-result p1

    invoke-virtual {p0, v0, v1, v2, p1}, Lnet/time4j/calendar/d;->t(IILnet/time4j/calendar/h;I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final v(J)Lnet/time4j/calendar/f;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TD;"
        }
    .end annotation

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    invoke-direct/range {p0 .. p2}, Lnet/time4j/calendar/d;->w(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x172

    .line 8
    .line 9
    add-long/2addr v2, v0

    .line 10
    invoke-direct {v7, v2, v3}, Lnet/time4j/calendar/d;->w(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    const-wide/16 v4, 0x1

    .line 15
    .line 16
    add-long/2addr v0, v4

    .line 17
    invoke-virtual {v7, v0, v1}, Lnet/time4j/calendar/d;->p(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    add-long/2addr v2, v4

    .line 22
    invoke-direct {v7, v2, v3}, Lnet/time4j/calendar/d;->o(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    add-long v8, p1, v4

    .line 27
    .line 28
    invoke-direct {v7, v8, v9}, Lnet/time4j/calendar/d;->o(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v8

    .line 32
    invoke-static {v0, v1, v2, v3}, Lnet/time4j/calendar/d;->m(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    const-wide/16 v10, 0xc

    .line 37
    .line 38
    cmp-long v2, v2, v10

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    if-nez v2, :cond_0

    .line 42
    .line 43
    move v2, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v2, 0x0

    .line 46
    :goto_0
    invoke-static {v0, v1, v8, v9}, Lnet/time4j/calendar/d;->m(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v10

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-direct {v7, v0, v1, v8, v9}, Lnet/time4j/calendar/d;->j(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    sub-long/2addr v10, v4

    .line 59
    :cond_1
    const/16 v6, 0xc

    .line 60
    .line 61
    invoke-static {v10, v11, v6}, Lnet/time4j/base/c;->d(JI)I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    if-nez v10, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move v6, v10

    .line 69
    :goto_1
    int-to-double v10, v6

    .line 70
    const-wide/high16 v12, 0x4028000000000000L    # 12.0

    .line 71
    .line 72
    div-double/2addr v10, v12

    .line 73
    const-wide/high16 v12, 0x3ff8000000000000L    # 1.5

    .line 74
    .line 75
    sub-double/2addr v12, v10

    .line 76
    sget-wide v10, Lnet/time4j/calendar/d;->c:J

    .line 77
    .line 78
    sub-long v10, p1, v10

    .line 79
    .line 80
    long-to-double v10, v10

    .line 81
    const-wide v14, 0x4076d3e00192a737L    # 365.242189

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    div-double/2addr v10, v14

    .line 87
    add-double/2addr v12, v10

    .line 88
    invoke-static {v12, v13}, Ljava/lang/Math;->floor(D)D

    .line 89
    .line 90
    .line 91
    move-result-wide v10

    .line 92
    double-to-long v10, v10

    .line 93
    sub-long v12, v10, v4

    .line 94
    .line 95
    const/16 v14, 0x3c

    .line 96
    .line 97
    invoke-static {v12, v13, v14}, Lnet/time4j/base/c;->b(JI)J

    .line 98
    .line 99
    .line 100
    move-result-wide v12

    .line 101
    long-to-int v12, v12

    .line 102
    add-int/2addr v3, v12

    .line 103
    invoke-static {v10, v11, v14}, Lnet/time4j/base/c;->d(JI)I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-nez v10, :cond_3

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    move v14, v10

    .line 111
    :goto_2
    sub-long v10, p1, v8

    .line 112
    .line 113
    add-long/2addr v10, v4

    .line 114
    long-to-int v4, v10

    .line 115
    invoke-static {v6}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    if-eqz v2, :cond_4

    .line 120
    .line 121
    invoke-virtual {v7, v8, v9}, Lnet/time4j/calendar/d;->k(J)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_4

    .line 126
    .line 127
    invoke-direct {v7, v8, v9}, Lnet/time4j/calendar/d;->o(J)J

    .line 128
    .line 129
    .line 130
    move-result-wide v8

    .line 131
    invoke-direct {v7, v0, v1, v8, v9}, Lnet/time4j/calendar/d;->j(JJ)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_4

    .line 136
    .line 137
    invoke-virtual {v5}, Lnet/time4j/calendar/h;->f()Lnet/time4j/calendar/h;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    move-object v5, v0

    .line 142
    :cond_4
    move-object/from16 v0, p0

    .line 143
    .line 144
    move v1, v3

    .line 145
    move v2, v14

    .line 146
    move-object v3, v5

    .line 147
    move-wide/from16 v5, p1

    .line 148
    .line 149
    invoke-virtual/range {v0 .. v6}, Lnet/time4j/calendar/d;->e(IILnet/time4j/calendar/h;IJ)Lnet/time4j/calendar/f;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0
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
.end method
