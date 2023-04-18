.class Lnet/time4j/a0$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/m0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/m0<",
        "Lnet/time4j/a0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/TimeUnit;


# direct methods
.method constructor <init>(Ljava/util/concurrent/TimeUnit;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/time4j/a0$h;->a:Ljava/util/concurrent/TimeUnit;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    check-cast p2, Lnet/time4j/a0;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/a0$h;->d(Lnet/time4j/a0;Lnet/time4j/a0;)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/a0$h;->c(Lnet/time4j/a0;J)Lnet/time4j/a0;

    move-result-object p1

    return-object p1
.end method

.method public c(Lnet/time4j/a0;J)Lnet/time4j/a0;
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/time4j/a0$h;->a:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-wide/16 v1, 0x1

    .line 10
    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lnet/time4j/a0$h;->a:Ljava/util/concurrent/TimeUnit;

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-static {p2, p3, v0, v1}, Lnet/time4j/base/c;->i(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide p2

    .line 23
    invoke-virtual {p1}, Lnet/time4j/a0;->u()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {v0, v1, p2, p3}, Lnet/time4j/base/c;->f(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide p2

    .line 31
    invoke-virtual {p1}, Lnet/time4j/a0;->a()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    sget-object v0, Lmj/f;->k:Lmj/f;

    .line 36
    .line 37
    invoke-static {p2, p3, p1, v0}, Lnet/time4j/a0;->o0(JILmj/f;)Lnet/time4j/a0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_0
    iget-object v0, p0, Lnet/time4j/a0$h;->a:Ljava/util/concurrent/TimeUnit;

    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-static {p2, p3, v0, v1}, Lnet/time4j/base/c;->i(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide p2

    .line 52
    invoke-virtual {p1}, Lnet/time4j/a0;->a()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    int-to-long v0, v0

    .line 57
    invoke-static {v0, v1, p2, p3}, Lnet/time4j/base/c;->f(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide p2

    .line 61
    const v0, 0x3b9aca00

    .line 62
    .line 63
    .line 64
    invoke-static {p2, p3, v0}, Lnet/time4j/base/c;->d(JI)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-static {p2, p3, v0}, Lnet/time4j/base/c;->b(JI)J

    .line 69
    .line 70
    .line 71
    move-result-wide p2

    .line 72
    invoke-virtual {p1}, Lnet/time4j/a0;->u()J

    .line 73
    .line 74
    .line 75
    move-result-wide v2

    .line 76
    invoke-static {v2, v3, p2, p3}, Lnet/time4j/base/c;->f(JJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide p1

    .line 80
    sget-object p3, Lmj/f;->k:Lmj/f;

    .line 81
    .line 82
    invoke-static {p1, p2, v1, p3}, Lnet/time4j/a0;->o0(JILmj/f;)Lnet/time4j/a0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1
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

.method public d(Lnet/time4j/a0;Lnet/time4j/a0;)J
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/time4j/a0$h;->a:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ltz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2}, Lnet/time4j/a0;->u()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p1}, Lnet/time4j/a0;->u()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    sub-long/2addr v0, v2

    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    cmp-long v2, v0, v2

    .line 23
    .line 24
    const-wide/16 v3, 0x1

    .line 25
    .line 26
    if-gez v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p2}, Lnet/time4j/a0;->a()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {p1}, Lnet/time4j/a0;->a()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-le p2, p1, :cond_2

    .line 37
    .line 38
    add-long/2addr v0, v3

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    if-lez v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {p2}, Lnet/time4j/a0;->a()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-virtual {p1}, Lnet/time4j/a0;->a()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-ge p2, p1, :cond_2

    .line 51
    .line 52
    sub-long/2addr v0, v3

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p2}, Lnet/time4j/a0;->u()J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    invoke-virtual {p1}, Lnet/time4j/a0;->u()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    invoke-static {v0, v1, v2, v3}, Lnet/time4j/base/c;->m(JJ)J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    const-wide/32 v2, 0x3b9aca00

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1, v2, v3}, Lnet/time4j/base/c;->i(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    invoke-virtual {p2}, Lnet/time4j/a0;->a()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-virtual {p1}, Lnet/time4j/a0;->a()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    sub-int/2addr p2, p1

    .line 82
    int-to-long p1, p2

    .line 83
    invoke-static {v0, v1, p1, p2}, Lnet/time4j/base/c;->f(JJ)J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    :cond_2
    :goto_0
    sget-object p1, Lnet/time4j/a0$a;->c:[I

    .line 88
    .line 89
    iget-object p2, p0, Lnet/time4j/a0$h;->a:Ljava/util/concurrent/TimeUnit;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    aget p1, p1, p2

    .line 96
    .line 97
    packed-switch p1, :pswitch_data_0

    .line 98
    .line 99
    .line 100
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 101
    .line 102
    iget-object p2, p0, Lnet/time4j/a0$h;->a:Ljava/util/concurrent/TimeUnit;

    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :pswitch_0
    const-wide/16 p1, 0x3e8

    .line 113
    .line 114
    div-long/2addr v0, p1

    .line 115
    goto :goto_1

    .line 116
    :pswitch_1
    const-wide/32 p1, 0xf4240

    .line 117
    .line 118
    .line 119
    div-long/2addr v0, p1

    .line 120
    goto :goto_1

    .line 121
    :pswitch_2
    const-wide/16 p1, 0x3c

    .line 122
    .line 123
    div-long/2addr v0, p1

    .line 124
    goto :goto_1

    .line 125
    :pswitch_3
    const-wide/16 p1, 0xe10

    .line 126
    .line 127
    div-long/2addr v0, p1

    .line 128
    goto :goto_1

    .line 129
    :pswitch_4
    const-wide/32 p1, 0x15180

    .line 130
    .line 131
    .line 132
    div-long/2addr v0, p1

    .line 133
    :goto_1
    :pswitch_5
    return-wide v0

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_1
        :pswitch_0
        :pswitch_5
    .end packed-switch
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
