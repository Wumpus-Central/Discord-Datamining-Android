.class public Lcom/facebook/soloader/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/soloader/f;


# instance fields
.field private k:Ljava/io/InputStream;

.field private final l:Ljava/util/zip/ZipEntry;

.field private final m:Ljava/util/zip/ZipFile;

.field private final n:J

.field private o:Z

.field private p:J


# direct methods
.method public constructor <init>(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/soloader/h;->m:Ljava/util/zip/ZipFile;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/soloader/h;->l:Ljava/util/zip/ZipEntry;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/facebook/soloader/h;->o:Z

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/facebook/soloader/h;->p:J

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/util/zip/ZipEntry;->getSize()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p0, Lcom/facebook/soloader/h;->n:J

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lcom/facebook/soloader/h;->k:Ljava/io/InputStream;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p2, "\'s InputStream is null"

    .line 45
    .line 46
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
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
.method public F(Ljava/nio/ByteBuffer;J)I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/h;->k:Ljava/io/InputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-wide v1, p0, Lcom/facebook/soloader/h;->n:J

    .line 10
    .line 11
    sub-long/2addr v1, p2

    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    cmp-long v3, v1, v3

    .line 15
    .line 16
    if-gtz v3, :cond_0

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    return p1

    .line 20
    :cond_0
    long-to-int v1, v1

    .line 21
    if-le v0, v1, :cond_1

    .line 22
    .line 23
    move v0, v1

    .line 24
    :cond_1
    invoke-virtual {p0, p2, p3}, Lcom/facebook/soloader/h;->b(J)Lcom/facebook/soloader/f;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    const/4 p3, 0x0

    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    iget-object p2, p0, Lcom/facebook/soloader/h;->k:Ljava/io/InputStream;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p2, v1, p3, v0}, Ljava/io/InputStream;->read([BII)I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    add-int/2addr p2, v0

    .line 48
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    new-array p2, v0, [B

    .line 53
    .line 54
    iget-object v1, p0, Lcom/facebook/soloader/h;->k:Ljava/io/InputStream;

    .line 55
    .line 56
    invoke-virtual {v1, p2, p3, v0}, Ljava/io/InputStream;->read([BII)I

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2, p3, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    .line 62
    :goto_0
    iget-wide p1, p0, Lcom/facebook/soloader/h;->p:J

    .line 63
    .line 64
    int-to-long v1, v0

    .line 65
    add-long/2addr p1, v1

    .line 66
    iput-wide p1, p0, Lcom/facebook/soloader/h;->p:J

    .line 67
    .line 68
    return v0

    .line 69
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 70
    .line 71
    const-string p2, "InputStream is null"

    .line 72
    .line 73
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1
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

.method public b(J)Lcom/facebook/soloader/f;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/h;->k:Ljava/io/InputStream;

    .line 2
    .line 3
    const-string v1, "\'s InputStream is null"

    .line 4
    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/facebook/soloader/h;->p:J

    .line 8
    .line 9
    cmp-long v4, p1, v2

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-wide v4, p0, Lcom/facebook/soloader/h;->n:J

    .line 15
    .line 16
    cmp-long v6, p1, v4

    .line 17
    .line 18
    if-lez v6, :cond_1

    .line 19
    .line 20
    move-wide p1, v4

    .line 21
    :cond_1
    cmp-long v4, p1, v2

    .line 22
    .line 23
    if-ltz v4, :cond_2

    .line 24
    .line 25
    sub-long v1, p1, v2

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/io/InputStream;->skip(J)J

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/facebook/soloader/h;->m:Ljava/util/zip/ZipFile;

    .line 35
    .line 36
    iget-object v2, p0, Lcom/facebook/soloader/h;->l:Ljava/util/zip/ZipEntry;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/facebook/soloader/h;->k:Ljava/io/InputStream;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    .line 47
    .line 48
    .line 49
    :goto_0
    iput-wide p1, p0, Lcom/facebook/soloader/h;->p:J

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 53
    .line 54
    new-instance p2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/facebook/soloader/h;->l:Ljava/util/zip/ZipEntry;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 80
    .line 81
    new-instance p2, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/facebook/soloader/h;->l:Ljava/util/zip/ZipEntry;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1
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

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/h;->k:Ljava/io/InputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/facebook/soloader/h;->o:Z

    .line 10
    .line 11
    :cond_0
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
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method public isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/soloader/h;->o:Z

    return v0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 2

    iget-wide v0, p0, Lcom/facebook/soloader/h;->p:J

    invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/soloader/h;->F(Ljava/nio/ByteBuffer;J)I

    move-result p1

    return p1
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "ElfZipFileChannel doesn\'t support write"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
