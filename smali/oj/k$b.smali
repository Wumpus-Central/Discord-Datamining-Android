.class public final Loj/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loj/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0002J(\u0010\u000f\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J)\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0007R\u001c\u0010 \u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010!R\u001c\u0010#\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010!R\u001c\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010!\u00a8\u0006\'"
    }
    d2 = {
        "Loj/k$b;",
        "",
        "",
        "urlHost",
        "domain",
        "",
        "b",
        "s",
        "",
        "pos",
        "limit",
        "",
        "g",
        "input",
        "invert",
        "a",
        "h",
        "f",
        "Lokhttp3/HttpUrl;",
        "url",
        "setCookie",
        "Loj/k;",
        "c",
        "currentTimeMillis",
        "d",
        "(JLokhttp3/HttpUrl;Ljava/lang/String;)Loj/k;",
        "Lokhttp3/Headers;",
        "headers",
        "",
        "e",
        "Ljava/util/regex/Pattern;",
        "kotlin.jvm.PlatformType",
        "DAY_OF_MONTH_PATTERN",
        "Ljava/util/regex/Pattern;",
        "MONTH_PATTERN",
        "TIME_PATTERN",
        "YEAR_PATTERN",
        "<init>",
        "()V",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loj/k$b;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/String;IIZ)I
    .locals 3

    :goto_0
    if-ge p2, p3, :cond_7

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_5

    :cond_0
    const/16 v1, 0x7f

    if-ge v0, v1, :cond_5

    const/16 v1, 0x30

    if-gt v1, v0, :cond_1

    const/16 v1, 0x39

    if-ge v1, v0, :cond_5

    :cond_1
    const/16 v1, 0x61

    if-gt v1, v0, :cond_2

    const/16 v1, 0x7a

    if-ge v1, v0, :cond_5

    :cond_2
    const/16 v1, 0x41

    if-gt v1, v0, :cond_3

    const/16 v1, 0x5a

    if-ge v1, v0, :cond_5

    :cond_3
    const/16 v1, 0x3a

    if-ne v0, v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    move v0, v2

    :goto_2
    xor-int/lit8 v1, p4, 0x1

    if-ne v0, v1, :cond_6

    return p2

    :cond_6
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_7
    return p3
.end method

