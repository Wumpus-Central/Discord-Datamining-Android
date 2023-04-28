.class public final Lcom/discord/simpleast/code/Kotlin;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/simpleast/code/Kotlin$FunctionNode;,
        Lcom/discord/simpleast/code/Kotlin$FieldNode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JE\u0010\u0010\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0013\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00130\u0014\u0012\u0004\u0012\u0002H\u00150\u00120\u0011\"\u0004\u0008\u0000\u0010\u0013\"\u0004\u0008\u0001\u0010\u00152\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u0002H\u00130\u0017H\u0000\u00a2\u0006\u0002\u0008\u0018R\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\n\u0010\u0007R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\u000c0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u000c0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\u000c0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/discord/simpleast/code/Kotlin;",
        "",
        "()V",
        "BUILT_INS",
        "",
        "",
        "getBUILT_INS",
        "()[Ljava/lang/String;",
        "[Ljava/lang/String;",
        "KEYWORDS",
        "getKEYWORDS",
        "PATTERN_KOTLIN_ANNOTATION",
        "Ljava/util/regex/Pattern;",
        "kotlin.jvm.PlatformType",
        "PATTERN_KOTLIN_COMMENTS",
        "PATTERN_KOTLIN_STRINGS",
        "createKotlinCodeRules",
        "",
        "Lcom/discord/simpleast/core/parser/Rule;",
        "RC",
        "Lcom/discord/simpleast/core/node/Node;",
        "S",
        "codeStyleProviders",
        "Lcom/discord/simpleast/code/CodeStyleProviders;",
        "createKotlinCodeRules$simpleast_core_release",
        "FieldNode",
        "FunctionNode",
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
.field private static final BUILT_INS:[Ljava/lang/String;

.field public static final INSTANCE:Lcom/discord/simpleast/code/Kotlin;

.field private static final KEYWORDS:[Ljava/lang/String;

.field private static final PATTERN_KOTLIN_ANNOTATION:Ljava/util/regex/Pattern;

.field private static final PATTERN_KOTLIN_COMMENTS:Ljava/util/regex/Pattern;

.field private static final PATTERN_KOTLIN_STRINGS:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lcom/discord/simpleast/code/Kotlin;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/simpleast/code/Kotlin;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/simpleast/code/Kotlin;->INSTANCE:Lcom/discord/simpleast/code/Kotlin;

    .line 7
    .line 8
    const-string v1, "public|private|internal|inline|lateinit|abstract|open|reified"

    .line 9
    .line 10
    const-string v2, "import|package"

    .line 11
    .line 12
    const-string v3, "class|interface|data|enum|sealed|object|typealias"

    .line 13
    .line 14
    const-string v4, "fun|override|this|super|where|constructor|init|param|delegate"

    .line 15
    .line 16
    const-string v5, "const|val|var|get|final|vararg|it"

    .line 17
    .line 18
    const-string v6, "return|break|continue|suspend"

    .line 19
    .line 20
    const-string v7, "for|while|do|if|else|when|try|catch|finally|throw"

    .line 21
    .line 22
    const-string v8, "in|out|is|as|typeof"

    .line 23
    .line 24
    const-string v9, "shr|ushr|shl|ushl"

    .line 25
    .line 26
    const-string v10, "true|false|null"

    .line 27
    .line 28
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lcom/discord/simpleast/code/Kotlin;->KEYWORDS:[Ljava/lang/String;

    .line 33
    .line 34
    const-string v0, "Self|Set|Map|MutableMap|List|MutableList|Array|Runnable|Unit"

    .line 35
    .line 36
    const-string v1, "arrayOf|listOf|mapOf|setOf|let|also|apply|run"

    .line 37
    .line 38
    const-string v2, "true|false|Boolean|String|Char"

    .line 39
    .line 40
    const-string v3, "Int|UInt|Long|ULong|Float|Double|Byte|UByte|Short|UShort"

    .line 41
    .line 42
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lcom/discord/simpleast/code/Kotlin;->BUILT_INS:[Ljava/lang/String;

    .line 47
    .line 48
    const-string v0, "^(?:(?://.*?(?=\\n|$))|(/\\*.*?\\*/))"

    .line 49
    .line 50
    const/16 v1, 0x20

    .line 51
    .line 52
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, Lcom/discord/simpleast/code/Kotlin;->PATTERN_KOTLIN_COMMENTS:Ljava/util/regex/Pattern;

    .line 57
    .line 58
    const-string v0, "^@(\\w+)"

    .line 59
    .line 60
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, Lcom/discord/simpleast/code/Kotlin;->PATTERN_KOTLIN_ANNOTATION:Ljava/util/regex/Pattern;

    .line 65
    .line 66
    const-string v0, "^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)"

    .line 67
    .line 68
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lcom/discord/simpleast/code/Kotlin;->PATTERN_KOTLIN_STRINGS:Ljava/util/regex/Pattern;

    .line 73
    .line 74
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createKotlinCodeRules$simpleast_core_release(Lcom/discord/simpleast/code/CodeStyleProviders;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RC:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/discord/simpleast/code/CodeStyleProviders<",
            "TRC;>;)",
            "Ljava/util/List<",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TRC;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TRC;>;TS;>;>;"
        }
    .end annotation

    .line 1
    const-string v0, "codeStyleProviders"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    new-array v0, v0, [Lcom/discord/simpleast/core/parser/Rule;

    .line 8
    .line 9
    sget-object v7, Lcom/discord/simpleast/code/CodeRules;->INSTANCE:Lcom/discord/simpleast/code/CodeRules;

    .line 10
    .line 11
    sget-object v2, Lcom/discord/simpleast/code/Kotlin;->PATTERN_KOTLIN_COMMENTS:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    const-string v1, "PATTERN_KOTLIN_COMMENTS"

    .line 14
    .line 15
    invoke-static {v2, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {p1}, Lcom/discord/simpleast/code/CodeStyleProviders;->getCommentStyleProvider()Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x1

    .line 24
    const/4 v6, 0x0

    .line 25
    move-object v1, v7

    .line 26
    invoke-static/range {v1 .. v6}, Lcom/discord/simpleast/code/CodeRules;->toMatchGroupRule$default(Lcom/discord/simpleast/code/CodeRules;Ljava/util/regex/Pattern;ILcom/discord/simpleast/core/node/StyleNode$SpanProvider;ILjava/lang/Object;)Lcom/discord/simpleast/core/parser/Rule;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x0

    .line 31
    aput-object v1, v0, v2

    .line 32
    .line 33
    sget-object v2, Lcom/discord/simpleast/code/Kotlin;->PATTERN_KOTLIN_STRINGS:Ljava/util/regex/Pattern;

    .line 34
    .line 35
    const-string v1, "PATTERN_KOTLIN_STRINGS"

    .line 36
    .line 37
    invoke-static {v2, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/discord/simpleast/code/CodeStyleProviders;->getLiteralStyleProvider()Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    move-object v1, v7

    .line 45
    invoke-static/range {v1 .. v6}, Lcom/discord/simpleast/code/CodeRules;->toMatchGroupRule$default(Lcom/discord/simpleast/code/CodeRules;Ljava/util/regex/Pattern;ILcom/discord/simpleast/core/node/StyleNode$SpanProvider;ILjava/lang/Object;)Lcom/discord/simpleast/core/parser/Rule;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v2, 0x1

    .line 50
    aput-object v1, v0, v2

    .line 51
    .line 52
    sget-object v2, Lcom/discord/simpleast/code/Kotlin;->PATTERN_KOTLIN_ANNOTATION:Ljava/util/regex/Pattern;

    .line 53
    .line 54
    const-string v1, "PATTERN_KOTLIN_ANNOTATION"

    .line 55
    .line 56
    invoke-static {v2, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/discord/simpleast/code/CodeStyleProviders;->getGenericsStyleProvider()Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    move-object v1, v7

    .line 64
    invoke-static/range {v1 .. v6}, Lcom/discord/simpleast/code/CodeRules;->toMatchGroupRule$default(Lcom/discord/simpleast/code/CodeRules;Ljava/util/regex/Pattern;ILcom/discord/simpleast/core/node/StyleNode$SpanProvider;ILjava/lang/Object;)Lcom/discord/simpleast/core/parser/Rule;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const/4 v2, 0x2

    .line 69
    aput-object v1, v0, v2

    .line 70
    .line 71
    sget-object v1, Lcom/discord/simpleast/code/Kotlin$FieldNode;->Companion:Lcom/discord/simpleast/code/Kotlin$FieldNode$Companion;

    .line 72
    .line 73
    invoke-virtual {v1, p1}, Lcom/discord/simpleast/code/Kotlin$FieldNode$Companion;->createFieldRule(Lcom/discord/simpleast/code/CodeStyleProviders;)Lcom/discord/simpleast/core/parser/Rule;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const/4 v2, 0x3

    .line 78
    aput-object v1, v0, v2

    .line 79
    .line 80
    sget-object v1, Lcom/discord/simpleast/code/Kotlin$FunctionNode;->Companion:Lcom/discord/simpleast/code/Kotlin$FunctionNode$Companion;

    .line 81
    .line 82
    invoke-virtual {v1, p1}, Lcom/discord/simpleast/code/Kotlin$FunctionNode$Companion;->createFunctionRule(Lcom/discord/simpleast/code/CodeStyleProviders;)Lcom/discord/simpleast/core/parser/Rule;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const/4 v1, 0x4

    .line 87
    aput-object p1, v0, v1

    .line 88
    .line 89
    invoke-static {v0}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1
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
.end method

.method public final getBUILT_INS()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/code/Kotlin;->BUILT_INS:[Ljava/lang/String;

    return-object v0
.end method

.method public final getKEYWORDS()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/code/Kotlin;->KEYWORDS:[Ljava/lang/String;

    return-object v0
.end method
