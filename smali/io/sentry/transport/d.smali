.class public final Lio/sentry/transport/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/transport/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/transport/d$c;,
        Lio/sentry/transport/d$b;
    }
.end annotation


# instance fields
.field private final k:Lio/sentry/transport/v;

.field private final l:Lio/sentry/cache/e;

.field private final m:Lio/sentry/o3;

.field private final n:Lio/sentry/transport/y;

.field private final o:Lio/sentry/transport/q;

.field private final p:Lio/sentry/transport/n;


# direct methods
.method public constructor <init>(Lio/sentry/o3;Lio/sentry/transport/y;Lio/sentry/transport/q;Lio/sentry/y1;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lio/sentry/o3;->getMaxQueueSize()I

    move-result v0

    invoke-virtual {p1}, Lio/sentry/o3;->getEnvelopeDiskCache()Lio/sentry/cache/e;

    move-result-object v1

    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    move-result-object v2

    .line 2
    invoke-static {v0, v1, v2}, Lio/sentry/transport/d;->s(ILio/sentry/cache/e;Lio/sentry/g0;)Lio/sentry/transport/v;

    move-result-object v4

    new-instance v8, Lio/sentry/transport/n;

    invoke-direct {v8, p1, p4, p2}, Lio/sentry/transport/n;-><init>(Lio/sentry/o3;Lio/sentry/y1;Lio/sentry/transport/y;)V

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    .line 3
    invoke-direct/range {v3 .. v8}, Lio/sentry/transport/d;-><init>(Lio/sentry/transport/v;Lio/sentry/o3;Lio/sentry/transport/y;Lio/sentry/transport/q;Lio/sentry/transport/n;)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/transport/v;Lio/sentry/o3;Lio/sentry/transport/y;Lio/sentry/transport/q;Lio/sentry/transport/n;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "executor is required"

    .line 5
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/transport/v;

    iput-object p1, p0, Lio/sentry/transport/d;->k:Lio/sentry/transport/v;

    .line 6
    invoke-virtual {p2}, Lio/sentry/o3;->getEnvelopeDiskCache()Lio/sentry/cache/e;

    move-result-object p1

    const-string v0, "envelopeCache is required"

    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/cache/e;

    iput-object p1, p0, Lio/sentry/transport/d;->l:Lio/sentry/cache/e;

    const-string p1, "options is required"

    .line 7
    invoke-static {p2, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/o3;

    iput-object p1, p0, Lio/sentry/transport/d;->m:Lio/sentry/o3;

    const-string p1, "rateLimiter is required"

    .line 8
    invoke-static {p3, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/transport/y;

    iput-object p1, p0, Lio/sentry/transport/d;->n:Lio/sentry/transport/y;

    const-string p1, "transportGate is required"

    .line 9
    invoke-static {p4, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/transport/q;

    iput-object p1, p0, Lio/sentry/transport/d;->o:Lio/sentry/transport/q;

    const-string p1, "httpConnection is required"

    .line 10
    invoke-static {p5, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/transport/n;

    iput-object p1, p0, Lio/sentry/transport/d;->p:Lio/sentry/transport/n;

    return-void
.end method

.method public static synthetic b(Lio/sentry/cache/e;Lio/sentry/g0;Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/sentry/transport/d;->v(Lio/sentry/cache/e;Lio/sentry/g0;Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V

    return-void
.end method

.method public static synthetic f(Lio/sentry/hints/k;)V
    .locals 0

    invoke-static {p0}, Lio/sentry/transport/d;->w(Lio/sentry/hints/k;)V

    return-void
.end method

.method public static synthetic i(ZLio/sentry/hints/f;)V
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/transport/d;->x(ZLio/sentry/hints/f;)V

    return-void
.end method

.method static synthetic k(Lio/sentry/transport/d;)Lio/sentry/o3;
    .locals 0

    iget-object p0, p0, Lio/sentry/transport/d;->m:Lio/sentry/o3;

    return-object p0
.end method

.method static synthetic l(Lio/sentry/transport/d;)Lio/sentry/transport/q;
    .locals 0

    iget-object p0, p0, Lio/sentry/transport/d;->o:Lio/sentry/transport/q;

    return-object p0
.end method

.method static synthetic p(Lio/sentry/transport/d;)Lio/sentry/transport/n;
    .locals 0

    iget-object p0, p0, Lio/sentry/transport/d;->p:Lio/sentry/transport/n;

    return-object p0
.end method

.method private static s(ILio/sentry/cache/e;Lio/sentry/g0;)Lio/sentry/transport/v;
    .locals 6

    .line 1
    new-instance v4, Lio/sentry/transport/a;

    .line 2
    .line 3
    invoke-direct {v4, p1, p2}, Lio/sentry/transport/a;-><init>(Lio/sentry/cache/e;Lio/sentry/g0;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lio/sentry/transport/v;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    new-instance v3, Lio/sentry/transport/d$b;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {v3, v0}, Lio/sentry/transport/d$b;-><init>(Lio/sentry/transport/d$a;)V

    .line 13
    .line 14
    .line 15
    move-object v0, p1

    .line 16
    move v2, p0

    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v5}, Lio/sentry/transport/v;-><init>(IILjava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;Lio/sentry/g0;)V

    .line 19
    .line 20
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

.method private static synthetic v(Lio/sentry/cache/e;Lio/sentry/g0;Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 1

    .line 1
    instance-of p3, p2, Lio/sentry/transport/d$c;

    .line 2
    .line 3
    if-eqz p3, :cond_1

    .line 4
    .line 5
    check-cast p2, Lio/sentry/transport/d$c;

    .line 6
    .line 7
    invoke-static {p2}, Lio/sentry/transport/d$c;->h(Lio/sentry/transport/d$c;)Lio/sentry/v;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    const-class v0, Lio/sentry/hints/b;

    .line 12
    .line 13
    invoke-static {p3, v0}, Lio/sentry/util/h;->g(Lio/sentry/v;Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-nez p3, :cond_0

    .line 18
    .line 19
    invoke-static {p2}, Lio/sentry/transport/d$c;->i(Lio/sentry/transport/d$c;)Lio/sentry/q2;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-static {p2}, Lio/sentry/transport/d$c;->h(Lio/sentry/transport/d$c;)Lio/sentry/v;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {p0, p3, v0}, Lio/sentry/cache/e;->g(Lio/sentry/q2;Lio/sentry/v;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-static {p2}, Lio/sentry/transport/d$c;->h(Lio/sentry/transport/d$c;)Lio/sentry/v;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-static {p0, p2}, Lio/sentry/transport/d;->y(Lio/sentry/v;Z)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    new-array p2, p2, [Ljava/lang/Object;

    .line 42
    .line 43
    const-string p3, "Envelope rejected"

    .line 44
    .line 45
    invoke-interface {p1, p0, p3, p2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
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

.method private static synthetic w(Lio/sentry/hints/k;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/sentry/hints/k;->b(Z)V

    return-void
.end method

.method private static synthetic x(ZLio/sentry/hints/f;)V
    .locals 0

    invoke-interface {p1, p0}, Lio/sentry/hints/f;->c(Z)V

    return-void
.end method

.method private static y(Lio/sentry/v;Z)V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/transport/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/transport/b;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Lio/sentry/hints/k;

    .line 7
    .line 8
    invoke-static {p0, v1, v0}, Lio/sentry/util/h;->n(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/sentry/transport/c;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lio/sentry/transport/c;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    const-class p1, Lio/sentry/hints/f;

    .line 17
    .line 18
    invoke-static {p0, p1, v0}, Lio/sentry/util/h;->n(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.method public D(Lio/sentry/q2;Lio/sentry/v;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/transport/d;->l:Lio/sentry/cache/e;

    .line 2
    .line 3
    const-class v1, Lio/sentry/hints/b;

    .line 4
    .line 5
    invoke-static {p2, v1}, Lio/sentry/util/h;->g(Lio/sentry/v;Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lio/sentry/transport/r;->b()Lio/sentry/transport/r;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lio/sentry/transport/d;->m:Lio/sentry/o3;

    .line 17
    .line 18
    invoke-virtual {v1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget-object v3, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 23
    .line 24
    const-string v4, "Captured Envelope is already cached"

    .line 25
    .line 26
    new-array v2, v2, [Ljava/lang/Object;

    .line 27
    .line 28
    invoke-interface {v1, v3, v4, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    :cond_0
    iget-object v1, p0, Lio/sentry/transport/d;->n:Lio/sentry/transport/y;

    .line 33
    .line 34
    invoke-virtual {v1, p1, p2}, Lio/sentry/transport/y;->d(Lio/sentry/q2;Lio/sentry/v;)Lio/sentry/q2;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    iget-object p2, p0, Lio/sentry/transport/d;->l:Lio/sentry/cache/e;

    .line 43
    .line 44
    invoke-interface {p2, p1}, Lio/sentry/cache/e;->c(Lio/sentry/q2;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-class p1, Lio/sentry/hints/c;

    .line 49
    .line 50
    invoke-static {p2, p1}, Lio/sentry/util/h;->g(Lio/sentry/v;Ljava/lang/Class;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    iget-object p1, p0, Lio/sentry/transport/d;->m:Lio/sentry/o3;

    .line 57
    .line 58
    invoke-virtual {p1}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1, v1}, Lio/sentry/clientreport/g;->c(Lio/sentry/q2;)Lio/sentry/q2;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :cond_2
    iget-object p1, p0, Lio/sentry/transport/d;->k:Lio/sentry/transport/v;

    .line 67
    .line 68
    new-instance v2, Lio/sentry/transport/d$c;

    .line 69
    .line 70
    invoke-direct {v2, p0, v1, p2, v0}, Lio/sentry/transport/d$c;-><init>(Lio/sentry/transport/d;Lio/sentry/q2;Lio/sentry/v;Lio/sentry/cache/e;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v2}, Lio/sentry/transport/v;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    iget-object p1, p0, Lio/sentry/transport/d;->m:Lio/sentry/o3;

    .line 86
    .line 87
    invoke-virtual {p1}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    sget-object p2, Lio/sentry/clientreport/e;->QUEUE_OVERFLOW:Lio/sentry/clientreport/e;

    .line 92
    .line 93
    invoke-interface {p1, p2, v1}, Lio/sentry/clientreport/g;->b(Lio/sentry/clientreport/e;Lio/sentry/q2;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    :goto_0
    return-void
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

.method public close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/transport/d;->k:Lio/sentry/transport/v;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/transport/d;->m:Lio/sentry/o3;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    new-array v3, v2, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string v4, "Shutting down"

    .line 18
    .line 19
    invoke-interface {v0, v1, v4, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-object v0, p0, Lio/sentry/transport/d;->k:Lio/sentry/transport/v;

    .line 23
    .line 24
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    const-wide/16 v3, 0x1

    .line 27
    .line 28
    invoke-interface {v0, v3, v4, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Lio/sentry/transport/d;->m:Lio/sentry/o3;

    .line 35
    .line 36
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 41
    .line 42
    const-string v3, "Failed to shutdown the async connection async sender within 1 minute. Trying to force it now."

    .line 43
    .line 44
    new-array v4, v2, [Ljava/lang/Object;

    .line 45
    .line 46
    invoke-interface {v0, v1, v3, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lio/sentry/transport/d;->k:Lio/sentry/transport/v;

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    iget-object v0, p0, Lio/sentry/transport/d;->m:Lio/sentry/o3;

    .line 56
    .line 57
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 62
    .line 63
    const-string v3, "Thread interrupted while closing the connection."

    .line 64
    .line 65
    new-array v2, v2, [Ljava/lang/Object;

    .line 66
    .line 67
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 75
    .line 76
    .line 77
    :cond_0
    :goto_0
    return-void
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
.end method

.method public d(J)V
    .locals 1

    iget-object v0, p0, Lio/sentry/transport/d;->k:Lio/sentry/transport/v;

    invoke-virtual {v0, p1, p2}, Lio/sentry/transport/v;->b(J)V

    return-void
.end method
