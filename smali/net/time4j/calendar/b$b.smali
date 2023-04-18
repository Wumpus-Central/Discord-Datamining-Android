.class Lnet/time4j/calendar/b$b;
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
    name = "b"
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
    iput-object p1, p0, Lnet/time4j/calendar/b$b;->k:Lnet/time4j/calendar/b$d;

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/calendar/b$d;Lnet/time4j/calendar/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$b;-><init>(Lnet/time4j/calendar/b$d;)V

    return-void
.end method

.method private b(Lfj/q;Z)Lfj/p;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;Z)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lnet/time4j/calendar/b$b;->k:Lnet/time4j/calendar/b$d;

    .line 6
    .line 7
    invoke-static {v1}, Lnet/time4j/calendar/b$d;->B(Lnet/time4j/calendar/b$d;)Lnet/time4j/z0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v0, v1}, Lnet/time4j/calendar/b$f;->X(Ljava/lang/Class;Lnet/time4j/z0;)Lnet/time4j/calendar/b$f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$b;->r(Lfj/q;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    sget-object v2, Lfj/a0;->k:Lfj/a0;

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/Long;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    iget-object v5, p0, Lnet/time4j/calendar/b$b;->k:Lnet/time4j/calendar/b$d;

    .line 32
    .line 33
    invoke-static {v5}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {p1, v5}, Lfj/q;->m(Lfj/p;)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lfj/q;->c(Lfj/p;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p1, v0, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p2, v2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Ljava/lang/Long;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    sub-long/2addr v1, v3

    .line 62
    iget-object p2, p0, Lnet/time4j/calendar/b$b;->k:Lnet/time4j/calendar/b$d;

    .line 63
    .line 64
    invoke-static {p2}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p1, p2}, Lfj/q;->c(Lfj/p;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    int-to-long p1, p1

    .line 79
    int-to-long v3, v5

    .line 80
    add-long/2addr v3, v1

    .line 81
    cmp-long p1, p1, v3

    .line 82
    .line 83
    if-gez p1, :cond_1

    .line 84
    .line 85
    iget-object p1, p0, Lnet/time4j/calendar/b$b;->k:Lnet/time4j/calendar/b$d;

    .line 86
    .line 87
    invoke-static {p1}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :cond_0
    const/4 p2, 0x1

    .line 93
    if-gt v1, p2, :cond_1

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Lfj/q;->t(Lfj/p;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p1, v0, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {p2, v2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    check-cast p2, Ljava/lang/Long;

    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v1

    .line 113
    sub-long/2addr v3, v1

    .line 114
    iget-object p2, p0, Lnet/time4j/calendar/b$b;->k:Lnet/time4j/calendar/b$d;

    .line 115
    .line 116
    invoke-static {p2}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-virtual {p1, p2}, Lfj/q;->t(Lfj/p;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    check-cast p1, Ljava/lang/Integer;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    int-to-long p1, p1

    .line 131
    int-to-long v1, v5

    .line 132
    sub-long/2addr v1, v3

    .line 133
    cmp-long p1, p1, v1

    .line 134
    .line 135
    if-lez p1, :cond_1

    .line 136
    .line 137
    iget-object p1, p0, Lnet/time4j/calendar/b$b;->k:Lnet/time4j/calendar/b$d;

    .line 138
    .line 139
    invoke-static {p1}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :cond_1
    return-object v0
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

.method private f(Lfj/q;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)I"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lnet/time4j/calendar/b$b;->s(Lfj/q;I)I

    move-result p1

    return p1
.end method

.method private h(Lfj/q;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)I"
        }
    .end annotation

    const/4 v0, -0x1

    invoke-direct {p0, p1, v0}, Lnet/time4j/calendar/b$b;->s(Lfj/q;I)I

    move-result p1

    return p1
.end method

.method private r(Lfj/q;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)I"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lnet/time4j/calendar/b$b;->s(Lfj/q;I)I

    move-result p1

    return p1
.end method

.method private s(Lfj/q;I)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;I)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/calendar/b$b;->k:Lnet/time4j/calendar/b$d;

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
    sget-object v1, Lfj/a0;->k:Lfj/a0;

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/Long;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    int-to-long v3, v0

    .line 24
    sub-long/2addr v1, v3

    .line 25
    const-wide/16 v3, 0x1

    .line 26
    .line 27
    add-long/2addr v1, v3

    .line 28
    invoke-static {v1, v2}, Lnet/time4j/calendar/b;->a(J)Lnet/time4j/x0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p0, Lnet/time4j/calendar/b$b;->k:Lnet/time4j/calendar/b$d;

    .line 33
    .line 34
    invoke-static {v2}, Lnet/time4j/calendar/b$d;->B(Lnet/time4j/calendar/b$d;)Lnet/time4j/z0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget-object v2, p0, Lnet/time4j/calendar/b$b;->k:Lnet/time4j/calendar/b$d;

    .line 43
    .line 44
    invoke-static {v2}, Lnet/time4j/calendar/b$d;->B(Lnet/time4j/calendar/b$d;)Lnet/time4j/z0;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Lnet/time4j/z0;->g()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    rsub-int/lit8 v2, v2, 0x8

    .line 53
    .line 54
    if-gt v1, v2, :cond_0

    .line 55
    .line 56
    rsub-int/lit8 v1, v1, 0x2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    rsub-int/lit8 v1, v1, 0x9

    .line 60
    .line 61
    :goto_0
    const/4 v2, -0x1

    .line 62
    const/4 v3, 0x1

    .line 63
    if-eq p2, v2, :cond_2

    .line 64
    .line 65
    if-eqz p2, :cond_3

    .line 66
    .line 67
    if-ne p2, v3, :cond_1

    .line 68
    .line 69
    iget-object p2, p0, Lnet/time4j/calendar/b$b;->k:Lnet/time4j/calendar/b$d;

    .line 70
    .line 71
    invoke-static {p2}, Lnet/time4j/calendar/b$d;->C(Lnet/time4j/calendar/b$d;)Lfj/p;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p1, p2}, Lfj/q;->c(Lfj/p;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 87
    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v1, "Unexpected: "

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :cond_2
    move v0, v3

    .line 110
    :cond_3
    :goto_1
    sub-int/2addr v0, v1

    .line 111
    const/4 p1, 0x7

    .line 112
    invoke-static {v0, p1}, Lnet/time4j/base/c;->a(II)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    add-int/2addr p1, v3

    .line 117
    return p1
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

.method private u(Lfj/q;I)Lfj/q;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;I)TD;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$b;->r(Lfj/q;)I

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
    sget-object v0, Lfj/a0;->k:Lfj/a0;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/Long;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    int-to-long v3, p2

    .line 24
    add-long/2addr v1, v3

    .line 25
    invoke-virtual {p1, v0, v1, v2}, Lfj/q;->D(Lfj/p;J)Lfj/q;

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

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$b;->d(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$b;->e(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lfj/q;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lnet/time4j/calendar/b$b;->b(Lfj/q;Z)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public e(Lfj/q;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lnet/time4j/calendar/b$b;->b(Lfj/q;Z)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public g(Lfj/q;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$b;->f(Lfj/q;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public i(Lfj/q;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$b;->h(Lfj/q;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$b;->g(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/b$b;->t(Lfj/q;Ljava/lang/Integer;)Z

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

    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$b;->r(Lfj/q;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/b$b;->v(Lfj/q;Ljava/lang/Integer;Z)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$b;->i(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$b;->n(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public t(Lfj/q;Ljava/lang/Integer;)Z
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
    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$b;->h(Lfj/q;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-lt p2, v1, :cond_1

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$b;->f(Lfj/q;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-gt p2, p1, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    :cond_1
    return v0
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

.method public v(Lfj/q;Ljava/lang/Integer;Z)Lfj/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;",
            "Ljava/lang/Integer;",
            "Z)TD;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/b$b;->t(Lfj/q;Ljava/lang/Integer;)Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-direct {p0, p1, p2}, Lnet/time4j/calendar/b$b;->u(Lfj/q;I)Lfj/q;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_1
    new-instance p3, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v1, "Invalid value: "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p2, " (context="

    .line 36
    .line 37
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p1, ")"

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p3
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
