.class final Lnet/time4j/tz/model/a;
.super Lnet/time4j/tz/model/l;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x4910b749196b6eebL


# instance fields
.field private final transient l:[Lnet/time4j/tz/q;

.field private final transient m:Z

.field private final transient n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/time4j/tz/q;",
            ">;"
        }
    .end annotation
.end field

.field private transient o:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Ljava/util/List;ZZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnet/time4j/tz/q;",
            ">;ZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/time4j/tz/model/l;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lnet/time4j/tz/model/a;->o:I

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_5

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    new-array v1, v1, [Lnet/time4j/tz/q;

    .line 18
    .line 19
    invoke-interface {p1, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, [Lnet/time4j/tz/q;

    .line 24
    .line 25
    array-length v2, v1

    .line 26
    move v3, v0

    .line 27
    move v4, v3

    .line 28
    :goto_0
    const/4 v5, 0x1

    .line 29
    if-ge v3, v2, :cond_2

    .line 30
    .line 31
    aget-object v6, v1, v3

    .line 32
    .line 33
    if-nez v4, :cond_1

    .line 34
    .line 35
    invoke-virtual {v6}, Lnet/time4j/tz/q;->e()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-gez v4, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    move v4, v0

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    :goto_1
    move v4, v5

    .line 45
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iput-boolean v4, p0, Lnet/time4j/tz/model/a;->m:Z

    .line 49
    .line 50
    if-eqz p2, :cond_3

    .line 51
    .line 52
    invoke-static {v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    if-eqz p3, :cond_4

    .line 56
    .line 57
    invoke-static {v1, p1}, Lnet/time4j/tz/model/a;->k([Lnet/time4j/tz/q;Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    :cond_4
    iput-object v1, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 61
    .line 62
    invoke-static {v5}, Lnet/time4j/tz/model/l;->f(I)J

    .line 63
    .line 64
    .line 65
    move-result-wide p1

    .line 66
    const-wide/16 v2, 0x0

    .line 67
    .line 68
    invoke-static {v1, v2, v3, p1, p2}, Lnet/time4j/tz/model/a;->o([Lnet/time4j/tz/q;JJ)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, Lnet/time4j/tz/model/a;->n:Ljava/util/List;

    .line 73
    .line 74
    return-void

    .line 75
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 76
    .line 77
    const-string p2, "Missing timezone transitions."

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
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

.method private static k([Lnet/time4j/tz/q;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lnet/time4j/tz/q;",
            "Ljava/util/List<",
            "Lnet/time4j/tz/q;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v0, p0, v0

    .line 3
    .line 4
    invoke-virtual {v0}, Lnet/time4j/tz/q;->k()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    :goto_0
    array-length v2, p0

    .line 10
    if-ge v1, v2, :cond_1

    .line 11
    .line 12
    aget-object v2, p0, v1

    .line 13
    .line 14
    invoke-virtual {v2}, Lnet/time4j/tz/q;->h()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    aget-object v0, p0, v1

    .line 21
    .line 22
    invoke-virtual {v0}, Lnet/time4j/tz/q;->k()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    aget-object v0, p0, v1

    .line 30
    .line 31
    invoke-virtual {v0}, Lnet/time4j/tz/q;->f()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    sget-object v0, Lmj/f;->k:Lmj/f;

    .line 36
    .line 37
    invoke-static {v2, v3, v0}, Lnet/time4j/a0;->p0(JLmj/f;)Lnet/time4j/a0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    new-instance v3, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v4, "Model inconsistency detected at: "

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v0, " ("

    .line 57
    .line 58
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    aget-object p0, p0, v1

    .line 62
    .line 63
    invoke-virtual {p0}, Lnet/time4j/tz/q;->f()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string p0, ") "

    .line 71
    .line 72
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string p0, " in transitions: "

    .line 76
    .line 77
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-direct {v2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v2

    .line 91
    :cond_1
    return-void
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
.end method

.method private static o([Lnet/time4j/tz/q;JJ)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lnet/time4j/tz/q;",
            "JJ)",
            "Ljava/util/List<",
            "Lnet/time4j/tz/q;",
            ">;"
        }
    .end annotation

    .line 1
    cmp-long v0, p1, p3

    .line 2
    .line 3
    if-gtz v0, :cond_5

    .line 4
    .line 5
    invoke-static {p1, p2, p0}, Lnet/time4j/tz/model/a;->r(J[Lnet/time4j/tz/q;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p3, p4, p0}, Lnet/time4j/tz/model/a;->r(J[Lnet/time4j/tz/q;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    if-lez v0, :cond_1

    .line 21
    .line 22
    add-int/lit8 v2, v0, -0x1

    .line 23
    .line 24
    aget-object v2, p0, v2

    .line 25
    .line 26
    invoke-virtual {v2}, Lnet/time4j/tz/q;->f()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    cmp-long p1, v2, p1

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    add-int/lit8 v0, v0, -0x1

    .line 35
    .line 36
    :cond_1
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    aget-object p1, p0, v1

    .line 39
    .line 40
    invoke-virtual {p1}, Lnet/time4j/tz/q;->f()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    cmp-long p1, p1, p3

    .line 45
    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    add-int/lit8 v1, v1, -0x1

    .line 49
    .line 50
    :cond_2
    if-le v0, v1, :cond_3

    .line 51
    .line 52
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 58
    .line 59
    sub-int p2, v1, v0

    .line 60
    .line 61
    add-int/lit8 p2, p2, 0x1

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    .line 65
    .line 66
    :goto_0
    if-gt v0, v1, :cond_4

    .line 67
    .line 68
    aget-object p2, p0, v0

    .line 69
    .line 70
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 82
    .line 83
    const-string p1, "Start after end."

    .line 84
    .line 85
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p0
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

.method private static r(J[Lnet/time4j/tz/q;)I
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-gt v1, v0, :cond_1

    .line 6
    .line 7
    add-int v2, v1, v0

    .line 8
    .line 9
    div-int/lit8 v2, v2, 0x2

    .line 10
    .line 11
    aget-object v3, p2, v2

    .line 12
    .line 13
    invoke-virtual {v3}, Lnet/time4j/tz/q;->f()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    cmp-long v3, v3, p0

    .line 18
    .line 19
    if-gtz v3, :cond_0

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    move v1, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 26
    .line 27
    move v0, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return v1
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

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Serialization proxy required."

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static s(J[Lnet/time4j/tz/q;)I
    .locals 7

    .line 1
    array-length v0, p2

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-gt v1, v0, :cond_1

    .line 6
    .line 7
    add-int v2, v1, v0

    .line 8
    .line 9
    div-int/lit8 v2, v2, 0x2

    .line 10
    .line 11
    aget-object v3, p2, v2

    .line 12
    .line 13
    invoke-virtual {v3}, Lnet/time4j/tz/q;->k()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-virtual {v3}, Lnet/time4j/tz/q;->h()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {v3}, Lnet/time4j/tz/q;->f()J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    int-to-long v3, v4

    .line 30
    add-long/2addr v5, v3

    .line 31
    cmp-long v3, v5, p0

    .line 32
    .line 33
    if-gtz v3, :cond_0

    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    move v1, v2

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 40
    .line 41
    move v0, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return v1
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lnet/time4j/tz/model/SPX;

    const/16 v1, 0x7e

    invoke-direct {v0, p0, v1}, Lnet/time4j/tz/model/SPX;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public a(Lnet/time4j/base/a;Lnet/time4j/base/g;)Lnet/time4j/tz/q;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lnet/time4j/tz/model/a;->m(Lnet/time4j/base/a;Lnet/time4j/base/g;Lnet/time4j/tz/model/j;)Lnet/time4j/tz/q;

    move-result-object p1

    return-object p1
.end method

.method public b()Lnet/time4j/tz/p;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    invoke-virtual {v0}, Lnet/time4j/tz/q;->h()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lnet/time4j/tz/p;->r(I)Lnet/time4j/tz/p;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
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

.method public c(Lnet/time4j/base/a;Lnet/time4j/base/g;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/base/a;",
            "Lnet/time4j/base/g;",
            ")",
            "Ljava/util/List<",
            "Lnet/time4j/tz/p;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lnet/time4j/tz/model/a;->p(Lnet/time4j/base/a;Lnet/time4j/base/g;Lnet/time4j/tz/model/j;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public d(Lnet/time4j/base/f;)Lnet/time4j/tz/q;
    .locals 2

    .line 1
    invoke-interface {p1}, Lnet/time4j/base/f;->u()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p1, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lnet/time4j/tz/model/a;->r(J[Lnet/time4j/tz/q;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 16
    .line 17
    add-int/lit8 p1, p1, -0x1

    .line 18
    .line 19
    aget-object p1, v0, p1

    .line 20
    .line 21
    :goto_0
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lnet/time4j/tz/model/a;->m:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lnet/time4j/tz/model/a;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Lnet/time4j/tz/model/a;

    .line 10
    .line 11
    iget-object v0, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 12
    .line 13
    iget-object p1, p1, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 14
    .line 15
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lnet/time4j/tz/model/a;->o:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lnet/time4j/tz/model/a;->o:I

    .line 12
    .line 13
    :cond_0
    return v0
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

.method l(Lnet/time4j/tz/model/a;II)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    iget-object v0, p1, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 9
    .line 10
    array-length v0, v0

    .line 11
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    const/4 v0, 0x0

    .line 16
    if-eq p2, p3, :cond_0

    .line 17
    .line 18
    return v0

    .line 19
    :cond_0
    move p3, v0

    .line 20
    :goto_0
    if-ge p3, p2, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 23
    .line 24
    aget-object v1, v1, p3

    .line 25
    .line 26
    iget-object v2, p1, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 27
    .line 28
    aget-object v2, v2, p3

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lnet/time4j/tz/q;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    return v0

    .line 37
    :cond_1
    add-int/lit8 p3, p3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/4 p1, 0x1

    .line 41
    return p1
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

.method m(Lnet/time4j/base/a;Lnet/time4j/base/g;Lnet/time4j/tz/model/j;)Lnet/time4j/tz/q;
    .locals 5

    .line 1
    invoke-static {p1, p2}, Lnet/time4j/tz/model/l;->j(Lnet/time4j/base/a;Lnet/time4j/base/g;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p2, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 6
    .line 7
    invoke-static {v0, v1, p2}, Lnet/time4j/tz/model/a;->s(J[Lnet/time4j/tz/q;)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    iget-object v2, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    const/4 v4, 0x0

    .line 15
    if-ne p2, v3, :cond_1

    .line 16
    .line 17
    if-nez p3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p3, p1, v0, v1}, Lnet/time4j/tz/model/j;->k(Lnet/time4j/base/a;J)Lnet/time4j/tz/q;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    :goto_0
    return-object v4

    .line 25
    :cond_1
    aget-object p1, v2, p2

    .line 26
    .line 27
    invoke-virtual {p1}, Lnet/time4j/tz/q;->l()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Lnet/time4j/tz/q;->f()J

    .line 34
    .line 35
    .line 36
    move-result-wide p2

    .line 37
    invoke-virtual {p1}, Lnet/time4j/tz/q;->h()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    int-to-long v2, v2

    .line 42
    add-long/2addr p2, v2

    .line 43
    cmp-long p2, p2, v0

    .line 44
    .line 45
    if-gtz p2, :cond_3

    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_2
    invoke-virtual {p1}, Lnet/time4j/tz/q;->m()Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_3

    .line 53
    .line 54
    invoke-virtual {p1}, Lnet/time4j/tz/q;->f()J

    .line 55
    .line 56
    .line 57
    move-result-wide p2

    .line 58
    invoke-virtual {p1}, Lnet/time4j/tz/q;->k()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    int-to-long v2, v2

    .line 63
    add-long/2addr p2, v2

    .line 64
    cmp-long p2, p2, v0

    .line 65
    .line 66
    if-gtz p2, :cond_3

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_3
    return-object v4
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

.method n()Lnet/time4j/tz/q;
    .locals 2

    iget-object v0, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method p(Lnet/time4j/base/a;Lnet/time4j/base/g;Lnet/time4j/tz/model/j;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/base/a;",
            "Lnet/time4j/base/g;",
            "Lnet/time4j/tz/model/j;",
            ")",
            "Ljava/util/List<",
            "Lnet/time4j/tz/p;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lnet/time4j/tz/model/l;->j(Lnet/time4j/base/a;Lnet/time4j/base/g;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p2, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 6
    .line 7
    invoke-static {v0, v1, p2}, Lnet/time4j/tz/model/a;->s(J[Lnet/time4j/tz/q;)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    iget-object v2, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-ne p2, v3, :cond_1

    .line 15
    .line 16
    if-nez p3, :cond_0

    .line 17
    .line 18
    array-length p1, v2

    .line 19
    add-int/lit8 p1, p1, -0x1

    .line 20
    .line 21
    aget-object p1, v2, p1

    .line 22
    .line 23
    invoke-virtual {p1}, Lnet/time4j/tz/q;->k()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {p1}, Lnet/time4j/tz/model/l;->h(I)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    invoke-virtual {p3, p1, v0, v1}, Lnet/time4j/tz/model/j;->t(Lnet/time4j/base/a;J)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_1
    aget-object p1, v2, p2

    .line 38
    .line 39
    invoke-virtual {p1}, Lnet/time4j/tz/q;->l()Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    invoke-virtual {p1}, Lnet/time4j/tz/q;->f()J

    .line 46
    .line 47
    .line 48
    move-result-wide p2

    .line 49
    invoke-virtual {p1}, Lnet/time4j/tz/q;->h()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    int-to-long v2, v2

    .line 54
    add-long/2addr p2, v2

    .line 55
    cmp-long p2, p2, v0

    .line 56
    .line 57
    if-gtz p2, :cond_3

    .line 58
    .line 59
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_2
    invoke-virtual {p1}, Lnet/time4j/tz/q;->m()Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    invoke-virtual {p1}, Lnet/time4j/tz/q;->f()J

    .line 71
    .line 72
    .line 73
    move-result-wide p2

    .line 74
    invoke-virtual {p1}, Lnet/time4j/tz/q;->k()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    int-to-long v2, v2

    .line 79
    add-long/2addr p2, v2

    .line 80
    cmp-long p2, p2, v0

    .line 81
    .line 82
    if-gtz p2, :cond_3

    .line 83
    .line 84
    invoke-virtual {p1}, Lnet/time4j/tz/q;->k()I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    invoke-virtual {p1}, Lnet/time4j/tz/q;->h()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    invoke-static {p2, p1}, Lnet/time4j/tz/model/l;->i(II)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :cond_3
    invoke-virtual {p1}, Lnet/time4j/tz/q;->h()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-static {p1}, Lnet/time4j/tz/model/l;->h(I)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1
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

.method q(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    new-array v0, p1, [Lnet/time4j/tz/q;

    .line 9
    .line 10
    iget-object v1, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {v1, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method t(ILjava/io/ObjectOutput;)V
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    invoke-static {v0, p1, p2}, Lnet/time4j/tz/model/SPX;->z([Lnet/time4j/tz/q;ILjava/io/DataOutput;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-class v1, Lnet/time4j/tz/model/a;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "[transition-count="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    .line 23
    .line 24
    array-length v1, v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ",hash="

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lnet/time4j/tz/model/a;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const/16 v1, 0x5d

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0
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

.method u(Ljava/io/ObjectOutput;)V
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/model/a;->l:[Lnet/time4j/tz/q;

    array-length v0, v0

    invoke-virtual {p0, v0, p1}, Lnet/time4j/tz/model/a;->t(ILjava/io/ObjectOutput;)V

    return-void
.end method
