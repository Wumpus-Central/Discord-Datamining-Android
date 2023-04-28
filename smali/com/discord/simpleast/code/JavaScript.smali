.class public final Lcom/discord/simpleast/code/JavaScript;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/simpleast/code/JavaScript$FunctionNode;,
        Lcom/discord/simpleast/code/JavaScript$FieldNode;,
        Lcom/discord/simpleast/code/JavaScript$ObjectPropertyNode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JE\u0010\u0011\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00140\u0015\u0012\u0004\u0012\u0002H\u00160\u00130\u0012\"\u0004\u0008\u0000\u0010\u0014\"\u0004\u0008\u0001\u0010\u00162\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u0002H\u00140\u0018H\u0000\u00a2\u0006\u0002\u0008\u0019R\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\n\u0010\u0007R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\u000c0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u000c0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\u000c0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\u000c0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/discord/simpleast/code/JavaScript;",
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
        "PATTERN_JAVASCRIPT_COMMENTS",
        "Ljava/util/regex/Pattern;",
        "kotlin.jvm.PlatformType",
        "PATTERN_JAVASCRIPT_GENERIC",
        "PATTERN_JAVASCRIPT_REGEX",
        "PATTERN_JAVASCRIPT_STRINGS",
        "createCodeRules",
        "",
        "Lcom/discord/simpleast/core/parser/Rule;",
        "RC",
        "Lcom/discord/simpleast/core/node/Node;",
        "S",
        "codeStyleProviders",
        "Lcom/discord/simpleast/code/CodeStyleProviders;",
        "createCodeRules$simpleast_core_release",
        "FieldNode",
        "FunctionNode",
        "ObjectPropertyNode",
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

.field public static final INSTANCE:Lcom/discord/simpleast/code/JavaScript;

