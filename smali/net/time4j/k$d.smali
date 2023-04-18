.class Lnet/time4j/k$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/t<",
        "Lfj/o;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Lgj/v;

.field private final c:Lgj/m;

.field final synthetic d:Lnet/time4j/k;


# direct methods
.method constructor <init>(Lnet/time4j/k;ZLgj/v;Lgj/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/time4j/k$d;->d:Lnet/time4j/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_1

    .line 7
    .line 8
    if-eqz p4, :cond_0

    .line 9
    .line 10
    iput-boolean p2, p0, Lnet/time4j/k$d;->a:Z

    .line 11
    .line 12
    iput-object p3, p0, Lnet/time4j/k$d;->b:Lgj/v;

    .line 13
    .line 14
    iput-object p4, p0, Lnet/time4j/k$d;->c:Lgj/m;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 18
    .line 19
    const-string p2, "Missing output context."

    .line 20
    .line 21
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 26
    .line 27
    const-string p2, "Missing text width."

    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
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
.end method


# virtual methods
.method public a(Lfj/o;)Ljava/lang/String;
    .locals 7

    .line 1
    sget-object v0, Lnet/time4j/g0;->z:Lnet/time4j/u0;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lnet/time4j/g0;

    .line 8
    .line 9
    iget-object v0, p0, Lnet/time4j/k$d;->d:Lnet/time4j/k;

    .line 10
    .line 11
    invoke-static {v0}, Lnet/time4j/k;->h(Lnet/time4j/k;)Ljava/util/Locale;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-boolean v2, p0, Lnet/time4j/k$d;->a:Z

    .line 16
    .line 17
    const-string v3, "noon"

    .line 18
    .line 19
    const-string v4, "midnight"

    .line 20
    .line 21
    if-eqz v2, :cond_3

    .line 22
    .line 23
    invoke-static {p1}, Lnet/time4j/k;->e(Lnet/time4j/g0;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v0}, Lnet/time4j/k;->c(Lnet/time4j/k;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    invoke-static {v0}, Lnet/time4j/k;->i(Lnet/time4j/k;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v1, v0}, Lnet/time4j/k;->f(Ljava/util/Locale;Ljava/lang/String;)Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v5, p0, Lnet/time4j/k$d;->b:Lgj/v;

    .line 42
    .line 43
    iget-object v6, p0, Lnet/time4j/k$d;->c:Lgj/m;

    .line 44
    .line 45
    invoke-static {v0, v5, v6, v2}, Lnet/time4j/k;->g(Ljava/util/Map;Lgj/v;Lgj/m;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-nez v6, :cond_1

    .line 54
    .line 55
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    iget-object v2, p0, Lnet/time4j/k$d;->b:Lgj/v;

    .line 62
    .line 63
    iget-object v3, p0, Lnet/time4j/k$d;->c:Lgj/m;

    .line 64
    .line 65
    const-string v4, "am"

    .line 66
    .line 67
    invoke-static {v0, v2, v3, v4}, Lnet/time4j/k;->g(Ljava/util/Map;Lgj/v;Lgj/m;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    iget-object v2, p0, Lnet/time4j/k$d;->b:Lgj/v;

    .line 79
    .line 80
    iget-object v3, p0, Lnet/time4j/k$d;->c:Lgj/m;

    .line 81
    .line 82
    const-string v4, "pm"

    .line 83
    .line 84
    invoke-static {v0, v2, v3, v4}, Lnet/time4j/k;->g(Ljava/util/Map;Lgj/v;Lgj/m;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    :cond_1
    :goto_0
    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_6

    .line 93
    .line 94
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Ljava/lang/String;

    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_2
    return-object v2

    .line 102
    :cond_3
    invoke-static {v0}, Lnet/time4j/k;->c(Lnet/time4j/k;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_8

    .line 107
    .line 108
    invoke-static {v0}, Lnet/time4j/k;->i(Lnet/time4j/k;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {v1, v2}, Lnet/time4j/k;->f(Ljava/util/Locale;Ljava/lang/String;)Ljava/util/Map;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {p1}, Lnet/time4j/g0;->E0()Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-eqz v5, :cond_4

    .line 121
    .line 122
    iget-object v3, p0, Lnet/time4j/k$d;->b:Lgj/v;

    .line 123
    .line 124
    iget-object v5, p0, Lnet/time4j/k$d;->c:Lgj/m;

    .line 125
    .line 126
    invoke-static {v2, v3, v5, v4}, Lnet/time4j/k;->g(Ljava/util/Map;Lgj/v;Lgj/m;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_5

    .line 135
    .line 136
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    check-cast p1, Ljava/lang/String;

    .line 141
    .line 142
    return-object p1

    .line 143
    :cond_4
    const/16 v4, 0xc

    .line 144
    .line 145
    invoke-static {v4}, Lnet/time4j/g0;->J0(I)Lnet/time4j/g0;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-virtual {p1, v4}, Lnet/time4j/g0;->F0(Lnet/time4j/g0;)Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_5

    .line 154
    .line 155
    iget-object v4, p0, Lnet/time4j/k$d;->b:Lgj/v;

    .line 156
    .line 157
    iget-object v5, p0, Lnet/time4j/k$d;->c:Lgj/m;

    .line 158
    .line 159
    invoke-static {v2, v4, v5, v3}, Lnet/time4j/k;->g(Ljava/util/Map;Lgj/v;Lgj/m;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-eqz v4, :cond_5

    .line 168
    .line 169
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    check-cast p1, Ljava/lang/String;

    .line 174
    .line 175
    return-object p1

    .line 176
    :cond_5
    invoke-static {v0}, Lnet/time4j/k;->d(Lnet/time4j/k;)Ljava/util/SortedMap;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-virtual {v0, p1}, Lnet/time4j/k;->o(Lnet/time4j/g0;)Lnet/time4j/g0;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Ljava/lang/String;

    .line 189
    .line 190
    iget-object v3, p0, Lnet/time4j/k$d;->b:Lgj/v;

    .line 191
    .line 192
    iget-object v4, p0, Lnet/time4j/k$d;->c:Lgj/m;

    .line 193
    .line 194
    invoke-static {v2, v3, v4, v0}, Lnet/time4j/k;->g(Ljava/util/Map;Lgj/v;Lgj/m;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_6

    .line 203
    .line 204
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    check-cast p1, Ljava/lang/String;

    .line 209
    .line 210
    return-object p1

    .line 211
    :cond_6
    sget-object v0, Lnet/time4j/g0;->A:Lnet/time4j/c1;

    .line 212
    .line 213
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    check-cast p1, Lnet/time4j/z;

    .line 218
    .line 219
    if-nez v1, :cond_7

    .line 220
    .line 221
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 222
    .line 223
    :cond_7
    invoke-virtual {p1, v1}, Lnet/time4j/z;->a(Ljava/util/Locale;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    return-object p1

    .line 228
    :cond_8
    invoke-static {v0}, Lnet/time4j/k;->d(Lnet/time4j/k;)Ljava/util/SortedMap;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v0, p1}, Lnet/time4j/k;->o(Lnet/time4j/g0;)Lnet/time4j/g0;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    check-cast p1, Ljava/lang/String;

    .line 241
    .line 242
    return-object p1
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
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/o;

    invoke-virtual {p0, p1}, Lnet/time4j/k$d;->a(Lfj/o;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
