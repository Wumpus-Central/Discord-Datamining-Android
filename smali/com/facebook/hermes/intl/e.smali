.class Lcom/facebook/hermes/intl/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/hermes/intl/e$a;,
        Lcom/facebook/hermes/intl/e$b;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/CharSequence;

.field b:I

.field c:I


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/facebook/hermes/intl/e;->b:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lcom/facebook/hermes/intl/e;->c:I

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/hermes/intl/e;->a:Ljava/lang/CharSequence;

    .line 11
    .line 12
    return-void
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
    .line 45
    .line 46
.end method

.method private static b(C)Z
    .locals 1

    const/16 v0, 0x2d

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a()Z
    .locals 3

    iget-object v0, p0, Lcom/facebook/hermes/intl/e;->a:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget v0, p0, Lcom/facebook/hermes/intl/e;->c:I

    iget-object v1, p0, Lcom/facebook/hermes/intl/e;->a:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public c()Lcom/facebook/hermes/intl/e$a;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/facebook/hermes/intl/e;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    iget v0, p0, Lcom/facebook/hermes/intl/e;->c:I

    .line 8
    .line 9
    iget v1, p0, Lcom/facebook/hermes/intl/e;->b:I

    .line 10
    .line 11
    if-lt v0, v1, :cond_2

    .line 12
    .line 13
    iget-object v1, p0, Lcom/facebook/hermes/intl/e;->a:Ljava/lang/CharSequence;

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Lcom/facebook/hermes/intl/e;->b(C)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget v0, p0, Lcom/facebook/hermes/intl/e;->c:I

    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x2

    .line 30
    .line 31
    iget-object v1, p0, Lcom/facebook/hermes/intl/e;->a:Ljava/lang/CharSequence;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eq v0, v1, :cond_0

    .line 38
    .line 39
    iget v0, p0, Lcom/facebook/hermes/intl/e;->c:I

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x2

    .line 42
    .line 43
    iput v0, p0, Lcom/facebook/hermes/intl/e;->b:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance v0, Lcom/facebook/hermes/intl/e$b;

    .line 47
    .line 48
    invoke-direct {v0, p0}, Lcom/facebook/hermes/intl/e$b;-><init>(Lcom/facebook/hermes/intl/e;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_1
    new-instance v0, Lcom/facebook/hermes/intl/e$b;

    .line 53
    .line 54
    invoke-direct {v0, p0}, Lcom/facebook/hermes/intl/e$b;-><init>(Lcom/facebook/hermes/intl/e;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_2
    :goto_0
    iget v0, p0, Lcom/facebook/hermes/intl/e;->b:I

    .line 59
    .line 60
    iput v0, p0, Lcom/facebook/hermes/intl/e;->c:I

    .line 61
    .line 62
    :goto_1
    iget v0, p0, Lcom/facebook/hermes/intl/e;->c:I

    .line 63
    .line 64
    iget-object v1, p0, Lcom/facebook/hermes/intl/e;->a:Ljava/lang/CharSequence;

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-ge v0, v1, :cond_3

    .line 71
    .line 72
    iget-object v0, p0, Lcom/facebook/hermes/intl/e;->a:Ljava/lang/CharSequence;

    .line 73
    .line 74
    iget v1, p0, Lcom/facebook/hermes/intl/e;->c:I

    .line 75
    .line 76
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-static {v0}, Lcom/facebook/hermes/intl/e;->b(C)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_3

    .line 85
    .line 86
    iget v0, p0, Lcom/facebook/hermes/intl/e;->c:I

    .line 87
    .line 88
    add-int/lit8 v0, v0, 0x1

    .line 89
    .line 90
    iput v0, p0, Lcom/facebook/hermes/intl/e;->c:I

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    iget v0, p0, Lcom/facebook/hermes/intl/e;->c:I

    .line 94
    .line 95
    iget v1, p0, Lcom/facebook/hermes/intl/e;->b:I

    .line 96
    .line 97
    if-le v0, v1, :cond_4

    .line 98
    .line 99
    add-int/lit8 v0, v0, -0x1

    .line 100
    .line 101
    iput v0, p0, Lcom/facebook/hermes/intl/e;->c:I

    .line 102
    .line 103
    new-instance v2, Lcom/facebook/hermes/intl/e$a;

    .line 104
    .line 105
    iget-object v3, p0, Lcom/facebook/hermes/intl/e;->a:Ljava/lang/CharSequence;

    .line 106
    .line 107
    invoke-direct {v2, p0, v3, v1, v0}, Lcom/facebook/hermes/intl/e$a;-><init>(Lcom/facebook/hermes/intl/e;Ljava/lang/CharSequence;II)V

    .line 108
    .line 109
    .line 110
    return-object v2

    .line 111
    :cond_4
    new-instance v0, Lcom/facebook/hermes/intl/e$b;

    .line 112
    .line 113
    invoke-direct {v0, p0}, Lcom/facebook/hermes/intl/e$b;-><init>(Lcom/facebook/hermes/intl/e;)V

    .line 114
    .line 115
    .line 116
    throw v0

    .line 117
    :cond_5
    new-instance v0, Lcom/facebook/hermes/intl/e$b;

    .line 118
    .line 119
    invoke-direct {v0, p0}, Lcom/facebook/hermes/intl/e$b;-><init>(Lcom/facebook/hermes/intl/e;)V

    .line 120
    .line 121
    .line 122
    throw v0
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
