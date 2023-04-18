.class public final Lah/f;
.super Ldi/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lah/f$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ldi/x;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lmg/f1;Ldi/y;Ldi/j1;Ldi/g0;)Ldi/k1;
    .locals 2

    .line 1
    const-string v0, "parameter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeAttr"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "typeParameterUpperBoundEraser"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "erasedUpperBound"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    instance-of v0, p2, Lah/a;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-super {p0, p1, p2, p3, p4}, Ldi/x;->a(Lmg/f1;Ldi/y;Ldi/j1;Ldi/g0;)Ldi/k1;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    check-cast p2, Lah/a;

    .line 31
    .line 32
    invoke-virtual {p2}, Lah/a;->i()Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    sget-object p3, Lah/c;->k:Lah/c;

    .line 40
    .line 41
    invoke-virtual {p2, p3}, Lah/a;->l(Lah/c;)Lah/a;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    :goto_0
    invoke-virtual {p2}, Lah/a;->g()Lah/c;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    sget-object v0, Lah/f$a;->a:[I

    .line 50
    .line 51
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    aget p3, v0, p3

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    if-eq p3, v0, :cond_6

    .line 59
    .line 60
    const/4 v1, 0x2

    .line 61
    if-eq p3, v1, :cond_3

    .line 62
    .line 63
    const/4 v1, 0x3

    .line 64
    if-ne p3, v1, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    new-instance p1, Llf/q;

    .line 68
    .line 69
    invoke-direct {p1}, Llf/q;-><init>()V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_3
    :goto_1
    invoke-interface {p1}, Lmg/f1;->n()Ldi/w1;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    invoke-virtual {p3}, Ldi/w1;->b()Z

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    if-nez p3, :cond_4

    .line 82
    .line 83
    new-instance p2, Ldi/m1;

    .line 84
    .line 85
    sget-object p3, Ldi/w1;->o:Ldi/w1;

    .line 86
    .line 87
    invoke-static {p1}, Lth/c;->j(Lmg/m;)Ljg/h;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Ljg/h;->H()Ldi/o0;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-direct {p2, p3, p1}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    invoke-virtual {p4}, Ldi/g0;->N0()Ldi/g1;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-interface {p3}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    const-string v1, "erasedUpperBound.constructor.parameters"

    .line 108
    .line 109
    invoke-static {p3, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result p3

    .line 116
    xor-int/2addr p3, v0

    .line 117
    if-eqz p3, :cond_5

    .line 118
    .line 119
    new-instance p2, Ldi/m1;

    .line 120
    .line 121
    sget-object p1, Ldi/w1;->q:Ldi/w1;

    .line 122
    .line 123
    invoke-direct {p2, p1, p4}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    invoke-static {p1, p2}, Ldi/s1;->t(Lmg/f1;Ldi/y;)Ldi/k1;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    :goto_2
    const-string p1, "{\n                if (!p\u2026          }\n            }"

    .line 132
    .line 133
    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    new-instance p2, Ldi/m1;

    .line 138
    .line 139
    sget-object p1, Ldi/w1;->o:Ldi/w1;

    .line 140
    .line 141
    invoke-direct {p2, p1, p4}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 142
    .line 143
    .line 144
    :goto_3
    return-object p2
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
