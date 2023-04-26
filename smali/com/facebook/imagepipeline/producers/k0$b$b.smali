.class Lcom/facebook/imagepipeline/producers/k0$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/k0$b;->I()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/facebook/imagepipeline/producers/k0$b;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/k0$b;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/k0$b$b;->k:Lcom/facebook/imagepipeline/producers/k0$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$b$b;->k:Lcom/facebook/imagepipeline/producers/k0$b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/k0$b$b;->k:Lcom/facebook/imagepipeline/producers/k0$b;

    .line 5
    .line 6
    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/k0$b;->q(Lcom/facebook/imagepipeline/producers/k0$b;)Lcom/facebook/common/references/CloseableReference;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/k0$b$b;->k:Lcom/facebook/imagepipeline/producers/k0$b;

    .line 11
    .line 12
    invoke-static {v2}, Lcom/facebook/imagepipeline/producers/k0$b;->s(Lcom/facebook/imagepipeline/producers/k0$b;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/k0$b$b;->k:Lcom/facebook/imagepipeline/producers/k0$b;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static {v3, v4}, Lcom/facebook/imagepipeline/producers/k0$b;->r(Lcom/facebook/imagepipeline/producers/k0$b;Lcom/facebook/common/references/CloseableReference;)Lcom/facebook/common/references/CloseableReference;

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/k0$b$b;->k:Lcom/facebook/imagepipeline/producers/k0$b;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-static {v3, v4}, Lcom/facebook/imagepipeline/producers/k0$b;->t(Lcom/facebook/imagepipeline/producers/k0$b;Z)Z

    .line 26
    .line 27
    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    invoke-static {v1}, Lcom/facebook/common/references/CloseableReference;->R(Lcom/facebook/common/references/CloseableReference;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    :try_start_1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$b$b;->k:Lcom/facebook/imagepipeline/producers/k0$b;

    .line 36
    .line 37
    invoke-static {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/k0$b;->u(Lcom/facebook/imagepipeline/producers/k0$b;Lcom/facebook/common/references/CloseableReference;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Lcom/facebook/common/references/CloseableReference;->t(Lcom/facebook/common/references/CloseableReference;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    invoke-static {v1}, Lcom/facebook/common/references/CloseableReference;->t(Lcom/facebook/common/references/CloseableReference;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$b$b;->k:Lcom/facebook/imagepipeline/producers/k0$b;

    .line 50
    .line 51
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/k0$b;->v(Lcom/facebook/imagepipeline/producers/k0$b;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catchall_1
    move-exception v1

    .line 56
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 57
    throw v1
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
