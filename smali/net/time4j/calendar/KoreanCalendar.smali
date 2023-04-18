.class public final Lnet/time4j/calendar/KoreanCalendar;
.super Lnet/time4j/calendar/f;
.source "SourceFile"

# interfaces
.implements Lgj/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/time4j/calendar/KoreanCalendar$SPX;,
        Lnet/time4j/calendar/KoreanCalendar$c;,
        Lnet/time4j/calendar/KoreanCalendar$f;,
        Lnet/time4j/calendar/KoreanCalendar$b;,
        Lnet/time4j/calendar/KoreanCalendar$d;,
        Lnet/time4j/calendar/KoreanCalendar$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/time4j/calendar/f<",
        "Lnet/time4j/calendar/KoreanCalendar$e;",
        "Lnet/time4j/calendar/KoreanCalendar;",
        ">;",
        "Lgj/h;"
    }
.end annotation

.annotation runtime Lgj/c;
    value = "dangi"
.end annotation


# static fields
.field public static final A:Lnet/time4j/calendar/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/calendar/q<",
            "Lnet/time4j/x0;",
            "Lnet/time4j/calendar/KoreanCalendar;",
            ">;"
        }
    .end annotation
.end field

.field private static final B:Lnet/time4j/calendar/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/calendar/r<",
            "Lnet/time4j/calendar/KoreanCalendar;",
            ">;"
        }
    .end annotation
.end field

.field public static final C:Lnet/time4j/calendar/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/calendar/l<",
            "Lnet/time4j/calendar/KoreanCalendar;",
            ">;"
        }
    .end annotation
.end field

.field private static final D:Lnet/time4j/calendar/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/calendar/d<",
            "Lnet/time4j/calendar/KoreanCalendar;",
            ">;"
        }
    .end annotation
.end field

.field private static final E:Lfj/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/h0<",
            "Lnet/time4j/calendar/KoreanCalendar$e;",
            "Lnet/time4j/calendar/KoreanCalendar;",
            ">;"
        }
    .end annotation
.end field

.field private static final q:[I

.field public static final r:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Lnet/time4j/calendar/k;",
            ">;"
        }
    .end annotation
.end field

.field public static final s:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x3b76d04e8c5dddb3L

.field public static final t:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final u:Lgj/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgj/t<",
            "Lnet/time4j/calendar/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final v:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Lnet/time4j/calendar/p;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Lgj/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgj/t<",
            "Lnet/time4j/calendar/h;",
            ">;"
        }
    .end annotation
.end field

.field public static final x:Lnet/time4j/calendar/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/calendar/q<",
            "Ljava/lang/Integer;",
            "Lnet/time4j/calendar/KoreanCalendar;",
            ">;"
        }
    .end annotation
.end field

.field public static final y:Lnet/time4j/calendar/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/calendar/q<",
            "Ljava/lang/Integer;",
            "Lnet/time4j/calendar/KoreanCalendar;",
            ">;"
        }
    .end annotation
.end field

