.class public Lcom/facebook/hermes/intl/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh5/b<",
        "Ljava/util/Locale;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/Locale;

.field private b:Lcom/facebook/hermes/intl/k;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/facebook/hermes/intl/k;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/facebook/hermes/intl/h;->a:Ljava/util/Locale;

    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/facebook/hermes/intl/h;->c:Z

    .line 14
    iput-object p1, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 15
    invoke-direct {p0}, Lcom/facebook/hermes/intl/h;->o()V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/facebook/hermes/intl/h;->a:Ljava/util/Locale;

    .line 7
    iput-object v0, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/facebook/hermes/intl/h;->c:Z

    .line 9
    invoke-static {p1}, Lcom/facebook/hermes/intl/f;->f(Ljava/lang/String;)Lcom/facebook/hermes/intl/k;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 10
    invoke-direct {p0}, Lcom/facebook/hermes/intl/h;->o()V

    return-void
.end method

.method private constructor <init>(Ljava/util/Locale;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/facebook/hermes/intl/h;->c:Z

    .line 4
    iput-object p1, p0, Lcom/facebook/hermes/intl/h;->a:Ljava/util/Locale;

    return-void
.end method

.method public static i()Lh5/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh5/b<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/hermes/intl/h;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/hermes/intl/h;-><init>(Ljava/util/Locale;)V

    return-object v0
.end method

.method public static j(Ljava/lang/String;)Lh5/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lh5/b<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/hermes/intl/h;

    invoke-direct {v0, p0}, Lcom/facebook/hermes/intl/h;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/hermes/intl/h;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/hermes/intl/h;->o()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/facebook/hermes/intl/h;->c:Z

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception v0

    .line 13
    new-instance v1, Lh5/j;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v1, v0}, Lh5/j;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v1

    .line 23
    :cond_0
    :goto_0
    return-void
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
.end method

.method private l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/hermes/intl/h;->a:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/facebook/hermes/intl/f;->f(Ljava/lang/String;)Lcom/facebook/hermes/intl/k;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 16
    .line 17
    :cond_0
    return-void
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
.end method

