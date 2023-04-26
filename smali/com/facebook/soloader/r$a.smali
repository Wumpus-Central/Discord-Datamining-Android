.class Lcom/facebook/soloader/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/soloader/r;->j(Lcom/facebook/soloader/k;[BLjava/io/File;Ljava/io/File;Lcom/facebook/soloader/r$c;Ljava/lang/Boolean;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ljava/io/File;

.field final synthetic l:[B

.field final synthetic m:Lcom/facebook/soloader/r$c;

.field final synthetic n:Ljava/io/File;

.field final synthetic o:Lcom/facebook/soloader/k;

.field final synthetic p:Ljava/lang/Boolean;

.field final synthetic q:Lcom/facebook/soloader/r;


# direct methods
.method constructor <init>(Lcom/facebook/soloader/r;Ljava/io/File;[BLcom/facebook/soloader/r$c;Ljava/io/File;Lcom/facebook/soloader/k;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/soloader/r$a;->q:Lcom/facebook/soloader/r;

    iput-object p2, p0, Lcom/facebook/soloader/r$a;->k:Ljava/io/File;

    iput-object p3, p0, Lcom/facebook/soloader/r$a;->l:[B

    iput-object p4, p0, Lcom/facebook/soloader/r$a;->m:Lcom/facebook/soloader/r$c;

    iput-object p5, p0, Lcom/facebook/soloader/r$a;->n:Ljava/io/File;

    iput-object p6, p0, Lcom/facebook/soloader/r$a;->o:Lcom/facebook/soloader/k;

    iput-object p7, p0, Lcom/facebook/soloader/r$a;->p:Ljava/lang/Boolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    const-string v0, " (from syncer thread)"

    .line 2
    .line 3
    const-string v1, "releasing dso store lock for "

    .line 4
    .line 5
    const-string v2, "rw"

    .line 6
    .line 7
    const-string v3, "fb-UnpackingSoSource"

    .line 8
    .line 9
    :try_start_0
    const-string v4, "starting syncer worker"

    .line 10
    .line 11
    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    new-instance v4, Ljava/io/RandomAccessFile;

    .line 15
    .line 16
    iget-object v5, p0, Lcom/facebook/soloader/r$a;->k:Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v4, v5, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 19
    .line 20
    .line 21
    :try_start_1
    iget-object v5, p0, Lcom/facebook/soloader/r$a;->l:[B

    .line 22
    .line 23
    invoke-virtual {v4, v5}, Ljava/io/RandomAccessFile;->write([B)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    invoke-virtual {v4, v5, v6}, Ljava/io/RandomAccessFile;->setLength(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 31
    .line 32
    .line 33
    :try_start_2
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    .line 34
    .line 35
    .line 36
    new-instance v4, Ljava/io/File;

    .line 37
    .line 38
    iget-object v5, p0, Lcom/facebook/soloader/r$a;->q:Lcom/facebook/soloader/r;

    .line 39
    .line 40
    iget-object v5, v5, Lcom/facebook/soloader/d;->a:Ljava/io/File;

    .line 41
    .line 42
    const-string v6, "dso_manifest"

    .line 43
    .line 44
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance v5, Ljava/io/RandomAccessFile;

    .line 48
    .line 49
    invoke-direct {v5, v4, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 50
    .line 51
    .line 52
    :try_start_3
    iget-object v2, p0, Lcom/facebook/soloader/r$a;->m:Lcom/facebook/soloader/r$c;

    .line 53
    .line 54
    invoke-virtual {v2, v5}, Lcom/facebook/soloader/r$c;->b(Ljava/io/DataOutput;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 55
    .line 56
    .line 57
    :try_start_4
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, Lcom/facebook/soloader/r$a;->q:Lcom/facebook/soloader/r;

    .line 61
    .line 62
    iget-object v2, v2, Lcom/facebook/soloader/d;->a:Ljava/io/File;

    .line 63
    .line 64
    invoke-static {v2}, Lcom/facebook/soloader/SysUtil;->f(Ljava/io/File;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, p0, Lcom/facebook/soloader/r$a;->n:Ljava/io/File;

    .line 68
    .line 69
    const/4 v4, 0x1

    .line 70
    invoke-static {v2, v4}, Lcom/facebook/soloader/r;->i(Ljava/io/File;B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 71
    .line 72
    .line 73
    :try_start_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lcom/facebook/soloader/r$a;->q:Lcom/facebook/soloader/r;

    .line 82
    .line 83
    iget-object v1, v1, Lcom/facebook/soloader/d;->a:Ljava/io/File;

    .line 84
    .line 85
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/facebook/soloader/r$a;->o:Lcom/facebook/soloader/k;

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/facebook/soloader/k;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v2

    .line 105
    :try_start_6
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :catchall_1
    move-exception v4

    .line 110
    :try_start_7
    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    :goto_0
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 114
    :catchall_2
    move-exception v2

    .line 115
    :try_start_8
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catchall_3
    move-exception v4

    .line 120
    :try_start_9
    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    :goto_1
    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 124
    :catchall_4
    move-exception v2

    .line 125
    :try_start_a
    new-instance v4, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    iget-object v1, p0, Lcom/facebook/soloader/r$a;->q:Lcom/facebook/soloader/r;

    .line 134
    .line 135
    iget-object v1, v1, Lcom/facebook/soloader/d;->a:Ljava/io/File;

    .line 136
    .line 137
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lcom/facebook/soloader/r$a;->o:Lcom/facebook/soloader/k;

    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/facebook/soloader/k;->close()V

    .line 153
    .line 154
    .line 155
    throw v2
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    .line 156
    :catch_0
    move-exception v0

    .line 157
    iget-object v1, p0, Lcom/facebook/soloader/r$a;->p:Ljava/lang/Boolean;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_0

    .line 164
    .line 165
    :goto_2
    return-void

    .line 166
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 167
    .line 168
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    throw v1
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
