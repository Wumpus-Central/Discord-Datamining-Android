.class public final Lio/sentry/b4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/ISpan;


# instance fields
.field private final a:Ljava/util/Date;

.field private final b:Ljava/lang/Long;

.field private c:Ljava/lang/Long;

.field private d:Ljava/lang/Double;

.field private final e:Lio/sentry/c4;

.field private final f:Lio/sentry/w3;

.field private g:Ljava/lang/Throwable;

.field private final h:Lio/sentry/f0;

.field private final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private j:Lio/sentry/d4;

.field private final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/sentry/n4;Lio/sentry/w3;Lio/sentry/f0;Ljava/util/Date;)V
    .locals 2

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lio/sentry/b4;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/b4;->k:Ljava/util/Map;

    const-string v0, "context is required"

    .line 16
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/c4;

    iput-object p1, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    const-string p1, "sentryTracer is required"

    .line 17
    invoke-static {p2, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/w3;

    iput-object p1, p0, Lio/sentry/b4;->f:Lio/sentry/w3;

    const-string p1, "hub is required"

    .line 18
    invoke-static {p3, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/f0;

    iput-object p1, p0, Lio/sentry/b4;->h:Lio/sentry/f0;

    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, Lio/sentry/b4;->j:Lio/sentry/d4;

    if-eqz p4, :cond_0

    .line 20
    iput-object p4, p0, Lio/sentry/b4;->a:Ljava/util/Date;

    .line 21
    iput-object p1, p0, Lio/sentry/b4;->b:Ljava/lang/Long;

    goto :goto_0

    .line 22
    :cond_0
    invoke-static {}, Lio/sentry/h;->b()Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/b4;->a:Ljava/util/Date;

    .line 23
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/b4;->b:Ljava/lang/Long;

    :goto_0
    return-void
.end method

.method constructor <init>(Lio/sentry/protocol/p;Lio/sentry/e4;Lio/sentry/w3;Ljava/lang/String;Lio/sentry/f0;Ljava/util/Date;Lio/sentry/d4;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lio/sentry/b4;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/b4;->k:Ljava/util/Map;

    .line 4
    new-instance v0, Lio/sentry/c4;

    new-instance v3, Lio/sentry/e4;

    invoke-direct {v3}, Lio/sentry/e4;-><init>()V

    .line 5
    invoke-virtual {p3}, Lio/sentry/w3;->B()Lio/sentry/m4;

    move-result-object v6

    move-object v1, v0

    move-object v2, p1

    move-object v4, p4

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lio/sentry/c4;-><init>(Lio/sentry/protocol/p;Lio/sentry/e4;Ljava/lang/String;Lio/sentry/e4;Lio/sentry/m4;)V

    iput-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    const-string p1, "transaction is required"

    .line 6
    invoke-static {p3, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/w3;

    iput-object p1, p0, Lio/sentry/b4;->f:Lio/sentry/w3;

    const-string p1, "hub is required"

    .line 7
    invoke-static {p5, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/f0;

    iput-object p1, p0, Lio/sentry/b4;->h:Lio/sentry/f0;

    .line 8
    iput-object p7, p0, Lio/sentry/b4;->j:Lio/sentry/d4;

    if-eqz p6, :cond_0

    .line 9
    iput-object p6, p0, Lio/sentry/b4;->a:Ljava/util/Date;

    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lio/sentry/b4;->b:Ljava/lang/Long;

    goto :goto_0

    .line 11
    :cond_0
    invoke-static {}, Lio/sentry/h;->b()Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/b4;->a:Ljava/util/Date;

    .line 12
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/b4;->b:Ljava/lang/Long;

    :goto_0
    return-void
.end method

.method private q(Ljava/lang/Long;)Ljava/lang/Double;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/b4;->b:Ljava/lang/Long;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-object p1, p0, Lio/sentry/b4;->b:Ljava/lang/Long;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    sub-long/2addr v0, v2

    .line 18
    long-to-double v0, v0

    .line 19
    invoke-static {v0, v1}, Lio/sentry/h;->h(D)D

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    const/4 p1, 0x0

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


# virtual methods
.method public A()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->d:Ljava/lang/Double;

    return-object v0
.end method

.method public B()Lio/sentry/protocol/p;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    invoke-virtual {v0}, Lio/sentry/c4;->j()Lio/sentry/protocol/p;

    move-result-object v0

    return-object v0
.end method

.method public C()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    invoke-virtual {v0}, Lio/sentry/c4;->d()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public D()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    invoke-virtual {v0}, Lio/sentry/c4;->e()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method E(Lio/sentry/d4;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/b4;->j:Lio/sentry/d4;

    return-void
.end method

.method public F(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/ISpan;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/b4;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lio/sentry/n1;->n()Lio/sentry/n1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Lio/sentry/b4;->f:Lio/sentry/w3;

    .line 15
    .line 16
    iget-object v1, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    .line 17
    .line 18
    invoke-virtual {v1}, Lio/sentry/c4;->g()Lio/sentry/e4;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1, p1, p2}, Lio/sentry/w3;->K(Lio/sentry/e4;Ljava/lang/String;Ljava/lang/String;)Lio/sentry/ISpan;

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

.method public a()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public b()Lio/sentry/f4;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    invoke-virtual {v0}, Lio/sentry/c4;->h()Lio/sentry/f4;

    move-result-object v0

    return-object v0
.end method

.method public d(Lio/sentry/f4;)V
    .locals 2

    invoke-static {}, Lio/sentry/h;->b()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/h;->a(Ljava/util/Date;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lio/sentry/b4;->n(Lio/sentry/f4;Ljava/lang/Double;Ljava/lang/Long;)V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/sentry/p0;)Lio/sentry/ISpan;
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/b4;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lio/sentry/n1;->n()Lio/sentry/n1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Lio/sentry/b4;->f:Lio/sentry/w3;

    .line 15
    .line 16
    iget-object v1, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    .line 17
    .line 18
    invoke-virtual {v1}, Lio/sentry/c4;->g()Lio/sentry/e4;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v2, p1

    .line 23
    move-object v3, p2

    .line 24
    move-object v4, p3

    .line 25
    move-object v5, p4

    .line 26
    invoke-virtual/range {v0 .. v5}, Lio/sentry/w3;->L(Lio/sentry/e4;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/sentry/p0;)Lio/sentry/ISpan;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
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
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    invoke-virtual {v0}, Lio/sentry/c4;->h()Lio/sentry/f4;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/b4;->d(Lio/sentry/f4;)V

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/b4;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lio/sentry/c4;->k(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public j(Ljava/lang/String;)Lio/sentry/ISpan;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/sentry/b4;->F(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/ISpan;

    move-result-object p1

    return-object p1
.end method

.method public l()Lio/sentry/c4;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    return-object v0
.end method

.method n(Lio/sentry/f4;Ljava/lang/Double;Ljava/lang/Long;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/b4;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lio/sentry/c4;->m(Lio/sentry/f4;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lio/sentry/b4;->d:Ljava/lang/Double;

    .line 18
    .line 19
    iget-object p1, p0, Lio/sentry/b4;->g:Ljava/lang/Throwable;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, Lio/sentry/b4;->h:Lio/sentry/f0;

    .line 24
    .line 25
    iget-object v0, p0, Lio/sentry/b4;->f:Lio/sentry/w3;

    .line 26
    .line 27
    invoke-virtual {v0}, Lio/sentry/w3;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p2, p1, p0, v0}, Lio/sentry/f0;->n(Ljava/lang/Throwable;Lio/sentry/ISpan;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object p1, p0, Lio/sentry/b4;->j:Lio/sentry/d4;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    invoke-interface {p1, p0}, Lio/sentry/d4;->a(Lio/sentry/b4;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    if-nez p3, :cond_3

    .line 42
    .line 43
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 44
    .line 45
    .line 46
    move-result-wide p1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lio/sentry/b4;->c:Ljava/lang/Long;

    .line 57
    .line 58
    return-void
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

.method public o()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/b4;->k:Ljava/util/Map;

    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    invoke-virtual {v0}, Lio/sentry/c4;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method r()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->c:Ljava/lang/Long;

    return-object v0
.end method

.method public s()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->c:Ljava/lang/Long;

    invoke-virtual {p0, v0}, Lio/sentry/b4;->t(Ljava/lang/Long;)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method t(Ljava/lang/Long;)Ljava/lang/Double;
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lio/sentry/b4;->q(Ljava/lang/Long;)Ljava/lang/Double;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/b4;->a:Ljava/util/Date;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    long-to-double v0, v0

    .line 14
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    add-double/2addr v0, v2

    .line 19
    invoke-static {v0, v1}, Lio/sentry/h;->g(D)D

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    iget-object p1, p0, Lio/sentry/b4;->d:Ljava/lang/Double;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    const/4 p1, 0x0

    .line 34
    return-object p1
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

.method public u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    invoke-virtual {v0}, Lio/sentry/c4;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v()Lio/sentry/e4;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    invoke-virtual {v0}, Lio/sentry/c4;->c()Lio/sentry/e4;

    move-result-object v0

    return-object v0
.end method

.method public w()Lio/sentry/m4;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    invoke-virtual {v0}, Lio/sentry/c4;->f()Lio/sentry/m4;

    move-result-object v0

    return-object v0
.end method

.method public x()Lio/sentry/e4;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    invoke-virtual {v0}, Lio/sentry/c4;->g()Lio/sentry/e4;

    move-result-object v0

    return-object v0
.end method

.method public y()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/sentry/b4;->a:Ljava/util/Date;

    return-object v0
.end method

.method public z()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/b4;->e:Lio/sentry/c4;

    invoke-virtual {v0}, Lio/sentry/c4;->i()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