.field private static final KEYWORDS:[Ljava/lang/String;

.field private static final PATTERN_JAVASCRIPT_COMMENTS:Ljava/util/regex/Pattern;

.field private static final PATTERN_JAVASCRIPT_GENERIC:Ljava/util/regex/Pattern;

.field private static final PATTERN_JAVASCRIPT_REGEX:Ljava/util/regex/Pattern;

.field private static final PATTERN_JAVASCRIPT_STRINGS:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/discord/simpleast/code/JavaScript;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/simpleast/code/JavaScript;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/simpleast/code/JavaScript;->INSTANCE:Lcom/discord/simpleast/code/JavaScript;

    .line 7
    .line 8
    const-string v1, "import|from|export|default|package"

    .line 9
    .line 10
    const-string v2, "class|enum"

    .line 11
    .line 12
    const-string v3, "function|super|extends|implements|arguments"

    .line 13
    .line 14
    const-string v4, "var|let|const|static|get|set|new"

    .line 15
    .line 16
    const-string v5, "return|break|continue|yield|void"

    .line 17
    .line 18
    const-string v6, "if|else|for|while|do|switch|async|await|case|try|catch|finally|delete|throw|NaN|Infinity"

    .line 19
    .line 20
    const-string v7, "of|in|instanceof|typeof"

    .line 21
    .line 22
    const-string v8, "debugger|with"

    .line 23
    .line 24
    const-string v9, "true|false|null|undefined"

    .line 25
    .line 26
    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lcom/discord/simpleast/code/JavaScript;->KEYWORDS:[Ljava/lang/String;

    .line 31
    .line 32
    const-string v1, "String|Boolean|RegExp|Number|Date|Math|JSON|Symbol|BigInt|Atomics|DataView"

    .line 33
    .line 34
    const-string v2, "Function|Promise|Generator|GeneratorFunction|AsyncFunction|AsyncGenerator|AsyncGeneratorFunction"

    .line 35
    .line 36
    const-string v3, "Array|Object|Map|Set|WeakMap|WeakSet|Int8Array|Int16Array|Int32Array|Uint8Array|Uint16Array"

    .line 37
    .line 38
    const-string v4, "Uint32Array|Uint8ClampedArray|Float32Array|Float64Array|BigInt64Array|BigUint64Array|Buffer"

    .line 39
    .line 40
    const-string v5, "ArrayBuffer|SharedArrayBuffer"

    .line 41
    .line 42
    const-string v6, "Reflect|Proxy|Intl|WebAssembly"

    .line 43
    .line 44
    const-string v7, "console|process|require|isNaN|parseInt|parseFloat|encodeURI|decodeURI|encodeURIComponent"

    .line 45
    .line 46
    const-string v8, "decodeURIComponent|this|global|globalThis|eval|isFinite|module"

    .line 47
    .line 48
    const-string v9, "setTimeout|setInterval|clearTimeout|clearInterval|setImmediate|clearImmediate"

    .line 49
    .line 50
    const-string v10, "queueMicrotask|document|window"

    .line 51
    .line 52
    const-string v11, "Error|SyntaxError|TypeError|RangeError|ReferenceError|EvalError|InternalError|URIError"

    .line 53
    .line 54
    const-string v12, "AggregateError|escape|unescape|URL|URLSearchParams|TextEncoder|TextDecoder"

    .line 55
    .line 56
    const-string v13, "AbortController|AbortSignal|EventTarget|Event|MessageChannel"

    .line 57
    .line 58
    const-string v14, "MessagePort|MessageEvent|FinalizationRegistry|WeakRef"

    .line 59
    .line 60
    const-string v15, "regeneratorRuntime|performance"

    .line 61
    .line 62
    filled-new-array/range {v1 .. v15}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lcom/discord/simpleast/code/JavaScript;->BUILT_INS:[Ljava/lang/String;

    .line 67
    .line 68
    const-string v0, "^/.+(?<!\\\\)/[dgimsuy]*"

    .line 69
    .line 70
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sput-object v0, Lcom/discord/simpleast/code/JavaScript;->PATTERN_JAVASCRIPT_REGEX:Ljava/util/regex/Pattern;

    .line 75
    .line 76
    const-string v0, "^<.*(?<!\\\\)>"

    .line 77
    .line 78
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sput-object v0, Lcom/discord/simpleast/code/JavaScript;->PATTERN_JAVASCRIPT_GENERIC:Ljava/util/regex/Pattern;

    .line 83
    .line 84
    const-string v0, "^(?:(?://.*?(?=\\n|$))|(/\\*.*?\\*/))"

    .line 85
    .line 86
    const/16 v1, 0x20

    .line 87
    .line 88
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    sput-object v0, Lcom/discord/simpleast/code/JavaScript;->PATTERN_JAVASCRIPT_COMMENTS:Ljava/util/regex/Pattern;

    .line 93
    .line 94
    const-string v0, "^(\'.*?(?<!\\\\)\'|\".*?(?<!\\\\)\"|`[\\s\\S]*?(?<!\\\\)`)(?=\\W|\\s|$)"

    .line 95
    .line 96
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sput-object v0, Lcom/discord/simpleast/code/JavaScript;->PATTERN_JAVASCRIPT_STRINGS:Ljava/util/regex/Pattern;

    .line 101
    .line 102
    return-void
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
.method public final createCodeRules$simpleast_core_release(Lcom/discord/simpleast/code/CodeStyleProviders;)Ljava/util/List;
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
    const/4 v0, 0x7

    .line 7
    new-array v0, v0, [Lcom/discord/simpleast/core/parser/Rule;

    .line 8
    .line 9
    sget-object v7, Lcom/discord/simpleast/code/CodeRules;->INSTANCE:Lcom/discord/simpleast/code/CodeRules;

    .line 10
    .line 11
    sget-object v2, Lcom/discord/simpleast/code/JavaScript;->PATTERN_JAVASCRIPT_COMMENTS:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    const-string v1, "PATTERN_JAVASCRIPT_COMMENTS"

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
    sget-object v2, Lcom/discord/simpleast/code/JavaScript;->PATTERN_JAVASCRIPT_STRINGS:Ljava/util/regex/Pattern;

    .line 34
    .line 35
    const-string v1, "PATTERN_JAVASCRIPT_STRINGS"

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
    sget-object v1, Lcom/discord/simpleast/code/JavaScript$ObjectPropertyNode;->Companion:Lcom/discord/simpleast/code/JavaScript$ObjectPropertyNode$Companion;

    .line 53
    .line 54
    invoke-virtual {v1, p1}, Lcom/discord/simpleast/code/JavaScript$ObjectPropertyNode$Companion;->createObjectPropertyRule(Lcom/discord/simpleast/code/CodeStyleProviders;)Lcom/discord/simpleast/core/parser/Rule;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const/4 v2, 0x2

    .line 59
    aput-object v1, v0, v2

    .line 60
    .line 61
    sget-object v2, Lcom/discord/simpleast/code/JavaScript;->PATTERN_JAVASCRIPT_GENERIC:Ljava/util/regex/Pattern;

    .line 62
    .line 63
    const-string v1, "PATTERN_JAVASCRIPT_GENERIC"

    .line 64
    .line 65
    invoke-static {v2, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/discord/simpleast/code/CodeStyleProviders;->getGenericsStyleProvider()Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    move-object v1, v7

    .line 73
    invoke-static/range {v1 .. v6}, Lcom/discord/simpleast/code/CodeRules;->toMatchGroupRule$default(Lcom/discord/simpleast/code/CodeRules;Ljava/util/regex/Pattern;ILcom/discord/simpleast/core/node/StyleNode$SpanProvider;ILjava/lang/Object;)Lcom/discord/simpleast/core/parser/Rule;

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
    sget-object v2, Lcom/discord/simpleast/code/JavaScript;->PATTERN_JAVASCRIPT_REGEX:Ljava/util/regex/Pattern;

    .line 81
    .line 82
    const-string v1, "PATTERN_JAVASCRIPT_REGEX"

    .line 83
    .line 84
    invoke-static {v2, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/discord/simpleast/code/CodeStyleProviders;->getLiteralStyleProvider()Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    move-object v1, v7

    .line 92
    invoke-static/range {v1 .. v6}, Lcom/discord/simpleast/code/CodeRules;->toMatchGroupRule$default(Lcom/discord/simpleast/code/CodeRules;Ljava/util/regex/Pattern;ILcom/discord/simpleast/core/node/StyleNode$SpanProvider;ILjava/lang/Object;)Lcom/discord/simpleast/core/parser/Rule;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const/4 v2, 0x4

    .line 97
    aput-object v1, v0, v2

    .line 98
    .line 99
    sget-object v1, Lcom/discord/simpleast/code/JavaScript$FieldNode;->Companion:Lcom/discord/simpleast/code/JavaScript$FieldNode$Companion;

    .line 100
    .line 101
    invoke-virtual {v1, p1}, Lcom/discord/simpleast/code/JavaScript$FieldNode$Companion;->createFieldRule(Lcom/discord/simpleast/code/CodeStyleProviders;)Lcom/discord/simpleast/core/parser/Rule;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const/4 v2, 0x5

    .line 106
    aput-object v1, v0, v2

    .line 107
    .line 108
    sget-object v1, Lcom/discord/simpleast/code/JavaScript$FunctionNode;->Companion:Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion;

    .line 109
    .line 110
    invoke-virtual {v1, p1}, Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion;->createFunctionRule(Lcom/discord/simpleast/code/CodeStyleProviders;)Lcom/discord/simpleast/core/parser/Rule;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    const/4 v1, 0x6

    .line 115
    aput-object p1, v0, v1

    .line 116
    .line 117
    invoke-static {v0}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1
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

    sget-object v0, Lcom/discord/simpleast/code/JavaScript;->BUILT_INS:[Ljava/lang/String;

    return-object v0
.end method

.method public final getKEYWORDS()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/code/JavaScript;->KEYWORDS:[Ljava/lang/String;

    return-object v0
.end method
