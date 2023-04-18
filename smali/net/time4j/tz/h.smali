.class final Lnet/time4j/tz/h;
.super Lnet/time4j/tz/l;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x7507ebf4e04b2c0fL


# instance fields
.field private final transient F:Lnet/time4j/tz/p;

.field private final id:Lnet/time4j/tz/k;

.field private final strict:Z

.field private final tz:Ljava/util/TimeZone;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lnet/time4j/tz/l;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 3
    iput-object v0, p0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lnet/time4j/tz/h;->strict:Z

    .line 5
    iput-object v0, p0, Lnet/time4j/tz/h;->F:Lnet/time4j/tz/p;

    return-void
.end method

.method constructor <init>(Lnet/time4j/tz/k;)V
    .locals 2

    .line 6
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    const/4 v1, 0x0

    .line 7
    invoke-direct {p0, p1, v0, v1}, Lnet/time4j/tz/h;-><init>(Lnet/time4j/tz/k;Ljava/util/TimeZone;Z)V

    return-void
.end method

.method constructor <init>(Lnet/time4j/tz/k;Ljava/lang/String;)V
    .locals 1

    .line 8
    invoke-static {p2}, Lnet/time4j/tz/h;->R(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnet/time4j/tz/h;-><init>(Lnet/time4j/tz/k;Ljava/util/TimeZone;Z)V

    return-void
.end method

.method private constructor <init>(Lnet/time4j/tz/k;Ljava/util/TimeZone;Z)V
    .locals 1

    .line 9
    invoke-direct {p0}, Lnet/time4j/tz/l;-><init>()V

    .line 10
    iput-object p1, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 11
    invoke-virtual {p2}, Ljava/util/TimeZone;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/TimeZone;

    iput-object p1, p0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    .line 12
    iput-boolean p3, p0, Lnet/time4j/tz/h;->strict:Z

    .line 13
    invoke-virtual {p1}, Ljava/util/TimeZone;->useDaylightTime()Z

    move-result p2

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    .line 14
    iput-object p3, p0, Lnet/time4j/tz/h;->F:Lnet/time4j/tz/p;

    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object p2

    const-string v0, "GMT"

    .line 16
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Etc/"

    .line 17
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Greenwich"

    .line 18
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "UCT"

    .line 19
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "UTC"

    .line 20
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Universal"

    .line 21
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Zulu"

    .line 22
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p2, 0x1

    :goto_1
    if-eqz p2, :cond_3

    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ljava/util/TimeZone;->getOffset(J)I

    move-result p1

    .line 24
    invoke-static {p1}, Lnet/time4j/tz/h;->S(I)Lnet/time4j/tz/p;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/tz/h;->F:Lnet/time4j/tz/p;

    goto :goto_2

    .line 25
    :cond_3
    iput-object p3, p0, Lnet/time4j/tz/h;->F:Lnet/time4j/tz/p;

    :goto_2
    return-void
.end method

.method static R(Ljava/lang/String;)Ljava/util/TimeZone;
    .locals 2

    .line 1
    const-string v0, "Z"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "GMT+00:00"

    .line 10
    .line 11
    invoke-static {p0}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string v0, "UTC"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const-string v1, "GMT"

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_1
    const-string v0, "UT"

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const/4 v1, 0x2

    .line 68
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_2
    invoke-static {p0}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
    .line 89
    .line 90
.end method

.method private static S(I)Lnet/time4j/tz/p;
    .locals 1

    .line 1
    const/16 v0, 0x3e8

    .line 2
    .line 3
    invoke-static {p0, v0}, Lnet/time4j/base/c;->a(II)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {p0}, Lnet/time4j/tz/p;->r(I)Lnet/time4j/tz/p;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
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

.method private readResolve()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnet/time4j/tz/h;

    .line 6
    .line 7
    invoke-direct {v0}, Lnet/time4j/tz/h;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v1, Lnet/time4j/tz/h;

    .line 12
    .line 13
    iget-object v2, p0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    .line 14
    .line 15
    iget-boolean v3, p0, Lnet/time4j/tz/h;->strict:Z

    .line 16
    .line 17
    invoke-direct {v1, v0, v2, v3}, Lnet/time4j/tz/h;-><init>(Lnet/time4j/tz/k;Ljava/util/TimeZone;Z)V

    .line 18
    .line 19
    .line 20
    return-object v1
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public A(Lnet/time4j/base/a;Lnet/time4j/base/g;)Lnet/time4j/tz/p;
    .locals 12

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/h;->F:Lnet/time4j/tz/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-interface {p1}, Lnet/time4j/base/a;->i()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-interface {p1}, Lnet/time4j/base/a;->j()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-interface {p1}, Lnet/time4j/base/a;->p()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-interface {p2}, Lnet/time4j/base/g;->q()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/16 v4, 0x18

    .line 23
    .line 24
    if-ne v3, v4, :cond_1

    .line 25
    .line 26
    invoke-static {p1}, Lnet/time4j/base/b;->k(Lnet/time4j/base/a;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    const-wide/16 v2, 0x1

    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, Lnet/time4j/base/c;->f(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-static {v0, v1}, Lnet/time4j/base/b;->l(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {v0, v1}, Lnet/time4j/base/b;->i(J)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-static {v0, v1}, Lnet/time4j/base/b;->h(J)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-static {v0, v1}, Lnet/time4j/base/b;->g(J)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    move v9, v0

    .line 53
    move v1, v2

    .line 54
    move v0, p1

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move v9, v2

    .line 57
    :goto_0
    const/4 p1, 0x0

    .line 58
    const/4 v2, 0x1

    .line 59
    if-lez v0, :cond_2

    .line 60
    .line 61
    move v7, v0

    .line 62
    move v6, v2

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    rsub-int/lit8 v3, v0, 0x1

    .line 65
    .line 66
    move v6, p1

    .line 67
    move v7, v3

    .line 68
    :goto_1
    invoke-static {v0, v1, v9}, Lnet/time4j/base/b;->c(III)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    add-int/2addr v0, v2

    .line 73
    const/16 v3, 0x8

    .line 74
    .line 75
    if-ne v0, v3, :cond_3

    .line 76
    .line 77
    move v10, v2

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    move v10, v0

    .line 80
    :goto_2
    invoke-interface {p2}, Lnet/time4j/base/g;->q()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-ne v0, v4, :cond_4

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    invoke-interface {p2}, Lnet/time4j/base/g;->q()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    mul-int/lit16 p1, p1, 0xe10

    .line 92
    .line 93
    invoke-interface {p2}, Lnet/time4j/base/g;->e()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    mul-int/lit8 v0, v0, 0x3c

    .line 98
    .line 99
    add-int/2addr p1, v0

    .line 100
    invoke-interface {p2}, Lnet/time4j/base/g;->s()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    add-int/2addr p1, v0

    .line 105
    mul-int/lit16 p1, p1, 0x3e8

    .line 106
    .line 107
    invoke-interface {p2}, Lnet/time4j/base/g;->a()I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    const v0, 0xf4240

    .line 112
    .line 113
    .line 114
    div-int/2addr p2, v0

    .line 115
    add-int/2addr p1, p2

    .line 116
    :goto_3
    move v11, p1

    .line 117
    iget-object p1, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 118
    .line 119
    if-nez p1, :cond_5

    .line 120
    .line 121
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    goto :goto_4

    .line 126
    :cond_5
    iget-object p1, p0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    .line 127
    .line 128
    :goto_4
    move-object v5, p1

    .line 129
    add-int/lit8 v8, v1, -0x1

    .line 130
    .line 131
    invoke-virtual/range {v5 .. v11}, Ljava/util/TimeZone;->getOffset(IIIIII)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    invoke-static {p1}, Lnet/time4j/tz/h;->S(I)Lnet/time4j/tz/p;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    return-object p1
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

.method public B(Lnet/time4j/base/f;)Lnet/time4j/tz/p;
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lnet/time4j/tz/h;->F:Lnet/time4j/tz/p;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_1
    iget-object v0, p0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    .line 16
    .line 17
    :goto_0
    invoke-interface {p1}, Lnet/time4j/base/f;->u()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    const-wide/16 v3, 0x3e8

    .line 22
    .line 23
    mul-long/2addr v1, v3

    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/util/TimeZone;->getOffset(J)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Lnet/time4j/tz/h;->S(I)Lnet/time4j/tz/p;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
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

.method public E()Lnet/time4j/tz/o;
    .locals 1

    iget-boolean v0, p0, Lnet/time4j/tz/h;->strict:Z

    if-eqz v0, :cond_0

    sget-object v0, Lnet/time4j/tz/l;->o:Lnet/time4j/tz/o;

    goto :goto_0

    :cond_0
    sget-object v0, Lnet/time4j/tz/l;->n:Lnet/time4j/tz/o;

    :goto_0
    return-object v0
.end method

.method public I(Lnet/time4j/base/f;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/h;->F:Lnet/time4j/tz/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object v0, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    .line 17
    .line 18
    :goto_0
    new-instance v1, Ljava/util/Date;

    .line 19
    .line 20
    invoke-interface {p1}, Lnet/time4j/base/f;->u()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    const-wide/16 v4, 0x3e8

    .line 25
    .line 26
    mul-long/2addr v2, v4

    .line 27
    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/TimeZone;->inDaylightTime(Ljava/util/Date;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
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

.method public J()Z
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/h;->F:Lnet/time4j/tz/p;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public K(Lnet/time4j/base/a;Lnet/time4j/base/g;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lnet/time4j/tz/h;->F:Lnet/time4j/tz/p;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    invoke-interface/range {p1 .. p1}, Lnet/time4j/base/a;->i()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface/range {p1 .. p1}, Lnet/time4j/base/a;->j()I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    invoke-interface/range {p1 .. p1}, Lnet/time4j/base/a;->p()I

    .line 18
    .line 19
    .line 20
    move-result v11

    .line 21
    invoke-interface/range {p2 .. p2}, Lnet/time4j/base/g;->q()I

    .line 22
    .line 23
    .line 24
    move-result v12

    .line 25
    invoke-interface/range {p2 .. p2}, Lnet/time4j/base/g;->e()I

    .line 26
    .line 27
    .line 28
    move-result v13

    .line 29
    invoke-interface/range {p2 .. p2}, Lnet/time4j/base/g;->s()I

    .line 30
    .line 31
    .line 32
    move-result v14

    .line 33
    invoke-interface/range {p2 .. p2}, Lnet/time4j/base/g;->a()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const v4, 0xf4240

    .line 38
    .line 39
    .line 40
    div-int v15, v3, v4

    .line 41
    .line 42
    iget-object v3, v0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 43
    .line 44
    if-nez v3, :cond_1

    .line 45
    .line 46
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget-object v3, v0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    .line 52
    .line 53
    :goto_0
    new-instance v9, Ljava/util/GregorianCalendar;

    .line 54
    .line 55
    invoke-direct {v9, v3}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    .line 56
    .line 57
    .line 58
    const/16 v8, 0xe

    .line 59
    .line 60
    invoke-virtual {v9, v8, v15}, Ljava/util/Calendar;->set(II)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v5, v10, -0x1

    .line 64
    .line 65
    move-object v3, v9

    .line 66
    move v4, v1

    .line 67
    move v6, v11

    .line 68
    move v7, v12

    .line 69
    move v2, v8

    .line 70
    move v8, v13

    .line 71
    move-object v2, v9

    .line 72
    move v9, v14

    .line 73
    invoke-virtual/range {v3 .. v9}, Ljava/util/Calendar;->set(IIIIII)V

    .line 74
    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-ne v4, v1, :cond_3

    .line 82
    .line 83
    const/4 v1, 0x2

    .line 84
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    add-int/2addr v1, v3

    .line 89
    if-ne v1, v10, :cond_3

    .line 90
    .line 91
    const/4 v1, 0x5

    .line 92
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-ne v1, v11, :cond_3

    .line 97
    .line 98
    const/16 v1, 0xb

    .line 99
    .line 100
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-ne v1, v12, :cond_3

    .line 105
    .line 106
    const/16 v1, 0xc

    .line 107
    .line 108
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-ne v1, v13, :cond_3

    .line 113
    .line 114
    const/16 v1, 0xd

    .line 115
    .line 116
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-ne v1, v14, :cond_3

    .line 121
    .line 122
    const/16 v1, 0xe

    .line 123
    .line 124
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eq v1, v15, :cond_2

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_2
    const/4 v2, 0x0

    .line 132
    goto :goto_2

    .line 133
    :cond_3
    :goto_1
    move v2, v3

    .line 134
    :goto_2
    return v2
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

.method public Q(Lnet/time4j/tz/o;)Lnet/time4j/tz/l;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Lnet/time4j/tz/h;->E()Lnet/time4j/tz/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne v0, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lnet/time4j/tz/l;->n:Lnet/time4j/tz/o;

    .line 13
    .line 14
    if-ne p1, v0, :cond_1

    .line 15
    .line 16
    new-instance p1, Lnet/time4j/tz/h;

    .line 17
    .line 18
    iget-object v0, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 19
    .line 20
    iget-object v1, p0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {p1, v0, v1, v2}, Lnet/time4j/tz/h;-><init>(Lnet/time4j/tz/k;Ljava/util/TimeZone;Z)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    sget-object v0, Lnet/time4j/tz/l;->o:Lnet/time4j/tz/o;

    .line 28
    .line 29
    if-ne p1, v0, :cond_2

    .line 30
    .line 31
    new-instance p1, Lnet/time4j/tz/h;

    .line 32
    .line 33
    iget-object v0, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 34
    .line 35
    iget-object v1, p0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {p1, v0, v1, v2}, Lnet/time4j/tz/h;-><init>(Lnet/time4j/tz/k;Ljava/util/TimeZone;Z)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_3
    :goto_0
    return-object p0
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

.method T()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    .line 11
    .line 12
    :goto_0
    invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "GMT"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
    .line 23
    .line 24
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lnet/time4j/tz/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    check-cast p1, Lnet/time4j/tz/h;

    .line 7
    .line 8
    iget-object v0, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object p1, p1, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    move v1, v2

    .line 18
    :cond_0
    return v1

    .line 19
    :cond_1
    iget-object v0, p0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    .line 20
    .line 21
    iget-object v3, p1, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_5

    .line 28
    .line 29
    iget-boolean v0, p0, Lnet/time4j/tz/h;->strict:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/time4j/tz/h;->strict:Z

    .line 32
    .line 33
    if-eq v0, v3, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    iget-object v0, p0, Lnet/time4j/tz/h;->F:Lnet/time4j/tz/p;

    .line 37
    .line 38
    if-nez v0, :cond_4

    .line 39
    .line 40
    iget-object p1, p1, Lnet/time4j/tz/h;->F:Lnet/time4j/tz/p;

    .line 41
    .line 42
    if-nez p1, :cond_3

    .line 43
    .line 44
    move v1, v2

    .line 45
    :cond_3
    return v1

    .line 46
    :cond_4
    iget-object p1, p1, Lnet/time4j/tz/h;->F:Lnet/time4j/tz/p;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lnet/time4j/tz/p;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    return p1

    .line 53
    :cond_5
    :goto_0
    return v1
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

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    .line 11
    .line 12
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const/16 v2, 0x100

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x5b

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-class v2, Lnet/time4j/tz/h;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 v2, 0x3a

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/16 v0, 0x5d

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
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

.method public w(Lnet/time4j/tz/d;Ljava/util/Locale;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lnet/time4j/tz/h;->tz:Ljava/util/TimeZone;

    .line 11
    .line 12
    :goto_0
    invoke-virtual {p1}, Lnet/time4j/tz/d;->b()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p1}, Lnet/time4j/tz/d;->a()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    xor-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    invoke-virtual {v0, v1, p1, p2}, Ljava/util/TimeZone;->getDisplayName(ZILjava/util/Locale;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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

.method public y()Lnet/time4j/tz/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/h;->F:Lnet/time4j/tz/p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lnet/time4j/tz/p;->m()Lnet/time4j/tz/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    return-object v0
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

.method public z()Lnet/time4j/tz/k;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/h;->id:Lnet/time4j/tz/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lnet/time4j/tz/e;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Lnet/time4j/tz/e;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
