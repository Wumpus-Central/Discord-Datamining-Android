.class Lnet/time4j/f$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/m0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "j"
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


# instance fields
.field private final a:Lnet/time4j/f;

.field private final b:I


# direct methods
.method constructor <init>(Lnet/time4j/f;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lnet/time4j/f$j;-><init>(Lnet/time4j/f;I)V

    return-void
.end method

.method constructor <init>(Lnet/time4j/f;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/time4j/f$j;->a:Lnet/time4j/f;

    .line 4
    iput p2, p0, Lnet/time4j/f$j;->b:I

    return-void
.end method

.method private static e(Lnet/time4j/f0;Lnet/time4j/f0;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/time4j/f0;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lnet/time4j/f0;->i()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lnet/time4j/f0;->F0()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p0}, Lnet/time4j/f0;->F0()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    sub-int/2addr p1, p0

    .line 20
    int-to-long p0, p1

    .line 21
    return-wide p0

    .line 22
    :cond_0
    invoke-virtual {p1}, Lnet/time4j/f0;->G0()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    invoke-virtual {p0}, Lnet/time4j/f0;->G0()J

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    sub-long/2addr v0, p0

    .line 31
    return-wide v0
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

.method private f(Lnet/time4j/f0;Lnet/time4j/f0;)J
    .locals 8

    .line 1
    invoke-virtual {p2}, Lnet/time4j/f0;->H0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1}, Lnet/time4j/f0;->H0()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    sub-long/2addr v0, v2

    .line 10
    iget v2, p0, Lnet/time4j/f$j;->b:I

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    const-wide/16 v4, 0x0

    .line 14
    .line 15
    const-wide/16 v6, 0x1

    .line 16
    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    if-eq v2, v3, :cond_2

    .line 21
    .line 22
    const/4 v3, 0x6

    .line 23
    if-ne v2, v3, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    cmp-long v2, v0, v4

    .line 27
    .line 28
    if-lez v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p2}, Lnet/time4j/f0;->p()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {p1}, Lnet/time4j/f0;->p()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-ge v3, v4, :cond_1

    .line 39
    .line 40
    :goto_0
    sub-long/2addr v0, v6

    .line 41
    goto :goto_3

    .line 42
    :cond_1
    if-gez v2, :cond_4

    .line 43
    .line 44
    invoke-virtual {p2}, Lnet/time4j/f0;->p()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-virtual {p1}, Lnet/time4j/f0;->p()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-le p2, p1, :cond_4

    .line 53
    .line 54
    :goto_1
    add-long/2addr v0, v6

    .line 55
    goto :goto_3

    .line 56
    :cond_2
    :goto_2
    sget-object v3, Lnet/time4j/f;->p:Lnet/time4j/f;

    .line 57
    .line 58
    cmp-long v4, v0, v4

    .line 59
    .line 60
    if-lez v4, :cond_3

    .line 61
    .line 62
    invoke-static {v3, p1, v0, v1, v2}, Lnet/time4j/f0;->w0(Lnet/time4j/f;Lnet/time4j/f0;JI)Lnet/time4j/f0;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2, p2}, Lfj/m;->S(Lfj/g;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    if-gez v4, :cond_4

    .line 74
    .line 75
    iget v2, p0, Lnet/time4j/f$j;->b:I

    .line 76
    .line 77
    invoke-static {v3, p1, v0, v1, v2}, Lnet/time4j/f0;->w0(Lnet/time4j/f;Lnet/time4j/f0;JI)Lnet/time4j/f0;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1, p2}, Lfj/m;->T(Lfj/g;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    :goto_3
    return-wide v0
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
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Lfj/q;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/f$j;->d(Lfj/q;Lfj/q;)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/f$j;->c(Lfj/q;J)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public c(Lfj/q;J)Lfj/q;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;J)TT;"
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
    iget-object v2, p0, Lnet/time4j/f$j;->a:Lnet/time4j/f;

    .line 10
    .line 11
    iget v3, p0, Lnet/time4j/f$j;->b:I

    .line 12
    .line 13
    invoke-static {v2, v1, p2, p3, v3}, Lnet/time4j/f0;->w0(Lnet/time4j/f;Lnet/time4j/f0;JI)Lnet/time4j/f0;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p1, v0, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

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

