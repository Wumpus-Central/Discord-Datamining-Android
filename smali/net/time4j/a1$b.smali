.class Lnet/time4j/a1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/a1;
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/a1$a;)V
    .locals 0

    invoke-direct {p0}, Lnet/time4j/a1$b;-><init>()V

    return-void
.end method

.method private b()Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lnet/time4j/z0;->w:Lnet/time4j/z0;

    invoke-virtual {v0}, Lnet/time4j/z0;->n()Lnet/time4j/c;

    move-result-object v0

    return-object v0
.end method

.method private static n(Lnet/time4j/f0;I)Lnet/time4j/f0;
    .locals 9

    .line 1
    invoke-static {p1}, Lnet/time4j/a1;->C(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Lnet/time4j/a1;->y(Lnet/time4j/f0;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Lnet/time4j/f0;->E0()Lnet/time4j/x0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Lnet/time4j/z0;->w:Lnet/time4j/z0;

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sget-object v3, Lfj/a0;->l:Lfj/a0;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-static {p1, v4, v4}, Lnet/time4j/base/b;->j(III)J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    sget-object v7, Lfj/a0;->m:Lfj/a0;

    .line 27
    .line 28
    invoke-virtual {v3, v5, v6, v7}, Lfj/a0;->l(JLfj/a0;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    add-int/lit8 v3, v0, -0x1

    .line 33
    .line 34
    int-to-long v7, v3

    .line 35
    add-long/2addr v5, v7

    .line 36
    add-int/lit8 v3, v1, -0x1

    .line 37
    .line 38
    mul-int/lit8 v3, v3, 0x7

    .line 39
    .line 40
    int-to-long v7, v3

    .line 41
    add-long/2addr v5, v7

    .line 42
    sub-int/2addr v2, v4

    .line 43
    int-to-long v2, v2

    .line 44
    add-long/2addr v5, v2

    .line 45
    const/16 v2, 0x35

    .line 46
    .line 47
    if-ne v1, v2, :cond_1

    .line 48
    .line 49
    add-int/lit8 v1, p1, 0x1

    .line 50
    .line 51
    invoke-static {v1}, Lnet/time4j/a1;->C(I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-static {p1}, Lnet/time4j/base/b;->e(I)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    const/16 p1, 0x16e

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/16 p1, 0x16d

    .line 65
    .line 66
    :goto_0
    add-int/2addr v1, p1

    .line 67
    sub-int/2addr v1, v0

    .line 68
    div-int/lit8 v1, v1, 0x7

    .line 69
    .line 70
    if-ge v1, v2, :cond_1

    .line 71
    .line 72
    const-wide/16 v0, 0x7

    .line 73
    .line 74
    sub-long/2addr v5, v0

    .line 75
    :cond_1
    const-wide/16 v0, 0x2da

    .line 76
    .line 77
    sub-long/2addr v5, v0

    .line 78
    invoke-virtual {p0, v5, v6}, Lnet/time4j/f0;->W0(J)Lnet/time4j/f0;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
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


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/a1$b;->d(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/a1$b;->e(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lfj/q;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    invoke-direct {p0}, Lnet/time4j/a1$b;->b()Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public e(Lfj/q;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    invoke-direct {p0}, Lnet/time4j/a1$b;->b()Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public f(Lfj/q;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    sget-object p1, Lnet/time4j/a1;->q:Lnet/time4j/a1;

    invoke-virtual {p1}, Lnet/time4j/a1;->E()Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public g(Lfj/q;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    sget-object p1, Lnet/time4j/a1;->q:Lnet/time4j/a1;

    invoke-virtual {p1}, Lnet/time4j/a1;->F()Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public h(Lfj/q;)Ljava/lang/Integer;
    .locals 6
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
    invoke-virtual {p1}, Lnet/time4j/f0;->i()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Lnet/time4j/f0;->F0()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {p1, v2}, Lnet/time4j/a1;->A(Lnet/time4j/f0;I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-gt v3, v1, :cond_0

    .line 23
    .line 24
    sub-int v3, v1, v3

    .line 25
    .line 26
    div-int/lit8 v3, v3, 0x7

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    add-int/2addr v3, v4

    .line 30
    const/16 v5, 0x35

    .line 31
    .line 32
    if-lt v3, v5, :cond_1

    .line 33
    .line 34
    invoke-static {p1, v4}, Lnet/time4j/a1;->A(Lnet/time4j/f0;I)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-static {p1, v2}, Lnet/time4j/a1;->B(Lnet/time4j/f0;I)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    add-int/2addr v3, p1

    .line 43
    if-gt v3, v1, :cond_1

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 49
    .line 50
    :cond_1
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

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
.end method

.method public i(Lfj/q;Ljava/lang/Integer;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Integer;",
            ")Z"
        }
    .end annotation

    const/4 p1, 0x0

    if-nez p2, :cond_0

    return p1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const v0, -0x3b9ac9ff

    if-lt p2, v0, :cond_1

    const v0, 0x3b9ac9ff

    if-gt p2, v0, :cond_1

    const/4 p1, 0x1

    :cond_1
    return p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/a1$b;->f(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/a1$b;->i(Lfj/q;Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/a1$b;->r(Lfj/q;Ljava/lang/Integer;Z)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/a1$b;->g(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/a1$b;->h(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public r(Lfj/q;Ljava/lang/Integer;Z)Lfj/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Integer;",
            "Z)TT;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    sget-object p3, Lnet/time4j/f0;->x:Lfj/p;

    .line 4
    .line 5
    invoke-virtual {p1, p3}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lnet/time4j/f0;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-static {v0, p2}, Lnet/time4j/a1$b;->n(Lnet/time4j/f0;I)Lnet/time4j/f0;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1, p3, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string p2, "Missing element value."

    .line 27
    .line 28
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1
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
.end method
