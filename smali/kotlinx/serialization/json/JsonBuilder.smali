.class public final Lkotlinx/serialization/json/JsonBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u001a\n\u0002\u0010\u000e\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0011\u0008\u0000\u0012\u0006\u0010E\u001a\u00020D\u00a2\u0006\u0004\u0008F\u0010GJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR(\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000c\u0010\u0006\u0012\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\r\u0010\u0008\"\u0004\u0008\u000e\u0010\nR\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0006\u001a\u0004\u0008\u0013\u0010\u0008\"\u0004\u0008\u0012\u0010\nR\"\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0006\u001a\u0004\u0008\u0016\u0010\u0008\"\u0004\u0008\u0017\u0010\nR\"\u0010\u001b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0006\u001a\u0004\u0008\u0019\u0010\u0008\"\u0004\u0008\u001a\u0010\nR\"\u0010\u001f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u0006\u001a\u0004\u0008\u001d\u0010\u0008\"\u0004\u0008\u001e\u0010\nR(\u0010(\u001a\u00020 8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008!\u0010\"\u0012\u0004\u0008\'\u0010\u0010\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&R\"\u0010,\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008)\u0010\u0006\u001a\u0004\u0008*\u0010\u0008\"\u0004\u0008+\u0010\nR\"\u00100\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008-\u0010\u0006\u001a\u0004\u0008.\u0010\u0008\"\u0004\u0008/\u0010\nR\"\u00104\u001a\u00020 8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00081\u0010\"\u001a\u0004\u00082\u0010$\"\u0004\u00083\u0010&R\"\u00108\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00085\u0010\u0006\u001a\u0004\u00086\u0010\u0008\"\u0004\u00087\u0010\nR\"\u0010<\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00089\u0010\u0006\u001a\u0004\u0008:\u0010\u0008\"\u0004\u0008;\u0010\nR\"\u0010C\u001a\u00020=8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008>\u0010?\u001a\u0004\u0008\u000c\u0010@\"\u0004\u0008A\u0010B\u00a8\u0006H"
    }
    d2 = {
        "Lkotlinx/serialization/json/JsonBuilder;",
        "",
        "Lkotlinx/serialization/json/c;",
        "a",
        "()Lkotlinx/serialization/json/c;",
        "",
        "Z",
        "getEncodeDefaults",
        "()Z",
        "setEncodeDefaults",
        "(Z)V",
        "encodeDefaults",
        "b",
        "getExplicitNulls",
        "setExplicitNulls",
        "getExplicitNulls$annotations",
        "()V",
        "explicitNulls",
        "c",
        "getIgnoreUnknownKeys",
        "ignoreUnknownKeys",
        "d",
        "isLenient",
        "setLenient",
        "e",
        "getAllowStructuredMapKeys",
        "setAllowStructuredMapKeys",
        "allowStructuredMapKeys",
        "f",
        "getPrettyPrint",
        "setPrettyPrint",
        "prettyPrint",
        "",
        "g",
        "Ljava/lang/String;",
        "getPrettyPrintIndent",
        "()Ljava/lang/String;",
        "setPrettyPrintIndent",
        "(Ljava/lang/String;)V",
        "getPrettyPrintIndent$annotations",
        "prettyPrintIndent",
        "h",
        "getCoerceInputValues",
        "setCoerceInputValues",
        "coerceInputValues",
        "i",
        "getUseArrayPolymorphism",
        "setUseArrayPolymorphism",
        "useArrayPolymorphism",
        "j",
        "getClassDiscriminator",
        "setClassDiscriminator",
        "classDiscriminator",
        "k",
        "getAllowSpecialFloatingPointValues",
        "setAllowSpecialFloatingPointValues",
        "allowSpecialFloatingPointValues",
        "l",
        "getUseAlternativeNames",
        "setUseAlternativeNames",
        "useAlternativeNames",
        "Lbj/c;",
        "m",
        "Lbj/c;",
        "()Lbj/c;",
        "setSerializersModule",
        "(Lbj/c;)V",
        "serializersModule",
        "Lkotlinx/serialization/json/Json;",
        "json",
        "<init>",
        "(Lkotlinx/serialization/json/Json;)V",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:Z

.field private j:Ljava/lang/String;

.field private k:Z

.field private l:Z

.field private m:Lbj/c;


# direct methods
.method public constructor <init>(Lkotlinx/serialization/json/Json;)V
    .locals 1

    .line 1
    const-string v0, "json"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->e()Lkotlinx/serialization/json/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->e()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput-boolean v0, p0, Lkotlinx/serialization/json/JsonBuilder;->a:Z

    .line 18
    .line 19
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->e()Lkotlinx/serialization/json/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->f()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput-boolean v0, p0, Lkotlinx/serialization/json/JsonBuilder;->b:Z

    .line 28
    .line 29
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->e()Lkotlinx/serialization/json/c;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->g()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput-boolean v0, p0, Lkotlinx/serialization/json/JsonBuilder;->c:Z

    .line 38
    .line 39
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->e()Lkotlinx/serialization/json/c;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->m()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iput-boolean v0, p0, Lkotlinx/serialization/json/JsonBuilder;->d:Z

    .line 48
    .line 49
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->e()Lkotlinx/serialization/json/c;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->b()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iput-boolean v0, p0, Lkotlinx/serialization/json/JsonBuilder;->e:Z

    .line 58
    .line 59
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->e()Lkotlinx/serialization/json/c;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->i()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iput-boolean v0, p0, Lkotlinx/serialization/json/JsonBuilder;->f:Z

    .line 68
    .line 69
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->e()Lkotlinx/serialization/json/c;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->j()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, Lkotlinx/serialization/json/JsonBuilder;->g:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->e()Lkotlinx/serialization/json/c;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->d()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iput-boolean v0, p0, Lkotlinx/serialization/json/JsonBuilder;->h:Z

    .line 88
    .line 89
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->e()Lkotlinx/serialization/json/c;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->l()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iput-boolean v0, p0, Lkotlinx/serialization/json/JsonBuilder;->i:Z

    .line 98
    .line 99
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->e()Lkotlinx/serialization/json/c;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->c()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, p0, Lkotlinx/serialization/json/JsonBuilder;->j:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->e()Lkotlinx/serialization/json/c;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->a()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iput-boolean v0, p0, Lkotlinx/serialization/json/JsonBuilder;->k:Z

    .line 118
    .line 119
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->e()Lkotlinx/serialization/json/c;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->k()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iput-boolean v0, p0, Lkotlinx/serialization/json/JsonBuilder;->l:Z

    .line 128
    .line 129
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->e()Lkotlinx/serialization/json/c;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->h()Lkotlinx/serialization/json/p;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Lkotlinx/serialization/json/Json;->a()Lbj/c;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iput-object p1, p0, Lkotlinx/serialization/json/JsonBuilder;->m:Lbj/c;

    .line 141
    .line 142
    return-void
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
.end method


# virtual methods
.method public final a()Lkotlinx/serialization/json/c;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lkotlinx/serialization/json/JsonBuilder;->i:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, v0, Lkotlinx/serialization/json/JsonBuilder;->j:Ljava/lang/String;

    .line 8
    .line 9
    const-string v2, "type"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v2, "Class discriminator should not be specified when array polymorphism is specified"

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v1

    .line 30
    :cond_1
    :goto_0
    iget-boolean v1, v0, Lkotlinx/serialization/json/JsonBuilder;->f:Z

    .line 31
    .line 32
    const-string v2, "    "

    .line 33
    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    iget-object v1, v0, Lkotlinx/serialization/json/JsonBuilder;->g:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    const-string v2, "Indent should not be specified when default printing mode is used"

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v1

    .line 57
    :cond_3
    iget-object v1, v0, Lkotlinx/serialization/json/JsonBuilder;->g:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_9

    .line 64
    .line 65
    iget-object v1, v0, Lkotlinx/serialization/json/JsonBuilder;->g:Ljava/lang/String;

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    move v3, v2

    .line 69
    :goto_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    const/4 v5, 0x1

    .line 74
    if-ge v3, v4, :cond_7

    .line 75
    .line 76
    invoke-interface {v1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const/16 v6, 0x20

    .line 81
    .line 82
    if-eq v4, v6, :cond_5

    .line 83
    .line 84
    const/16 v6, 0x9

    .line 85
    .line 86
    if-eq v4, v6, :cond_5

    .line 87
    .line 88
    const/16 v6, 0xd

    .line 89
    .line 90
    if-eq v4, v6, :cond_5

    .line 91
    .line 92
    const/16 v6, 0xa

    .line 93
    .line 94
    if-ne v4, v6, :cond_4

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    move v5, v2

    .line 98
    :cond_5
    :goto_2
    if-nez v5, :cond_6

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_7
    move v2, v5

    .line 105
    :goto_3
    if-eqz v2, :cond_8

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v2, "Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had "

    .line 114
    .line 115
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object v2, v0, Lkotlinx/serialization/json/JsonBuilder;->g:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v2

    .line 137
    :cond_9
    :goto_4
    new-instance v1, Lkotlinx/serialization/json/c;

    .line 138
    .line 139
    iget-boolean v4, v0, Lkotlinx/serialization/json/JsonBuilder;->a:Z

    .line 140
    .line 141
    iget-boolean v5, v0, Lkotlinx/serialization/json/JsonBuilder;->c:Z

    .line 142
    .line 143
    iget-boolean v6, v0, Lkotlinx/serialization/json/JsonBuilder;->d:Z

    .line 144
    .line 145
    iget-boolean v7, v0, Lkotlinx/serialization/json/JsonBuilder;->e:Z

    .line 146
    .line 147
    iget-boolean v8, v0, Lkotlinx/serialization/json/JsonBuilder;->f:Z

    .line 148
    .line 149
    iget-boolean v9, v0, Lkotlinx/serialization/json/JsonBuilder;->b:Z

    .line 150
    .line 151
    iget-object v10, v0, Lkotlinx/serialization/json/JsonBuilder;->g:Ljava/lang/String;

    .line 152
    .line 153
    iget-boolean v11, v0, Lkotlinx/serialization/json/JsonBuilder;->h:Z

    .line 154
    .line 155
    iget-boolean v12, v0, Lkotlinx/serialization/json/JsonBuilder;->i:Z

    .line 156
    .line 157
    iget-object v13, v0, Lkotlinx/serialization/json/JsonBuilder;->j:Ljava/lang/String;

    .line 158
    .line 159
    iget-boolean v14, v0, Lkotlinx/serialization/json/JsonBuilder;->k:Z

    .line 160
    .line 161
    iget-boolean v15, v0, Lkotlinx/serialization/json/JsonBuilder;->l:Z

    .line 162
    .line 163
    const/16 v16, 0x0

    .line 164
    .line 165
    move-object v3, v1

    .line 166
    invoke-direct/range {v3 .. v16}, Lkotlinx/serialization/json/c;-><init>(ZZZZZZLjava/lang/String;ZZLjava/lang/String;ZZLkotlinx/serialization/json/p;)V

    .line 167
    .line 168
    .line 169
    return-object v1
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

.method public final b()Lbj/c;
    .locals 1

    iget-object v0, p0, Lkotlinx/serialization/json/JsonBuilder;->m:Lbj/c;

    return-object v0
.end method

.method public final c(Z)V
    .locals 0

    iput-boolean p1, p0, Lkotlinx/serialization/json/JsonBuilder;->c:Z

    return-void
.end method