.method private final b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {p1, p2, v3, v0, v2}, Lpi/l;->s(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    sub-int/2addr v0, p2

    .line 27
    sub-int/2addr v0, v1

    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    const/16 v0, 0x2e

    .line 33
    .line 34
    if-ne p2, v0, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, Lpj/c;->f(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v1, v3

    .line 44
    :goto_0
    return v1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method private final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "."

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {p1, v2, v3, v0, v1}, Lpi/l;->s(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    xor-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {p1, v2}, Lpi/l;->p0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lpj/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string v0, "Failed requirement."

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
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

.method private final g(Ljava/lang/String;II)J
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    move/from16 v4, p2

    .line 9
    .line 10
    invoke-direct {v0, v1, v4, v2, v3}, Loj/k$b;->a(Ljava/lang/String;IIZ)I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    invoke-static {}, Loj/k;->c()Ljava/util/regex/Pattern;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    const/4 v6, -0x1

    .line 23
    move v7, v6

    .line 24
    move v8, v7

    .line 25
    move v9, v8

    .line 26
    move v10, v9

    .line 27
    move v11, v10

    .line 28
    move v12, v11

    .line 29
    :goto_0
    const/4 v13, 0x2

    .line 30
    const/4 v14, 0x1

    .line 31
    if-ge v4, v2, :cond_5

    .line 32
    .line 33
    add-int/lit8 v15, v4, 0x1

    .line 34
    .line 35
    invoke-direct {v0, v1, v15, v2, v14}, Loj/k$b;->a(Ljava/lang/String;IIZ)I

    .line 36
    .line 37
    .line 38
    move-result v15

    .line 39
    invoke-virtual {v5, v4, v15}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    .line 40
    .line 41
    .line 42
    const-string v4, "matcher.group(1)"

    .line 43
    .line 44
    if-ne v8, v6, :cond_0

    .line 45
    .line 46
    invoke-static {}, Loj/k;->c()Ljava/util/regex/Pattern;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_0

    .line 59
    .line 60
    invoke-virtual {v5, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    invoke-virtual {v5, v13}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    const-string v4, "matcher.group(2)"

    .line 76
    .line 77
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    const/4 v3, 0x3

    .line 85
    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    const-string v4, "matcher.group(3)"

    .line 90
    .line 91
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    goto/16 :goto_1

    .line 99
    .line 100
    :cond_0
    if-ne v9, v6, :cond_1

    .line 101
    .line 102
    invoke-static {}, Loj/k;->a()Ljava/util/regex/Pattern;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_1

    .line 115
    .line 116
    invoke-virtual {v5, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    goto :goto_1

    .line 128
    :cond_1
    if-ne v10, v6, :cond_3

    .line 129
    .line 130
    invoke-static {}, Loj/k;->b()Ljava/util/regex/Pattern;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_3

    .line 143
    .line 144
    invoke-virtual {v5, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 152
    .line 153
    const-string v10, "Locale.US"

    .line 154
    .line 155
    invoke-static {v4, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    if-eqz v3, :cond_2

    .line 159
    .line 160
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    const-string v4, "(this as java.lang.String).toLowerCase(locale)"

    .line 165
    .line 166
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-static {}, Loj/k;->b()Ljava/util/regex/Pattern;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-virtual {v4}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    const-string v10, "MONTH_PATTERN.pattern()"

    .line 178
    .line 179
    invoke-static {v4, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const/16 v18, 0x0

    .line 183
    .line 184
    const/16 v19, 0x0

    .line 185
    .line 186
    const/16 v20, 0x6

    .line 187
    .line 188
    const/16 v21, 0x0

    .line 189
    .line 190
    move-object/from16 v16, v4

    .line 191
    .line 192
    move-object/from16 v17, v3

    .line 193
    .line 194
    invoke-static/range {v16 .. v21}, Lpi/l;->Z(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    div-int/lit8 v10, v3, 0x4

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_2
    new-instance v1, Ljava/lang/NullPointerException;

    .line 202
    .line 203
    const-string v2, "null cannot be cast to non-null type java.lang.String"

    .line 204
    .line 205
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v1

    .line 209
    :cond_3
    if-ne v7, v6, :cond_4

    .line 210
    .line 211
    invoke-static {}, Loj/k;->d()Ljava/util/regex/Pattern;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-eqz v3, :cond_4

    .line 224
    .line 225
    invoke-virtual {v5, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    :cond_4
    :goto_1
    add-int/lit8 v15, v15, 0x1

    .line 237
    .line 238
    const/4 v3, 0x0

    .line 239
    invoke-direct {v0, v1, v15, v2, v3}, Loj/k$b;->a(Ljava/lang/String;IIZ)I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    goto/16 :goto_0

    .line 244
    .line 245
    :cond_5
    const/16 v1, 0x46

    .line 246
    .line 247
    if-le v1, v7, :cond_6

    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_6
    const/16 v1, 0x63

    .line 251
    .line 252
    if-lt v1, v7, :cond_7

    .line 253
    .line 254
    add-int/lit16 v7, v7, 0x76c

    .line 255
    .line 256
    :cond_7
    :goto_2
    if-gez v7, :cond_8

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_8
    const/16 v1, 0x45

    .line 260
    .line 261
    if-lt v1, v7, :cond_9

    .line 262
    .line 263
    add-int/lit16 v7, v7, 0x7d0

    .line 264
    .line 265
    :cond_9
    :goto_3
    const/16 v1, 0x641

    .line 266
    .line 267
    if-lt v7, v1, :cond_a

    .line 268
    .line 269
    move v1, v14

    .line 270
    goto :goto_4

    .line 271
    :cond_a
    const/4 v1, 0x0

    .line 272
    :goto_4
    const-string v2, "Failed requirement."

    .line 273
    .line 274
    if-eqz v1, :cond_19

    .line 275
    .line 276
    if-eq v10, v6, :cond_b

    .line 277
    .line 278
    move v1, v14

    .line 279
    goto :goto_5

    .line 280
    :cond_b
    const/4 v1, 0x0

    .line 281
    :goto_5
    if-eqz v1, :cond_18

    .line 282
    .line 283
    if-le v14, v9, :cond_c

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_c
    const/16 v1, 0x1f

    .line 287
    .line 288
    if-lt v1, v9, :cond_d

    .line 289
    .line 290
    move v1, v14

    .line 291
    goto :goto_7

    .line 292
    :cond_d
    :goto_6
    const/4 v1, 0x0

    .line 293
    :goto_7
    if-eqz v1, :cond_17

    .line 294
    .line 295
    if-gez v8, :cond_e

    .line 296
    .line 297
    goto :goto_8

    .line 298
    :cond_e
    const/16 v1, 0x17

    .line 299
    .line 300
    if-lt v1, v8, :cond_f

    .line 301
    .line 302
    move v1, v14

    .line 303
    goto :goto_9

    .line 304
    :cond_f
    :goto_8
    const/4 v1, 0x0

    .line 305
    :goto_9
    if-eqz v1, :cond_16

    .line 306
    .line 307
    const/16 v1, 0x3b

    .line 308
    .line 309
    if-gez v11, :cond_10

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_10
    if-lt v1, v11, :cond_11

    .line 313
    .line 314
    move v3, v14

    .line 315
    goto :goto_b

    .line 316
    :cond_11
    :goto_a
    const/4 v3, 0x0

    .line 317
    :goto_b
    if-eqz v3, :cond_15

    .line 318
    .line 319
    if-gez v12, :cond_12

    .line 320
    .line 321
    goto :goto_c

    .line 322
    :cond_12
    if-lt v1, v12, :cond_13

    .line 323
    .line 324
    move v1, v14

    .line 325
    goto :goto_d

    .line 326
    :cond_13
    :goto_c
    const/4 v1, 0x0

    .line 327
    :goto_d
    if-eqz v1, :cond_14

    .line 328
    .line 329
    new-instance v1, Ljava/util/GregorianCalendar;

    .line 330
    .line 331
    sget-object v2, Lpj/c;->f:Ljava/util/TimeZone;

    .line 332
    .line 333
    invoke-direct {v1, v2}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    .line 334
    .line 335
    .line 336
    const/4 v2, 0x0

    .line 337
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->setLenient(Z)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1, v14, v7}, Ljava/util/Calendar;->set(II)V

    .line 341
    .line 342
    .line 343
    sub-int/2addr v10, v14

    .line 344
    invoke-virtual {v1, v13, v10}, Ljava/util/Calendar;->set(II)V

    .line 345
    .line 346
    .line 347
    const/4 v2, 0x5

    .line 348
    invoke-virtual {v1, v2, v9}, Ljava/util/Calendar;->set(II)V

    .line 349
    .line 350
    .line 351
    const/16 v2, 0xb

    .line 352
    .line 353
    invoke-virtual {v1, v2, v8}, Ljava/util/Calendar;->set(II)V

    .line 354
    .line 355
    .line 356
    const/16 v2, 0xc

    .line 357
    .line 358
    invoke-virtual {v1, v2, v11}, Ljava/util/Calendar;->set(II)V

    .line 359
    .line 360
    .line 361
    const/16 v2, 0xd

    .line 362
    .line 363
    invoke-virtual {v1, v2, v12}, Ljava/util/Calendar;->set(II)V

    .line 364
    .line 365
    .line 366
    const/16 v2, 0xe

    .line 367
    .line 368
    const/4 v3, 0x0

    .line 369
    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 373
    .line 374
    .line 375
    move-result-wide v1

    .line 376
    return-wide v1

    .line 377
    :cond_14
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v1

    .line 387
    :cond_15
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 388
    .line 389
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    throw v1

    .line 397
    :cond_16
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 398
    .line 399
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    throw v1

    .line 407
    :cond_17
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 408
    .line 409
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    throw v1

    .line 417
    :cond_18
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 418
    .line 419
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw v1

    .line 427
    :cond_19
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 428
    .line 429
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    throw v1
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
    .line 485
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
.end method

.method private final h(Ljava/lang/String;)J
    .locals 6

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    cmp-long p1, v2, v4

    .line 10
    .line 11
    if-gtz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide v0, v2

    .line 15
    :goto_0
    return-wide v0

    .line 16
    :catch_0
    move-exception v2

    .line 17
    new-instance v3, Lkotlin/text/Regex;

    .line 18
    .line 19
    const-string v4, "-?\\d+"

    .line 20
    .line 21
    invoke-direct {v3, v4}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, p1}, Lkotlin/text/Regex;->g(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    const/4 v2, 0x2

    .line 31
    const/4 v3, 0x0

    .line 32
    const-string v4, "-"

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-static {p1, v4, v5, v2, v3}, Lpi/l;->H(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-wide v0, 0x7fffffffffffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    :goto_1
    return-wide v0

    .line 48
    :cond_2
    throw v2
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


# virtual methods
.method public final c(Lokhttp3/HttpUrl;Ljava/lang/String;)Loj/k;
    .locals 2

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "setCookie"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p0, v0, v1, p1, p2}, Loj/k$b;->d(JLokhttp3/HttpUrl;Ljava/lang/String;)Loj/k;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
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
.end method

.method public final d(JLokhttp3/HttpUrl;Ljava/lang/String;)Loj/k;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p4

    .line 4
    .line 5
    const-string v1, "url"

    .line 6
    .line 7
    move-object/from16 v8, p3

    .line 8
    .line 9
    invoke-static {v8, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "setCookie"

    .line 13
    .line 14
    invoke-static {v7, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/16 v2, 0x3b

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x6

    .line 22
    const/4 v6, 0x0

    .line 23
    move-object/from16 v1, p4

    .line 24
    .line 25
    invoke-static/range {v1 .. v6}, Lpj/c;->o(Ljava/lang/String;CIIILjava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    const/16 v2, 0x3d

    .line 30
    .line 31
    const/4 v5, 0x2

    .line 32
    move v4, v9

    .line 33
    invoke-static/range {v1 .. v6}, Lpj/c;->o(Ljava/lang/String;CIIILjava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x0

    .line 38
    if-ne v1, v9, :cond_0

    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_0
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x1

    .line 43
    invoke-static {v7, v3, v1, v4, v2}, Lpj/c;->W(Ljava/lang/String;IIILjava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-nez v5, :cond_1

    .line 52
    .line 53
    move v5, v4

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move v5, v3

    .line 56
    :goto_0
    if-nez v5, :cond_18

    .line 57
    .line 58
    invoke-static {v11}, Lpj/c;->v(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    const/4 v6, -0x1

    .line 63
    if-eq v5, v6, :cond_2

    .line 64
    .line 65
    goto/16 :goto_c

    .line 66
    .line 67
    :cond_2
    add-int/2addr v1, v4

    .line 68
    invoke-static {v7, v1, v9}, Lpj/c;->V(Ljava/lang/String;II)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    invoke-static {v12}, Lpj/c;->v(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eq v1, v6, :cond_3

    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_3
    add-int/2addr v9, v4

    .line 80
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const-wide/16 v5, -0x1

    .line 85
    .line 86
    move-object v10, v2

    .line 87
    move-object/from16 v22, v10

    .line 88
    .line 89
    move/from16 v17, v3

    .line 90
    .line 91
    move/from16 v18, v17

    .line 92
    .line 93
    move/from16 v19, v18

    .line 94
    .line 95
    move/from16 v20, v4

    .line 96
    .line 97
    move-wide v15, v5

    .line 98
    const-wide v23, 0xe677d21fdbffL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    :goto_1
    if-ge v9, v1, :cond_b

    .line 104
    .line 105
    const/16 v2, 0x3b

    .line 106
    .line 107
    invoke-static {v7, v2, v9, v1}, Lpj/c;->m(Ljava/lang/String;CII)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    const/16 v13, 0x3d

    .line 112
    .line 113
    invoke-static {v7, v13, v9, v2}, Lpj/c;->m(Ljava/lang/String;CII)I

    .line 114
    .line 115
    .line 116
    move-result v13

    .line 117
    invoke-static {v7, v9, v13}, Lpj/c;->V(Ljava/lang/String;II)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    if-ge v13, v2, :cond_4

    .line 122
    .line 123
    add-int/lit8 v13, v13, 0x1

    .line 124
    .line 125
    invoke-static {v7, v13, v2}, Lpj/c;->V(Ljava/lang/String;II)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    goto :goto_2

    .line 130
    :cond_4
    const-string v13, ""

    .line 131
    .line 132
    :goto_2
    const-string v14, "expires"

    .line 133
    .line 134
    invoke-static {v9, v14, v4}, Lpi/l;->t(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v14

    .line 138
    if-eqz v14, :cond_5

    .line 139
    .line 140
    :try_start_0
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    invoke-direct {v0, v13, v3, v9}, Loj/k$b;->g(Ljava/lang/String;II)J

    .line 145
    .line 146
    .line 147
    move-result-wide v23
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    goto :goto_3

    .line 149
    :cond_5
    const-string v14, "max-age"

    .line 150
    .line 151
    invoke-static {v9, v14, v4}, Lpi/l;->t(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    if-eqz v14, :cond_6

    .line 156
    .line 157
    :try_start_1
    invoke-direct {v0, v13}, Loj/k$b;->h(Ljava/lang/String;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v15
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 161
    :goto_3
    move/from16 v19, v4

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_6
    const-string v14, "domain"

    .line 165
    .line 166
    invoke-static {v9, v14, v4}, Lpi/l;->t(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    if-eqz v14, :cond_7

    .line 171
    .line 172
    :try_start_2
    invoke-direct {v0, v13}, Loj/k$b;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v10
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 176
    move/from16 v20, v3

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_7
    const-string v14, "path"

    .line 180
    .line 181
    invoke-static {v9, v14, v4}, Lpi/l;->t(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v14

    .line 185
    if-eqz v14, :cond_8

    .line 186
    .line 187
    move-object/from16 v22, v13

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_8
    const-string v13, "secure"

    .line 191
    .line 192
    invoke-static {v9, v13, v4}, Lpi/l;->t(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 193
    .line 194
    .line 195
    move-result v13

    .line 196
    if-eqz v13, :cond_9

    .line 197
    .line 198
    move/from16 v17, v4

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_9
    const-string v13, "httponly"

    .line 202
    .line 203
    invoke-static {v9, v13, v4}, Lpi/l;->t(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-eqz v9, :cond_a

    .line 208
    .line 209
    move/from16 v18, v4

    .line 210
    .line 211
    :catch_0
    :cond_a
    :goto_4
    add-int/lit8 v9, v2, 0x1

    .line 212
    .line 213
    const/4 v2, 0x0

    .line 214
    goto :goto_1

    .line 215
    :cond_b
    const-wide/high16 v1, -0x8000000000000000L

    .line 216
    .line 217
    cmp-long v4, v15, v1

    .line 218
    .line 219
    if-nez v4, :cond_d

    .line 220
    .line 221
    :cond_c
    move-wide v13, v1

    .line 222
    goto :goto_7

    .line 223
    :cond_d
    cmp-long v1, v15, v5

    .line 224
    .line 225
    if-eqz v1, :cond_10

    .line 226
    .line 227
    const-wide v1, 0x20c49ba5e353f7L

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    cmp-long v1, v15, v1

    .line 233
    .line 234
    if-gtz v1, :cond_e

    .line 235
    .line 236
    const/16 v1, 0x3e8

    .line 237
    .line 238
    int-to-long v1, v1

    .line 239
    mul-long/2addr v15, v1

    .line 240
    goto :goto_5

    .line 241
    :cond_e
    const-wide v15, 0x7fffffffffffffffL

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    :goto_5
    add-long v1, p1, v15

    .line 247
    .line 248
    cmp-long v4, v1, p1

    .line 249
    .line 250
    if-ltz v4, :cond_f

    .line 251
    .line 252
    const-wide v4, 0xe677d21fdbffL

    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    cmp-long v6, v1, v4

    .line 258
    .line 259
    if-lez v6, :cond_c

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_f
    const-wide v4, 0xe677d21fdbffL

    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    :goto_6
    move-wide v13, v4

    .line 268
    goto :goto_7

    .line 269
    :cond_10
    move-wide/from16 v13, v23

    .line 270
    .line 271
    :goto_7
    invoke-virtual/range {p3 .. p3}, Lokhttp3/HttpUrl;->h()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    if-nez v10, :cond_11

    .line 276
    .line 277
    move-object v15, v1

    .line 278
    const/4 v2, 0x0

    .line 279
    goto :goto_8

    .line 280
    :cond_11
    invoke-direct {v0, v1, v10}, Loj/k$b;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-nez v2, :cond_12

    .line 285
    .line 286
    const/4 v2, 0x0

    .line 287
    return-object v2

    .line 288
    :cond_12
    const/4 v2, 0x0

    .line 289
    move-object v15, v10

    .line 290
    :goto_8
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    if-eq v1, v4, :cond_13

    .line 299
    .line 300
    sget-object v1, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->h:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;

    .line 301
    .line 302
    invoke-virtual {v1}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;->c()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-virtual {v1, v15}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    if-nez v1, :cond_13

    .line 311
    .line 312
    return-object v2

    .line 313
    :cond_13
    const-string v1, "/"

    .line 314
    .line 315
    move-object/from16 v4, v22

    .line 316
    .line 317
    if-eqz v4, :cond_15

    .line 318
    .line 319
    const/4 v5, 0x2

    .line 320
    invoke-static {v4, v1, v3, v5, v2}, Lpi/l;->H(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    if-nez v2, :cond_14

    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_14
    move-object/from16 v16, v4

    .line 328
    .line 329
    goto :goto_b

    .line 330
    :cond_15
    :goto_9
    invoke-virtual/range {p3 .. p3}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    const/16 v6, 0x2f

    .line 335
    .line 336
    const/4 v7, 0x0

    .line 337
    const/4 v8, 0x0

    .line 338
    const/4 v9, 0x6

    .line 339
    const/4 v10, 0x0

    .line 340
    move-object v5, v2

    .line 341
    invoke-static/range {v5 .. v10}, Lpi/l;->d0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    if-eqz v4, :cond_17

    .line 346
    .line 347
    if-eqz v2, :cond_16

    .line 348
    .line 349
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    const-string v2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    .line 354
    .line 355
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    goto :goto_a

    .line 359
    :cond_16
    new-instance v1, Ljava/lang/NullPointerException;

    .line 360
    .line 361
    const-string v2, "null cannot be cast to non-null type java.lang.String"

    .line 362
    .line 363
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    throw v1

    .line 367
    :cond_17
    :goto_a
    move-object/from16 v16, v1

    .line 368
    .line 369
    :goto_b
    new-instance v1, Loj/k;

    .line 370
    .line 371
    const/16 v21, 0x0

    .line 372
    .line 373
    move-object v10, v1

    .line 374
    invoke-direct/range {v10 .. v21}, Loj/k;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 375
    .line 376
    .line 377
    return-object v1

    .line 378
    :cond_18
    :goto_c
    move-object v1, v2

    .line 379
    return-object v1
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
    .line 485
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
.end method

.method public final e(Lokhttp3/HttpUrl;Lokhttp3/Headers;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/HttpUrl;",
            "Lokhttp3/Headers;",
            ")",
            "Ljava/util/List<",
            "Loj/k;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "headers"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "Set-Cookie"

    .line 12
    .line 13
    invoke-virtual {p2, v0}, Lokhttp3/Headers;->q(Ljava/lang/String;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    :goto_0
    if-ge v2, v0, :cond_2

    .line 24
    .line 25
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, p1, v3}, Loj/k$b;->c(Lokhttp3/HttpUrl;Ljava/lang/String;)Loj/k;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    new-instance v1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    if-eqz v1, :cond_3

    .line 51
    .line 52
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string p2, "Collections.unmodifiableList(cookies)"

    .line 57
    .line 58
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_1
    return-object p1
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
.end method