.field public static final z:Lnet/time4j/calendar/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/calendar/q<",
            "Ljava/lang/Integer;",
            "Lnet/time4j/calendar/KoreanCalendar;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 28

    .line 1
    const/16 v0, 0x3e8

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lnet/time4j/calendar/KoreanCalendar;->q:[I

    .line 9
    .line 10
    sget-object v0, Lnet/time4j/calendar/k;->m:Lnet/time4j/calendar/k;

    .line 11
    .line 12
    invoke-virtual {v0}, Lnet/time4j/calendar/k;->a()Lfj/p;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sput-object v1, Lnet/time4j/calendar/KoreanCalendar;->r:Lfj/p;

    .line 17
    .line 18
    new-instance v10, Lnet/time4j/calendar/service/f;

    .line 19
    .line 20
    const-string v3, "CYCLE"

    .line 21
    .line 22
    const-class v4, Lnet/time4j/calendar/KoreanCalendar;

    .line 23
    .line 24
    const/16 v5, 0x48

    .line 25
    .line 26
    const/16 v6, 0x5e

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v9, 0x0

    .line 31
    move-object v2, v10

    .line 32
    invoke-direct/range {v2 .. v9}, Lnet/time4j/calendar/service/f;-><init>(Ljava/lang/String;Ljava/lang/Class;IICLfj/v;Lfj/v;)V

    .line 33
    .line 34
    .line 35
    sput-object v10, Lnet/time4j/calendar/KoreanCalendar;->s:Lfj/p;

    .line 36
    .line 37
    invoke-virtual {v0}, Lnet/time4j/calendar/k;->c()Lfj/p;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lnet/time4j/calendar/KoreanCalendar;->t:Lfj/p;

    .line 42
    .line 43
    sget-object v2, Lnet/time4j/calendar/e;->k:Lnet/time4j/calendar/e;

    .line 44
    .line 45
    sput-object v2, Lnet/time4j/calendar/KoreanCalendar;->u:Lgj/t;

    .line 46
    .line 47
    invoke-static {}, Lnet/time4j/calendar/i;->u()Lnet/time4j/calendar/i;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    sput-object v3, Lnet/time4j/calendar/KoreanCalendar;->v:Lfj/p;

    .line 52
    .line 53
    sget-object v4, Lnet/time4j/calendar/g;->k:Lnet/time4j/calendar/g;

    .line 54
    .line 55
    sput-object v4, Lnet/time4j/calendar/KoreanCalendar;->w:Lgj/t;

    .line 56
    .line 57
    new-instance v5, Lnet/time4j/calendar/service/f;

    .line 58
    .line 59
    const-string v12, "MONTH_AS_ORDINAL"

    .line 60
    .line 61
    const-class v13, Lnet/time4j/calendar/KoreanCalendar;

    .line 62
    .line 63
    const/4 v14, 0x1

    .line 64
    const/16 v15, 0xc

    .line 65
    .line 66
    const/16 v16, 0x0

    .line 67
    .line 68
    const/16 v17, 0x0

    .line 69
    .line 70
    const/16 v18, 0x0

    .line 71
    .line 72
    move-object v11, v5

    .line 73
    invoke-direct/range {v11 .. v18}, Lnet/time4j/calendar/service/f;-><init>(Ljava/lang/String;Ljava/lang/Class;IICLfj/v;Lfj/v;)V

    .line 74
    .line 75
    .line 76
    sput-object v5, Lnet/time4j/calendar/KoreanCalendar;->x:Lnet/time4j/calendar/q;

    .line 77
    .line 78
    new-instance v6, Lnet/time4j/calendar/service/f;

    .line 79
    .line 80
    const-string v20, "DAY_OF_MONTH"

    .line 81
    .line 82
    const-class v21, Lnet/time4j/calendar/KoreanCalendar;

    .line 83
    .line 84
    const/16 v22, 0x1

    .line 85
    .line 86
    const/16 v23, 0x1e

    .line 87
    .line 88
    const/16 v24, 0x64

    .line 89
    .line 90
    move-object/from16 v19, v6

    .line 91
    .line 92
    invoke-direct/range {v19 .. v24}, Lnet/time4j/calendar/service/f;-><init>(Ljava/lang/String;Ljava/lang/Class;IIC)V

    .line 93
    .line 94
    .line 95
    sput-object v6, Lnet/time4j/calendar/KoreanCalendar;->y:Lnet/time4j/calendar/q;

    .line 96
    .line 97
    new-instance v7, Lnet/time4j/calendar/service/f;

    .line 98
    .line 99
    const-string v12, "DAY_OF_YEAR"

    .line 100
    .line 101
    const-class v13, Lnet/time4j/calendar/KoreanCalendar;

    .line 102
    .line 103
    const/16 v15, 0x163

    .line 104
    .line 105
    const/16 v16, 0x44

    .line 106
    .line 107
    move-object v11, v7

    .line 108
    invoke-direct/range {v11 .. v16}, Lnet/time4j/calendar/service/f;-><init>(Ljava/lang/String;Ljava/lang/Class;IIC)V

    .line 109
    .line 110
    .line 111
    sput-object v7, Lnet/time4j/calendar/KoreanCalendar;->z:Lnet/time4j/calendar/q;

    .line 112
    .line 113
    new-instance v8, Lnet/time4j/calendar/service/g;

    .line 114
    .line 115
    invoke-static {}, Lnet/time4j/calendar/KoreanCalendar;->o0()Lnet/time4j/z0;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    const-class v11, Lnet/time4j/calendar/KoreanCalendar;

    .line 120
    .line 121
    invoke-direct {v8, v11, v9}, Lnet/time4j/calendar/service/g;-><init>(Ljava/lang/Class;Lnet/time4j/z0;)V

    .line 122
    .line 123
    .line 124
    sput-object v8, Lnet/time4j/calendar/KoreanCalendar;->A:Lnet/time4j/calendar/q;

    .line 125
    .line 126
    new-instance v9, Lnet/time4j/calendar/r;

    .line 127
    .line 128
    invoke-direct {v9, v11, v6, v8}, Lnet/time4j/calendar/r;-><init>(Ljava/lang/Class;Lfj/p;Lfj/p;)V

    .line 129
    .line 130
    .line 131
    sput-object v9, Lnet/time4j/calendar/KoreanCalendar;->B:Lnet/time4j/calendar/r;

    .line 132
    .line 133
    sput-object v9, Lnet/time4j/calendar/KoreanCalendar;->C:Lnet/time4j/calendar/l;

    .line 134
    .line 135
    new-instance v12, Lnet/time4j/calendar/KoreanCalendar$d;

    .line 136
    .line 137
    const/4 v13, 0x0

    .line 138
    invoke-direct {v12, v13}, Lnet/time4j/calendar/KoreanCalendar$d;-><init>(Lnet/time4j/calendar/KoreanCalendar$a;)V

    .line 139
    .line 140
    .line 141
    sput-object v12, Lnet/time4j/calendar/KoreanCalendar;->D:Lnet/time4j/calendar/d;

    .line 142
    .line 143
    new-instance v14, Lnet/time4j/calendar/KoreanCalendar$c;

    .line 144
    .line 145
    invoke-direct {v14}, Lnet/time4j/calendar/KoreanCalendar$c;-><init>()V

    .line 146
    .line 147
    .line 148
    const-class v15, Lnet/time4j/calendar/KoreanCalendar$e;

    .line 149
    .line 150
    invoke-static {v15, v11, v14, v12}, Lfj/h0$b;->j(Ljava/lang/Class;Ljava/lang/Class;Lfj/u;Lfj/k;)Lfj/h0$b;

    .line 151
    .line 152
    .line 153
    move-result-object v14

    .line 154
    new-instance v15, Lnet/time4j/calendar/KoreanCalendar$b;

    .line 155
    .line 156
    invoke-direct {v15, v13}, Lnet/time4j/calendar/KoreanCalendar$b;-><init>(Lnet/time4j/calendar/KoreanCalendar$a;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v14, v1, v15}, Lfj/h0$b;->d(Lfj/p;Lfj/z;)Lfj/h0$b;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v2}, Lnet/time4j/calendar/f;->a0(Lfj/p;)Lfj/z;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    invoke-virtual {v1, v10, v14}, Lfj/h0$b;->d(Lfj/p;Lfj/z;)Lfj/h0$b;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    new-instance v10, Lnet/time4j/calendar/KoreanCalendar$f;

    .line 172
    .line 173
    invoke-direct {v10, v13}, Lnet/time4j/calendar/KoreanCalendar$f;-><init>(Lnet/time4j/calendar/KoreanCalendar$a;)V

    .line 174
    .line 175
    .line 176
    sget-object v15, Lnet/time4j/calendar/KoreanCalendar$e;->m:Lnet/time4j/calendar/KoreanCalendar$e;

    .line 177
    .line 178
    invoke-virtual {v1, v0, v10, v15}, Lfj/h0$b;->e(Lfj/p;Lfj/z;Ljava/lang/Object;)Lfj/h0$b;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v4}, Lnet/time4j/calendar/f;->k0(Lfj/p;)Lfj/z;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v0, v2, v1, v15}, Lfj/h0$b;->e(Lfj/p;Lfj/z;Ljava/lang/Object;)Lfj/h0$b;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {}, Lnet/time4j/calendar/i;->u()Lnet/time4j/calendar/i;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v0, v3, v1}, Lfj/h0$b;->d(Lfj/p;Lfj/z;)Lfj/h0$b;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v6}, Lnet/time4j/calendar/f;->h0(Lfj/p;)Lfj/z;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    sget-object v2, Lnet/time4j/calendar/KoreanCalendar$e;->n:Lnet/time4j/calendar/KoreanCalendar$e;

    .line 203
    .line 204
    invoke-virtual {v0, v4, v1, v2}, Lfj/h0$b;->e(Lfj/p;Lfj/z;Ljava/lang/Object;)Lfj/h0$b;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v6}, Lnet/time4j/calendar/f;->g0(Lfj/p;)Lfj/z;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {v0, v5, v1, v2}, Lfj/h0$b;->e(Lfj/p;Lfj/z;Ljava/lang/Object;)Lfj/h0$b;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-static {}, Lnet/time4j/calendar/f;->b0()Lfj/z;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    sget-object v3, Lnet/time4j/calendar/KoreanCalendar$e;->p:Lnet/time4j/calendar/KoreanCalendar$e;

    .line 221
    .line 222
    invoke-virtual {v0, v6, v1, v3}, Lfj/h0$b;->e(Lfj/p;Lfj/z;Ljava/lang/Object;)Lfj/h0$b;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {}, Lnet/time4j/calendar/f;->d0()Lfj/z;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v0, v7, v1, v3}, Lfj/h0$b;->e(Lfj/p;Lfj/z;Ljava/lang/Object;)Lfj/h0$b;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    new-instance v1, Lnet/time4j/calendar/s;

    .line 235
    .line 236
    invoke-static {}, Lnet/time4j/calendar/KoreanCalendar;->o0()Lnet/time4j/z0;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    new-instance v5, Lnet/time4j/calendar/KoreanCalendar$a;

    .line 241
    .line 242
    invoke-direct {v5}, Lnet/time4j/calendar/KoreanCalendar$a;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-direct {v1, v4, v5}, Lnet/time4j/calendar/s;-><init>(Lnet/time4j/z0;Lfj/t;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v8, v1, v3}, Lfj/h0$b;->e(Lfj/p;Lfj/z;Ljava/lang/Object;)Lfj/h0$b;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-static {v9}, Lnet/time4j/calendar/r;->D(Lnet/time4j/calendar/r;)Lfj/z;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-virtual {v0, v9, v1}, Lfj/h0$b;->d(Lfj/p;Lfj/z;)Lfj/h0$b;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    sget-object v1, Lnet/time4j/calendar/b;->a:Lfj/p;

    .line 261
    .line 262
    new-instance v4, Lnet/time4j/calendar/n;

    .line 263
    .line 264
    invoke-direct {v4, v12, v7}, Lnet/time4j/calendar/n;-><init>(Lfj/k;Lfj/p;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v1, v4}, Lfj/h0$b;->d(Lfj/p;Lfj/z;)Lfj/h0$b;

    .line 268
    .line 269
    .line 270
    move-result-object v16

    .line 271
    sget-object v0, Lnet/time4j/calendar/KoreanCalendar$e;->l:Lnet/time4j/calendar/KoreanCalendar$e;

    .line 272
    .line 273
    const/4 v1, 0x0

    .line 274
    invoke-static {v1}, Lnet/time4j/calendar/f;->i0(I)Lfj/m0;

    .line 275
    .line 276
    .line 277
    move-result-object v18

    .line 278
    invoke-virtual {v0}, Lnet/time4j/calendar/KoreanCalendar$e;->getLength()D

    .line 279
    .line 280
    .line 281
    move-result-wide v19

    .line 282
    invoke-static {v15}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 283
    .line 284
    .line 285
    move-result-object v21

    .line 286
    move-object/from16 v17, v0

    .line 287
    .line 288
    invoke-virtual/range {v16 .. v21}, Lfj/h0$b;->g(Ljava/lang/Object;Lfj/m0;DLjava/util/Set;)Lfj/h0$b;

    .line 289
    .line 290
    .line 291
    move-result-object v14

    .line 292
    const/4 v1, 0x1

    .line 293
    invoke-static {v1}, Lnet/time4j/calendar/f;->i0(I)Lfj/m0;

    .line 294
    .line 295
    .line 296
    move-result-object v16

    .line 297
    invoke-virtual {v15}, Lnet/time4j/calendar/KoreanCalendar$e;->getLength()D

    .line 298
    .line 299
    .line 300
    move-result-wide v17

    .line 301
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 302
    .line 303
    .line 304
    move-result-object v19

    .line 305
    invoke-virtual/range {v14 .. v19}, Lfj/h0$b;->g(Ljava/lang/Object;Lfj/m0;DLjava/util/Set;)Lfj/h0$b;

    .line 306
    .line 307
    .line 308
    move-result-object v16

    .line 309
    const/4 v0, 0x2

    .line 310
    invoke-static {v0}, Lnet/time4j/calendar/f;->i0(I)Lfj/m0;

    .line 311
    .line 312
    .line 313
    move-result-object v18

    .line 314
    invoke-virtual {v2}, Lnet/time4j/calendar/KoreanCalendar$e;->getLength()D

    .line 315
    .line 316
    .line 317
    move-result-wide v19

    .line 318
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    .line 319
    .line 320
    .line 321
    move-result-object v21

    .line 322
    move-object/from16 v17, v2

    .line 323
    .line 324
    invoke-virtual/range {v16 .. v21}, Lfj/h0$b;->g(Ljava/lang/Object;Lfj/m0;DLjava/util/Set;)Lfj/h0$b;

    .line 325
    .line 326
    .line 327
    move-result-object v22

    .line 328
    sget-object v0, Lnet/time4j/calendar/KoreanCalendar$e;->o:Lnet/time4j/calendar/KoreanCalendar$e;

    .line 329
    .line 330
    const/4 v1, 0x3

    .line 331
    invoke-static {v1}, Lnet/time4j/calendar/f;->i0(I)Lfj/m0;

    .line 332
    .line 333
    .line 334
    move-result-object v24

    .line 335
    invoke-virtual {v0}, Lnet/time4j/calendar/KoreanCalendar$e;->getLength()D

    .line 336
    .line 337
    .line 338
    move-result-wide v25

    .line 339
    invoke-static {v3}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 340
    .line 341
    .line 342
    move-result-object v27

    .line 343
    move-object/from16 v23, v0

    .line 344
    .line 345
    invoke-virtual/range {v22 .. v27}, Lfj/h0$b;->g(Ljava/lang/Object;Lfj/m0;DLjava/util/Set;)Lfj/h0$b;

    .line 346
    .line 347
    .line 348
    move-result-object v16

    .line 349
    const/4 v1, 0x4

    .line 350
    invoke-static {v1}, Lnet/time4j/calendar/f;->i0(I)Lfj/m0;

    .line 351
    .line 352
    .line 353
    move-result-object v18

    .line 354
    invoke-virtual {v3}, Lnet/time4j/calendar/KoreanCalendar$e;->getLength()D

    .line 355
    .line 356
    .line 357
    move-result-wide v19

    .line 358
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 359
    .line 360
    .line 361
    move-result-object v21

    .line 362
    move-object/from16 v17, v3

    .line 363
    .line 364
    invoke-virtual/range {v16 .. v21}, Lfj/h0$b;->g(Ljava/lang/Object;Lfj/m0;DLjava/util/Set;)Lfj/h0$b;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    new-instance v1, Lnet/time4j/calendar/b$g;

    .line 369
    .line 370
    invoke-static {}, Lnet/time4j/calendar/KoreanCalendar;->o0()Lnet/time4j/z0;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-direct {v1, v11, v6, v7, v2}, Lnet/time4j/calendar/b$g;-><init>(Ljava/lang/Class;Lfj/p;Lfj/p;Lnet/time4j/z0;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v1}, Lfj/h0$b;->f(Lfj/s;)Lfj/h0$b;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v0}, Lfj/h0$b;->h()Lfj/h0;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    sput-object v0, Lnet/time4j/calendar/KoreanCalendar;->E:Lfj/h0;

    .line 386
    .line 387
    return-void

    .line 388
    nop

    .line 389
    :array_0
    .array-data 4
        0x10b9
        0x5
        0x10bc
        0x4
        0x10bf
        0x1
        0x10c1
        0x6
        0x10c4
        0x5
        0x10c7
        0x3
        0x10c9
        0x7
        0x10cc
        0x6
        0x10cf
        0x4
        0x10d2
        0x2
        0x10d4
        0x7
        0x10d7
        0x5
        0x10da
        0x3
        0x10dc
        0x8
        0x10df
        0x6
        0x10e2
        0x4
        0x10e5
        0x3
        0x10e7
        0x7
        0x10ea
        0x5
        0x10ed
        0x3
        0x10ef
        0x7
        0x10f2
        0x6
        0x10f5
        0x4
        0x10f8
        0x3
        0x10fa
        0x7
        0x10fd
        0x5
        0x1100
        0x3
        0x1102
        0x8
        0x1105
        0x6
        0x1108
        0x4
        0x110b
        0x2
        0x110d
        0x7
        0x1110
        0x5
        0x1113
        0x3
        0x1115
        0x9
        0x1118
        0x6
        0x111b
        0x4
        0x111e
        0x3
        0x1120
        0x7
        0x1123
        0x5
        0x1126
        0x4
        0x1128
        0x9
        0x112b
        0x6
        0x112e
        0x5
        0x1131
        0x2
        0x1133
        0x7
        0x1136
        0x5
        0x1139
        0x3
        0x113b
        0xa
        0x113e
        0x6
        0x1141
        0x5
        0x1144
        0x3
        0x1146
        0x7
        0x1149
        0x6
        0x114c
        0x4
        0x114f
        0x2
        0x1151
        0x6
        0x1154
        0x4
        0x1157
        0x3
        0x1159
        0x6
        0x115c
        0x5
        0x115f
        0x3
        0x1162
        0x2
        0x1164
        0x6
        0x1167
        0x4
        0x116a
        0x3
        0x116c
        0x7
        0x116f
        0x5
        0x1172
        0x4
        0x1174
        0x9
        0x1177
        0x6
        0x117a
        0x4
        0x117d
        0x3
        0x117f
        0x7
        0x1182
        0x5
        0x1185
        0x4
        0x1187
        0xb
        0x118a
        0x7
        0x118d
        0x5
        0x1190
        0x3
        0x1192
        0x8
        0x1195
        0x5
        0x1198
        0x4
        0x119a
        0xa
        0x119d
        0x6
        0x11a0
        0x5
        0x11a3
        0x3
        0x11a5
        0x7
        0x11a8
        0x5
        0x11ab
        0x4
        0x11ad
        0xc
        0x11b0
        0x6
        0x11b3
        0x5
        0x11b6
        0x3
        0x11b8
        0x8
        0x11bb
        0x5
        0x11be
        0x4
        0x11c1
        0x2
        0x11c3
        0x6
        0x11c6
        0x5
        0x11c9
        0x2
        0x11cb
        0x7
        0x11ce
        0x5
        0x11d1
        0x4
        0x11d4
        0x2
        0x11d6
        0x6
        0x11d9
        0x5
        0x11dc
        0x3
        0x11de
        0x7
        0x11e1
        0x6
        0x11e4
        0x4
        0x11e7
        0x2
        0x11e9
        0x7
        0x11ec
        0x5
        0x11ef
        0x3
        0x11f1
        0x8
        0x11f4
        0x6
        0x11f7
        0x4
        0x11fa
        0x3
        0x11fc
        0x7
        0x11ff
        0x5
        0x1202
        0x4
        0x1204
        0x8
        0x1207
        0x6
        0x120a
        0x4
        0x120c
        0xa
        0x120f
        0x6
        0x1212
        0x5
        0x1215
        0x3
        0x1217
        0x8
        0x121a
        0x5
        0x121d
        0x4
        0x1220
        0x2
        0x1222
        0x7
        0x1225
        0x5
        0x1228
        0x3
        0x122a
        0x9
        0x122d
        0x5
        0x1230
        0x4
        0x1233
        0x2
        0x1235
        0x6
        0x1238
        0x5
        0x123b
        0x3
        0x123d
        0xb
        0x1240
        0x6
        0x1243
        0x5
        0x1246
        0x2
        0x1248
        0x7
        0x124b
        0x5
        0x124e
        0x3
        0x1250
        0x8
        0x1253
        0x6
        0x1256
        0x4
        0x1259
        0x3
        0x125b
        0x7
        0x125e
        0x5
        0x1261
        0x4
        0x1263
        0x8
        0x1266
        0x6
        0x1269
        0x4
        0x126c
        0x3
        0x126e
        0x7
        0x1271
        0x5
        0x1274
        0x4
        0x1276
        0x8
        0x1279
        0x6
        0x127c
        0x4
        0x127f
        0x3
        0x1281
        0x7
        0x1284
        0x5
        0x1287
        0x4
        0x1289
        0x9
        0x128c
        0x6
        0x128f
        0x4
        0x1292
        0x3
        0x1294
        0x7
        0x1297
        0x5
        0x129a
        0x4
        0x129c
        0x9
        0x129f
        0x6
        0x12a2
        0x5
        0x12a5
        0x2
        0x12a7
        0x7
        0x12aa
        0x5
        0x12ad
        0x4
        0x12af
        0xb
        0x12b2
        0x6
        0x12b5
        0x5
        0x12b8
        0x3
        0x12ba
        0x7
        0x12bd
        0x6
        0x12c0
        0x4
        0x12c2
        0xa
        0x12c5
        0x6
        0x12c8
        0x4
        0x12cb
        0x3
        0x12cd
        0x7
        0x12d0
        0x6
        0x12d3
        0x4
        0x12d6
        0x2
        0x12d8
        0x7
        0x12db
        0x5
        0x12de
        0x3
        0x12e0
        0x7
        0x12e3
        0x6
        0x12e6
        0x4
        0x12e8
        0x9
        0x12eb
        0x6
        0x12ee
        0x4
        0x12f1
        0x3
        0x12f3
        0x7
        0x12f6
        0x5
        0x12f9
        0x4
        0x12fb
        0x9
        0x12fe
        0x7
        0x1301
        0x5
        0x1304
        0x3
        0x1306
        0x8
        0x1309
        0x5
        0x130c
        0x4
        0x130e
        0xb
        0x1311
        0x6
        0x1314
        0x5
        0x1317
        0x3
        0x1319
        0x8
        0x131c
        0x6
        0x131f
        0x4
        0x1322
        0x1
        0x1324
        0x6
        0x1327
        0x5
        0x132a
        0x3
        0x132c
        0x8
        0x132f
        0x6
        0x1332
        0x4
        0x1335
        0x2
        0x1337
        0x6
        0x133a
        0x5
        0x133d
        0x3
        0x133f
        0x7
        0x1342
        0x6
        0x1345
        0x4
        0x1348
        0x2
        0x134a
        0x6
        0x134d
        0x5
        0x1350
        0x3
        0x1352
        0x7
        0x1355
        0x6
        0x1358
        0x4
        0x135b
        0x2
        0x135d
        0x7
        0x1360
        0x5
        0x1363
        0x3
        0x1365
        0x8
        0x1368
        0x6
        0x136b
        0x4
        0x136e
        0x3
        0x1370
        0x7
        0x1373
        0x5
        0x1376
        0x4
        0x1378
        0x8
        0x137b
        0x6
        0x137e
        0x5
        0x1381
        0x2
        0x1383    # 7.0E-42f
        0x7
        0x1386
        0x5
        0x1389
        0x4
        0x138b
        0x8
        0x138e
        0x6
        0x1391
        0x5
        0x1394
        0x2
        0x1396
        0x7
        0x1399
        0x5
        0x139c
        0x4
        0x139e
        0xa
        0x13a1
        0x6
        0x13a4
        0x4
        0x13a7
        0x2
        0x13a9
        0x6
        0x13ac
        0x5
        0x13af
        0x3
        0x13b1
        0x8
        0x13b4
        0x6
        0x13b7
        0x5
        0x13ba
        0x2
        0x13bc
        0x7
        0x13bf
        0x5
        0x13c2
        0x3
        0x13c4
        0x8
        0x13c7
        0x6
        0x13ca
        0x4
        0x13cd
        0x3
        0x13cf
        0x7
        0x13d2
        0x5
        0x13d5
        0x4
        0x13d7
        0x8
        0x13da
        0x6
        0x13dd
        0x5
        0x13e0
        0x3
        0x13e2
        0x8
        0x13e5
        0x5
        0x13e8
        0x4
        0x13ea
        0x8
        0x13ed
        0x6
        0x13f0
        0x5
        0x13f3
        0x3
        0x13f5
        0x7
        0x13f8
        0x5
        0x13fb
        0x4
        0x13fd
        0x8
        0x1400
        0x6
        0x1403
        0x5
        0x1406
        0x3
        0x1408
        0x7
        0x140b
        0x5
        0x140e
        0x4
        0x1410
        0xa
        0x1413
        0x6
        0x1416
        0x5
        0x1419
        0x2
        0x141b
        0x7
        0x141e
        0x5
        0x1421
        0x4
        0x1424
        0x2
        0x1426
        0x6
        0x1429
        0x5
        0x142c
        0x3
        0x142e
        0x7
        0x1431
        0x6
        0x1434
        0x4
        0x1437
        0x1
        0x1439
        0x7
        0x143c
        0x5
        0x143f
        0x3
        0x1441
        0x8
        0x1444
        0x6
        0x1447
        0x4
        0x1449
        0x8
        0x144c
        0x7
        0x144f
        0x5
        0x1452
        0x4
        0x1454
        0x8
        0x1457
        0x6
        0x145a
        0x4
        0x145c
        0x8
        0x145f
        0x7
        0x1462
        0x5
        0x1465
        0x3
        0x1467
        0x7
        0x146a
        0x6
        0x146d
        0x4
        0x146f
        0xa
        0x1472
        0x7
        0x1475
        0x5
        0x1478
        0x3
        0x147a
        0x8
        0x147d
        0x5
        0x1480
        0x4
        0x1482
        0xb
        0x1485
        0x6
        0x1488
        0x5
        0x148b
        0x3
        0x148d
        0x8
        0x1490
        0x6
        0x1493
        0x5
        0x1496
        0x1
        0x1498
        0x7
        0x149b
        0x5
        0x149e
        0x3
        0x14a0
        0x8
        0x14a3
        0x6
        0x14a6
        0x4
        0x14a9
        0x2
        0x14ab
        0x7
        0x14ae
        0x5
        0x14b1
        0x3
        0x14b3
        0x8
        0x14b6
        0x6
        0x14b9
        0x4
        0x14bc
        0x3
        0x14be
        0x7
        0x14c1
        0x5
        0x14c4
        0x3
        0x14c6
        0x7
        0x14c9
        0x6
        0x14cc
        0x4
        0x14cf
        0x3
        0x14d1
        0x7
        0x14d4
        0x5
        0x14d7
        0x3
        0x14d9
        0x8
        0x14dc
        0x6
        0x14df
        0x4
        0x14e1
        0xa
        0x14e4
        0x7
        0x14e7
        0x5
        0x14ea
        0x4
        0x14ec
        0x9
        0x14ef
        0x6
        0x14f2
        0x5
        0x14f4
        0xb
        0x14f7
        0x7
        0x14fa
        0x5
        0x14fd
        0x4
        0x14ff
        0x9
        0x1502
        0x6
        0x1505
        0x5
        0x1508
        0x1
        0x150a
        0x7
        0x150d
        0x6
        0x1510
        0x4
        0x1512
        0x8
        0x1515
        0x6
        0x1518
        0x5
        0x151b
        0x3
        0x151d
        0x7
        0x1520
        0x6
        0x1523
        0x4
        0x1525
        0x8
        0x1528
        0x6
        0x152b
        0x5
        0x152e
        0x3
        0x1530
        0x7
        0x1533
        0x6
        0x1536
        0x3
        0x1538
        0x8
        0x153b
        0x6
        0x153e
        0x4
        0x1541
        0x3
        0x1543
        0x7
        0x1546
        0x6
        0x1549
        0x4
        0x154b
        0x9
        0x154e
        0x7
        0x1551
        0x5
        0x1554
        0x3
        0x1556
        0x8
        0x1559
        0x5
        0x155c
        0x4
        0x155e
        0x9
        0x1561
        0x6
        0x1564
        0x5
        0x1567
        0x3
        0x1569
        0x8
        0x156c
        0x6
        0x156f
        0x4
        0x1571
        0x9
        0x1574
        0x6
        0x1577
        0x5
        0x157a
        0x3
        0x157c
        0x7
        0x157f
        0x6
        0x1582
        0x4
        0x1584
        0xa
        0x1587
        0x6
        0x158a
        0x5
        0x158d
        0x3
        0x158f
        0x7
        0x1592
        0x6
        0x1595
        0x4
        0x1597
        0xa
        0x159a
        0x6
        0x159d
        0x5
        0x15a0
        0x3
        0x15a2
        0x7
        0x15a5
        0x6
        0x15a8
        0x4
        0x15aa
        0xb
        0x15ad
        0x7
        0x15b0
        0x5
        0x15b3
        0x3
        0x15b5
        0x8
        0x15b8
        0x6
        0x15bb
        0x4
        0x15bd
        0x9
        0x15c0
        0x7
        0x15c3
        0x5
        0x15c6
        0x4
        0x15c8
        0x8
        0x15cb
        0x6
        0x15ce
        0x4
        0x15d0
        0xb
        0x15d3
        0x7
        0x15d6
        0x5
        0x15d9
        0x4
        0x15db
        0x8
        0x15de
        0x6
        0x15e1
        0x5
        0x15e3
        0xa
        0x15e6
        0x7
        0x15e9
        0x5
        0x15ec
        0x3
        0x15ee
        0x8
        0x15f1
        0x6
        0x15f4
        0x4
        0x15f6
        0xa
        0x15f9
        0x6
        0x15fc
        0x5
        0x15ff
        0x4
        0x1601
        0x9
        0x1604
        0x6
    .end array-data
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

