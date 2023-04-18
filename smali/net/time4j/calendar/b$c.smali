.class Lnet/time4j/calendar/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Lfj/q<",
        "TD;>;>",
        "Ljava/lang/Object;",
        "Lfj/z<",
        "TD;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private final k:Lnet/time4j/calendar/b$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/calendar/b$d<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lnet/time4j/calendar/b$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/calendar/b$d<",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/time4j/calendar/b$c;->k:Lnet/time4j/calendar/b$d;

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/calendar/b$d;Lnet/time4j/calendar/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$c;-><init>(Lnet/time4j/calendar/b$d;)V

    return-void
.end method

.method private b(Lfj/q;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/calendar/b$c;->k:Lnet/time4j/calendar/b$d;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lfj/q;->m(Lfj/p;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {p0, p1, v1}, Lnet/time4j/calendar/b$c;->g(Lfj/q;I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-gt v2, v0, :cond_1

    .line 18
    .line 19
    invoke-direct {p0, p1, v3}, Lnet/time4j/calendar/b$c;->g(Lfj/q;I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-direct {p0, p1, v1}, Lnet/time4j/calendar/b$c;->h(Lfj/q;I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    add-int/2addr v4, p1

    .line 28
    if-gt v4, v0, :cond_0

    .line 29
    .line 30
    return v3

    .line 31
    :cond_0
    sub-int/2addr v0, v2

    .line 32
    div-int/lit8 v0, v0, 0x7

    .line 33
    .line 34
    :goto_0
    add-int/2addr v0, v3

    .line 35
    return v0

    .line 36
    :cond_1
    const/4 v1, -0x1

    .line 37
    invoke-direct {p0, p1, v1}, Lnet/time4j/calendar/b$c;->g(Lfj/q;I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-direct {p0, p1, v1}, Lnet/time4j/calendar/b$c;->h(Lfj/q;I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    add-int/2addr v0, p1

    .line 46
    sub-int/2addr v0, v2

    .line 47
    div-int/lit8 v0, v0, 0x7

    .line 48
    .line 49
    goto :goto_0
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

.method private d(Ljava/lang/Object;)Lfj/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/Class;

    .line 2
    .line 3
    new-instance v0, Lnet/time4j/calendar/b$f;

    .line 4
    .line 5
    iget-object v1, p0, Lnet/time4j/calendar/b$c;->k:Lnet/time4j/calendar/b$d;

    .line 6
    .line 7
    invoke-static {v1}, Lnet/time4j/calendar/b$d;->B(Lnet/time4j/calendar/b$d;)Lnet/time4j/z0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p1, v1}, Lnet/time4j/calendar/b$f;-><init>(Ljava/lang/Class;Lnet/time4j/z0;)V

    .line 12
    .line 13
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
    .line 25
    .line 26
    .line 27
.end method

.method private g(Lfj/q;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;I)I"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/time4j/calendar/b$c;->t(Lfj/q;I)Lnet/time4j/x0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lnet/time4j/calendar/b$c;->k:Lnet/time4j/calendar/b$d;

    .line 6
    .line 7
    invoke-static {p2}, Lnet/time4j/calendar/b$d;->B(Lnet/time4j/calendar/b$d;)Lnet/time4j/z0;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p2}, Lnet/time4j/z0;->g()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    rsub-int/lit8 p2, p2, 0x8

    .line 20
    .line 21
    if-gt p1, p2, :cond_0

    .line 22
    .line 23
    rsub-int/lit8 p1, p1, 0x2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    rsub-int/lit8 p1, p1, 0x9

    .line 27
    .line 28
    :goto_0
    return p1
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

.method private h(Lfj/q;I)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;I)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/calendar/b$c;->k:Lnet/time4j/calendar/b$d;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lfj/q;->m(Lfj/p;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq p2, v1, :cond_2

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne p2, v1, :cond_0

    .line 18
    .line 19
    iget-object p2, p0, Lnet/time4j/calendar/b$c;->k:Lnet/time4j/calendar/b$d;

    .line 20
    .line 21
    invoke-static {p2}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-static {p2, p1}, Lnet/time4j/calendar/b;->b(Lfj/p;Lfj/q;)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iget-object v1, p0, Lnet/time4j/calendar/b$c;->k:Lnet/time4j/calendar/b$d;

    .line 30
    .line 31
    invoke-static {v1}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v2, Lfj/a0;->k:Lfj/a0;

    .line 36
    .line 37
    invoke-virtual {p1, v2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Ljava/lang/Long;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    int-to-long v5, p2

    .line 48
    add-long/2addr v3, v5

    .line 49
    const-wide/16 v5, 0x1

    .line 50
    .line 51
    add-long/2addr v3, v5

    .line 52
    int-to-long v5, v0

    .line 53
    sub-long/2addr v3, v5

    .line 54
    invoke-virtual {p1, v2, v3, v4}, Lfj/q;->D(Lfj/p;J)Lfj/q;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {v1, p1}, Lnet/time4j/calendar/b;->b(Lfj/p;Lfj/q;)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    return p1

    .line 63
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 64
    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v1, "Unexpected: "

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_1
    iget-object p2, p0, Lnet/time4j/calendar/b$c;->k:Lnet/time4j/calendar/b$d;

    .line 87
    .line 88
    invoke-static {p2}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-static {p2, p1}, Lnet/time4j/calendar/b;->b(Lfj/p;Lfj/q;)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    return p1

    .line 97
    :cond_2
    iget-object p2, p0, Lnet/time4j/calendar/b$c;->k:Lnet/time4j/calendar/b$d;

    .line 98
    .line 99
    invoke-static {p2}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    sget-object v1, Lfj/a0;->k:Lfj/a0;

    .line 104
    .line 105
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/lang/Long;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v2

    .line 115
    int-to-long v4, v0

    .line 116
    sub-long/2addr v2, v4

    .line 117
    invoke-virtual {p1, v1, v2, v3}, Lfj/q;->D(Lfj/p;J)Lfj/q;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {p2, p1}, Lnet/time4j/calendar/b;->b(Lfj/p;Lfj/q;)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    return p1
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

.method private i(Lfj/q;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/calendar/b$c;->k:Lnet/time4j/calendar/b$d;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lfj/q;->m(Lfj/p;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {p0, p1, v1}, Lnet/time4j/calendar/b$c;->g(Lfj/q;I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-gt v2, v0, :cond_1

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-direct {p0, p1, v3}, Lnet/time4j/calendar/b$c;->g(Lfj/q;I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-direct {p0, p1, v1}, Lnet/time4j/calendar/b$c;->h(Lfj/q;I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/2addr v4, v1

    .line 28
    if-gt v4, v0, :cond_0

    .line 29
    .line 30
    :try_start_0
    invoke-direct {p0, p1, v3}, Lnet/time4j/calendar/b$c;->g(Lfj/q;I)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sget-object v1, Lfj/a0;->k:Lfj/a0;

    .line 35
    .line 36
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Ljava/lang/Long;

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    const-wide/16 v7, 0x7

    .line 47
    .line 48
    add-long/2addr v5, v7

    .line 49
    invoke-virtual {p1, v1, v5, v6}, Lfj/q;->D(Lfj/p;J)Lfj/q;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {p0, v1, v3}, Lnet/time4j/calendar/b$c;->g(Lfj/q;I)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-direct {p0, p1, v3}, Lnet/time4j/calendar/b$c;->h(Lfj/q;I)I

    .line 58
    .line 59
    .line 60
    move-result p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    add-int v4, v1, p1

    .line 62
    .line 63
    move v2, v0

    .line 64
    goto :goto_0

    .line 65
    :catch_0
    add-int/lit8 v4, v4, 0x7

    .line 66
    .line 67
    :cond_0
    :goto_0
    sub-int/2addr v4, v2

    .line 68
    div-int/lit8 v4, v4, 0x7

    .line 69
    .line 70
    return v4

    .line 71
    :cond_1
    const/4 v0, -0x1

    .line 72
    invoke-direct {p0, p1, v0}, Lnet/time4j/calendar/b$c;->g(Lfj/q;I)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-direct {p0, p1, v0}, Lnet/time4j/calendar/b$c;->h(Lfj/q;I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    add-int/2addr v2, p1

    .line 81
    sub-int/2addr v2, v1

    .line 82
    div-int/lit8 v2, v2, 0x7

    .line 83
    .line 84
    return v2
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private t(Lfj/q;I)Lnet/time4j/x0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;I)",
            "Lnet/time4j/x0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/calendar/b$c;->k:Lnet/time4j/calendar/b$d;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lfj/q;->m(Lfj/p;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    const-wide/16 v2, 0x1

    .line 13
    .line 14
    if-eq p2, v1, :cond_2

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-ne p2, v1, :cond_0

    .line 20
    .line 21
    iget-object p2, p0, Lnet/time4j/calendar/b$c;->k:Lnet/time4j/calendar/b$d;

    .line 22
    .line 23
    invoke-static {p2}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-static {p2, p1}, Lnet/time4j/calendar/b;->b(Lfj/p;Lfj/q;)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    sget-object v1, Lfj/a0;->k:Lfj/a0;

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Ljava/lang/Long;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    int-to-long p1, p2

    .line 44
    add-long/2addr v4, p1

    .line 45
    add-long/2addr v4, v2

    .line 46
    int-to-long p1, v0

    .line 47
    sub-long/2addr v4, p1

    .line 48
    invoke-static {v4, v5}, Lnet/time4j/calendar/b;->a(J)Lnet/time4j/x0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 54
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v1, "Unexpected: "

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :cond_1
    sget-object p2, Lfj/a0;->k:Lfj/a0;

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Ljava/lang/Long;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 85
    .line 86
    .line 87
    move-result-wide p1

    .line 88
    int-to-long v0, v0

    .line 89
    sub-long/2addr p1, v0

    .line 90
    add-long/2addr p1, v2

    .line 91
    invoke-static {p1, p2}, Lnet/time4j/calendar/b;->a(J)Lnet/time4j/x0;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1

    .line 96
    :cond_2
    sget-object p2, Lfj/a0;->k:Lfj/a0;

    .line 97
    .line 98
    invoke-virtual {p1, p2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Ljava/lang/Long;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 105
    .line 106
    .line 107
    move-result-wide v4

    .line 108
    int-to-long v0, v0

    .line 109
    sub-long/2addr v4, v0

    .line 110
    invoke-virtual {p1, p2, v4, v5}, Lfj/q;->D(Lfj/p;J)Lfj/q;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object p2, p0, Lnet/time4j/calendar/b$c;->k:Lnet/time4j/calendar/b$d;

    .line 115
    .line 116
    invoke-static {p2}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-virtual {p1, p2}, Lfj/q;->m(Lfj/p;)I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    int-to-long p1, p1

    .line 125
    sub-long/2addr v4, p1

    .line 126
    add-long/2addr v4, v2

    .line 127
    invoke-static {v4, v5}, Lnet/time4j/calendar/b;->a(J)Lnet/time4j/x0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1
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

.method private v(Lfj/q;I)Lfj/q;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;I)TD;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$c;->b(Lfj/q;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    sget-object v1, Lfj/a0;->k:Lfj/a0;

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Ljava/lang/Long;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    sub-int/2addr p2, v0

    .line 21
    mul-int/lit8 p2, p2, 0x7

    .line 22
    .line 23
    int-to-long v4, p2

    .line 24
    add-long/2addr v2, v4

    .line 25
    invoke-virtual {p1, v1, v2, v3}, Lfj/q;->D(Lfj/p;J)Lfj/q;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
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


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$c;->e(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$c;->f(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public e(Lfj/q;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$c;->d(Ljava/lang/Object;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public f(Lfj/q;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$c;->d(Ljava/lang/Object;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$c;->n(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/b$c;->u(Lfj/q;Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public n(Lfj/q;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$c;->i(Lfj/q;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/b$c;->w(Lfj/q;Ljava/lang/Integer;Z)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$c;->r(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$c;->s(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public r(Lfj/q;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public s(Lfj/q;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$c;->b(Lfj/q;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public u(Lfj/q;Ljava/lang/Integer;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;",
            "Ljava/lang/Integer;",
            ")Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 v1, 0x1

    .line 10
    if-lt p2, v1, :cond_1

    .line 11
    .line 12
    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$c;->i(Lfj/q;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-gt p2, p1, :cond_1

    .line 17
    .line 18
    move v0, v1

    .line 19
    :cond_1
    return v0
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

.method public w(Lfj/q;Ljava/lang/Integer;Z)Lfj/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;",
            "Ljava/lang/Integer;",
            "Z)TD;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez p3, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/b$c;->u(Lfj/q;Ljava/lang/Integer;)Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    new-instance p3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "Invalid value: "

    .line 22
    .line 23
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, " (context="

    .line 30
    .line 31
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p1, ")"

    .line 38
    .line 39
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p2

    .line 50
    :cond_1
    :goto_0
    invoke-direct {p0, p1, v0}, Lnet/time4j/calendar/b$c;->v(Lfj/q;I)Lfj/q;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
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
