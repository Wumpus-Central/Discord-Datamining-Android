.class Lnet/time4j/h0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/u<",
        "Lnet/time4j/h0;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/h0$a;)V
    .locals 0

    invoke-direct {p0}, Lnet/time4j/h0$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lfj/f0;
    .locals 1

    sget-object v0, Lfj/f0;->a:Lfj/f0;

    return-object v0
.end method

.method public b(Lfj/q;Lfj/d;ZZ)Lnet/time4j/h0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;",
            "Lfj/d;",
            "ZZ)",
            "Lnet/time4j/h0;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lnet/time4j/base/f;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget-object p4, Lgj/a;->d:Lfj/c;

    .line 6
    .line 7
    invoke-interface {p2, p4}, Lfj/d;->b(Lfj/c;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p2, p4}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Lnet/time4j/tz/k;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-eqz p3, :cond_1

    .line 21
    .line 22
    sget-object p2, Lnet/time4j/tz/p;->u:Lnet/time4j/tz/p;

    .line 23
    .line 24
    :goto_0
    const-class p3, Lnet/time4j/base/f;

    .line 25
    .line 26
    invoke-virtual {p3, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lnet/time4j/base/f;

    .line 31
    .line 32
    invoke-static {p1}, Lnet/time4j/a0;->d0(Lnet/time4j/base/f;)Lnet/time4j/a0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, p2}, Lnet/time4j/a0;->w0(Lnet/time4j/tz/k;)Lnet/time4j/h0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    const-string p2, "Missing timezone attribute for type conversion."

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    const/4 v0, 0x0

    .line 50
    if-eqz p4, :cond_3

    .line 51
    .line 52
    sget-object p4, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 53
    .line 54
    invoke-virtual {p1, p4}, Lfj/q;->m(Lfj/p;)I

    .line 55
    .line 56
    .line 57
    move-result p4

    .line 58
    const/16 v1, 0x3c

    .line 59
    .line 60
    if-ne p4, v1, :cond_3

    .line 61
    .line 62
    const/4 p4, 0x1

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    move p4, v0

    .line 65
    :goto_1
    if-eqz p4, :cond_4

    .line 66
    .line 67
    sget-object v1, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 68
    .line 69
    const/16 v2, 0x3b

    .line 70
    .line 71
    invoke-virtual {p1, v1, v2}, Lfj/q;->B(Lfj/p;I)Lfj/q;

    .line 72
    .line 73
    .line 74
    :cond_4
    sget-object v1, Lnet/time4j/f0;->x:Lfj/p;

    .line 75
    .line 76
    invoke-virtual {p1, v1}, Lfj/q;->o(Lfj/p;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Lnet/time4j/f0;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1, p1, p2, p3, v0}, Lfj/h0;->F(Lfj/q;Lfj/d;ZZ)Lfj/k0;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Lnet/time4j/f0;

    .line 98
    .line 99
    :goto_2
    const/4 v2, 0x0

    .line 100
    if-nez v1, :cond_6

    .line 101
    .line 102
    return-object v2

    .line 103
    :cond_6
    sget-object v3, Lnet/time4j/g0;->y:Lfj/p;

    .line 104
    .line 105
    invoke-virtual {p1, v3}, Lfj/q;->o(Lfj/p;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_7

    .line 110
    .line 111
    invoke-virtual {p1, v3}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    check-cast p2, Lnet/time4j/g0;

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    invoke-static {}, Lnet/time4j/g0;->l0()Lfj/h0;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v3, p1, p2, p3, v0}, Lfj/h0;->F(Lfj/q;Lfj/d;ZZ)Lfj/k0;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    check-cast p2, Lnet/time4j/g0;

    .line 127
    .line 128
    if-nez p2, :cond_8

    .line 129
    .line 130
    if-eqz p3, :cond_8

    .line 131
    .line 132
    sget-object p2, Lnet/time4j/g0;->w:Lnet/time4j/g0;

    .line 133
    .line 134
    :cond_8
    :goto_3
    if-nez p2, :cond_9

    .line 135
    .line 136
    return-object v2

    .line 137
    :cond_9
    sget-object p3, Lnet/time4j/x;->q:Lfj/p;

    .line 138
    .line 139
    invoke-virtual {p1, p3}, Lfj/q;->o(Lfj/p;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_a

    .line 144
    .line 145
    invoke-virtual {p1, p3}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    check-cast p3, Ljava/lang/Long;

    .line 150
    .line 151
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 152
    .line 153
    .line 154
    move-result-wide v2

    .line 155
    sget-object p3, Lnet/time4j/f;->r:Lnet/time4j/f;

    .line 156
    .line 157
    invoke-virtual {v1, v2, v3, p3}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    move-object v1, p3

    .line 162
    check-cast v1, Lnet/time4j/f0;

    .line 163
    .line 164
    :cond_a
    if-eqz p4, :cond_b

    .line 165
    .line 166
    sget-object p3, Lfj/b0;->k:Lfj/b0;

    .line 167
    .line 168
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 169
    .line 170
    invoke-virtual {p1, p3, p4}, Lfj/q;->A(Lfj/p;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_b

    .line 175
    .line 176
    invoke-virtual {p1, p3, p4}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 177
    .line 178
    .line 179
    :cond_b
    invoke-static {v1, p2}, Lnet/time4j/h0;->e0(Lnet/time4j/f0;Lnet/time4j/g0;)Lnet/time4j/h0;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    return-object p1
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

.method public bridge synthetic c(Lfj/q;Lfj/d;ZZ)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/time4j/h0$e;->b(Lfj/q;Lfj/d;ZZ)Lnet/time4j/h0;

    move-result-object p1

    return-object p1
.end method

.method public d()Lfj/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/x<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Lnet/time4j/h0;Lfj/d;)Lfj/o;
    .locals 0

    return-object p1
.end method

.method public g(Lfj/y;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-interface {p1}, Lfj/y;->a()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Lgj/e;->b(I)Lgj/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1, p1, p2}, Lgj/b;->u(Lgj/e;Lgj/e;Ljava/util/Locale;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method public j()I
    .locals 1

    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    move-result-object v0

    invoke-virtual {v0}, Lfj/x;->j()I

    move-result v0

    return v0
.end method

.method public bridge synthetic k(Ljava/lang/Object;Lfj/d;)Lfj/o;
    .locals 0

    check-cast p1, Lnet/time4j/h0;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/h0$e;->e(Lnet/time4j/h0;Lfj/d;)Lfj/o;

    move-result-object p1

    return-object p1
.end method
