.class Lnet/time4j/z0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lfj/q<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Lfj/z<",
        "TT;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private final k:Lnet/time4j/z0$d;


# direct methods
.method private constructor <init>(Lnet/time4j/z0$d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/time4j/z0$b;->k:Lnet/time4j/z0$d;

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/z0$d;Lnet/time4j/z0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/z0$b;-><init>(Lnet/time4j/z0$d;)V

    return-void
.end method

.method private b(Lfj/q;Z)Lfj/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/f0;->x:Lfj/p;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lnet/time4j/f0;

    .line 8
    .line 9
    iget-object v1, p0, Lnet/time4j/z0$b;->k:Lnet/time4j/z0$d;

    .line 10
    .line 11
    invoke-static {v1}, Lnet/time4j/z0$d;->y(Lnet/time4j/z0$d;)Lnet/time4j/z0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lnet/time4j/z0;->i()Lnet/time4j/c0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0, p1}, Lnet/time4j/z0$b;->r(Lfj/q;)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz p2, :cond_2

    .line 28
    .line 29
    iget-object p2, p0, Lnet/time4j/z0$b;->k:Lnet/time4j/z0$d;

    .line 30
    .line 31
    invoke-static {p2}, Lnet/time4j/z0$d;->A(Lnet/time4j/z0$d;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    const/16 p2, 0x34

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p2, 0x4

    .line 41
    :goto_0
    if-lt v2, p2, :cond_4

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Lfj/q;->c(Lfj/p;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v0, v1, p1}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lnet/time4j/f0;

    .line 52
    .line 53
    iget-object p2, p0, Lnet/time4j/z0$b;->k:Lnet/time4j/z0$d;

    .line 54
    .line 55
    invoke-static {p2}, Lnet/time4j/z0$d;->A(Lnet/time4j/z0$d;)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_1

    .line 60
    .line 61
    invoke-virtual {p1}, Lnet/time4j/f0;->F0()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-virtual {v0}, Lnet/time4j/f0;->F0()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-ge p1, p2, :cond_4

    .line 70
    .line 71
    sget-object p1, Lnet/time4j/f0;->G:Lnet/time4j/k0;

    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_1
    invoke-virtual {p1}, Lnet/time4j/f0;->p()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {v0}, Lnet/time4j/f0;->p()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-ge p1, p2, :cond_4

    .line 83
    .line 84
    sget-object p1, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_2
    const/4 p2, 0x1

    .line 88
    if-gt v2, p2, :cond_4

    .line 89
    .line 90
    invoke-virtual {p1, v1}, Lfj/q;->t(Lfj/p;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v0, v1, p1}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Lnet/time4j/f0;

    .line 99
    .line 100
    iget-object p2, p0, Lnet/time4j/z0$b;->k:Lnet/time4j/z0$d;

    .line 101
    .line 102
    invoke-static {p2}, Lnet/time4j/z0$d;->A(Lnet/time4j/z0$d;)Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-eqz p2, :cond_3

    .line 107
    .line 108
    invoke-virtual {p1}, Lnet/time4j/f0;->F0()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    invoke-virtual {v0}, Lnet/time4j/f0;->F0()I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-le p1, p2, :cond_4

    .line 117
    .line 118
    sget-object p1, Lnet/time4j/f0;->G:Lnet/time4j/k0;

    .line 119
    .line 120
    return-object p1

    .line 121
    :cond_3
    invoke-virtual {p1}, Lnet/time4j/f0;->p()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    invoke-virtual {v0}, Lnet/time4j/f0;->p()I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    if-le p1, p2, :cond_4

    .line 130
    .line 131
    sget-object p1, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 132
    .line 133
    return-object p1

    .line 134
    :cond_4
    return-object v1
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

.method private f(Lnet/time4j/f0;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/time4j/z0$b;->k:Lnet/time4j/z0$d;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/time4j/z0$d;->A(Lnet/time4j/z0$d;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lnet/time4j/f0;->i()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Lnet/time4j/base/b;->e(I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/16 p1, 0x16e

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 p1, 0x16d

    .line 23
    .line 24
    :goto_0
    return p1

    .line 25
    :cond_1
    invoke-virtual {p1}, Lnet/time4j/f0;->i()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p1}, Lnet/time4j/f0;->j()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {v0, p1}, Lnet/time4j/base/b;->d(II)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
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

.method private g(Lnet/time4j/f0;)I
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lnet/time4j/z0$b;->t(Lnet/time4j/f0;I)I

    move-result p1

    return p1
.end method

.method private i(Lnet/time4j/f0;)I
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, p1, v0}, Lnet/time4j/z0$b;->t(Lnet/time4j/f0;I)I

    move-result p1

    return p1
.end method

.method private s(Lnet/time4j/f0;)I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lnet/time4j/z0$b;->t(Lnet/time4j/f0;I)I

    move-result p1

    return p1
.end method

.method private t(Lnet/time4j/f0;I)I
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/time4j/z0$b;->k:Lnet/time4j/z0$d;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/time4j/z0$d;->A(Lnet/time4j/z0$d;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lnet/time4j/f0;->F0()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Lnet/time4j/f0;->p()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    :goto_0
    invoke-virtual {p1}, Lnet/time4j/f0;->G0()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    int-to-long v3, v0

    .line 23
    sub-long/2addr v1, v3

    .line 24
    const-wide/16 v3, 0x1

    .line 25
    .line 26
    add-long/2addr v1, v3

    .line 27
    invoke-static {v1, v2}, Lnet/time4j/z0;->c(J)Lnet/time4j/x0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Lnet/time4j/z0$b;->k:Lnet/time4j/z0$d;

    .line 32
    .line 33
    invoke-static {v2}, Lnet/time4j/z0$d;->y(Lnet/time4j/z0$d;)Lnet/time4j/z0;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-object v2, p0, Lnet/time4j/z0$b;->k:Lnet/time4j/z0$d;

    .line 42
    .line 43
    invoke-static {v2}, Lnet/time4j/z0$d;->y(Lnet/time4j/z0$d;)Lnet/time4j/z0;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Lnet/time4j/z0;->g()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    rsub-int/lit8 v2, v2, 0x8

    .line 52
    .line 53
    if-gt v1, v2, :cond_1

    .line 54
    .line 55
    rsub-int/lit8 v1, v1, 0x2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    rsub-int/lit8 v1, v1, 0x9

    .line 59
    .line 60
    :goto_1
    const/4 v2, -0x1

    .line 61
    const/4 v3, 0x1

    .line 62
    if-eq p2, v2, :cond_3

    .line 63
    .line 64
    if-eqz p2, :cond_4

    .line 65
    .line 66
    if-ne p2, v3, :cond_2

    .line 67
    .line 68
    invoke-direct {p0, p1}, Lnet/time4j/z0$b;->f(Lnet/time4j/f0;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 74
    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v1, "Unexpected: "

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_3
    move v0, v3

    .line 97
    :cond_4
    :goto_2
    sub-int/2addr v0, v1

    .line 98
    const/4 p1, 0x7

    .line 99
    invoke-static {v0, p1}, Lnet/time4j/base/c;->a(II)I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    add-int/2addr p1, v3

    .line 104
    return p1
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

.method private v(Lnet/time4j/f0;I)Lnet/time4j/f0;
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/z0$b;->s(Lnet/time4j/f0;)I

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
    sub-int/2addr p2, v0

    .line 9
    mul-int/lit8 p2, p2, 0x7

    .line 10
    .line 11
    invoke-virtual {p1}, Lnet/time4j/f0;->G0()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    int-to-long v2, p2

    .line 16
    add-long/2addr v0, v2

    .line 17
    invoke-virtual {p1, v0, v1}, Lnet/time4j/f0;->W0(J)Lnet/time4j/f0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
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


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/z0$b;->d(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/z0$b;->e(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lfj/q;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lnet/time4j/z0$b;->b(Lfj/q;Z)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public e(Lfj/q;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lnet/time4j/z0$b;->b(Lfj/q;Z)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public h(Lfj/q;)Ljava/lang/Integer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/f0;->x:Lfj/p;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lnet/time4j/f0;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lnet/time4j/z0$b;->g(Lnet/time4j/f0;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/z0$b;->h(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/z0$b;->u(Lfj/q;Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public n(Lfj/q;)Ljava/lang/Integer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/f0;->x:Lfj/p;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lnet/time4j/f0;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lnet/time4j/z0$b;->i(Lnet/time4j/f0;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/z0$b;->w(Lfj/q;Ljava/lang/Integer;Z)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/z0$b;->n(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/z0$b;->r(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public r(Lfj/q;)Ljava/lang/Integer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/f0;->x:Lfj/p;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lnet/time4j/f0;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lnet/time4j/z0$b;->s(Lnet/time4j/f0;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public u(Lfj/q;Ljava/lang/Integer;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
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
    sget-object v1, Lnet/time4j/f0;->x:Lfj/p;

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lnet/time4j/f0;

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lnet/time4j/z0$b;->i(Lnet/time4j/f0;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lt p2, v1, :cond_1

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lnet/time4j/z0$b;->g(Lnet/time4j/f0;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-gt p2, p1, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    :cond_1
    return v0
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
            "(TT;",
            "Ljava/lang/Integer;",
            "Z)TT;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/f0;->x:Lfj/p;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lnet/time4j/f0;

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Lnet/time4j/z0$b;->u(Lfj/q;Ljava/lang/Integer;)Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-eqz p3, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-direct {p0, v1, p2}, Lnet/time4j/z0$b;->v(Lnet/time4j/f0;I)Lnet/time4j/f0;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1, v0, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_1
    new-instance p3, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v1, "Invalid value: "

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p2, " (context="

    .line 48
    .line 49
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p1, ")"

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p3
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
