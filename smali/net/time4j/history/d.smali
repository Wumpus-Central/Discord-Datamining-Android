.class public final Lnet/time4j/history/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/o0;
.implements Ljava/io/Serializable;


# static fields
.field public static final A:Lnet/time4j/history/d;

.field public static final B:Lnet/time4j/history/d;

.field public static final C:Lnet/time4j/history/d;

.field private static final D:J

.field private static final E:Lnet/time4j/history/d;

.field private static final F:Lnet/time4j/history/d;

.field private static final G:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/time4j/history/d;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x38e8946252654f6bL

.field public static final z:Lfj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/c<",
            "Ljj/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final transient k:Lkj/b;

.field private final transient l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/time4j/history/f;",
            ">;"
        }
    .end annotation
.end field

.field private final transient m:Lnet/time4j/history/a;

.field private final transient n:Lnet/time4j/history/o;

.field private final transient o:Lnet/time4j/history/g;

.field private final transient p:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Lnet/time4j/history/h;",
            ">;"
        }
    .end annotation
.end field

.field private final transient q:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Lnet/time4j/history/j;",
            ">;"
        }
    .end annotation
.end field

.field private final transient r:Lgj/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgj/t<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final transient s:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final transient t:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final transient u:Lgj/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgj/t<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final transient v:Lgj/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgj/t<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final transient w:Lgj/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgj/t<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final transient x:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final transient y:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    const-string v0, "YEAR_DEFINITION"

    .line 2
    .line 3
    const-class v1, Ljj/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lgj/a;->e(Ljava/lang/String;Ljava/lang/Class;)Lfj/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lnet/time4j/history/d;->z:Lfj/c;

    .line 10
    .line 11
    new-instance v0, Lnet/time4j/history/d;

    .line 12
    .line 13
    sget-object v1, Lkj/b;->l:Lkj/b;

    .line 14
    .line 15
    new-instance v2, Lnet/time4j/history/f;

    .line 16
    .line 17
    sget-object v3, Lnet/time4j/history/c;->k:Lnet/time4j/history/c;

    .line 18
    .line 19
    const-wide/high16 v4, -0x8000000000000000L

    .line 20
    .line 21
    invoke-direct {v2, v4, v5, v3, v3}, Lnet/time4j/history/f;-><init>(JLnet/time4j/history/c;Lnet/time4j/history/c;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {v0, v1, v2}, Lnet/time4j/history/d;-><init>(Lkj/b;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lnet/time4j/history/d;->A:Lnet/time4j/history/d;

    .line 32
    .line 33
    new-instance v0, Lnet/time4j/history/d;

    .line 34
    .line 35
    sget-object v1, Lkj/b;->k:Lkj/b;

    .line 36
    .line 37
    new-instance v2, Lnet/time4j/history/f;

    .line 38
    .line 39
    sget-object v6, Lnet/time4j/history/c;->l:Lnet/time4j/history/c;

    .line 40
    .line 41
    invoke-direct {v2, v4, v5, v6, v6}, Lnet/time4j/history/f;-><init>(JLnet/time4j/history/c;Lnet/time4j/history/c;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-direct {v0, v1, v2}, Lnet/time4j/history/d;-><init>(Lkj/b;Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lnet/time4j/history/d;->B:Lnet/time4j/history/d;

    .line 52
    .line 53
    new-instance v1, Lnet/time4j/history/d;

    .line 54
    .line 55
    sget-object v8, Lkj/b;->p:Lkj/b;

    .line 56
    .line 57
    new-instance v2, Lnet/time4j/history/f;

    .line 58
    .line 59
    invoke-direct {v2, v4, v5, v6, v6}, Lnet/time4j/history/f;-><init>(JLnet/time4j/history/c;Lnet/time4j/history/c;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    const/4 v10, 0x0

    .line 67
    new-instance v11, Lnet/time4j/history/o;

    .line 68
    .line 69
    sget-object v2, Lnet/time4j/history/n;->m:Lnet/time4j/history/n;

    .line 70
    .line 71
    const v4, 0x7fffffff

    .line 72
    .line 73
    .line 74
    invoke-direct {v11, v2, v4}, Lnet/time4j/history/o;-><init>(Lnet/time4j/history/n;I)V

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4}, Lfj/h0;->N()Lfj/k0;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    check-cast v4, Lnet/time4j/f0;

    .line 86
    .line 87
    invoke-static {v4}, Lnet/time4j/history/g;->c(Lnet/time4j/f0;)Lnet/time4j/history/g;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    move-object v7, v1

    .line 92
    invoke-direct/range {v7 .. v12}, Lnet/time4j/history/d;-><init>(Lkj/b;Ljava/util/List;Lnet/time4j/history/a;Lnet/time4j/history/o;Lnet/time4j/history/g;)V

    .line 93
    .line 94
    .line 95
    sput-object v1, Lnet/time4j/history/d;->C:Lnet/time4j/history/d;

    .line 96
    .line 97
    const/16 v1, 0xf

    .line 98
    .line 99
    const/16 v4, 0x62e

    .line 100
    .line 101
    const/16 v5, 0xa

    .line 102
    .line 103
    invoke-static {v4, v5, v1}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    sget-object v7, Lfj/a0;->m:Lfj/a0;

    .line 108
    .line 109
    invoke-virtual {v1, v7}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Ljava/lang/Long;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide v7

    .line 119
    sput-wide v7, Lnet/time4j/history/d;->D:J

    .line 120
    .line 121
    invoke-static {v7, v8}, Lnet/time4j/history/d;->F(J)Lnet/time4j/history/d;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    sput-object v1, Lnet/time4j/history/d;->E:Lnet/time4j/history/d;

    .line 126
    .line 127
    new-instance v1, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 130
    .line 131
    .line 132
    new-instance v7, Lnet/time4j/history/f;

    .line 133
    .line 134
    sget-object v8, Lnet/time4j/history/c;->m:Lnet/time4j/history/c;

    .line 135
    .line 136
    const-wide/32 v9, -0xe267

    .line 137
    .line 138
    .line 139
    invoke-direct {v7, v9, v10, v6, v8}, Lnet/time4j/history/f;-><init>(JLnet/time4j/history/c;Lnet/time4j/history/c;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    new-instance v7, Lnet/time4j/history/f;

    .line 146
    .line 147
    const-wide/32 v9, -0xd147

    .line 148
    .line 149
    .line 150
    invoke-direct {v7, v9, v10, v8, v6}, Lnet/time4j/history/f;-><init>(JLnet/time4j/history/c;Lnet/time4j/history/c;)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    new-instance v7, Lnet/time4j/history/f;

    .line 157
    .line 158
    const-wide/32 v8, -0x96d3

    .line 159
    .line 160
    .line 161
    invoke-direct {v7, v8, v9, v6, v3}, Lnet/time4j/history/f;-><init>(JLnet/time4j/history/c;Lnet/time4j/history/c;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    new-instance v3, Lnet/time4j/history/d;

    .line 168
    .line 169
    sget-object v6, Lkj/b;->m:Lkj/b;

    .line 170
    .line 171
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-direct {v3, v6, v1}, Lnet/time4j/history/d;-><init>(Lkj/b;Ljava/util/List;)V

    .line 176
    .line 177
    .line 178
    sput-object v3, Lnet/time4j/history/d;->F:Lnet/time4j/history/d;

    .line 179
    .line 180
    new-instance v1, Ljava/util/HashMap;

    .line 181
    .line 182
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 183
    .line 184
    .line 185
    sget-object v6, Lnet/time4j/history/j;->l:Lnet/time4j/history/j;

    .line 186
    .line 187
    const/16 v7, 0x3dc

    .line 188
    .line 189
    const/4 v8, 0x3

    .line 190
    const/4 v9, 0x1

    .line 191
    invoke-static {v6, v7, v8, v9}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    invoke-virtual {v0, v10}, Lnet/time4j/history/d;->d(Lnet/time4j/history/h;)Lnet/time4j/f0;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    const/16 v11, 0x566

    .line 200
    .line 201
    const/16 v12, 0xc

    .line 202
    .line 203
    const/16 v13, 0x18

    .line 204
    .line 205
    invoke-static {v6, v11, v12, v13}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    invoke-virtual {v0, v11}, Lnet/time4j/history/d;->d(Lnet/time4j/history/h;)Lnet/time4j/f0;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    const/16 v14, 0x58d

    .line 214
    .line 215
    invoke-static {v6, v14, v12, v13}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    invoke-virtual {v0, v13}, Lnet/time4j/history/d;->d(Lnet/time4j/history/h;)Lnet/time4j/f0;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    const/16 v14, 0x6a3

    .line 224
    .line 225
    const/16 v15, 0x1f

    .line 226
    .line 227
    invoke-static {v6, v14, v12, v15}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-virtual {v0, v6}, Lnet/time4j/history/d;->d(Lnet/time4j/history/h;)Lnet/time4j/f0;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {}, Lnet/time4j/history/d;->E()Lnet/time4j/history/d;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    sget-object v14, Lnet/time4j/history/n;->k:Lnet/time4j/history/n;

    .line 240
    .line 241
    const/16 v15, 0x567

    .line 242
    .line 243
    invoke-virtual {v14, v15}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 244
    .line 245
    .line 246
    move-result-object v15

    .line 247
    sget-object v7, Lnet/time4j/history/n;->n:Lnet/time4j/history/n;

    .line 248
    .line 249
    const/16 v8, 0x614

    .line 250
    .line 251
    invoke-virtual {v7, v8}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    invoke-virtual {v15, v9}, Lnet/time4j/history/o;->b(Lnet/time4j/history/o;)Lnet/time4j/history/o;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    invoke-virtual {v6, v9}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    invoke-static {v11}, Lnet/time4j/history/g;->f(Lnet/time4j/f0;)Lnet/time4j/history/g;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    invoke-virtual {v6, v9}, Lnet/time4j/history/d;->J(Lnet/time4j/history/g;)Lnet/time4j/history/d;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    const-string v9, "ES"

    .line 272
    .line 273
    invoke-interface {v1, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    invoke-static {}, Lnet/time4j/history/d;->E()Lnet/time4j/history/d;

    .line 277
    .line 278
    .line 279
    move-result-object v6

    .line 280
    const/16 v9, 0x58e

    .line 281
    .line 282
    invoke-virtual {v14, v9}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 283
    .line 284
    .line 285
    move-result-object v9

    .line 286
    invoke-virtual {v7, v8}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    invoke-virtual {v9, v8}, Lnet/time4j/history/o;->b(Lnet/time4j/history/o;)Lnet/time4j/history/o;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    invoke-virtual {v6, v8}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    invoke-static {v13}, Lnet/time4j/history/g;->f(Lnet/time4j/f0;)Lnet/time4j/history/g;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    invoke-virtual {v6, v8}, Lnet/time4j/history/d;->J(Lnet/time4j/history/g;)Lnet/time4j/history/d;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    const-string v8, "PT"

    .line 307
    .line 308
    invoke-interface {v1, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    const/16 v6, 0x14

    .line 312
    .line 313
    invoke-static {v4, v12, v6}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    invoke-static {v4}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    sget-object v6, Lnet/time4j/history/n;->o:Lnet/time4j/history/n;

    .line 322
    .line 323
    const/16 v8, 0x61f

    .line 324
    .line 325
    invoke-virtual {v6, v8}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    invoke-virtual {v4, v6}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    const-string v6, "FR"

    .line 334
    .line 335
    invoke-interface {v1, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    invoke-static {}, Lnet/time4j/history/d;->E()Lnet/time4j/history/d;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    const/16 v6, 0x608

    .line 343
    .line 344
    invoke-virtual {v7, v6}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 345
    .line 346
    .line 347
    move-result-object v8

    .line 348
    invoke-virtual {v4, v8}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    const-string v8, "DE"

    .line 353
    .line 354
    invoke-interface {v1, v8, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    const/16 v4, 0x10

    .line 358
    .line 359
    const/16 v8, 0x62f

    .line 360
    .line 361
    invoke-static {v8, v5, v4}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    invoke-static {v4}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    invoke-virtual {v7, v6}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    invoke-virtual {v4, v5}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    const-string v5, "DE-BAYERN"

    .line 378
    .line 379
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    const/16 v4, 0x64a

    .line 383
    .line 384
    const/16 v5, 0x9

    .line 385
    .line 386
    const/4 v6, 0x2

    .line 387
    invoke-static {v4, v5, v6}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    invoke-static {v4}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    const/16 v9, 0x617

    .line 396
    .line 397
    invoke-virtual {v7, v9}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 398
    .line 399
    .line 400
    move-result-object v11

    .line 401
    invoke-virtual {v4, v11}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    const-string v11, "DE-PREUSSEN"

    .line 406
    .line 407
    invoke-interface {v1, v11, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    const/16 v4, 0x6a4

    .line 411
    .line 412
    const/4 v11, 0x3

    .line 413
    const/4 v12, 0x1

    .line 414
    invoke-static {v4, v11, v12}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 415
    .line 416
    .line 417
    move-result-object v13

    .line 418
    invoke-static {v13}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 419
    .line 420
    .line 421
    move-result-object v11

    .line 422
    invoke-virtual {v7, v9}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 423
    .line 424
    .line 425
    move-result-object v9

    .line 426
    invoke-virtual {v11, v9}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 427
    .line 428
    .line 429
    move-result-object v9

    .line 430
    const-string v11, "DE-PROTESTANT"

    .line 431
    .line 432
    invoke-interface {v1, v11, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    invoke-static {v8, v12, v12}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 436
    .line 437
    .line 438
    move-result-object v9

    .line 439
    invoke-static {v9}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 440
    .line 441
    .line 442
    move-result-object v9

    .line 443
    const-string v11, "NL"

    .line 444
    .line 445
    invoke-interface {v1, v11, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    const/16 v9, 0x11

    .line 449
    .line 450
    const/16 v11, 0x630

    .line 451
    .line 452
    invoke-static {v11, v12, v9}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 453
    .line 454
    .line 455
    move-result-object v9

    .line 456
    invoke-static {v9}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 457
    .line 458
    .line 459
    move-result-object v9

    .line 460
    const-string v13, "AT"

    .line 461
    .line 462
    invoke-interface {v1, v13, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    const/16 v9, 0x16

    .line 466
    .line 467
    invoke-static {v11, v12, v9}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 468
    .line 469
    .line 470
    move-result-object v9

    .line 471
    invoke-static {v9}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 472
    .line 473
    .line 474
    move-result-object v9

    .line 475
    const-string v11, "CH"

    .line 476
    .line 477
    invoke-interface {v1, v11, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    const/16 v9, 0x633

    .line 481
    .line 482
    const/16 v11, 0xb

    .line 483
    .line 484
    invoke-static {v9, v11, v12}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 485
    .line 486
    .line 487
    move-result-object v9

    .line 488
    invoke-static {v9}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 489
    .line 490
    .line 491
    move-result-object v9

    .line 492
    const-string v11, "HU"

    .line 493
    .line 494
    invoke-interface {v1, v11, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    const/4 v9, 0x3

    .line 498
    invoke-static {v4, v9, v12}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 499
    .line 500
    .line 501
    move-result-object v11

    .line 502
    invoke-static {v11}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 503
    .line 504
    .line 505
    move-result-object v11

    .line 506
    sget-object v13, Lnet/time4j/history/n;->q:Lnet/time4j/history/n;

    .line 507
    .line 508
    const/16 v15, 0x657

    .line 509
    .line 510
    invoke-virtual {v13, v15}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 511
    .line 512
    .line 513
    move-result-object v6

    .line 514
    invoke-virtual {v11, v6}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 515
    .line 516
    .line 517
    move-result-object v6

    .line 518
    const-string v11, "DK"

    .line 519
    .line 520
    invoke-interface {v1, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    invoke-static {v4, v9, v12}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 524
    .line 525
    .line 526
    move-result-object v6

    .line 527
    invoke-static {v6}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 528
    .line 529
    .line 530
    move-result-object v6

    .line 531
    invoke-virtual {v13, v15}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 532
    .line 533
    .line 534
    move-result-object v9

    .line 535
    invoke-virtual {v6, v9}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    const-string v9, "NO"

    .line 540
    .line 541
    invoke-interface {v1, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    invoke-static {}, Lnet/time4j/history/d;->E()Lnet/time4j/history/d;

    .line 545
    .line 546
    .line 547
    move-result-object v6

    .line 548
    invoke-virtual {v7, v8}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 549
    .line 550
    .line 551
    move-result-object v8

    .line 552
    invoke-virtual {v6, v8}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 553
    .line 554
    .line 555
    move-result-object v6

    .line 556
    const-string v8, "IT"

    .line 557
    .line 558
    invoke-interface {v1, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    invoke-static {}, Lnet/time4j/history/d;->E()Lnet/time4j/history/d;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    const/16 v8, 0x6d5

    .line 566
    .line 567
    invoke-virtual {v13, v8}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 568
    .line 569
    .line 570
    move-result-object v9

    .line 571
    invoke-virtual {v6, v9}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 572
    .line 573
    .line 574
    move-result-object v6

    .line 575
    const-string v9, "IT-FLORENCE"

    .line 576
    .line 577
    invoke-interface {v1, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    invoke-static {}, Lnet/time4j/history/d;->E()Lnet/time4j/history/d;

    .line 581
    .line 582
    .line 583
    move-result-object v6

    .line 584
    sget-object v9, Lnet/time4j/history/n;->r:Lnet/time4j/history/n;

    .line 585
    .line 586
    invoke-virtual {v9, v8}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 587
    .line 588
    .line 589
    move-result-object v8

    .line 590
    invoke-virtual {v6, v8}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    const-string v8, "IT-PISA"

    .line 595
    .line 596
    invoke-interface {v1, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    invoke-static {}, Lnet/time4j/history/d;->E()Lnet/time4j/history/d;

    .line 600
    .line 601
    .line 602
    move-result-object v6

    .line 603
    sget-object v8, Lnet/time4j/history/n;->l:Lnet/time4j/history/n;

    .line 604
    .line 605
    const/16 v9, 0x706

    .line 606
    .line 607
    invoke-virtual {v8, v9}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 608
    .line 609
    .line 610
    move-result-object v9

    .line 611
    invoke-virtual {v6, v9}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 612
    .line 613
    .line 614
    move-result-object v6

    .line 615
    const-string v9, "IT-VENICE"

    .line 616
    .line 617
    invoke-interface {v1, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    const/16 v6, 0x6d8

    .line 621
    .line 622
    const/16 v9, 0xe

    .line 623
    .line 624
    invoke-static {v6, v5, v9}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 625
    .line 626
    .line 627
    move-result-object v11

    .line 628
    invoke-static {v11}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 629
    .line 630
    .line 631
    move-result-object v11

    .line 632
    const/16 v12, 0x43f

    .line 633
    .line 634
    invoke-virtual {v7, v12}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 635
    .line 636
    .line 637
    move-result-object v15

    .line 638
    const/16 v4, 0x483

    .line 639
    .line 640
    invoke-virtual {v14, v4}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 641
    .line 642
    .line 643
    move-result-object v12

    .line 644
    invoke-virtual {v15, v12}, Lnet/time4j/history/o;->b(Lnet/time4j/history/o;)Lnet/time4j/history/o;

    .line 645
    .line 646
    .line 647
    move-result-object v12

    .line 648
    invoke-virtual {v13, v6}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 649
    .line 650
    .line 651
    move-result-object v15

    .line 652
    invoke-virtual {v12, v15}, Lnet/time4j/history/o;->b(Lnet/time4j/history/o;)Lnet/time4j/history/o;

    .line 653
    .line 654
    .line 655
    move-result-object v12

    .line 656
    invoke-virtual {v11, v12}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 657
    .line 658
    .line 659
    move-result-object v11

    .line 660
    const-string v12, "GB"

    .line 661
    .line 662
    invoke-interface {v1, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    invoke-static {v6, v5, v9}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 666
    .line 667
    .line 668
    move-result-object v5

    .line 669
    invoke-static {v5}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 670
    .line 671
    .line 672
    move-result-object v5

    .line 673
    const/16 v6, 0x43f

    .line 674
    .line 675
    invoke-virtual {v7, v6}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 676
    .line 677
    .line 678
    move-result-object v6

    .line 679
    invoke-virtual {v14, v4}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 680
    .line 681
    .line 682
    move-result-object v4

    .line 683
    invoke-virtual {v6, v4}, Lnet/time4j/history/o;->b(Lnet/time4j/history/o;)Lnet/time4j/history/o;

    .line 684
    .line 685
    .line 686
    move-result-object v4

    .line 687
    const/16 v6, 0x640

    .line 688
    .line 689
    invoke-virtual {v13, v6}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 690
    .line 691
    .line 692
    move-result-object v6

    .line 693
    invoke-virtual {v4, v6}, Lnet/time4j/history/o;->b(Lnet/time4j/history/o;)Lnet/time4j/history/o;

    .line 694
    .line 695
    .line 696
    move-result-object v4

    .line 697
    invoke-virtual {v5, v4}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 698
    .line 699
    .line 700
    move-result-object v4

    .line 701
    const-string v5, "GB-SCT"

    .line 702
    .line 703
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    const/16 v4, 0x77e

    .line 707
    .line 708
    const/4 v5, 0x2

    .line 709
    invoke-static {v4, v5, v9}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 710
    .line 711
    .line 712
    move-result-object v4

    .line 713
    invoke-static {v4}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 714
    .line 715
    .line 716
    move-result-object v4

    .line 717
    const/16 v5, 0x3dc

    .line 718
    .line 719
    invoke-virtual {v14, v5}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 720
    .line 721
    .line 722
    move-result-object v5

    .line 723
    const/16 v6, 0x5d5

    .line 724
    .line 725
    invoke-virtual {v8, v6}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 726
    .line 727
    .line 728
    move-result-object v6

    .line 729
    invoke-virtual {v5, v6}, Lnet/time4j/history/o;->b(Lnet/time4j/history/o;)Lnet/time4j/history/o;

    .line 730
    .line 731
    .line 732
    move-result-object v5

    .line 733
    const/16 v6, 0x6a4

    .line 734
    .line 735
    invoke-virtual {v2, v6}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    invoke-virtual {v5, v2}, Lnet/time4j/history/o;->b(Lnet/time4j/history/o;)Lnet/time4j/history/o;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    invoke-virtual {v4, v2}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 744
    .line 745
    .line 746
    move-result-object v2

    .line 747
    invoke-static {v10, v0}, Lnet/time4j/history/g;->b(Lnet/time4j/f0;Lnet/time4j/f0;)Lnet/time4j/history/g;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-virtual {v2, v0}, Lnet/time4j/history/d;->J(Lnet/time4j/history/g;)Lnet/time4j/history/d;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    const-string v2, "RU"

    .line 756
    .line 757
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    const-string v0, "SE"

    .line 761
    .line 762
    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    sput-object v0, Lnet/time4j/history/d;->G:Ljava/util/Map;

    .line 770
    .line 771
    return-void
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
.end method

.method private constructor <init>(Lkj/b;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkj/b;",
            "Ljava/util/List<",
            "Lnet/time4j/history/f;",
            ">;)V"
        }
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1
    sget-object v5, Lnet/time4j/history/g;->d:Lnet/time4j/history/g;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lnet/time4j/history/d;-><init>(Lkj/b;Ljava/util/List;Lnet/time4j/history/a;Lnet/time4j/history/o;Lnet/time4j/history/g;)V

    return-void
.end method

.method private constructor <init>(Lkj/b;Ljava/util/List;Lnet/time4j/history/a;Lnet/time4j/history/o;Lnet/time4j/history/g;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkj/b;",
            "Ljava/util/List<",
            "Lnet/time4j/history/f;",
            ">;",
            "Lnet/time4j/history/a;",
            "Lnet/time4j/history/o;",
            "Lnet/time4j/history/g;",
            ")V"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    .line 2
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v0, :cond_1

    if-eqz v1, :cond_0

    .line 4
    iput-object v0, v6, Lnet/time4j/history/d;->k:Lkj/b;

    move-object/from16 v0, p2

    .line 5
    iput-object v0, v6, Lnet/time4j/history/d;->l:Ljava/util/List;

    move-object/from16 v0, p3

    .line 6
    iput-object v0, v6, Lnet/time4j/history/d;->m:Lnet/time4j/history/a;

    move-object/from16 v0, p4

    .line 7
    iput-object v0, v6, Lnet/time4j/history/d;->n:Lnet/time4j/history/o;

    .line 8
    iput-object v1, v6, Lnet/time4j/history/d;->o:Lnet/time4j/history/g;

    .line 9
    new-instance v7, Lnet/time4j/history/i;

    invoke-direct {v7, v6}, Lnet/time4j/history/i;-><init>(Lnet/time4j/history/d;)V

    iput-object v7, v6, Lnet/time4j/history/d;->p:Lfj/p;

    .line 10
    new-instance v8, Lnet/time4j/history/k;

    invoke-direct {v8, v6}, Lnet/time4j/history/k;-><init>(Lnet/time4j/history/d;)V

    iput-object v8, v6, Lnet/time4j/history/d;->q:Lfj/p;

    .line 11
    new-instance v9, Lnet/time4j/history/l;

    const/16 v1, 0x79

    const/4 v2, 0x1

    const v3, 0x3b9ac9ff

    const/4 v5, 0x2

    move-object v0, v9

    move-object/from16 v4, p0

    invoke-direct/range {v0 .. v5}, Lnet/time4j/history/l;-><init>(CIILnet/time4j/history/d;I)V

    iput-object v9, v6, Lnet/time4j/history/d;->r:Lgj/t;

    .line 12
    new-instance v10, Lnet/time4j/history/l;

    const/4 v1, 0x0

    const/4 v5, 0x6

    move-object v0, v10

    invoke-direct/range {v0 .. v5}, Lnet/time4j/history/l;-><init>(CIILnet/time4j/history/d;I)V

    iput-object v10, v6, Lnet/time4j/history/d;->s:Lfj/p;

    .line 13
    new-instance v11, Lnet/time4j/history/l;

    const/4 v5, 0x7

    move-object v0, v11

    invoke-direct/range {v0 .. v5}, Lnet/time4j/history/l;-><init>(CIILnet/time4j/history/d;I)V

    iput-object v11, v6, Lnet/time4j/history/d;->t:Lfj/p;

    .line 14
    new-instance v12, Lnet/time4j/history/l;

    const/16 v1, 0x4d

    const/16 v3, 0xc

    const/4 v5, 0x3

    move-object v0, v12

    invoke-direct/range {v0 .. v5}, Lnet/time4j/history/l;-><init>(CIILnet/time4j/history/d;I)V

    iput-object v12, v6, Lnet/time4j/history/d;->u:Lgj/t;

    .line 15
    new-instance v13, Lnet/time4j/history/l;

    const/16 v1, 0x64

    const/16 v3, 0x1f

    const/4 v5, 0x4

    move-object v0, v13

    invoke-direct/range {v0 .. v5}, Lnet/time4j/history/l;-><init>(CIILnet/time4j/history/d;I)V

    iput-object v13, v6, Lnet/time4j/history/d;->v:Lgj/t;

    .line 16
    new-instance v14, Lnet/time4j/history/l;

    const/16 v1, 0x44

    const/16 v3, 0x16d

    const/4 v5, 0x5

    move-object v0, v14

    invoke-direct/range {v0 .. v5}, Lnet/time4j/history/l;-><init>(CIILnet/time4j/history/d;I)V

    iput-object v14, v6, Lnet/time4j/history/d;->w:Lgj/t;

    .line 17
    new-instance v15, Lnet/time4j/history/l;

    const/4 v1, 0x0

    const v3, 0x989680

    const/16 v5, 0x8

    move-object v0, v15

    invoke-direct/range {v0 .. v5}, Lnet/time4j/history/l;-><init>(CIILnet/time4j/history/d;I)V

    iput-object v15, v6, Lnet/time4j/history/d;->x:Lfj/p;

    .line 18
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 19
    invoke-interface {v0, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 20
    invoke-interface {v0, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 21
    invoke-interface {v0, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    invoke-interface {v0, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 23
    invoke-interface {v0, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 24
    invoke-interface {v0, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    invoke-interface {v0, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    invoke-interface {v0, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 27
    invoke-interface {v0, v15}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 28
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, v6, Lnet/time4j/history/d;->y:Ljava/util/Set;

    return-void

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing era preference."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 30
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing historic variant."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 31
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "At least one cutover event must be present in chronological history."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private A(Lnet/time4j/history/h;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lnet/time4j/history/h;->f()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lnet/time4j/history/j;->a(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v1, Lnet/time4j/history/d;->C:Lnet/time4j/history/d;

    .line 14
    .line 15
    const v2, 0x3b9a79c9

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x1

    .line 20
    if-ne p0, v1, :cond_3

    .line 21
    .line 22
    const/16 v1, -0x1584

    .line 23
    .line 24
    if-lt v0, v1, :cond_1

    .line 25
    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/16 v1, 0x9

    .line 33
    .line 34
    if-lt p1, v1, :cond_1

    .line 35
    .line 36
    :cond_0
    if-le v0, v2, :cond_2

    .line 37
    .line 38
    :cond_1
    move v3, v4

    .line 39
    :cond_2
    return v3

    .line 40
    :cond_3
    sget-object p1, Lnet/time4j/history/d;->B:Lnet/time4j/history/d;

    .line 41
    .line 42
    if-ne p0, p1, :cond_5

    .line 43
    .line 44
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-le p1, v2, :cond_4

    .line 49
    .line 50
    move v3, v4

    .line 51
    :cond_4
    return v3

    .line 52
    :cond_5
    sget-object p1, Lnet/time4j/history/d;->A:Lnet/time4j/history/d;

    .line 53
    .line 54
    if-ne p0, p1, :cond_7

    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    const v0, 0x3b9ac9ff

    .line 61
    .line 62
    .line 63
    if-le p1, v0, :cond_6

    .line 64
    .line 65
    move v3, v4

    .line 66
    :cond_6
    return v3

    .line 67
    :cond_7
    const/16 p1, -0x2c

    .line 68
    .line 69
    if-lt v0, p1, :cond_8

    .line 70
    .line 71
    const/16 p1, 0x270f

    .line 72
    .line 73
    if-le v0, p1, :cond_9

    .line 74
    .line 75
    :cond_8
    move v3, v4

    .line 76
    :cond_9
    return v3
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

.method public static D(Ljava/util/Locale;)Lnet/time4j/history/d;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/util/Locale;->getVariant()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, "-"

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/Locale;->getVariant()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object p0, Lnet/time4j/history/d;->G:Ljava/util/Map;

    .line 40
    .line 41
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Lnet/time4j/history/d;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 p0, 0x0

    .line 49
    :goto_0
    if-nez p0, :cond_1

    .line 50
    .line 51
    sget-object p0, Lnet/time4j/history/d;->G:Ljava/util/Map;

    .line 52
    .line 53
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Lnet/time4j/history/d;

    .line 58
    .line 59
    :cond_1
    if-nez p0, :cond_2

    .line 60
    .line 61
    invoke-static {}, Lnet/time4j/history/d;->E()Lnet/time4j/history/d;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :cond_2
    return-object p0
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

.method public static E()Lnet/time4j/history/d;
    .locals 1

    sget-object v0, Lnet/time4j/history/d;->E:Lnet/time4j/history/d;

    return-object v0
.end method

.method private static F(J)Lnet/time4j/history/d;
    .locals 5

    .line 1
    new-instance v0, Lnet/time4j/history/d;

    .line 2
    .line 3
    sget-wide v1, Lnet/time4j/history/d;->D:J

    .line 4
    .line 5
    cmp-long v1, p0, v1

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Lkj/b;->n:Lkj/b;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v1, Lkj/b;->o:Lkj/b;

    .line 13
    .line 14
    :goto_0
    new-instance v2, Lnet/time4j/history/f;

    .line 15
    .line 16
    sget-object v3, Lnet/time4j/history/c;->l:Lnet/time4j/history/c;

    .line 17
    .line 18
    sget-object v4, Lnet/time4j/history/c;->k:Lnet/time4j/history/c;

    .line 19
    .line 20
    invoke-direct {v2, p0, p1, v3, v4}, Lnet/time4j/history/f;-><init>(JLnet/time4j/history/c;Lnet/time4j/history/c;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, v1, p0}, Lnet/time4j/history/d;-><init>(Lkj/b;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    return-object v0
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

.method public static G(Lnet/time4j/f0;)Lnet/time4j/history/d;
    .locals 4

    .line 1
    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lfj/h0;->N()Lfj/k0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lnet/time4j/f0;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object p0, Lnet/time4j/history/d;->B:Lnet/time4j/history/d;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lfj/h0;->O()Lfj/k0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Lnet/time4j/f0;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    sget-object p0, Lnet/time4j/history/d;->A:Lnet/time4j/history/d;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    sget-object v0, Lfj/a0;->m:Lfj/a0;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Ljava/lang/Long;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    invoke-static {v0, v1}, Lnet/time4j/history/d;->c(J)V

    .line 48
    .line 49
    .line 50
    sget-wide v2, Lnet/time4j/history/d;->D:J

    .line 51
    .line 52
    cmp-long p0, v0, v2

    .line 53
    .line 54
    if-nez p0, :cond_2

    .line 55
    .line 56
    sget-object p0, Lnet/time4j/history/d;->E:Lnet/time4j/history/d;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_2
    invoke-static {v0, v1}, Lnet/time4j/history/d;->F(J)Lnet/time4j/history/d;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
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

.method public static H()Lnet/time4j/history/d;
    .locals 1

    sget-object v0, Lnet/time4j/history/d;->F:Lnet/time4j/history/d;

    return-object v0
.end method

.method private static c(J)V
    .locals 2

    .line 1
    sget-wide v0, Lnet/time4j/history/d;->D:J

    .line 2
    .line 3
    cmp-long p0, p0, v0

    .line 4
    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string p1, "Gregorian calendar did not exist before 1582-10-15"

    .line 11
    .line 12
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p0
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

.method public static k(Ljava/lang/String;)Lnet/time4j/history/d;
    .locals 14

    .line 1
    const-string v0, "historic-"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    const/16 v0, 0x9

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ":"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    array-length v1, v0

    .line 22
    if-eqz v1, :cond_c

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    aget-object v2, v0, v1

    .line 26
    .line 27
    invoke-static {v2}, Lkj/b;->valueOf(Ljava/lang/String;)Lkj/b;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Lnet/time4j/history/d$a;->a:[I

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    aget v3, v3, v4

    .line 38
    .line 39
    const/4 v4, 0x2

    .line 40
    const/4 v5, 0x1

    .line 41
    packed-switch v3, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :pswitch_0
    invoke-static {v0, p0}, Lnet/time4j/history/d;->s([Ljava/lang/String;Ljava/lang/String;)Lnet/time4j/f0;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2}, Lnet/time4j/history/d;->G(Lnet/time4j/f0;)Lnet/time4j/history/d;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :goto_0
    move v3, v4

    .line 63
    goto :goto_1

    .line 64
    :pswitch_1
    invoke-static {v0, p0}, Lnet/time4j/history/d;->s([Ljava/lang/String;Ljava/lang/String;)Lnet/time4j/f0;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const/16 v3, 0xa

    .line 69
    .line 70
    const/16 v6, 0xf

    .line 71
    .line 72
    const/16 v7, 0x62e

    .line 73
    .line 74
    invoke-static {v7, v3, v6}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v2, v3}, Lnet/time4j/f0;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_0

    .line 83
    .line 84
    invoke-static {}, Lnet/time4j/history/d;->E()Lnet/time4j/history/d;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 90
    .line 91
    new-instance v1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v2, "Inconsistent cutover date: "

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v0

    .line 112
    :pswitch_2
    invoke-static {}, Lnet/time4j/history/d;->H()Lnet/time4j/history/d;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    move v3, v5

    .line 117
    :goto_1
    aget-object v6, v0, v3

    .line 118
    .line 119
    const-string v7, "="

    .line 120
    .line 121
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    aget-object v8, v6, v1

    .line 126
    .line 127
    const-string v9, "ancient-julian-leap-years"

    .line 128
    .line 129
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    const-string v9, ","

    .line 134
    .line 135
    if-eqz v8, :cond_2

    .line 136
    .line 137
    aget-object v6, v6, v5

    .line 138
    .line 139
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    sub-int/2addr v8, v5

    .line 144
    invoke-virtual {v6, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    if-nez v8, :cond_2

    .line 153
    .line 154
    invoke-virtual {v6, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    array-length v8, v6

    .line 159
    new-array v8, v8, [I

    .line 160
    .line 161
    move v10, v1

    .line 162
    :goto_2
    array-length v11, v6

    .line 163
    if-ge v10, v11, :cond_1

    .line 164
    .line 165
    aget-object v11, v6, v10

    .line 166
    .line 167
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    rsub-int/lit8 v11, v11, 0x1

    .line 172
    .line 173
    aput v11, v8, v10

    .line 174
    .line 175
    add-int/lit8 v10, v10, 0x1

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_1
    invoke-static {v8}, Lnet/time4j/history/a;->f([I)Lnet/time4j/history/a;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-virtual {v2, v6}, Lnet/time4j/history/d;->I(Lnet/time4j/history/a;)Lnet/time4j/history/d;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    :cond_2
    add-int/lit8 v6, v3, 0x1

    .line 187
    .line 188
    aget-object v6, v0, v6

    .line 189
    .line 190
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    aget-object v8, v6, v1

    .line 195
    .line 196
    const-string v10, "new-year-strategy"

    .line 197
    .line 198
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-eqz v8, :cond_7

    .line 203
    .line 204
    aget-object v6, v6, v5

    .line 205
    .line 206
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    sub-int/2addr v8, v5

    .line 211
    invoke-virtual {v6, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-virtual {v6, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    const/4 v8, 0x0

    .line 220
    move v10, v1

    .line 221
    :goto_3
    array-length v11, v6

    .line 222
    if-ge v10, v11, :cond_6

    .line 223
    .line 224
    aget-object v11, v6, v10

    .line 225
    .line 226
    const-string v12, "->"

    .line 227
    .line 228
    invoke-virtual {v11, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    aget-object v12, v11, v1

    .line 233
    .line 234
    invoke-static {v12}, Lnet/time4j/history/n;->valueOf(Ljava/lang/String;)Lnet/time4j/history/n;

    .line 235
    .line 236
    .line 237
    move-result-object v12

    .line 238
    array-length v13, v11

    .line 239
    if-ne v13, v4, :cond_3

    .line 240
    .line 241
    aget-object v11, v11, v5

    .line 242
    .line 243
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    goto :goto_4

    .line 248
    :cond_3
    const v11, 0x7fffffff

    .line 249
    .line 250
    .line 251
    :goto_4
    if-nez v8, :cond_5

    .line 252
    .line 253
    sget-object v13, Lnet/time4j/history/n;->k:Lnet/time4j/history/n;

    .line 254
    .line 255
    if-ne v12, v13, :cond_4

    .line 256
    .line 257
    const/16 v13, 0x237

    .line 258
    .line 259
    if-ne v11, v13, :cond_4

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_4
    invoke-virtual {v12, v11}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    goto :goto_5

    .line 267
    :cond_5
    invoke-virtual {v12, v11}, Lnet/time4j/history/n;->e(I)Lnet/time4j/history/o;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    invoke-virtual {v8, v11}, Lnet/time4j/history/o;->b(Lnet/time4j/history/o;)Lnet/time4j/history/o;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    :goto_5
    add-int/lit8 v10, v10, 0x1

    .line 276
    .line 277
    goto :goto_3

    .line 278
    :cond_6
    invoke-virtual {v2, v8}, Lnet/time4j/history/d;->K(Lnet/time4j/history/o;)Lnet/time4j/history/d;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    :cond_7
    add-int/2addr v3, v4

    .line 283
    aget-object v0, v0, v3

    .line 284
    .line 285
    invoke-virtual {v0, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    aget-object v3, v0, v1

    .line 290
    .line 291
    const-string v6, "era-preference"

    .line 292
    .line 293
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    if-eqz v3, :cond_b

    .line 298
    .line 299
    aget-object v0, v0, v5

    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    sub-int/2addr v3, v5

    .line 306
    invoke-virtual {v0, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    const-string v3, "default"

    .line 311
    .line 312
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    if-nez v3, :cond_b

    .line 317
    .line 318
    invoke-virtual {v0, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    :try_start_0
    aget-object v1, v0, v1

    .line 323
    .line 324
    const/4 v3, 0x5

    .line 325
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    invoke-static {v1}, Lnet/time4j/history/j;->valueOf(Ljava/lang/String;)Lnet/time4j/history/j;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    aget-object v6, v0, v5

    .line 334
    .line 335
    const/4 v7, 0x7

    .line 336
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    invoke-static {v6}, Lhj/l;->i(Ljava/lang/CharSequence;)Lnet/time4j/f0;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    aget-object v0, v0, v4

    .line 345
    .line 346
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v0}, Lhj/l;->i(Ljava/lang/CharSequence;)Lnet/time4j/f0;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    sget-object v3, Lnet/time4j/history/d$a;->b:[I

    .line 355
    .line 356
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    aget v1, v3, v1

    .line 361
    .line 362
    if-eq v1, v5, :cond_a

    .line 363
    .line 364
    if-eq v1, v4, :cond_9

    .line 365
    .line 366
    const/4 v3, 0x3

    .line 367
    if-ne v1, v3, :cond_8

    .line 368
    .line 369
    invoke-static {v6, v0}, Lnet/time4j/history/g;->a(Lnet/time4j/f0;Lnet/time4j/f0;)Lnet/time4j/history/g;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v2, v0}, Lnet/time4j/history/d;->J(Lnet/time4j/history/g;)Lnet/time4j/history/d;

    .line 374
    .line 375
    .line 376
    move-result-object p0

    .line 377
    goto :goto_6

    .line 378
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 379
    .line 380
    new-instance v1, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 383
    .line 384
    .line 385
    const-string v2, "BC/AD not allowed as era preference: "

    .line 386
    .line 387
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    throw v0

    .line 401
    :cond_9
    invoke-static {v6, v0}, Lnet/time4j/history/g;->b(Lnet/time4j/f0;Lnet/time4j/f0;)Lnet/time4j/history/g;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-virtual {v2, v0}, Lnet/time4j/history/d;->J(Lnet/time4j/history/g;)Lnet/time4j/history/d;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    goto :goto_6

    .line 410
    :cond_a
    invoke-static {v6, v0}, Lnet/time4j/history/g;->e(Lnet/time4j/f0;Lnet/time4j/f0;)Lnet/time4j/history/g;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-virtual {v2, v0}, Lnet/time4j/history/d;->J(Lnet/time4j/history/g;)Lnet/time4j/history/d;

    .line 415
    .line 416
    .line 417
    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 418
    :goto_6
    move-object v2, p0

    .line 419
    goto :goto_7

    .line 420
    :catch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 421
    .line 422
    new-instance v1, Ljava/lang/StringBuilder;

    .line 423
    .line 424
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 425
    .line 426
    .line 427
    const-string v2, "Invalid date syntax: "

    .line 428
    .line 429
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    throw v0

    .line 443
    :cond_b
    :goto_7
    return-object v2

    .line 444
    :pswitch_3
    sget-object p0, Lnet/time4j/history/d;->C:Lnet/time4j/history/d;

    .line 445
    .line 446
    return-object p0

    .line 447
    :pswitch_4
    sget-object p0, Lnet/time4j/history/d;->B:Lnet/time4j/history/d;

    .line 448
    .line 449
    return-object p0

    .line 450
    :pswitch_5
    sget-object p0, Lnet/time4j/history/d;->A:Lnet/time4j/history/d;

    .line 451
    .line 452
    return-object p0

    .line 453
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 454
    .line 455
    const-string v0, "Invalid variant description."

    .line 456
    .line 457
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    throw p0

    .line 461
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 462
    .line 463
    new-instance v1, Ljava/lang/StringBuilder;

    .line 464
    .line 465
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 466
    .line 467
    .line 468
    const-string v2, "Variant does not start with \"historic-\": "

    .line 469
    .line 470
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    throw v0

    .line 484
    nop

    .line 485
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Serialization proxy required."

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static s([Ljava/lang/String;Ljava/lang/String;)Lnet/time4j/f0;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    aget-object p0, p0, v0

    .line 3
    .line 4
    const-string v1, "="

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    array-length v1, p0

    .line 11
    const/4 v2, 0x2

    .line 12
    if-ne v1, v2, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    aget-object v1, p0, v1

    .line 16
    .line 17
    const-string v2, "cutover"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    :try_start_0
    sget-object v1, Lhj/l;->m:Lhj/c;

    .line 26
    .line 27
    aget-object p0, p0, v0

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Lhj/c;->F(Ljava/lang/CharSequence;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lnet/time4j/f0;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    return-object p0

    .line 36
    :catch_0
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v1, "Invalid cutover definition: "

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v1, "Invalid syntax in variant description: "

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p0
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

.method private u()Lnet/time4j/history/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/time4j/history/d;->m:Lnet/time4j/history/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lnet/time4j/history/a;->d()Lnet/time4j/history/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, Lnet/time4j/history/c;->l:Lnet/time4j/history/c;

    .line 11
    .line 12
    return-object v0
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
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lnet/time4j/history/SPX;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lnet/time4j/history/SPX;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method private static z(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-nez p0, :cond_1

    if-nez p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    :goto_0
    return p0
.end method


# virtual methods
.method public B(Lnet/time4j/history/h;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-direct {p0, p1}, Lnet/time4j/history/d;->A(Lnet/time4j/history/h;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Lnet/time4j/history/d;->l(Lnet/time4j/history/h;)Lnet/time4j/history/b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v1, p1}, Lnet/time4j/history/b;->c(Lnet/time4j/history/h;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    :cond_1
    :goto_0
    return v0
    .line 25
    .line 26
    .line 27
.end method

.method public C()Lgj/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgj/t<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/history/d;->u:Lgj/t;

    return-object v0
.end method

.method public I(Lnet/time4j/history/a;)Lnet/time4j/history/d;
    .locals 7

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/time4j/history/d;->y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Lnet/time4j/history/d;

    .line 11
    .line 12
    iget-object v2, p0, Lnet/time4j/history/d;->k:Lkj/b;

    .line 13
    .line 14
    iget-object v3, p0, Lnet/time4j/history/d;->l:Ljava/util/List;

    .line 15
    .line 16
    iget-object v5, p0, Lnet/time4j/history/d;->n:Lnet/time4j/history/o;

    .line 17
    .line 18
    iget-object v6, p0, Lnet/time4j/history/d;->o:Lnet/time4j/history/g;

    .line 19
    .line 20
    move-object v1, v0

    .line 21
    move-object v4, p1

    .line 22
    invoke-direct/range {v1 .. v6}, Lnet/time4j/history/d;-><init>(Lkj/b;Ljava/util/List;Lnet/time4j/history/a;Lnet/time4j/history/o;Lnet/time4j/history/g;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 27
    .line 28
    const-string v0, "Missing ancient julian leap years."

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1
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

.method public J(Lnet/time4j/history/g;)Lnet/time4j/history/d;
    .locals 7

    .line 1
    iget-object v0, p0, Lnet/time4j/history/d;->o:Lnet/time4j/history/g;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lnet/time4j/history/g;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lnet/time4j/history/d;->y()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Lnet/time4j/history/d;

    .line 17
    .line 18
    iget-object v2, p0, Lnet/time4j/history/d;->k:Lkj/b;

    .line 19
    .line 20
    iget-object v3, p0, Lnet/time4j/history/d;->l:Ljava/util/List;

    .line 21
    .line 22
    iget-object v4, p0, Lnet/time4j/history/d;->m:Lnet/time4j/history/a;

    .line 23
    .line 24
    iget-object v5, p0, Lnet/time4j/history/d;->n:Lnet/time4j/history/o;

    .line 25
    .line 26
    move-object v1, v0

    .line 27
    move-object v6, p1

    .line 28
    invoke-direct/range {v1 .. v6}, Lnet/time4j/history/d;-><init>(Lkj/b;Ljava/util/List;Lnet/time4j/history/a;Lnet/time4j/history/o;Lnet/time4j/history/g;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    :goto_0
    return-object p0
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

.method public K(Lnet/time4j/history/o;)Lnet/time4j/history/d;
    .locals 7

    .line 1
    sget-object v0, Lnet/time4j/history/o;->d:Lnet/time4j/history/o;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lnet/time4j/history/o;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lnet/time4j/history/d;->n:Lnet/time4j/history/o;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p1, Lnet/time4j/history/d;

    .line 15
    .line 16
    iget-object v1, p0, Lnet/time4j/history/d;->k:Lkj/b;

    .line 17
    .line 18
    iget-object v2, p0, Lnet/time4j/history/d;->l:Ljava/util/List;

    .line 19
    .line 20
    iget-object v3, p0, Lnet/time4j/history/d;->m:Lnet/time4j/history/a;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    iget-object v5, p0, Lnet/time4j/history/d;->o:Lnet/time4j/history/g;

    .line 24
    .line 25
    move-object v0, p1

    .line 26
    invoke-direct/range {v0 .. v5}, Lnet/time4j/history/d;-><init>(Lkj/b;Ljava/util/List;Lnet/time4j/history/a;Lnet/time4j/history/o;Lnet/time4j/history/g;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    invoke-virtual {p0}, Lnet/time4j/history/d;->y()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    new-instance v0, Lnet/time4j/history/d;

    .line 38
    .line 39
    iget-object v2, p0, Lnet/time4j/history/d;->k:Lkj/b;

    .line 40
    .line 41
    iget-object v3, p0, Lnet/time4j/history/d;->l:Ljava/util/List;

    .line 42
    .line 43
    iget-object v4, p0, Lnet/time4j/history/d;->m:Lnet/time4j/history/a;

    .line 44
    .line 45
    iget-object v6, p0, Lnet/time4j/history/d;->o:Lnet/time4j/history/g;

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    move-object v5, p1

    .line 49
    invoke-direct/range {v1 .. v6}, Lnet/time4j/history/d;-><init>(Lkj/b;Ljava/util/List;Lnet/time4j/history/a;Lnet/time4j/history/o;Lnet/time4j/history/g;)V

    .line 50
    .line 51
    .line 52
    return-object v0
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

.method public L(Ljj/a;)Lfj/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/a;",
            ")",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/history/d$a;->c:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lnet/time4j/history/d;->t:Lfj/p;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :cond_1
    iget-object p1, p0, Lnet/time4j/history/d;->s:Lfj/p;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_2
    iget-object p1, p0, Lnet/time4j/history/d;->r:Lgj/t;

    .line 35
    .line 36
    return-object p1
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

.method public M()Lgj/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgj/t<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/history/d;->r:Lgj/t;

    return-object v0
.end method

.method a(Lnet/time4j/history/h;)Lnet/time4j/history/h;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lnet/time4j/history/d;->l(Lnet/time4j/history/h;)Lnet/time4j/history/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    invoke-interface {v0, p1}, Lnet/time4j/history/b;->e(Lnet/time4j/history/h;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1}, Lnet/time4j/history/h;->b()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1}, Lnet/time4j/history/h;->f()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-static {v1, v2, p1, v0}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_1
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

.method public b()Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/history/d;->x:Lfj/p;

    return-object v0
.end method

.method public d(Lnet/time4j/history/h;)Lnet/time4j/f0;
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/history/d;->A(Lnet/time4j/history/h;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lnet/time4j/history/d;->l(Lnet/time4j/history/h;)Lnet/time4j/history/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lnet/time4j/history/b;->b(Lnet/time4j/history/h;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sget-object p1, Lfj/a0;->m:Lfj/a0;

    .line 18
    .line 19
    invoke-static {v0, v1, p1}, Lnet/time4j/f0;->Q0(JLfj/a0;)Lnet/time4j/f0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "Invalid historic date: "

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v2, "Out of supported range: "

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0
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

.method public e(Lnet/time4j/f0;)Lnet/time4j/history/h;
    .locals 6

    .line 1
    sget-object v0, Lfj/a0;->m:Lfj/a0;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Long;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-object v2, p0, Lnet/time4j/history/d;->l:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int/lit8 v2, v2, -0x1

    .line 20
    .line 21
    :goto_0
    if-ltz v2, :cond_1

    .line 22
    .line 23
    iget-object v3, p0, Lnet/time4j/history/d;->l:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lnet/time4j/history/f;

    .line 30
    .line 31
    iget-wide v4, v3, Lnet/time4j/history/f;->a:J

    .line 32
    .line 33
    cmp-long v4, v0, v4

    .line 34
    .line 35
    if-ltz v4, :cond_0

    .line 36
    .line 37
    iget-object v2, v3, Lnet/time4j/history/f;->b:Lnet/time4j/history/c;

    .line 38
    .line 39
    invoke-interface {v2, v0, v1}, Lnet/time4j/history/b;->a(J)Lnet/time4j/history/h;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v2, 0x0

    .line 48
    :goto_1
    if-nez v2, :cond_2

    .line 49
    .line 50
    invoke-direct {p0}, Lnet/time4j/history/d;->u()Lnet/time4j/history/b;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {v2, v0, v1}, Lnet/time4j/history/b;->a(J)Lnet/time4j/history/h;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :cond_2
    iget-object v0, p0, Lnet/time4j/history/d;->o:Lnet/time4j/history/g;

    .line 59
    .line 60
    invoke-virtual {v0, v2, p1}, Lnet/time4j/history/g;->d(Lnet/time4j/history/h;Lnet/time4j/f0;)Lnet/time4j/history/j;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v2}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-eq p1, v0, :cond_3

    .line 69
    .line 70
    invoke-virtual {v2}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v2}, Lnet/time4j/history/h;->f()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-virtual {p1, v0, v1}, Lnet/time4j/history/j;->b(Lnet/time4j/history/j;I)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {v2}, Lnet/time4j/history/h;->e()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-virtual {v2}, Lnet/time4j/history/h;->b()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-static {p1, v0, v1, v2}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    :cond_3
    invoke-direct {p0, v2}, Lnet/time4j/history/d;->A(Lnet/time4j/history/h;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    return-object v2

    .line 101
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 102
    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v1, "Out of supported range: "

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
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

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnet/time4j/history/d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    check-cast p1, Lnet/time4j/history/d;

    .line 11
    .line 12
    iget-object v1, p0, Lnet/time4j/history/d;->k:Lkj/b;

    .line 13
    .line 14
    iget-object v3, p1, Lnet/time4j/history/d;->k:Lkj/b;

    .line 15
    .line 16
    if-ne v1, v3, :cond_3

    .line 17
    .line 18
    iget-object v1, p0, Lnet/time4j/history/d;->m:Lnet/time4j/history/a;

    .line 19
    .line 20
    iget-object v3, p1, Lnet/time4j/history/d;->m:Lnet/time4j/history/a;

    .line 21
    .line 22
    invoke-static {v1, v3}, Lnet/time4j/history/d;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    iget-object v1, p0, Lnet/time4j/history/d;->n:Lnet/time4j/history/o;

    .line 29
    .line 30
    iget-object v3, p1, Lnet/time4j/history/d;->n:Lnet/time4j/history/o;

    .line 31
    .line 32
    invoke-static {v1, v3}, Lnet/time4j/history/d;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    iget-object v1, p0, Lnet/time4j/history/d;->o:Lnet/time4j/history/g;

    .line 39
    .line 40
    iget-object v3, p1, Lnet/time4j/history/d;->o:Lnet/time4j/history/g;

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Lnet/time4j/history/g;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    iget-object v1, p0, Lnet/time4j/history/d;->k:Lkj/b;

    .line 49
    .line 50
    sget-object v3, Lkj/b;->o:Lkj/b;

    .line 51
    .line 52
    if-ne v1, v3, :cond_2

    .line 53
    .line 54
    iget-object v1, p0, Lnet/time4j/history/d;->l:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lnet/time4j/history/f;

    .line 61
    .line 62
    iget-wide v3, v1, Lnet/time4j/history/f;->a:J

    .line 63
    .line 64
    iget-object p1, p1, Lnet/time4j/history/d;->l:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Lnet/time4j/history/f;

    .line 71
    .line 72
    iget-wide v5, p1, Lnet/time4j/history/f;->a:J

    .line 73
    .line 74
    cmp-long p1, v3, v5

    .line 75
    .line 76
    if-nez p1, :cond_1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    move v0, v2

    .line 80
    :cond_2
    :goto_0
    return v0

    .line 81
    :cond_3
    return v2
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

.method public f()Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "Lnet/time4j/history/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/history/d;->p:Lfj/p;

    return-object v0
.end method

.method public g()Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/history/d;->v:Lgj/t;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x40

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "historic-"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lnet/time4j/history/d;->k:Lkj/b;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    sget-object v1, Lnet/time4j/history/d$a;->a:[I

    .line 23
    .line 24
    iget-object v2, p0, Lnet/time4j/history/d;->k:Lkj/b;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    aget v1, v1, v2

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    if-eq v1, v2, :cond_3

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    if-eq v1, v3, :cond_3

    .line 37
    .line 38
    const/4 v3, 0x3

    .line 39
    if-eq v1, v3, :cond_3

    .line 40
    .line 41
    const/4 v3, 0x5

    .line 42
    if-eq v1, v3, :cond_0

    .line 43
    .line 44
    const/4 v3, 0x6

    .line 45
    if-eq v1, v3, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const-string v1, ":cutover="

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lnet/time4j/history/d;->r()Lnet/time4j/f0;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    :goto_0
    const-string v1, ":ancient-julian-leap-years="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lnet/time4j/history/d;->m:Lnet/time4j/history/a;

    .line 66
    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    invoke-virtual {v1}, Lnet/time4j/history/a;->e()[I

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const/16 v3, 0x5b

    .line 74
    .line 75
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    aget v3, v1, v3

    .line 80
    .line 81
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    :goto_1
    array-length v3, v1

    .line 85
    if-ge v2, v3, :cond_1

    .line 86
    .line 87
    const/16 v3, 0x2c

    .line 88
    .line 89
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    aget v3, v1, v2

    .line 93
    .line 94
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    const/16 v1, 0x5d

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_2
    const-string v1, "[]"

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    :goto_2
    const-string v1, ":new-year-strategy="

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lnet/time4j/history/d;->w()Lnet/time4j/history/o;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, ":era-preference="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lnet/time4j/history/d;->p()Lnet/time4j/history/g;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_3
    const-string v1, ":no-cutover"

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    :goto_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    return-object v0
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
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
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/time4j/history/d;->k:Lkj/b;

    .line 2
    .line 3
    sget-object v1, Lkj/b;->o:Lkj/b;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lnet/time4j/history/d;->l:Ljava/util/List;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lnet/time4j/history/f;

    .line 15
    .line 16
    iget-wide v0, v0, Lnet/time4j/history/f;->a:J

    .line 17
    .line 18
    const/16 v2, 0x20

    .line 19
    .line 20
    shl-long v2, v0, v2

    .line 21
    .line 22
    xor-long/2addr v0, v2

    .line 23
    long-to-int v0, v0

    .line 24
    return v0

    .line 25
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
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
.end method

.method public i()Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/history/d;->w:Lgj/t;

    return-object v0
.end method

.method public j()Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "Lnet/time4j/history/j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/history/d;->q:Lfj/p;

    return-object v0
.end method

.method l(Lnet/time4j/history/h;)Lnet/time4j/history/b;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/time4j/history/d;->l:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v0, :cond_2

    .line 10
    .line 11
    iget-object v1, p0, Lnet/time4j/history/d;->l:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lnet/time4j/history/f;

    .line 18
    .line 19
    iget-object v2, v1, Lnet/time4j/history/f;->c:Lnet/time4j/history/h;

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Lnet/time4j/history/h;->a(Lnet/time4j/history/h;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-ltz v2, :cond_0

    .line 26
    .line 27
    iget-object p1, v1, Lnet/time4j/history/f;->b:Lnet/time4j/history/c;

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    iget-object v1, v1, Lnet/time4j/history/f;->d:Lnet/time4j/history/h;

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Lnet/time4j/history/h;->a(Lnet/time4j/history/h;)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-lez v1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    return-object p1

    .line 40
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-direct {p0}, Lnet/time4j/history/d;->u()Lnet/time4j/history/b;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
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

.method public m()Lnet/time4j/history/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/time4j/history/d;->m:Lnet/time4j/history/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v1, "No historic julian leap years were defined."

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
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
.end method

.method public n(Lnet/time4j/history/j;I)Lnet/time4j/history/h;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lnet/time4j/history/d;->w()Lnet/time4j/history/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lnet/time4j/history/o;->d(Lnet/time4j/history/j;I)Lnet/time4j/history/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lnet/time4j/history/d;->B(Lnet/time4j/history/h;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lnet/time4j/history/d;->d(Lnet/time4j/history/h;)Lnet/time4j/f0;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget-object v1, p0, Lnet/time4j/history/d;->o:Lnet/time4j/history/g;

    .line 20
    .line 21
    invoke-virtual {v1, v0, p2}, Lnet/time4j/history/g;->d(Lnet/time4j/history/h;Lnet/time4j/f0;)Lnet/time4j/history/j;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-eq p2, p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0}, Lnet/time4j/history/h;->f()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {p2, p1, v1}, Lnet/time4j/history/j;->b(Lnet/time4j/history/j;I)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {v0}, Lnet/time4j/history/h;->e()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {v0}, Lnet/time4j/history/h;->b()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {p2, p1, v1, v0}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :cond_0
    return-object v0

    .line 52
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v2, "Cannot determine valid New Year: "

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p1, "-"

    .line 68
    .line 69
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v0
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

.method public o()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/history/d;->y:Ljava/util/Set;

    return-object v0
.end method

.method p()Lnet/time4j/history/g;
    .locals 1

    iget-object v0, p0, Lnet/time4j/history/d;->o:Lnet/time4j/history/g;

    return-object v0
.end method

.method q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnet/time4j/history/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/history/d;->l:Ljava/util/List;

    return-object v0
.end method

.method public r()Lnet/time4j/f0;
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/time4j/history/d;->l:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lnet/time4j/history/f;

    .line 14
    .line 15
    iget-wide v0, v0, Lnet/time4j/history/f;->a:J

    .line 16
    .line 17
    const-wide/high16 v2, -0x8000000000000000L

    .line 18
    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    sget-object v2, Lfj/a0;->m:Lfj/a0;

    .line 24
    .line 25
    invoke-static {v0, v1, v2}, Lnet/time4j/f0;->Q0(JLfj/a0;)Lnet/time4j/f0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 31
    .line 32
    const-string v1, "Proleptic history without any gregorian reform date."

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
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
.end method

.method t()Lkj/b;
    .locals 1

    iget-object v0, p0, Lnet/time4j/history/d;->k:Lkj/b;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChronoHistory["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lnet/time4j/history/d;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v(Lnet/time4j/history/j;I)I
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/time4j/history/d;->n:Lnet/time4j/history/o;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-static {p1, p2, v1, v1}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/16 v2, 0xc

    .line 11
    .line 12
    const/16 v3, 0x1f

    .line 13
    .line 14
    invoke-static {p1, p2, v2, v3}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {v0, p1, p2}, Lnet/time4j/history/o;->d(Lnet/time4j/history/j;I)Lnet/time4j/history/h;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v2, Lnet/time4j/history/j;->k:Lnet/time4j/history/j;

    .line 24
    .line 25
    if-ne p1, v2, :cond_2

    .line 26
    .line 27
    if-ne p2, v1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lnet/time4j/history/d;->n:Lnet/time4j/history/o;

    .line 30
    .line 31
    sget-object p2, Lnet/time4j/history/j;->l:Lnet/time4j/history/j;

    .line 32
    .line 33
    invoke-virtual {p1, p2, v1}, Lnet/time4j/history/o;->d(Lnet/time4j/history/j;I)Lnet/time4j/history/h;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v2, p0, Lnet/time4j/history/d;->n:Lnet/time4j/history/o;

    .line 39
    .line 40
    sub-int/2addr p2, v1

    .line 41
    invoke-virtual {v2, p1, p2}, Lnet/time4j/history/o;->d(Lnet/time4j/history/j;I)Lnet/time4j/history/h;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object v1, p0, Lnet/time4j/history/d;->n:Lnet/time4j/history/o;

    .line 47
    .line 48
    add-int/lit8 v2, p2, 0x1

    .line 49
    .line 50
    invoke-virtual {v1, p1, v2}, Lnet/time4j/history/o;->d(Lnet/time4j/history/j;I)Lnet/time4j/history/h;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    sget-object v2, Lnet/time4j/history/j;->n:Lnet/time4j/history/j;

    .line 55
    .line 56
    if-ne p1, v2, :cond_3

    .line 57
    .line 58
    iget-object v2, p0, Lnet/time4j/history/d;->n:Lnet/time4j/history/o;

    .line 59
    .line 60
    sget-object v3, Lnet/time4j/history/j;->l:Lnet/time4j/history/j;

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Lnet/time4j/history/j;->a(I)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-virtual {v2, v3, p1}, Lnet/time4j/history/o;->d(Lnet/time4j/history/j;I)Lnet/time4j/history/h;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1, v0}, Lnet/time4j/history/h;->a(Lnet/time4j/history/h;)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-lez p2, :cond_3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    move-object p1, v1

    .line 78
    :goto_0
    const/4 v1, 0x0

    .line 79
    :goto_1
    sget-object p2, Lnet/time4j/f;->r:Lnet/time4j/f;

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lnet/time4j/history/d;->d(Lnet/time4j/history/h;)Lnet/time4j/f0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p0, p1}, Lnet/time4j/history/d;->d(Lnet/time4j/history/h;)Lnet/time4j/f0;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p2, v0, p1}, Lnet/time4j/f;->c(Lfj/k0;Lfj/k0;)J

    .line 90
    .line 91
    .line 92
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    int-to-long v0, v1

    .line 94
    add-long/2addr p1, v0

    .line 95
    long-to-int p1, p1

    .line 96
    return p1

    .line 97
    :catch_0
    const/4 p1, -0x1

    .line 98
    return p1
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

.method public w()Lnet/time4j/history/o;
    .locals 1

    iget-object v0, p0, Lnet/time4j/history/d;->n:Lnet/time4j/history/o;

    if-nez v0, :cond_0

    sget-object v0, Lnet/time4j/history/o;->d:Lnet/time4j/history/o;

    :cond_0
    return-object v0
.end method

.method public x()Z
    .locals 1

    iget-object v0, p0, Lnet/time4j/history/d;->m:Lnet/time4j/history/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public y()Z
    .locals 5

    iget-object v0, p0, Lnet/time4j/history/d;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/time4j/history/f;

    iget-wide v0, v0, Lnet/time4j/history/f;->a:J

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v0, v0, v3

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method
