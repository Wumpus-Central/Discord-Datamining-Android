.class public final Lcom/discord/simpleast/code/JavaScript$FunctionNode;
.super Lcom/discord/simpleast/core/node/Node$Parent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/simpleast/code/JavaScript;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FunctionNode"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RC:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/discord/simpleast/core/node/Node$Parent<",
        "TRC;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \n*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\nB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/discord/simpleast/code/JavaScript$FunctionNode;",
        "RC",
        "Lcom/discord/simpleast/core/node/Node$Parent;",
        "pre",
        "",
        "signature",
        "params",
        "codeStyleProviders",
        "Lcom/discord/simpleast/code/CodeStyleProviders;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/simpleast/code/CodeStyleProviders;)V",
        "Companion",
        "simpleast-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion;

.field private static final PATTERN_JAVASCRIPT_FUNC:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/simpleast/code/JavaScript$FunctionNode;->Companion:Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion;

    .line 8
    .line 9
    sget-object v0, Lri/j;->r:Lri/j;

    .line 10
    .line 11
    new-instance v1, Lkotlin/text/Regex;

    .line 12
    .line 13
    const-string v2, "^(function\\*?|static|get|set|async)(\\s+[a-zA-Z_$][a-zA-Z0-9_$]*)?(\\s*\\(.*?\\))"

    .line 14
    .line 15
    invoke-direct {v1, v2, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Lri/j;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lkotlin/text/Regex;->j()Ljava/util/regex/Pattern;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lcom/discord/simpleast/code/JavaScript$FunctionNode;->PATTERN_JAVASCRIPT_FUNC:Ljava/util/regex/Pattern;

    .line 23
    .line 24
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/simpleast/code/CodeStyleProviders;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/simpleast/code/CodeStyleProviders<",
            "TRC;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "pre"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "params"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "codeStyleProviders"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    new-array v0, v0, [Lcom/discord/simpleast/core/node/Node;

    .line 18
    .line 19
    new-instance v1, Lcom/discord/simpleast/core/node/StyleNode$TextStyledNode;

    .line 20
    .line 21
    invoke-virtual {p4}, Lcom/discord/simpleast/code/CodeStyleProviders;->getKeywordStyleProvider()Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {v1, p1, v2}, Lcom/discord/simpleast/core/node/StyleNode$TextStyledNode;-><init>(Ljava/lang/String;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    aput-object v1, v0, p1

    .line 30
    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    new-instance p1, Lcom/discord/simpleast/core/node/StyleNode$TextStyledNode;

    .line 34
    .line 35
    invoke-virtual {p4}, Lcom/discord/simpleast/code/CodeStyleProviders;->getIdentifierStyleProvider()Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {p1, p2, v1}, Lcom/discord/simpleast/core/node/StyleNode$TextStyledNode;-><init>(Ljava/lang/String;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    :goto_0
    const/4 p2, 0x1

    .line 45
    aput-object p1, v0, p2

    .line 46
    .line 47
    new-instance p1, Lcom/discord/simpleast/core/node/StyleNode$TextStyledNode;

    .line 48
    .line 49
    invoke-virtual {p4}, Lcom/discord/simpleast/code/CodeStyleProviders;->getParamsStyleProvider()Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-direct {p1, p3, p2}, Lcom/discord/simpleast/core/node/StyleNode$TextStyledNode;-><init>(Ljava/lang/String;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;)V

    .line 54
    .line 55
    .line 56
    const/4 p2, 0x2

    .line 57
    aput-object p1, v0, p2

    .line 58
    .line 59
    invoke-direct {p0, v0}, Lcom/discord/simpleast/core/node/Node$Parent;-><init>([Lcom/discord/simpleast/core/node/Node;)V

    .line 60
    .line 61
    .line 62
    return-void
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
.end method

.method public static final synthetic access$getPATTERN_JAVASCRIPT_FUNC$cp()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/code/JavaScript$FunctionNode;->PATTERN_JAVASCRIPT_FUNC:Ljava/util/regex/Pattern;

    return-object v0
.end method
