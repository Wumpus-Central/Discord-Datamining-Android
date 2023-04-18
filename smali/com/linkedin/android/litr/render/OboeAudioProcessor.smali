.class public final Lcom/linkedin/android/litr/render/OboeAudioProcessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loe/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/linkedin/android/litr/render/OboeAudioProcessor$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\n\u0008\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0012B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008 \u0010!J)\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 J!\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\tH\u0082 J\t\u0010\u000e\u001a\u00020\u0007H\u0082 J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0008\u0010\u0013\u001a\u00020\u0007H\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001e\u00a8\u0006#"
    }
    d2 = {
        "Lcom/linkedin/android/litr/render/OboeAudioProcessor;",
        "Loe/a;",
        "",
        "sourceChannelCount",
        "sourceSampleRate",
        "targetChannelCount",
        "targetSampleRate",
        "",
        "initProcessor",
        "Ljava/nio/ByteBuffer;",
        "sourceBuffer",
        "sampleCount",
        "targetBuffer",
        "processAudioFrame",
        "releaseProcessor",
        "Lhe/c;",
        "sourceFrame",
        "targetFrame",
        "a",
        "release",
        "",
        "D",
        "samplingRatio",
        "b",
        "sampleDurationUs",
        "",
        "c",
        "J",
        "presentationTimeNs",
        "d",
        "I",
        "e",
        "<init>",
        "(IIII)V",
        "f",
        "litr_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# static fields
.field public static final f:Lcom/linkedin/android/litr/render/OboeAudioProcessor$a;


# instance fields
.field private final a:D

.field private b:D

.field private c:J

.field private final d:I

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/linkedin/android/litr/render/OboeAudioProcessor$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/linkedin/android/litr/render/OboeAudioProcessor$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->f:Lcom/linkedin/android/litr/render/OboeAudioProcessor$a;

    .line 8
    .line 9
    const-string v0, "litr-jni"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->d:I

    .line 5
    .line 6
    iput p3, p0, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->e:I

    .line 7
    .line 8
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->initProcessor(IIII)V

    .line 9
    .line 10
    .line 11
    int-to-double p3, p4

    .line 12
    int-to-double p1, p2

    .line 13
    div-double p1, p3, p1

    .line 14
    .line 15
    iput-wide p1, p0, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->a:D

    .line 16
    .line 17
    const-wide p1, 0x412e848000000000L    # 1000000.0

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    div-double/2addr p1, p3

    .line 23
    iput-wide p1, p0, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->b:D

    .line 24
    .line 25
    const-wide/16 p1, 0x0

    .line 26
    .line 27
    iput-wide p1, p0, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->c:J

    .line 28
    .line 29
    return-void
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

.method private final native initProcessor(IIII)V
.end method

.method private final native processAudioFrame(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;)I
.end method

.method private final native releaseProcessor()V
.end method


# virtual methods
.method public a(Lhe/c;Lhe/c;)V
    .locals 9

    .line 1
    const-string v0, "sourceFrame"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "targetFrame"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p2, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v2, p1, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 20
    .line 21
    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 22
    .line 23
    iget v3, p0, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->d:I

    .line 24
    .line 25
    mul-int/lit8 v3, v3, 0x2

    .line 26
    .line 27
    div-int/2addr v2, v3

    .line 28
    invoke-direct {p0, v0, v2, v1}, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->processAudioFrame(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    mul-int/lit8 v1, v0, 0x2

    .line 33
    .line 34
    iget v2, p0, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->e:I

    .line 35
    .line 36
    mul-int v5, v1, v2

    .line 37
    .line 38
    iget-object v1, p2, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 41
    .line 42
    .line 43
    iget-object v1, p2, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 46
    .line 47
    .line 48
    iget-object v3, p2, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    iget-wide v6, p0, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->c:J

    .line 52
    .line 53
    iget-object p1, p1, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 54
    .line 55
    iget v8, p1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 56
    .line 57
    invoke-virtual/range {v3 .. v8}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    .line 58
    .line 59
    .line 60
    iget-wide p1, p0, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->c:J

    .line 61
    .line 62
    int-to-double v0, v0

    .line 63
    iget-wide v2, p0, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->b:D

    .line 64
    .line 65
    mul-double/2addr v0, v2

    .line 66
    double-to-long v0, v0

    .line 67
    add-long/2addr p1, v0

    .line 68
    iput-wide p1, p0, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->c:J

    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 72
    .line 73
    const-string p2, "Source or target frame doesn\'t have a buffer, cannot process it!"

    .line 74
    .line 75
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1
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

.method public release()V
    .locals 0

    invoke-direct {p0}, Lcom/linkedin/android/litr/render/OboeAudioProcessor;->releaseProcessor()V

    return-void
.end method
