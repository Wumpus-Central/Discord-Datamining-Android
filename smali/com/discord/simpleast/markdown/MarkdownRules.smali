.class public final Lcom/discord/simpleast/markdown/MarkdownRules;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/simpleast/markdown/MarkdownRules$ListItemRule;,
        Lcom/discord/simpleast/markdown/MarkdownRules$HeaderRule;,
        Lcom/discord/simpleast/markdown/MarkdownRules$HeaderLineRule;,
        Lcom/discord/simpleast/markdown/MarkdownRules$HeaderLineClassedRule;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JJ\u0010\r\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00100\u0011\u0012\u0004\u0012\u0002H\u00120\u000f0\u000e\"\u0004\u0008\u0000\u0010\u0010\"\u0004\u0008\u0001\u0010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0008\u0001\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000eH\u0007JJ\u0010\u0017\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00100\u0011\u0012\u0004\u0012\u0002H\u00120\u000f0\u000e\"\u0004\u0008\u0000\u0010\u0010\"\u0004\u0008\u0001\u0010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0008\u0001\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000eH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0006\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/discord/simpleast/markdown/MarkdownRules;",
        "",
        "()V",
        "PATTERN_HEADER_ITEM",
        "Ljava/util/regex/Pattern;",
        "getPATTERN_HEADER_ITEM",
        "()Ljava/util/regex/Pattern;",
        "PATTERN_HEADER_ITEM_ALT",
        "getPATTERN_HEADER_ITEM_ALT",
        "PATTERN_HEADER_ITEM_ALT_CLASSED",
        "getPATTERN_HEADER_ITEM_ALT_CLASSED",
        "PATTERN_LIST_ITEM",
        "getPATTERN_LIST_ITEM",
        "createHeaderRules",
        "",
        "Lcom/discord/simpleast/core/parser/Rule;",
        "R",
        "Lcom/discord/simpleast/core/node/Node;",
        "S",
        "context",
        "Landroid/content/Context;",
        "headerStyles",
        "",
        "createMarkdownRules",
        "HeaderLineClassedRule",
        "HeaderLineRule",
        "HeaderRule",
        "ListItemRule",
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
.field public static final INSTANCE:Lcom/discord/simpleast/markdown/MarkdownRules;

.field private static final PATTERN_HEADER_ITEM:Ljava/util/regex/Pattern;

.field private static final PATTERN_HEADER_ITEM_ALT:Ljava/util/regex/Pattern;

.field private static final PATTERN_HEADER_ITEM_ALT_CLASSED:Ljava/util/regex/Pattern;

.field private static final PATTERN_LIST_ITEM:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/discord/simpleast/markdown/MarkdownRules;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/simpleast/markdown/MarkdownRules;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/simpleast/markdown/MarkdownRules;->INSTANCE:Lcom/discord/simpleast/markdown/MarkdownRules;

    .line 7
    .line 8
    const-string v0, "^\\*[ \\t](.*)(?=\\n|$)"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v2, "java.util.regex.Pattern.compile(this, flags)"

    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/discord/simpleast/markdown/MarkdownRules;->PATTERN_LIST_ITEM:Ljava/util/regex/Pattern;

    .line 21
    .line 22
    const-string v0, "^\\s*(#+)[ \\t](.*) *(?=\\n|$)"

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lcom/discord/simpleast/markdown/MarkdownRules;->PATTERN_HEADER_ITEM:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    const-string v0, "^\\s*(.+)\\n *(=|-){3,} *(?=\\n|$)"

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lcom/discord/simpleast/markdown/MarkdownRules;->PATTERN_HEADER_ITEM_ALT:Ljava/util/regex/Pattern;

    .line 43
    .line 44
    new-instance v0, Lkotlin/text/Regex;

    .line 45
    .line 46
    const-string v1, "^\\s*(?:(?:(.+)(?: +\\{([\\w ]*)\\}))|(.*))[ \\t]*\\n *([=\\-]){3,}[ \\t]*(?=\\n|$)"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lkotlin/text/Regex;->j()Ljava/util/regex/Pattern;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcom/discord/simpleast/markdown/MarkdownRules;->PATTERN_HEADER_ITEM_ALT_CLASSED:Ljava/util/regex/Pattern;

    .line 56
    .line 57
    return-void
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

.method public static final createHeaderRules(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;>;"
        }
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "headerStyles"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x2

    .line 17
    new-array p0, p0, [Lcom/discord/simpleast/markdown/MarkdownRules$HeaderRule;

    .line 18
    .line 19
    new-instance p1, Lcom/discord/simpleast/markdown/MarkdownRules$HeaderRule;

    .line 20
    .line 21
    new-instance v1, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$2;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$2;-><init>(Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, v1}, Lcom/discord/simpleast/markdown/MarkdownRules$HeaderRule;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    aput-object p1, p0, v1

    .line 31
    .line 32
    new-instance p1, Lcom/discord/simpleast/markdown/MarkdownRules$HeaderLineRule;

    .line 33
    .line 34
    new-instance v1, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$3;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$3;-><init>(Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-direct {p1, v0, v1, v2, v0}, Lcom/discord/simpleast/markdown/MarkdownRules$HeaderLineRule;-><init>(Ljava/util/regex/Pattern;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    .line 43
    .line 44
    aput-object p1, p0, v2

    .line 45
    .line 46
    invoke-static {p0}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
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
.end method

.method public static final createMarkdownRules(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;>;"
        }
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "headerStyles"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Lcom/discord/simpleast/markdown/MarkdownRules;->createHeaderRules(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance p1, Lcom/discord/simpleast/markdown/MarkdownRules$ListItemRule;

    .line 16
    .line 17
    sget-object v0, Lcom/discord/simpleast/markdown/MarkdownRules$createMarkdownRules$1;->INSTANCE:Lcom/discord/simpleast/markdown/MarkdownRules$createMarkdownRules$1;

    .line 18
    .line 19
    invoke-direct {p1, v0}, Lcom/discord/simpleast/markdown/MarkdownRules$ListItemRule;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1}, Lkotlin/collections/h;->p0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
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
.end method


# virtual methods
.method public final getPATTERN_HEADER_ITEM()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/markdown/MarkdownRules;->PATTERN_HEADER_ITEM:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public final getPATTERN_HEADER_ITEM_ALT()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/markdown/MarkdownRules;->PATTERN_HEADER_ITEM_ALT:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public final getPATTERN_HEADER_ITEM_ALT_CLASSED()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/markdown/MarkdownRules;->PATTERN_HEADER_ITEM_ALT_CLASSED:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public final getPATTERN_LIST_ITEM()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/markdown/MarkdownRules;->PATTERN_LIST_ITEM:Ljava/util/regex/Pattern;

    return-object v0
.end method
