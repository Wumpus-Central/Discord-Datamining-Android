.class public final Lcom/discord/simpleast/code/CodeRules$createCodeRule$2;
.super Lcom/discord/simpleast/core/parser/Rule;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/simpleast/code/CodeRules;->createCodeRule(Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)Lcom/discord/simpleast/core/parser/Rule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/discord/simpleast/core/parser/Rule<",
        "TR;",
        "Lcom/discord/simpleast/core/node/Node<",
        "TR;>;TS;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\u0001JK\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u000c\u0008\u0000\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\u00082\u0006\u0010\t\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/discord/simpleast/code/CodeRules$createCodeRule$2",
        "Lcom/discord/simpleast/core/parser/Rule;",
        "Lcom/discord/simpleast/core/node/Node;",
        "parse",
        "Lcom/discord/simpleast/core/parser/ParseSpec;",
        "matcher",
        "Ljava/util/regex/Matcher;",
        "parser",
        "Lcom/discord/simpleast/core/parser/Parser;",
        "state",
        "(Ljava/util/regex/Matcher;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;",
        "simpleast-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $languageMap:Ljava/util/Map;

.field final synthetic $textStyleProvider:Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

.field final synthetic $wrapperNodeProvider:Lkotlin/jvm/functions/Function3;

.field final synthetic this$0:Lcom/discord/simpleast/code/CodeRules;


# direct methods
.method constructor <init>(Lcom/discord/simpleast/code/CodeRules;Ljava/util/Map;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lkotlin/jvm/functions/Function3;Ljava/util/regex/Pattern;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map;",
            "Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;",
            "Lkotlin/jvm/functions/Function3;",
            "Ljava/util/regex/Pattern;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/simpleast/code/CodeRules$createCodeRule$2;->this$0:Lcom/discord/simpleast/code/CodeRules;

    iput-object p2, p0, Lcom/discord/simpleast/code/CodeRules$createCodeRule$2;->$languageMap:Ljava/util/Map;

    iput-object p3, p0, Lcom/discord/simpleast/code/CodeRules$createCodeRule$2;->$textStyleProvider:Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    iput-object p4, p0, Lcom/discord/simpleast/code/CodeRules$createCodeRule$2;->$wrapperNodeProvider:Lkotlin/jvm/functions/Function3;

    invoke-direct {p0, p5}, Lcom/discord/simpleast/core/parser/Rule;-><init>(Ljava/util/regex/Pattern;)V

    return-void
.end method


# virtual methods
.method public parse(Ljava/util/regex/Matcher;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/regex/Matcher;",
            "Lcom/discord/simpleast/core/parser/Parser<",
            "TR;-",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;TS;)",
            "Lcom/discord/simpleast/core/parser/ParseSpec<",
            "TR;TS;>;"
        }
    .end annotation

    .line 1
    const-string v0, "matcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "parser"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x3

    .line 17
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v1, ""

    .line 25
    .line 26
    :goto_0
    const/4 v2, 0x2

    .line 27
    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    const/16 v5, 0xa

    .line 36
    .line 37
    invoke-static {p1, v5, v4, v2, v3}, Lpi/l;->L(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    :cond_1
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object p1, p0, Lcom/discord/simpleast/code/CodeRules$createCodeRule$2;->$languageMap:Ljava/util/Map;

    .line 44
    .line 45
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    move-object v3, p1

    .line 50
    check-cast v3, Ljava/util/List;

    .line 51
    .line 52
    :cond_2
    if-eqz v3, :cond_4

    .line 53
    .line 54
    invoke-virtual {p2, v1, p3, v3}, Lcom/discord/simpleast/core/parser/Parser;->parse(Ljava/lang/CharSequence;Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    new-instance p2, Lcom/discord/simpleast/code/CodeNode$Content$Parsed;

    .line 61
    .line 62
    invoke-direct {p2, v1, p1}, Lcom/discord/simpleast/code/CodeNode$Content$Parsed;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 67
    .line 68
    const-string p2, "null cannot be cast to non-null type kotlin.collections.List<com.discord.simpleast.core.node.Node<R>>"

    .line 69
    .line 70
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :cond_4
    new-instance p2, Lcom/discord/simpleast/code/CodeNode$Content$Raw;

    .line 75
    .line 76
    invoke-direct {p2, v1}, Lcom/discord/simpleast/code/CodeNode$Content$Raw;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    new-instance p1, Lcom/discord/simpleast/code/CodeNode;

    .line 80
    .line 81
    iget-object v1, p0, Lcom/discord/simpleast/code/CodeRules$createCodeRule$2;->$textStyleProvider:Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    .line 82
    .line 83
    invoke-direct {p1, p2, v0, v1}, Lcom/discord/simpleast/code/CodeNode;-><init>(Lcom/discord/simpleast/code/CodeNode$Content;Ljava/lang/String;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;)V

    .line 84
    .line 85
    .line 86
    sget-object p2, Lcom/discord/simpleast/core/parser/ParseSpec;->Companion:Lcom/discord/simpleast/core/parser/ParseSpec$Companion;

    .line 87
    .line 88
    iget-object v0, p0, Lcom/discord/simpleast/code/CodeRules$createCodeRule$2;->$wrapperNodeProvider:Lkotlin/jvm/functions/Function3;

    .line 89
    .line 90
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-interface {v0, p1, v1, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Lcom/discord/simpleast/core/node/Node;

    .line 99
    .line 100
    invoke-virtual {p2, p1, p3}, Lcom/discord/simpleast/core/parser/ParseSpec$Companion;->createTerminal(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1
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
.end method
