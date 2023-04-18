.class public final Lfg/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\u0008\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0003\u0010\u0004\"\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lkotlin/reflect/KCallable;",
        "",
        "value",
        "a",
        "(Lkotlin/reflect/KCallable;)Z",
        "setAccessible",
        "(Lkotlin/reflect/KCallable;Z)V",
        "isAccessible",
        "kotlin-reflection"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lkotlin/reflect/KCallable;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KCallable<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Ldg/d;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    check-cast v0, Lkotlin/reflect/KProperty;

    .line 14
    .line 15
    invoke-static {v0}, Lfg/c;->b(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v3, v2

    .line 27
    :goto_0
    if-eqz v3, :cond_12

    .line 28
    .line 29
    invoke-static {v0}, Lfg/c;->c(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v0, v2

    .line 41
    :goto_1
    if-eqz v0, :cond_12

    .line 42
    .line 43
    check-cast p0, Ldg/d;

    .line 44
    .line 45
    invoke-static {p0}, Lfg/c;->e(Ldg/d;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move p0, v2

    .line 57
    :goto_2
    if-eqz p0, :cond_12

    .line 58
    .line 59
    goto :goto_5

    .line 60
    :cond_3
    instance-of v0, p0, Lkotlin/reflect/KProperty;

    .line 61
    .line 62
    if-eqz v0, :cond_6

    .line 63
    .line 64
    check-cast p0, Lkotlin/reflect/KProperty;

    .line 65
    .line 66
    invoke-static {p0}, Lfg/c;->b(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    goto :goto_3

    .line 77
    :cond_4
    move v0, v2

    .line 78
    :goto_3
    if-eqz v0, :cond_12

    .line 79
    .line 80
    invoke-static {p0}, Lfg/c;->c(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-eqz p0, :cond_5

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    goto :goto_4

    .line 91
    :cond_5
    move p0, v2

    .line 92
    :goto_4
    if-eqz p0, :cond_12

    .line 93
    .line 94
    :goto_5
    move v1, v2

    .line 95
    goto/16 :goto_e

    .line 96
    .line 97
    :cond_6
    instance-of v0, p0, Lkotlin/reflect/KProperty$b;

    .line 98
    .line 99
    if-eqz v0, :cond_9

    .line 100
    .line 101
    move-object v0, p0

    .line 102
    check-cast v0, Lkotlin/reflect/KProperty$b;

    .line 103
    .line 104
    invoke-interface {v0}, Lkotlin/reflect/KProperty$a;->n()Lkotlin/reflect/KProperty;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Lfg/c;->b(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    goto :goto_6

    .line 119
    :cond_7
    move v0, v2

    .line 120
    :goto_6
    if-eqz v0, :cond_12

    .line 121
    .line 122
    check-cast p0, Lkotlin/reflect/KFunction;

    .line 123
    .line 124
    invoke-static {p0}, Lfg/c;->d(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    if-eqz p0, :cond_8

    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    goto :goto_7

    .line 135
    :cond_8
    move p0, v2

    .line 136
    :goto_7
    if-eqz p0, :cond_12

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_9
    instance-of v0, p0, Ldg/d$a;

    .line 140
    .line 141
    if-eqz v0, :cond_c

    .line 142
    .line 143
    move-object v0, p0

    .line 144
    check-cast v0, Ldg/d$a;

    .line 145
    .line 146
    invoke-interface {v0}, Lkotlin/reflect/KProperty$a;->n()Lkotlin/reflect/KProperty;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v0}, Lfg/c;->b(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-eqz v0, :cond_a

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    goto :goto_8

    .line 161
    :cond_a
    move v0, v2

    .line 162
    :goto_8
    if-eqz v0, :cond_12

    .line 163
    .line 164
    check-cast p0, Lkotlin/reflect/KFunction;

    .line 165
    .line 166
    invoke-static {p0}, Lfg/c;->d(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    if-eqz p0, :cond_b

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    goto :goto_9

    .line 177
    :cond_b
    move p0, v2

    .line 178
    :goto_9
    if-eqz p0, :cond_12

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_c
    instance-of v0, p0, Lkotlin/reflect/KFunction;

    .line 182
    .line 183
    if-eqz v0, :cond_13

    .line 184
    .line 185
    move-object v0, p0

    .line 186
    check-cast v0, Lkotlin/reflect/KFunction;

    .line 187
    .line 188
    invoke-static {v0}, Lfg/c;->d(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    if-eqz v3, :cond_d

    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    goto :goto_a

    .line 199
    :cond_d
    move v3, v2

    .line 200
    :goto_a
    if-eqz v3, :cond_12

    .line 201
    .line 202
    invoke-static {p0}, Lgg/p0;->b(Ljava/lang/Object;)Lgg/l;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    const/4 v3, 0x0

    .line 207
    if-eqz p0, :cond_e

    .line 208
    .line 209
    invoke-virtual {p0}, Lgg/l;->w()Lhg/e;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    if-eqz p0, :cond_e

    .line 214
    .line 215
    invoke-interface {p0}, Lhg/e;->b()Ljava/lang/reflect/Member;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    goto :goto_b

    .line 220
    :cond_e
    move-object p0, v3

    .line 221
    :goto_b
    instance-of v4, p0, Ljava/lang/reflect/AccessibleObject;

    .line 222
    .line 223
    if-eqz v4, :cond_f

    .line 224
    .line 225
    move-object v3, p0

    .line 226
    check-cast v3, Ljava/lang/reflect/AccessibleObject;

    .line 227
    .line 228
    :cond_f
    if-eqz v3, :cond_10

    .line 229
    .line 230
    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    goto :goto_c

    .line 235
    :cond_10
    move p0, v2

    .line 236
    :goto_c
    if-eqz p0, :cond_12

    .line 237
    .line 238
    invoke-static {v0}, Lfg/c;->a(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Constructor;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    if-eqz p0, :cond_11

    .line 243
    .line 244
    invoke-virtual {p0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 245
    .line 246
    .line 247
    move-result p0

    .line 248
    goto :goto_d

    .line 249
    :cond_11
    move p0, v2

    .line 250
    :goto_d
    if-eqz p0, :cond_12

    .line 251
    .line 252
    goto/16 :goto_5

    .line 253
    .line 254
    :cond_12
    :goto_e
    return v1

    .line 255
    :cond_13
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 256
    .line 257
    new-instance v1, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 260
    .line 261
    .line 262
    const-string v2, "Unknown callable: "

    .line 263
    .line 264
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    const-string v2, " ("

    .line 271
    .line 272
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    const/16 p0, 0x29

    .line 283
    .line 284
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw v0
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
.end method
