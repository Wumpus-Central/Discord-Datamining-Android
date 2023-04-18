.class Lnet/time4j/calendar/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D::",
        "Lfj/g;",
        ">",
        "Ljava/lang/Object;",
        "Lfj/z<",
        "TD;",
        "Lnet/time4j/x0;",
        ">;"
    }
.end annotation


# instance fields
.field private final k:Lnet/time4j/z0;

.field private final l:Lfj/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/t<",
            "TD;",
            "Lfj/k<",
            "TD;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lnet/time4j/z0;Lfj/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/z0;",
            "Lfj/t<",
            "TD;",
            "Lfj/k<",
            "TD;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/time4j/calendar/s;->k:Lnet/time4j/z0;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/time4j/calendar/s;->l:Lfj/t;

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

.method private static h(J)Lnet/time4j/x0;
    .locals 2

    const-wide/16 v0, 0x5

    add-long/2addr p0, v0

    const/4 v0, 0x7

    invoke-static {p0, p1, v0}, Lnet/time4j/base/c;->d(JI)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/g;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/s;->b(Lfj/g;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public b(Lfj/g;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/g;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/s;->d(Lfj/g;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lfj/g;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public e(Lfj/g;)Lnet/time4j/x0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lnet/time4j/x0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/calendar/s;->l:Lfj/t;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lfj/t;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lfj/k;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lnet/time4j/calendar/s;->g(Lfj/g;)Lnet/time4j/x0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lnet/time4j/calendar/s;->k:Lnet/time4j/z0;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-interface {p1}, Lfj/g;->b()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const-wide/16 v4, 0x7

    .line 24
    .line 25
    add-long/2addr v2, v4

    .line 26
    int-to-long v4, v1

    .line 27
    sub-long/2addr v2, v4

    .line 28
    invoke-interface {v0}, Lfj/k;->c()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    cmp-long p1, v2, v4

    .line 33
    .line 34
    if-lez p1, :cond_0

    .line 35
    .line 36
    invoke-interface {v0}, Lfj/k;->c()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {v0, v1}, Lnet/time4j/calendar/s;->h(J)Lnet/time4j/x0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_0
    iget-object p1, p0, Lnet/time4j/calendar/s;->k:Lnet/time4j/z0;

    .line 46
    .line 47
    invoke-virtual {p1}, Lnet/time4j/z0;->f()Lnet/time4j/x0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const/4 v0, 0x6

    .line 52
    invoke-virtual {p1, v0}, Lnet/time4j/x0;->e(I)Lnet/time4j/x0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
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

.method public f(Lfj/g;)Lnet/time4j/x0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lnet/time4j/x0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/calendar/s;->l:Lfj/t;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lfj/t;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lfj/k;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lnet/time4j/calendar/s;->g(Lfj/g;)Lnet/time4j/x0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lnet/time4j/calendar/s;->k:Lnet/time4j/z0;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-interface {p1}, Lfj/g;->b()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const-wide/16 v4, 0x1

    .line 24
    .line 25
    add-long/2addr v2, v4

    .line 26
    int-to-long v4, v1

    .line 27
    sub-long/2addr v2, v4

    .line 28
    invoke-interface {v0}, Lfj/k;->d()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    cmp-long p1, v2, v4

    .line 33
    .line 34
    if-gez p1, :cond_0

    .line 35
    .line 36
    invoke-interface {v0}, Lfj/k;->d()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {v0, v1}, Lnet/time4j/calendar/s;->h(J)Lnet/time4j/x0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_0
    iget-object p1, p0, Lnet/time4j/calendar/s;->k:Lnet/time4j/z0;

    .line 46
    .line 47
    invoke-virtual {p1}, Lnet/time4j/z0;->f()Lnet/time4j/x0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
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

.method public g(Lfj/g;)Lnet/time4j/x0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lnet/time4j/x0;"
        }
    .end annotation

    invoke-interface {p1}, Lfj/g;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Lnet/time4j/calendar/s;->h(J)Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method

.method public i(Lfj/g;Lnet/time4j/x0;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;",
            "Lnet/time4j/x0;",
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
    invoke-virtual {p0, p1}, Lnet/time4j/calendar/s;->g(Lfj/g;)Lnet/time4j/x0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lnet/time4j/calendar/s;->k:Lnet/time4j/z0;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, Lnet/time4j/calendar/s;->k:Lnet/time4j/z0;

    .line 16
    .line 17
    invoke-virtual {p2, v2}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-interface {p1}, Lfj/g;->b()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    int-to-long v4, p2

    .line 26
    add-long/2addr v2, v4

    .line 27
    int-to-long v4, v1

    .line 28
    sub-long/2addr v2, v4

    .line 29
    iget-object p2, p0, Lnet/time4j/calendar/s;->l:Lfj/t;

    .line 30
    .line 31
    invoke-interface {p2, p1}, Lfj/t;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lfj/k;

    .line 36
    .line 37
    invoke-interface {p1}, Lfj/k;->d()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    cmp-long p2, v2, v4

    .line 42
    .line 43
    if-ltz p2, :cond_1

    .line 44
    .line 45
    invoke-interface {p1}, Lfj/k;->c()J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    cmp-long p1, v2, p1

    .line 50
    .line 51
    if-gtz p1, :cond_1

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    :cond_1
    return v0
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
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/g;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/s;->e(Lfj/g;)Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/g;

    check-cast p2, Lnet/time4j/x0;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/s;->i(Lfj/g;Lnet/time4j/x0;)Z

    move-result p1

    return p1
.end method

.method public n(Lfj/g;Lnet/time4j/x0;Z)Lfj/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;",
            "Lnet/time4j/x0;",
            "Z)TD;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/time4j/calendar/s;->g(Lfj/g;)Lnet/time4j/x0;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    iget-object v0, p0, Lnet/time4j/calendar/s;->k:Lnet/time4j/z0;

    .line 8
    .line 9
    invoke-virtual {p3, v0}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    iget-object v0, p0, Lnet/time4j/calendar/s;->k:Lnet/time4j/z0;

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-interface {p1}, Lfj/g;->b()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    int-to-long v2, p2

    .line 24
    add-long/2addr v0, v2

    .line 25
    int-to-long p2, p3

    .line 26
    sub-long/2addr v0, p2

    .line 27
    iget-object p2, p0, Lnet/time4j/calendar/s;->l:Lfj/t;

    .line 28
    .line 29
    invoke-interface {p2, p1}, Lfj/t;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lfj/k;

    .line 34
    .line 35
    invoke-interface {p1}, Lfj/k;->d()J

    .line 36
    .line 37
    .line 38
    move-result-wide p2

    .line 39
    cmp-long p2, v0, p2

    .line 40
    .line 41
    if-ltz p2, :cond_0

    .line 42
    .line 43
    invoke-interface {p1}, Lfj/k;->c()J

    .line 44
    .line 45
    .line 46
    move-result-wide p2

    .line 47
    cmp-long p2, v0, p2

    .line 48
    .line 49
    if-gtz p2, :cond_0

    .line 50
    .line 51
    invoke-interface {p1, v0, v1}, Lfj/k;->a(J)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Lfj/g;

    .line 56
    .line 57
    return-object p1

    .line 58
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    const-string p2, "New day out of supported range."

    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    const-string p2, "Missing weekday."

    .line 69
    .line 70
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
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

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/g;

    check-cast p2, Lnet/time4j/x0;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/s;->n(Lfj/g;Lnet/time4j/x0;Z)Lfj/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/g;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/s;->f(Lfj/g;)Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/g;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/s;->g(Lfj/g;)Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method