.method public d(Lfj/q;Lfj/q;)J
    .locals 9
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
    sget-object v2, Lnet/time4j/f$i;->a:[I

    .line 16
    .line 17
    iget-object v3, p0, Lnet/time4j/f$j;->a:Lnet/time4j/f;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    aget v2, v2, v3

    .line 24
    .line 25
    packed-switch v2, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 29
    .line 30
    iget-object p2, p0, Lnet/time4j/f$j;->a:Lnet/time4j/f;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :pswitch_0
    invoke-direct {p0, v1, v0}, Lnet/time4j/f$j;->f(Lnet/time4j/f0;Lnet/time4j/f0;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    goto :goto_0

    .line 45
    :pswitch_1
    invoke-direct {p0, v1, v0}, Lnet/time4j/f$j;->f(Lnet/time4j/f0;Lnet/time4j/f0;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    const-wide/16 v4, 0x3

    .line 50
    .line 51
    div-long/2addr v2, v4

    .line 52
    goto :goto_0

    .line 53
    :pswitch_2
    invoke-direct {p0, v1, v0}, Lnet/time4j/f$j;->f(Lnet/time4j/f0;Lnet/time4j/f0;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    const-wide/16 v4, 0xc

    .line 58
    .line 59
    div-long/2addr v2, v4

    .line 60
    goto :goto_0

    .line 61
    :pswitch_3
    invoke-direct {p0, v1, v0}, Lnet/time4j/f$j;->f(Lnet/time4j/f0;Lnet/time4j/f0;)J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    const-wide/16 v4, 0x78

    .line 66
    .line 67
    div-long/2addr v2, v4

    .line 68
    goto :goto_0

    .line 69
    :pswitch_4
    invoke-direct {p0, v1, v0}, Lnet/time4j/f$j;->f(Lnet/time4j/f0;Lnet/time4j/f0;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    const-wide/16 v4, 0x4b0

    .line 74
    .line 75
    div-long/2addr v2, v4

    .line 76
    goto :goto_0

    .line 77
    :pswitch_5
    invoke-direct {p0, v1, v0}, Lnet/time4j/f$j;->f(Lnet/time4j/f0;Lnet/time4j/f0;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    const-wide/16 v4, 0x2ee0

    .line 82
    .line 83
    div-long/2addr v2, v4

    .line 84
    goto :goto_0

    .line 85
    :pswitch_6
    invoke-static {v1, v0}, Lnet/time4j/f$j;->e(Lnet/time4j/f0;Lnet/time4j/f0;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    goto :goto_0

    .line 90
    :pswitch_7
    invoke-static {v1, v0}, Lnet/time4j/f$j;->e(Lnet/time4j/f0;Lnet/time4j/f0;)J

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    const-wide/16 v4, 0x7

    .line 95
    .line 96
    div-long/2addr v2, v4

    .line 97
    :goto_0
    const-wide/16 v4, 0x0

    .line 98
    .line 99
    cmp-long v4, v2, v4

    .line 100
    .line 101
    if-eqz v4, :cond_3

    .line 102
    .line 103
    sget-object v5, Lnet/time4j/g0;->y:Lfj/p;

    .line 104
    .line 105
    invoke-virtual {p1, v5}, Lfj/q;->o(Lfj/p;)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_3

    .line 110
    .line 111
    invoke-virtual {p2, v5}, Lfj/q;->o(Lfj/p;)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_3

    .line 116
    .line 117
    iget-object v6, p0, Lnet/time4j/f$j;->a:Lnet/time4j/f;

    .line 118
    .line 119
    sget-object v7, Lnet/time4j/f;->r:Lnet/time4j/f;

    .line 120
    .line 121
    const/4 v8, 0x1

    .line 122
    if-ne v6, v7, :cond_0

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_0
    invoke-virtual {v1, v2, v3, v6}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Lnet/time4j/f0;

    .line 130
    .line 131
    invoke-virtual {v1, v0}, Lnet/time4j/f0;->O(Lfj/g;)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    const/4 v0, 0x0

    .line 139
    move v8, v0

    .line 140
    :goto_1
    if-eqz v8, :cond_3

    .line 141
    .line 142
    invoke-virtual {p1, v5}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, Lnet/time4j/g0;

    .line 147
    .line 148
    invoke-virtual {p2, v5}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    check-cast p2, Lnet/time4j/g0;

    .line 153
    .line 154
    const-wide/16 v0, 0x1

    .line 155
    .line 156
    if-lez v4, :cond_2

    .line 157
    .line 158
    invoke-virtual {p1, p2}, Lnet/time4j/g0;->A0(Lnet/time4j/g0;)Z

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    if-eqz v5, :cond_2

    .line 163
    .line 164
    sub-long/2addr v2, v0

    .line 165
    goto :goto_2

    .line 166
    :cond_2
    if-gez v4, :cond_3

    .line 167
    .line 168
    invoke-virtual {p1, p2}, Lnet/time4j/g0;->B0(Lnet/time4j/g0;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_3

    .line 173
    .line 174
    add-long/2addr v2, v0

    .line 175
    :cond_3
    :goto_2
    return-wide v2

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
