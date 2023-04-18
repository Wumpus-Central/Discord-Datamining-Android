.class Lnet/time4j/a1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/m0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/a1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lfj/q<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Lfj/m0<",
        "TT;>;"
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

    invoke-direct {p0}, Lnet/time4j/a1$c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Lfj/q;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/a1$c;->d(Lfj/q;Lfj/q;)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/a1$c;->c(Lfj/q;J)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public c(Lfj/q;J)Lfj/q;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;J)TT;"
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p2, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    sget-object v0, Lnet/time4j/a1;->q:Lnet/time4j/a1;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-long v0, v0

    .line 21
    invoke-static {v0, v1, p2, p3}, Lnet/time4j/base/c;->f(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide p2

    .line 25
    invoke-static {p2, p3}, Lnet/time4j/base/c;->g(J)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    sget-object p3, Lnet/time4j/f0;->x:Lfj/p;

    .line 30
    .line 31
    invoke-virtual {p1, p3}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lnet/time4j/f0;

    .line 36
    .line 37
    invoke-virtual {v0}, Lnet/time4j/f0;->I0()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {v0}, Lnet/time4j/f0;->E0()Lnet/time4j/x0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/16 v2, 0x35

    .line 46
    .line 47
    if-ne v1, v2, :cond_1

    .line 48
    .line 49
    const/16 v1, 0x1a

    .line 50
    .line 51
    invoke-static {p2, v1, v0}, Lnet/time4j/f0;->N0(IILnet/time4j/x0;)Lnet/time4j/f0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v2, Lnet/time4j/z0;->w:Lnet/time4j/z0;

    .line 56
    .line 57
    invoke-virtual {v2}, Lnet/time4j/z0;->n()Lnet/time4j/c;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v1, v2}, Lfj/q;->c(Lfj/p;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    :cond_1
    invoke-static {p2, v1, v0}, Lnet/time4j/f0;->N0(IILnet/time4j/x0;)Lnet/time4j/f0;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p1, p3, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1
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

.method public d(Lfj/q;Lfj/q;)J
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)J"
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
    invoke-virtual {p2, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lnet/time4j/f0;

    .line 14
    .line 15
    sget-object v2, Lnet/time4j/a1;->q:Lnet/time4j/a1;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {v0, v2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    sub-int/2addr v2, v3

    .line 38
    int-to-long v2, v2

    .line 39
    const-wide/16 v4, 0x0

    .line 40
    .line 41
    cmp-long v6, v2, v4

    .line 42
    .line 43
    if-eqz v6, :cond_5

    .line 44
    .line 45
    invoke-static {v1}, Lnet/time4j/a1;->y(Lnet/time4j/f0;)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    invoke-static {v0}, Lnet/time4j/a1;->y(Lnet/time4j/f0;)I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    const-wide/16 v9, 0x1

    .line 54
    .line 55
    if-lez v6, :cond_0

    .line 56
    .line 57
    if-le v7, v8, :cond_0

    .line 58
    .line 59
    sub-long/2addr v2, v9

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    if-gez v6, :cond_1

    .line 62
    .line 63
    if-ge v7, v8, :cond_1

    .line 64
    .line 65
    add-long/2addr v2, v9

    .line 66
    :cond_1
    :goto_0
    cmp-long v6, v2, v4

    .line 67
    .line 68
    if-eqz v6, :cond_5

    .line 69
    .line 70
    if-ne v7, v8, :cond_5

    .line 71
    .line 72
    invoke-virtual {v1}, Lnet/time4j/f0;->E0()Lnet/time4j/x0;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Lnet/time4j/x0;->b()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {v0}, Lnet/time4j/f0;->E0()Lnet/time4j/x0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lnet/time4j/x0;->b()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-lez v6, :cond_2

    .line 89
    .line 90
    if-le v1, v0, :cond_2

    .line 91
    .line 92
    sub-long/2addr v2, v9

    .line 93
    goto :goto_1

    .line 94
    :cond_2
    if-gez v6, :cond_3

    .line 95
    .line 96
    if-ge v1, v0, :cond_3

    .line 97
    .line 98
    add-long/2addr v2, v9

    .line 99
    :cond_3
    :goto_1
    cmp-long v4, v2, v4

    .line 100
    .line 101
    if-eqz v4, :cond_5

    .line 102
    .line 103
    if-ne v1, v0, :cond_5

    .line 104
    .line 105
    sget-object v0, Lnet/time4j/g0;->y:Lfj/p;

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_5

    .line 112
    .line 113
    invoke-virtual {p2, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_5

    .line 118
    .line 119
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Lnet/time4j/g0;

    .line 124
    .line 125
    invoke-virtual {p2, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    check-cast p2, Lnet/time4j/g0;

    .line 130
    .line 131
    if-lez v4, :cond_4

    .line 132
    .line 133
    invoke-virtual {p1, p2}, Lnet/time4j/g0;->A0(Lnet/time4j/g0;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_4

    .line 138
    .line 139
    sub-long/2addr v2, v9

    .line 140
    goto :goto_2

    .line 141
    :cond_4
    if-gez v4, :cond_5

    .line 142
    .line 143
    invoke-virtual {p1, p2}, Lnet/time4j/g0;->B0(Lnet/time4j/g0;)Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_5

    .line 148
    .line 149
    add-long/2addr v2, v9

    .line 150
    :cond_5
    :goto_2
    return-wide v2
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