.method private o()V
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuffer;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/lang/StringBuffer;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v3, Ljava/lang/StringBuffer;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v4, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 22
    .line 23
    iget-object v4, v4, Lcom/facebook/hermes/intl/k;->a:Lcom/facebook/hermes/intl/k$a;

    .line 24
    .line 25
    iget-object v4, v4, Lcom/facebook/hermes/intl/k$a;->a:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    iget-object v4, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 36
    .line 37
    iget-object v4, v4, Lcom/facebook/hermes/intl/k;->a:Lcom/facebook/hermes/intl/k$a;

    .line 38
    .line 39
    iget-object v4, v4, Lcom/facebook/hermes/intl/k$a;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object v4, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 45
    .line 46
    iget-object v4, v4, Lcom/facebook/hermes/intl/k;->a:Lcom/facebook/hermes/intl/k$a;

    .line 47
    .line 48
    iget-object v4, v4, Lcom/facebook/hermes/intl/k$a;->b:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    iget-object v4, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 59
    .line 60
    iget-object v4, v4, Lcom/facebook/hermes/intl/k;->a:Lcom/facebook/hermes/intl/k$a;

    .line 61
    .line 62
    iget-object v4, v4, Lcom/facebook/hermes/intl/k$a;->b:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object v4, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 68
    .line 69
    iget-object v4, v4, Lcom/facebook/hermes/intl/k;->a:Lcom/facebook/hermes/intl/k$a;

    .line 70
    .line 71
    iget-object v4, v4, Lcom/facebook/hermes/intl/k$a;->c:Ljava/lang/String;

    .line 72
    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-nez v4, :cond_2

    .line 80
    .line 81
    iget-object v4, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 82
    .line 83
    iget-object v4, v4, Lcom/facebook/hermes/intl/k;->a:Lcom/facebook/hermes/intl/k$a;

    .line 84
    .line 85
    iget-object v4, v4, Lcom/facebook/hermes/intl/k$a;->c:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-static {v1, v2, v3}, Lcom/facebook/hermes/intl/f;->m(Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-lez v4, :cond_3

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 104
    .line 105
    .line 106
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    const-string v4, "-"

    .line 111
    .line 112
    if-lez v1, :cond_4

    .line 113
    .line 114
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 122
    .line 123
    .line 124
    :cond_4
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->length()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-lez v1, :cond_5

    .line 129
    .line 130
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 131
    .line 132
    .line 133
    invoke-static {v3}, Lcom/facebook/hermes/intl/f;->n(Ljava/lang/StringBuffer;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 138
    .line 139
    .line 140
    :cond_5
    iget-object v1, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 141
    .line 142
    iget-object v1, v1, Lcom/facebook/hermes/intl/k;->a:Lcom/facebook/hermes/intl/k$a;

    .line 143
    .line 144
    iget-object v1, v1, Lcom/facebook/hermes/intl/k$a;->d:Ljava/util/ArrayList;

    .line 145
    .line 146
    if-eqz v1, :cond_6

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_6

    .line 153
    .line 154
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 155
    .line 156
    .line 157
    iget-object v1, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 158
    .line 159
    iget-object v1, v1, Lcom/facebook/hermes/intl/k;->a:Lcom/facebook/hermes/intl/k$a;

    .line 160
    .line 161
    iget-object v1, v1, Lcom/facebook/hermes/intl/k$a;->d:Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-static {v4, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 168
    .line 169
    .line 170
    :cond_6
    iget-object v1, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 171
    .line 172
    iget-object v1, v1, Lcom/facebook/hermes/intl/k;->f:Ljava/util/TreeMap;

    .line 173
    .line 174
    if-eqz v1, :cond_7

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_7

    .line 189
    .line 190
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    check-cast v2, Ljava/util/Map$Entry;

    .line 195
    .line 196
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 197
    .line 198
    .line 199
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 207
    .line 208
    .line 209
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    check-cast v2, Ljava/lang/Iterable;

    .line 214
    .line 215
    invoke-static {v4, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 220
    .line 221
    .line 222
    goto :goto_0

    .line 223
    :cond_7
    iget-object v1, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 224
    .line 225
    iget-object v2, v1, Lcom/facebook/hermes/intl/k;->d:Lcom/facebook/hermes/intl/k$a;

    .line 226
    .line 227
    const/16 v3, 0x2d

    .line 228
    .line 229
    const/4 v5, 0x0

    .line 230
    if-nez v2, :cond_8

    .line 231
    .line 232
    iget-object v1, v1, Lcom/facebook/hermes/intl/k;->e:Ljava/util/TreeMap;

    .line 233
    .line 234
    if-eqz v1, :cond_f

    .line 235
    .line 236
    :cond_8
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 237
    .line 238
    .line 239
    const/16 v1, 0x74

    .line 240
    .line 241
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 245
    .line 246
    .line 247
    new-instance v1, Ljava/lang/StringBuffer;

    .line 248
    .line 249
    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 250
    .line 251
    .line 252
    iget-object v2, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 253
    .line 254
    iget-object v2, v2, Lcom/facebook/hermes/intl/k;->d:Lcom/facebook/hermes/intl/k$a;

    .line 255
    .line 256
    if-eqz v2, :cond_b

    .line 257
    .line 258
    iget-object v2, v2, Lcom/facebook/hermes/intl/k$a;->a:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 261
    .line 262
    .line 263
    iget-object v2, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 264
    .line 265
    iget-object v2, v2, Lcom/facebook/hermes/intl/k;->d:Lcom/facebook/hermes/intl/k$a;

    .line 266
    .line 267
    iget-object v2, v2, Lcom/facebook/hermes/intl/k$a;->b:Ljava/lang/String;

    .line 268
    .line 269
    if-eqz v2, :cond_9

    .line 270
    .line 271
    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 272
    .line 273
    .line 274
    iget-object v2, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 275
    .line 276
    iget-object v2, v2, Lcom/facebook/hermes/intl/k;->d:Lcom/facebook/hermes/intl/k$a;

    .line 277
    .line 278
    iget-object v2, v2, Lcom/facebook/hermes/intl/k$a;->b:Ljava/lang/String;

    .line 279
    .line 280
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 281
    .line 282
    .line 283
    :cond_9
    iget-object v2, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 284
    .line 285
    iget-object v2, v2, Lcom/facebook/hermes/intl/k;->d:Lcom/facebook/hermes/intl/k$a;

    .line 286
    .line 287
    iget-object v2, v2, Lcom/facebook/hermes/intl/k$a;->c:Ljava/lang/String;

    .line 288
    .line 289
    if-eqz v2, :cond_a

    .line 290
    .line 291
    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 292
    .line 293
    .line 294
    iget-object v2, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 295
    .line 296
    iget-object v2, v2, Lcom/facebook/hermes/intl/k;->d:Lcom/facebook/hermes/intl/k$a;

    .line 297
    .line 298
    iget-object v2, v2, Lcom/facebook/hermes/intl/k$a;->c:Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 301
    .line 302
    .line 303
    :cond_a
    iget-object v2, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 304
    .line 305
    iget-object v2, v2, Lcom/facebook/hermes/intl/k;->d:Lcom/facebook/hermes/intl/k$a;

    .line 306
    .line 307
    iget-object v2, v2, Lcom/facebook/hermes/intl/k$a;->d:Ljava/util/ArrayList;

    .line 308
    .line 309
    if-eqz v2, :cond_b

    .line 310
    .line 311
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    if-nez v2, :cond_b

    .line 316
    .line 317
    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 318
    .line 319
    .line 320
    iget-object v2, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 321
    .line 322
    iget-object v2, v2, Lcom/facebook/hermes/intl/k;->d:Lcom/facebook/hermes/intl/k$a;

    .line 323
    .line 324
    iget-object v2, v2, Lcom/facebook/hermes/intl/k$a;->d:Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-static {v4, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 331
    .line 332
    .line 333
    :cond_b
    iget-object v2, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 334
    .line 335
    iget-object v2, v2, Lcom/facebook/hermes/intl/k;->e:Ljava/util/TreeMap;

    .line 336
    .line 337
    if-eqz v2, :cond_e

    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 348
    .line 349
    .line 350
    move-result v6

    .line 351
    if-eqz v6, :cond_d

    .line 352
    .line 353
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    check-cast v6, Ljava/util/Map$Entry;

    .line 358
    .line 359
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v7

    .line 363
    check-cast v7, Ljava/lang/String;

    .line 364
    .line 365
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v6

    .line 369
    check-cast v6, Ljava/util/ArrayList;

    .line 370
    .line 371
    new-instance v8, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 394
    .line 395
    .line 396
    move-result v7

    .line 397
    if-eqz v7, :cond_c

    .line 398
    .line 399
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v7

    .line 403
    check-cast v7, Ljava/lang/String;

    .line 404
    .line 405
    new-instance v8, Ljava/lang/StringBuilder;

    .line 406
    .line 407
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 421
    .line 422
    .line 423
    goto :goto_1

    .line 424
    :cond_d
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    if-lez v2, :cond_e

    .line 429
    .line 430
    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->charAt(I)C

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    if-ne v2, v3, :cond_e

    .line 435
    .line 436
    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;

    .line 437
    .line 438
    .line 439
    :cond_e
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 444
    .line 445
    .line 446
    :cond_f
    iget-object v1, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 447
    .line 448
    iget-object v2, v1, Lcom/facebook/hermes/intl/k;->b:Ljava/util/ArrayList;

    .line 449
    .line 450
    if-nez v2, :cond_10

    .line 451
    .line 452
    iget-object v1, v1, Lcom/facebook/hermes/intl/k;->c:Ljava/util/TreeMap;

    .line 453
    .line 454
    if-eqz v1, :cond_15

    .line 455
    .line 456
    :cond_10
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 457
    .line 458
    .line 459
    const/16 v1, 0x75

    .line 460
    .line 461
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 465
    .line 466
    .line 467
    new-instance v1, Ljava/lang/StringBuffer;

    .line 468
    .line 469
    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 470
    .line 471
    .line 472
    iget-object v2, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 473
    .line 474
    iget-object v2, v2, Lcom/facebook/hermes/intl/k;->b:Ljava/util/ArrayList;

    .line 475
    .line 476
    if-eqz v2, :cond_11

    .line 477
    .line 478
    invoke-static {v4, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 483
    .line 484
    .line 485
    :cond_11
    iget-object v2, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 486
    .line 487
    iget-object v2, v2, Lcom/facebook/hermes/intl/k;->c:Ljava/util/TreeMap;

    .line 488
    .line 489
    if-eqz v2, :cond_13

    .line 490
    .line 491
    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    :cond_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 500
    .line 501
    .line 502
    move-result v6

    .line 503
    if-eqz v6, :cond_13

    .line 504
    .line 505
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    check-cast v6, Ljava/util/Map$Entry;

    .line 510
    .line 511
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v7

    .line 515
    check-cast v7, Ljava/lang/String;

    .line 516
    .line 517
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v6

    .line 521
    check-cast v6, Ljava/util/ArrayList;

    .line 522
    .line 523
    new-instance v8, Ljava/lang/StringBuilder;

    .line 524
    .line 525
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v7

    .line 538
    invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 542
    .line 543
    .line 544
    move-result-object v6

    .line 545
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 546
    .line 547
    .line 548
    move-result v7

    .line 549
    if-eqz v7, :cond_12

    .line 550
    .line 551
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v7

    .line 555
    check-cast v7, Ljava/lang/String;

    .line 556
    .line 557
    new-instance v8, Ljava/lang/StringBuilder;

    .line 558
    .line 559
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v7

    .line 572
    invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 573
    .line 574
    .line 575
    goto :goto_2

    .line 576
    :cond_13
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I

    .line 577
    .line 578
    .line 579
    move-result v2

    .line 580
    if-lez v2, :cond_14

    .line 581
    .line 582
    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->charAt(I)C

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    if-ne v2, v3, :cond_14

    .line 587
    .line 588
    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;

    .line 589
    .line 590
    .line 591
    :cond_14
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 596
    .line 597
    .line 598
    :cond_15
    iget-object v1, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 599
    .line 600
    iget-object v1, v1, Lcom/facebook/hermes/intl/k;->g:Ljava/util/ArrayList;

    .line 601
    .line 602
    if-eqz v1, :cond_16

    .line 603
    .line 604
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 605
    .line 606
    .line 607
    const/16 v1, 0x78

    .line 608
    .line 609
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 613
    .line 614
    .line 615
    iget-object v1, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 616
    .line 617
    iget-object v1, v1, Lcom/facebook/hermes/intl/k;->g:Ljava/util/ArrayList;

    .line 618
    .line 619
    invoke-static {v4, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 624
    .line 625
    .line 626
    :cond_16
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    iput-object v0, p0, Lcom/facebook/hermes/intl/h;->a:Ljava/util/Locale;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 635
    .line 636
    iput-boolean v5, p0, Lcom/facebook/hermes/intl/h;->c:Z

    .line 637
    .line 638
    return-void

    .line 639
    :catch_0
    move-exception v0

    .line 640
    new-instance v1, Lh5/j;

    .line 641
    .line 642
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    invoke-direct {v1, v0}, Lh5/j;-><init>(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    throw v1
.end method


# virtual methods
.method public a()Ljava/util/HashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 7
    .line 8
    iget-object v1, v1, Lcom/facebook/hermes/intl/k;->c:Ljava/util/TreeMap;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/String;

    .line 31
    .line 32
    iget-object v3, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 33
    .line 34
    iget-object v3, v3, Lcom/facebook/hermes/intl/k;->c:Ljava/util/TreeMap;

    .line 35
    .line 36
    invoke-virtual {v3, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ljava/util/ArrayList;

    .line 41
    .line 42
    const-string v4, "-"

    .line 43
    .line 44
    invoke-static {v4, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
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

.method public b(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/facebook/hermes/intl/h;->k()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/facebook/hermes/intl/h;->l()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/facebook/hermes/intl/k;->c:Ljava/util/TreeMap;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    return-object p1
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
.end method

.method public bridge synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/hermes/intl/h;->n()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public d()Lh5/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh5/b<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/facebook/hermes/intl/h;->k()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/facebook/hermes/intl/h;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/hermes/intl/h;->a:Ljava/util/Locale;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/facebook/hermes/intl/h;-><init>(Ljava/util/Locale;)V

    .line 9
    .line 10
    .line 11
    return-object v0
    .line 12
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

.method public e()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/hermes/intl/h;->n()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/facebook/hermes/intl/h;->k()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/facebook/hermes/intl/h;->l()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 8
    .line 9
    iget-object v1, v0, Lcom/facebook/hermes/intl/k;->c:Ljava/util/TreeMap;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljava/util/TreeMap;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, Lcom/facebook/hermes/intl/k;->c:Ljava/util/TreeMap;

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/facebook/hermes/intl/k;->c:Ljava/util/TreeMap;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/facebook/hermes/intl/k;->c:Ljava/util/TreeMap;

    .line 33
    .line 34
    new-instance v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/facebook/hermes/intl/k;->c:Ljava/util/TreeMap;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 56
    .line 57
    iget-object v0, v0, Lcom/facebook/hermes/intl/k;->c:Ljava/util/TreeMap;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    iput-boolean p1, p0, Lcom/facebook/hermes/intl/h;->c:Z

    .line 70
    .line 71
    return-void
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

.method public g()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/hermes/intl/h;->m()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/hermes/intl/h;->m()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public m()Ljava/util/Locale;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/hermes/intl/h;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/hermes/intl/h;->a:Ljava/util/Locale;

    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
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

.method public n()Ljava/util/Locale;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/hermes/intl/h;->k()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/facebook/hermes/intl/h;->l()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lcom/facebook/hermes/intl/k;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/facebook/hermes/intl/k;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/facebook/hermes/intl/h;->b:Lcom/facebook/hermes/intl/k;

    .line 13
    .line 14
    iget-object v1, v1, Lcom/facebook/hermes/intl/k;->a:Lcom/facebook/hermes/intl/k$a;

    .line 15
    .line 16
    iput-object v1, v0, Lcom/facebook/hermes/intl/k;->a:Lcom/facebook/hermes/intl/k$a;

    .line 17
    .line 18
    new-instance v1, Lcom/facebook/hermes/intl/h;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lcom/facebook/hermes/intl/h;-><init>(Lcom/facebook/hermes/intl/k;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/facebook/hermes/intl/h;->m()Ljava/util/Locale;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
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