.method private constructor <init>(IILnet/time4j/calendar/h;IJ)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p6}, Lnet/time4j/calendar/f;-><init>(IILnet/time4j/calendar/h;IJ)V

    return-void
.end method

.method synthetic constructor <init>(IILnet/time4j/calendar/h;IJLnet/time4j/calendar/KoreanCalendar$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lnet/time4j/calendar/KoreanCalendar;-><init>(IILnet/time4j/calendar/h;IJ)V

    return-void
.end method

.method static synthetic l0()Lnet/time4j/calendar/d;
    .locals 1

    sget-object v0, Lnet/time4j/calendar/KoreanCalendar;->D:Lnet/time4j/calendar/d;

    return-object v0
.end method

.method static synthetic m0()[I
    .locals 1

    sget-object v0, Lnet/time4j/calendar/KoreanCalendar;->q:[I

    return-object v0
.end method

.method public static o0()Lnet/time4j/z0;
    .locals 3

    new-instance v0, Ljava/util/Locale;

    const-string v1, "ko"

    const-string v2, "KR"

    invoke-direct {v0, v1, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lnet/time4j/z0;->j(Ljava/util/Locale;)Lnet/time4j/z0;

    move-result-object v0

    return-object v0
.end method

.method static p0(IILnet/time4j/calendar/h;I)Lnet/time4j/calendar/KoreanCalendar;
    .locals 8

    .line 1
    sget-object v0, Lnet/time4j/calendar/KoreanCalendar;->D:Lnet/time4j/calendar/d;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lnet/time4j/calendar/d;->t(IILnet/time4j/calendar/h;I)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    new-instance v0, Lnet/time4j/calendar/KoreanCalendar;

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    move v2, p0

    .line 11
    move v3, p1

    .line 12
    move-object v4, p2

    .line 13
    move v5, p3

    .line 14
    invoke-direct/range {v1 .. v7}, Lnet/time4j/calendar/KoreanCalendar;-><init>(IILnet/time4j/calendar/h;IJ)V

    .line 15
    .line 16
    .line 17
    return-object v0
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

.method public static q0(Lnet/time4j/calendar/j;Lnet/time4j/calendar/h;I)Lnet/time4j/calendar/KoreanCalendar;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnet/time4j/calendar/j;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lnet/time4j/calendar/j;->e()Lnet/time4j/calendar/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lnet/time4j/calendar/o;->getNumber()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {v0, p0, p1, p2}, Lnet/time4j/calendar/KoreanCalendar;->p0(IILnet/time4j/calendar/h;I)Lnet/time4j/calendar/KoreanCalendar;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
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

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Serialization proxy required."

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lnet/time4j/calendar/KoreanCalendar$SPX;

    invoke-direct {v0, p0}, Lnet/time4j/calendar/KoreanCalendar$SPX;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method protected H()Lfj/h0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/h0<",
            "Lnet/time4j/calendar/KoreanCalendar$e;",
            "Lnet/time4j/calendar/KoreanCalendar;",
            ">;"
        }
    .end annotation

    sget-object v0, Lnet/time4j/calendar/KoreanCalendar;->E:Lfj/h0;

    return-object v0
.end method

.method Y()Lnet/time4j/calendar/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/time4j/calendar/d<",
            "Lnet/time4j/calendar/KoreanCalendar;",
            ">;"
        }
    .end annotation

    sget-object v0, Lnet/time4j/calendar/KoreanCalendar;->D:Lnet/time4j/calendar/d;

    return-object v0
.end method

.method protected n0()Lnet/time4j/calendar/KoreanCalendar;
    .locals 0

    return-object p0
.end method

.method protected bridge synthetic v()Lfj/x;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/KoreanCalendar;->H()Lfj/h0;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic w()Lfj/q;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/KoreanCalendar;->n0()Lnet/time4j/calendar/KoreanCalendar;

    move-result-object v0

    return-object v0
.end method
