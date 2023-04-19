.class public final Lqi/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqi/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lqi/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008$\u0008\u0087@\u0018\u0000 52\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001OB\u0014\u0008\u0000\u0012\u0006\u0010/\u001a\u00020\u000b\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008N\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J\u0016\u0010\u0006\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ%\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0004J\r\u0010\u0011\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0004J\r\u0010\u0012\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0004J\u001b\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0008\u001a\u00020\u0000H\u0096\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ?\u0010\'\u001a\u00020&*\u00060 j\u0002`!2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\r\u0010)\u001a\u00020\u001d\u00a2\u0006\u0004\u0008)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010-\u001a\u00020\u00022\u0008\u0010\u0008\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0014\u0010/\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010\u0006R\u0014\u00101\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00080\u0010\u0007R\u0014\u00104\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00082\u00103R\u0017\u00106\u001a\u00020\u00008F\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\u00085\u0010\u0007R\u001a\u0010:\u001a\u00020\u00138@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u00088\u00109\u001a\u0004\u00087\u0010+R\u001a\u0010=\u001a\u00020\u00138@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008<\u00109\u001a\u0004\u0008;\u0010+R\u001a\u0010@\u001a\u00020\u00138@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008?\u00109\u001a\u0004\u0008>\u0010+R\u001a\u0010C\u001a\u00020\u00138@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008B\u00109\u001a\u0004\u0008A\u0010+R\u0011\u0010E\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010\u0007R\u0011\u0010G\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010\u0007R\u0011\u0010I\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010\u0007R\u0011\u0010K\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010\u0007R\u0011\u0010M\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010\u0007\u0088\u0001/\u0092\u0001\u00020\u000b\u00f8\u0001\u0001\u0082\u0002\u0008\n\u0002\u0008!\n\u0002\u0008\u0019\u00a8\u0006P"
    }
    d2 = {
        "Lqi/a;",
        "",
        "",
        "A",
        "(J)Z",
        "z",
        "J",
        "(J)J",
        "other",
        "E",
        "(JJ)J",
        "",
        "thisMillis",
        "otherNanos",
        "c",
        "(JJJ)J",
        "D",
        "B",
        "y",
        "",
        "i",
        "(JJ)I",
        "Lqi/d;",
        "unit",
        "",
        "F",
        "(JLqi/d;)D",
        "H",
        "(JLqi/d;)J",
        "",
        "I",
        "(J)Ljava/lang/String;",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "whole",
        "fractional",
        "fractionalSize",
        "isoZeroes",
        "",
        "e",
        "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V",
        "G",
        "x",
        "(J)I",
        "",
        "k",
        "(JLjava/lang/Object;)Z",
        "rawValue",
        "w",
        "value",
        "v",
        "(J)Lqi/d;",
        "storageUnit",
        "l",
        "absoluteValue",
        "m",
        "getHoursComponent$annotations",
        "()V",
        "hoursComponent",
        "s",
        "getMinutesComponent$annotations",
        "minutesComponent",
        "u",
        "getSecondsComponent$annotations",
        "secondsComponent",
        "t",
        "getNanosecondsComponent$annotations",
        "nanosecondsComponent",
        "n",
        "inWholeDays",
        "o",
        "inWholeHours",
        "q",
        "inWholeMinutes",
        "r",
        "inWholeSeconds",
        "p",
        "inWholeMilliseconds",
        "j",
        "a",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final l:Lqi/a$a;

.field private static final m:J

.field private static final n:J

.field private static final o:J


# instance fields
.field private final k:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqi/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lqi/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lqi/a;->l:Lqi/a$a;

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    invoke-static {v0, v1}, Lqi/a;->j(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lqi/a;->m:J

    .line 16
    .line 17
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lqi/c;->b(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    sput-wide v0, Lqi/a;->n:J

    .line 27
    .line 28
    const-wide v0, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lqi/c;->b(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    sput-wide v0, Lqi/a;->o:J

    .line 38
    .line 39
    return-void
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

.method private synthetic constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lqi/a;->k:J

    return-void
.end method

.method private static final A(J)Z
    .locals 0

    long-to-int p0, p0

    const/4 p1, 0x1

    and-int/2addr p0, p1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static final B(J)Z
    .locals 2

    sget-wide v0, Lqi/a;->n:J

    cmp-long v0, p0, v0

    if-eqz v0, :cond_1

    sget-wide v0, Lqi/a;->o:J

    cmp-long p0, p0, v0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final D(J)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final E(JJ)J
    .locals 7

    .line 1
    invoke-static {p0, p1}, Lqi/a;->B(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-static {p2, p3}, Lqi/a;->y(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    xor-long/2addr p2, p0

    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    cmp-long p2, p2, v0

    .line 17
    .line 18
    if-ltz p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    const-string p1, "Summing infinite durations of different signs yields an undefined result."

    .line 24
    .line 25
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p0

    .line 29
    :cond_1
    :goto_0
    return-wide p0

    .line 30
    :cond_2
    invoke-static {p2, p3}, Lqi/a;->B(J)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    return-wide p2

    .line 37
    :cond_3
    long-to-int v0, p0

    .line 38
    and-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    long-to-int v1, p2

    .line 41
    and-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    if-ne v0, v1, :cond_5

    .line 44
    .line 45
    invoke-static {p0, p1}, Lqi/a;->w(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    invoke-static {p2, p3}, Lqi/a;->w(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide p2

    .line 53
    add-long/2addr v0, p2

    .line 54
    invoke-static {p0, p1}, Lqi/a;->A(J)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_4

    .line 59
    .line 60
    invoke-static {v0, v1}, Lqi/c;->e(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide p0

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    invoke-static {v0, v1}, Lqi/c;->c(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide p0

    .line 69
    goto :goto_1

    .line 70
    :cond_5
    invoke-static {p0, p1}, Lqi/a;->z(J)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    invoke-static {p0, p1}, Lqi/a;->w(J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    invoke-static {p2, p3}, Lqi/a;->w(J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v5

    .line 84
    move-wide v1, p0

    .line 85
    invoke-static/range {v1 .. v6}, Lqi/a;->c(JJJ)J

    .line 86
    .line 87
    .line 88
    move-result-wide p0

    .line 89
    goto :goto_1

    .line 90
    :cond_6
    invoke-static {p2, p3}, Lqi/a;->w(J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    invoke-static {p0, p1}, Lqi/a;->w(J)J

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    move-wide v0, p0

    .line 99
    invoke-static/range {v0 .. v5}, Lqi/a;->c(JJJ)J

    .line 100
    .line 101
    .line 102
    move-result-wide p0

    .line 103
    :goto_1
    return-wide p0
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
.end method

.method public static final F(JLqi/d;)D
    .locals 2

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-wide v0, Lqi/a;->n:J

    .line 7
    .line 8
    cmp-long v0, p0, v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide/high16 p0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-wide v0, Lqi/a;->o:J

    .line 16
    .line 17
    cmp-long v0, p0, v0

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const-wide/high16 p0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {p0, p1}, Lqi/a;->w(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    long-to-double v0, v0

    .line 29
    invoke-static {p0, p1}, Lqi/a;->v(J)Lqi/d;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {v0, v1, p0, p2}, Lqi/e;->a(DLqi/d;Lqi/d;)D

    .line 34
    .line 35
    .line 36
    move-result-wide p0

    .line 37
    :goto_0
    return-wide p0
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

.method public static final G(J)Ljava/lang/String;
    .locals 11

    .line 1
    new-instance v8, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lqi/a;->D(J)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x2d

    .line 13
    .line 14
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    :cond_0
    const-string v0, "PT"

    .line 18
    .line 19
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1}, Lqi/a;->l(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    invoke-static {v0, v1}, Lqi/a;->o(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    invoke-static {v0, v1}, Lqi/a;->s(J)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-static {v0, v1}, Lqi/a;->u(J)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-static {v0, v1}, Lqi/a;->t(J)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-static {p0, p1}, Lqi/a;->B(J)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    const-wide v2, 0x9184e729fffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    :cond_1
    const-wide/16 v0, 0x0

    .line 54
    .line 55
    cmp-long v0, v2, v0

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    const/4 v7, 0x0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    move v0, v1

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v0, v7

    .line 64
    :goto_0
    if-nez v5, :cond_4

    .line 65
    .line 66
    if-eqz v6, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    move v9, v7

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    :goto_1
    move v9, v1

    .line 72
    :goto_2
    if-nez v4, :cond_6

    .line 73
    .line 74
    if-eqz v9, :cond_5

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    move v1, v7

    .line 80
    :cond_6
    :goto_3
    if-eqz v0, :cond_7

    .line 81
    .line 82
    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const/16 v2, 0x48

    .line 86
    .line 87
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    :cond_7
    if-eqz v1, :cond_8

    .line 91
    .line 92
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const/16 v2, 0x4d

    .line 96
    .line 97
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :cond_8
    if-nez v9, :cond_9

    .line 101
    .line 102
    if-nez v0, :cond_a

    .line 103
    .line 104
    if-nez v1, :cond_a

    .line 105
    .line 106
    :cond_9
    const/16 v7, 0x9

    .line 107
    .line 108
    const-string v9, "S"

    .line 109
    .line 110
    const/4 v10, 0x1

    .line 111
    move-wide v0, p0

    .line 112
    move-object v2, v8

    .line 113
    move v3, v5

    .line 114
    move v4, v6

    .line 115
    move v5, v7

    .line 116
    move-object v6, v9

    .line 117
    move v7, v10

    .line 118
    invoke-static/range {v0 .. v7}, Lqi/a;->e(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 119
    .line 120
    .line 121
    :cond_a
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    const-string p1, "StringBuilder().apply(builderAction).toString()"

    .line 126
    .line 127
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-object p0
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

.method public static final H(JLqi/d;)J
    .locals 2

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-wide v0, Lqi/a;->n:J

    .line 7
    .line 8
    cmp-long v0, p0, v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide p0, 0x7fffffffffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-wide v0, Lqi/a;->o:J

    .line 19
    .line 20
    cmp-long v0, p0, v0

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    const-wide/high16 p0, -0x8000000000000000L

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {p0, p1}, Lqi/a;->w(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {p0, p1}, Lqi/a;->v(J)Lqi/d;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {v0, v1, p0, p2}, Lqi/e;->b(JLqi/d;Lqi/d;)J

    .line 36
    .line 37
    .line 38
    move-result-wide p0

    .line 39
    :goto_0
    return-wide p0
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

.method public static I(J)Ljava/lang/String;
    .locals 14

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    const-string p0, "0s"

    .line 8
    .line 9
    goto/16 :goto_7

    .line 10
    .line 11
    :cond_0
    sget-wide v2, Lqi/a;->n:J

    .line 12
    .line 13
    cmp-long v2, p0, v2

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    const-string p0, "Infinity"

    .line 18
    .line 19
    goto/16 :goto_7

    .line 20
    .line 21
    :cond_1
    sget-wide v2, Lqi/a;->o:J

    .line 22
    .line 23
    cmp-long v2, p0, v2

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    const-string p0, "-Infinity"

    .line 28
    .line 29
    goto/16 :goto_7

    .line 30
    .line 31
    :cond_2
    invoke-static {p0, p1}, Lqi/a;->D(J)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    new-instance v11, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    const/16 v3, 0x2d

    .line 43
    .line 44
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-static {p0, p1}, Lqi/a;->l(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    invoke-static {v3, v4}, Lqi/a;->n(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    invoke-static {v3, v4}, Lqi/a;->m(J)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    invoke-static {v3, v4}, Lqi/a;->s(J)I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    invoke-static {v3, v4}, Lqi/a;->u(J)I

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    invoke-static {v3, v4}, Lqi/a;->t(J)I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    cmp-long v0, v5, v0

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    const/4 v12, 0x1

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    move v0, v12

    .line 78
    goto :goto_0

    .line 79
    :cond_4
    move v0, v1

    .line 80
    :goto_0
    if-eqz v7, :cond_5

    .line 81
    .line 82
    move v3, v12

    .line 83
    goto :goto_1

    .line 84
    :cond_5
    move v3, v1

    .line 85
    :goto_1
    if-eqz v8, :cond_6

    .line 86
    .line 87
    move v4, v12

    .line 88
    goto :goto_2

    .line 89
    :cond_6
    move v4, v1

    .line 90
    :goto_2
    if-nez v9, :cond_8

    .line 91
    .line 92
    if-eqz v10, :cond_7

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_7
    move v13, v1

    .line 96
    goto :goto_4

    .line 97
    :cond_8
    :goto_3
    move v13, v12

    .line 98
    :goto_4
    if-eqz v0, :cond_9

    .line 99
    .line 100
    invoke-virtual {v11, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const/16 v1, 0x64

    .line 104
    .line 105
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    move v1, v12

    .line 109
    :cond_9
    const/16 v5, 0x20

    .line 110
    .line 111
    if-nez v3, :cond_a

    .line 112
    .line 113
    if-eqz v0, :cond_c

    .line 114
    .line 115
    if-nez v4, :cond_a

    .line 116
    .line 117
    if-eqz v13, :cond_c

    .line 118
    .line 119
    :cond_a
    add-int/lit8 v6, v1, 0x1

    .line 120
    .line 121
    if-lez v1, :cond_b

    .line 122
    .line 123
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    :cond_b
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const/16 v1, 0x68

    .line 130
    .line 131
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    move v1, v6

    .line 135
    :cond_c
    if-nez v4, :cond_d

    .line 136
    .line 137
    if-eqz v13, :cond_f

    .line 138
    .line 139
    if-nez v3, :cond_d

    .line 140
    .line 141
    if-eqz v0, :cond_f

    .line 142
    .line 143
    :cond_d
    add-int/lit8 v6, v1, 0x1

    .line 144
    .line 145
    if-lez v1, :cond_e

    .line 146
    .line 147
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    :cond_e
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const/16 v1, 0x6d

    .line 154
    .line 155
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    move v1, v6

    .line 159
    :cond_f
    if-eqz v13, :cond_15

    .line 160
    .line 161
    add-int/lit8 v13, v1, 0x1

    .line 162
    .line 163
    if-lez v1, :cond_10

    .line 164
    .line 165
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    :cond_10
    if-nez v9, :cond_14

    .line 169
    .line 170
    if-nez v0, :cond_14

    .line 171
    .line 172
    if-nez v3, :cond_14

    .line 173
    .line 174
    if-eqz v4, :cond_11

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_11
    const v0, 0xf4240

    .line 178
    .line 179
    .line 180
    if-lt v10, v0, :cond_12

    .line 181
    .line 182
    div-int v6, v10, v0

    .line 183
    .line 184
    rem-int v7, v10, v0

    .line 185
    .line 186
    const/4 v8, 0x6

    .line 187
    const-string v9, "ms"

    .line 188
    .line 189
    const/4 v10, 0x0

    .line 190
    move-wide v3, p0

    .line 191
    move-object v5, v11

    .line 192
    invoke-static/range {v3 .. v10}, Lqi/a;->e(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 193
    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_12
    const/16 v0, 0x3e8

    .line 197
    .line 198
    if-lt v10, v0, :cond_13

    .line 199
    .line 200
    div-int/lit16 v6, v10, 0x3e8

    .line 201
    .line 202
    rem-int/lit16 v7, v10, 0x3e8

    .line 203
    .line 204
    const/4 v8, 0x3

    .line 205
    const-string v9, "us"

    .line 206
    .line 207
    const/4 v10, 0x0

    .line 208
    move-wide v3, p0

    .line 209
    move-object v5, v11

    .line 210
    invoke-static/range {v3 .. v10}, Lqi/a;->e(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 211
    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_13
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string p0, "ns"

    .line 218
    .line 219
    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_14
    :goto_5
    const/16 v8, 0x9

    .line 224
    .line 225
    const-string v0, "s"

    .line 226
    .line 227
    const/4 v1, 0x0

    .line 228
    move-wide v3, p0

    .line 229
    move-object v5, v11

    .line 230
    move v6, v9

    .line 231
    move v7, v10

    .line 232
    move-object v9, v0

    .line 233
    move v10, v1

    .line 234
    invoke-static/range {v3 .. v10}, Lqi/a;->e(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 235
    .line 236
    .line 237
    :goto_6
    move v1, v13

    .line 238
    :cond_15
    if-eqz v2, :cond_16

    .line 239
    .line 240
    if-le v1, v12, :cond_16

    .line 241
    .line 242
    const/16 p0, 0x28

    .line 243
    .line 244
    invoke-virtual {v11, v12, p0}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    const/16 p1, 0x29

    .line 249
    .line 250
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    :cond_16
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    const-string p1, "StringBuilder().apply(builderAction).toString()"

    .line 258
    .line 259
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :goto_7
    return-object p0
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

.method public static final J(J)J
    .locals 2

    invoke-static {p0, p1}, Lqi/a;->w(J)J

    move-result-wide v0

    neg-long v0, v0

    long-to-int p0, p0

    and-int/lit8 p0, p0, 0x1

    invoke-static {v0, v1, p0}, Lqi/c;->a(JI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, Lqi/a;->n:J

    return-wide v0
.end method

.method public static final synthetic b()J
    .locals 2

    sget-wide v0, Lqi/a;->m:J

    return-wide v0
.end method

.method private static final c(JJJ)J
    .locals 6

    .line 1
    invoke-static {p4, p5}, Lqi/c;->g(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    add-long v0, p2, p0

    .line 6
    .line 7
    new-instance p2, Lcg/g;

    .line 8
    .line 9
    const-wide v2, -0x431bde82d7aL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide v4, 0x431bde82d7aL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-direct {p2, v2, v3, v4, v5}, Lcg/g;-><init>(JJ)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v0, v1}, Lcg/g;->n(J)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-static {p0, p1}, Lqi/c;->f(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    sub-long/2addr p4, p0

    .line 33
    invoke-static {v0, v1}, Lqi/c;->f(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide p0

    .line 37
    add-long/2addr p0, p4

    .line 38
    invoke-static {p0, p1}, Lqi/c;->d(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide p0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-wide v2, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    const-wide v4, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static/range {v0 .. v5}, Lcg/h;->k(JJJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide p0

    .line 57
    invoke-static {p0, p1}, Lqi/c;->b(J)J

    .line 58
    .line 59
    .line 60
    move-result-wide p0

    .line 61
    :goto_0
    return-wide p0
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

.method private static final e(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    if-eqz p4, :cond_5

    .line 5
    .line 6
    const/16 p0, 0x2e

    .line 7
    .line 8
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/16 p1, 0x30

    .line 16
    .line 17
    invoke-static {p0, p5, p1}, Lpi/l;->j0(Ljava/lang/String;IC)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    const/4 p4, -0x1

    .line 26
    add-int/2addr p3, p4

    .line 27
    const/4 p5, 0x1

    .line 28
    const/4 v0, 0x0

    .line 29
    if-ltz p3, :cond_3

    .line 30
    .line 31
    :goto_0
    add-int/lit8 v1, p3, -0x1

    .line 32
    .line 33
    invoke-interface {p0, p3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eq v2, p1, :cond_0

    .line 38
    .line 39
    move v2, p5

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    move v2, v0

    .line 42
    :goto_1
    if-eqz v2, :cond_1

    .line 43
    .line 44
    move p4, p3

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    if-gez v1, :cond_2

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move p3, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    :goto_2
    add-int/2addr p4, p5

    .line 52
    const-string p1, "this.append(value, startIndex, endIndex)"

    .line 53
    .line 54
    const/4 p3, 0x3

    .line 55
    if-nez p7, :cond_4

    .line 56
    .line 57
    if-ge p4, p3, :cond_4

    .line 58
    .line 59
    invoke-virtual {p2, p0, v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    add-int/lit8 p4, p4, 0x2

    .line 67
    .line 68
    div-int/2addr p4, p3

    .line 69
    mul-int/2addr p4, p3

    .line 70
    invoke-virtual {p2, p0, v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_5
    :goto_3
    invoke-virtual {p2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    return-void
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
.end method

.method public static final synthetic f(J)Lqi/a;
    .locals 1

    new-instance v0, Lqi/a;

    invoke-direct {v0, p0, p1}, Lqi/a;-><init>(J)V

    return-object v0
.end method

.method public static i(JJ)I
    .locals 4

    .line 1
    xor-long v0, p0, p2

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-ltz v2, :cond_2

    .line 8
    .line 9
    long-to-int v0, v0

    .line 10
    and-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    long-to-int v0, p0

    .line 16
    and-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    long-to-int p2, p2

    .line 19
    and-int/lit8 p2, p2, 0x1

    .line 20
    .line 21
    sub-int/2addr v0, p2

    .line 22
    invoke-static {p0, p1}, Lqi/a;->D(J)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    neg-int v0, v0

    .line 29
    :cond_1
    return v0

    .line 30
    :cond_2
    :goto_0
    invoke-static {p0, p1, p2, p3}, Lkotlin/jvm/internal/q;->j(JJ)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
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

.method public static j(J)J
    .locals 5

    .line 1
    invoke-static {}, Lqi/b;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-static {p0, p1}, Lqi/a;->A(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Lcg/g;

    .line 14
    .line 15
    const-wide v1, -0x3ffffffffffa14bfL    # -2.0000000001722644

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    const-wide v3, 0x3ffffffffffa14bfL    # 1.9999999999138678

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v3, v4}, Lcg/g;-><init>(JJ)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, p1}, Lqi/a;->w(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-virtual {v0, v1, v2}, Lcg/g;->n(J)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 41
    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, p1}, Lqi/a;->w(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p0

    .line 51
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, " ns is out of nanoseconds range"

    .line 55
    .line 56
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :cond_1
    new-instance v0, Lcg/g;

    .line 68
    .line 69
    const-wide v1, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    const-wide v3, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    invoke-direct {v0, v1, v2, v3, v4}, Lcg/g;-><init>(JJ)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0, p1}, Lqi/a;->w(J)J

    .line 83
    .line 84
    .line 85
    move-result-wide v1

    .line 86
    invoke-virtual {v0, v1, v2}, Lcg/g;->n(J)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    new-instance v0, Lcg/g;

    .line 93
    .line 94
    const-wide v1, -0x431bde82d7aL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    const-wide v3, 0x431bde82d7aL

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    invoke-direct {v0, v1, v2, v3, v4}, Lcg/g;-><init>(JJ)V

    .line 105
    .line 106
    .line 107
    invoke-static {p0, p1}, Lqi/a;->w(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v1

    .line 111
    invoke-virtual {v0, v1, v2}, Lcg/g;->n(J)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_2

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    .line 119
    .line 120
    new-instance v1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-static {p0, p1}, Lqi/a;->w(J)J

    .line 126
    .line 127
    .line 128
    move-result-wide p0

    .line 129
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string p0, " ms is denormalized"

    .line 133
    .line 134
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    throw v0

    .line 145
    :cond_3
    new-instance v0, Ljava/lang/AssertionError;

    .line 146
    .line 147
    new-instance v1, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-static {p0, p1}, Lqi/a;->w(J)J

    .line 153
    .line 154
    .line 155
    move-result-wide p0

    .line 156
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string p0, " ms is out of milliseconds range"

    .line 160
    .line 161
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    throw v0

    .line 172
    :cond_4
    :goto_0
    return-wide p0
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

.method public static k(JLjava/lang/Object;)Z
    .locals 4

    instance-of v0, p2, Lqi/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p2, Lqi/a;

    invoke-virtual {p2}, Lqi/a;->K()J

    move-result-wide v2

    cmp-long p0, p0, v2

    if-eqz p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final l(J)J
    .locals 1

    invoke-static {p0, p1}, Lqi/a;->D(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lqi/a;->J(J)J

    move-result-wide p0

    :cond_0
    return-wide p0
.end method

.method public static final m(J)I
    .locals 2

    invoke-static {p0, p1}, Lqi/a;->B(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lqi/a;->o(J)J

    move-result-wide p0

    const/16 v0, 0x18

    int-to-long v0, v0

    rem-long/2addr p0, v0

    long-to-int p0, p0

    :goto_0
    return p0
.end method

.method public static final n(J)J
    .locals 1

    sget-object v0, Lqi/d;->r:Lqi/d;

    invoke-static {p0, p1, v0}, Lqi/a;->H(JLqi/d;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final o(J)J
    .locals 1

    sget-object v0, Lqi/d;->q:Lqi/d;

    invoke-static {p0, p1, v0}, Lqi/a;->H(JLqi/d;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final p(J)J
    .locals 1

    invoke-static {p0, p1}, Lqi/a;->z(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lqi/a;->y(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lqi/a;->w(J)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    sget-object v0, Lqi/d;->n:Lqi/d;

    invoke-static {p0, p1, v0}, Lqi/a;->H(JLqi/d;)J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public static final q(J)J
    .locals 1

    sget-object v0, Lqi/d;->p:Lqi/d;

    invoke-static {p0, p1, v0}, Lqi/a;->H(JLqi/d;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final r(J)J
    .locals 1

    sget-object v0, Lqi/d;->o:Lqi/d;

    invoke-static {p0, p1, v0}, Lqi/a;->H(JLqi/d;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final s(J)I
    .locals 2

    invoke-static {p0, p1}, Lqi/a;->B(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lqi/a;->q(J)J

    move-result-wide p0

    const/16 v0, 0x3c

    int-to-long v0, v0

    rem-long/2addr p0, v0

    long-to-int p0, p0

    :goto_0
    return p0
.end method

.method public static final t(J)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lqi/a;->B(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-static {p0, p1}, Lqi/a;->z(J)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {p0, p1}, Lqi/a;->w(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    const/16 v0, 0x3e8

    .line 20
    .line 21
    int-to-long v0, v0

    .line 22
    rem-long/2addr p0, v0

    .line 23
    invoke-static {p0, p1}, Lqi/c;->f(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide p0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {p0, p1}, Lqi/a;->w(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    const v0, 0x3b9aca00

    .line 33
    .line 34
    .line 35
    int-to-long v0, v0

    .line 36
    rem-long/2addr p0, v0

    .line 37
    :goto_0
    long-to-int p0, p0

    .line 38
    :goto_1
    return p0
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

.method public static final u(J)I
    .locals 2

    invoke-static {p0, p1}, Lqi/a;->B(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lqi/a;->r(J)J

    move-result-wide p0

    const/16 v0, 0x3c

    int-to-long v0, v0

    rem-long/2addr p0, v0

    long-to-int p0, p0

    :goto_0
    return p0
.end method

.method private static final v(J)Lqi/d;
    .locals 0

    invoke-static {p0, p1}, Lqi/a;->A(J)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lqi/d;->l:Lqi/d;

    goto :goto_0

    :cond_0
    sget-object p0, Lqi/d;->n:Lqi/d;

    :goto_0
    return-object p0
.end method

.method private static final w(J)J
    .locals 1

    const/4 v0, 0x1

    shr-long/2addr p0, v0

    return-wide p0
.end method

.method public static x(J)I
    .locals 0

    invoke-static {p0, p1}, Lco/discord/media_engine/a;->a(J)I

    move-result p0

    return p0
.end method

.method public static final y(J)Z
    .locals 0

    invoke-static {p0, p1}, Lqi/a;->B(J)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final z(J)Z
    .locals 0

    long-to-int p0, p0

    const/4 p1, 0x1

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final synthetic K()J
    .locals 2

    iget-wide v0, p0, Lqi/a;->k:J

    return-wide v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lqi/a;

    invoke-virtual {p1}, Lqi/a;->K()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lqi/a;->h(J)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    iget-wide v0, p0, Lqi/a;->k:J

    invoke-static {v0, v1, p1}, Lqi/a;->k(JLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public h(J)I
    .locals 2

    iget-wide v0, p0, Lqi/a;->k:J

    invoke-static {v0, v1, p1, p2}, Lqi/a;->i(JJ)I

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lqi/a;->k:J

    invoke-static {v0, v1}, Lqi/a;->x(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lqi/a;->k:J

    invoke-static {v0, v1}, Lqi/a;->I(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
