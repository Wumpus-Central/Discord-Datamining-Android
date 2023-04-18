.class public final Lnet/time4j/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/o;
.implements Lmj/g;


# instance fields
.field private final k:Lnet/time4j/a0;

.field private final l:Lnet/time4j/tz/l;

.field private final transient m:Lnet/time4j/h0;


# direct methods
.method private constructor <init>(Lnet/time4j/a0;Lnet/time4j/tz/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lnet/time4j/b1;->l:Lnet/time4j/tz/l;

    .line 5
    .line 6
    invoke-virtual {p2, p1}, Lnet/time4j/tz/l;->B(Lnet/time4j/base/f;)Lnet/time4j/tz/p;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p1}, Lnet/time4j/a0;->m0()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p2}, Lnet/time4j/tz/p;->k()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p2}, Lnet/time4j/tz/p;->j()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    rem-int/lit8 v0, v0, 0x3c

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v1, "Leap second can only be represented  with timezone-offset in full minutes: "

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_1
    :goto_0
    iput-object p1, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    .line 55
    .line 56
    invoke-static {p1, p2}, Lnet/time4j/h0;->X(Lnet/time4j/base/f;Lnet/time4j/tz/p;)Lnet/time4j/h0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 61
    .line 62
    return-void
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
.end method

.method static e(Lnet/time4j/a0;Lnet/time4j/tz/l;)Lnet/time4j/b1;
    .locals 1

    new-instance v0, Lnet/time4j/b1;

    invoke-direct {v0, p0, p1}, Lnet/time4j/b1;-><init>(Lnet/time4j/a0;Lnet/time4j/tz/l;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    invoke-virtual {v0}, Lnet/time4j/a0;->a()I

    move-result v0

    return v0
.end method

.method public b()Lnet/time4j/tz/p;
    .locals 2

    iget-object v0, p0, Lnet/time4j/b1;->l:Lnet/time4j/tz/l;

    iget-object v1, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    invoke-virtual {v0, v1}, Lnet/time4j/tz/l;->B(Lnet/time4j/base/f;)Lnet/time4j/tz/p;

    move-result-object v0

    return-object v0
.end method

.method public c(Lfj/p;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;)TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lfj/q;->o(Lfj/p;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lfj/q;->c(Lfj/p;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lfj/q;->c(Lfj/p;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    sget-object v1, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 23
    .line 24
    if-ne p1, v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 27
    .line 28
    invoke-virtual {v1}, Lnet/time4j/h0;->i()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/16 v2, 0x7b4

    .line 33
    .line 34
    if-lt v1, v2, :cond_1

    .line 35
    .line 36
    iget-object v1, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 37
    .line 38
    invoke-virtual {v1, p1, v0}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lnet/time4j/h0;

    .line 43
    .line 44
    iget-object v2, p0, Lnet/time4j/b1;->l:Lnet/time4j/tz/l;

    .line 45
    .line 46
    invoke-virtual {v2, v1, v1}, Lnet/time4j/tz/l;->K(Lnet/time4j/base/a;Lnet/time4j/base/g;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    iget-object v2, p0, Lnet/time4j/b1;->l:Lnet/time4j/tz/l;

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Lnet/time4j/h0;->b0(Lnet/time4j/tz/l;)Lnet/time4j/a0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-wide/16 v2, 0x1

    .line 59
    .line 60
    sget-object v4, Lnet/time4j/n0;->k:Lnet/time4j/n0;

    .line 61
    .line 62
    invoke-virtual {v1, v2, v3, v4}, Lnet/time4j/a0;->q0(JLnet/time4j/n0;)Lnet/time4j/a0;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Lnet/time4j/a0;->m0()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-interface {p1}, Lfj/p;->getType()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const/16 v0, 0x3c

    .line 77
    .line 78
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1

    .line 87
    :cond_1
    return-object v0
    .line 88
    .line 89
    .line 90
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    invoke-virtual {v0}, Lnet/time4j/a0;->m0()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnet/time4j/b1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lnet/time4j/b1;

    .line 11
    .line 12
    iget-object v1, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    .line 13
    .line 14
    iget-object v3, p1, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Lnet/time4j/a0;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lnet/time4j/b1;->l:Lnet/time4j/tz/l;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/time4j/b1;->l:Lnet/time4j/tz/l;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v0, v2

    .line 34
    :goto_0
    return v0

    .line 35
    :cond_2
    return v2
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

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    invoke-virtual {v0}, Lnet/time4j/a0;->hashCode()I

    move-result v0

    iget-object v1, p0, Lnet/time4j/b1;->l:Lnet/time4j/tz/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public k(Lfj/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;)TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/time4j/a0;->m0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Lfj/p;->getType()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/16 v0, 0x3c

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    iget-object v0, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lfj/q;->o(Lfj/p;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_1
    iget-object v0, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1
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

.method public l(Lmj/f;)J
    .locals 2

    iget-object v0, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    invoke-virtual {v0, p1}, Lnet/time4j/a0;->l(Lmj/f;)J

    move-result-wide v0

    return-wide v0
.end method

.method public m(Lfj/p;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/time4j/a0;->m0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    const/16 p1, 0x3c

    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    iget-object v0, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lfj/q;->m(Lfj/p;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/high16 v1, -0x80000000

    .line 23
    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lfj/q;->m(Lfj/p;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    :cond_1
    return v0
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

.method public n(Lmj/f;)I
    .locals 1

    iget-object v0, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    invoke-virtual {v0, p1}, Lnet/time4j/a0;->n(Lmj/f;)I

    move-result p1

    return p1
.end method

.method public o(Lfj/p;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lfj/q;->o(Lfj/p;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lfj/q;->o(Lfj/p;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    :goto_1
    return p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public r()Lnet/time4j/tz/k;
    .locals 1

    iget-object v0, p0, Lnet/time4j/b1;->l:Lnet/time4j/tz/l;

    invoke-virtual {v0}, Lnet/time4j/tz/l;->z()Lnet/time4j/tz/k;

    move-result-object v0

    return-object v0
.end method

.method public t(Lfj/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;)TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lfj/q;->o(Lfj/p;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lfj/q;->t(Lfj/p;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object v0, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lfj/q;->t(Lfj/p;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 9
    .line 10
    invoke-virtual {v1}, Lnet/time4j/h0;->Y()Lnet/time4j/f0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x54

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 23
    .line 24
    invoke-virtual {v1}, Lnet/time4j/h0;->q()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/16 v2, 0x30

    .line 29
    .line 30
    const/16 v3, 0xa

    .line 31
    .line 32
    if-ge v1, v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const/16 v1, 0x3a

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v4, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 46
    .line 47
    invoke-virtual {v4}, Lnet/time4j/h0;->e()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-ge v4, v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lnet/time4j/b1;->d()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    const-string v1, "60"

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    iget-object v1, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 75
    .line 76
    invoke-virtual {v1}, Lnet/time4j/h0;->s()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-ge v1, v3, :cond_3

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    :goto_0
    iget-object v1, p0, Lnet/time4j/b1;->m:Lnet/time4j/h0;

    .line 89
    .line 90
    invoke-virtual {v1}, Lnet/time4j/h0;->a()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    invoke-static {v0, v1}, Lnet/time4j/g0;->P0(Ljava/lang/StringBuilder;I)V

    .line 97
    .line 98
    .line 99
    :cond_4
    invoke-virtual {p0}, Lnet/time4j/b1;->b()Lnet/time4j/tz/p;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lnet/time4j/b1;->r()Lnet/time4j/tz/k;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    instance-of v2, v1, Lnet/time4j/tz/p;

    .line 111
    .line 112
    if-nez v2, :cond_5

    .line 113
    .line 114
    const/16 v2, 0x5b

    .line 115
    .line 116
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-interface {v1}, Lnet/time4j/tz/k;->a()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const/16 v1, 0x5d

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    return-object v0
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
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
.end method

.method public u()J
    .locals 2

    iget-object v0, p0, Lnet/time4j/b1;->k:Lnet/time4j/a0;

    invoke-virtual {v0}, Lnet/time4j/a0;->u()J

    move-result-wide v0

    return-wide v0
.end method
