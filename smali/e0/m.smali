.class public Le0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le0/m$b;
    }
.end annotation


# static fields
.field static final d:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Le0/n;

.field private final b:Landroid/content/Context;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "camerax.extensions.previewConfigProvider.mode"

    .line 2
    .line 3
    const-class v1, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Le0/m;->d:Lw/r0$a;

    .line 10
    .line 11
    return-void
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
.end method

.method public constructor <init>(ILe0/n;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Le0/m;->c:I

    .line 5
    .line 6
    iput-object p2, p0, Le0/m;->a:Le0/n;

    .line 7
    .line 8
    iput-object p3, p0, Le0/m;->b:Landroid/content/Context;

    .line 9
    .line 10
    return-void
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
.end method


# virtual methods
.method public a()Lw/e2;
    .locals 4

    .line 1
    new-instance v0, Landroidx/camera/core/a2$b;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/camera/core/a2$b;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Le0/m;->c:I

    .line 7
    .line 8
    iget-object v2, p0, Le0/m;->a:Le0/n;

    .line 9
    .line 10
    iget-object v3, p0, Le0/m;->b:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {p0, v0, v1, v2, v3}, Le0/m;->b(Landroidx/camera/core/a2$b;ILe0/n;Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/camera/core/a2$b;->g()Lw/e2;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
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
.end method

.method b(Landroidx/camera/core/a2$b;ILe0/n;Landroid/content/Context;)V
    .locals 4

    .line 1
    instance-of v0, p3, Le0/g;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Le0/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Le0/g;->k()Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Le0/m$a;->a:[I

    .line 13
    .line 14
    invoke-interface {v0}, Landroidx/camera/extensions/impl/PreviewExtenderImpl;->getProcessorType()Landroidx/camera/extensions/impl/PreviewExtenderImpl$ProcessorType;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroidx/camera/extensions/impl/PreviewExtenderImpl$ProcessorType;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    aget v1, v1, v2

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-eq v1, v2, :cond_1

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    if-eq v1, v3, :cond_0

    .line 29
    .line 30
    new-instance v1, Le0/m$b;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {v1, v0, p4, v3}, Le0/m$b;-><init>(Landroidx/camera/extensions/impl/PreviewExtenderImpl;Landroid/content/Context;Le0/i;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    new-instance v1, Le0/c;

    .line 38
    .line 39
    invoke-interface {v0}, Landroidx/camera/extensions/impl/PreviewExtenderImpl;->getProcessor()Landroidx/camera/extensions/impl/ProcessorImpl;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Landroidx/camera/extensions/impl/PreviewImageProcessorImpl;

    .line 44
    .line 45
    invoke-direct {v1, v3}, Le0/c;-><init>(Landroidx/camera/extensions/impl/PreviewImageProcessorImpl;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v1}, Landroidx/camera/core/a2$b;->h(Lw/o0;)Landroidx/camera/core/a2$b;

    .line 49
    .line 50
    .line 51
    new-instance v3, Le0/m$b;

    .line 52
    .line 53
    invoke-direct {v3, v0, p4, v1}, Le0/m$b;-><init>(Landroidx/camera/extensions/impl/PreviewExtenderImpl;Landroid/content/Context;Le0/i;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    new-instance v1, Le0/d;

    .line 58
    .line 59
    invoke-direct {v1, v0}, Le0/d;-><init>(Landroidx/camera/extensions/impl/PreviewExtenderImpl;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1}, Landroidx/camera/core/a2$b;->i(Lw/g1;)Landroidx/camera/core/a2$b;

    .line 63
    .line 64
    .line 65
    new-instance v3, Le0/m$b;

    .line 66
    .line 67
    invoke-direct {v3, v0, p4, v1}, Le0/m$b;-><init>(Landroidx/camera/extensions/impl/PreviewExtenderImpl;Landroid/content/Context;Le0/i;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    move-object v1, v3

    .line 71
    :goto_1
    new-instance p4, Lp/b$b;

    .line 72
    .line 73
    invoke-direct {p4, p1}, Lp/b$b;-><init>(Landroidx/camera/core/f0;)V

    .line 74
    .line 75
    .line 76
    new-instance v0, Lp/d;

    .line 77
    .line 78
    new-array v2, v2, [Lp/c;

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    aput-object v1, v2, v3

    .line 82
    .line 83
    invoke-direct {v0, v2}, Lp/d;-><init>([Lp/c;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p4, v0}, Lp/b$b;->a(Lp/d;)Lp/b$b;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v1}, Landroidx/camera/core/a2$b;->q(Landroidx/camera/core/w2$b;)Landroidx/camera/core/a2$b;

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-virtual {p1}, Landroidx/camera/core/a2$b;->b()Lw/w1;

    .line 93
    .line 94
    .line 95
    move-result-object p4

    .line 96
    sget-object v0, Le0/m;->d:Lw/r0$a;

    .line 97
    .line 98
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-interface {p4, v0, p2}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {p3}, Le0/n;->c()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-virtual {p1, p2}, Landroidx/camera/core/a2$b;->j(Ljava/util/List;)Landroidx/camera/core/a2$b;

    .line 110
    .line 111
    .line 112
    return-void
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
.end method
