.class public final Lio/sentry/util/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/util/h$a;,
        Lio/sentry/util/h$c;,
        Lio/sentry/util/h$b;
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/util/h;->k(Ljava/lang/Object;Ljava/lang/Class;)V

    return-void
.end method

.method public static synthetic b(Lio/sentry/g0;Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/sentry/util/h;->l(Lio/sentry/g0;Ljava/lang/Object;Ljava/lang/Class;)V

    return-void
.end method

.method public static synthetic c(Lio/sentry/util/h$c;Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/sentry/util/h;->j(Lio/sentry/util/h$c;Ljava/lang/Object;Ljava/lang/Class;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, Lio/sentry/util/h;->i(Ljava/lang/Object;)V

    return-void
.end method

.method public static e(Ljava/lang/Object;)Lio/sentry/v;
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/v;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/v;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p0}, Lio/sentry/util/h;->r(Lio/sentry/v;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-object v0
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

.method public static f(Lio/sentry/v;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "sentry:typeCheckHint"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio/sentry/v;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public static g(Lio/sentry/v;Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/v;",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lio/sentry/util/h;->f(Lio/sentry/v;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
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

.method public static h(Lio/sentry/v;)Z
    .locals 3

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "sentry:isFromHybridSdk"

    const-class v2, Ljava/lang/Boolean;

    invoke-virtual {p0, v1, v2}, Lio/sentry/v;->d(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static synthetic i(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method private static synthetic j(Lio/sentry/util/h$c;Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    invoke-interface {p0, p1}, Lio/sentry/util/h$c;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic k(Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    return-void
.end method

.method private static synthetic l(Lio/sentry/g0;Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    invoke-static {p2, p1, p0}, Lio/sentry/util/j;->a(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/g0;)V

    return-void
.end method

.method public static m(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/sentry/v;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lio/sentry/util/h$c<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lio/sentry/util/e;

    invoke-direct {v0}, Lio/sentry/util/e;-><init>()V

    new-instance v1, Lio/sentry/util/f;

    invoke-direct {v1, p2}, Lio/sentry/util/f;-><init>(Lio/sentry/util/h$c;)V

    invoke-static {p0, p1, v0, v1}, Lio/sentry/util/h;->o(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;Lio/sentry/util/h$b;)V

    return-void
.end method

.method public static n(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/sentry/v;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lio/sentry/util/h$a<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/sentry/util/d;

    invoke-direct {v0}, Lio/sentry/util/d;-><init>()V

    invoke-static {p0, p1, p2, v0}, Lio/sentry/util/h;->o(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;Lio/sentry/util/h$b;)V

    return-void
.end method

.method public static o(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;Lio/sentry/util/h$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/sentry/v;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lio/sentry/util/h$a<",
            "TT;>;",
            "Lio/sentry/util/h$b;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lio/sentry/util/h;->f(Lio/sentry/v;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1}, Lio/sentry/util/h;->g(Lio/sentry/v;Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p2, v0}, Lio/sentry/util/h$a;->accept(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p3, v0, p1}, Lio/sentry/util/h$b;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-void
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

.method public static p(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/g0;Lio/sentry/util/h$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/sentry/v;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lio/sentry/g0;",
            "Lio/sentry/util/h$a<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/sentry/util/g;

    invoke-direct {v0, p2}, Lio/sentry/util/g;-><init>(Lio/sentry/g0;)V

    invoke-static {p0, p1, p3, v0}, Lio/sentry/util/h;->o(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;Lio/sentry/util/h$b;)V

    return-void
.end method

.method public static q(Lio/sentry/v;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sentry.javascript"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "sentry.dart"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "sentry.dotnet"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    :cond_0
    const-string p1, "sentry:isFromHybridSdk"

    .line 26
    .line 27
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {p0, p1, v0}, Lio/sentry/v;->h(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
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

.method public static r(Lio/sentry/v;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "sentry:typeCheckHint"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lio/sentry/v;->h(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
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

.method public static s(Lio/sentry/v;)Z
    .locals 1

    const-class v0, Lio/sentry/hints/b;

    invoke-static {p0, v0}, Lio/sentry/util/h;->g(Lio/sentry/v;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-class v0, Lio/sentry/hints/a;

    invoke-static {p0, v0}, Lio/sentry/util/h;->g(Lio/sentry/v;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
